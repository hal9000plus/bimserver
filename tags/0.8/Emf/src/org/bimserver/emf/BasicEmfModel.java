package org.bimserver.emf;

/******************************************************************************
 * (c) Copyright bimserver.org 2009
 * Licensed under GNU GPLv3
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * For more information mail to license@bimserver.org
 *
 * Bimserver.org is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bimserver.org is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License a 
 * long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

public class BasicEmfModel<T> extends AbstractEmfModel<T> implements EmfModel<T> {

	private long counter = 1;
	protected final Map<T, EObject> objects;

	public BasicEmfModel(Map<T, EObject> objects) {
		this.objects = objects;
	}
	
	public BasicEmfModel() {
		this.objects = new HashMap<T, EObject>();
	}

	public BasicEmfModel(int size) {
		this.objects = new HashMap<T, EObject>(size);
	}
	
	public long size() {
		return objects.size();
	}

	public Set<T> keySet() {
		return objects.keySet();
	}

	public EObject get(Long key) {
		return objects.get(key);
	}

	public Collection<EObject> getValues() {
		return objects.values();
	}
	
	public void add(T key, EObject eObject) {
		objects.put(key, eObject);
	}
	
	public Map<T, EObject> getObjects() {
		return objects;
	}

	public Map<? extends Long, ? extends EObject> getMap() {
		return (Map<? extends Long, ? extends EObject>) objects;
	}

	public void add(EObject newObject) {
		objects.put((T) ((Long)counter++), newObject);
	}
}