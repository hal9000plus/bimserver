package org.bimserver.o3d;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.BimModelSerializer;
import org.bimserver.ifc.FieldIgnoreMap;
import org.bimserver.ifc.database.IfcDatabase;
import org.bimserver.ifc.emf.Ifc2x3.IfcColumn;
import org.bimserver.ifc.emf.Ifc2x3.IfcDoor;
import org.bimserver.ifc.emf.Ifc2x3.IfcRamp;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoof;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoot;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlab;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlabTypeEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcStair;
import org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight;
import org.bimserver.ifc.emf.Ifc2x3.IfcWall;
import org.bimserver.ifc.emf.Ifc2x3.IfcWallStandardCase;
import org.bimserver.ifc.emf.Ifc2x3.IfcWindow;
import org.bimserver.ifc.file.writer.IfcStepSerializer;
import org.bimserver.ifcengine.FailSafeIfcEngine;
import org.bimserver.ifcengine.Geometry;
import org.bimserver.ifcengine.IfcEngine;
import org.bimserver.ifcengine.IfcEngineModel;
import org.bimserver.ifcengine.Instance;
import org.bimserver.ifcengine.IfcEngine.InstanceVisualisationProperties;
import org.bimserver.utils.LittleEndianBinUtils;
import org.codehaus.jettison.json.JSONException;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ice.tar.TarEntry;
import com.ice.tar.TarOutputStream;

