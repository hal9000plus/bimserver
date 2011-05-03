package org.bimserver.interfaces.objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SSerializer
{
	private long oid;
	
	public long getOid() {
		return oid;
	}
	
	public void setOid(long oid) {
		this.oid = oid;
	}
	private java.lang.String name;
	private java.lang.String description;
	private java.lang.String className;
	private boolean enabled;
	private long ignoreFileId;
	private long settingsId;

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getClassName() {
		return className;
	}

	public void setClassName(java.lang.String className) {
		this.className = className;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public long getIgnoreFileId() {
		return ignoreFileId;
	}

	public void setIgnoreFileId(long ignoreFileId) {
		this.ignoreFileId = ignoreFileId;
	}
	
	public long getSettingsId() {
		return settingsId;
	}

	public void setSettingsId(long settingsId) {
		this.settingsId = settingsId;
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
		SSerializer other = (SSerializer) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}