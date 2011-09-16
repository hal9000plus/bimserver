package org.bimserver.interfaces.objects;

import java.util.*;
import javax.xml.bind.annotation.XmlRootElement;
import org.bimserver.shared.meta.*;

@XmlRootElement
public class SNewProjectAdded extends SLogAction implements SBase
{
	private long oid;
	private static final SClass sClass = new SClass("NewProjectAdded");
	
	static {
		sClass.addField(new SField("oid", long.class));
		sClass.addField(new SField("date", java.util.Date.class));
		sClass.addField(new SField("executorId", long.class));
		sClass.addField(new SField("accessMethod", SAccessMethod.class));
		sClass.addField(new SField("projectId", long.class));
		sClass.addField(new SField("parentProjectId", long.class));
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
	private long projectId;
	private long parentProjectId;
	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	
	public long getParentProjectId() {
		return parentProjectId;
	}

	public void setParentProjectId(long parentProjectId) {
		this.parentProjectId = parentProjectId;
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
		SNewProjectAdded other = (SNewProjectAdded) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}