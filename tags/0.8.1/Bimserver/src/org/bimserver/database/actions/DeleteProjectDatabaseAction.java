package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.Project;
import org.bimserver.shared.UserException;

public class DeleteProjectDatabaseAction extends BimDatabaseAction<Boolean> {

	private final int pid;

	public DeleteProjectDatabaseAction(int pid) {
		this.pid = pid;
	}

	@Override
	public Boolean execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		final Project project = bimDatabaseSession.getProjectById(pid);
		project.setState(ObjectState.DELETED);
		bimDatabaseSession.store(project, new CommitSet(Database.STORE_PROJECT_ID, -1));
		return true;
	}
}