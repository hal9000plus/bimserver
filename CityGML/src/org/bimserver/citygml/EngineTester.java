package org.bimserver.citygml;

import java.io.File;

import org.bimserver.tests.TestFile;

public class EngineTester {
	public static void main(String[] args) {
		new EngineTester().start();
	}

	private void start() {
		System.out.println("hela hola");
		try {
			System.out.println(TestFile.MERGE_TEST_SOURCE_FILE.getFile().getAbsolutePath());
			File schema = new File("lib/IFC2X3_Final.exp");
			System.out.println(schema.getAbsolutePath());
			int modelId = IfcEngine.getInstance().sdaiOpenModelBN(0, TestFile.AC11.getFile().getAbsolutePath(), schema.getAbsolutePath());
			System.out.println(modelId);
			IfcEngine.getInstance().sdaiSaveModelBN(0, "test.ifc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}