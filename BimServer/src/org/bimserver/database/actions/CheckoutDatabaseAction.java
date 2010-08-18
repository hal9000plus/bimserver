package org.bimserver.database.actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.StoreFactory;
import org.bimserver.database.store.User;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.shared.UserException;

public class CheckoutDatabaseAction extends BimDatabaseAction<EmfModel<Long>> {

	private final int rid;
	private final int pid;
	private final int uid;

	public CheckoutDatabaseAction(int pid, int uid, int rid) {
		this.pid = pid;
		this.uid = uid;
		this.rid = rid;
	}

	@Override
	public EmfModel<Long> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		User user = bimDatabaseSession.getUserById(uid);
		Project project = bimDatabaseSession.getProjectById(pid);
		if (user.getHasRightsOn().contains(project)) {
			VirtualRevision revision = bimDatabaseSession.getVirtualRevision(pid, rid);
			for (Checkout checkout : revision.getCheckouts()) {
				if (checkout.getRevision() == revision && checkout.getUser() == user && checkout.isActive()) {
					throw new UserException("This revision has already been checked out by you on " + dateFormat.format(checkout.getDate()));
				}
			}
			for (Checkout checkout : project.getCheckouts()) {
				if (checkout.getUser() == user && checkout.isActive()) {
					checkout.setActive(false);
					Checkout newCheckout = StoreFactory.eINSTANCE.createCheckout();
					newCheckout.setActive(true);
					newCheckout.setDate(new Date());
					newCheckout.setUser(user);
					newCheckout.setProject(project);
					newCheckout.setRevision(revision);
					bimDatabaseSession.store(checkout, new CommitSet(Database.STORE_PROJECT_ID, -1));
					bimDatabaseSession.store(newCheckout, new CommitSet(Database.STORE_PROJECT_ID, -1));
					bimDatabaseSession.saveOidCounter();
					return realCheckout(project, revision, bimDatabaseSession, user);
				}
			}
			Checkout checkout = StoreFactory.eINSTANCE.createCheckout();
			checkout.setActive(true);
			checkout.setDate(new Date());
			checkout.setUser(user);
			checkout.setProject(project);
			checkout.setRevision(revision);
			bimDatabaseSession.store(checkout, new CommitSet(Database.STORE_PROJECT_ID, -1));
			bimDatabaseSession.saveOidCounter();
			return realCheckout(project, revision, bimDatabaseSession, user);
		} else {
			throw new UserException("Insufficient rights to checkout this project");
		}
	}

	private EmfModel<Long> realCheckout(Project project, VirtualRevision revision, BimDatabaseSession bimDatabaseSession, User user) throws BimDeadlockException, BimDatabaseException {
		EmfModel<Long> emfModel = new BasicEmfModel<Long>(bimDatabaseSession.getMap(pid, rid));
		emfModel.setProjectName(project.getName());
		emfModel.setRevisionNr(revision.getId());
		emfModel.setAuthor(revision.getLastRevision().getUser().getName());
		emfModel.setAuthorizedUser(user.getName());
		emfModel.setDate(new Date());
		emfModel.setDescription(project.getDescription());
		return emfModel;
	}
}