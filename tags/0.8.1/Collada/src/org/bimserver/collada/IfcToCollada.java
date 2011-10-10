package org.bimserver.collada;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.BimModelSerializer;
import org.bimserver.ifc.FieldIgnoreMap;
import org.bimserver.ifc.database.IfcDatabase;
import org.bimserver.ifc.emf.Ifc2x3.IfcColumn;
import org.bimserver.ifc.emf.Ifc2x3.IfcDoor;
import org.bimserver.ifc.emf.Ifc2x3.IfcRailing;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoof;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlab;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlabTypeEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcWall;
import org.bimserver.ifc.emf.Ifc2x3.IfcWallStandardCase;
import org.bimserver.ifc.emf.Ifc2x3.IfcWindow;
import org.bimserver.ifc.file.writer.IfcStepSerializer;
import org.bimserver.ifcengine.FailSafeIfcEngine;
import org.bimserver.ifcengine.Geometry;
import org.bimserver.ifcengine.IfcEngineModel;
import org.bimserver.ifcengine.Instance;
import org.bimserver.ifcengine.IfcEngine.InstanceVisualisationProperties;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfcToCollada extends BimModelSerializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(IfcToCollada.class);
	private final FailSafeIfcEngine ifcEngine;
	private final SchemaDefinition schemaDefinition;
	private final Map<String, List<String>> converted = new HashMap<String, List<String>>();

	public IfcToCollada(EmfModel<Long> model, SchemaDefinition schemaDefinition, FieldIgnoreMap fieldIgnoreMap, FailSafeIfcEngine ifcEngine) {
		super(model, fieldIgnoreMap);
		this.schemaDefinition = schemaDefinition;
		this.ifcEngine = ifcEngine;
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
			setGeometry(out, ifcRoof, ifcRoof.getGlobalId().getWrappedValue(), "Roof");
		}
		// for (IfcSpace ifcSpace : ifcDatabase.getAll(IfcSpace.class)) {
		// setGeometry(out, (IfcRootObject) ifcSpace,
		// ifcSpace.getGlobalId().getWrappedValue(), "Space");
		// }
		for (IfcSlab ifcSlab : ifcDatabase.getAll(IfcSlab.class)) {
			if (ifcSlab.getPredefinedType() == IfcSlabTypeEnum.ROOF) {
				setGeometry(out, ifcSlab, ifcSlab.getGlobalId().getWrappedValue(), "Roof");
			} else {
				setGeometry(out, ifcSlab, ifcSlab.getGlobalId().getWrappedValue(), "Slab");
			}
		}
		for (IfcWindow ifcWindow : ifcDatabase.getAll(IfcWindow.class)) {
			setGeometry(out, ifcWindow, ifcWindow.getGlobalId().getWrappedValue(), "Window");
		}
		for (IfcDoor ifcDoor : ifcDatabase.getAll(IfcDoor.class)) {
			setGeometry(out, ifcDoor, ifcDoor.getGlobalId().getWrappedValue(), "Door");
		}
		for (IfcWall ifcWall : ifcDatabase.getAll(IfcWall.class)) {
			setGeometry(out, ifcWall, ifcWall.getGlobalId().getWrappedValue(), "Wall");
		}
		for (IfcWallStandardCase ifcWall : ifcDatabase.getAll(IfcWallStandardCase.class)) {
			setGeometry(out, ifcWall, ifcWall.getGlobalId().getWrappedValue(), "Wall");
		}
		for (IfcRailing ifcRailing : ifcDatabase.getAll(IfcRailing.class)) {
			setGeometry(out, ifcRailing, ifcRailing.getGlobalId().getWrappedValue(), "Railing");
		}
		for (IfcColumn ifcColumn : ifcDatabase.getAll(IfcColumn.class)) {
			setGeometry(out, ifcColumn, ifcColumn.getGlobalId().getWrappedValue(), "Column");
		}
		out.println("	</library_geometries>");
	}

	private void setGeometry(PrintWriter out, EObject ifcRootObject, String id, String material) {
		if (!converted.containsKey(material)) {
			converted.put(material, new ArrayList<String>());
		}
		converted.get(material).add(id);
		EmfModel<Long> basicEmfModel = new BasicEmfModel<Long>();
		convertToSubset(ifcRootObject.eClass(), ifcRootObject, basicEmfModel, new HashMap<EObject, EObject>());
		IfcStepSerializer ifcSerializer = new IfcStepSerializer(basicEmfModel, schemaDefinition);
		File file = createTempFile();
		try {
			ifcSerializer.write(file);
			IfcEngineModel model = ifcEngine.openModel(file);
			model.setPostProcessing(true);
			Geometry geometry = model.finalizeModelling(model.initializeModelling());
			out.println("<geometry id=\"" + id + "\" name=\"" + id + "\">");
			out.println("<mesh>");
			out.println("<source id=\"" + id + "-positions\" name=\"" + id + "-positions\">");
			out.print("<float_array id=\"" + id + "-positions-array\" count=\"" + geometry.getNrVertices() + "\">");
			for (int i = 0; i < geometry.getNrVertices(); i += 1) {
				out.print(geometry.getVertex(i) + " ");
			}
			out.println("</float_array>");
			out.println("<technique_common>");
			out.println("<accessor count=\"" + (geometry.getNrVertices() / 3) + "\" offset=\"0\" source=\"#" + id + "-positions-array\" stride=\"3\">");
			out.println("<param name=\"X\" type=\"float\"></param>");
			out.println("<param name=\"Y\" type=\"float\"></param>");
			out.println("<param name=\"Z\" type=\"float\"></param>");
			out.println("</accessor>");
			out.println("</technique_common>");
			out.println("</source>");

			out.println("<source id=\"" + id + "-normals\" name=\"normal\">");
			out.print("<float_array id=\"" + id + "-normals-array\" count=\"" + geometry.getNrNormals() + "\">");
			for (int i = 0; i < geometry.getNrNormals(); i++) {
				out.print(geometry.getNormal(i) + " ");
			}
			out.println("</float_array>");
			out.println("<technique_common>");
			out.println("<accessor count=\"" + (geometry.getNrNormals() / 3) + "\" offset=\"0\" source=\"#" + id + "-normals-array\" stride=\"3\">");
			out.println("<param name=\"X\" type=\"float\"></param>");
			out.println("<param name=\"Y\" type=\"float\"></param>");
			out.println("<param name=\"Z\" type=\"float\"></param>");
			out.println("</accessor>");
			out.println("</technique_common>");
			out.println("</source>");

			out.println("<vertices id=\"" + id + "-vertices\">");
			out.println("<input semantic=\"POSITION\" source=\"#" + id + "-positions\"/>");
			out.println("</vertices>");
			for (Instance instance : model.getInstances(ifcRootObject.eClass().getName().toUpperCase())) {
				InstanceVisualisationProperties instanceInModelling = instance.getVisualisationProperties();
				out.println("<triangles count=\"" + (instanceInModelling.getPrimitiveCount()) + "\" material=\"" + material + "SG\">");
				out.println("<input offset=\"0\" semantic=\"VERTEX\" source=\"#" + id + "-vertices\"/>");
				out.print("<p>");
				for (int i = instanceInModelling.getStartIndex(); i < instanceInModelling.getPrimitiveCount() * 3 + instanceInModelling.getStartIndex(); i += 3) {
					out.print(geometry.getIndex(i) + " ");
					out.print(geometry.getIndex(i + 2) + " ");
					out.print(geometry.getIndex(i + 1) + " ");
				}
				out.println("</p>");
				out.println("</triangles>");
			}
			out.println("</mesh>");
			out.println("</geometry>");
			model.close();
		} catch (Exception e) {
			LOGGER.error("", e);
		}
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
		out.println("                            <color>0.2 0.2 0.8 1</color>");
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
		out.println("		<material id=\"RoofMaterial\" name=\"RoofMaterial\">");
		out.println("			<instance_effect url=\"#Roof-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"SpaceMaterial\" name=\"SpaceMaterial\">");
		out.println("			<instance_effect url=\"#Space-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"SlabMaterial\" name=\"SlabMaterial\">");
		out.println("			<instance_effect url=\"#Slab-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"WallMaterial\" name=\"WallMaterial\">");
		out.println("			<instance_effect url=\"#Wall-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"WindowMaterial\" name=\"WindowMaterial\">");
		out.println("			<instance_effect url=\"#Window-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"DoorMaterial\" name=\"DoorMaterial\">");
		out.println("			<instance_effect url=\"#Door-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"RailingMaterial\" name=\"RailingMaterial\">");
		out.println("			<instance_effect url=\"#Railing-fx\"/>");
		out.println("		</material>");
		out.println("		<material id=\"ColumnMaterial\" name=\"ColumnMaterial\">");
		out.println("			<instance_effect url=\"#Column-fx\"/>");
		out.println("		</material>");
		out.println("	</library_materials>");
	}
}