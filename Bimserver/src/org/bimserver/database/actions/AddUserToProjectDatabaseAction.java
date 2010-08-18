package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;

public class AddUserToProjectDatabaseAction extends BimDatabaseAction<Boolean> {

	private final int pid;
	private final int uid;
	private final int actingUid;

	public AddUserToProjectDatabaseAction(int actingUid, int uid, int pid) {
		this.actingUid = actingUid;
		this.uid = uid;
		this.pid = pid;
	}

	@Override
	public Boolean execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		final Project project = bimDatabaseSession.getProjectById(pid);
		User user = bimDatabaseSession.getUserById(actingUid);
		if (RightsManager.hasRightsOnProject(user, project) || user.getUserType() == UserType.ADMIN) {
			project.getHasAuthorizedUsers().add(bimDatabaseSession.getUserById(uid));
			bimDatabaseSession.store(project, new CommitSet(Database.STORE_PROJECT_ID, -1));
			return true;
		} else {
			throw new UserException("User has no rights to grant permission on '" + project.getName() + "'");
		}
	}
}