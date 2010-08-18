package org.bimserver;

/******************************************************************************
 * (c) Copyright bimserver.org 2009
 * Licensed under GNU GPLvDEADLOCK_RETRIES
 * http://www.gnu.org/licenses/gpl-DEADLOCK_RETRIES.0.txt
 * For more information mail to license@bimserver.org
 *
 * Bimserver.org is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version DEADLOCK_RETRIES of the License, or
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

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.activation.DataHandler;
import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.WebServiceContext;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.database.BimDatabase;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.ifc.file.compare.CompareResult;
import org.bimserver.ifc.file.reader.FastIfcFileReader;
import org.bimserver.ifc.file.reader.IncorrectIfcFileException;
import org.bimserver.services.TokenManager;
import org.bimserver.shared.ChangeSet;
import org.bimserver.shared.ChangeSetResult;
import org.bimserver.shared.CheckinResult;
import org.bimserver.shared.SCheckoutList;
import org.bimserver.shared.CheckoutResult;
import org.bimserver.shared.ClassList;
import org.bimserver.shared.DatabaseInformation;
import org.bimserver.shared.ProjectList;
import org.bimserver.shared.ResultType;
import org.bimserver.shared.SGeoTag;
import org.bimserver.shared.SProject;
import org.bimserver.shared.SRevision;
import org.bimserver.shared.SRevisionList;
import org.bimserver.shared.SRevisionSummary;
import org.bimserver.shared.SUser;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.shared.Token;
import org.bimserver.shared.UserException;
import org.bimserver.shared.UserList;
import org.bimserver.utils.Hashers;

public class Service implements ServiceInterface {
	private static final int DEADLOCK_RETRIES = 10;
	private final SchemaDefinition schema;
	private final TokenManager tokenManager;
	private final BimDatabase bimDatabase;
	private final BimDatabaseActionFactory bimDatabaseActionFactory = new BimDatabaseActionFactory();
	private final EmfSerializerFactory emfSerializerFactory;

	@Resource
	public WebServiceContext context;

	public Service(BimDatabase bimDatabase, EmfSerializerFactory emfSerializerFactory, SchemaDefinition schema, TokenManager tokenManager) {
		this.bimDatabase = bimDatabase;
		this.emfSerializerFactory = emfSerializerFactory;
		this.schema = schema;
		this.tokenManager = tokenManager;
	}

	@Override
	public CheckinResult checkin(Token token, int pid, String comment, long fileSize, DataHandler ifcFile) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		FastIfcFileReader fastIfcFileReader = new FastIfcFileReader(schema);
		CheckinResult result = new CheckinResult();
		try {
			fastIfcFileReader.read(ifcFile.getInputStream(), fileSize);
		} catch (IncorrectIfcFileException e) {
			throw new UserException("Invalid IFC File", e);
		} catch (Exception e) {
			throw new UserException("Invalid IFC File", e);
		}
		BimDatabaseAction<ConcreteRevision> action = bimDatabaseActionFactory.createCheckinAction(fastIfcFileReader.getModel(), pid, tokenManager.getUid(token),
				comment);
		try {
			ConcreteRevision revision = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			result.setRevisionNr(revision.getId());
			result.setProjectName(revision.getProject().getName());
			return result;
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserException("Unknown error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public CheckoutResult checkoutLastRevision(Token token, int pid, ResultType resultType) throws UserException {
		return checkout(token, pid, -1, resultType);
	}

	@Override
	public CheckoutResult checkout(Token token, int pid, int rid, ResultType resultType) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<EmfModel<Long>> action = bimDatabaseActionFactory.createCheckoutAction(pid, tokenManager.getUid(token), rid);
		try {
			return convertModelToCheckoutResult(session.executeAndCommitAction(action, DEADLOCK_RETRIES), resultType);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public int addUser(Token token, String username, String password, String name) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Integer> action = bimDatabaseActionFactory.createAddUserAction(username, password, name, UserType.USER, tokenManager.getUid(token));
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public int addProject(Token token, String projectName, SGeoTag geoTag) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Integer> action = bimDatabaseActionFactory.createAddProjectAction(projectName, tokenManager.getUid(token), geoTag);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addUserToProject(Token token, int uid, int pid) throws UserException {
		try {
			BimDatabaseSession session = bimDatabase.createSession();
			BimDatabaseAction<Boolean> action = bimDatabaseActionFactory.createAddUserToProjectAction(uid, pid);
			try {
				return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			} catch (BimDatabaseException e) {
				throw new UserException("Database error", e);
			} finally {
				session.close();
			}
		} catch (UserException e) {
			throw e;
		} catch (Exception e) {
			throw new UserException("Unknown error", e);
		}
	}

	@Override
	public ProjectList getAllProjects(Token token) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Set<Project>> action = bimDatabaseActionFactory.createGetAllProjectsAction(tokenManager.getUid(token));
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SRevisionList getAllRevisionsOfProject(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Set<VirtualRevision>> action = bimDatabaseActionFactory.createGetAllRevisionsOfProjectAction(pid);
		try {
			return ObjectConverter.convertVirtualRevisionSet(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SRevision getLastRevision(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<VirtualRevision> action = bimDatabaseActionFactory.createGetLastRevisionAction(pid);
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SCheckoutList getAllCheckoutsOfProject(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Set<Checkout>> action = bimDatabaseActionFactory.createGetAllCheckoutsOfProjectAction(pid);
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public UserList getAllUsers(Token token) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Set<User>> action = bimDatabaseActionFactory.createGetAllUsersAction(tokenManager.getUid(token));
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public Token login(String username, String password) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<User> action = bimDatabaseActionFactory.createGetUserByNameAction(username);
		try {
			User user = session.executeAction(action, DEADLOCK_RETRIES);
			if (user != null && user.getPassword().equals(Hashers.getSha256Hash(password))) {
				if (user.getState() == ObjectState.DELETED) {
					throw new UserException("User account has been deleted");
				}
				BimDatabaseSession session2 = bimDatabase.createSession();
				try {
					session2.updateLastActive(user.getId());
					try {
						session2.commit();
					} catch (BimDeadlockException e) {
						e.printStackTrace();
					}
				} finally {
					session2.close();
				}
				return tokenManager.newToken(user.getId());
			} else {
				return null;
			}
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	public SUser getUserById(Token token, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<User> action = bimDatabaseActionFactory.createGetUserByIdAction(uid, tokenManager.getUid(token));
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SCheckoutList getAllCheckoutsByUser(Token token, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Set<Checkout>> action = bimDatabaseActionFactory.createGetAllCheckoutsByUserAction(uid);
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SRevisionList getAllRevisionsByUser(Token token, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Set<ConcreteRevision>> action = bimDatabaseActionFactory.createGetAllRevisionsByUserAction(uid);
		try {
			return ObjectConverter.convertConcreteRevisionSet(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SRevision getRevision(Token token, int pid, int rid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<VirtualRevision> action = bimDatabaseActionFactory.createGetRevisionAction(pid, rid, tokenManager.getUid(token));
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SCheckoutList getAllCheckoutsOfRevision(Token token, int pid, int rid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Set<Checkout>> action = bimDatabaseActionFactory.createGetAllCheckoutsOfRevisionAction(pid, rid);
		try {
			return ObjectConverter.convert(session.executeAndCommitAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	public CheckoutResult download(Token token, int pid, int rid, ResultType resultType) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<EmfModel<Long>> action = bimDatabaseActionFactory.createDownloadAction(pid, rid, tokenManager.getUid(token));
		try {
			EmfModel<Long> emfModel = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			CheckoutResult checkoutResult = convertModelToCheckoutResult(emfModel, resultType);
			return checkoutResult;
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteProject(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = bimDatabaseActionFactory.createDeleteProjectAction(pid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteUser(Token token, int actingUid, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = bimDatabaseActionFactory.createDeleteUserAction(actingUid, uid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	public UserList getAllNonAuthorizedUsersOfProject(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		BimDatabaseAction<Set<User>> action = bimDatabaseActionFactory.createGetAllNonAuthorizedUsersOfProjectAction(pid);
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public UserList getAllAuthorizedUsersOfProject(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		BimDatabaseAction<Set<User>> action = bimDatabaseActionFactory.createGetAllAuthorizedUsersOfProjectAction(pid);
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean removeUserFromProject(Token token, int uid, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = bimDatabaseActionFactory.createRemoveUserFromProjectAction(uid, pid, tokenManager.getUid(token));
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SProject getProjectById(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Project> action = bimDatabaseActionFactory.createGetProjectByIdAction(pid, tokenManager.getUid(token));
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public ChangeSetResult processChangeSet(Token token, ChangeSet changeSet, int pid, String comment) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<ChangeSetResult> action = bimDatabaseActionFactory.createProcessChangeSetAction(changeSet, pid, tokenManager.getUid(token), comment);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public CheckoutResult downloadByOid(Token token, int pid, int rid, long oid, ResultType resultType) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<EmfModel<Long>> action = bimDatabaseActionFactory.createDownloadByOidAction(pid, rid, oid, tokenManager.getUid(token));
		try {
			EmfModel<Long> emfModel = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			return convertModelToCheckoutResult(emfModel, resultType);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error " + e.getMessage(), e);
		} finally {
			session.close();
		}
	}

	private CheckoutResult convertModelToCheckoutResult(EmfModel<Long> model, ResultType resultType) throws UserException {
		CheckoutResult checkoutResult = new CheckoutResult();
		if (model.isValid()) {
			EmfSerializer serializer = emfSerializerFactory.create(resultType, model);
			checkoutResult.setProjectName(model.getProjectName());
			checkoutResult.setRevisionNr(model.getRevisionNr());
			checkoutResult.setFile(new DataHandler(serializer));
		}
		return checkoutResult;
	}

	@Override
	public CheckoutResult downloadOfType(Token token, int pid, int rid, String className, ResultType resultType) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<EmfModel<Long>> action = bimDatabaseActionFactory.createDownloadOfTypeAction(pid, rid, className, tokenManager.getUid(token));
		try {
			EmfModel<Long> emfModel = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			return convertModelToCheckoutResult(emfModel, resultType);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public ClassList getAvailableClasses(Token token) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<ClassList> action = bimDatabaseActionFactory.createGetAvailableClassesAction();
		try {
			return session.executeAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public ProjectList getProjectsOfUser(Token token, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<List<Project>> action = bimDatabaseActionFactory.createGetProjectsOfUserAction(uid);
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public DatabaseInformation getDatabaseInformation(Token token) throws UserException {
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		BimDatabaseAction<DatabaseInformation> action = bimDatabaseActionFactory.createGetDatabaseInformationAction();
		try {
			return session.executeAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	public TokenManager getTokenManager() {
		return tokenManager;
	}

	@Override
	public Token createAnonymousToken() throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<User> action = bimDatabaseActionFactory.createGetUserByNameAction("anonymous");
		try {
			User user = session.executeAction(action, DEADLOCK_RETRIES);
			return tokenManager.newToken(user.getId());
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public CheckoutResult downloadByGuid(Token token, int pid, int rid, String guid, ResultType resultType) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<EmfModel<Long>> action = bimDatabaseActionFactory.createDownloadByGuidAction(pid, rid, guid, tokenManager.getUid(token));
		try {
			EmfModel<Long> emfModel = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			return convertModelToCheckoutResult(emfModel, resultType);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public ChangeSetResult processChangeSetFile(Token token, int pid, String comment, DataHandler changeSetFile) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(ChangeSet.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			ChangeSet changeSet = (ChangeSet) unmarshaller.unmarshal(changeSetFile.getInputStream());
			BimDatabaseAction<ChangeSetResult> action = bimDatabaseActionFactory.createProcessChangeSetAction(changeSet, pid, tokenManager.getUid(token), comment);
			try {
				return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			} catch (Exception e) {
				throw new UserException("Database error", e);
			} finally {
				session.close();
			}
		} catch (JAXBException e1) {
			throw new UserException("Error", e1);
		} catch (IOException e) {
			throw new UserException("Error", e);
		}
	}

	@Override
	public void ping() {
	}

	@Override
	public SUser getLoggedInUser(Token token) throws UserException {
		return getUserById(token, tokenManager.getUid(token));
	}

	@Override
	public ProjectList getAllNonAuthorizedProjectsOfUser(Token token, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		BimDatabaseAction<Set<Project>> action = bimDatabaseActionFactory.createGetAllNonAuthorizedProjectstOfUserAction(uid);
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SUser getUserOfToken(Token token) throws UserException {
		return getUserById(token, tokenManager.getUid(token));
	}

	@Override
	public void logout(Token token) {
		tokenManager.remove(token);
	}

	@Override
	public boolean changePassword(Token token, int uid, String oldPassword, String newPassword) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = bimDatabaseActionFactory.createChangePasswordAction(uid, oldPassword, newPassword, tokenManager.getUid(token));
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SUser getUserByUserName(String username) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<User> action = bimDatabaseActionFactory.createGetUserByNameAction(username);
		try {
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	public Token loginAsAdmin() throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<User> action = bimDatabaseActionFactory.createGetUserByNameAction("admin");
		try {
			User user = session.executeAction(action, DEADLOCK_RETRIES);
			if (user != null) {
				return tokenManager.newToken(user.getId());
			} else {
				return null;
			}
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean undeleteProject(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = bimDatabaseActionFactory.createUndeleteProjectAction(pid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean undeleteUser(Token token, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = bimDatabaseActionFactory.createUndeleteUserAction(uid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public int addProject(Token token, String projectName, int parentProjectId, SGeoTag geoTag) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Integer> action = bimDatabaseActionFactory.createAddProjectAction(projectName, parentProjectId, tokenManager.getUid(token), geoTag);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateProject(Token token, int pid, String description, SGeoTag geoTag) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Void> action = bimDatabaseActionFactory.createUpdateProjectAction(pid, description, geoTag);
		try {
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}		
	}

	@Override
	public CompareResult compare(Token token, int pid, int uid, int rid1, int rid2) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<CompareResult> action = bimDatabaseActionFactory.createCompareAction(pid, uid, rid1, rid2);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}		
	}

	@Override
	public SRevisionSummary getRevisionSummary(Token token, int pid, int rid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<SRevisionSummary> action = bimDatabaseActionFactory.createGetRevisionSummaryAction(pid, rid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}		
	}

	@Override
	public boolean userHasCheckinRights(Token token, int uid, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = bimDatabaseActionFactory.createUserHasCheckinRights(uid, pid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}		
	}
}