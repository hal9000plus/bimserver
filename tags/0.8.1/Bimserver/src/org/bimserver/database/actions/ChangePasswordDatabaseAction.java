package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.shared.UserException;
import org.bimserver.utils.Hashers;

public class ChangePasswordDatabaseAction extends BimDatabaseAction<Boolean> {

	private final int uid;
	private final String oldPassword;
	private final String newPassword;
	private final int actingUid;

	public ChangePasswordDatabaseAction(int uid, String oldPassword, String newPassword, int actingUid) {
		this.uid = uid;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.actingUid = actingUid;
	}

	@Override
	public Boolean execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		if (uid == actingUid) {
			return changePassword(bimDatabaseSession, false);
		} else {
			User actingUser = bimDatabaseSession.getUserById(actingUid);
			if (actingUser.getUserType() == UserType.ADMIN) {
				return changePassword(bimDatabaseSession, true);
			} else {
				throw new UserException("Insufficient rights to change the password of this user");
			}
		}
	}

	private boolean changePassword(BimDatabaseSession bimDatabaseSession, boolean skipCheck) throws BimDeadlockException, BimDatabaseException, UserException {
		User user = bimDatabaseSession.getUserById(uid);
		if (skipCheck || Hashers.getSha256Hash(oldPassword).equals(user.getPassword())) {
			user.setPassword(Hashers.getSha256Hash(newPassword));
			bimDatabaseSession.store(user, new CommitSet(Database.STORE_PROJECT_ID, -1));
			return true;
		} else {
			throw new UserException("Old password does not match user's password");
		}
	}
}