package org.bimserver.database.actions;

import java.util.Map;
import java.util.Set;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.Database;
import org.bimserver.database.query.conditions.AttributeCondition;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.conditions.HasReferenceToCondition;
import org.bimserver.database.query.conditions.IsOfTypeCondition;
import org.bimserver.database.query.conditions.Not;
import org.bimserver.database.query.literals.EnumLiteral;
import org.bimserver.database.query.literals.StringLiteral;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.database.store.log.AccessMethod;
import org.bimserver.shared.UserException;
import org.bimserver.utils.CollectionUtils;

public class GetAllProjectsDatabaseAction extends BimDatabaseAction<Set<Project>> {

	private final long actingUoid;

	public GetAllProjectsDatabaseAction(AccessMethod accessMethod, long actingUoid) {
		super(accessMethod);
		this.actingUoid = actingUoid;
	}

	@Override
	public Set<Project> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		User user = bimDatabaseSession.getUserByUoid(actingUoid);
		Condition condition = new IsOfTypeCondition(StorePackage.eINSTANCE.getProject()).and(
				new Not(new AttributeCondition(StorePackage.eINSTANCE.getProject_Name(), new StringLiteral(Database.STORE_PROJECT_NAME)))).and(
				new HasReferenceToCondition(StorePackage.eINSTANCE.getProject_HasAuthorizedUsers(), user));
		if (user.getUserType() != UserType.ADMIN) {
			condition = condition.and(new AttributeCondition(StorePackage.eINSTANCE.getProject_State(), new EnumLiteral(ObjectState.ACTIVE)));
		}
		Map<Long, Project> results = (Map<Long, Project>) bimDatabaseSession.query(condition, Project.class);
		Set<Project> resultSet = CollectionUtils.mapToSet(results);
		for (Project project : results.values()) {
			addParentProjects(resultSet, project);
		}
		return resultSet;
	}

	private void addParentProjects(Set<Project> resultSet, Project project) {
		if (project.getParent() != null) {
			if (!resultSet.contains(project.getParent())) {
				resultSet.add(project.getParent());
			}
			addParentProjects(resultSet, project.getParent());
		}
	}
}