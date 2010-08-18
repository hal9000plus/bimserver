package org.bimserver.database.actions;

import java.util.Map;
import java.util.TreeMap;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.UserException;
import org.eclipse.emf.ecore.EObject;

public class DownloadOfTypeDatabaseAction extends BimDatabaseAction<EmfModel<Long>> {

	private final String className;
	private final int rid;
	private final int pid;
	private final int uid;

	public DownloadOfTypeDatabaseAction(int pid, int rid, String className, int uid) {
		this.pid = pid;
		this.rid = rid;
		this.className = className;
		this.uid = uid;
	}

	@Override
	public EmfModel<Long> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Project project = bimDatabaseSession.getProjectById(pid);
		User user = bimDatabaseSession.getUserById(uid);
		if (!RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project)) {
			throw new UserException("User has insufficient rights to download revisions from this project");
		}
		VirtualRevision virtualRevision = bimDatabaseSession.getVirtualRevision(pid, rid);
		EmfModel<Long> emfModel = new BasicEmfModel<Long>(getSize(virtualRevision));
		for (ConcreteRevision concreteRevision : virtualRevision.getRevisions()) {
			Map<Long, EObject> mapResult = new TreeMap<Long, EObject>();
			bimDatabaseSession.getAllOfType(className, concreteRevision.getProject().getId(), concreteRevision.getId(), mapResult);
			merge(emfModel, new BasicEmfModel<Long>(mapResult));
		}
		emfModel.setProjectName(virtualRevision.getProject().getName());
		emfModel.setRevisionNr(virtualRevision.getId());
		emfModel.setAuthor(virtualRevision.getLastRevision().getUser().getName());
		emfModel.setAuthorizedUser(bimDatabaseSession.getUserById(uid).getName());
		emfModel.setDate(virtualRevision.getLastRevision().getDate());
		emfModel.setDescription(virtualRevision.getProject().getDescription());
		return emfModel;
	}
}