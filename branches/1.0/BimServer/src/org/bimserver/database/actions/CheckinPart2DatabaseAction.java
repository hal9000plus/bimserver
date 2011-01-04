package org.bimserver.database.actions;

import java.util.Date;
import java.util.LinkedHashSet;

import org.bimserver.Merger;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.CheckinState;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.Revision;
import org.bimserver.database.store.log.AccessMethod;
import org.bimserver.ifc.IfcModel;
import org.bimserver.shared.UserException;

public class CheckinPart2DatabaseAction extends BimDatabaseAction<Void> {

	private final IfcModel ifcModel;
	private final long actingUoid;
	private final long croid;
	private final boolean merge;

	public CheckinPart2DatabaseAction(AccessMethod accessMethod, IfcModel ifcModel, long actingUoid, long croid, boolean merge) {
		super(accessMethod);
		this.ifcModel = ifcModel;
		this.actingUoid = actingUoid;
		this.croid = croid;
		this.merge = merge;
	}

	@Override
	public Void execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		ConcreteRevision concreteRevision = bimDatabaseSession.getConcreteRevision(croid);
		try {
			Project project = concreteRevision.getProject();
			Revision lastRevision = project.getLastRevision();
			IfcModel ifcModel = null;
			if (merge) {
				LinkedHashSet<IfcModel> ifcModels = new LinkedHashSet<IfcModel>();
				for (ConcreteRevision subRevision : lastRevision.getConcreteRevisions()) {
					IfcModel subModel = bimDatabaseSession.getMap(subRevision.getProject().getId(), subRevision.getId());
					subModel.setDate(subRevision.getDate());
					ifcModels.add(subModel);
				}
				getIfcModel().setDate(new Date());
				ifcModels.add(getIfcModel());
				ifcModel = Merger.merge(project, ifcModels);
			} else {
				ifcModel = getIfcModel();
			}
			if (project.getConcreteRevisions().size() != 0 && !merge) {
				// There already was a revision, lets delete it
				bimDatabaseSession.clearProject(project.getId(), concreteRevision.getId() - 1, concreteRevision.getId());
			}
			bimDatabaseSession.store(ifcModel.getValues(), project.getId(), concreteRevision.getId());
			for (Revision revision : concreteRevision.getRevisions()) {
				revision.setState(CheckinState.DONE);
				bimDatabaseSession.store(revision);
			}
			concreteRevision.setState(CheckinState.DONE);
			bimDatabaseSession.store(concreteRevision);
		} catch (Throwable e) {
			if (e instanceof BimDeadlockException) {
				// Let this one slide
				throw (BimDeadlockException)e;
			}
			for (Revision revision : concreteRevision.getRevisions()) {
				revision.setState(CheckinState.ERROR);
				revision.setLastError(e.getMessage());
			}
			throw new UserException(e);
		}
		return null;
	}

	public IfcModel getIfcModel() {
		return ifcModel;
	}

	public long getActingUid() {
		return actingUoid;
	}

	public long getCroid() {
		return croid;
	}
}