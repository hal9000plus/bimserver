package org.bimserver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bimserver.emf.IdEObject;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.TracingGarbageCollector;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Factory;
import org.bimserver.ifc.emf.Ifc2x3.IfcGloballyUniqueId;
import org.bimserver.ifc.emf.Ifc2x3.IfcProject;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoot;
import org.bimserver.ifc.emf.Ifc2x3.IfcUnitAssignment;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;

public class RevisionMerger {

	public IfcModel merge(IfcModel oldModel, IfcModel newModel) {
		copyAttributesGuidObjectsAndAddNewObjects(oldModel, newModel);
		updateReferences(oldModel, newModel);
		fixExplicitNullReferences(oldModel, newModel);
		fixNonGuidObjects(oldModel, newModel);
		TracingGarbageCollector tracingGarbageCollector = new TracingGarbageCollector(oldModel);
		Set<IdEObject> rootObjects = new HashSet<IdEObject>();
		for (IdEObject idEObject : oldModel.getValues()) {
			if (idEObject instanceof IfcProject) {
				rootObjects.add(idEObject);
			}
		}
		tracingGarbageCollector.mark(rootObjects);
		tracingGarbageCollector.sweep();
		return oldModel;
	}

	private void fixNonGuidObjects(IfcModel oldModel, IfcModel newModel) {
		for (IdEObject idEObject : newModel.getValues()) {
			if (idEObject instanceof IfcRoot) {
				String guid = ((IfcRoot) idEObject).getGlobalId().getWrappedValue();
				for (EReference eReference : idEObject.eClass().getEAllReferences()) {
					Object referencedObject = idEObject.eGet(eReference);
					if (eReference.isMany()) {
						List list = (List) referencedObject;
						for (Object o : list) {
							if (!(o instanceof IfcRoot) && !(o instanceof IfcGloballyUniqueId)) {
								IdEObject referencedIDEObject = (IdEObject) o;
								if (oldModel.containsKey(referencedIDEObject.getOid())) {
									((List)oldModel.get(guid).eGet(eReference)).add(oldModel.get(referencedIDEObject.getOid()));
								} else {
									IdEObject smartCopy = smartCopy(oldModel, newModel, referencedIDEObject);
									((List)oldModel.get(guid).eGet(eReference)).add(smartCopy);
									oldModel.add(smartCopy.getOid(), smartCopy);
								}
							}
						}
					} else {
						if (referencedObject == null) {
							oldModel.get(guid).eSet(eReference, null);
						} else {
							if (!(referencedObject instanceof IfcRoot) && !(referencedObject instanceof IfcGloballyUniqueId)) {
								IdEObject referencedIDEObject = (IdEObject) referencedObject;
								if (oldModel.containsKey(referencedIDEObject.getOid())) {
									oldModel.get(guid).eSet(eReference, oldModel.get(referencedIDEObject.getOid()));
								} else {
									IdEObject smartCopy = smartCopy(oldModel, newModel, referencedIDEObject);
									oldModel.get(guid).eSet(eReference, smartCopy);
									oldModel.add(smartCopy.getOid(), smartCopy);
								}
							}
						}
					}
				}
			}
		}
	}

	private IdEObject smartCopy(IfcModel oldModel, IfcModel newModel, IdEObject idEObject) {
		if (idEObject instanceof IfcUnitAssignment) {
			System.out.println();
		}
		IdEObject newObject = (IdEObject) idEObject.eClass().getEPackage().getEFactoryInstance().create(idEObject.eClass());
		newObject.setOid(idEObject.getOid());
		for (EAttribute eAttribute : newObject.eClass().getEAllAttributes()) {
			newObject.eSet(eAttribute, idEObject.eGet(eAttribute));
		}
		for (EReference eReference : newObject.eClass().getEAllReferences()) {
			
		}
		return newObject;
	}

