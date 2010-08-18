package org.bimserver.database.actions;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.shared.UserException;

public class DeleteUserDatabaseAction extends BimDatabaseAction<Boolean> {

	private final int uid;
	private final int actingUid;

	public DeleteUserDatabaseAction(int actingUid, int uid) {
		this.actingUid = actingUid;
		this.uid = uid;
	}

	@Override
	public Boolean execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		User actingUser = bimDatabaseSession.getUserById(actingUid);
		if (actingUser.getUserType() != UserType.ADMIN) {
			throw new UserException("Only administrators can delete users accounts");
		}
		final User user = bimDatabaseSession.getUserById(uid);
		if (user.getUserType() == UserType.ADMIN || user.getUserType() == UserType.ANONYMOUS) {
			throw new UserException("Cannot delete this user");
		}
		user.setState(ObjectState.DELETED);
		bimDatabaseSession.store(user, new CommitSet(Database.STORE_PROJECT_ID, -1));
		return true;
	}
}