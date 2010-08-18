package org.bimserver.ifc;

import org.eclipse.emf.ecore.impl.EObjectImpl;

public class IfcRootObject extends EObjectImpl {
	private int instanceId;

	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
	}

	public int getInstanceId() {
		return instanceId;
	}
}