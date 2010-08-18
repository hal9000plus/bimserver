package org.bimserver.database.actions;

import java.util.HashSet;
import java.util.Set;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.User;
import org.bimserver.shared.UserException;
import org.eclipse.emf.common.util.EList;

public class GetAllAuthorizedUsersOfProjectDatabaseAction extends BimDatabaseAction<Set<User>>{

	private final int pid;

	public GetAllAuthorizedUsersOfProjectDatabaseAction(int pid) {
		this.pid = pid;
	}
	
	@Override
	public Set<User> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		EList<User> users = bimDatabaseSession.getProjectById(pid).getHasAuthorizedUsers();
		return new HashSet<User>(users);
	}
}