package org.bimserver.shared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SCompareResult {

	public static abstract class SItem {

		public final DataObject dataObject;

		public SItem(DataObject dataObject) {
			this.dataObject = dataObject;
		}
	}

	public static class SObjectAdded extends SItem {
		public SObjectAdded(DataObject dataObject) {
			super(dataObject);
		}
	}
	
	public static class SObjectRemoved extends SItem {
		public SObjectRemoved(DataObject dataObject) {
			super(dataObject);
		}
	}
	
	public static class SObjectModified extends SItem {
		private final String fieldName;
		private final String oldValue;
		private final String newValue;

		public SObjectModified(DataObject dataObject, String fieldName, String oldValue, String newValue) {
			super(dataObject);
			this.fieldName = fieldName;
			this.oldValue = oldValue;
			this.newValue = newValue;
		}

		public String getFieldName() {
			return fieldName;
		}

		public String getOldValue() {
			return oldValue;
		}

		public String getNewValue() {
			return newValue;
		}
	}

	private final Map<String, List<SItem>> items = new HashMap<String, List<SItem>>();

	public int size() {
		int size = 0;
		for (List<SItem> list : items.values()) {
			size += list.size();
		}
		return size;
	}

	public Map<String, List<SItem>> getItems() {
		return items;
	}

	public void add(SItem item) {
		if (!items.containsKey(item.dataObject.getType())) {
			items.put(item.dataObject.getType(), new ArrayList<SItem>());
		}
		items.get(item.dataObject.getType()).add(item);
	}
}