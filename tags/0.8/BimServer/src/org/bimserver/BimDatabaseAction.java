package org.bimserver;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.shared.UserException;

public abstract class BimDatabaseAction<T> {
	public abstract T execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException;

	protected void merge(EmfModel<Long> model1, BasicEmfModel<Long> model2) {
		for (long key : model2.keySet()) {
			model1.add(key, model2.get(key));
		}
	}
	
	protected int getSize(VirtualRevision revision) {
		int size = 0;
		for (ConcreteRevision concreteRevision : revision.getRevisions()) {
			size += concreteRevision.getSize();
		}
		return size;
	}
}