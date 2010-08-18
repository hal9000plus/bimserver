package org.bimserver.database.actions;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.shared.UserException;

public class GetProjectsOfUserDatabaseAction extends BimDatabaseAction<List<Project>>{

	private final int uid;

	public GetProjectsOfUserDatabaseAction(int uid) {
		this.uid = uid;
	}

	@Override
	public List<Project> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		User user = bimDatabaseSession.getUserById(uid);
		if (user != null) {
			List<Project> result = new ArrayList<Project>();
			for (Project project : user.getHasRightsOn()) {
				if (project.getState() == ObjectState.ACTIVE || user.getUserType() == UserType.ADMIN) {
					result.add(project);
				}
			}
			return result;
		} else {
			throw new UserException("User with id " + uid + " does not exist");
		}
	}
}