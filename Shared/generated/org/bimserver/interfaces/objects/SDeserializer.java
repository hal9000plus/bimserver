package org.bimserver.interfaces.objects;

import java.util.*;
import javax.xml.bind.annotation.*;
import org.bimserver.shared.meta.*;
import javax.activation.DataHandler;

@XmlRootElement
public class SDeserializer implements SBase
{
	private long oid;
	private static final SClass sClass = new SClass("Deserializer");
	
	static {
		sClass.addField(new SField("oid", long.class));
		sClass.addField(new SField("name", java.lang.String.class));
		sClass.addField(new SField("description", java.lang.String.class));
		sClass.addField(new SField("className", java.lang.String.class));
		sClass.addField(new SField("enabled", boolean.class));
		sClass.addField(new SField("defaultDeserializer", boolean.class));
		sClass.addField(new SField("settingsId", long.class));
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
	private java.lang.String name;
	private java.lang.String description;
	private java.lang.String className;
	private boolean enabled;
	private boolean defaultDeserializer;
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
	public boolean isDefaultDeserializer() {
		return defaultDeserializer;
	}

	public void setDefaultDeserializer(boolean defaultDeserializer) {
		this.defaultDeserializer = defaultDeserializer;
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
		SDeserializer other = (SDeserializer) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}