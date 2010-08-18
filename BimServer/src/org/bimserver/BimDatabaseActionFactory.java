package org.bimserver;

import java.util.List;
import java.util.Set;

import org.bimserver.database.actions.AddProjectDatabaseAction;
import org.bimserver.database.actions.AddUserDatabaseAction;
import org.bimserver.database.actions.AddUserToProjectDatabaseAction;
import org.bimserver.database.actions.ChangePasswordDatabaseAction;
import org.bimserver.database.actions.CheckinDatabaseAction;
import org.bimserver.database.actions.CheckoutDatabaseAction;
import org.bimserver.database.actions.CompareDatabaseAction;
import org.bimserver.database.actions.DeleteProjectDatabaseAction;
import org.bimserver.database.actions.DeleteUserDatabaseAction;
import org.bimserver.database.actions.DownloadByGuidDatabaseAction;
import org.bimserver.database.actions.DownloadByOidDatabaseAction;
import org.bimserver.database.actions.DownloadDatabaseAction;
import org.bimserver.database.actions.DownloadOfTypeDatabaseAction;
import org.bimserver.database.actions.GetAllAuthorizedUsersOfProjectDatabaseAction;
import org.bimserver.database.actions.GetAllCheckoutsByUserDatabaseAction;
import org.bimserver.database.actions.GetAllCheckoutsOfProjectDatabaseAction;
import org.bimserver.database.actions.GetAllCheckoutsOfRevisionDatabaseAction;
import org.bimserver.database.actions.GetAllNonAuthorizedProjectsOfUserDatabaseAction;
import org.bimserver.database.actions.GetAllNonAuthorizedUsersOfProjectDatabaseAction;
import org.bimserver.database.actions.GetAllProjectsDatabaseAction;
import org.bimserver.database.actions.GetAllRevisionsByUserDatabaseAction;
import org.bimserver.database.actions.GetAllRevisionsOfProjectDatabaseAction;
import org.bimserver.database.actions.GetAllUsersDatabaseAction;
import org.bimserver.database.actions.GetAvailableClassesDatabaseAction;
import org.bimserver.database.actions.GetDatabaseInformationAction;
import org.bimserver.database.actions.GetLastRevisionDatabaseAction;
import org.bimserver.database.actions.GetProjectByIdDatabaseAction;
import org.bimserver.database.actions.GetProjectsOfUserDatabaseAction;
import org.bimserver.database.actions.GetRevisionDatabaseAction;
import org.bimserver.database.actions.GetRevisionSummaryDatabaseAction;
import org.bimserver.database.actions.GetUserByIdDatabaseAction;
import org.bimserver.database.actions.GetUserByNameDatabaseAction;
import org.bimserver.database.actions.ProcessChangeSetDatabaseAction;
import org.bimserver.database.actions.RemoveUserFromProjectDatabaseAction;
import org.bimserver.database.actions.UndeleteProjectDatabaseAction;
import org.bimserver.database.actions.UndeleteUserDatabaseAction;
import org.bimserver.database.actions.UserHasCheckinRightsDatabaseAction;
import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.file.compare.CompareResult;
import org.bimserver.shared.ChangeSet;
import org.bimserver.shared.ChangeSetResult;
import org.bimserver.shared.ClassList;
import org.bimserver.shared.DatabaseInformation;
import org.bimserver.shared.SGeoTag;
import org.bimserver.shared.SRevisionSummary;

public class BimDatabaseActionFactory {

	public BimDatabaseAction<Boolean> createDeleteUserAction(int actingUid, int uid) {
		return new DeleteUserDatabaseAction(actingUid, uid);
	}

	public BimDatabaseAction<Set<User>> createGetAllNonAuthorizedUsersOfProjectAction(int pid) {
		return new GetAllNonAuthorizedUsersOfProjectDatabaseAction(pid);
	}

	public BimDatabaseAction<Set<User>> createGetAllAuthorizedUsersOfProjectAction(int pid) {
		return new GetAllAuthorizedUsersOfProjectDatabaseAction(pid);
	}

	public BimDatabaseAction<Boolean> createRemoveUserFromProjectAction(int uid, int pid, int actingUid) {
		return new RemoveUserFromProjectDatabaseAction(uid, pid, actingUid);
	}

	public BimDatabaseAction<Project> createGetProjectByIdAction(int pid, int uid) {
		return new GetProjectByIdDatabaseAction(pid, uid);
	}

	public BimDatabaseAction<ChangeSetResult> createProcessChangeSetAction(ChangeSet changeSet, int pid, int uid, String comment) {
		return new ProcessChangeSetDatabaseAction(changeSet, pid, uid, comment);
	}

	public BimDatabaseAction<Boolean> createDeleteProjectAction(int pid) {
		return new DeleteProjectDatabaseAction(pid);
	}

	public BimDatabaseAction<EmfModel<Long>> createDownloadByOidAction(int pid, int rid, long oid, int uid) {
		return new DownloadByOidDatabaseAction(pid, rid, oid, uid);
	}

	public BimDatabaseAction<EmfModel<Long>> createDownloadOfTypeAction(int pid, int rid, String className, int uid) {
		return new DownloadOfTypeDatabaseAction(pid, rid, className, uid);
	}

	public BimDatabaseAction<ClassList> createGetAvailableClassesAction() {
		return new GetAvailableClassesDatabaseAction();
	}

