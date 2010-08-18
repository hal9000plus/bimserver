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
import javax.xml.bind.annotation.XmlMimeType;

public interface ServiceInterface {
	void ping();
	Token login(String username, String password) throws UserException;
	CheckinResult checkin(Token token, int pid, String comment, long fileSize, @XmlMimeType("application/octet-stream") DataHandler ifcFile) throws UserException;
	CheckoutResult checkout(Token token, int pid, int rid, ResultType resultType) throws UserException;
	CheckoutResult checkoutLastRevision(Token token, int pid, ResultType resultType) throws UserException;
	CheckoutResult download(Token token, int pid, int rid, ResultType resultType) throws UserException;
	CheckoutResult downloadByOid(Token token, int pid, int rid, long oid, ResultType resultType) throws UserException;
	CheckoutResult downloadOfType(Token token, int pid, int rid, String className, ResultType resultType) throws UserException;
	CheckoutResult downloadByGuid(Token token, int pid, int rid, String guid, ResultType resultType) throws UserException;
	CheckoutResult downloadProjects(Token token, Map<Integer, Integer> pids, ResultType resultType) throws UserException;
	int addUser(Token token, String username, String password, String name) throws UserException;
	int addProject(Token token, String projectName, SGeoTag geoTag) throws UserException;
	int addProject(Token token, String projectName, int parentProjectId, SGeoTag geoTag) throws UserException;
	void updateProject(Token token, int pid, String description, SGeoTag geoTag) throws UserException;
	boolean addUserToProject(Token token, int uid, int pid) throws UserException;
	boolean removeUserFromProject(Token token, int uid, int pid) throws UserException;
	boolean deleteProject(Token token, int pid) throws UserException;
	boolean deleteUser(Token token, int uid) throws UserException;
	ProjectList getAllProjects(Token token) throws UserException;
	UserList getAllUsers(Token token) throws UserException;
	SRevisionList getAllRevisionsOfProject(Token token, int pid) throws UserException;
	SCheckoutList getAllCheckoutsOfProject(Token token, int pid) throws UserException;
	SRevisionList getAllRevisionsByUser(Token token, int uid) throws UserException;
	SCheckoutList getAllCheckoutsByUser(Token token, int uid) throws UserException;
	SCheckoutList getAllCheckoutsOfRevision(Token token, int pid, int rid) throws UserException;
	SProject getProjectById(Token token, int pid) throws UserException;
	SUser getUserById(Token token, int uid) throws UserException;
	SRevision getLastRevision(Token token, int pid) throws UserException;
	SRevision getRevision(Token token, int pid, int rid) throws UserException;
	UserList getAllAuthorizedUsersOfProject(Token token, int pid) throws UserException;
	UserList getAllNonAuthorizedUsersOfProject(Token token, int pid) throws UserException;
	ChangeSetResult processChangeSet(Token token, ChangeSet changeSet, int pid, String comment) throws UserException;
	ClassList getAvailableClasses(Token token) throws UserException;
	ProjectList getProjectsOfUser(Token token, int uid) throws UserException;
	DatabaseInformation getDatabaseInformation(Token token) throws UserException;
	Token createAnonymousToken() throws UserException;
	ChangeSetResult processChangeSetFile(Token token, int pid, String comment, @XmlMimeType("application/octet-stream") DataHandler changeSetFile) throws UserException;
	SUser getLoggedInUser(Token token) throws UserException;
	ProjectList getAllNonAuthorizedProjectsOfUser(Token token, int uid) throws UserException;
	SUser getUserOfToken(Token token) throws UserException;
	void logout(Token token);
	boolean changePassword(Token token, int uid, String oldPassword, String newPassword) throws UserException;
	SUser getUserByUserName(String username) throws UserException;
	boolean undeleteProject(Token token, int pid) throws UserException;
	boolean undeleteUser(Token token, int uid) throws UserException;
	SCompareResult compare(Token token, int pid, int uid, int rid1, int rid2) throws UserException;
	SRevisionSummary getRevisionSummary(Token token, int pid, int rid) throws UserException;
	boolean userHasCheckinRights(Token token, int uid, int pid) throws UserException;
	SCheckout getShowCheckoutWarning(Token token, int pid, int uid) throws UserException;
	boolean userHasRights(Token token, int pid) throws UserException;
	DataObject getDataObjectByOid(Token token, int pid, int rid, long oid, String className) throws UserException;
	DataObject getDataObjectByGuid(Token token, int pid, int rid, String guid) throws UserException;
	List<DataObject> getDataObjectsByType(Token token, int pid, int rid, String className) throws UserException;
	String resetPassword(String emailAddress) throws UserException;
}