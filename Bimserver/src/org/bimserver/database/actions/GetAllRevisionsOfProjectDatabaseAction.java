package org.bimserver.database.actions;

import java.util.HashSet;
import java.util.Set;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.shared.UserException;

public class GetAllRevisionsOfProjectDatabaseAction extends BimDatabaseAction<Set<VirtualRevision>> {

	private final int pid;

	public GetAllRevisionsOfProjectDatabaseAction(int pid) {
		this.pid = pid;
	}

	@Override
	public Set<VirtualRevision> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Project project = bimDatabaseSession.getProjectById(pid);
		return new HashSet<VirtualRevision>(project.getVirtualRevisions());
	}
}