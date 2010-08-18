package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.shared.UserException;

public class GetShowCheckoutWarningDatabaseAction extends BimDatabaseAction<Checkout> {

	private final int pid;
	private final int uid;

	public GetShowCheckoutWarningDatabaseAction(int pid, int uid) {
		this.pid = pid;
		this.uid = uid;
	}

	@Override
	public Checkout execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Project project = bimDatabaseSession.getProjectById(pid);
		User user = bimDatabaseSession.getUserById(uid);
		Checkout lastCheckout = null;
		for (Checkout checkout : project.getCheckouts()) {
			if (checkout.getUser() == user && checkout.isActive()) {
				lastCheckout = checkout;
			}
		}
		if (lastCheckout != null) {
			Project mainProject = project;
			while (mainProject.getParent() != null) {
				mainProject = mainProject.getParent();
			}
			for (VirtualRevision virtualRevision : mainProject.getVirtualRevisions()) {
				if (lastCheckout.getRevision().getLastRevision().getDate().before(virtualRevision.getLastRevision().getDate())) {
					return lastCheckout;
				}
			}
		}
		return null;
	}
}