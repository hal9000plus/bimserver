package org.bimserver.collada;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.ifc.FileFieldIgnoreMap;

public class KmzSerializer extends EmfSerializer {

	private final IfcToCollada ifcToCollada;

	public KmzSerializer(EmfModel<Long> model, SchemaDefinition schemaDefinition, File schemaFile, FileFieldIgnoreMap ignoreMap) {
		super(model);
		ifcToCollada = new IfcToCollada(model, schemaDefinition, schemaFile, ignoreMap);
	}

	@Override
	public void write(OutputStream out) {
		try {
			ZipOutputStream zipOutputStream = new ZipOutputStream(out);
			zipOutputStream.putNextEntry(new ZipEntry("doc.kml"));
			try {
				writeKmlFile(zipOutputStream);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			zipOutputStream.closeEntry();
			zipOutputStream.putNextEntry(new ZipEntry("files/collada.dae"));
			ifcToCollada.write(zipOutputStream);
			zipOutputStream.closeEntry();
			zipOutputStream.finish();
			zipOutputStream.flush();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	private void writeKmlFile(OutputStream out) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(out);
		writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		writer.println("<kml xmlns=\"http://earth.google.com/kml/2.1\">");
		writer.println("<Placemark>");
		writer.println("	<name>" + model.getProjectName() + "</name>");
		writer.println("	<description>" + model.getDescription() + "</description>");
		writer.println("	<LookAt>");
		writer.println("		<longitude>" + model.getLon() + "</longitude>");
		writer.println("		<latitude>" + model.getLat() + "</latitude>");
		writer.println("		<altitude>0</altitude>");
		writer.println("		<range>127.2393107680517</range>");
		writer.println("		<tilt>65.74454495876547</tilt>");
		writer.println("		<heading>-27.70337734057933</heading>");
		writer.println("	</LookAt>");
		writer.println("	<Model id=\"model_4\">");
		writer.println("		<altitudeMode>relativeToGround</altitudeMode>");
		writer.println("		<Location>");
		writer.println("			<longitude>" + model.getLon() + "</longitude>");
		writer.println("			<latitude>" + model.getLat() + "</latitude>");
		writer.println("			<altitude>" + model.getAltitude() + "</altitude>");
		writer.println("		</Location>");
		writer.println("		<Orientation>");
		writer.println("			<heading>0</heading>");
		writer.println("			<tilt>0</tilt>");
		writer.println("			<roll>0</roll>");
		writer.println("		</Orientation>");
		writer.println("		<Scale>");
		writer.println("			<x>100</x>");
		writer.println("			<y>100</y>");
		writer.println("			<z>100</z>");
		writer.println("		</Scale>");
		writer.println("		<Link>");
		writer.println("			<href>files/collada.dae</href>");
		writer.println("		</Link>");
		writer.println("	</Model>");
		writer.println("</Placemark>");
		writer.println("</kml>");
		writer.flush();
	}
}