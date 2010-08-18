package org.bimserver.tests;

import java.io.File;
import java.io.FileNotFoundException;

import nl.tue.buildingsmart.emf.DerivedReader;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.file.reader.FastIfcFileReader;
import org.bimserver.ifc.file.reader.IncorrectIfcFileException;
import org.bimserver.ifc.file.writer.IfcStepSerializer;

public class SimpleTest {
	public static void main(String[] args) {
		new SimpleTest().start();
	}

	private void start() {
		File schemaFile = new File("../buildingSMARTLibrary/data/IFC2X3_FINAL.exp");
		ExpressSchemaParser schemaParser = new ExpressSchemaParser(schemaFile);
		schemaParser.parse();
		SchemaDefinition schema = schemaParser.getSchema();
		try {
			new DerivedReader(schemaFile, schema);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		FastIfcFileReader fastIfcFileReader = new FastIfcFileReader(schema);
		try {
			fastIfcFileReader.read(TestFile.HAUS_SOURCE_FILE.getFile());
			EmfModel<Long> model = fastIfcFileReader.getModel();
			IfcStepSerializer serializer = new IfcStepSerializer(model, schema);
			serializer.write(new File("test.ifc"));
		} catch (IncorrectIfcFileException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}