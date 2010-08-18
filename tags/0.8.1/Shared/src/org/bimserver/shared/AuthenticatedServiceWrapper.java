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

import java.util.List;
import java.util.Map;

import javax.activation.DataHandler;

public class AuthenticatedServiceWrapper {
	private final ServiceInterface service;
	private final Token token;
	private final SUser user;

	public AuthenticatedServiceWrapper(ServiceInterface service, Token token, boolean admin) throws UserException {
		this.service = service;
		this.token = token;
		if (admin) {
			this.user = service.getUserByUserName("admin");
		} else {
			this.user = service.getUserOfToken(token);
		}
	}

	public SUser getCurrentUser() {
		return user;
	}

	public int addProject(String name, SGeoTag geoTag) throws UserException {
		return service.addProject(token, name, geoTag);
	}

	public int addProject(String name, int parentProjectId, SGeoTag geoTag) throws UserException {
		return service.addProject(token, name, parentProjectId, geoTag);
	}

	public int addUser(String username, String password, String name) throws UserException {
		return service.addUser(token, username, password, name);
	}

	public SRevision getLastRevision(int pid) throws UserException {
		return service.getLastRevision(token, pid);
	}

	public CheckinResult checkin(int pid, String comment, long fileSize, DataHandler ifcFile) throws UserException {
		return service.checkin(token, pid, comment, fileSize, ifcFile);
	}

	public CheckoutResult checkout(int pid, int rid, ResultType resultType) throws UserException {
		return service.checkout(token, pid, rid, resultType);
	}

	public SCheckoutList getAllCheckoutsOfProject(int pid) throws UserException {
		return service.getAllCheckoutsOfProject(token, pid);
	}

	public ProjectList getAllProjects() throws UserException {
		return service.getAllProjects(token);
	}

	public SRevisionList getAllRevisionsOfProject(int pid) throws UserException {
		return service.getAllRevisionsOfProject(token, pid);
	}

	public UserList getAllUsers() throws UserException {
		return service.getAllUsers(token);
	}

	public CheckoutResult download(int pid, int rid, ResultType resultType) throws UserException {
		return service.download(token, pid, rid, resultType);
	}

	public CheckoutResult downloadProjects(Map<Integer, Integer> pids, ResultType resultType) throws UserException {
		return service.downloadProjects(token, pids, resultType);
	}

	public CheckoutResult downloadOfType(int pid, int rid, String className, ResultType resultType) throws UserException {
		return service.downloadOfType(token, pid, rid, className, resultType);
	}

	public CheckoutResult downloadById(int pid, int rid, int oid, ResultType resultType) throws UserException {
		return service.downloadByOid(token, pid, rid, oid, resultType);
	}

	public SProject getProjectById(int pid) throws UserException {
		return service.getProjectById(token, pid);
	}

	public UserList getAllAuthorizedUsers(int pid) throws UserException {
		return service.getAllAuthorizedUsersOfProject(token, pid);
	}

	public UserList getAllNonAuthorizedUsers(int pid) throws UserException {
		return service.getAllNonAuthorizedUsersOfProject(token, pid);
	}

	public SUser getUserById(int uid) throws UserException {
		return service.getUserById(token, uid);
	}

	public SRevisionList getAllRevisionsByUser(int uid) throws UserException {
		return service.getAllRevisionsByUser(token, uid);
	}

	public SCheckoutList getAllCheckoutsByUser(int uid) throws UserException {
		return service.getAllCheckoutsByUser(token, uid);
	}

	public SCheckoutList getAllCheckoutsOfRevision(int pid, int rid) throws UserException {
		return service.getAllCheckoutsOfRevision(token, pid, rid);
	}

	public ProjectList getUsersProjects(int uid) throws UserException {
		return service.getProjectsOfUser(token, uid);
	}

	public SRevision getRevision(int pid, int rid) throws UserException {
		return service.getRevision(token, pid, rid);
	}

	public ClassList getAvailableClasses() throws UserException {
		return service.getAvailableClasses(token);
	}

	public void addUserToProject(int uid, int pid) throws UserException {
		service.addUserToProject(token, uid, pid);
	}

	public void removeUserFromProject(int uid, int pid) throws UserException {
		service.removeUserFromProject(token, uid, pid);
	}

	public boolean deleteProject(int pid) throws UserException {
		return service.deleteProject(token, pid);
	}

	public boolean deleteUser(int uid) throws UserException {
		return service.deleteUser(token, uid);
	}

	public boolean undeleteProject(int pid) throws UserException {
		return service.undeleteProject(token, pid);
	}

	public boolean undeleteUser(int uid) throws UserException {
		return service.undeleteUser(token, uid);
	}

	public DatabaseInformation getDatabaseInformation() throws UserException {
		return service.getDatabaseInformation(token);
	}

	public CheckoutResult downloadByGuid(int pid, int rid, String guid, ResultType resultType) throws UserException {
		return service.downloadByGuid(token, pid, rid, guid, resultType);
	}

	public ChangeSetResult processChangeSet(int pid, String comment, ChangeSet changeSet) throws UserException {
		return service.processChangeSet(token, changeSet, pid, comment);
	}

	public ChangeSetResult processChangeSetFile(int pid, String comment, DataHandler changeSetFile) throws UserException {
		return service.processChangeSetFile(token, pid, comment, changeSetFile);
	}

	public ProjectList getAllNonAuthorizedProjectsOfUser(int uid) throws UserException {
		return service.getAllNonAuthorizedProjectsOfUser(token, uid);
	}

	public SUser getLoggedInUser() throws UserException {
		return service.getLoggedInUser(token);
	}

	public void logout() {
		service.logout(token);
	}

	public boolean changePassword(int uid, String oldPassword, String newPassword) throws UserException {
		return service.changePassword(token, uid, oldPassword, newPassword);
	}

	public void updateProject(int pid, String description, SGeoTag geoTag) throws UserException {
		service.updateProject(token, pid, description, geoTag);
	}

	public SCompareResult compare(int pid, int rid1, int rid2) throws UserException {
		return service.compare(token, pid, user.getId(), rid1, rid2);
	}

	public SRevisionSummary getRevisionSummary(int pid, int rid) throws UserException {
		return service.getRevisionSummary(token, pid, rid);
	}

	public boolean userHasCheckinRights(int pid) throws UserException {
		return service.userHasCheckinRights(token, user.getId(), pid);
	}

	public SCheckout getShowCheckoutWarning(int pid, int uid) throws UserException {
		return service.getShowCheckoutWarning(token, pid, uid);
	}

	public boolean userHasRights(int pid) throws UserException {
		return service.userHasRights(token, pid);
	}

	public DataObject getDataObjectByOid(int pid, int rid, long oid, String className) throws UserException {
		return service.getDataObjectByOid(token, pid, rid, oid, className);
	}

	public DataObject getDataObjectByGuid(int pid, int rid, String guid) throws UserException {
		return service.getDataObjectByGuid(token, pid, rid, guid);
	}
	
	public List<DataObject> getDataObjectsByType(int pid, int rid, String className) throws UserException {
		return service.getDataObjectsByType(token, pid, rid, className);
	}
	
	public String resetPassword(String emailAddress) throws UserException {
		return service.resetPassword(emailAddress);
	}
}