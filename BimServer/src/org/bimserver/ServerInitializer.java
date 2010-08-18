package org.bimserver;

/******************************************************************************
 * (c) Copyright bimserver.org 2009
 * Licensed under GNU GPLv3
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * For more information mail to license@bimserver.org
 *
 * Bimserver.org is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bimserver.org is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License a 
 * long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.HashSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import nl.tue.buildingsmart.emf.DerivedReader;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.EmfSerializerFactory.EmfSerializerCreator;
import org.bimserver.citygml.IfcToCityGML;
import org.bimserver.collada.IfcToCollada;
import org.bimserver.collada.KmzSerializer;
import org.bimserver.database.BimDatabase;
import org.bimserver.database.Database;
import org.bimserver.database.berkeley.BerkeleyColumnDatabase;
import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.ifc.FileFieldIgnoreMap;
import org.bimserver.ifc.ResourceFetcher;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.file.writer.IfcSerializer;
import org.bimserver.ifc.xml.writer.IfcXmlSerializer;
import org.bimserver.services.TokenManager;
import org.bimserver.shared.ResultType;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.utils.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerInitializer implements ServletContextListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(ServerInitializer.class);
	private static GregorianCalendar serverStartTime;
	private BimDatabase bimDatabase;
	private BimScheduler bimScheduler;

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		try {
			LOGGER.info("Starting ServerInitializer");
			final ServletContext servletContext = servletContextEvent.getServletContext();
			Settings settings = Settings.readFromUrl(servletContext.getResource("/WEB-INF/settings.xml"));
			ServerSettings.setSettings(settings);
			serverStartTime = new GregorianCalendar();
			final SchemaDefinition schema = loadIfcSchema(servletContext);
			HashSet<Ifc2x3Package> packages = CollectionUtils.singleSet(Ifc2x3Package.eINSTANCE);
			ResourceFetcher resourceFetcher = new ResourceFetcher() {
				@Override
				public URL getResource(String name) {
					try {
						return servletContext.getResource("/WEB-INF/" + name);
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
					return null;
				}
			};
			
			bimScheduler = new BimScheduler();
			bimScheduler.start();
			
			String enabledExportTypesString = settings.getEnabledExportTypes();
			String[] enabledExportTypes = enabledExportTypesString.split(",");
			EnumSet<ResultType> enabled = EnumSet.of(ResultType.IFC);
			for (String type : enabledExportTypes) {
				enabled.add(ResultType.valueOf(type.trim().toUpperCase()));
			}
			
			final FileFieldIgnoreMap fieldIgnoreMap = new FileFieldIgnoreMap(packages, resourceFetcher);
			TokenManager tokenManager = new TokenManager();
			TemplateEngine.getTemplateEngine().init(servletContext.getResource("/WEB-INF/templates/"));
			File databaseDir = new File(ServerSettings.getSettings().getDatabaseLocation());
			BerkeleyColumnDatabase columnDatabase = new BerkeleyColumnDatabase(databaseDir);
			bimDatabase = new Database(packages, columnDatabase, fieldIgnoreMap);
			EmfSerializerFactory emfSerializerFactory = EmfSerializerFactory.getInstance();
			final Version version = VersionChecker.getInstance(servletContext).getLocalVersion();
			
			final File tempSchemaFile = createTempSchema(servletContext);
			
			if (enabled.contains(ResultType.IFC)) {
				emfSerializerFactory.register(ResultType.IFC, new EmfSerializerCreator() {
					@Override
					public EmfSerializer create(EmfModel<Long> model) {
						IfcSerializer ifcSerializer = new IfcSerializer(model, schema);
						ifcSerializer.setFileDescription("Bimserver.org " + version.getLatest() + " generated IFC file");
						ifcSerializer.setPreProcessorVersion("Bimserver.org " + version.getLatest());
						return ifcSerializer;
					}
				});
			}
			if (enabled.contains(ResultType.IFCXML)) {
				emfSerializerFactory.register(ResultType.IFCXML, new EmfSerializerCreator() {
					@Override
					public EmfSerializer create(EmfModel<Long> model) {
						return new IfcXmlSerializer(model);
					}
				});
			}
			if (enabled.contains(ResultType.CITYGML)) {
				emfSerializerFactory.register(ResultType.CITYGML, new EmfSerializerCreator() {
					@Override
					public EmfSerializer create(EmfModel<Long> model) {
						return new IfcToCityGML(model, schema, tempSchemaFile, fieldIgnoreMap);
					}
				});
			}
			if (enabled.contains(ResultType.COLLADA)) {
				emfSerializerFactory.register(ResultType.COLLADA, new EmfSerializerCreator() {
					@Override
					public EmfSerializer create(EmfModel<Long> model) {
						return new IfcToCollada(model, schema, tempSchemaFile, fieldIgnoreMap);
					}
				});
			}
			if (enabled.contains(ResultType.KMZ)) {
				emfSerializerFactory.register(ResultType.KMZ, new EmfSerializerCreator() {
					@Override
					public EmfSerializer create(EmfModel<Long> model) {
						return new KmzSerializer(model, schema, tempSchemaFile, fieldIgnoreMap);
					}
				});
			}
			if (enabled.contains(ResultType.O3D_JSON)) {
				emfSerializerFactory.register(ResultType.O3D_JSON, new EmfSerializerCreator() {
					@Override
					public EmfSerializer create(EmfModel<Long> model) {
						return new O3dJsonSerializer(model, fieldIgnoreMap, tempSchemaFile, schema);
					}
				});
			}
			ServiceInterface service = new Service(bimDatabase, emfSerializerFactory, schema, tokenManager);
			servletContext.setAttribute("service", service);
			LoginManager.setService(service);
		} catch (Exception e) {
			ServerInfo.setErrorMessage(e.getMessage());
			LOGGER.error("", e);
		}
	}

	private File createTempSchema(final ServletContext servletContext) throws MalformedURLException, IOException, FileNotFoundException {
		File tempSchema = new File(System.getProperty("java.io.tmpdir") + File.separator + "IFC2X3_FINAL.exp");
		if (tempSchema.exists()) {
			return tempSchema;
		}
		URL resource = servletContext.getResource("/WEB-INF/IFC2X3_FINAL.exp");
		InputStream in = resource.openStream();
		try {
			byte[] buffer = new byte[1024];
			int red = in.read(buffer);
			FileOutputStream fos = new FileOutputStream(tempSchema);
			try {
				while (red != -1) {
					fos.write(buffer, 0, red);
					red = in.read(buffer);
				}
			} finally {
				fos.close();
			}
		} finally {
			in.close();
		}
		return tempSchema;
	}

	private SchemaDefinition loadIfcSchema(ServletContext servletContext) throws Exception {
		URL ifcSchemaFile = null;
		try {
			ifcSchemaFile = servletContext.getResource("/WEB-INF/IFC2X3_FINAL.exp");
			if (ifcSchemaFile == null) {
				LOGGER.error("IFC-Schema file not found");
			} else {
				LOGGER.info("IFC-Schema file found");
				ExpressSchemaParser schemaParser = new ExpressSchemaParser(ifcSchemaFile);
				schemaParser.parse();
				SchemaDefinition schema = schemaParser.getSchema();
				new DerivedReader(ifcSchemaFile.openStream(), schema);
				if (schema != null) {
					LOGGER.info("IFC-Schema succesfully loaded");
				} else {
					LOGGER.error("Error loading IFC-Schema");
				}
				return schema;
			}
		} catch (MalformedURLException e) {
			LOGGER.error("", e);
		}
		return null;
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		LOGGER.info("Context is being destroyed");
		if (bimDatabase != null) {
			bimDatabase.close();
		}
		if (bimScheduler != null) {
			bimScheduler.close();
		}
	}

	public static GregorianCalendar getServerStartTime() {
		return serverStartTime;
	}
}