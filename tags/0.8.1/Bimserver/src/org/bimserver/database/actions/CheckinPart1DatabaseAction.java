package org.bimserver.database.actions;

import java.util.Arrays;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.emf.EmfModel;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;

public class CheckinPart1DatabaseAction extends BimDatabaseAction<ConcreteRevision> {

	private final int pid;
	private final int uid;
	private final String comment;
	private final EmfModel<Long> model;

	public CheckinPart1DatabaseAction(int pid, int uid, EmfModel<Long> model, String comment) {
		this.pid = pid;
		this.uid = uid;
		this.model = model;
		this.comment = comment;
	}

	@Override
	public ConcreteRevision execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Project project = bimDatabaseSession.getProjectById(pid);
		User user = bimDatabaseSession.getUserById(uid);
		if (project == null) {
			throw new UserException("Project with pid " + pid + " not found");
		}
		if (user.getUserType() == UserType.ANONYMOUS) {
			throw new UserException("User anonymous cannot create new revisions");
		}
		if (!RightsManager.hasRightsOnProjectOrSuperProjects(user, project)) {
			throw new UserException("User has no rights to checkin models to this project");
		}
		if (!project.getConcreteRevisions().isEmpty()) {
			ConcreteRevision concreteRevision = project.getConcreteRevisions().get(project.getConcreteRevisions().size()-1);
			byte[] revisionChecksum = concreteRevision.getChecksum();
			if (Arrays.equals(revisionChecksum, model.getChecksum())) {
				throw new UserException("Uploaded model is the same as last revision (" + concreteRevision.getId() + "), duplicate model not stored");
			}
		}
		ConcreteRevision revision = bimDatabaseSession.createNewRevision(-1, pid, uid, comment);
		revision.setChecksum(model.getChecksum());
		revision.setFinalized(false);
		bimDatabaseSession.store(revision, new CommitSet(Database.STORE_PROJECT_ID, -1));
		bimDatabaseSession.saveOidCounter();
		return revision;
	}
}