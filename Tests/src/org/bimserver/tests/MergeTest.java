package org.bimserver.tests;

import java.io.File;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.Merger;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.IfcModelSet;
import org.bimserver.ifc.SchemaLoader;
import org.bimserver.ifc.file.reader.IfcStepDeserializer;
import org.bimserver.ifc.file.reader.IncorrectIfcFileException;
import org.bimserver.ifc.file.writer.IfcStepSerializer;

public class MergeTest {
	public static void main(String[] args) {
		new MergeTest().start();
	}

	private void start() {
		SchemaDefinition schema = SchemaLoader.loadDefaultSchema();
		IfcStepDeserializer deserializer = new IfcStepDeserializer(schema);
		try {
			IfcModel model1 = deserializer.read(TestFile.HAUS_SOURCE_FILE.getFile());
			IfcModel model2 = deserializer.read(TestFile.HAUS_ALT_SOURCE_FILE.getFile());
			model2.fixOids(new IncrementingOidProvider(model1.getHighestOid() + 1));
			IfcModelSet modelSet = new IfcModelSet(model1, model2);
			IfcModel merge = new Merger().merge(null, modelSet, true);
			IfcStepSerializer serializer = new IfcStepSerializer(null, null, "test", merge, schema);
			serializer.writeToFile(new File("merged.ifc"));
		} catch (IncorrectIfcFileException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}