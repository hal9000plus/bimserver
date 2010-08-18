package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.Database;
import org.bimserver.database.query.conditions.AttributeCondition;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.conditions.HasReferenceToCondition;
import org.bimserver.database.query.literals.IntegerLiteral;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.User;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;

public class GetRevisionDatabaseAction extends BimDatabaseAction<VirtualRevision> {

	private final int pid;
	private final int rid;
	private final int uid;

	public GetRevisionDatabaseAction(int pid, int rid, int uid) {
		this.pid = pid;
		this.rid = rid;
		this.uid = uid;
	}

	@Override
	public VirtualRevision execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Project project = bimDatabaseSession.getProjectById(pid);
		User user = bimDatabaseSession.getUserById(uid);
		if (RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project)) {
			Condition revisionNrCondition = new AttributeCondition(StorePackage.eINSTANCE.getRevision_Id(), new IntegerLiteral(rid));
			Condition projectLinkCondition = new HasReferenceToCondition(StorePackage.eINSTANCE.getVirtualRevision_Project(), project);
			VirtualRevision revision = bimDatabaseSession.querySingle(Database.STORE_PROJECT_ID, -1, revisionNrCondition.and(projectLinkCondition), VirtualRevision.class);
			if (revision == null) {
				throw new UserException("Revision does not exist");
			}
			return revision;
		}
		throw new UserException("User has no rights on this revision's project");
	}
}