package org.bimserver.database.actions;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.shared.UserException;

public class GetLastRevisionDatabaseAction extends BimDatabaseAction<VirtualRevision> {

	private final int pid;

	public GetLastRevisionDatabaseAction(int pid) {
		this.pid = pid;
	}

	@Override
	public VirtualRevision execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Project project = bimDatabaseSession.getProjectById(pid);
		if (project != null) {
			return project.getLastVirtualRevision();
		} else {
			throw new UserException("There is no project with id " + pid);
		}
	}
}