package org.bimserver.database.actions;

import java.util.Date;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.GeoTag;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.StoreFactory;
import org.bimserver.database.store.User;
import org.bimserver.shared.SGeoTag;
import org.bimserver.shared.UserException;

public class AddProjectDatabaseAction extends BimDatabaseAction<Integer> {

	private final String name;
	private final int owningUid;
	private final SGeoTag geoTag;
	private final int parentProjectId;

	public AddProjectDatabaseAction(String name, int owningUid, SGeoTag geoTag) {
		this(name, -1, owningUid, geoTag);
	}

	public AddProjectDatabaseAction(String projectName, int parentProjectId, int owningUid, SGeoTag geoTag) {
		this.name = projectName;
		this.owningUid = owningUid;
		this.geoTag = geoTag;
		this.parentProjectId = parentProjectId;
	}

	@Override
	public Integer execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		if (name == null || name.trim().equals("")) {
			throw new UserException("Invalid project name");
		}
		if (bimDatabaseSession.getProjectByName(name) != null) {
			throw new UserException("A project with the name " + name + " already exists");
		}
		final Project project = StoreFactory.eINSTANCE.createProject();
		if (geoTag != null) {
			final GeoTag geoTag = StoreFactory.eINSTANCE.createGeoTag();
			geoTag.setX1(this.geoTag.getX1());
			geoTag.setY1(this.geoTag.getY1());
			geoTag.setZ1(this.geoTag.getZ1());
			geoTag.setX2(this.geoTag.getX2());
			geoTag.setY2(this.geoTag.getY2());
			geoTag.setZ2(this.geoTag.getZ2());
			geoTag.setEpsg(this.geoTag.getEpsg());
			project.setGeoTag(geoTag);
		}
		final int pid = bimDatabaseSession.newPid();
		User user = bimDatabaseSession.getUserById(owningUid);
		if (parentProjectId != -1) {
			project.setParent(bimDatabaseSession.getProjectById(parentProjectId));
		}
		project.setId(pid);
		project.setName(name);
		project.getHasAuthorizedUsers().add(bimDatabaseSession.getAdminUser());
		project.getHasAuthorizedUsers().add(user);
		project.setCreatedBy(user);
		project.setCreatedDate(new Date());
		bimDatabaseSession.store(project, new CommitSet(Database.STORE_PROJECT_ID, -1));
		bimDatabaseSession.savePidCounter();
		bimDatabaseSession.saveOidCounter();
		return pid;
	}
}