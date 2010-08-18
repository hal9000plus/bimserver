package org.bimserver.database.actions;

import java.util.Map;

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

public class DownloadProjectsDatabaseAction extends BimDatabaseAction<EmfModel<Long>> {

	private final Map<Integer, Integer> pids;
	private final int uid;

	public DownloadProjectsDatabaseAction(Map<Integer, Integer> pids, int uid) {
		this.pids = pids;
		this.uid = uid;
	}

	@Override
	public EmfModel<Long> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		User user = bimDatabaseSession.getUserById(uid);
		EmfModel<Long> emfModel = new BasicEmfModel<Long>();
		String projectName = "";
		for (int pid : pids.keySet()) {
			Project project = bimDatabaseSession.getProjectById(pid);
			if (RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project)) {
				VirtualRevision revision = bimDatabaseSession.getVirtualRevision(pid, pids.get(pid));
				for (ConcreteRevision concreteRevision : revision.getRevisions()) {
					Map<Long, EObject> map = bimDatabaseSession.getMap(concreteRevision.getProject().getId(), concreteRevision.getId());
					projectName += concreteRevision.getProject().getName() + "-";
					merge(emfModel, new BasicEmfModel<Long>(map));
				}
			} else {
				throw new UserException("User has no rights on project " + pid);
			}
		}
		if (projectName.endsWith("-")) {
			projectName = projectName.substring(0, projectName.length()-1);
		}
		emfModel.setProjectName(projectName);
		return emfModel;
	}
}