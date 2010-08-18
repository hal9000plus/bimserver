package org.bimserver.shared;

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

import java.util.Date;

public class SRevision implements Comparable<SRevision> {

	private int id;
	private int userId;
	private String username;
	private Date date;
	private String comment;
	private String projectName;
	private boolean lastRevision;
	private int projectId;
	private long size;
	private boolean finalized;
	
	public boolean isLastRevision() {
		return lastRevision;
	}

	public void setLastRevision(boolean lastRevision) {
		this.lastRevision = lastRevision;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProjectName() {
		return projectName;
	}
	
	@Override
	public int compareTo(SRevision otherRevision) {
		return id - otherRevision.getId();
	}

	public void setFinalized(boolean finalized) {
		this.finalized = finalized;
	}

	public boolean isFinalized() {
		return finalized;
	}
}