package org.bimserver;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.apache.tools.tar.TarEntry;
import org.apache.tools.tar.TarOutputStream;
import org.bimserver.citygml.IfcEngine;
import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.ifc.FieldIgnoreMap;
import org.bimserver.ifc.IfcRootObject;
import org.bimserver.ifc.database.IfcDatabase;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Factory;
import org.bimserver.ifc.emf.Ifc2x3.IfcColumn;
import org.bimserver.ifc.emf.Ifc2x3.IfcRamp;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoof;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoot;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlab;
import org.bimserver.ifc.emf.Ifc2x3.IfcStair;
import org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight;
import org.bimserver.ifc.emf.Ifc2x3.IfcWall;
import org.bimserver.ifc.emf.Ifc2x3.IfcWallStandardCase;
import org.bimserver.ifc.emf.Ifc2x3.IfcWindow;
import org.bimserver.ifc.emf.Ifc2x3.WrappedValue;
import org.bimserver.ifc.file.writer.IfcSerializer;
import org.bimserver.utils.LittleEndianBinUtils;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class O3dJsonSerializer extends EmfSerializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(O3dJsonSerializer.class);
	private int counter = 2;
	private final FieldIgnoreMap fieldIgnoreMap;
	private int convertCounter;
	private final SchemaDefinition schemaDefinition;
	private final File subfiles = new File("subfiles");
	private final IfcEngine ifcEngine;
	private final File schemaFile;

	public O3dJsonSerializer(EmfModel<Long> model, FieldIgnoreMap fieldIgnoreMap, File schemaFile, SchemaDefinition schemaDefinition) {
		super(model);
		this.fieldIgnoreMap = fieldIgnoreMap;
		this.schemaFile = schemaFile;
		this.schemaDefinition = schemaDefinition;
		ifcEngine = IfcEngine.getInstance();
		if (!subfiles.isDirectory()) {
			subfiles.mkdir();
		}
	}

	@Override
	public void write(OutputStream out) {
		try {
			GZIPOutputStream gzipOutputStream = new GZIPOutputStream(out);
			TarOutputStream tarOutputStream = new TarOutputStream(gzipOutputStream, 512, 512);
			TarEntry tarEntry = new TarEntry("aaaaaaaa.o3d");
			tarEntry.setSize(3);
			tarOutputStream.putNextEntry(tarEntry);
			tarOutputStream.write("o3d".getBytes("UTF-8"));
			tarOutputStream.closeEntry();
			try {
				List<Integer> indexBuffer = new ArrayList<Integer>();
				List<Float> vertexBuffer = new ArrayList<Float>();
				byte[] buffer = writeJSON(indexBuffer, vertexBuffer);
				System.out.println(new String(buffer));
				TarEntry sceneEntry = new TarEntry("scene.json");
				sceneEntry.setSize(buffer.length);
				tarOutputStream.putNextEntry(sceneEntry);
				tarOutputStream.write(buffer);
				tarOutputStream.closeEntry();

				TarEntry indexEntry = new TarEntry("index-buffers.bin");
				indexEntry.setSize(4 + 4 + 4 + 1 + 1 + 4 + (indexBuffer.size() * 4));
				tarOutputStream.putNextEntry(indexEntry);
				tarOutputStream.write("BUFF".getBytes("ASCII"));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(1));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(1));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 2));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 1));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(indexBuffer.size()));
				for (Integer i : indexBuffer) {
					tarOutputStream.write(LittleEndianBinUtils.intToByteArray(i));
				}
				tarOutputStream.closeEntry();

				TarEntry vertexEntry = new TarEntry("vertex-buffers.bin");
				vertexEntry.setSize(4 + 4 + 4 + 1 + 1 + 1 + 1 + 4 + (vertexBuffer.size() * 4));
				tarOutputStream.putNextEntry(vertexEntry);
				tarOutputStream.write("BUFF".getBytes("ASCII"));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(1));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(2));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 1));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 3));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 1));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 3));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(vertexBuffer.size() / 6));
				for (Float i : vertexBuffer) {
					tarOutputStream.write(LittleEndianBinUtils.floatToByteArray(i));
				}
				tarOutputStream.closeEntry();
			} catch (JSONException e) {
				e.printStackTrace();
			}
			tarOutputStream.finish();
			tarOutputStream.flush();
			out.flush();
			gzipOutputStream.finish();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public byte[] writeJSON(List<Integer> indexBufferList, List<Float> vertexBufferList) throws JSONException {
		JSONObject root = new JSONObject();
		root.put("version", 6);
		root.put("o3d_rootObject_root", 1);
		JSONObject objects = new JSONObject();
		root.put("objects", objects);
		JSONArray materials = new JSONArray();
		JSONObject material = createMaterial("RoofMaterial");
		materials.put(material);
		objects.put("o3d.Material", materials);
		JSONArray shapes = new JSONArray();
		objects.put("o3d.Shape", shapes);
		JSONArray transformations = new JSONArray();
		objects.put("o3d.Transform", transformations);
		JSONArray jsonIndexBuffer = new JSONArray();
		objects.put("o3d.IndexBuffer", jsonIndexBuffer);
		JSONArray jsonPrimitive = new JSONArray();
		objects.put("o3d.Primitive", jsonPrimitive);
		JSONArray jsonStreamBank = new JSONArray();
		objects.put("o3d.StreamBank", jsonStreamBank);
		JSONArray jsonVertexBuffer = new JSONArray();
		objects.put("o3d.VertexBuffer", jsonVertexBuffer);
		JSONObject rootTransformation = createTransformation(1);
		JSONObject theTransformation = createTransformation(rootTransformation.getInt("id"));
		transformations.put(rootTransformation);
		transformations.put(theTransformation);

		int fieldId1 = increaseCounter();
		int fieldId2 = increaseCounter();
		int fieldId3 = increaseCounter();
		JSONObject indexBuffer = createIndexBuffer(jsonIndexBuffer, fieldId3);
		JSONObject vertexBuffer = createVertexBuffer(jsonVertexBuffer, fieldId1, fieldId2);
		IfcDatabase<Long> database = new IfcDatabase<Long>(model, fieldIgnoreMap);
		Class[] eClasses = new Class[]{
			IfcWall.class,
			IfcWallStandardCase.class,
//			IfcWindow.class,
//			IfcRoof.class,
//			IfcSlab.class,
//			IfcColumn.class,
//			IfcRamp.class,
//			IfcStair.class,
//			IfcStairFlight.class
		};
		for (Class eClass : eClasses) {
			for (Object object : database.getAll(eClass)) {
				IfcRoot ifcRoot = (IfcRoot)object;
				JSONObject streamBank = createStreamBank(jsonStreamBank);
				JSONArray streamBanks = streamBank.getJSONObject("custom").getJSONArray("vertexStreams");
				JSONObject shape = createShape(ifcRoot.getGlobalId().getWrappedValue());
				theTransformation.getJSONObject("properties").getJSONArray("shapes").put(createRef(shape.getInt("id")));
				shapes.put(shape);
				
				createStream(streamBanks, 1, fieldId1);
				createStream(streamBanks, 2, fieldId2);
				int[] setGeometry = setGeometry(indexBufferList, vertexBufferList, (IfcRootObject) ifcRoot);
				
				JSONObject primitive = createPrimitive(jsonPrimitive, shape, setGeometry[0], setGeometry[1], indexBuffer.getInt("id"), streamBank
						.getInt("id"), material.getInt("id"), 0);
				shape.getJSONObject("properties").getJSONArray("elements").put(createRef(primitive.getInt("id")));
			}			
		}
		indexBuffer.getJSONObject("custom").getJSONArray("binaryRange").put(4 + 4 + 4 + 1 + 1 + 4 + (indexBufferList.size() * 4));
		vertexBuffer.getJSONObject("custom").getJSONArray("binaryRange").put(4 + 4 + 4 + 1 + 1 + 1 + 1 + 4 + (vertexBufferList.size() * 4));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(baos);
		root.write(outputStreamWriter);
		try {
			outputStreamWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return baos.toByteArray();
	}

	private JSONObject createStream(JSONArray streamBanks, int semantic, int fieldId) throws JSONException {
		JSONObject streamBank = new JSONObject();
		JSONObject stream = new JSONObject();
		streamBank.put("stream", stream);
		stream.put("semantic", semantic);
		stream.put("semanticIndex", 0);
		stream.put("field", fieldId);
		stream.put("startIndex", 0);
		streamBanks.put(streamBank);
		return streamBank;
	}

	private JSONObject createStreamBank(JSONArray jsonStreamBank) throws JSONException {
		JSONObject streamBank = new JSONObject();
		streamBank.put("id", increaseCounter());
		JSONObject properties = new JSONObject();
		properties.put("name", "test");
		streamBank.put("properties", properties);
		JSONObject custom = new JSONObject();
		streamBank.put("custom", custom);
		JSONArray vertexStreams = new JSONArray();
		custom.put("vertexStreams", vertexStreams);
		jsonStreamBank.put(streamBank);
		return streamBank;
	}

	private JSONObject createPrimitive(JSONArray jsonPrimitive, JSONObject shape, int vertices, int primitives, int indexBufferId, int streamBankId, int materialId, int startIndex)
			throws JSONException {
		JSONObject primitive = new JSONObject();
		primitive.put("id", increaseCounter());
		JSONObject properties = new JSONObject();
		primitive.put("properties", properties);
		properties.put("name", "test");
		properties.put("owner", createRef(shape.getInt("id")));
		properties.put("numberVertices", vertices);
		properties.put("numberPrimitives", primitives);
		properties.put("primitiveType", 4);
		properties.put("indexBuffer", createRef(indexBufferId));
		properties.put("startIndex", startIndex);
		JSONObject params = new JSONObject();
		primitive.put("params", params);
		JSONObject streamBank = new JSONObject();
		params.put("o3d.streamBank", streamBank);
		JSONObject material = new JSONObject();
		params.put("o3d.material", material);
		material.put("value", createRef(materialId));
		streamBank.put("value", createRef(streamBankId));
		JSONObject custom = new JSONObject();
		custom.put("indexBuffer", indexBufferId);
		primitive.put("custom", custom);
		jsonPrimitive.put(primitive);
		JSONObject boundingBox = new JSONObject();
		params.put("o3d.boundingBox", boundingBox);
		boundingBox.put("value", new JSONArray());
		JSONObject cull = new JSONObject();
		cull.put("value", false);
		JSONObject priority = new JSONObject();
		priority.put("value", 0);
		params.put("o3d.priority", priority);
		params.put("o3d.cull", cull);
		JSONObject zSortPoint = new JSONObject();
		params.put("o3d.zSortPoint", zSortPoint);
		JSONArray value = new JSONArray();
		value.put(0);
		value.put(0);
		value.put(0);
		zSortPoint.put("value", value);
		return primitive;
	}

	private JSONObject createVertexBuffer(JSONArray jsonVertexBuffer, int fieldId1, int fieldId2) throws JSONException {
		JSONObject vertexBuffer = new JSONObject();
		vertexBuffer.put("id", increaseCounter());
		JSONObject indexProperties = new JSONObject();
		vertexBuffer.put("properties", indexProperties);
		indexProperties.put("name", "vertexbuffer");
		JSONObject custom = new JSONObject();
		vertexBuffer.put("custom", custom);
		JSONArray fields = new JSONArray();
		JSONArray binaryRange = new JSONArray();
		custom.put("fields", fields);
		custom.put("binaryRange", binaryRange);
		fields.put(fieldId1);
		fields.put(fieldId2);
		binaryRange.put(0);
		jsonVertexBuffer.put(vertexBuffer);
		return vertexBuffer;
	}

	private JSONObject createIndexBuffer(JSONArray jsonIndexBuffer, int fieldId) throws JSONException {
		JSONObject indexBuffer = new JSONObject();
		int id = increaseCounter();
		indexBuffer.put("id", id);
		JSONObject indexProperties = new JSONObject();
		indexBuffer.put("properties", indexProperties);
		indexProperties.put("name", "blablabla");
		JSONObject custom = new JSONObject();
		indexBuffer.put("custom", custom);
		JSONArray fields = new JSONArray();
		JSONArray binaryRange = new JSONArray();
		custom.put("fields", fields);
		custom.put("binaryRange", binaryRange);
		fields.put(fieldId);
		binaryRange.put(0);
		jsonIndexBuffer.put(indexBuffer);
		return indexBuffer;
	}

	private JSONObject createShape(String name) throws JSONException {
		JSONObject shapeObject = new JSONObject();
		shapeObject.put("id", increaseCounter());
		JSONObject properties = new JSONObject();
		shapeObject.put("properties", properties);
		properties.put("name", name);
		JSONArray elements = new JSONArray();
		properties.put("elements", elements);
		return shapeObject;
	}

	private JSONObject createRef(int id) throws JSONException {
		JSONObject object = new JSONObject();
		object.put("ref", id);
		return object;
	}

	private JSONObject createTransformation(int parentId) throws JSONException {
		JSONObject root = new JSONObject();
		root.put("id", increaseCounter());
		JSONObject properties = new JSONObject();
		properties.put("name", "untitled");
		JSONArray shapes = new JSONArray();
		properties.put("shapes", shapes);
		properties.put("parent", createRef(parentId));
		root.put("properties", properties);
		JSONObject params = new JSONObject();
		JSONObject boundingBox = new JSONObject();
		boundingBox.put("value", new JSONArray());
		params.put("o3d.boundingBox", boundingBox);
		JSONObject cull = new JSONObject();
		cull.put("value", false);
		params.put("o3d.cull", cull);
		JSONObject matrix = new JSONObject();
		JSONArray matrixArray = new JSONArray();
		matrixArray.put(makeArray(1, 0, 0, 0));
		matrixArray.put(makeArray(0, 1, 0, 0));
		matrixArray.put(makeArray(0, 0, 1, 0));
		matrixArray.put(makeArray(0, 0, 0, 1));
		matrix.put("value", matrixArray);
		params.put("o3d.localMatrix", matrix);
		JSONObject visible = new JSONObject();
		visible.put("value", true);
		params.put("o3d.visible", visible);
		root.put("params", params);
		return root;
	}

	private JSONArray makeArray(int... numers) {
		JSONArray array = new JSONArray();
		for (int nr : numers) {
			array.put(nr);
		}
		return array;
	}

	public JSONObject createMaterial(String name) throws JSONException {
		JSONObject object = new JSONObject();
		object.put("id", increaseCounter());
		JSONObject properties = new JSONObject();
		properties.put("name", "RoofMaterial");
		object.put("properties", properties);
		JSONObject params = new JSONObject();
		params.put("ambient", createClass("o3d.ParamFloat4", 0, 0, 0, 1));
		object.put("params", params);
		JSONObject ligtingType = new JSONObject();
		ligtingType.put("class", "o3d.ParamString");
		ligtingType.put("value", "lambert");
		params.put("collada.lightingType", ligtingType);
		params.put("diffuse", createClass("o3d.ParamFloat4", 1, 1, 1, 1));
		params.put("emissive", createClass("o3d.ParamFloat4", 0, 0, 0, 1));
		JSONObject shininess = new JSONObject();
		params.put("shininess", shininess);
		shininess.put("class", "o3d.ParamFloat");
		shininess.put("value", 20);
		params.put("specular", createClass("o3d.ParamFloat4", 0, 0, 0, 1));
		JSONObject specularFactor = new JSONObject();
		params.put("specularFactor", specularFactor);
		specularFactor.put("class", "o3d.ParamFloat");
		specularFactor.put("value", 1);
		return object;
	}

	private JSONObject createClass(String type, int... values) throws JSONException {
		JSONObject ambient = new JSONObject();
		ambient.put("class", type);
		JSONArray ambientValues = new JSONArray();
		for (int i : values) {
			ambientValues.put(i);
		}
		ambient.put("value", ambientValues);
		return ambient;
	}

	private int increaseCounter() {
		return counter++;
	}

	private int[] setGeometry(List<Integer> indexBufferList, List<Float> vertexBufferList, IfcRootObject ifcRootObject) {
		convertCounter++;
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
			for (int i = 0; i < indices.length; i += 3) {
				indexBufferList.add(indices[i]);
				indexBufferList.add(indices[i + 1]);
				indexBufferList.add(indices[i + 2]);
				indexBufferList.add(indices[i + 2]);
				indexBufferList.add(indices[i + 1]);
				indexBufferList.add(indices[i]);
			}
			for (int i = 0; i < coordinates.length; i += 3) {
				vertexBufferList.add(coordinates[i]);
				vertexBufferList.add(coordinates[i + 1]);
				vertexBufferList.add(coordinates[i + 2]);
			}
			for (int i = 0; i < normals.length; i += 3) {
				vertexBufferList.add(normals[i]);
				vertexBufferList.add(normals[i + 1]);
				vertexBufferList.add(normals[i + 2]);
			}
			ifcEngine.sdaiCloseModel(modelID);
			return new int[]{indices.length/6, coordinates.length /3};
		} catch (Exception e) {
			LOGGER.error("", e);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private EObject convertToSubset(EClass originalClass, IfcRootObject ifcRootObject, EmfModel<Long> newModel, Map<EObject, EObject> converted) {
		EObject newObject = Ifc2x3Factory.eINSTANCE.create(ifcRootObject.eClass());
		converted.put(ifcRootObject, newObject);
		if (!(newObject instanceof WrappedValue)) {
			newModel.add(newObject);
		}
		for (EStructuralFeature eStructuralFeature : ifcRootObject.eClass().getEAllStructuralFeatures()) {
			if (!fieldIgnoreMap.shouldIgnoreField(ifcRootObject.eClass(), ifcRootObject.eClass(), eStructuralFeature)) {
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
}