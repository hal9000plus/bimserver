//package org.bimserver.ifcengine;
//
//import java.io.File;
//import java.util.Arrays;
//import java.util.List;
//
//import org.bimserver.ifcengine.IfcEngineJNA.InstanceVisualisationProperties;
//import org.bimserver.shared.LocalDevelopmentResourceFetcher;
//import org.bimserver.shared.ResourceFetcher;
//
//public class Test {
//	public static void main(String[] args) {
//		// IfcEngineJNA ifcEngineJNA = new IfcEngineJNA();
//		//		
//		// for (int i=0; i<100; i++) {
//		// Pointer model = ifcEngineJNA.sdaiOpenModelBN(1,
//		// "C:\\Users\\Ruben\\Workspaces\\BIMserver\\TestData\\data\\AC11-Institute-Var-2-IFC.ifc",
//		// "C:\\Users\\Ruben\\Workspaces\\BIMserver\\BimServer\\deploy\\shared\\IFC2X3_FINAL.exp");
//		// ifcEngineJNA.setPostProcessing(model, 1);
//		// org.bimserver.ifcengine.IfcEngineJNA.SurfaceProperties
//		// initializeModelling = ifcEngineJNA.initializeModelling(model, 0.0);
//		// float[] coordinates = new
//		// float[initializeModelling.getVerticesCount() * 3];
//		// float[] normals = new float[initializeModelling.getVerticesCount() *
//		// 3];
//		// int[] indices = new int[initializeModelling.getIndicesCount() * 2];
//		// ifcEngineJNA.finalizeModelling(model, coordinates, normals, indices);
//		// Pointer sdaiGetEntityExtentBN =
//		// ifcEngineJNA.sdaiGetEntityExtentBN(model, "IFCSPACE");
//		// int nrObjects =
//		// ifcEngineJNA.sdaiGetMemberCount(sdaiGetEntityExtentBN);
//		// for (int k = 0; k < nrObjects; k++) {
//		// Object instanceId = (Pointer)
//		// ifcEngineJNA.engiGetAggrElement(sdaiGetEntityExtentBN, k,
//		// SdaiTypes.INSTANCE);
//		// if (instanceId instanceof Pointer) {
//		// }
//		// }
//		// ifcEngineJNA.sdaiCloseModel(model);
//		// System.out.println(i);
//		// }
//		// int initializeClashes = ifcEngineJNA.initializeClashes(model, 0.0);
//		// if (initializeClashes > 0) {
//		// Set<Clash> clashes = ifcEngineJNA.finalizeClashesByGuid(model,
//		// initializeClashes);
//		// for (Clash clash : clashes) {
//		// System.out.println(clash.getGuid1() + " " + clash.getGuid2());
//		// }
//		// } else {
//		// System.out.println("No clashes");
//		// }
//
//		ResourceFetcher resourceFetcher = new LocalDevelopmentResourceFetcher();
//
//		FailSafeIfcEngine failSafeIfcEngine = new FailSafeIfcEngine(resourceFetcher.getFile("IFC2X3_FINAL.exp").getAbsoluteFile(), resourceFetcher.getFile("lib/"),
//				resourceFetcher, true);
//		for (int x = 0; x < 100; x++) {
//			System.out.println(x);
//			try {
//				IfcEngineModel openModel = failSafeIfcEngine.openModel(new File("C:\\Users\\Ruben\\Workspaces\\BIMserver\\TestData\\data\\AC11-Institute-Var-2-IFC.ifc"));
//				openModel.setPostProcessing(true);
//				SurfaceProperties initializeModelling2 = openModel.initializeModelling();
//				Geometry geometry = openModel.finalizeModelling(initializeModelling2);
//				if (geometry != null) {
//					List<Instance> instances = openModel.getInstances("IFCWINDOW");
//					for (Instance instance : instances) {
//						InstanceVisualisationProperties visualisationProperties = instance.getVisualisationProperties();
//						for (int i = visualisationProperties.getStartIndex(); i < visualisationProperties.getPrimitiveCount() * 3 + visualisationProperties.getStartIndex(); i += 3) {
//							int i1 = geometry.getIndex(i);
//							int i2 = geometry.getIndex(i + 1);
//							int i3 = geometry.getIndex(i + 2);
//							Arrays.asList(new Double[] { (double) geometry.getVertex(i1 * 3), (double) geometry.getVertex(i1 * 3 + 1), (double) geometry.getVertex(i1 * 3 + 2),
//									(double) geometry.getVertex(i3 * 3), (double) geometry.getVertex(i3 * 3 + 1), (double) geometry.getVertex(i3 * 3 + 2),
//									(double) geometry.getVertex(i2 * 3), (double) geometry.getVertex(i2 * 3 + 1), (double) geometry.getVertex(i2 * 3 + 2),
//									(double) geometry.getVertex(i1 * 3), (double) geometry.getVertex(i1 * 3 + 1), (double) geometry.getVertex(i1 * 3 + 2) });
//						}
//					}
//				}
//				openModel.close();
//			} catch (IfcEngineException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}