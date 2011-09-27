package org.bimserver.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.SchemaLoader;
import org.bimserver.ifc.SerializerException;
import org.bimserver.ifc.file.reader.IfcStepDeserializer;
import org.bimserver.ifc.file.reader.IncorrectIfcFileException;
import org.bimserver.ifc.file.writer.IfcStepSerializer;
import org.bimserver.ifc.xml.reader.IfcXmlDeserializeException;
import org.bimserver.ifc.xml.reader.IfcXmlDeserializer;

public class IfcXmlReadTest {
	public static void main(String[] args) {
		new IfcXmlReadTest().start();
	}

	private void start() {
		IfcXmlDeserializer ifcXmlReader = new IfcXmlDeserializer();
		try {
			IfcModel model = ifcXmlReader.read(new FileInputStream(TestFile.AC11_XML.getFile()));
			
			SchemaDefinition schema = SchemaLoader.loadDefaultSchema();
			
			File outFile = new File("out.ifc");
			IfcStepSerializer ifcStepSerializer = new IfcStepSerializer(null, null, "", model, schema);
			try {
				ifcStepSerializer.writeToFile(outFile);
			} catch (SerializerException e) {
				e.printStackTrace();
			}
			
			IfcStepDeserializer deserializer = new IfcStepDeserializer(schema);
			deserializer.read(outFile);
		} catch (IfcXmlDeserializeException e2) {
			e2.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IncorrectIfcFileException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}