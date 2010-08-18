package org.bimserver;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.GeoTag;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.StoreFactory;
import org.bimserver.shared.SGeoTag;
import org.bimserver.shared.UserException;

public class UpdateProjectDatabaseAction extends BimDatabaseAction<Void> {

	private final int pid;
	private final String description;
	private final SGeoTag geoTag;

	public UpdateProjectDatabaseAction(int pid, String description, SGeoTag geoTag) {
		this.pid = pid;
		this.description = description;
		this.geoTag = geoTag;
	}

	@Override
	public Void execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		final Project project = bimDatabaseSession.getProjectById(pid);
		if (this.geoTag != null) {
			GeoTag geoTag = null;
			if (project.getGeoTag() == null) {
				geoTag = StoreFactory.eINSTANCE.createGeoTag();
				project.setGeoTag(geoTag);
			} else {
				geoTag = project.getGeoTag();
			}
			geoTag.setX1(this.geoTag.getX1());
			geoTag.setY1(this.geoTag.getY1());
			geoTag.setZ1(this.geoTag.getZ1());
			geoTag.setX2(this.geoTag.getX2());
			geoTag.setY2(this.geoTag.getY2());
			geoTag.setZ2(this.geoTag.getZ2());
			geoTag.setEpsg(this.geoTag.getEpsg());
			bimDatabaseSession.store(geoTag, new CommitSet(Database.STORE_PROJECT_ID, -1));
		} else {
			project.setGeoTag(null);
		}
		project.setDescription(description);
		bimDatabaseSession.store(project, new CommitSet(Database.STORE_PROJECT_ID, -1));
		bimDatabaseSession.savePidCounter();
		bimDatabaseSession.saveOidCounter();
		return null;
	}
}