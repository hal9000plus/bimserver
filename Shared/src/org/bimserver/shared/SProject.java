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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SProject implements Comparable<SProject> {
	private String name;
	private int id;
	private String createByUsername;
	private int createdByUserId;
	private Date createdOn;
	private String state;
	private int numberOfRevisions;
	private int numberOfCheckouts;
	private int numberOfAuthorizedUsers;
	private SGeoTag geoTag;
	private List<Integer> subProjects = new ArrayList<Integer>();
	private int parentId;
	private String description;

	public String getCreateByUsername() {
		return createByUsername;
	}

	public void setCreatedByUsername(String createByUsername) {
		this.createByUsername = createByUsername;
	}

	public int getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreateByUserId(int createByUserId) {
		this.createdByUserId = createByUserId;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public int getNumberOfRevisions() {
		return numberOfRevisions;
	}

	public void setNumberOfRevisions(int numberOfRevisions) {
		this.numberOfRevisions = numberOfRevisions;
	}

	public int getNumberOfCheckouts() {
		return numberOfCheckouts;
	}

	public void setNumberOfCheckouts(int numberOfCheckouts) {
		this.numberOfCheckouts = numberOfCheckouts;
	}

	public int getNumberOfAuthorizedUsers() {
		return numberOfAuthorizedUsers;
	}

	public void setNumberOfAuthorizedUsers(int numberOfAuthorizedUsers) {
		this.numberOfAuthorizedUsers = numberOfAuthorizedUsers;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int compareTo(SProject o) {
		return name.compareTo(o.getName());
	}

	public void setGeoTag(SGeoTag geoTag) {
		this.geoTag = geoTag;
	}

	public SGeoTag getGeoTag() {
		return geoTag;
	}

	public void setSubProjects(List<Integer> subProjects) {
		this.subProjects = subProjects;
	}

	public List<Integer> getSubProjects() {
		return subProjects;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}