	public BimDatabaseAction<List<Project>> createGetProjectsOfUserAction(int uid) {
		return new GetProjectsOfUserDatabaseAction(uid);
	}

	public BimDatabaseAction<DatabaseInformation> createGetDatabaseInformationAction() {
		return new GetDatabaseInformationAction();
	}

	public BimDatabaseAction<User> createGetUserByNameAction(String username) {
		return new GetUserByNameDatabaseAction(username);
	}

	public BimDatabaseAction<EmfModel<Long>> createDownloadByGuidAction(int pid, int rid, String guid, int uid) {
		return new DownloadByGuidDatabaseAction(pid, rid, guid, uid);
	}

	public BimDatabaseAction<EmfModel<Long>> createDownloadAction(int pid, int rid, int uid) {
		return new DownloadDatabaseAction(pid, rid, uid);
	}

	public BimDatabaseAction<Set<Checkout>> createGetAllCheckoutsOfRevisionAction(int pid, int rid) {
		return new GetAllCheckoutsOfRevisionDatabaseAction(pid, rid);
	}

	public BimDatabaseAction<VirtualRevision> createGetRevisionAction(int pid, int rid, int uid) {
		return new GetRevisionDatabaseAction(pid, rid, uid);
	}

	public BimDatabaseAction<Set<ConcreteRevision>> createGetAllRevisionsByUserAction(int uid) {
		return new GetAllRevisionsByUserDatabaseAction(uid);
	}

	public BimDatabaseAction<Set<Checkout>> createGetAllCheckoutsByUserAction(int uid) {
		return new GetAllCheckoutsByUserDatabaseAction(uid);
	}

	public BimDatabaseAction<User> createGetUserByIdAction(int uid, int actingUid) {
		return new GetUserByIdDatabaseAction(uid, actingUid);
	}

	public BimDatabaseAction<Set<User>> createGetAllUsersAction(int actingUid) {
		return new GetAllUsersDatabaseAction(actingUid);
	}

	public BimDatabaseAction<Set<Checkout>> createGetAllCheckoutsOfProjectAction(int pid) {
		return new GetAllCheckoutsOfProjectDatabaseAction(pid);
	}

	public BimDatabaseAction<VirtualRevision> createGetLastRevisionAction(int pid) {
		return new GetLastRevisionDatabaseAction(pid);
	}

	public BimDatabaseAction<Set<VirtualRevision>> createGetAllRevisionsOfProjectAction(int pid) {
		return new GetAllRevisionsOfProjectDatabaseAction(pid);
	}

	public BimDatabaseAction<Set<Project>> createGetAllProjectsAction(int uid) {
		return new GetAllProjectsDatabaseAction(uid);
	}

	public BimDatabaseAction<Boolean> createAddUserToProjectAction(int uid, int pid) {
		return new AddUserToProjectDatabaseAction(uid, pid);
	}

	public BimDatabaseAction<Integer> createAddProjectAction(String projectName, int owningUid, SGeoTag geoTag) {
		return new AddProjectDatabaseAction(projectName, owningUid, geoTag);
	}

	public BimDatabaseAction<Integer> createAddProjectAction(String projectName, int parentProjectId, int owningUid, SGeoTag geoTag) {
		return new AddProjectDatabaseAction(projectName, parentProjectId, owningUid, geoTag);
	}

	public BimDatabaseAction<Integer> createAddUserAction(String username, String password, String name, UserType userType, int createrUid) {
		return new AddUserDatabaseAction(username, password, name, userType, createrUid);
	}

	public BimDatabaseAction<EmfModel<Long>> createCheckoutAction(int pid, int uid, int rid) {
		return new CheckoutDatabaseAction(pid, uid, rid);
	}

	public BimDatabaseAction<ConcreteRevision> createCheckinAction(EmfModel<Long> emfModel, int pid, int uid, String comment) {
		return new CheckinDatabaseAction(emfModel, pid, uid, comment);
	}

	public BimDatabaseAction<Set<Project>> createGetAllNonAuthorizedProjectstOfUserAction(int uid) {
		return new GetAllNonAuthorizedProjectsOfUserDatabaseAction(uid);
	}

	public BimDatabaseAction<Boolean> createChangePasswordAction(int uid, String oldPassword, String newPassword, int actingUid) {
		return new ChangePasswordDatabaseAction(uid, oldPassword, newPassword, actingUid);
	}

	public BimDatabaseAction<Boolean> createUndeleteProjectAction(int pid) {
		return new UndeleteProjectDatabaseAction(pid);
	}

	public BimDatabaseAction<Boolean> createUndeleteUserAction(int uid) {
		return new UndeleteUserDatabaseAction(uid);
	}

	public BimDatabaseAction<Void> createUpdateProjectAction(int pid, String description, SGeoTag geoTag) {
		return new UpdateProjectDatabaseAction(pid, description, geoTag);
	}

	public BimDatabaseAction<CompareResult> createCompareAction(int pid, int uid, int rid1, int rid2) {
		return new CompareDatabaseAction(pid, uid, rid1, rid2);
	}

	public BimDatabaseAction<SRevisionSummary> createGetRevisionSummaryAction(int pid, int rid) {
		return new GetRevisionSummaryDatabaseAction(pid, rid);
	}

	public BimDatabaseAction<Boolean> createUserHasCheckinRights(int uid, int pid) {
		return new UserHasCheckinRightsDatabaseAction(uid, pid);
	}
}