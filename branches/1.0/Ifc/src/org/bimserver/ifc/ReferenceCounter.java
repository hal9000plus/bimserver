package org.bimserver.ifc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bimserver.emf.IdEObject;
import org.eclipse.emf.ecore.EReference;

public class ReferenceCounter {
	
	public abstract class Reference {
		private final IdEObject idEObject;
		private final EReference eReference;
		private final IdEObject referredObject;

		public Reference(IdEObject idEObject, IdEObject referredObject, EReference eReference) {
			this.idEObject = idEObject;
			this.referredObject = referredObject;
			this.eReference = eReference;
		}

		public IdEObject getIdEObject() {
			return idEObject;
		}

		public EReference geteReference() {
			return eReference;
		}

		public abstract Reference reAttach(IdEObject mainObject);

		public IdEObject getReferredObject() {
			return referredObject;
		}
	}
	
	public class SingleReference extends Reference {
		
		public SingleReference(IdEObject idEObject, IdEObject referredObject, EReference eReference) {
			super(idEObject, referredObject, eReference);
		}

		@Override
		public Reference reAttach(IdEObject mainObject) {
			getIdEObject().eSet(geteReference(), mainObject);
			return new SingleReference(getIdEObject(), mainObject, geteReference());
		}
	}
	
	public class MultiReference extends Reference {

		public MultiReference(IdEObject idEObject, IdEObject referredObject, EReference eReference) {
			super(idEObject, referredObject, eReference);
		}

		@Override
		public Reference reAttach(IdEObject mainObject) {
			((List)getIdEObject().eGet(geteReference())).add(mainObject);
			return new SingleReference(getIdEObject(), mainObject, geteReference());
		}
	}
	
	private final Map<IdEObject, Set<Reference>> references = new HashMap<IdEObject, Set<Reference>>();
	private final IfcModel ifcModel;

	public ReferenceCounter(IfcModel ifcModel) {
		this.ifcModel = ifcModel;
	}

	public void updateReferences() {
		references.clear();
		for (IdEObject idEObject2 : ifcModel.getValues()) {
			for (EReference eReference : idEObject2.eClass().getEAllReferences()) {
				if (eReference.isMany()) {
					List list = (List)idEObject2.eGet(eReference);
					for (Object o : list) {
						if (!references.containsKey(o)) {
							references.put((IdEObject) o, new HashSet<Reference>());
						}
						references.get(o).add(new MultiReference(idEObject2, (IdEObject) o, eReference));
					}
				} else {
					Object o = idEObject2.eGet(eReference);
					if (!references.containsKey(o)) {
						references.put((IdEObject) o, new HashSet<Reference>());
					}
					references.get(o).add(new SingleReference(idEObject2, (IdEObject) o, eReference));
				}
			}
		}
	}
	
	public void remove(IdEObject idEObject) {
		int totalRemoved = removeInternal(idEObject);
		System.out.println("Removing " + idEObject + " (" + totalRemoved + ")");
	}
	
	public int removeInternal(IdEObject idEObject) {
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

	public Set<Reference> getReferencesTo(IdEObject objectToRemove) {
		return references.get(objectToRemove);
	}

	public void addReference(Reference reference) {
		references.get(reference.getReferredObject()).add(reference);
	}
}