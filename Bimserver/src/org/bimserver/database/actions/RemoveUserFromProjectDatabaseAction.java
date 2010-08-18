package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.shared.UserException;

public class RemoveUserFromProjectDatabaseAction extends BimDatabaseAction<Boolean> {

	private final int uid;
	private final int pid;
	private final int actingUid;

	public RemoveUserFromProjectDatabaseAction(int uid, int pid, int actingUid) {
		this.uid = uid;
		this.pid = pid;
		this.actingUid = actingUid;
	}

	@Override
	public Boolean execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		Project project = bimDatabaseSession.getProjectById(pid);
		User user = bimDatabaseSession.getUserById(uid);
		User actingUser = bimDatabaseSession.getUserById(actingUid);
		if (actingUser.getUserType() == UserType.ADMIN || project.getHasAuthorizedUsers().contains(actingUser)) {
			project.getHasAuthorizedUsers().remove(user);
			user.getHasRightsOn().remove(project);
			bimDatabaseSession.store(user, new CommitSet(Database.STORE_PROJECT_ID, -1));
			bimDatabaseSession.store(project, new CommitSet(Database.STORE_PROJECT_ID, -1));
			return true;
		} else {
			throw new UserException("Insufficient rights to remove user from project");
		}
	}
}
