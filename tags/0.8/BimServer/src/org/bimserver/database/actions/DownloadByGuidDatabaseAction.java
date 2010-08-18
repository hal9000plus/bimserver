package org.bimserver.database.actions;

import java.util.Map;

import org.bimserver.BimDatabaseAction;
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

public class DownloadByGuidDatabaseAction extends BimDatabaseAction<EmfModel<Long>> {

	private final int pid;
	private final int rid;
	private final String guid;
	private final int uid;

	public DownloadByGuidDatabaseAction(int pid, int rid, String guid, int uid) {
		this.pid = pid;
		this.rid = rid;
		this.guid = guid;
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
		boolean guidFound = false;
		for (ConcreteRevision concreteRevision : virtualRevision.getRevisions()) {
			long oidOfGuid = bimDatabaseSession.getOidOfGuid(guid, concreteRevision.getProject().getId(), concreteRevision.getId());
			if (oidOfGuid != -1) {
				guidFound = true;
				Map<Long, EObject> mapWithOid = bimDatabaseSession.getMapWithOid(concreteRevision.getProject().getId(), concreteRevision.getId(), oidOfGuid);
				merge(emfModel, new BasicEmfModel<Long>(mapWithOid));
			}
		}
		if (!guidFound) {
			throw new UserException("Guid " + guid + " not found");
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