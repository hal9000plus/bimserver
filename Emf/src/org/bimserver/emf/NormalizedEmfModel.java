package org.bimserver.emf;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

public class NormalizedEmfModel extends AbstractEmfModel<Long> {
	private final Map<Long, EObject> objects = new TreeMap<Long, EObject>();
	private long counter = 1;
	private byte[] checksum;

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

	@Override
	public byte[] getChecksum() {
		return checksum;
	}

	public void setChecksum(byte[] checksum) {
		this.checksum = checksum;
	}

	@Override
	public EObject getMainObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMainObject(EObject eObject) {
		// TODO Auto-generated method stub
		
	}
}