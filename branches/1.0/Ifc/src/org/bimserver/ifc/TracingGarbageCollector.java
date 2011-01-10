package org.bimserver.ifc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bimserver.emf.IdEObject;
import org.eclipse.emf.ecore.EReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TracingGarbageCollector {
	private static final Logger LOGGER = LoggerFactory.getLogger(TracingGarbageCollector.class);
	private final IfcModel ifcModel;
	private final Set<IdEObject> referencedObjects = new HashSet<IdEObject>();

	public TracingGarbageCollector(IfcModel ifcModel) {
		this.ifcModel = ifcModel;
	}

	public void mark(Set<? extends IdEObject> rootObjects) {
		referencedObjects.addAll(rootObjects);
		for (IdEObject rootObject : rootObjects) {
			for (EReference eReference : rootObject.eClass().getEAllReferences()) {
				Object referredObject = rootObject.eGet(eReference);
				if (eReference.isMany()) {
					List list = (List) referredObject;
					for (Object o : list) {
						if (!referencedObjects.contains(o)) {
							mark(makeSet((IdEObject) o));
						}
					}
				} else {
					IdEObject referredIdEObject = (IdEObject) referredObject;
					if (referredIdEObject != null) {
						if (!referencedObjects.contains(referredObject)) {
							mark(makeSet(referredIdEObject));
						}
					}
				}
			}
		}
	}

	private Set<? extends IdEObject> makeSet(IdEObject idEObject) {
		Set<IdEObject> set = new HashSet<IdEObject>();
		set.add(idEObject);
		return set;
	}
	
	public void sweep() {
		Map<Long, IdEObject> objects = ifcModel.getObjects();
		Iterator<Long> iterator = objects.keySet().iterator();
		int removed = 0;
		while (iterator.hasNext()) {
			Long next = iterator.next();
			IdEObject idEObject = objects.get(next);
			if (!referencedObjects.contains(idEObject)) {
				removed++;
				iterator.remove();
			}
		}
		LOGGER.info(removed + " objects swept");
	}
}