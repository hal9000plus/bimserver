package org.bimserver.collada;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.tue.buildingsmart.emf.DerivedReader;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.citygml.IfcEngine;
import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.ifc.FileFieldIgnoreMap;
import org.bimserver.ifc.IfcRootObject;
import org.bimserver.ifc.ResourceFetcher;
import org.bimserver.ifc.database.IfcDatabase;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Factory;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcColumn;
import org.bimserver.ifc.emf.Ifc2x3.IfcDoor;
import org.bimserver.ifc.emf.Ifc2x3.IfcRailing;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoof;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlab;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlabTypeEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcWall;
import org.bimserver.ifc.emf.Ifc2x3.IfcWallStandardCase;
import org.bimserver.ifc.emf.Ifc2x3.IfcWindow;
import org.bimserver.ifc.emf.Ifc2x3.WrappedValue;
import org.bimserver.ifc.file.reader.FastIfcFileReader;
import org.bimserver.ifc.file.writer.IfcSerializer;
import org.bimserver.tests.TestFile;
import org.bimserver.utils.CollectionUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfcToCollada extends EmfSerializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(IfcToCollada.class);
	private IfcEngine ifcEngine;
	private int convertCounter;
	private final File subfiles = new File("subfiles");
	private final SchemaDefinition schemaDefinition;
	private final File schemaFile;
	private final FileFieldIgnoreMap ignoreMap;
	private final Map<String, List<String>> converted = new HashMap<String, List<String>>();

	public static void main(String[] args) {
		try {
			TestFile testFile = TestFile.AC11;
			File ifcSchemaFile = new File("lib\\IFC2x3_Final.exp");
			ExpressSchemaParser schemaParser = new ExpressSchemaParser(ifcSchemaFile);
			schemaParser.parse();
			SchemaDefinition schema = schemaParser.getSchema();
			new DerivedReader(ifcSchemaFile, schema);
			FastIfcFileReader fastIfcFileReader = new FastIfcFileReader(schema);
			fastIfcFileReader.read(testFile.getFile());
			ResourceFetcher resourceFetcher = new ResourceFetcher() {
				@Override
				public URL getResource(String name) {
					return getClass().getResource(name);
				}
			};
			FileFieldIgnoreMap ignoreMap = new FileFieldIgnoreMap(CollectionUtils.singleSet(Ifc2x3Package.eINSTANCE), resourceFetcher);
			File outputFile = new File("output", testFile.getFile().getName().replace(".ifc", ".dae"));
			FileOutputStream out = new FileOutputStream(outputFile);
			new IfcToCollada(fastIfcFileReader.getModel(), schema, new File("lib\\IFC2x3_Final.exp"), ignoreMap)
					.write(out);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public IfcToCollada(EmfModel<Long> model, SchemaDefinition schemaDefinition, File schemaFile, FileFieldIgnoreMap ignoreMap) {
		super(model);
		this.schemaDefinition = schemaDefinition;
		this.schemaFile = schemaFile;
		this.ignoreMap = ignoreMap;
		ifcEngine = IfcEngine.getInstance();
		if (!subfiles.isDirectory()) {
			subfiles.mkdir();
		}
	}

	@Override
	public void write(OutputStream out) {
		PrintWriter writer = new PrintWriter(out);
		try {
			writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>");
			writer.println("<COLLADA xmlns=\"http://www.collada.org/2005/11/COLLADASchema\" version=\"1.4.1\">");

			writeAssets(writer);
			writeCameras(writer);
			writeLights(writer);
			writeMaterials(writer);
			writeEffects(writer);
			writeGeometries(writer);
			writeVisualScenes(writer);
			writeScene(writer);

			writer.print("</COLLADA>");
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void writeAssets(PrintWriter out) {
		out.println("    <asset>");
		out.println("        <contributor>");
		out.println("            <author>" + model.getAuthor() + "</author>");
		out.println("            <authoring_tool>BIMserver</authoring_tool>");
		out.println("            <comments>" + model.getDescription() + "</comments>");
		out.println("            <copyright>Copyright</copyright>");
		out.println("        </contributor>");
		out.println("        <created>2006-06-21T21:23:22Z</created>");
		out.println("        <modified>2006-06-21T21:23:22Z</modified>");
		out.println("        <unit meter=\"0.01\" name=\"centimeter\"/>");
		out.println("        <up_axis>Y_UP</up_axis>");
		out.println("    </asset>");
	}

	private void writeGeometries(PrintWriter out) {
		out.println("	<library_geometries>");
		IfcDatabase<Long> ifcDatabase = new IfcDatabase<Long>(model, null);
		for (IfcRoof ifcRoof : ifcDatabase.getAll(IfcRoof.class)) {
			setGeometry(out, (IfcRootObject) ifcRoof, ifcRoof.getGlobalId().getWrappedValue(), "Roof");
		}
//		for (IfcSpace ifcSpace : ifcDatabase.getAll(IfcSpace.class)) {
//			setGeometry(out, (IfcRootObject) ifcSpace, ifcSpace.getGlobalId().getWrappedValue(), "Space");
//		}
		for (IfcSlab ifcSlab : ifcDatabase.getAll(IfcSlab.class)) {
			if (ifcSlab.getPredefinedType() == IfcSlabTypeEnum.ROOF) {
				setGeometry(out, (IfcRootObject) ifcSlab, ifcSlab.getGlobalId().getWrappedValue(), "Roof");
			} else {
				setGeometry(out, (IfcRootObject) ifcSlab, ifcSlab.getGlobalId().getWrappedValue(), "Slab");
			}
		}
		for (IfcWindow ifcWindow : ifcDatabase.getAll(IfcWindow.class)) {
			setGeometry(out, (IfcRootObject) ifcWindow, ifcWindow.getGlobalId().getWrappedValue(), "Window");
		}
		for (IfcDoor ifcDoor : ifcDatabase.getAll(IfcDoor.class)) {
			setGeometry(out, (IfcRootObject) ifcDoor, ifcDoor.getGlobalId().getWrappedValue(), "Door");
		}
		for (IfcWall ifcWall : ifcDatabase.getAll(IfcWall.class)) {
			setGeometry(out, (IfcRootObject) ifcWall, ifcWall.getGlobalId().getWrappedValue(), "Wall");
		}
		for (IfcWallStandardCase ifcWall : ifcDatabase.getAll(IfcWallStandardCase.class)) {
			setGeometry(out, (IfcRootObject) ifcWall, ifcWall.getGlobalId().getWrappedValue(), "Wall");
		}
		for (IfcRailing ifcRailing : ifcDatabase.getAll(IfcRailing.class)) {
			setGeometry(out, (IfcRootObject) ifcRailing, ifcRailing.getGlobalId().getWrappedValue(), "Railing");
		}
		for (IfcColumn ifcColumn : ifcDatabase.getAll(IfcColumn.class)) {
			setGeometry(out, (IfcRootObject) ifcColumn, ifcColumn.getGlobalId().getWrappedValue(), "Column");
		}
		out.println("	</library_geometries>");
	}

	@SuppressWarnings("unchecked")
	private EObject convertToSubset(EClass originalClass, IfcRootObject ifcRootObject, EmfModel<Long> newModel, Map<EObject, EObject> converted) {
		EObject newObject = Ifc2x3Factory.eINSTANCE.create(ifcRootObject.eClass());
		converted.put(ifcRootObject, newObject);
		if (!(newObject instanceof WrappedValue)) {
			newModel.add(newObject);
		}
		for (EStructuralFeature eStructuralFeature : ifcRootObject.eClass().getEAllStructuralFeatures()) {
			if (!ignoreMap.shouldIgnoreField(ifcRootObject.eClass(), ifcRootObject.eClass(), eStructuralFeature)) {
				Object get = ifcRootObject.eGet(eStructuralFeature);
				if (eStructuralFeature instanceof EAttribute) {
					if (get instanceof Float || get instanceof Double) {
						EStructuralFeature floatStringFeature = ifcRootObject.eClass().getEStructuralFeature("stringValuewrappedValue");
						Object floatString = ifcRootObject.eGet(floatStringFeature);
						newObject.eSet(floatStringFeature, floatString);
					}
					newObject.eSet(eStructuralFeature, get);
				} else if (eStructuralFeature instanceof EReference) {
					if (get == null) {
					} else {
						if (eStructuralFeature.getUpperBound() == -1 || eStructuralFeature.getUpperBound() > 1) {
							BasicEList<EObject> list = (BasicEList<EObject>) get;
							BasicEList<EObject> toList = (BasicEList<EObject>) newObject.eGet(eStructuralFeature);
							for (Object o : list) {
								if (converted.containsKey(o)) {
									toList.addUnique(converted.get(o));
								} else {
									toList.addUnique(convertToSubset(originalClass, (IfcRootObject) o, newModel, converted));
								}
							}
						} else {
							if (converted.containsKey(get)) {
								newObject.eSet(eStructuralFeature, converted.get(get));
							} else {
								newObject.eSet(eStructuralFeature, convertToSubset(originalClass, (IfcRootObject) get, newModel, converted));
							}
						}
					}
				}
			}
		}
		return newObject;
	}
	
	private void setGeometry(PrintWriter out, IfcRootObject ifcRootObject, String id, String material) {
		convertCounter++;
		if (!converted.containsKey(material)) {
			converted.put(material, new ArrayList<String>());
		}
		converted.get(material).add(id);
		EmfModel<Long> basicEmfModel = new BasicEmfModel<Long>();
		convertToSubset(ifcRootObject.eClass(), ifcRootObject, basicEmfModel, new HashMap<EObject, EObject>());
		IfcSerializer ifcSerializer = new IfcSerializer(basicEmfModel, schemaDefinition);
		File file = new File(subfiles, convertCounter + ".ifc");
		try {
			ifcSerializer.write(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			int modelID = ifcEngine.sdaiOpenModelBN(convertCounter, file.getAbsolutePath(), schemaFile.getAbsolutePath());
			IfcEngine.SurfaceProperties sp = ifcEngine.initializeModelling(modelID, 0.0);
			int verticesCount = sp.getVerticesCount();
			float[] coordinates = new float[verticesCount * 3];
			float[] normals = new float[verticesCount * 3];
			int[] indices = new int[sp.getIndicesCount()];
			ifcEngine.finalizeModelling(modelID, coordinates, normals, indices);
			writeGeometries(out, sp, id, coordinates, normals, indices, material);
			ifcEngine.sdaiCloseModel(modelID);
		} catch (Exception e) {
			LOGGER.error("", e);
		}
	}
	
	private void writeGeometries(PrintWriter out, IfcEngine.SurfaceProperties sp, String guid, float[] coordinates, float[] normals, int[] indices, String material) {
		out.println("<geometry id=\"" + guid + "\" name=\"" + guid + "\">");
		out.println("<mesh bothsides=\"true\" doubleSided=\"true\">");
		out.println("<extra><technique profile=\"MAYA\"><double_sided>1</double_sided></technique></extra>");
		out.println("<source id=\"" + guid + "-positions\" name=\"" + guid + "-positions\">");
		out.print("<float_array id=\"" + guid + "-positions-array\" count=\"" + coordinates.length + "\">");
		for (int i = 0; i < coordinates.length; i += 1) {
			out.print(coordinates[i] + " ");
		}
		out.println("</float_array>");
		out.println("<technique_common>");
		out.println("<accessor count=\"" + (coordinates.length / 3) + "\" offset=\"0\" source=\"#" + guid + "-positions-array\" stride=\"3\">");
		out.println("<param name=\"X\" type=\"float\"></param>");
		out.println("<param name=\"Y\" type=\"float\"></param>");
		out.println("<param name=\"Z\" type=\"float\"></param>");
		out.println("</accessor>");
		out.println("</technique_common>");
		out.println("</source>");

		out.println("<source id=\"" + guid + "-normals\" name=\"normal\">");
		out.print("<float_array id=\"" + guid + "-normals-array\" count=\"" + normals.length + "\">");
		for (int i = 0; i < normals.length; i++) {
			out.print(normals[i] + " ");
		}
		out.println("</float_array>");
		out.println("<technique_common>");
		out.println("<accessor count=\"" + (normals.length / 3) + "\" offset=\"0\" source=\"#" + guid + "-normals-array\" stride=\"3\">");
		out.println("<param name=\"X\" type=\"float\"></param>");
		out.println("<param name=\"Y\" type=\"float\"></param>");
		out.println("<param name=\"Z\" type=\"float\"></param>");
		out.println("</accessor>");
		out.println("</technique_common>");
		out.println("</source>");

		out.println("<vertices id=\"" + guid + "-vertices\">");
		out.println("<input semantic=\"POSITION\" source=\"#" + guid + "-positions\"/>");
		out.println("</vertices>");
		out.println("<triangles count=\"" + (sp.getIndicesCount() / 3) + "\" material=\"" + material + "SG\">");
		out.println("<input offset=\"0\" semantic=\"VERTEX\" source=\"#" + guid + "-vertices\"/>");
		out.print("<p>");
		for (int i = 0; i < indices.length; i++) {
			out.print(indices[i] + " ");
		}
		out.println("</p>");
		out.println("</triangles>");
		out.println("</mesh>");
		out.println("</geometry>");
	}

	private void writeScene(PrintWriter out) {
		out.println("	<scene>");
		out.println("		<instance_visual_scene url=\"#VisualSceneNode\"/>");
		out.println("	</scene>");
	}

	private void writeVisualScenes(PrintWriter out) {
		out.println("    <library_visual_scenes>");
		out.println("        <visual_scene id=\"VisualSceneNode\" name=\"untitled\">");
		out.println("            <node id=\"Camera\" name=\"Camera\">");
		out.println("                <translate sid=\"translate\">-427.749 333.855 655.017</translate>");
		out.println("                <rotate sid=\"rotateX\">1 0 0 -22.1954</rotate>");
		out.println("                <rotate sid=\"rotateY\">0 1 0 -33</rotate>");
		out.println("                <rotate sid=\"rotateZ\">0 0 1 0</rotate>");
		out.println("                <instance_camera url=\"#PerspCamera\"/>");
		out.println("            </node>");
		out.println("            <node id=\"Light\" name=\"Light\">");
		out.println("                <translate sid=\"translate\">-500 1000 400</translate>");
		out.println("                <rotate sid=\"rotateX\">1 0 0 0</rotate>");
		out.println("                <rotate sid=\"rotateY\">0 1 0 0</rotate>");
		out.println("                <rotate sid=\"rotateZ\">0 0 1 0</rotate>");
		out.println("                <instance_light url=\"#light-lib\"/>");
		out.println("            </node>");
		for (String material : converted.keySet()) {
			List<String> ids = converted.get(material);
			for (String id : ids) {
				out.println("            <node id=\"" + id + "\" name=\"" + id + "\">");
				out.println("                <rotate sid=\"rotateX\">1 0 0 90</rotate>");
				out.println("                <rotate sid=\"rotateY\">0 1 0 180</rotate>");
				out.println("                <rotate sid=\"rotateZ\">0 0 1 90</rotate>");
				out.println("                <instance_geometry url=\"#" + id + "\">");
				out.println("                    <bind_material>");
				out.println("                        <technique_common>");
				out.println("                            <instance_material symbol=\"" + material + "SG\" target=\"#" + material + "Material\"/>");
				out.println("                        </technique_common>");
				out.println("                    </bind_material>");
				out.println("                </instance_geometry>");
				out.println("            </node>");
			}
		}
		out.println("            <node id=\"testCamera\" name=\"testCamera\">");
		out.println("                <translate sid=\"translate\">-427.749 333.855 655.017</translate>");
		out.println("                <rotate sid=\"rotateY\">0 1 0 -33</rotate>");
		out.println("                <rotate sid=\"rotateX\">1 0 0 -22.1954</rotate>");
		out.println("                <rotate sid=\"rotateZ\">0 0 1 0</rotate>");
		out.println("                <instance_camera url=\"#testCameraShape\"/>");
		out.println("            </node>");
		out.println("            <node id=\"pointLight1\" name=\"pointLight1\">");
		out.println("                <translate sid=\"translate\">3 4 10</translate>");
		out.println("                <rotate sid=\"rotateZ\">0 0 1 0</rotate>");
		out.println("                <rotate sid=\"rotateY\">0 1 0 0</rotate>");
		out.println("                <rotate sid=\"rotateX\">1 0 0 0</rotate>");
		out.println("                <instance_light url=\"#pointLightShape1-lib\"/>");
		out.println("            </node>");
		out.println("        </visual_scene>");
		out.println("    </library_visual_scenes>");
	}

	private void writeEffects(PrintWriter out) {
		out.println("	<library_effects>");
		out.println("        <effect id=\"Space-fx\">");
		out.println("            <profile_COMMON>");
		out.println("                <technique sid=\"common\">");
		out.println("                    <phong>");
		out.println("                        <emission>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </emission>");
		out.println("                        <ambient>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </ambient>");
		out.println("                        <diffuse>");
		out.println("                            <color>0.137255 0.403922 0.870588 1</color>");
		out.println("                        </diffuse>");
		out.println("                        <specular>");
		out.println("                            <color>0.5 0.5 0.5 1</color>");
		out.println("                        </specular>");
		out.println("                        <shininess>");
		out.println("                            <float>16</float>");
		out.println("                        </shininess>");
		out.println("                        <reflective>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </reflective>");
		out.println("                        <reflectivity>");
		out.println("                            <float>0.5</float>");
		out.println("                        </reflectivity>");
		out.println("                        <transparent>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </transparent>");
		out.println("                        <transparency>");
		out.println("                            <float>1</float>");
		out.println("                        </transparency>");
		out.println("                        <index_of_refraction>");
		out.println("                            <float>0</float>");
		out.println("                        </index_of_refraction>");
		out.println("                    </phong>");
		out.println("                </technique>");
		out.println("            </profile_COMMON>");
		out.println("        </effect>");
		out.println("        <effect id=\"Roof-fx\">");
		out.println("            <profile_COMMON>");
		out.println("                <technique sid=\"common\">");
		out.println("                    <phong>");
		out.println("                        <emission>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </emission>");
		out.println("                        <ambient>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </ambient>");
		out.println("                        <diffuse>");
		out.println("                            <color>0.837255 0.203922 0.270588 1</color>");
		out.println("                        </diffuse>");
		out.println("                        <specular>");
		out.println("                            <color>0.5 0.5 0.5 1</color>");
		out.println("                        </specular>");
		out.println("                        <shininess>");
		out.println("                            <float>16</float>");
		out.println("                        </shininess>");
		out.println("                        <reflective>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </reflective>");
		out.println("                        <reflectivity>");
		out.println("                            <float>0.5</float>");
		out.println("                        </reflectivity>");
		out.println("                        <transparent>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </transparent>");
		out.println("                        <transparency>");
		out.println("                            <float>1</float>");
		out.println("                        </transparency>");
		out.println("                        <index_of_refraction>");
		out.println("                            <float>0</float>");
		out.println("                        </index_of_refraction>");
		out.println("                    </phong>");
		out.println("                </technique>");
		out.println("            </profile_COMMON>");
		out.println("        </effect>");
		out.println("        <effect id=\"Slab-fx\">");
		out.println("            <profile_COMMON>");
		out.println("                <technique sid=\"common\">");
		out.println("                    <phong>");
		out.println("                        <emission>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </emission>");
		out.println("                        <ambient>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </ambient>");
		out.println("                        <diffuse>");
		out.println("                            <color>0.637255 0.603922 0.670588 1</color>");
		out.println("                        </diffuse>");
		out.println("                        <specular>");
		out.println("                            <color>0.5 0.5 0.5 1</color>");
		out.println("                        </specular>");
		out.println("                        <shininess>");
		out.println("                            <float>16</float>");
		out.println("                        </shininess>");
		out.println("                        <reflective>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </reflective>");
		out.println("                        <reflectivity>");
		out.println("                            <float>0.5</float>");
		out.println("                        </reflectivity>");
		out.println("                        <transparent>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </transparent>");
		out.println("                        <transparency>");
		out.println("                            <float>1</float>");
		out.println("                        </transparency>");
		out.println("                        <index_of_refraction>");
		out.println("                            <float>0</float>");
		out.println("                        </index_of_refraction>");
		out.println("                    </phong>");
		out.println("                </technique>");
		out.println("            </profile_COMMON>");
		out.println("        </effect>");
		out.println("        <effect id=\"Wall-fx\">");
		out.println("            <profile_COMMON>");
		out.println("                <technique sid=\"common\">");
		out.println("                    <phong>");
		out.println("                        <emission>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </emission>");
		out.println("                        <ambient>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </ambient>");
		out.println("                        <diffuse>");
		out.println("                            <color>0.537255 0.337255 0.237255 1</color>");
		out.println("                        </diffuse>");
		out.println("                        <specular>");
		out.println("                            <color>0.5 0.5 0.5 1</color>");
		out.println("                        </specular>");
		out.println("                        <shininess>");
		out.println("                            <float>16</float>");
		out.println("                        </shininess>");
		out.println("                        <reflective>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </reflective>");
		out.println("                        <reflectivity>");
		out.println("                            <float>0.5</float>");
		out.println("                        </reflectivity>");
		out.println("                        <transparent>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </transparent>");
		out.println("                        <transparency>");
		out.println("                            <float>1</float>");
		out.println("                        </transparency>");
		out.println("                        <index_of_refraction>");
		out.println("                            <float>0</float>");
		out.println("                        </index_of_refraction>");
		out.println("                    </phong>");
		out.println("                </technique>");
		out.println("            </profile_COMMON>");
		out.println("        </effect>");
		out.println("        <effect id=\"Door-fx\">");
		out.println("            <profile_COMMON>");
		out.println("                <technique sid=\"common\">");
		out.println("                    <phong>");
		out.println("                        <emission>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </emission>");
		out.println("                        <ambient>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </ambient>");
		out.println("                        <diffuse>");
		out.println("                            <color>0.637255 0.603922 0.670588 1</color>");
		out.println("                        </diffuse>");
		out.println("                        <specular>");
		out.println("                            <color>0.5 0.5 0.5 1</color>");
		out.println("                        </specular>");
		out.println("                        <shininess>");
		out.println("                            <float>16</float>");
		out.println("                        </shininess>");
		out.println("                        <reflective>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </reflective>");
		out.println("                        <reflectivity>");
		out.println("                            <float>0.5</float>");
		out.println("                        </reflectivity>");
		out.println("                        <transparent>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </transparent>");
		out.println("                        <transparency>");
		out.println("                            <float>1</float>");
		out.println("                        </transparency>");
		out.println("                        <index_of_refraction>");
		out.println("                            <float>0</float>");
		out.println("                        </index_of_refraction>");
		out.println("                    </phong>");
		out.println("                </technique>");
		out.println("            </profile_COMMON>");
		out.println("        </effect>");
		out.println("        <effect id=\"Window-fx\">");
		out.println("            <profile_COMMON>");
		out.println("                <technique sid=\"common\">");
		out.println("                    <phong>");
		out.println("                        <emission>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </emission>");
		out.println("                        <ambient>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </ambient>");
		out.println("                        <diffuse>");
		out.println("                            <color>0.937255 0.203922 0.870588 1</color>");
		out.println("                        </diffuse>");
		out.println("                        <specular>");
		out.println("                            <color>0.5 0.5 0.5 1</color>");
		out.println("                        </specular>");
		out.println("                        <shininess>");
		out.println("                            <float>16</float>");
		out.println("                        </shininess>");
		out.println("                        <reflective>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </reflective>");
		out.println("                        <reflectivity>");
		out.println("                            <float>0.5</float>");
		out.println("                        </reflectivity>");
		out.println("                        <transparent>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </transparent>");
		out.println("                        <transparency>");
		out.println("                            <float>1</float>");
		out.println("                        </transparency>");
		out.println("                        <index_of_refraction>");
		out.println("                            <float>0</float>");
		out.println("                        </index_of_refraction>");
		out.println("                    </phong>");
		out.println("                </technique>");
		out.println("            </profile_COMMON>");
		out.println("        </effect>");
		out.println("        <effect id=\"Railing-fx\">");
		out.println("            <profile_COMMON>");
		out.println("                <technique sid=\"common\">");
		out.println("                    <phong>");
		out.println("                        <emission>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </emission>");
		out.println("                        <ambient>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </ambient>");
		out.println("                        <diffuse>");
		out.println("                            <color>0.137255 0.203922 0.270588 1</color>");
		out.println("                        </diffuse>");
		out.println("                        <specular>");
		out.println("                            <color>0.5 0.5 0.5 1</color>");
		out.println("                        </specular>");
		out.println("                        <shininess>");
		out.println("                            <float>16</float>");
		out.println("                        </shininess>");
		out.println("                        <reflective>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </reflective>");
		out.println("                        <reflectivity>");
		out.println("                            <float>0.5</float>");
		out.println("                        </reflectivity>");
		out.println("                        <transparent>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </transparent>");
		out.println("                        <transparency>");
		out.println("                            <float>1</float>");
		out.println("                        </transparency>");
		out.println("                        <index_of_refraction>");
		out.println("                            <float>0</float>");
		out.println("                        </index_of_refraction>");
		out.println("                    </phong>");
		out.println("                </technique>");
		out.println("            </profile_COMMON>");
		out.println("        </effect>");
		out.println("        <effect id=\"Column-fx\">");
		out.println("            <profile_COMMON>");
		out.println("                <technique sid=\"common\">");
		out.println("                    <phong>");
		out.println("                        <emission>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </emission>");
		out.println("                        <ambient>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </ambient>");
		out.println("                        <diffuse>");
		out.println("                            <color>0.437255 0.603922 0.370588 1</color>");
		out.println("                        </diffuse>");
		out.println("                        <specular>");
		out.println("                            <color>0.5 0.5 0.5 1</color>");
		out.println("                        </specular>");
		out.println("                        <shininess>");
		out.println("                            <float>16</float>");
		out.println("                        </shininess>");
		out.println("                        <reflective>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </reflective>");
		out.println("                        <reflectivity>");
		out.println("                            <float>0.5</float>");
		out.println("                        </reflectivity>");
		out.println("                        <transparent>");
		out.println("                            <color>0 0 0 1</color>");
		out.println("                        </transparent>");
		out.println("                        <transparency>");
		out.println("                            <float>1</float>");
		out.println("                        </transparency>");
		out.println("                        <index_of_refraction>");
		out.println("                            <float>0</float>");
		out.println("                        </index_of_refraction>");
		out.println("                    </phong>");
		out.println("                </technique>");
		out.println("            </profile_COMMON>");
		out.println("        </effect>");
		out.println("    </library_effects>");
	}

	private void writeLights(PrintWriter out) {
		out.println("    <library_lights>");
		out.println("        <light id=\"light-lib\" name=\"light\">");
		out.println("            <technique_common>");
		out.println("                <point>");
		out.println("                    <color>1 1 1</color>");
		out.println("                    <constant_attenuation>1</constant_attenuation>");
		out.println("                    <linear_attenuation>0</linear_attenuation>");
		out.println("                    <quadratic_attenuation>0</quadratic_attenuation>");
		out.println("                </point>");
		out.println("            </technique_common>");
		out.println("            <technique profile=\"MAX3D\">");
		out.println("                <intensity>1.000000</intensity>");
		out.println("            </technique>");
		out.println("        </light>");
		out.println("        <light id=\"pointLightShape1-lib\" name=\"pointLightShape1\">");
		out.println("            <technique_common>");
		out.println("                <point>");
		out.println("                    <color>1 1 1</color>");
		out.println("                    <constant_attenuation>1</constant_attenuation>");
		out.println("                    <linear_attenuation>0</linear_attenuation>");
		out.println("                    <quadratic_attenuation>0</quadratic_attenuation>");
		out.println("                </point>");
		out.println("            </technique_common>");
		out.println("        </light>");
		out.println("    </library_lights>");
	}

	private void writeCameras(PrintWriter out) {
		out.println("    <library_cameras>");
		out.println("        <camera id=\"PerspCamera\" name=\"PerspCamera\">");
		out.println("            <optics>");
		out.println("                <technique_common>");
		out.println("                    <perspective>");
		out.println("                        <yfov>37.8493</yfov>");
		out.println("                        <aspect_ratio>1</aspect_ratio>");
		out.println("                        <znear>10</znear>");
		out.println("                        <zfar>1000</zfar>");
		out.println("                    </perspective>");
		out.println("                </technique_common>");
		out.println("            </optics>");
		out.println("        </camera>");
		out.println("        <camera id=\"testCameraShape\" name=\"testCameraShape\">");
		out.println("            <optics>");
		out.println("                <technique_common>");
		out.println("                    <perspective>");
		out.println("                        <yfov>37.8501</yfov>");
		out.println("                        <aspect_ratio>1</aspect_ratio>");
		out.println("                        <znear>0.01</znear>");
		out.println("                        <zfar>1000</zfar>");
		out.println("                    </perspective>");
		out.println("                </technique_common>");
		out.println("            </optics>");
		out.println("        </camera>");
		out.println("    </library_cameras>");
	}

	private void writeMaterials(PrintWriter out) {
		out.println("	<library_materials>");
		out.println("		<material id=\"RoofMaterial\" name=\"RoofMaterial\" doubleSided=\"true\" bothsides=\"true\" >");
		out.println("			<instance_effect url=\"#Roof-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"SpaceMaterial\" name=\"SpaceMaterial\" doubleSided=\"true\" bothsides=\"true\" >");
		out.println("			<instance_effect url=\"#Space-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"SlabMaterial\" name=\"SlabMaterial\" doubleSided=\"true\" bothsides=\"true\" >");
		out.println("			<instance_effect url=\"#Slab-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"WallMaterial\" name=\"WallMaterial\" doubleSided=\"true\" bothsides=\"true\" >");
		out.println("			<instance_effect url=\"#Wall-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"WindowMaterial\" name=\"WindowMaterial\" doubleSided=\"true\" bothsides=\"true\" >");
		out.println("			<instance_effect url=\"#Window-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"DoorMaterial\" name=\"DoorMaterial\" doubleSided=\"true\" bothsides=\"true\" >");
		out.println("			<instance_effect url=\"#Door-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"RailingMaterial\" name=\"RailingMaterial\" doubleSided=\"true\" bothsides=\"true\" >");
		out.println("			<instance_effect url=\"#Railing-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"ColumnMaterial\" name=\"ColumnMaterial\" doubleSided=\"true\" bothsides=\"true\" >");
		out.println("			<instance_effect url=\"#Column-fx\"/>");
		out.println("		</material>");
		out.println("	</library_materials>");
	}
}