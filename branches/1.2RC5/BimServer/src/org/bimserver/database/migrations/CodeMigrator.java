package org.bimserver.database.migrations;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.bimserver.emf.MetaDataManager;
import org.bimserver.models.store.StorePackage;
import org.bimserver.shared.interfaces.NotificationInterface;
import org.bimserver.shared.interfaces.RemoteServiceInterface;
import org.bimserver.shared.interfaces.ServiceInterface;
import org.bimserver.shared.meta.SService;
import org.bimserver.tools.generators.AdaptorGeneratorWrapper;
import org.bimserver.tools.generators.DataObjectGeneratorWrapper;
import org.bimserver.tools.generators.ProtocolBuffersGenerator;
import org.bimserver.tools.generators.SConverterGeneratorWrapper;
import org.bimserver.tools.generators.SPackageGeneratorWrapper;
import org.bimserver.tools.generators.SServiceGeneratorWrapper;
import org.eclipse.emf.ecore.EPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ruben de Laat
 * 
 *         Steps: 
 *         1. Add a new migration (for example create the class Step0005 in org.bimserver.database.migrations.steps) 
 *         2. Change the TARGET_VERSION to the same number 
 *         3. Run this class it's main method, this will generate an ecore file (models/models.ecore) reflecting all available migration steps combined. 
 *         4. Open the models/models.genmodel file, right-click on the root node and select "Generate Model Code" 
 *         5. Verify there are no compile errors, and fix those first by changing your migration code
 */

public class CodeMigrator {
	private static final Logger LOGGER = LoggerFactory.getLogger(CodeMigrator.class);
	private ProtocolBuffersGenerator protocolBuffersGenerator;
	private List<SService> knownServices = new ArrayList<SService>();
	private List<String> knownShortNames = new ArrayList<String>();

	public static void main(String[] args) {
		new CodeMigrator().start();
	}

	private void start() {
		LOGGER.info("Starting code migrator...");
		Migrator migrator = new Migrator(null);
		int latestVersion = migrator.getLatestVersion();
		LOGGER.info("Migrating to version " + latestVersion);
		Schema schema = migrator.migrateSchemaTo(latestVersion);
		schema.writeToEcore(new File("models/models.ecore"));
		LOGGER.info("Model migrated to version " + latestVersion);

		LOGGER.info("Generating ServiceInterface objects...");
		DataObjectGeneratorWrapper serviceGenerator = new DataObjectGeneratorWrapper();
		Set<EPackage> ePackages = new HashSet<EPackage>();
		for (EPackage ePackage : schema.getEPackages()) {
			if (!ePackage.getName().equals("ifc2x3tc1")) {
				ePackages.add(ePackage);
			}
		}
		serviceGenerator.generateDataObjects(ePackages);
		LOGGER.info("ServiceInterface objects successfully generated");

		MetaDataManager metaDataManager = new MetaDataManager(ePackages);

		SConverterGeneratorWrapper sConverterGenerator = new SConverterGeneratorWrapper(metaDataManager);
		sConverterGenerator.generate(ePackages);

		SServiceGeneratorWrapper serviceGeneratorWrapper = new SServiceGeneratorWrapper();
		serviceGeneratorWrapper.generate(ServiceInterface.class, StorePackage.eINSTANCE);

		LOGGER.info("Generating protocol buffers file and classes...");
		protocolBuffersGenerator = new ProtocolBuffersGenerator();

		generateFiles(ServiceInterface.class, "service");
		generateFiles(NotificationInterface.class, "notification");
		generateFiles(RemoteServiceInterface.class, "remoteservice");

		SPackageGeneratorWrapper sPackageGeneratorWrapper = new SPackageGeneratorWrapper();
		sPackageGeneratorWrapper.generate(ePackages);

		LOGGER.info("Protocol buffers file and classes generated");
		LOGGER.info("");
		LOGGER.info("Migration successfull");
	}

	private void generateFiles(Class<?> interfaceClass, String shortName) {
		try {
			File javaFile = new File("../Shared/src/org/bimserver/shared/interfaces/" + interfaceClass.getSimpleName() + ".java");
			SService service = new SService(FileUtils.readFileToString(javaFile), interfaceClass, knownServices);
			AdaptorGeneratorWrapper adaptorGeneratorWrapper = new AdaptorGeneratorWrapper();
			adaptorGeneratorWrapper.generate(interfaceClass, service);
			File protoFile = new File("../Builds/build/pb/" + shortName + ".proto");
			File descFile = new File("../Builds/build/pb/" + shortName + ".desc");
			protocolBuffersGenerator.generate(interfaceClass, protoFile, descFile, this.knownServices.isEmpty(), service, knownShortNames);
			FileUtils.copyFile(javaFile, new File("../Builds/build/targets/shared/" + interfaceClass.getSimpleName() + ".java"));
			FileUtils.copyFile(protoFile, new File("../Builds/build/targets/shared/" + shortName + ".proto"));
			FileUtils.copyFile(descFile, new File("../Builds/build/targets/shared/" + shortName + ".desc"));
			FileUtils.copyFile(descFile, new File("../BimServerClientLib/src/" + shortName + ".desc"));
			this.knownServices .add(service);
			this.knownShortNames.add(shortName);
		} catch (IOException e) {
			LOGGER.error("", e);
		}
	}
}