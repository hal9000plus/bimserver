package org.bimserver.emf;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

public class NormalizedEmfModel extends AbstractEmfModel<Long> implements EmfModel<Long> {
	private final Map<Long, EObject> objects = new TreeMap<Long, EObject>();
	private long counter = 1;

	public NormalizedEmfModel() {
	}

	public void add(EObject eObject) {
		objects.put(counter++, eObject);
	}

	public Collection<EObject> getValues() {
		return objects.values();
	}

	public long size() {
		return objects.size();
	}

	public EObject get(Long key) {
		return objects.get(key);
	}

	public Map<Long, EObject> getObjects() {
		return objects;
	}

	public Collection<Long> keySet() {
		return objects.keySet();
	}

	public Map<? extends Long, ? extends EObject> getMap() {
		return objects;
	}

	public void dump() {
		System.out.println("dump");
		for (Long key : objects.keySet()) {
			System.out.println(key + " " + objects.get(key));
		}
	}

	@Override
	public void add(Long t, EObject newObject) {
		objects.put(t, newObject);
	}
}