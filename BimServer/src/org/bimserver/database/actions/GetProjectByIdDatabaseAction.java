package org.bimserver.database.actions;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.Database;
import org.bimserver.database.query.conditions.AttributeCondition;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.literals.IntegerLiteral;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;

public class GetProjectByIdDatabaseAction extends BimDatabaseAction<Project> {

	private final int pid;
	private final int uid;

	public GetProjectByIdDatabaseAction(int pid, int uid) {
		this.pid = pid;
		this.uid = uid;
	}

	@Override
	public Project execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getProject_Id(), new IntegerLiteral(pid));
		Project project = bimDatabaseSession.querySingle(Database.STORE_PROJECT_ID, -1, condition, Project.class);
		if (project == null) {
			throw new UserException("Project does not exist");
		}
		User user = bimDatabaseSession.getUserById(uid);
		if (project.getState() == ObjectState.DELETED && user.getUserType() != UserType.ADMIN) {
			throw new UserException("Project has been deleted");
		}
		if (RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project)) {
			return project;
		} else {
			throw new UserException("User '" + user.getUsername() + "' has no rights on this project");
		}
	}
}