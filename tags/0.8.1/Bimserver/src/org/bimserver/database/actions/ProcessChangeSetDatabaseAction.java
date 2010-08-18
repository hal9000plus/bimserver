package org.bimserver.database.actions;

import java.util.HashMap;
import java.util.Map;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.ReadSet;
import org.bimserver.database.RecordIdentifier;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.shared.AbstractAttributeValuePair;
import org.bimserver.shared.Addition;
import org.bimserver.shared.AttributeNewReferencePair;
import org.bimserver.shared.AttributeReferencePair;
import org.bimserver.shared.AttributeValuePair;
import org.bimserver.shared.ChangeSet;
import org.bimserver.shared.ChangeSetResult;
import org.bimserver.shared.Modification;
import org.bimserver.shared.UserException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class ProcessChangeSetDatabaseAction extends BimDatabaseAction<ChangeSetResult> {

	private final ChangeSet changeSet;
	private final int pid;
	private final int uid;
	private final String comment;

	public ProcessChangeSetDatabaseAction(ChangeSet changeSet, int pid, int uid, String comment) {
		this.changeSet = changeSet;
		this.pid = pid;
		this.uid = uid;
		this.comment = comment;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ChangeSetResult execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		final ChangeSetResult changeSetResult = new ChangeSetResult();
		final Project project = bimDatabaseSession.getProjectById(pid);
		if (project.getLastConcreteRevision() == null) {
			throw new UserException("There must be at least 1 revision to use changesets");
		}
		ConcreteRevision oldRevision = project.getLastConcreteRevision();
		ConcreteRevision newRevision = bimDatabaseSession.createNewRevision(0, pid, uid, comment);
		changeSetResult.setNewRevisionNr(newRevision.getId());
		final CommitSet commitSet = new CommitSet(pid, newRevision.getId());
		Map<Long, EObject> map = bimDatabaseSession.getMap(pid, oldRevision.getId());
		Map<Long, EObject> processedAdditions = new HashMap<Long, EObject>();
		long newSize = oldRevision.getSize();
		for (Addition addition : changeSet.getAdditions()) {
			EClass classForName = bimDatabaseSession.getEClassForName(addition.getClassName());
			EObject object = classForName.getEPackage().getEFactoryInstance().create(classForName);
			processedAdditions.put(addition.getOid(), object);
		}
		for (Addition addition : changeSet.getAdditions()) {
			bimDatabaseSession.convertAdditionToEObject(processedAdditions.get(addition.getOid()), addition, processedAdditions, map);
			newSize++;
		}
		for (Long key : processedAdditions.keySet()) {
			bimDatabaseSession.store(processedAdditions.get(key), commitSet);
		}
		if (project.getLastConcreteRevision() != null) {
			ReadSet readSet = new ReadSet(pid, oldRevision.getId());
			for (Modification modification : changeSet.getModifications()) {
				String className = modification.getClassName();
				long oid = modification.getOid();
				EObject originalObject = bimDatabaseSession.get(bimDatabaseSession.getCidForClassName(className), oid, readSet, new HashMap<Long, EObject>());
				EObject object = EcoreUtil.copy(originalObject);
				// Put this copy in the cache, so saving it later on
				// won't
				// create a
				// new oid
				bimDatabaseSession.put(new RecordIdentifier(commitSet.getPid(), bimDatabaseSession.getOid(originalObject), commitSet.getRid()), object);
				for (AbstractAttributeValuePair aavp : modification.getAttributes()) {
					EStructuralFeature feature = object.eClass().getEStructuralFeature(aavp.getName());
					if (aavp instanceof AttributeValuePair) {
						Object value = ((AttributeValuePair) aavp).getValue();
						if (value != null) {
							if (feature.getEType() instanceof EClass) {
								EStructuralFeature structuralFeature = ((EClass) feature.getEType()).getEStructuralFeature(Database.WRAPPED_VALUE);
								if (structuralFeature != null) {
									Object convert = bimDatabaseSession.convert(feature.getEType(), value.toString());
									object.eSet(feature, convert);
								} else {
									object.eSet(feature, value);
								}
							}
						}
					} else if (aavp instanceof AttributeNewReferencePair) {
						if (feature.getUpperBound() == -1) {
							EList<EObject> eList = (EList<EObject>) object.eGet(feature);
							eList.add(processedAdditions.get(((AttributeNewReferencePair) aavp).getOid()));
						} else {
							object.eSet(feature, processedAdditions.get(((AttributeNewReferencePair) aavp).getOid()));
						}
					} else if (aavp instanceof AttributeReferencePair) {
						AttributeReferencePair attributeReferencePair = (AttributeReferencePair) aavp;
						Map<Long, EObject> mapWithOid = bimDatabaseSession.getMapWithOid(pid, project.getLastConcreteRevision().getId(), attributeReferencePair.getOid());
						object.eSet(feature, mapWithOid.get(attributeReferencePair.getOid()));
					}
				}
				bimDatabaseSession.store(object, commitSet);
			}
		}
		newRevision.setSize(newSize);
		bimDatabaseSession.store(newRevision, new CommitSet(Database.STORE_PROJECT_ID, -1));
		return changeSetResult;
	}
}