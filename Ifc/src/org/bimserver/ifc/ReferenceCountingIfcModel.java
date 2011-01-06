package org.bimserver.ifc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bimserver.emf.IdEObject;
import org.eclipse.emf.ecore.EReference;

public class ReferenceCountingIfcModel extends IfcModel {
	private final Map<IdEObject, Set<IdEObject>> references = new HashMap<IdEObject, Set<IdEObject>>();

	public ReferenceCountingIfcModel(int size) {
		super(size);
		for (IdEObject idEObject : getMap().values()) {
			addObject(idEObject);			
		}
	}

	public void updateReferences() {
		references.clear();
		for (IdEObject idEObject2 : getMap().values()) {
			for (EReference eReference : idEObject2.eClass().getEAllReferences()) {
				if (eReference.isMany()) {
					List list = (List)idEObject2.eGet(eReference);
					for (Object o : list) {
						if (!references.containsKey(o)) {
							references.put((IdEObject) o, new HashSet<IdEObject>());
						}
						references.get(o).add(idEObject2);
					}
				} else {
					Object o = idEObject2.eGet(eReference);
					if (!references.containsKey(o)) {
						references.put((IdEObject) o, new HashSet<IdEObject>());
					}
					references.get(o).add(idEObject2);
				}
			}
		}
	}
	
	private void addObject(IdEObject idEObject) {
		if (!references.containsKey(idEObject)) {
			references.put(idEObject, new HashSet<IdEObject>());
		}
		for (IdEObject idEObject2 : getMap().values()) {
			for (EReference eReference : idEObject2.eClass().getEAllReferences()) {
				if (eReference.isMany()) {
					List list = (List)idEObject2.eGet(eReference);
					for (Object o : list) {
						if (o == idEObject) {
							references.get(idEObject).add(idEObject2);
						}
					}
				} else {
					if (idEObject2.eGet(eReference) == idEObject) {
						references.get(idEObject).add(idEObject2);
					}
				}
			}
		}
	}

	@Override
	public void remove(IdEObject idEObject) {
		int totalRemoved = removeInternal(idEObject);
		System.out.println("Removing " + idEObject + " (" + totalRemoved + ")");
	}
	
	public int removeInternal(IdEObject idEObject) {
		super.remove(idEObject);
		int totalRemoved = 1;
		for (EReference eReference : idEObject.eClass().getEAllReferences()) {
			if (eReference.isMany()) {
				List list = (List)idEObject.eGet(eReference);
				for (Object o : list) {
					IdEObject refObject = (IdEObject)o;
					references.get(refObject).remove(idEObject);
					if (references.get(refObject).size() == 0) {
						totalRemoved += removeInternal(refObject);
					}
				}
			} else {
				IdEObject refObject = (IdEObject) idEObject.eGet(eReference);
				if (references.containsKey(refObject)) {
					references.get(refObject).remove(idEObject);
					if (references.get(refObject).size() == 0) {
						totalRemoved += removeInternal(refObject);
					}
				}
			}
		}
		return totalRemoved;
	}
}