package org.bimserver.database.actions;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;

public class UserHasCheckinRightsDatabaseAction extends BimDatabaseAction<Boolean> {

	private final int uid;
	private final int pid;

	public UserHasCheckinRightsDatabaseAction(int uid, int pid) {
		this.uid = uid;
		this.pid = pid;
	}

	@Override
	public Boolean execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		return RightsManager.hasRightsOnProject(bimDatabaseSession.getUserById(uid), bimDatabaseSession.getProjectById(pid));
	}
}