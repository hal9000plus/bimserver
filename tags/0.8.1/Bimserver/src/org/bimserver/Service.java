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
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

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
import org.bimserver.database.actions.AddProjectDatabaseAction;
import org.bimserver.database.actions.AddUserDatabaseAction;
import org.bimserver.database.actions.AddUserToProjectDatabaseAction;
import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.database.actions.ChangePasswordDatabaseAction;
import org.bimserver.database.actions.CheckinPart1DatabaseAction;
import org.bimserver.database.actions.CheckinPart2DatabaseAction;
import org.bimserver.database.actions.CheckoutDatabaseAction;
import org.bimserver.database.actions.CompareDatabaseAction;
import org.bimserver.database.actions.DeleteProjectDatabaseAction;
import org.bimserver.database.actions.DeleteUserDatabaseAction;
import org.bimserver.database.actions.DownloadByGuidDatabaseAction;
import org.bimserver.database.actions.DownloadByOidDatabaseAction;
import org.bimserver.database.actions.DownloadDatabaseAction;
import org.bimserver.database.actions.DownloadOfTypeDatabaseAction;
import org.bimserver.database.actions.DownloadProjectsDatabaseAction;
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
import org.bimserver.database.actions.GetDataObjectByGuidDatabaseAction;
import org.bimserver.database.actions.GetDataObjectByOidDatabaseAction;
import org.bimserver.database.actions.GetDataObjectsByTypeDatabaseAction;
import org.bimserver.database.actions.GetDatabaseInformationAction;
import org.bimserver.database.actions.GetLastRevisionDatabaseAction;
import org.bimserver.database.actions.GetProjectByIdDatabaseAction;
import org.bimserver.database.actions.GetProjectsOfUserDatabaseAction;
import org.bimserver.database.actions.GetRevisionDatabaseAction;
import org.bimserver.database.actions.GetRevisionSummaryDatabaseAction;
import org.bimserver.database.actions.GetShowCheckoutWarningDatabaseAction;
import org.bimserver.database.actions.GetUserByIdDatabaseAction;
import org.bimserver.database.actions.GetUserByNameDatabaseAction;
import org.bimserver.database.actions.ProcessChangeSetDatabaseAction;
import org.bimserver.database.actions.RemoveUserFromProjectDatabaseAction;
import org.bimserver.database.actions.ResetPasswordDatabaseAction;
import org.bimserver.database.actions.UndeleteProjectDatabaseAction;
import org.bimserver.database.actions.UndeleteUserDatabaseAction;
import org.bimserver.database.actions.UpdateProjectDatabaseAction;
import org.bimserver.database.actions.UserHasCheckinRightsDatabaseAction;
import org.bimserver.database.actions.UserHasRightsDatabaseAction;
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
import org.bimserver.shared.CheckoutResult;
import org.bimserver.shared.ClassList;
import org.bimserver.shared.DataObject;
import org.bimserver.shared.DatabaseInformation;
import org.bimserver.shared.ProjectList;
import org.bimserver.shared.ResultType;
import org.bimserver.shared.SCheckout;
import org.bimserver.shared.SCheckoutList;
import org.bimserver.shared.SCompareResult;
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
	public static final int DEADLOCK_RETRIES = 10;
	private final SchemaDefinition schema;
	private final TokenManager tokenManager;
	private final BimDatabase bimDatabase;
	private final EmfSerializerFactory emfSerializerFactory;
	private final LongActionManager longActionManager = new LongActionManager();

	@Resource
	public WebServiceContext context;

	public Service(BimDatabase bimDatabase, EmfSerializerFactory emfSerializerFactory, SchemaDefinition schema, TokenManager tokenManager) {
		this.bimDatabase = bimDatabase;
		this.emfSerializerFactory = emfSerializerFactory;
		this.schema = schema;
		this.tokenManager = tokenManager;
		this.longActionManager.start();
	}

	@Override
	public CheckinResult checkin(final Token token, final int pid, final String comment, long fileSize, DataHandler ifcFile) throws UserException {
		final BimDatabaseSession session = bimDatabase.createSession();
		try {
			InputStream inputStream = ifcFile.getInputStream();
			if (ifcFile.getName() != null && ifcFile.getName().endsWith(".zip")) {
				ZipInputStream zipInputStream = new ZipInputStream(inputStream);
				ZipEntry nextEntry = zipInputStream.getNextEntry();
				if (nextEntry == null) {
					throw new UserException("Zip files must contain exactly one IFC-file, this zip-file looks empty");
				}
				if (nextEntry.getName().endsWith(".ifc")) {
					EmfModel<Long> model = readModel(zipInputStream, fileSize);
					if (zipInputStream.getNextEntry() != null) {
						zipInputStream.close();
						throw new UserException("Zip files may only contain one IFC-file, this zip-file contains more files");
					} else {
						zipInputStream.close();
						CheckinResult processCheckin = processCheckin(token, pid, comment, fileSize, session, model);
						return processCheckin;
					}
				} else {
					throw new UserException("Zip files must contain exactly one IFC-file, this zip-file seems to have one or more non-IFC files");
				}
			} else if ((ifcFile.getName() != null && ifcFile.getName().endsWith(".ifc")) || ifcFile.getName() == null) {
				EmfModel<Long> model = readModel(ifcFile.getInputStream(), fileSize);
				CheckinResult processCheckin = processCheckin(token, pid, comment, fileSize, session, model);
				inputStream.close();
				return processCheckin;
			} else {
				throw new UserException("Uploaded file does not seem to be a valid IFC file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private EmfModel<Long> readModel(InputStream inputStream, long fileSize) throws UserException {
		FastIfcFileReader fastIfcFileReader = new FastIfcFileReader(schema);
		try {
			fastIfcFileReader.read(inputStream, fileSize);
			return fastIfcFileReader.getModel();
		} catch (IncorrectIfcFileException e) {
			throw new UserException("Invalid IFC File", e);
		} catch (Exception e) {
			throw new UserException("Invalid IFC File", e);
		} catch (OutOfMemoryError e) {
			e.printStackTrace();
			ServerInfo.setErrorMessage(e.getMessage());
			throw new UserException("Out of memory.", e);
		}
	}

	private CheckinResult processCheckin(final Token token, final int pid, final String comment, long fileSize, final BimDatabaseSession session, EmfModel<Long> model)
			throws UserException {
		BimDatabaseAction<ConcreteRevision> action = new CheckinPart1DatabaseAction(pid, tokenManager.getUid(token), model, comment);
		try {
			ConcreteRevision revision = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			session.close();
			BimDatabaseAction<Void> createCheckinAction = new CheckinPart2DatabaseAction(model, revision.getProject().getId(), revision.getId());
			CheckinResult result = new CheckinResult();
			result.setRevisionNr(revision.getId());
			result.setProjectName(revision.getProject().getName());
			longActionManager.start(new LongCheckinAction(bimDatabase, createCheckinAction));
			return result;
		} catch (UserException e) {
			throw e;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public CheckoutResult checkoutLastRevision(Token token, int pid, ResultType resultType) throws UserException {
		return checkout(token, pid, -1, resultType);
	}

	@Override
	public CheckoutResult checkout(Token token, int pid, int rid, ResultType resultType) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<EmfModel<Long>> action = new CheckoutDatabaseAction(pid, tokenManager.getUid(token), rid);
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
		BimDatabaseAction<Integer> action = new AddUserDatabaseAction(username, password, name, UserType.USER, tokenManager.getUid(token));
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
		BimDatabaseAction<Integer> action = new AddProjectDatabaseAction(projectName, tokenManager.getUid(token), geoTag);
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
			BimDatabaseAction<Boolean> action = new AddUserToProjectDatabaseAction(tokenManager.getUid(token), uid, pid);
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
		BimDatabaseAction<Set<Project>> action = new GetAllProjectsDatabaseAction(tokenManager.getUid(token));
		try {
			User user = session.getUserById(getUserOfToken(token).getId());
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES), user);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} catch (BimDeadlockException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SRevisionList getAllRevisionsOfProject(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Set<VirtualRevision>> action = new GetAllRevisionsOfProjectDatabaseAction(pid);
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
		BimDatabaseAction<VirtualRevision> action = new GetLastRevisionDatabaseAction(pid);
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
		BimDatabaseAction<Set<Checkout>> action = new GetAllCheckoutsOfProjectDatabaseAction(pid);
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
		BimDatabaseAction<Set<User>> action = new GetAllUsersDatabaseAction(tokenManager.getUid(token));
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
		BimDatabaseAction<User> action = new GetUserByNameDatabaseAction(username);
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
		BimDatabaseAction<User> action = new GetUserByIdDatabaseAction(uid, tokenManager.getUid(token));
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
		BimDatabaseAction<Set<Checkout>> action = new GetAllCheckoutsByUserDatabaseAction(uid);
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
		BimDatabaseAction<Set<ConcreteRevision>> action = new GetAllRevisionsByUserDatabaseAction(uid);
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
		BimDatabaseAction<VirtualRevision> action = new GetRevisionDatabaseAction(pid, rid, tokenManager.getUid(token));
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
		BimDatabaseAction<Set<Checkout>> action = new GetAllCheckoutsOfRevisionDatabaseAction(pid, rid);
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
		BimDatabaseAction<EmfModel<Long>> action = new DownloadDatabaseAction(pid, rid, tokenManager.getUid(token));
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
		BimDatabaseAction<Boolean> action = new DeleteProjectDatabaseAction(pid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteUser(Token token, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = new DeleteUserDatabaseAction(tokenManager.getUid(token), uid);
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
		BimDatabaseAction<Set<User>> action = new GetAllNonAuthorizedUsersOfProjectDatabaseAction(pid);
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
		BimDatabaseAction<Set<User>> action = new GetAllAuthorizedUsersOfProjectDatabaseAction(pid);
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
		BimDatabaseAction<Boolean> action = new RemoveUserFromProjectDatabaseAction(uid, pid, tokenManager.getUid(token));
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
		BimDatabaseAction<Project> action = new GetProjectByIdDatabaseAction(pid, tokenManager.getUid(token));
		try {
			User user = session.getUserById(getUserOfToken(token).getId());
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES), user);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} catch (BimDeadlockException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public ChangeSetResult processChangeSet(Token token, ChangeSet changeSet, int pid, String comment) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<ChangeSetResult> action = new ProcessChangeSetDatabaseAction(changeSet, pid, tokenManager.getUid(token), comment);
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
		BimDatabaseAction<EmfModel<Long>> action = new DownloadByOidDatabaseAction(pid, rid, oid, tokenManager.getUid(token));
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
		BimDatabaseAction<EmfModel<Long>> action = new DownloadOfTypeDatabaseAction(pid, rid, className, tokenManager.getUid(token));
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
		BimDatabaseAction<ClassList> action = new GetAvailableClassesDatabaseAction();
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
		BimDatabaseAction<List<Project>> action = new GetProjectsOfUserDatabaseAction(uid);
		try {
			User user = session.getUserById(getUserOfToken(token).getId());
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES), user);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} catch (BimDeadlockException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public DatabaseInformation getDatabaseInformation(Token token) throws UserException {
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		BimDatabaseAction<DatabaseInformation> action = new GetDatabaseInformationAction();
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
		BimDatabaseAction<User> action = new GetUserByNameDatabaseAction("anonymous");
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
		BimDatabaseAction<EmfModel<Long>> action = new DownloadByGuidDatabaseAction(pid, rid, guid, tokenManager.getUid(token));
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
			BimDatabaseAction<ChangeSetResult> action = new ProcessChangeSetDatabaseAction(changeSet, pid, tokenManager.getUid(token), comment);
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
		BimDatabaseAction<Set<Project>> action = new GetAllNonAuthorizedProjectsOfUserDatabaseAction(uid);
		try {
			User user = session.getUserById(getUserOfToken(token).getId());
			return ObjectConverter.convert(session.executeAction(action, DEADLOCK_RETRIES), user);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} catch (BimDeadlockException e) {
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
		BimDatabaseAction<Boolean> action = new ChangePasswordDatabaseAction(uid, oldPassword, newPassword, tokenManager.getUid(token));
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
		BimDatabaseAction<User> action = new GetUserByNameDatabaseAction(username);
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
		BimDatabaseAction<User> action = new GetUserByNameDatabaseAction("admin");
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
		BimDatabaseAction<Boolean> action = new UndeleteProjectDatabaseAction(pid);
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
		BimDatabaseAction<Boolean> action = new UndeleteUserDatabaseAction(uid);
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
		BimDatabaseAction<Integer> action = new AddProjectDatabaseAction(projectName, parentProjectId, tokenManager.getUid(token), geoTag);
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
		BimDatabaseAction<Void> action = new UpdateProjectDatabaseAction(pid, description, geoTag);
		try {
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SCompareResult compare(Token token, int pid, int uid, int rid1, int rid2) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<CompareResult> action = new CompareDatabaseAction(pid, uid, rid1, rid2);
		try {
			return ObjectConverter.convert(session.executeAndCommitAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SRevisionSummary getRevisionSummary(Token token, int pid, int rid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<SRevisionSummary> action = new GetRevisionSummaryDatabaseAction(pid, rid);
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
		BimDatabaseAction<Boolean> action = new UserHasCheckinRightsDatabaseAction(uid, pid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SCheckout getShowCheckoutWarning(Token token, int pid, int uid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Checkout> action = new GetShowCheckoutWarningDatabaseAction(pid, uid);
		try {
			return ObjectConverter.convert(session.executeAndCommitAction(action, DEADLOCK_RETRIES));
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean userHasRights(Token token, int pid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<Boolean> action = new UserHasRightsDatabaseAction(getUserOfToken(token).getId(), pid);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public CheckoutResult downloadProjects(Token token, Map<Integer, Integer> pids, ResultType resultType) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<EmfModel<Long>> action = new DownloadProjectsDatabaseAction(pids, tokenManager.getUid(token));
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
	public DataObject getDataObjectByOid(Token token, int pid, int rid, long oid, String className) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<DataObject> action = new GetDataObjectByOidDatabaseAction(pid, rid, oid, session.getCidForClassName(className));
		try {
			DataObject dataObject = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			return dataObject;
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public DataObject getDataObjectByGuid(Token token, int pid, int rid, String guid) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<DataObject> action = new GetDataObjectByGuidDatabaseAction(pid, rid, guid);
		try {
			DataObject dataObject = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			return dataObject;
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<DataObject> getDataObjectsByType(Token token, int pid, int rid, String className) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<List<DataObject>> action = new GetDataObjectsByTypeDatabaseAction(pid, rid, className);
		try {
			List<DataObject> dataObjects = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			return dataObjects;
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}

	@Override
	public String resetPassword(String emailAddress) throws UserException {
		BimDatabaseSession session = bimDatabase.createSession();
		BimDatabaseAction<String> action = new ResetPasswordDatabaseAction(emailAddress);
		try {
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (BimDatabaseException e) {
			throw new UserException("Database error", e);
		} finally {
			session.close();
		}
	}
}