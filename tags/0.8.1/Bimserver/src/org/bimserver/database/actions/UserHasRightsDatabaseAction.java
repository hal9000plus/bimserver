package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;

public class UserHasRightsDatabaseAction extends BimDatabaseAction<Boolean> {

	private final int uid;
	private final int pid;

	public UserHasRightsDatabaseAction(int uid, int pid) {
		this.uid = uid;
		this.pid = pid;
	}

	@Override
	public Boolean execute(BimDatabaseSession bimDatabaseSession)
			throws UserException, BimDeadlockException, BimDatabaseException {
		Project project = bimDatabaseSession.getProjectById(pid);
		User user = bimDatabaseSession.getUserById(uid);
		return RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project);
	}
}