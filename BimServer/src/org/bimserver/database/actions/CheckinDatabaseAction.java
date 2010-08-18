package org.bimserver.database.actions;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.emf.EmfModel;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;

public class CheckinDatabaseAction extends BimDatabaseAction<ConcreteRevision> {

	private final String comment;
	private final int pid;
	private final int uid;
	private final EmfModel<Long> emfModel;

	public CheckinDatabaseAction(EmfModel<Long> emfModel, int pid, int uid, String comment) {
		this.emfModel = emfModel;
		this.pid = pid;
		this.uid = uid;
		this.comment = comment;
	}

	@Override
	public ConcreteRevision execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		Project project = bimDatabaseSession.getProjectById(pid);
		if (project == null) {
			throw new UserException("Project with pid " + pid + " not found");
		}
		if (!RightsManager.hasRightsOnProjectOrSuperProjects(bimDatabaseSession.getUserById(uid), project)) {
			throw new UserException("User has no rights to checkin models to this project");
		}
		ConcreteRevision revision = bimDatabaseSession.createNewRevision(emfModel.size(), pid, uid, comment);
		if (revision.getId() != 1) {
			// There already was a revision, lets go delete em
			bimDatabaseSession.clearProject(pid, revision.getId() - 1, revision.getId());
		}
		bimDatabaseSession.store(emfModel.getValues(), pid, revision.getId());
		bimDatabaseSession.store(revision, new CommitSet(Database.STORE_PROJECT_ID, -1));
		bimDatabaseSession.saveOidCounter();
		return revision;
	}
}