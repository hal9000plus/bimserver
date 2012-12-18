package org.bimserver.shared;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.util.HashMap;
import java.util.Map;

import org.bimserver.shared.interfaces.PublicInterface;

public class InterfaceMap {
	private final Map<Class<? extends PublicInterface>, PublicInterface> map = new HashMap<Class<? extends PublicInterface>, PublicInterface>();
	private final Map<String, PublicInterface> mapSimpleName = new HashMap<String, PublicInterface>();
	
	public <T extends PublicInterface> void add(Class<T> clazz, T t) {
		map.put(clazz, t);
		mapSimpleName.put(clazz.getSimpleName(), t);
	}

	@SuppressWarnings("unchecked")
	public <T extends PublicInterface> T get(String simpleName) {
		return (T) mapSimpleName.get(simpleName);
	}

	@SuppressWarnings("unchecked")
	public <T extends PublicInterface> T get(Class<T> clazz) {
		return (T) map.get(clazz);
	}

	public boolean contains(String serviceName) {
		return mapSimpleName.containsKey(serviceName);
	}
}