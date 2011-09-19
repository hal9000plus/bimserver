package org.bimserver.interfaces.objects;

import java.util.*;
import javax.xml.bind.annotation.*;
import org.bimserver.shared.meta.*;
import javax.activation.DataHandler;

@XmlRootElement
public class SConcreteRevision implements SBase
{
	private long oid;
	private static final SClass sClass = new SClass("ConcreteRevision");
	
	static {
		sClass.addField(new SField("oid", long.class));
		sClass.addField(new SField("id", int.class));
		sClass.addField(new SField("projectId", long.class));
		sClass.addField(new SField("state", SCheckinState.class));
		sClass.addField(new SField("checksum", byte[].class));
		sClass.addField(new SField("revisions", Long.class, true));
		sClass.addField(new SField("size", long.class));
		sClass.addField(new SField("date", java.util.Date.class));
		sClass.addField(new SField("lastError", java.lang.String.class));
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
	private int id;
	private long projectId;
	private SCheckinState state;
	@XmlMimeType("application/octet-stream")
	private DataHandler checksum;
	private List<Long> revisions = new ArrayList<Long>();
	private long size;
	private java.util.Date date;
	private java.lang.String lastError;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	
	public SCheckinState getState() {
		return state;
	}

	public void setState(SCheckinState state) {
		this.state = state;
	}
	public DataHandler getChecksum() {
		return checksum;
	}

	public void setChecksum(DataHandler checksum) {
		this.checksum = checksum;
	}
	public List<Long> getRevisions() {
		return revisions;
	}

	public void setRevisions(List<Long> revisions) {
		this.revisions = revisions;
	}
	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public java.lang.String getLastError() {
		return lastError;
	}

	public void setLastError(java.lang.String lastError) {
		this.lastError = lastError;
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
		SConcreteRevision other = (SConcreteRevision) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}