package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.shared.UserException;

public class UndeleteUserDatabaseAction extends BimDatabaseAction<Boolean> {

	private final int uid;

	public UndeleteUserDatabaseAction(int uid) {
		this.uid = uid;
	}

	@Override
	public Boolean execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		final User user = bimDatabaseSession.getUserById(uid);
		if (user.getUserType() == UserType.ADMIN || user.getUserType() == UserType.ANONYMOUS) {
			throw new UserException("Cannot undelete this user");
		}
		user.setState(ObjectState.ACTIVE);
		bimDatabaseSession.store(user, new CommitSet(Database.STORE_PROJECT_ID, -1));
		return true;
	}
}