package org.bimserver.ifcengine;

import java.util.ArrayList;

import org.bimserver.ifcengine.IfcEngine.SurfaceProperties;

public class IfcEngineModel {
	private final int modelId;
	private final FailSafeIfcEngine failSafeIfcEngine;

	public IfcEngineModel(FailSafeIfcEngine failSafeIfcEngine, int modelId) {
		this.failSafeIfcEngine = failSafeIfcEngine;
		this.modelId = modelId;
	}
	
	public IfcEngine.SurfaceProperties initializeModelling() throws IfcEngineException {
		failSafeIfcEngine.writeCommand(Command.INITIALIZE_MODELLING);
		failSafeIfcEngine.writeInt(modelId);
		failSafeIfcEngine.flush();
		int noIndices = failSafeIfcEngine.readInt();
		int noVertices = failSafeIfcEngine.readInt();
		return new SurfaceProperties(modelId, noVertices, noIndices, 0.0);
	}

	public void setPostProcessing(boolean postProcessing) throws IfcEngineException {
		failSafeIfcEngine.writeCommand(Command.SET_POSTPROCESSING);
		failSafeIfcEngine.writeInt(modelId);
		failSafeIfcEngine.writeBoolean(postProcessing);
		failSafeIfcEngine.flush();
	}

	public Geometry finalizeModelling(SurfaceProperties surfaceProperties) throws IfcEngineException {
		failSafeIfcEngine.writeCommand(Command.FINALIZE_MODELLING);
		failSafeIfcEngine.writeInt(modelId);
		failSafeIfcEngine.writeInt(surfaceProperties.getIndicesCount());
		failSafeIfcEngine.writeInt(surfaceProperties.getVerticesCount());
		failSafeIfcEngine.flush();
		int[] indices = new int[surfaceProperties.getIndicesCount()];
		float[] vertices = new float[surfaceProperties.getVerticesCount() * 3];
		float[] normals = new float[surfaceProperties.getVerticesCount() * 3];
		for (int i=0; i<indices.length; i++) {
			indices[i] = failSafeIfcEngine.readInt();
		}
		for (int i=0; i<vertices.length; i++) {
			vertices[i] = failSafeIfcEngine.readFloat();
		}
		for (int i=0; i<normals.length; i++) {
			normals[i] = failSafeIfcEngine.readFloat();
		}
		return new Geometry(indices, vertices, normals);
	}

	public ArrayList<Instance> getInstances(String name) throws IfcEngineException {
		failSafeIfcEngine.writeCommand(Command.GET_INSTANCES);
		failSafeIfcEngine.writeInt(modelId);
		failSafeIfcEngine.writeUTF(name);
		failSafeIfcEngine.flush();
		int nrInstances = failSafeIfcEngine.readInt();
		ArrayList<Instance> instances = new ArrayList<Instance>();
		for (int i=0; i<nrInstances; i++) {
			instances.add(new Instance(failSafeIfcEngine, modelId, failSafeIfcEngine.readInt()));
		}
		return instances;
	}

	public void close() throws IfcEngineException {
		failSafeIfcEngine.writeCommand(Command.CLOSE_MODEL);
		failSafeIfcEngine.writeInt(modelId);
		failSafeIfcEngine.flush();
	}
}