package org.bimserver.database.actions;

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

public class DownloadDatabaseAction extends BimDatabaseAction<EmfModel<Long>> {

	private final int pid;
	private final int rid;
	private final int uid;

	public DownloadDatabaseAction(int pid, int rid, int uid) {
		this.pid = pid;
		this.rid = rid;
		this.uid = uid;
	}

	@Override
	public EmfModel<Long> execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Project project = bimDatabaseSession.getProjectById(pid);
		User user = bimDatabaseSession.getUserById(uid);
		if (!RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project)) {
			throw new UserException("User has insufficient rights to download revisions from this project");
		}
		VirtualRevision revision = bimDatabaseSession.getVirtualRevision(pid, rid);
		EmfModel<Long> emfModel = new BasicEmfModel<Long>(getSize(revision));
		for (ConcreteRevision subRevision : revision.getRevisions()) {
			merge(emfModel, new BasicEmfModel<Long>(bimDatabaseSession.getMap(subRevision.getProject().getId(), subRevision.getId())));
		}
		emfModel.setProjectName(revision.getProject().getName());
		emfModel.setRevisionNr(revision.getId());
		emfModel.setAuthor(revision.getLastRevision().getUser().getName());
		emfModel.setAuthorizedUser(bimDatabaseSession.getUserById(uid).getName());
		emfModel.setDate(revision.getLastRevision().getDate());
		emfModel.setDescription(revision.getProject().getDescription());
		
		if (revision.getProject().getGeoTag() != null) {
			emfModel.setLon(revision.getProject().getGeoTag().getX1());
			emfModel.setLat(revision.getProject().getGeoTag().getY1());
			emfModel.setAltitude((int)revision.getProject().getGeoTag().getZ1());
//			try {
//				CoordinateReferenceSystem sourceCRS = CRS.decode("EPSG:" + revision.getProject().getGeoTag().getEpsg());
//				CoordinateReferenceSystem targetCRS = DefaultGeocentricCRS.CARTESIAN;
//				MathTransform transform = CRS.findMathTransform(sourceCRS, targetCRS, true);
//				float[] in = new float[]{revision.getProject().getGeoTag().getX1(), revision.getProject().getGeoTag().getY1(), revision.getProject().getGeoTag().getZ1()};
//				float[] result = new float[3];
//				transform.transform(in, 0, result, 0, 1);
//				emfModel.setLon(result[0]);
//				emfModel.setLat(result[1]);
//			} catch (NoSuchAuthorityCodeException e) {
//				e.printStackTrace();
//			} catch (FactoryException e) {
//				e.printStackTrace();
//			} catch (MismatchedDimensionException e) {
//				e.printStackTrace();
//			} catch (TransformException e) {
//				e.printStackTrace();
//			}
		}
		return emfModel;
	}
}