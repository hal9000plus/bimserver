package org.bimserver.shared;

import java.util.Map;
import java.util.TreeMap;

import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.eclipse.emf.ecore.EClass;

public class SRevisionSummary {
	private final Map<String, Map<String, Integer>> map = new TreeMap<String, Map<String, Integer>>();
	
	public SRevisionSummary() {
		map.put("IFC Entities", new TreeMap<String, Integer>());
		map.put("IFC Relations", new TreeMap<String, Integer>());
		map.put("IFC Primitives", new TreeMap<String, Integer>());
		map.put("Rest", new TreeMap<String, Integer>());
	}
	
	public Map<String, Map<String, Integer>> getMap() {
		return map;
	}

	public void add(EClass eClass, int count) {
		if (count == 0) {
			return;
		}
		Map<String, Integer> subMap = null;
		if (Ifc2x3Package.eINSTANCE.getIfcObject().isSuperTypeOf(eClass)) {
			subMap = map.get("IFC Entities");
		} else if (Ifc2x3Package.eINSTANCE.getIfcRelationship().isSuperTypeOf(eClass)) {
			subMap = map.get("IFC Relations");
		} else if (Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf(eClass)) {
			subMap = map.get("IFC Primitives");
		} else {
			subMap = map.get("Rest");
		}
		if (subMap.containsKey(eClass.getName())) {
			subMap.put(eClass.getName(), subMap.get(eClass.getName()) + count);
		} else {
			subMap.put(eClass.getName(), count);
		}
	}
}