public class O3dJsonSerializer extends BimModelSerializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(O3dJsonSerializer.class);
	private final SchemaDefinition schemaDefinition;
	private final FailSafeIfcEngine ifcEngine;
	private int convertCounter;

	public O3dJsonSerializer(EmfModel<Long> model, FieldIgnoreMap fieldIgnoreMap, SchemaDefinition schemaDefinition, FailSafeIfcEngine ifcEngine) {
		super(model, fieldIgnoreMap);
		this.schemaDefinition = schemaDefinition;
		this.ifcEngine = ifcEngine;
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
				Scene scene = createScene();
				byte[] buffer = serialize(scene);
				TarEntry sceneEntry = new TarEntry("scene.json");
				sceneEntry.setSize(buffer.length);
				tarOutputStream.putNextEntry(sceneEntry);
				tarOutputStream.write(buffer);
				tarOutputStream.closeEntry();

				TarEntry indexEntry = new TarEntry("index-buffers.bin");
				indexEntry.setSize(4 + 4 + 4 + 1 + 1 + 4 + (scene.getIndices().size() * 4));
				tarOutputStream.putNextEntry(indexEntry);
				tarOutputStream.write("BUFF".getBytes("ASCII"));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(1));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(1));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 2));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 1));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(scene.getIndices().size()));
				for (Integer i : scene.getIndices()) {
					tarOutputStream.write(LittleEndianBinUtils.intToByteArray(i));
				}
				tarOutputStream.closeEntry();

				TarEntry vertexEntry = new TarEntry("vertex-buffers.bin");
				vertexEntry.setSize(4 + 4 + 4 + 1 + 1 + 1 + 1 + 4 + (scene.getVertices().size() * 4));
				tarOutputStream.putNextEntry(vertexEntry);
				tarOutputStream.write("BUFF".getBytes("ASCII"));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(1));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(2));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 1));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 3));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 1));
				tarOutputStream.write(LittleEndianBinUtils.byteToByteArray((byte) 3));
				tarOutputStream.write(LittleEndianBinUtils.intToByteArray(scene.getVertices().size() / 6));
				for (Float v : scene.getVertices()) {
					tarOutputStream.write(LittleEndianBinUtils.floatToByteArray(v));
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

	@SuppressWarnings("unchecked")
	public Scene createScene() throws JSONException {
		JsonFactory jsonFactory = new JsonFactory();
		Scene scene = new Scene();
		Transformation rootTransformation = jsonFactory.createRootTransformation();
//		Transformation theTransformation = jsonFactory.createTransformation(rootTransformation.getId());
		scene.addTransformation(rootTransformation);
//		scene.addTransformation(theTransformation);

		Material roofMaterial = jsonFactory.createMaterial("RoofMaterial", Color.red);
		Material wallMaterial = jsonFactory.createMaterial("WallMaterial", Color.gray);
		Material slabMaterial = jsonFactory.createMaterial("SlabMaterial", Color.gray);
		Material windowMaterial = jsonFactory.createMaterial("WindowMaterial", Color.blue, 0.5f);
		Material doorMaterial = jsonFactory.createMaterial("DoorMaterial", Color.green);
		Material columnMaterial = jsonFactory.createMaterial("ColumnMaterial", Color.yellow);
		Material rampMaterial = jsonFactory.createMaterial("RampMaterial", Color.yellow);
		Material stairMaterial = jsonFactory.createMaterial("StairMaterial", Color.yellow);
		Material stairFlightMaterial = jsonFactory.createMaterial("StairFlightMaterial", Color.yellow);
		scene.addMaterial(roofMaterial);
		scene.addMaterial(wallMaterial);
		scene.addMaterial(slabMaterial);
		scene.addMaterial(windowMaterial);
		scene.addMaterial(doorMaterial);
		scene.addMaterial(columnMaterial);
		scene.addMaterial(rampMaterial);
		scene.addMaterial(stairMaterial);
		scene.addMaterial(stairFlightMaterial);
		int fieldId1 = jsonFactory.incCounter();
		int fieldId2 = jsonFactory.incCounter();
		int fieldId3 = jsonFactory.incCounter();
		VertexBuffer vertexBuffer = jsonFactory.createVertexBuffer(fieldId1, fieldId2);
		scene.addVertexBuffer(vertexBuffer);
		IndexBuffer indexBuffer = jsonFactory.createIndexBuffer(fieldId3);
		scene.addIndexBuffer(indexBuffer);
		IfcDatabase<Long> database = new IfcDatabase<Long>(model, getFieldIgnoreMap());
		Class[] eClasses = new Class[] {IfcSlab.class, IfcRoof.class, IfcWall.class, IfcWallStandardCase.class, IfcWindow.class, IfcColumn.class, IfcRamp.class, IfcStair.class,
				IfcStairFlight.class };
		int indexCounter = 0;
		int vertexCounter = 0;
		int objectCount = 0;
		StreamBank streamBank = jsonFactory.createStreamBank();
		streamBank.addStream(jsonFactory.createStream(1, fieldId1, 0));
		streamBank.addStream(jsonFactory.createStream(2, fieldId2, 0));
		scene.addStreamBank(streamBank);
		for (Class<? extends EObject> eClass : eClasses) {
			for (Object object : database.getAll(eClass)) {
				IfcRoot ifcRoot = (IfcRoot) object;
				Shape shape = jsonFactory.createShape(ifcRoot.getGlobalId().getWrappedValue());
				scene.addShape(shape);
				rootTransformation.addShape(shape);
				SetGeometryResult setGeometryResult = setGeometry(scene, ifcRoot, 2 * (vertexCounter / 3));
				Primitive primitive = jsonFactory.createPrimitive();
				primitive.setIndexBuffer(indexBuffer);
				if (object instanceof IfcRoof) {
					primitive.setMaterial(roofMaterial);
				} else if (object instanceof IfcWall) {
					primitive.setMaterial(wallMaterial);
				} else if (object instanceof IfcSlab) {
					if (((IfcSlab)object).getPredefinedType() == IfcSlabTypeEnum.ROOF) {
						primitive.setMaterial(roofMaterial);
					} else {
						primitive.setMaterial(slabMaterial);
					}
				} else if (object instanceof IfcWindow) {
					primitive.setMaterial(windowMaterial);
				} else if (object instanceof IfcDoor) {
					primitive.setMaterial(doorMaterial);
				} else if (object instanceof IfcColumn) {
					primitive.setMaterial(columnMaterial);
				} else if (object instanceof IfcStair) {
					primitive.setMaterial(stairMaterial);
				} else if (object instanceof IfcStairFlight) {
					primitive.setMaterial(stairFlightMaterial);
				} else if (object instanceof IfcRamp) {
					primitive.setMaterial(rampMaterial);
				}
				primitive.setNumberPrimitives(setGeometryResult.getAddedIndices() / 3);
				primitive.setNumberVertices(setGeometryResult.getAddedVertices() / 3);
				primitive.setStartIndex(indexCounter);
				primitive.setStreamBank(streamBank);
				primitive.setOwner(shape);
				scene.addPrimitive(primitive);
				shape.setPrimitive(primitive);

				indexCounter += setGeometryResult.getAddedIndices();
				vertexCounter += setGeometryResult.getAddedVertices();
				objectCount++;
			}
		}
		indexBuffer.addBinaryRange(0, 4 + 4 + 4 + 1 + 1 + 4 + (scene.getIndices().size() * 4));
		vertexBuffer.addBinaryRange(4 + 4 + 4 + 1 + 1 + 1 + 1 + 4 + (scene.getVertices().size() * 4));
		return scene;
	}

	public byte[] serialize(Scene sceneFile) throws JSONException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(baos);
		sceneFile.write(outputStreamWriter);
		try {
			outputStreamWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return baos.toByteArray();
	}

	private SetGeometryResult setGeometry(Scene scene, EObject ifcRootObject, int vertexOffset) {
		convertCounter++;
		EmfModel<Long> basicEmfModel = new BasicEmfModel<Long>();
		convertToSubset(ifcRootObject.eClass(), ifcRootObject, basicEmfModel, new HashMap<EObject, EObject>());
		IfcStepSerializer ifcSerializer = new IfcStepSerializer(basicEmfModel, schemaDefinition);
		File file = createTempFile();
		try {
			ifcSerializer.write(file);
			IfcEngineModel model = ifcEngine.openModel(file);
			IfcEngine.SurfaceProperties sp = model.initializeModelling();
			model.setPostProcessing(true);
			Geometry geometry = model.finalizeModelling(sp);
			int nrIndices = 0;
			for (Instance instance : model.getInstances(ifcRootObject.eClass().getName().toUpperCase())) {
				InstanceVisualisationProperties instanceInModelling = instance.getVisualisationProperties();
				for (int i = instanceInModelling.getStartIndex(); i < instanceInModelling.getPrimitiveCount() * 3 + instanceInModelling.getStartIndex(); i += 3) {
					scene.addIndex(geometry.getIndex(i) + vertexOffset);
					scene.addIndex(geometry.getIndex(i + 2) + vertexOffset);
					scene.addIndex(geometry.getIndex(i + 1) + vertexOffset);
					nrIndices++;
				}
			}
			for (int i = 0; i < geometry.getNrVertices(); i += 3) {
				scene.addVertex(geometry.getVertex(i));
				scene.addVertex(geometry.getVertex(i + 1));
				scene.addVertex(geometry.getVertex(i + 2));
			}
			for (int i = 0; i < geometry.getNrNormals(); i += 3) {
				scene.addVertex(geometry.getNormal(i));
				scene.addVertex(geometry.getNormal(i + 1));
				scene.addVertex(geometry.getNormal(i + 2));
			}
			model.close();
			return new SetGeometryResult(nrIndices * 3, geometry.getNrVertices());
		} catch (Exception e) {
			LOGGER.error("", e);
		}
		return null;
	}
}