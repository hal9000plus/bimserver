package org.bimserver.database.actions;

import java.util.Map;
import java.util.Set;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.Database;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.conditions.HasReferenceToCondition;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.User;
import org.bimserver.shared.UserException;
import org.bimserver.utils.CollectionUtils;

public class GetAllRevisionsByUserDatabaseAction extends BimDatabaseAction<Set<ConcreteRevision>>{

	private final int uid;

	public GetAllRevisionsByUserDatabaseAction(int uid) {
		this.uid = uid;
	}

	@Override
	public Set<ConcreteRevision> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		User user = bimDatabaseSession.getUserById(uid);
		Condition condition = new HasReferenceToCondition(StorePackage.eINSTANCE.getConcreteRevision_User(), user);
		return CollectionUtils.mapToSet((Map<Long, ConcreteRevision>) bimDatabaseSession.query(Database.STORE_PROJECT_ID, -1, condition, ConcreteRevision.class));
	}
}