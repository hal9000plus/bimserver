package org.bimserver.o3d;

public class SetGeometryResult {
	private final int addedIndices;
	private final int addedVertices;
	
	public SetGeometryResult(int addedIndices, int addedVertices) {
		this.addedIndices = addedIndices;
		this.addedVertices = addedVertices;
	}

	public int getAddedIndices() {
		return addedIndices;
	}

	public int getAddedVertices() {
		return addedVertices;
	}	
}