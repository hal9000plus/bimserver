package org.bimserver.citygml;
import org.bimserver.emf.BasicEmfModel;
import org.eclipse.emf.ecore.EObject;

public class AutoCountEmfModel extends BasicEmfModel<Long> {
	private long counter = 0;
	
	public void add(EObject eObject) {
		objects.put(counter++, eObject);
	}
}