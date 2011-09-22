package org.bimserver.interfaces.objects;

import java.util.*;
import javax.xml.bind.annotation.*;
import org.bimserver.shared.meta.*;
import javax.activation.DataHandler;

@XmlRootElement
public class SClashDetectionSettings implements SBase
{
	private long oid;
	private static final SClass sClass = new SClass("ClashDetectionSettings");
	
	static {
		sClass.addField(new SField("oid", long.class));
		sClass.addField(new SField("enabled", boolean.class));
		sClass.addField(new SField("projects", Long.class, true));
		sClass.addField(new SField("margin", float.class));
		sClass.addField(new SField("revisions", Long.class, true));
		sClass.addField(new SField("ignoredClasses", java.lang.String.class, true));
	}
	
	public long getOid() {
		return oid;
	}
	
	public void setOid(long oid) {
		this.oid = oid;
	}
	
	public SClass getSClass() {
		return sClass;
	}
	
	public Object sGet(SField sField) {
		if (sField.getName().equals("enabled")) {
			return isEnabled();
		}
		if (sField.getName().equals("projects")) {
			return getProjects();
		}
		if (sField.getName().equals("margin")) {
			return getMargin();
		}
		if (sField.getName().equals("revisions")) {
			return getRevisions();
		}
		if (sField.getName().equals("ignoredClasses")) {
			return getIgnoredClasses();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	private boolean enabled;
	private List<Long> projects = new ArrayList<Long>();
	private float margin;
	private List<Long> revisions = new ArrayList<Long>();
	private List<java.lang.String> ignoredClasses = new ArrayList<java.lang.String>();
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public List<Long> getProjects() {
		return projects;
	}

	public void setProjects(List<Long> projects) {
		this.projects = projects;
	}
	public float getMargin() {
		return margin;
	}

	public void setMargin(float margin) {
		this.margin = margin;
	}
	public List<Long> getRevisions() {
		return revisions;
	}

	public void setRevisions(List<Long> revisions) {
		this.revisions = revisions;
	}

	public List<java.lang.String> getIgnoredClasses() {
		return ignoredClasses;
	}

	public void setIgnoredClasses(List<java.lang.String> ignoredClasses) {
		this.ignoredClasses = ignoredClasses;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (oid ^ (oid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SClashDetectionSettings other = (SClashDetectionSettings) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}