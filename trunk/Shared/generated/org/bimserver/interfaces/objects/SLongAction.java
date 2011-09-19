package org.bimserver.interfaces.objects;

import java.util.*;
import javax.xml.bind.annotation.*;
import org.bimserver.shared.meta.*;
import javax.activation.DataHandler;

@XmlRootElement
public class SLongAction implements SBase
{
	private long oid;
	private static final SClass sClass = new SClass("LongAction");
	
	static {
		sClass.addField(new SField("oid", long.class));
		sClass.addField(new SField("identification", java.lang.String.class));
		sClass.addField(new SField("userId", long.class));
		sClass.addField(new SField("start", java.util.Date.class));
		sClass.addField(new SField("username", java.lang.String.class));
		sClass.addField(new SField("name", java.lang.String.class));
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
	private java.lang.String identification;
	private long userId;
	private java.util.Date start;
	private java.lang.String username;
	private java.lang.String name;
	public java.lang.String getIdentification() {
		return identification;
	}

	public void setIdentification(java.lang.String identification) {
		this.identification = identification;
	}
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public java.util.Date getStart() {
		return start;
	}

	public void setStart(java.util.Date start) {
		this.start = start;
	}
	public java.lang.String getUsername() {
		return username;
	}

	public void setUsername(java.lang.String username) {
		this.username = username;
	}
	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
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
		SLongAction other = (SLongAction) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}