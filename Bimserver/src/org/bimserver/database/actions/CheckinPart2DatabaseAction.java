package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.emf.EmfModel;
import org.bimserver.shared.UserException;

public class CheckinPart2DatabaseAction extends BimDatabaseAction<Void> {

	private final EmfModel<Long> emfModel;
	private final int rid;
	private final int pid;

	public CheckinPart2DatabaseAction(EmfModel<Long> emfModel, int pid, int rid) {
		this.emfModel = emfModel;
		this.pid = pid;
		this.rid = rid;
	}

	@Override
	public Void execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		ConcreteRevision revision = bimDatabaseSession.getRevision(pid, rid);
		revision.setSize(emfModel.size());
		revision.setFinalized(true);
		if (revision.getId() != 1) {
			// There already was a revision, lets go delete em
			bimDatabaseSession.clearProject(pid, revision.getId() - 1, revision.getId());
		}
		revision.getProject().setLastConcreteRevision(revision);
		bimDatabaseSession.store(emfModel.getValues(), revision.getProject().getId(), revision.getId());
		bimDatabaseSession.store(revision, new CommitSet(Database.STORE_PROJECT_ID, -1));
		bimDatabaseSession.saveOidCounter();
		return null;
	}
}