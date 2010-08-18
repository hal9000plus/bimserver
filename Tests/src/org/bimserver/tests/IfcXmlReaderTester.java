package org.bimserver.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.emf.BasicEmfModel;
import org.bimserver.ifc.file.reader.IfcFileReader;
import org.bimserver.ifc.file.writer.IfcStepSerializer;
import org.bimserver.ifc.xml.reader.IfcXmlReader;
import org.eclipse.emf.ecore.EObject;

public class IfcXmlReaderTester {
	public static void main(String[] args) {
		new IfcXmlReaderTester().start();
	}

	private void start() {
		IfcXmlReader reader = new IfcXmlReader();
		Map<Long, EObject> read = reader.read(TestFile.AC11_XML.getFile());
		
		ExpressSchemaParser schemaParser = new ExpressSchemaParser(IfcFileReader.DEFAULT_SCHEMA_FILE);
		schemaParser.parse();
		SchemaDefinition schema = schemaParser.getSchema();
		
		IfcStepSerializer writer = new IfcStepSerializer(new BasicEmfModel<Long>(read), schema);
		try {
			writer.write(new File("test.ifc"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
