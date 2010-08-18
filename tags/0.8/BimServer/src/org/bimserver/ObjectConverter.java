package org.bimserver;

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

import java.util.Collection;
import java.util.Set;

import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.shared.SCheckoutList;
import org.bimserver.shared.ProjectList;
import org.bimserver.shared.SCheckout;
import org.bimserver.shared.SGeoTag;
import org.bimserver.shared.SProject;
import org.bimserver.shared.SRevision;
import org.bimserver.shared.SRevisionList;
import org.bimserver.shared.SUser;
import org.bimserver.shared.UserList;

public class ObjectConverter {

	public static SCheckoutList convert(Set<Checkout> checkouts) {
		SCheckoutList checkoutList = new SCheckoutList(); 
		for (Checkout checkout : checkouts) {
			checkoutList.add(convert(checkout));
		}
		return checkoutList;
	}

	private static SCheckout convert(Checkout checkout) {
		SCheckout sCheckout = new SCheckout();
		sCheckout.setDate(checkout.getDate());
		sCheckout.setRevisionId(checkout.getRevision().getId());
		sCheckout.setProjectName(checkout.getProject().getName());
		sCheckout.setProjectId(checkout.getProject().getId());
		sCheckout.setUserId(checkout.getUser().getId());
		sCheckout.setActive(checkout.isActive());
		sCheckout.setUsername(checkout.getUser().getName());
		sCheckout.setId(checkout.getId());
		return sCheckout;
	}

	public static SRevision convert(VirtualRevision revision) {
		if (revision == null) {
			return null;
		}
		SRevision sRevision = new SRevision();
		sRevision.setId(revision.getId());
		sRevision.setUsername(revision.getLastRevision().getUser().getName());
		sRevision.setUserId(revision.getLastRevision().getUser().getId());
		sRevision.setDate(revision.getLastRevision().getDate());
		sRevision.setComment(revision.getLastRevision().getComment());
		sRevision.setProjectId(revision.getProject().getId());
		sRevision.setProjectName(revision.getProject().getName());
		sRevision.setSize(getSize(revision));
		sRevision.setLastRevision(revision.getProject().getLastConcreteRevision() == revision);
		return sRevision;
	}

	public static SRevision convert(ConcreteRevision revision) {
		if (revision == null) {
			return null;
		}
		SRevision sRevision = new SRevision();
		sRevision.setId(revision.getId());
		sRevision.setUsername(revision.getUser().getName());
		sRevision.setUserId(revision.getUser().getId());
		sRevision.setDate(revision.getDate());
		sRevision.setComment(revision.getComment());
		sRevision.setProjectId(revision.getProject().getId());
		sRevision.setProjectName(revision.getProject().getName());
		sRevision.setSize(revision.getSize());
		sRevision.setLastRevision(revision.getProject().getLastConcreteRevision() == revision);
		return sRevision;
	}

	private static int getSize(VirtualRevision revision) {
		int size = 0;
		for (ConcreteRevision concreteRevision : revision.getRevisions()) {
			size += concreteRevision.getSize();
		}
		return size;
	}

	public static SRevisionList convertVirtualRevisionSet(Set<VirtualRevision> revisions) {
		SRevisionList revisionList = new SRevisionList();
		for (VirtualRevision revision : revisions) {
			revisionList.add(convert(revision));
		}
		return revisionList;
	}

	public static SRevisionList convertConcreteRevisionSet(Set<ConcreteRevision> revisions) {
		SRevisionList revisionList = new SRevisionList();
		for (ConcreteRevision revision : revisions) {
			revisionList.add(convert(revision));
		}
		return revisionList;
	}
	
	public static ProjectList convert(Collection<Project> projects) {
		ProjectList projectList = new ProjectList();
		for (Project project : projects) {
			projectList.add(convert(project));
		}
		return projectList;
	}

	public static UserList convert(Set<User> users) {
		UserList userList = new UserList();
		for (User user : users) {
			userList.add(convert(user));
		}
		return userList;
	}

	public static SUser convert(User user) {
		SUser sUser = new SUser();
		sUser.setId(user.getId());
		sUser.setName(user.getName());
		sUser.setUsername(user.getUsername());
		sUser.setPassword(user.getPassword());
		sUser.setUserType(user.getUserType().toString());
		sUser.setAdmin(user.getUserType() == UserType.ADMIN);
		sUser.setAnonymous(user.getUserType() == UserType.ANONYMOUS);
		if (user.getCreatedBy() != null) {
			sUser.setCreatedByUserId(user.getCreatedBy().getId());
			sUser.setCreatedByUsername(user.getCreatedBy().getName());
		}
		sUser.setLastSeen(user.getLastSeen());
		sUser.setState(user.getState().toString());
		sUser.setCreatedOn(user.getCreatedOn());
		return sUser;
	}

	public static SProject convert(Project project) {
		SProject sProject = new SProject();
		sProject.setName(project.getName());
		sProject.setId(project.getId());
		sProject.setCreateByUserId(project.getCreatedBy().getId());
		sProject.setCreatedByUsername(project.getCreatedBy().getName());
		sProject.setDescription(project.getDescription());
		sProject.setCreatedOn(project.getCreatedDate());
		sProject.setNumberOfAuthorizedUsers(project.getHasAuthorizedUsers().size());
		sProject.setNumberOfCheckouts(project.getCheckouts().size());
		sProject.setNumberOfRevisions(project.getVirtualRevisions().size());
		sProject.setState(project.getState().toString());
		if (project.getParent() != null) {
			sProject.setParentId(project.getParent().getId());
		} else {
			sProject.setParentId(-1);
		}
		for (Project subProject : project.getSubProjects()) {
			sProject.getSubProjects().add(subProject.getId());
		}
		if (project.getGeoTag() != null) {
			SGeoTag geoTag = new SGeoTag();
			geoTag.setX1(project.getGeoTag().getX1());
			geoTag.setY1(project.getGeoTag().getY1());
			geoTag.setZ1(project.getGeoTag().getZ1());
			geoTag.setX2(project.getGeoTag().getX2());
			geoTag.setY2(project.getGeoTag().getY2());
			geoTag.setZ2(project.getGeoTag().getZ2());
			geoTag.setEpsg(project.getGeoTag().getEpsg());
			sProject.setGeoTag(geoTag);
		}
		return sProject;
	}
}
