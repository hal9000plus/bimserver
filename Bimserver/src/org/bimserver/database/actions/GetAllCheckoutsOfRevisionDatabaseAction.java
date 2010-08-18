package org.bimserver.database.actions;

import java.util.Map;
import java.util.Set;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.Database;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.conditions.HasReferenceToCondition;
import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.shared.UserException;
import org.bimserver.utils.CollectionUtils;

public class GetAllCheckoutsOfRevisionDatabaseAction extends BimDatabaseAction<Set<Checkout>> {

	private final int pid;
	private final int rid;

	public GetAllCheckoutsOfRevisionDatabaseAction(int pid, int rid) {
		this.pid = pid;
		this.rid = rid;
	}

	@Override
	public Set<Checkout> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		VirtualRevision revision = bimDatabaseSession.getVirtualRevision(pid, rid);
		Condition condition = new HasReferenceToCondition(StorePackage.eINSTANCE.getCheckout_Revision(), revision);
		return CollectionUtils.mapToSet((Map<Long, Checkout>) bimDatabaseSession.query(Database.STORE_PROJECT_ID, -1, condition, Checkout.class));
	}
}