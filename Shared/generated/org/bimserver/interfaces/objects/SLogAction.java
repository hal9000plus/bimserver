package org.bimserver.interfaces.objects;

/******************************************************************************
 * Copyright (C) 2011  BIMserver.org
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

import java.util.*;
import javax.xml.bind.annotation.*;
import org.bimserver.shared.meta.*;
import javax.activation.DataHandler;

@XmlRootElement
public class SLogAction implements SBase
{
	private long oid;
	private static final SClass sClass = new SClass("LogAction");
	
	static {
		sClass.addField(new SField("oid", long.class));
		sClass.addField(new SField("date", java.util.Date.class));
		sClass.addField(new SField("executorId", long.class));
		sClass.addField(new SField("accessMethod", SAccessMethod.class));
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
		if (sField.getName().equals("date")) {
			return getDate();
		}
		if (sField.getName().equals("executorId")) {
			return getExecutorId();
		}
		if (sField.getName().equals("accessMethod")) {
			return getAccessMethod();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	private java.util.Date date;
	private long executorId;
	private SAccessMethod accessMethod;
	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public long getExecutorId() {
		return executorId;
	}

	public void setExecutorId(long executorId) {
		this.executorId = executorId;
	}
	
	public SAccessMethod getAccessMethod() {
		return accessMethod;
	}

	public void setAccessMethod(SAccessMethod accessMethod) {
		this.accessMethod = accessMethod;
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
		SLogAction other = (SLogAction) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}