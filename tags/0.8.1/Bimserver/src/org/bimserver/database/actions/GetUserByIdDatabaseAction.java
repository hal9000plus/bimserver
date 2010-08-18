package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.Database;
import org.bimserver.database.query.conditions.AttributeCondition;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.literals.IntegerLiteral;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.shared.UserException;

public class GetUserByIdDatabaseAction extends BimDatabaseAction<User> {

	private final int uid;
	private final int actingUid;

	public GetUserByIdDatabaseAction(int uid, int actingUid) {
		this.uid = uid;
		this.actingUid = actingUid;
	}

	@Override
	public User execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		User actingUser = bimDatabaseSession.getUserById(actingUid);
		if (uid == actingUid || uid == 2 || actingUser.getUserType() == UserType.ADMIN) {
			Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getUser_Id(), new IntegerLiteral(uid));
			return bimDatabaseSession.querySingle(Database.STORE_PROJECT_ID, -1, condition, User.class);
		} else {
			throw new UserException("Insufficient rights");
		}
	}
}