package org.bimserver.database.actions;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.ReadSet;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.shared.SRevisionSummary;
import org.bimserver.shared.UserException;
import org.eclipse.emf.ecore.EClass;

public class GetRevisionSummaryDatabaseAction extends BimDatabaseAction<SRevisionSummary> {

	private final int pid;
	private final int rid;

	public GetRevisionSummaryDatabaseAction(int pid, int rid) {
		this.pid = pid;
		this.rid = rid;
	}

	@Override
	public SRevisionSummary execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		SRevisionSummary revisionSummary = new SRevisionSummary();
		VirtualRevision revision = bimDatabaseSession.getVirtualRevision(pid, rid);
		for (ConcreteRevision subRevision : revision.getRevisions()) {
			for (EClass eClass : bimDatabaseSession.getClasses()) {
				int count = bimDatabaseSession.getCount(eClass, new ReadSet(subRevision.getProject().getId(), subRevision.getId()));
				revisionSummary.add(eClass, count);
			}
		}
		return revisionSummary;
	}
}