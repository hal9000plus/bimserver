package org.bimserver.database.actions;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoot;
import org.bimserver.shared.DataObject;
import org.bimserver.shared.UserException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class GetDataObjectsByTypeDatabaseAction extends BimDatabaseAction<List<DataObject>> {

	private final int pid;
	private final int rid;
	private final String className;

	public GetDataObjectsByTypeDatabaseAction(int pid, int rid, String className) {
		this.pid = pid;
		this.rid = rid;
		this.className = className;
	}

	@Override
	public List<DataObject> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		EClass eClass = bimDatabaseSession.getEClassForName(className);
		
		VirtualRevision virtualRevision = bimDatabaseSession.getVirtualRevision(pid, rid);
		EmfModel<Long> emfModel = new BasicEmfModel<Long>(getSize(virtualRevision));
		BiMap<Long, EObject> mapResult = HashBiMap.create();
		for (ConcreteRevision concreteRevision : virtualRevision.getRevisions()) {
			bimDatabaseSession.getAllOfType(className, concreteRevision.getProject().getId(), concreteRevision.getId(), mapResult);
			merge(emfModel, new BasicEmfModel<Long>(mapResult));
		}
		List<DataObject> dataObjects = new ArrayList<DataObject>();
		for (Long oid : mapResult.keySet()) {
			EObject eObject = mapResult.get(oid);
			if (eClass.isInstance(eObject)) {
				DataObject dataObject = null;
				if (eObject instanceof IfcRoot) {
					IfcRoot ifcRoot = (IfcRoot)eObject;
					dataObject = new DataObject(eObject.eClass().getName(), oid, ifcRoot.getGlobalId().getWrappedValue(), ifcRoot.getName().getWrappedValue());
				} else {
					dataObject = new DataObject(eObject.eClass().getName(), oid, null, null);
				}
				GetDataObjectByOidDatabaseAction.fillDataObject(mapResult, eObject, dataObject);
				dataObjects.add(dataObject);
			}
		}
		return dataObjects;
	}
}