	private void fixExplicitNullReferences(IfcModel oldModel, IfcModel newModel) {
		for (IdEObject idEObject : newModel.getValues()) {
			if (idEObject instanceof IfcRoot) {
				String guid = ((IfcRoot) idEObject).getGlobalId().getWrappedValue();
				for (EReference eReference : idEObject.eClass().getEAllReferences()) {
					if (eReference.isMany()) {
						List list = (List) idEObject.eGet(eReference);
						List oldList = (List) oldModel.get(guid).eGet(eReference);
						Set<Object> guidsToRemove = new HashSet<Object>();
						for (Object o : oldList) {
							if (o instanceof IfcRoot) {
								String referredGuid = ((IfcRoot) o).getGlobalId().getWrappedValue();
								if (newModel.containsGuid(referredGuid)) {
									boolean found = false;
									for (Object q : list) {
										if (q instanceof IfcRoot) {
											String qGuid = ((IfcRoot) q).getGlobalId().getWrappedValue();
											if (qGuid.equals(referredGuid)) {
												found = true;
												break;
											}
										}
									}
									if (!found) {
										guidsToRemove.add(referredGuid);
									}
								}
							}
						}
						if (!guidsToRemove.isEmpty()) {
							System.out.println("Removing list references");
							oldList.removeAll(guidsToRemove);
						}
					} else {
						if (idEObject.eGet(eReference) == null) {
							Object eGet = oldModel.get(guid).eGet(eReference);
							if (eGet != null) {
								if (eGet instanceof IfcRoot) {
									String oldGuid = ((IfcRoot) eGet).getGlobalId().getWrappedValue();
									if (newModel.containsGuid(oldGuid)) {
										System.out.println("Settings explicit null reference");
										oldModel.get(guid).eSet(eReference, null);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void updateReferences(IfcModel oldModel, IfcModel newModel) {
		for (IdEObject idEObject : newModel.getValues()) {
			if (idEObject instanceof IfcRoot) {
				String guid = ((IfcRoot) idEObject).getGlobalId().getWrappedValue();
				IfcRoot oldObject = oldModel.get(guid);
				for (EReference eReference : idEObject.eClass().getEAllReferences()) {
					Object referencedObject = idEObject.eGet(eReference);
					if (referencedObject instanceof IfcRoot) {
						String referencedGuid = ((IfcRoot) referencedObject).getGlobalId().getWrappedValue();
						IfcRoot newObject = oldModel.get(referencedGuid);
						oldObject.eSet(eReference, newObject);
						System.out.println("Fixing reference from " + guid + " to " + referencedGuid);
					} else if (referencedObject instanceof List) {
						List referencedList = (List) referencedObject;
						List oldReferencedList = (List) oldObject.eGet(eReference);
						for (Object object : referencedList) {
							if (object instanceof IfcRoot) {
								IfcRoot referencedItem = (IfcRoot) object;
								String itemGuid = referencedItem.getGlobalId().getWrappedValue();
								oldReferencedList.add(oldModel.get(itemGuid));
								System.out.println("Fixing list reference from " + guid + " to " + itemGuid);
							}
						}
					}
				}
			}
		}
	}

	private void copyAttributesGuidObjectsAndAddNewObjects(IfcModel oldModel, IfcModel newModel) {
		for (IdEObject idEObject : newModel.getValues()) {
			if (idEObject instanceof IfcRoot) {
				IfcRoot ifcRoot = (IfcRoot) idEObject;
				String guid = ifcRoot.getGlobalId().getWrappedValue();
				if (oldModel.containsGuid(guid)) {
					System.out.println("Updating attributes for object " + idEObject.eClass().getName() + " " + guid);
					for (EAttribute eAttribute : idEObject.eClass().getEAllAttributes()) {
						Object eGet = idEObject.eGet(eAttribute);
						oldModel.get(guid).eSet(eAttribute, eGet);
					}
				} else {
					System.out.println("Adding new GUID object " + idEObject.eClass().getName() + " " + guid);
					IdEObject newObject = (IdEObject) idEObject.eClass().getEPackage().getEFactoryInstance().create(idEObject.eClass());
					newObject.setOid(idEObject.getOid());
					((IfcRoot) newObject).setGlobalId(newGuid(guid));
					for (EAttribute eAttribute : newObject.eClass().getEAllAttributes()) {
						newObject.eSet(eAttribute, idEObject.eGet(eAttribute));
					}
					oldModel.add(newObject.getOid(), newObject);
				}
			}
		}
	}

	private IfcGloballyUniqueId newGuid(String guid) {
		IfcGloballyUniqueId ifcGuid = Ifc2x3Factory.eINSTANCE.createIfcGloballyUniqueId();
		ifcGuid.setWrappedValue(guid);
		return ifcGuid;
	}
}