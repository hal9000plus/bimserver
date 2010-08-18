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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.HashSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import nl.tue.buildingsmart.emf.DerivedReader;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.database.BimDatabase;
import org.bimserver.database.Database;
import org.bimserver.database.berkeley.BerkeleyColumnDatabase;
import org.bimserver.ifc.FileFieldIgnoreMap;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifcengine.FailSafeIfcEngine;
import org.bimserver.services.TokenManager;
import org.bimserver.shared.LocalDevelopmentResourceFetcher;
import org.bimserver.shared.ResourceFetcher;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.utils.CollectionUtils;
import org.bimserver.utils.TempUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerInitializer implements ServletContextListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(ServerInitializer.class);
	private static GregorianCalendar serverStartTime;
	private BimDatabase bimDatabase;
	private BimScheduler bimScheduler;
	private static ResourceFetcher resourceFetcher;
	private static ServletContext servletContext;
	private FailSafeIfcEngine failSafeIfcEngine;

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		try {
			LOGGER.info("Starting ServerInitializer");
			ServerType serverType = detectServerType(servletContextEvent.getServletContext());
			LOGGER.info("Detected server type: " + serverType + " (" + System.getProperty("os.name") + ", " + System.getProperty("sun.arch.data.model") + "bit)");
			if (serverType == ServerType.UNKNOWN) {
				LOGGER.error("Server type not detected, stopping initialization");
				return;
			}
			servletContext = servletContextEvent.getServletContext();
			resourceFetcher = createResourceFetcher(serverType, servletContext);
			URL resource = resourceFetcher.getResource("settings.xml");
			Settings settings = Settings.readFromUrl(resource);
			ServerSettings.setSettings(settings);
			serverStartTime = new GregorianCalendar();
			SchemaDefinition schema = loadIfcSchema(resourceFetcher);
			HashSet<Ifc2x3Package> packages = CollectionUtils.singleSet(Ifc2x3Package.eINSTANCE);

			bimScheduler = new BimScheduler();
			bimScheduler.start();

			FileFieldIgnoreMap fieldIgnoreMap = new FileFieldIgnoreMap(packages, resourceFetcher);
			TokenManager tokenManager = new TokenManager();
			TemplateEngine.getTemplateEngine().init(resourceFetcher.getResource("templates/"));
			File databaseDir = new File(ServerSettings.getSettings().getDatabaseLocation());
			BerkeleyColumnDatabase columnDatabase = new BerkeleyColumnDatabase(databaseDir);
			bimDatabase = new Database(packages, columnDatabase, fieldIgnoreMap);
			Version version = VersionChecker.init(resourceFetcher).getLocalVersion();

			IfcDocIndexer.init(resourceFetcher.getResource("/R2x3_TC1"));
			File schemaFile = ResourceHelper.getFile(servletContext, resourceFetcher, "IFC2X3_FINAL.exp");
			LOGGER.info("Using " + schemaFile + " as engine schema");

			File nativeFolder = ResourceHelper.getFile(servletContext, resourceFetcher, "lib/");
			failSafeIfcEngine = new FailSafeIfcEngine(schemaFile, nativeFolder, resourceFetcher, settings.isUseSecondEngineJvm());

			TempUtils.makeTempDir("bimserver");
			EmfSerializerFactory emfSerializerFactory = EmfSerializerFactory.getInstance();
			emfSerializerFactory.init(version, schema, fieldIgnoreMap, failSafeIfcEngine);
			emfSerializerFactory.initSerializers();
			ServiceInterface service = new Service(bimDatabase, emfSerializerFactory, schema, tokenManager);
			servletContext.setAttribute("service", service);
			LoginManager.setService(service);
		} catch (Exception e) {
			ServerInfo.setErrorMessage(e.getMessage());
			LOGGER.error("", e);
		}
	}
	
	public static ResourceFetcher getResourceFetcher() {
		return resourceFetcher;
	}

	private ServerType detectServerType(ServletContext servletContext) {
		String typeString = null;
		try {
			URL resource = servletContext.getResource("/servertype.txt");
			if (resource != null) {
				typeString = readUrl(resource);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		if (typeString == null) {
			File file = new File("servertype.txt");
			typeString = readFile(file);
		}
		if (typeString == null) {
			return ServerType.UNKNOWN;
		}
		return ServerType.valueOf(typeString);
	}

	private String readUrl(URL resource) {
		try {
			InputStream inputStream = resource.openStream();
			byte[] buffer = new byte[100];
			int red = inputStream.read(buffer);
			String string = new String(buffer, 0, red, "UTF-8");
			inputStream.close();
			return string;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String readFile(File file) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			byte[] buffer = new byte[100];
			int red = fis.read(buffer);
			String string = new String(buffer, 0, red, "UTF-8");
			fis.close();
			return string;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private ResourceFetcher createResourceFetcher(ServerType serverType, final ServletContext servletContext) {
		ResourceFetcher resourceFetcher = null;
		switch (serverType) {
		case DEV_ENVIRONMENT:
			resourceFetcher = new LocalDevelopmentResourceFetcher();
			break;
		case DEPLOYED_WAR:
			resourceFetcher = new ResourceFetcher() {
				@Override
				public URL getResource(String name) {
					try {
						return servletContext.getResource("/WEB-INF/" + name);
					} catch (MalformedURLException e) {
						LOGGER.error("", e);
					}
					return null;
				}
			};
			break;
		case STANDALONE_JAR:
			resourceFetcher = new ResourceFetcher() {
				@Override
				public URL getResource(String name) {
					try {
						if (name.startsWith("lib")) {
							File file = new File(name);
							if (file.exists()) {
								return file.toURI().toURL();
							}
						} else {
							File file = new File("config" + File.separator + name);
							if (file.exists()) {
								return file.getAbsoluteFile().toURI().toURL();
							}
						}
					} catch (MalformedURLException e) {
						e.printStackTrace();
					}
					return null;
				}
			};
		}
		return resourceFetcher;
	}

	private SchemaDefinition loadIfcSchema(ResourceFetcher resourceFetcher) throws Exception {
		try {
			URL ifcSchemaFile = resourceFetcher.getResource("IFC2X3_FINAL.exp");
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
		if (failSafeIfcEngine != null) {
			failSafeIfcEngine.close();
		}
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

	public static ServletContext getServletContext() {
		return servletContext;
	}
}