package org.bimserver.tests;

import java.io.File;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.file.reader.FastIfcFileReader;
import org.bimserver.ifc.file.reader.IfcFileReader;
import org.bimserver.ifc.file.reader.IncorrectIfcFileException;
import org.bimserver.ifc.xml.writer.IfcXmlSerializer;

public class IfcXmlWriteTester {
	public static void main(String[] args) {
		new IfcXmlWriteTester().start();
	}

	private void start() {
		ExpressSchemaParser schemaParser = new ExpressSchemaParser(IfcFileReader.DEFAULT_SCHEMA_FILE);
		schemaParser.parse();
		SchemaDefinition schema = schemaParser.getSchema();
		
		FastIfcFileReader reader = new FastIfcFileReader(schema);
		try {
			reader.read(TestFile.HAUS_SOURCE_FILE.getFile());
		} catch (IncorrectIfcFileException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		EmfModel<Long> model = reader.getModel();
		IfcXmlSerializer ifcXmlWriter = new IfcXmlSerializer(model, schema);
		ifcXmlWriter.write(new File("test.xml"));
	}
}