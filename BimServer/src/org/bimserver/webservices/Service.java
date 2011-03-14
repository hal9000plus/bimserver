package org.bimserver.webservices;

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
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.activation.DataHandler;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.ServerInfo;
import org.bimserver.database.BimDatabase;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.actions.AddProjectDatabaseAction;
import org.bimserver.database.actions.AddUserDatabaseAction;
import org.bimserver.database.actions.AddUserToProjectDatabaseAction;
import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.database.actions.ChangePasswordDatabaseAction;
import org.bimserver.database.actions.ChangeUserTypeDatabaseAction;
import org.bimserver.database.actions.CheckinDatabaseAction;
import org.bimserver.database.actions.CheckinPart1DatabaseAction;
import org.bimserver.database.actions.CheckinPart2DatabaseAction;
import org.bimserver.database.actions.CheckoutDatabaseAction;
import org.bimserver.database.actions.CompareDatabaseAction;
import org.bimserver.database.actions.DeleteProjectDatabaseAction;
import org.bimserver.database.actions.DeleteUserDatabaseAction;
import org.bimserver.database.actions.DownloadByGuidsDatabaseAction;
import org.bimserver.database.actions.DownloadByOidsDatabaseAction;
import org.bimserver.database.actions.DownloadOfTypeDatabaseAction;
import org.bimserver.database.actions.DownloadProjectsDatabaseAction;
import org.bimserver.database.actions.FindClashesDatabaseAction;
import org.bimserver.database.actions.GetAllAuthorizedUsersOfProjectDatabaseAction;
import org.bimserver.database.actions.GetAllCheckoutsByUserDatabaseAction;
import org.bimserver.database.actions.GetAllCheckoutsOfProjectDatabaseAction;
import org.bimserver.database.actions.GetAllCheckoutsOfRevisionDatabaseAction;
import org.bimserver.database.actions.GetAllNonAuthorizedProjectsOfUserDatabaseAction;
import org.bimserver.database.actions.GetAllNonAuthorizedUsersOfProjectDatabaseAction;
import org.bimserver.database.actions.GetAllProjectsDatabaseAction;
import org.bimserver.database.actions.GetAllReadableProjectsDatabaseAction;
import org.bimserver.database.actions.GetAllRevisionsByUserDatabaseAction;
import org.bimserver.database.actions.GetAllRevisionsOfProjectDatabaseAction;
import org.bimserver.database.actions.GetAllUsersDatabaseAction;
import org.bimserver.database.actions.GetAvailableClassesDatabaseAction;
import org.bimserver.database.actions.GetClashDetectionSettingsDatabaseAction;
import org.bimserver.database.actions.GetDataObjectByGuidDatabaseAction;
import org.bimserver.database.actions.GetDataObjectByOidDatabaseAction;
import org.bimserver.database.actions.GetDataObjectsByTypeDatabaseAction;
import org.bimserver.database.actions.GetDatabaseInformationAction;
import org.bimserver.database.actions.GetGeoTagDatabaseAction;
import org.bimserver.database.actions.GetLogsDatabaseAction;
import org.bimserver.database.actions.GetProjectByNameDatabaseAction;
import org.bimserver.database.actions.GetProjectByPoidDatabaseAction;
import org.bimserver.database.actions.GetRevisionDatabaseAction;
import org.bimserver.database.actions.GetRevisionSummaryDatabaseAction;
import org.bimserver.database.actions.GetShowCheckoutWarningsDatabaseAction;
import org.bimserver.database.actions.GetSubProjectsDatabaseAction;
import org.bimserver.database.actions.GetUserByNameDatabaseAction;
import org.bimserver.database.actions.GetUserByUoidDatabaseAction;
import org.bimserver.database.actions.RemoveUserFromProjectDatabaseAction;
import org.bimserver.database.actions.RequestPasswordChangeDatabaseAction;
import org.bimserver.database.actions.SendClashesEmailDatabaseAction;
import org.bimserver.database.actions.SetRevisionTagDatabaseAction;
import org.bimserver.database.actions.UndeleteProjectDatabaseAction;
import org.bimserver.database.actions.UndeleteUserDatabaseAction;
import org.bimserver.database.actions.UpdateClashDetectionSettingsDatabaseAction;
import org.bimserver.database.actions.UpdateGeoTagDatabaseAction;
import org.bimserver.database.actions.UpdateProjectDatabaseAction;
import org.bimserver.database.actions.UpdateRevisionDatabaseAction;
import org.bimserver.database.actions.UserHasCheckinRightsDatabaseAction;
import org.bimserver.database.actions.UserHasRightsDatabaseAction;
import org.bimserver.database.actions.ValidateUserDatabaseAction;
import org.bimserver.database.log.AccessMethod;
import org.bimserver.database.log.LogAction;
import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.ClashDetectionSettings;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.GeoTag;
import org.bimserver.database.store.ObjectState;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.Revision;
import org.bimserver.database.store.StoreFactory;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.emf.IdEObject;
import org.bimserver.exceptions.NoSerializerFoundException;
import org.bimserver.ifc.EmfSerializer;
import org.bimserver.ifc.FieldIgnoreMap;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.IfcModelSet;
import org.bimserver.ifc.SerializerException;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoot;
import org.bimserver.ifc.file.compare.CompareResult;
import org.bimserver.ifc.file.compare.CompareResult.Item;
import org.bimserver.ifc.file.compare.CompareResult.ObjectAdded;
import org.bimserver.ifc.file.compare.CompareResult.ObjectDeleted;
import org.bimserver.ifc.file.compare.CompareResult.ObjectModified;
import org.bimserver.ifc.file.reader.IfcStepDeserializer;
import org.bimserver.ifc.file.reader.IncorrectIfcFileException;
import org.bimserver.ifc.xml.reader.IfcXmlDeserializeException;
import org.bimserver.ifc.xml.reader.IfcXmlDeserializer;
import org.bimserver.ifcengine.IfcEngineFactory;
import org.bimserver.interfaces.objects.SAccessMethod;
import org.bimserver.interfaces.objects.SCheckout;
import org.bimserver.interfaces.objects.SClash;
import org.bimserver.interfaces.objects.SClashDetectionSettings;
import org.bimserver.interfaces.objects.SEidClash;
import org.bimserver.interfaces.objects.SGeoTag;
import org.bimserver.interfaces.objects.SGuidClash;
import org.bimserver.interfaces.objects.SLogAction;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.interfaces.objects.SRevision;
import org.bimserver.interfaces.objects.SUser;
import org.bimserver.interfaces.objects.SUserType;
import org.bimserver.longaction.CannotBeScheduledException;
import org.bimserver.longaction.LongActionManager;
import org.bimserver.longaction.LongCheckinAction;
import org.bimserver.longaction.LongDownloadAction;
import org.bimserver.mail.MailSystem;
import org.bimserver.merging.Merger;
import org.bimserver.rights.RightsManager;
import org.bimserver.serializers.EmfSerializerFactory;
import org.bimserver.settings.ServerSettings;
import org.bimserver.settings.SettingsSaveException;
import org.bimserver.shared.DatabaseInformation;
import org.bimserver.shared.ResultType;
import org.bimserver.shared.SCheckinResult;
import org.bimserver.shared.SCheckoutResult;
import org.bimserver.shared.SCompareResult;
import org.bimserver.shared.SDataObject;
import org.bimserver.shared.SDownloadResult;
import org.bimserver.shared.SLongAction;
import org.bimserver.shared.SRevisionSummary;
import org.bimserver.shared.SUserSession;
import org.bimserver.shared.ServerException;
import org.bimserver.shared.ServiceException;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.shared.Token;
import org.bimserver.shared.UserException;
import org.bimserver.shared.SCompareResult.SCompareType;
import org.bimserver.shared.SCompareResult.SObjectAdded;
import org.bimserver.shared.SCompareResult.SObjectModified;
import org.bimserver.shared.SCompareResult.SObjectRemoved;
import org.bimserver.tools.generators.GenerateUtils;
import org.bimserver.utils.FakeClosingInputStream;
import org.bimserver.utils.Hashers;
import org.bimserver.web.JspHelper;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service implements ServiceInterface {
	private static final int DEFAULT_LOGIN_ERROR_TIMEOUT = 3000;
	private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);
	public static final int DEADLOCK_RETRIES = 10;
	private final SchemaDefinition schema;
	private final BimDatabase bimDatabase;
	private final EmfSerializerFactory emfSerializerFactory;
	private final ServiceFactory serviceFactory;

	private final LongActionManager longActionManager;
	private final AccessMethod accessMethod;
	private final IfcEngineFactory ifcEngineFactory;
	private final FieldIgnoreMap fieldIgnoreMap;

	private long currentUoid = -1;
	private Date activeSince;
	private Date lastActive;
	private Token token;

	public Service(BimDatabase bimDatabase, EmfSerializerFactory emfSerializerFactory, SchemaDefinition schema,
			LongActionManager longActionManager, AccessMethod accessMethod, IfcEngineFactory ifcEngineFactory,
			ServiceFactory serviceFactory, FieldIgnoreMap fieldIgnoreMap) {
		this.bimDatabase = bimDatabase;
		this.emfSerializerFactory = emfSerializerFactory;
		this.schema = schema;
		this.longActionManager = longActionManager;
		this.accessMethod = accessMethod;
		this.ifcEngineFactory = ifcEngineFactory;
		this.serviceFactory = serviceFactory;
		this.fieldIgnoreMap = fieldIgnoreMap;
		activeSince = new Date();
		lastActive = new Date();
	}

	@Override
	public SCheckinResult checkinSync(final long poid, final String comment, long fileSize, DataHandler ifcFile, boolean merge)
			throws UserException, ServerException {
		requireAuthentication();
		return checkinInternal(poid, comment, fileSize, ifcFile, true, merge);
	}

	@Override
	public SCheckinResult checkinAsync(final long poid, final String comment, long fileSize, DataHandler ifcFile, boolean merge)
			throws UserException, ServerException {
		requireAuthentication();
		return checkinInternal(poid, comment, fileSize, ifcFile, false, merge);
	}

	private SCheckinResult checkinInternal(final long poid, final String comment, long fileSize, DataHandler ifcFile, boolean sync,
			boolean merge) throws UserException, ServerException {
		final BimDatabaseSession session = bimDatabase.createSession();
		try {
			InputStream inputStream = ifcFile.getInputStream();
			if (ifcFile.getName() != null
					&& (ifcFile.getName().toUpperCase().endsWith(".ZIP") || ifcFile.getName().toUpperCase().endsWith(".IFCZIP"))) {
				ZipInputStream zipInputStream = new ZipInputStream(inputStream);
				ZipEntry nextEntry = zipInputStream.getNextEntry();
				if (nextEntry == null) {
					throw new UserException("Zip files must contain exactly one IFC-file, this zip-file looks empty");
				}
				if (nextEntry.getName().toUpperCase().endsWith(".IFC") || nextEntry.getName().toUpperCase().endsWith(".IFCXML")) {
					IfcModel model = null;
					FakeClosingInputStream fakeClosingInputStream = new FakeClosingInputStream(zipInputStream);
					if (nextEntry.getName().toUpperCase().endsWith(".IFC")) {
						model = readIfcStepModel(fakeClosingInputStream, fileSize);
					} else if (nextEntry.getName().toUpperCase().endsWith(".IFCXML")) {
						model = readIfcXmlModel(fakeClosingInputStream, fileSize);
					}
					if (model.getSize() == 0) {
						throw new UserException("Uploaded file does not seem to be a correct IFC file");
					}
					if (zipInputStream.getNextEntry() != null) {
						zipInputStream.close();
						throw new UserException("Zip files may only contain one IFC-file, this zip-file contains more files");
					} else {
						zipInputStream.close();
						if (sync) {
							SCheckinResult processCheckin = processCheckinSync(poid, comment, fileSize, session, model, merge);
							return processCheckin;
						} else {
							SCheckinResult processCheckin = processCheckinAsync(poid, comment, fileSize, session, model, merge);
							return processCheckin;
						}
					}
				} else {
					throw new UserException(
							"Zip files must contain exactly one IFC-file, this zip-file seems to have one or more non-IFC files");
				}
			} else if (ifcFile.getName() == null || ifcFile.getName().toUpperCase().endsWith(".IFC")
					|| ifcFile.getName().toUpperCase().endsWith(".IFCXML")) {
				IfcModel model = null;
				if (ifcFile.getName() != null && ifcFile.getName().toUpperCase().endsWith(".IFCXML")) {
					model = readIfcXmlModel(ifcFile.getInputStream(), fileSize);
				} else {
					model = readIfcStepModel(ifcFile.getInputStream(), fileSize);
				}
				if (model.getSize() == 0) {
					throw new UserException("Uploaded file does not seem to be a correct IFC file");
				}
				SCheckinResult checkinResult = null;
				if (sync) {
					checkinResult = processCheckinSync(poid, comment, fileSize, session, model, merge);
				} else {
					checkinResult = processCheckinAsync(poid, comment, fileSize, session, model, merge);
				}
				inputStream.close();
				return checkinResult;
			} else {
				throw new UserException("Uploaded file does not seem to be a valid IFC file");
			}
		} catch (IOException e) {
			LOGGER.error("", e);
			throw new UserException("IOException", e);
		} finally {
			session.close();
		}
	}

	private IfcModel readIfcXmlModel(InputStream inputStream, long fileSize) throws UserException {
		IfcXmlDeserializer ifcXmlDeserializer = new IfcXmlDeserializer();
		try {
			return ifcXmlDeserializer.read(inputStream);
		} catch (IfcXmlDeserializeException e) {
			throw new UserException("Invalid IFC XML file", e);
		}
	}

	private IfcModel readIfcStepModel(final InputStream inputStream, long fileSize) throws UserException {
		IfcStepDeserializer fastIfcFileReader = new IfcStepDeserializer(schema);
		try {
			/*
			 * Strangest hack ever, it seems that DelegatingInputStream (when
			 * using SOAP), sometimes gives 0 as a result of read(byte[] b, int
			 * off, int len), which is illegal, so this code makes sure a 0 will
			 * be interpreted as the end of the stream
			 */
			InputStream between = new InputStream() {
				@Override
				public int read() throws IOException {
					return inputStream.read();
				}

				@Override
				public int read(byte[] b, int off, int len) throws IOException {
					int read = inputStream.read(b, off, len);
					if (read == 0) {
						return -1;
					}
					return read;
				}
			};
			fastIfcFileReader.read(between, fileSize);
			return fastIfcFileReader.getModel();
		} catch (IncorrectIfcFileException e) {
			throw new UserException("Invalid IFC file", e);
		} catch (Exception e) {
			throw new UserException("Invalid IFC file", e);
		} catch (OutOfMemoryError e) {
			LOGGER.error("", e);
			ServerInfo.setErrorMessage(e.getMessage());
			throw new UserException("Out of memory", e);
		}
	}

	private SCheckinResult processCheckinSync(final long poid, final String comment, long fileSize, final BimDatabaseSession session,
			IfcModel model, boolean merge) throws UserException, ServerException {
		BimDatabaseAction<ConcreteRevision> action = new CheckinDatabaseAction(session, accessMethod, model, poid, currentUoid, comment);
		try {
			ConcreteRevision revision = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			SCheckinResult result = new SCheckinResult();
			result.setRid(revision.getId());
			result.setPoid(revision.getProject().getOid());
			result.setProjectName(revision.getProject().getName());
			return result;
		} catch (Exception e) {
			handleException(e);
			return null;
		}
	}

	private SCheckinResult processCheckinAsync(final long poid, final String comment, long fileSize, final BimDatabaseSession session,
			IfcModel model, boolean merge) throws UserException {
		try {
			BimDatabaseAction<ConcreteRevision> action = new CheckinPart1DatabaseAction(session, accessMethod, poid, currentUoid, model,
					comment);
			GetUserByUoidDatabaseAction getUserByUoidDatabaseAction = new GetUserByUoidDatabaseAction(session, accessMethod, currentUoid);
			User userByUoid = session.executeAction(getUserByUoidDatabaseAction, DEADLOCK_RETRIES);
			ConcreteRevision revision = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			session.close();
			CheckinPart2DatabaseAction createCheckinAction = new CheckinPart2DatabaseAction(session, accessMethod, model, currentUoid,
					revision.getOid(), merge);
			SCheckinResult result = new SCheckinResult();
			result.setRid(revision.getId());
			result.setPoid(revision.getProject().getOid());
			result.setProjectName(revision.getProject().getName());
			longActionManager.start(new LongCheckinAction(userByUoid, longActionManager, bimDatabase, schema, createCheckinAction,
					ifcEngineFactory, fieldIgnoreMap));
			return result;
		} catch (UserException e) {
			throw e;
		} catch (Exception e) {
			LOGGER.error("", e);
			new ServerException("Unknown error", e);
		}
		return null;
	}

	@Override
	public SCheckoutResult checkoutLastRevision(long poid, ResultType resultType) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			Project project = session.get(StorePackage.eINSTANCE.getProject(), poid, false);
			return checkout(project.getLastRevision().getOid(), resultType);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public SCheckoutResult checkout(long roid, ResultType resultType) throws UserException, ServerException {
		requireAuthentication();
		if (resultType != ResultType.IFC && resultType != ResultType.IFCXML) {
			throw new UserException("Only IFC or IFCXML allowed when checking out");
		}
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<IfcModel> action = new CheckoutDatabaseAction(session, accessMethod, currentUoid, roid);
			Revision revision = session.get(StorePackage.eINSTANCE.getRevision(), roid, false);
			User user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			return convertModelToCheckoutResult(revision.getProject(), user, session.executeAndCommitAction(action, DEADLOCK_RETRIES),
					resultType);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public long addUser(String username, String name, SUserType type, boolean selfRegistration) throws UserException, ServerException {
		if (!selfRegistration) {
			requireAuthentication();
		} else if (!ServerSettings.getSettings().isAllowSelfRegistration()) {
			requireSelfregistrationAllowed();
		}
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Long> action = new AddUserDatabaseAction(session, accessMethod, username, name, convert(type), currentUoid,
					selfRegistration);
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return -1;
		} finally {
			session.close();
		}
	}

	private void handleException(Exception e) throws UserException, ServerException {
		if (e instanceof UserException) {
			throw (UserException) e;
		} else if (e instanceof ServerException) {
			LOGGER.error("", e);
			throw (ServerException) e;
		} else if (e instanceof BimDatabaseException) {
			LOGGER.error("", e);
			throw new ServerException("Database error", e);
		}
		LOGGER.error("", e);
		throw new ServerException("Unknown error", e);
	}

	@Override
	public SProject addProject(String projectName) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Project> action = new AddProjectDatabaseAction(session, accessMethod, projectName, currentUoid);
			return convert(session.executeAndCommitAction(action, DEADLOCK_RETRIES), SProject.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean addUserToProject(long uoid, long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Boolean> action = new AddUserToProjectDatabaseAction(session, accessMethod, currentUoid, uoid, poid);
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SProject> getAllProjects() throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Project>> action = new GetAllProjectsDatabaseAction(session, accessMethod, currentUoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SProject.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	private void requireAuthentication() throws UserException {
		if (currentUoid == -1) {
			throw new UserException("Authentication required for this call");
		}
		lastActive = new Date();
	}

	private void requireSelfregistrationAllowed() throws UserException {
		if (currentUoid == -1) {
			throw new UserException("No self registration allowed");
		}
		lastActive = new Date();
	}

	private <T> List<T> convert(Collection<? extends IdEObject> list, Class<T> targetClass, BimDatabaseSession bimDatabaseSession) {
		List<T> newList = new ArrayList<T>();
		if (list == null) {
			return null;
		}
		for (IdEObject eObject : list) {
			newList.add(convert(eObject, targetClass, bimDatabaseSession));
		}
		return newList;
	}

	@SuppressWarnings("unchecked")
	private <T> T convert(IdEObject original, Class<T> targetClass, BimDatabaseSession bimDatabaseSession) {
		if (original == null) {
			return null;
		}
		try {
			Class<?> realClass = Class.forName("org.bimserver.interfaces.objects.S" + original.eClass().getName());
			T newInstance = (T) realClass.newInstance();
			Method setOidMethod = targetClass.getMethod("setOid", new Class[] { long.class });
			setOidMethod.invoke(newInstance, original.getOid());
			EClass eClass = original.eClass();
			for (EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {
				Object value = original.eGet(eStructuralFeature);
				if (eStructuralFeature instanceof EAttribute) {
					if (eStructuralFeature.getEType() instanceof EEnum) {
						Enumerator enumerator = (Enumerator) value;
						Class<?> forName = Class.forName("org.bimserver.interfaces.objects.S" + eStructuralFeature.getEType().getName());
						Object[] enumConstants = forName.getEnumConstants();
						boolean found = false;
						for (Object t : enumConstants) {
							Enum<?> en = (Enum<?>) t;
							Method method2 = en.getDeclaringClass().getMethod("getOrdinal");
							Object invoke = method2.invoke(en);
							if ((Integer) invoke == enumerator.getValue()) {
								try {
									Method method = realClass.getMethod(GenerateUtils.makeSetter(eStructuralFeature),
											new Class[] { forName });
									method.invoke(newInstance, t);
								} catch (NoSuchMethodException e) {
								}
								found = true;
								break;
							}
						}
						if (!found) {
							LOGGER.info(value.toString() + " not found");
						}
					} else if (eStructuralFeature.getEType() instanceof EDataType) {
						try {
							Method method = realClass.getMethod(GenerateUtils.makeSetter(eStructuralFeature),
									new Class[] { eStructuralFeature.getEType().getInstanceClass() });
							if (value != null) {
								method.invoke(newInstance, value);
							}
						} catch (NoSuchMethodException e) {
						}
					}
				} else if (eStructuralFeature instanceof EReference) {
					if (eStructuralFeature.isMany()) {
						List<IdEObject> list = (List<IdEObject>) value;
						List<Long> newList = new ArrayList<Long>();
						for (IdEObject val : list) {
							newList.add(val.getOid());
						}
						try {
							Method method = realClass.getMethod(GenerateUtils.makeSetter(eStructuralFeature), new Class[] { List.class });
							method.invoke(newInstance, newList);
						} catch (NoSuchMethodException e) {
						}
					} else {
						try {
							Method method = realClass.getMethod(GenerateUtils.makeSetter(eStructuralFeature), new Class[] { long.class });
							if (value == null) {
								method.invoke(newInstance, -1);
							} else {
								IdEObject referencedObject = (IdEObject) value;
								method.invoke(newInstance, referencedObject.getOid());
							}
						} catch (NoSuchMethodException e) {
						}
					}
				}
			}
			return newInstance;
		} catch (InstantiationException e) {
			LOGGER.error("", e);
		} catch (IllegalAccessException e) {
			LOGGER.error("", e);
		} catch (SecurityException e) {
			LOGGER.error("", e);
		} catch (IllegalArgumentException e) {
			LOGGER.error("", e);
		} catch (InvocationTargetException e) {
			LOGGER.error("", e);
		} catch (ClassNotFoundException e) {
			LOGGER.error("", e);
		} catch (NoSuchMethodException e) {
			LOGGER.error("", e);
		}
		return null;
	}

	@Override
	public List<SRevision> getAllRevisionsOfProject(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Revision>> action = new GetAllRevisionsOfProjectDatabaseAction(session, accessMethod, poid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SRevision.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SCheckout> getAllCheckoutsOfProject(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Checkout>> action = new GetAllCheckoutsOfProjectDatabaseAction(session, accessMethod, poid, false);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SCheckout.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SCheckout> getAllCheckoutsOfProjectAndSubProjects(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Checkout>> action = new GetAllCheckoutsOfProjectDatabaseAction(session, accessMethod, poid, true);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SCheckout.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SUser> getAllUsers() throws UserException, ServerException {
		requireAuthentication();
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<User>> action = new GetAllUsersDatabaseAction(session, accessMethod, currentUoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SUser.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean login(String username, String password) throws UserException, ServerException {
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<User> action = new GetUserByNameDatabaseAction(session, accessMethod, username);
			User user = session.executeAction(action, DEADLOCK_RETRIES);
			if (user != null && Hashers.getSha256Hash(password).equals(user.getPassword())) {
				if (user.getState() == ObjectState.DELETED) {
					throw new UserException("User account has been deleted");
				}
				this.currentUoid = user.getOid();
				updateLastActive(user.getOid());
				return true;
			} else {
				try {
					Thread.sleep(DEFAULT_LOGIN_ERROR_TIMEOUT);
				} catch (InterruptedException e) {
					LOGGER.error("", e);
				}
				throw new UserException("Invalid username/password combination");
			}
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SCheckout> getAllCheckoutsByUser(long uoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Checkout>> action = new GetAllCheckoutsByUserDatabaseAction(session, accessMethod, uoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SCheckout.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SRevision> getAllRevisionsByUser(long uoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Revision>> action = new GetAllRevisionsByUserDatabaseAction(session, accessMethod, uoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SRevision.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public SRevision getRevision(long roid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Revision> action = new GetRevisionDatabaseAction(session, accessMethod, roid, currentUoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SRevision.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SCheckout> getAllCheckoutsOfRevision(long roid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Checkout>> action = new GetAllCheckoutsOfRevisionDatabaseAction(session, accessMethod, roid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SCheckout.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	public String download(long roid, ResultType resultType, boolean sync) throws UserException, ServerException {
		requireAuthentication();
		final LongDownloadAction longDownloadAction = new LongDownloadAction(roid, currentUoid, longActionManager, bimDatabase,
				accessMethod, emfSerializerFactory, resultType);
		try {
			longActionManager.start(longDownloadAction);
		} catch (CannotBeScheduledException e) {
			handleException(e);
			return null;
		}

		if (sync) {
			while (longDownloadAction.isRunning()) {
				try {
					Thread.sleep(1000); // Sleep for 1 sec
				} catch (InterruptedException e) {
					handleException(e);
					return null;
				}
			}

			return longDownloadAction.getIdentification();
		} else {
			return longDownloadAction.getIdentification();
		}
	}

	@Override
	public SDownloadResult getDownloadData(String longActionID) throws UserException, ServerException {
		LongDownloadAction longAction = (LongDownloadAction) longActionManager.getLongAction(longActionID);
		return longAction.getCheckoutResult();
	}

	@Override
	public String getDownloadState(String longActionID) throws UserException, ServerException {
		LongDownloadAction longAction = (LongDownloadAction) longActionManager.getLongAction(longActionID);
		if (longAction != null) {
			if (longActionManager.isRunning(longAction)) {
				return "running";
			} else {
				return "ready";
			}
		}
		return "Download action is expired.";
	}

	@Override
	public boolean deleteProject(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Boolean> action = new DeleteProjectDatabaseAction(session, accessMethod, poid, currentUoid);
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean deleteUser(long uoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Boolean> action = new DeleteUserDatabaseAction(session, accessMethod, currentUoid, uoid);
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	public List<SUser> getAllNonAuthorizedUsersOfProject(int pid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<User>> action = new GetAllNonAuthorizedUsersOfProjectDatabaseAction(session, accessMethod, pid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SUser.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean removeUserFromProject(long uoid, long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Boolean> action = new RemoveUserFromProjectDatabaseAction(session, accessMethod, uoid, poid, currentUoid);
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public SCheckoutResult downloadByOids(Set<Long> roids, Set<Long> oids, ResultType resultType) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<IfcModel> action = new DownloadByOidsDatabaseAction(session, accessMethod, roids, oids, currentUoid);
			IfcModel ifcModel = session.executeAction(action, DEADLOCK_RETRIES);
			Revision revision = session.get(StorePackage.eINSTANCE.getRevision(), roids.iterator().next(), false);
			User user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			return convertModelToCheckoutResult(revision.getProject(), user, ifcModel, resultType);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	private SCheckoutResult convertModelToCheckoutResult(Project project, User user, IfcModel model, ResultType resultType)
			throws UserException, NoSerializerFoundException {
		requireAuthentication();
		SCheckoutResult checkoutResult = new SCheckoutResult();
		if (model.isValid()) {
			checkoutResult.setProjectName(project.getName());
			checkoutResult.setRevisionNr(model.getRevisionNr());
			EmfSerializer serializer;
			try {
				serializer = emfSerializerFactory.create(project, user, resultType, model, checkoutResult.getProjectName() + "."
						+ checkoutResult.getRevisionNr() + "." + resultType.getDefaultExtension());
				checkoutResult.setFile(new DataHandler(serializer));
			} catch (SerializerException e) {
				LOGGER.error("", e);
			}
		}
		return checkoutResult;
	}

	@Override
	public SCheckoutResult downloadOfType(long roid, String className, ResultType resultType) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<IfcModel> action = new DownloadOfTypeDatabaseAction(session, accessMethod, roid, className, currentUoid);
			IfcModel ifcModel = session.executeAction(action, DEADLOCK_RETRIES);
			Revision revision = session.get(StorePackage.eINSTANCE.getRevision(), roid, false);
			User user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			return convertModelToCheckoutResult(revision.getProject(), user, ifcModel, resultType);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<String> getAvailableClasses() throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<List<String>> action = new GetAvailableClassesDatabaseAction(session, accessMethod);
			return session.executeAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public DatabaseInformation getDatabaseInformation() throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<DatabaseInformation> action = new GetDatabaseInformationAction(session, accessMethod);
			return session.executeAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public SCheckoutResult downloadByGuids(Set<Long> roids, Set<String> guids, ResultType resultType) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<IfcModel> action = new DownloadByGuidsDatabaseAction(session, accessMethod, roids, guids, currentUoid);
			IfcModel ifcModel = session.executeAction(action, DEADLOCK_RETRIES);
			Revision revision = session.get(StorePackage.eINSTANCE.getRevision(), roids.iterator().next(), false);
			User user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			return convertModelToCheckoutResult(revision.getProject(), user, ifcModel, resultType);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public SUser getLoggedInUser() throws UserException, ServerException {
		requireAuthentication();
		return getUserByUoid(currentUoid);
	}

	@Override
	public List<SProject> getAllNonAuthorizedProjectsOfUser(long uoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Project>> action = new GetAllNonAuthorizedProjectsOfUserDatabaseAction(session, accessMethod, uoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SProject.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public void logout() throws UserException {
		requireAuthentication();
		currentUoid = -1;
	}

	@Override
	public boolean changePassword(long uoid, String oldPassword, String newPassword) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Boolean> action = new ChangePasswordDatabaseAction(session, accessMethod, uoid, oldPassword, newPassword,
					currentUoid);
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public SUser getUserByUserName(String username) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<User> action = new GetUserByNameDatabaseAction(session, accessMethod, username);
			SUser convert = convert(session.executeAction(action, DEADLOCK_RETRIES), SUser.class, session);
			if (convert == null) {
				throw new UserException("User with username \"" + username + "\" not found");
			}
			return convert;
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	public boolean loginAsAdmin() throws UserException, ServerException {
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<User> action = new GetUserByNameDatabaseAction(session, accessMethod, "admin");
			User user = session.executeAction(action, DEADLOCK_RETRIES);
			if (user != null) {
				currentUoid = user.getOid();
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean undeleteProject(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Boolean> action = new UndeleteProjectDatabaseAction(session, accessMethod, poid, currentUoid);
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean undeleteUser(long uoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Boolean> action = new UndeleteUserDatabaseAction(session, accessMethod, currentUoid, uoid);
			return session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public SProject addProjectAsSubProject(String projectName, long parentPoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Project> action = new AddProjectDatabaseAction(session, accessMethod, projectName, parentPoid, currentUoid);
			return convert(session.executeAndCommitAction(action, DEADLOCK_RETRIES), SProject.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateProject(SProject sProject) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Void> action = new UpdateProjectDatabaseAction(session, accessMethod, currentUoid, sProject);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void updateRevision(SRevision sRevision) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Void> action = new UpdateRevisionDatabaseAction(session, accessMethod, currentUoid, sRevision);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SCompareResult compare(long roid1, long roid2, SCompareType sCompareType) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<CompareResult> action = new CompareDatabaseAction(session, accessMethod, currentUoid, roid1, roid2,
					sCompareType);
			return convert(session.executeAndCommitAction(action, DEADLOCK_RETRIES), SCompareResult.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	private static UserType convert(SUserType sUserType) {
		switch (sUserType) {
		case ADMIN:
			return UserType.ADMIN;
		case ANONYMOUS:
			return UserType.ANONYMOUS;
		case USER:
			return UserType.USER;
		}
		return null;
	}

	private SCompareResult convert(CompareResult compareResult, Class<SCompareResult> class1, BimDatabaseSession session) {
		SCompareResult sCompareResult = new SCompareResult();
		Map<EClass, List<Item>> items = compareResult.getItems();
		for (EClass key : items.keySet()) {
			List<Item> list = items.get(key);
			for (Item item : list) {
				SDataObject dataObject = new SDataObject(item.eObject.eClass().getName(), item.eObject.getOid(), getGuid(item.eObject),
						getName(item.eObject));
				if (item instanceof ObjectAdded) {
					sCompareResult.add(new SObjectAdded(dataObject));
				} else if (item instanceof ObjectDeleted) {
					sCompareResult.add(new SObjectRemoved(dataObject));
				} else if (item instanceof ObjectModified) {
					ObjectModified objectModified = (ObjectModified) item;
					sCompareResult.add(new SObjectModified(dataObject, objectModified.getFeature().getName(), objectModified.getOldValue()
							.toString(), objectModified.getNewValue().toString()));
				}
			}
		}
		return sCompareResult;
	}

	private static String getName(EObject eObject) {
		if (eObject instanceof IfcRoot) {
			IfcRoot ifcRoot = (IfcRoot) eObject;
			if (ifcRoot.getName() != null) {
				return ifcRoot.getName();
			}
		}
		return null;
	}

	private static String getGuid(EObject eObject) {
		if (eObject instanceof IfcRoot) {
			IfcRoot ifcRoot = (IfcRoot) eObject;
			if (ifcRoot.getGlobalId() != null) {
				return ifcRoot.getGlobalId().getWrappedValue();
			}
		}
		return null;
	}

	@Override
	public SRevisionSummary getRevisionSummary(long roid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<SRevisionSummary> action = new GetRevisionSummaryDatabaseAction(session, accessMethod, roid);
			return session.executeAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean userHasCheckinRights(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Boolean> action = new UserHasCheckinRightsDatabaseAction(session, accessMethod, currentUoid, poid);
			return session.executeAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public Set<String> getShowCheckoutWarning(long poid, long uoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<String>> action = new GetShowCheckoutWarningsDatabaseAction(session, accessMethod, poid, uoid);
			return session.executeAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public boolean userHasRights(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Boolean> action = new UserHasRightsDatabaseAction(session, accessMethod, getCurrentUser().getOid(), poid);
			return session.executeAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public SCheckoutResult downloadProjects(Set<Long> roids, ResultType resultType) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<IfcModel> action = new DownloadProjectsDatabaseAction(session, accessMethod, roids, currentUoid);
			Revision revision = session.get(StorePackage.eINSTANCE.getRevision(), roids.iterator().next(), false);
			Project project = revision.getProject();
			IfcModel ifcModel = session.executeAction(action, DEADLOCK_RETRIES);
			User userByUoid = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			SCheckoutResult checkoutResult = convertModelToCheckoutResult(project, userByUoid, ifcModel, resultType);
			return checkoutResult;
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public SDataObject getDataObjectByOid(long roid, long oid, String className) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<SDataObject> action = new GetDataObjectByOidDatabaseAction(session, accessMethod, roid, oid,
					session.getCidForClassName(className));
			SDataObject dataObject = session.executeAction(action, DEADLOCK_RETRIES);
			return dataObject;
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public SDataObject getDataObjectByGuid(long roid, String guid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<SDataObject> action = new GetDataObjectByGuidDatabaseAction(session, accessMethod, roid, guid);
			SDataObject dataObject = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
			return dataObject;
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SDataObject> getDataObjectsByType(long roid, String className) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		BimDatabaseAction<List<SDataObject>> action = new GetDataObjectsByTypeDatabaseAction(session, accessMethod, roid, className);
		try {
			List<SDataObject> dataObjects = session.executeAction(action, DEADLOCK_RETRIES);
			return dataObjects;
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SGuidClash> findClashesByGuid(SClashDetectionSettings sClashDetectionSettings) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			return convert(session.executeAction(
					new FindClashesDatabaseAction(session, accessMethod, convert(sClashDetectionSettings, session), schema,
							ifcEngineFactory, fieldIgnoreMap, currentUoid), DEADLOCK_RETRIES), SGuidClash.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SEidClash> findClashesByEid(SClashDetectionSettings sClashDetectionSettings) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			return convert(session.executeAction(
					new FindClashesDatabaseAction(session, accessMethod, convert(sClashDetectionSettings, session), schema,
							ifcEngineFactory, fieldIgnoreMap, currentUoid), DEADLOCK_RETRIES), SEidClash.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	private ClashDetectionSettings convert(SClashDetectionSettings sClashDetectionSettings, BimDatabaseSession bimDatabaseSession) {
		ClashDetectionSettings clashDetectionSettings = StoreFactory.eINSTANCE.createClashDetectionSettings();
		clashDetectionSettings.setMargin(sClashDetectionSettings.getMargin());
		for (String ignoredClass : sClashDetectionSettings.getIgnoredClasses()) {
			if (!ignoredClass.equals("none")) {
				clashDetectionSettings.getIgnoredClasses().add(ignoredClass);
			}
		}
		for (Long poid : sClashDetectionSettings.getProjects()) {
			Project project = bimDatabaseSession.get(StorePackage.eINSTANCE.getProject(), poid, false);
			clashDetectionSettings.getProjects().add(project);
		}
		for (long roid : sClashDetectionSettings.getRevisions()) {
			Revision revision = bimDatabaseSession.get(StorePackage.eINSTANCE.getRevision(), roid, false);
			clashDetectionSettings.getRevisions().add(revision);
		}
		return clashDetectionSettings;
	}

	@Override
	public SCheckinResult branchToNewProject(long roid, String projectName, String comment) throws UserException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			Revision oldRevision = session.get(StorePackage.eINSTANCE.getRevision(), roid, false);
			Project oldProject = oldRevision.getProject();
			User user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			if (!RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, oldProject)) {
				throw new UserException("User has insufficient rights to download revisions from this project");
			}
			IfcModelSet ifcModelSet = new IfcModelSet();
			for (ConcreteRevision subRevision : oldRevision.getConcreteRevisions()) {
				IfcModel subModel = new IfcModel();
				session.getMap(subModel, subRevision.getProject().getId(), subRevision.getId(), true);
				subModel.setDate(subRevision.getDate());
				ifcModelSet.add(subModel);
			}
			IfcModel model = new Merger().merge(oldRevision.getProject(), ifcModelSet, ServerSettings.getSettings().isIntelligentMerging());
			model.resetOids();
			Project newProject = new AddProjectDatabaseAction(session, accessMethod, projectName, currentUoid).execute();
			session.commit();
			session.close();
			session = bimDatabase.createSession();
			BimDatabaseAction<ConcreteRevision> action = new CheckinPart1DatabaseAction(session, accessMethod, newProject.getOid(),
					currentUoid, model, comment);
			try {
				ConcreteRevision revision = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
				session.close();
				CheckinPart2DatabaseAction createCheckinAction = new CheckinPart2DatabaseAction(session, accessMethod, model, currentUoid,
						revision.getOid(), false);
				SCheckinResult result = new SCheckinResult();
				result.setRid(revision.getId());
				result.setPoid(revision.getProject().getOid());
				result.setProjectName(revision.getProject().getName());
				longActionManager.start(new LongCheckinAction(user, longActionManager, bimDatabase, schema, createCheckinAction,
						ifcEngineFactory, fieldIgnoreMap));
				return result;
			} catch (UserException e) {
				throw e;
			} catch (Exception e) {
				LOGGER.error("", e);
			}
		} catch (BimDeadlockException e) {
			LOGGER.error("", e);
		} catch (BimDatabaseException e) {
			LOGGER.error("", e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public SCheckinResult branchToExistingProject(long roid, long destPoid, String comment) throws UserException {
		requireAuthentication();
		final BimDatabaseSession session = bimDatabase.createSession();
		try {
			Revision oldRevision = session.get(StorePackage.eINSTANCE.getRevision(), roid, false);
			Project oldProject = oldRevision.getProject();
			User user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			if (!RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, oldProject)) {
				throw new UserException("User has insufficient rights to download revisions from this project");
			}
			IfcModelSet ifcModelSet = new IfcModelSet();
			for (ConcreteRevision subRevision : oldRevision.getConcreteRevisions()) {
				IfcModel subModel = new IfcModel();
				session.getMap(subModel, subRevision.getProject().getId(), subRevision.getId(), true);
				subModel.setDate(subRevision.getDate());
				ifcModelSet.add(subModel);
			}
			IfcModel model = new Merger().merge(oldRevision.getProject(), ifcModelSet, ServerSettings.getSettings().isIntelligentMerging());
			model.resetOids();
			BimDatabaseAction<ConcreteRevision> action = new CheckinPart1DatabaseAction(session, accessMethod, destPoid, currentUoid,
					model, comment);
			try {
				ConcreteRevision revision = session.executeAndCommitAction(action, DEADLOCK_RETRIES);
				session.close();
				CheckinPart2DatabaseAction createCheckinAction = new CheckinPart2DatabaseAction(session, accessMethod, model, currentUoid,
						revision.getOid(), false);
				SCheckinResult result = new SCheckinResult();
				result.setRid(revision.getId());
				result.setPoid(revision.getProject().getOid());
				result.setProjectName(revision.getProject().getName());
				longActionManager.start(new LongCheckinAction(user, longActionManager, bimDatabase, schema, createCheckinAction,
						ifcEngineFactory, fieldIgnoreMap));
				return result;
			} catch (UserException e) {
				throw e;
			} catch (Exception e) {
				LOGGER.error("", e);
			}
		} catch (BimDeadlockException e) {
			LOGGER.error("", e);
		} catch (BimDatabaseException e) {
			LOGGER.error("", e);
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<SLogAction> getLogs() throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<List<LogAction>> action = new GetLogsDatabaseAction(session, accessMethod, currentUoid);
			List<LogAction> logs = session.executeAction(action, DEADLOCK_RETRIES);
			return convert(logs, SLogAction.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public SGeoTag getGeoTag(long goid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<GeoTag> action = new GetGeoTagDatabaseAction(session, accessMethod, currentUoid, goid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SGeoTag.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateGeoTag(SGeoTag sGeoTag) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Void> action = new UpdateGeoTagDatabaseAction(session, accessMethod, currentUoid, sGeoTag);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public SClashDetectionSettings getClashDetectionSettings(long cdsoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<ClashDetectionSettings> action = new GetClashDetectionSettingsDatabaseAction(session, accessMethod,
					currentUoid, cdsoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SClashDetectionSettings.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public void updateClashDetectionSettings(SClashDetectionSettings sClashDetectionSettings) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Void> action = new UpdateClashDetectionSettingsDatabaseAction(session, accessMethod, currentUoid,
					sClashDetectionSettings);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SClash> getLastClashes(long roid) throws UserException {
		requireAuthentication();
		return null;
	}

	@Override
	public SUser getUserByUoid(long uoid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			GetUserByUoidDatabaseAction action = new GetUserByUoidDatabaseAction(session, accessMethod, uoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SUser.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public SProject getProjectByPoid(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			GetProjectByPoidDatabaseAction action = new GetProjectByPoidDatabaseAction(session, accessMethod, poid, currentUoid);
			return convert(action.execute(), SProject.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public String ping(String in) {
		return in;
	}

	@Override
	public SUser getAnonymousUser() throws UserException, ServerException {
		requireAuthentication();
		return getUserByUserName("anonymous");
	}

	public List<SUser> getAllNonAuthorizedUsersOfProject(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<User>> action = new GetAllNonAuthorizedUsersOfProjectDatabaseAction(session, accessMethod, poid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SUser.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SUser> getAllAuthorizedUsersOfProject(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<User>> action = new GetAllAuthorizedUsersOfProjectDatabaseAction(session, accessMethod, poid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SUser.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public List<SProject> getUsersProjects(long uoid) throws UserException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			User user = session.get(StorePackage.eINSTANCE.getUser(), uoid, false);
			return convert(user.getHasRightsOn(), SProject.class, session);
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SProject> getProjectByName(String name) throws UserException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			GetProjectByNameDatabaseAction action = new GetProjectByNameDatabaseAction(session, accessMethod, name, currentUoid);
			return (List<SProject>) convert(session.executeAction(action, DEADLOCK_RETRIES), SProject.class, session);
		} catch (BimDatabaseException e) {
			throw new UserException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean autologin(String username, String hash) throws UserException, ServerException {
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<User> action = new GetUserByNameDatabaseAction(session, accessMethod, username);
			User user = session.executeAction(action, DEADLOCK_RETRIES);
			if (user != null && hash.equals(Hashers.getSha256Hash(user.getUsername() + user.getPassword()))) {
				if (user.getState() == ObjectState.DELETED) {
					throw new UserException("User account has been deleted");
				}
				currentUoid = user.getOid();
				updateLastActive(user.getOid());
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			handleException(e);
			return false;
		} finally {
			session.close();
		}
	}

	@Override
	public void setRevisionTag(long roid, String tag) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<String> action = new SetRevisionTagDatabaseAction(session, accessMethod, roid, tag);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SProject> getSubProjects(long poid) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Project>> action = new GetSubProjectsDatabaseAction(session, accessMethod, currentUoid, poid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SProject.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public void changeUserType(long uoid, SUserType userType) throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Void> action = new ChangeUserTypeDatabaseAction(session, accessMethod, currentUoid, uoid, userType);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public boolean isExportTypeEnabled(ResultType resultType) throws UserException {
		requireAuthentication();
		return emfSerializerFactory.resultTypeEnabled(resultType);
	}

	@Override
	public void setExportTypeEnabled(ResultType resultType, boolean enabled) throws UserException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			User user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			if (user.getUserType() != UserType.ADMIN) {
				throw new UserException("Only admin users can change enabled export types");
			}
			Set<ResultType> resultTypes = ServerSettings.getSettings().getEnabledExportTypesAsSet();
			if (enabled) {
				resultTypes.add(resultType);
			} else {
				resultTypes.remove(resultType);
			}
			ServerSettings.getSettings().updateEnabledResultTypes(resultTypes);
			ServerSettings.getSettings().save();
		} catch (SettingsSaveException e) {
			LOGGER.error("", e);
		} finally {
			session.close();
		}
	}

	@Override
	public SUser getCurrentUser() throws UserException {
		if (currentUoid == -1) {
			return null;
		}
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			User user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			return convert(user, SUser.class, session);
		} finally {
			session.close();
		}
	}

	public void close() {
	}

	@Override
	public boolean isLoggedIn() {
		return currentUoid != -1;
	}

	@Override
	public String getSettingsCustomLogoAddress() throws UserException, ServerException {
		return ServerSettings.getSettings().getCustomLogoAddress();
	}

	@Override
	public void setSettingsCustomLogoAddress(String customLogoAddress) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setCustomLogoAddress(customLogoAddress);
	}

	@Override
	public String getSettingsEmailSenderAddress() throws UserException, ServerException {
		return ServerSettings.getSettings().getEmailSenderAddress();
	}

	@Override
	public void setSettingsEmailSenderAddress(String emailSenderAddress) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setEmailSenderAddress(emailSenderAddress);
	}

	@Override
	public String getSettingsEnabledExportTypes() throws UserException, ServerException {
		return ServerSettings.getSettings().getEnabledExportTypes();
	}

	@Override
	public void setSettingsEnabledExportTypes(String enabledExportTypes) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setEnabledExportTypes(enabledExportTypes);
	}

	@Override
	public String getSettingsRegistrationAddition() throws UserException, ServerException {
		return ServerSettings.getSettings().getRegistrationAddition();
	}

	@Override
	public void setSettingsRegistrationAddition(String registrationAddition) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setRegistrationAddition(registrationAddition);
	}

	@Override
	public String getSettingsSiteAddress() throws UserException, ServerException {
		return ServerSettings.getSettings().getSiteAddress();
	}

	@Override
	public void setSettingsSiteAddress(String siteAddress) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setSiteAddress(siteAddress);
	}

	@Override
	public String getSettingsSmtpServer() throws UserException, ServerException {
		return ServerSettings.getSettings().getSmtpServer();
	}

	@Override
	public void setSettingsSmtpServer(String smtpServer) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setSmtpServer(smtpServer);
	}

	@Override
	public boolean isSettingAllowSelfRegistration() throws UserException, ServerException {
		return ServerSettings.getSettings().isAllowSelfRegistration();
	}

	@Override
	public void setSettingAllowSelfRegistration(boolean allowSelfRegistration) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setAllowSelfRegistration(allowSelfRegistration);
	}

	@Override
	public boolean isSettingAllowUsersToCreateTopLevelProjects() throws UserException, ServerException {
		return ServerSettings.getSettings().isAllowUsersToCreateTopLevelProjects();
	}

	@Override
	public void setSettingAllowUsersToCreateTopLevelProjects(boolean allowUsersToCreateTopLevelProjects) throws UserException,
			ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setAllowUsersToCreateTopLevelProjects(allowUsersToCreateTopLevelProjects);
	}

	@Override
	public boolean isSettingAutoTestClashes() throws UserException, ServerException {
		return ServerSettings.getSettings().isAutoTestClashes();
	}

	@Override
	public void setSettingAutoTestClashes(boolean autoTestClashes) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setAutoTestClashes(autoTestClashes);
	}

	@Override
	public boolean isSettingCheckinMergingEnabled() throws UserException, ServerException {
		return ServerSettings.getSettings().isCheckinMergingEnabled();
	}

	@Override
	public void setSettingCheckinMergingEnabled(boolean checkinMergingEnabled) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setCheckinMergingEnabled(checkinMergingEnabled);
	}

	@Override
	public boolean isSettingIntelligentMerging() throws UserException, ServerException {
		return ServerSettings.getSettings().isIntelligentMerging();
	}

	@Override
	public void setSettingIntelligentMerging(boolean intelligentMerging) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setIntelligentMerging(intelligentMerging);
	}

	@Override
	public boolean isSettingSendConfirmationEmailAfterRegistration() throws UserException, ServerException {
		return ServerSettings.getSettings().isSendConfirmationEmailAfterRegistration();
	}

	@Override
	public void setSettingSendConfirmationEmailAfterRegistration(boolean sendConfirmationEmailAfterRegistration) throws UserException,
			ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setSendConfirmationEmailAfterRegistration(sendConfirmationEmailAfterRegistration);
	}

	@Override
	public boolean isSettingShowVersionUpgradeAvailable() throws UserException, ServerException {
		return ServerSettings.getSettings().isShowVersionUpgradeAvailable();
	}

	@Override
	public void setSettingShowVersionUpgradeAvailable(boolean showVersionUpgradeAvailable) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setShowVersionUpgradeAvailable(showVersionUpgradeAvailable);
	}

	@Override
	public boolean isSettingUseCaching() throws UserException, ServerException {
		return ServerSettings.getSettings().isUseCaching();
	}

	@Override
	public void setSettingUseCaching(boolean useCaching) throws UserException, ServerException {
		requireAuthentication();
		ServerSettings.getSettings().setUseCaching(useCaching);
	}

	@Override
	public void loginAnonymous() throws UserException, ServerException {
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<User> action = new GetUserByNameDatabaseAction(session, accessMethod, "anonymous");
			User user = session.executeAction(action, DEADLOCK_RETRIES);
			currentUoid = user.getOid();
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SUserSession> getActiveUserSessions() throws ServiceException {
		requireAuthentication();
		return serviceFactory.getActiveUserSessions();
	}

	@Override
	public Date getActiveSince() {
		return activeSince;
	}

	@Override
	public Date getLastActive() {
		return lastActive;
	}

	@Override
	public Token getCurrentToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	@Override
	public SAccessMethod getAccessMethod() {
		return SAccessMethod.valueOf(accessMethod.getName());
	}

	public static SClashDetectionSettings convert(ClashDetectionSettings clashDetectionSettings) {
		SClashDetectionSettings sClashDetectionSettings = new SClashDetectionSettings();
		sClashDetectionSettings.setMargin(clashDetectionSettings.getMargin());
		for (String cl : clashDetectionSettings.getIgnoredClasses()) {
			clashDetectionSettings.getIgnoredClasses().add(cl);
		}
		for (Project project : clashDetectionSettings.getProjects()) {
			sClashDetectionSettings.getProjects().add(project.getOid());
		}
		for (Revision revision : clashDetectionSettings.getRevisions()) {
			sClashDetectionSettings.getRevisions().add(revision.getOid());
		}
		return sClashDetectionSettings;
	}

	@Override
	public Set<ResultType> getEnabledResultTypes() {
		return null;
	}

	@Override
	public Set<ResultType> getAllResultTypes() {
		Set<ResultType> resultTypes = new TreeSet<ResultType>(new SResultTypeComparator());
		for (ResultType resultType : ResultType.values()) {
			if (resultType.isUserType()) {
				resultTypes.add(resultType);
			}
		}
		return resultTypes;
	}

	@Override
	public void sendCompareEmail(SCompareType sCompareType, long poid, long roid1, long roid2, String address) throws UserException,
			ServerException {
		SUser currentUser = getCurrentUser();
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			Revision revision1 = session.get(StorePackage.eINSTANCE.getRevision(), roid1, false);
			Revision revision2 = session.get(StorePackage.eINSTANCE.getRevision(), roid2, false);
			String senderName = currentUser.getName();
			String senderAddress = currentUser.getUsername();
			if (!senderAddress.contains("@") || !senderAddress.contains(".")) {
				senderAddress = ServerSettings.getSettings().getEmailSenderAddress();
			}

			Session mailSession = MailSystem.getInstance().createMailSession();

			Message msg = new MimeMessage(mailSession);

			try {
				InternetAddress addressFrom = new InternetAddress(senderAddress);
				addressFrom.setPersonal(senderName);
				msg.setFrom(addressFrom);

				InternetAddress[] addressTo = new InternetAddress[1];
				addressTo[0] = new InternetAddress(address);
				msg.setRecipients(Message.RecipientType.TO, addressTo);

				msg.setSubject("BIMserver Model Comparator");
				SCompareResult compareResult = compare(roid1, roid2, sCompareType);
				String html = JspHelper.writeCompareResult(compareResult, revision1.getId(), revision2.getId(), sCompareType,
						getProjectByPoid(poid), false);
				msg.setContent(html, "text/html");
				Transport.send(msg);
			} catch (AddressException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
	}

	@Override
	public void requestPasswordChange(long uoid) throws UserException, ServerException {
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Void> action = new RequestPasswordChangeDatabaseAction(session, accessMethod, uoid);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void sendClashesEmail(SClashDetectionSettings sClashDetectionSettings, long poid, Set<String> addressesTo) throws UserException,
			ServerException {
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Void> action = new SendClashesEmailDatabaseAction(session, accessMethod, currentUoid, poid,
					sClashDetectionSettings, addressesTo);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public void validateAccount(long uoid, String token, String password) throws UserException, ServerException {
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			BimDatabaseAction<Void> action = new ValidateUserDatabaseAction(session, accessMethod, uoid, token, password);
			session.executeAndCommitAction(action, DEADLOCK_RETRIES);
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}

	@Override
	public List<SLongAction> getActiveLongActions() throws ServerException, ServiceException {
		requireAuthentication();
		return longActionManager.getActiveLongActions();
	}

	@Override
	public List<SProject> getAllReadableProjects() throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			BimDatabaseAction<Set<Project>> action = new GetAllReadableProjectsDatabaseAction(session, accessMethod, currentUoid);
			return convert(session.executeAction(action, DEADLOCK_RETRIES), SProject.class, session);
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public Date getLastDatabaseReset() throws UserException, ServerException {
		requireAuthentication();
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			return session.getCreatedDate();
		} catch (Exception e) {
			handleException(e);
			return null;
		} finally {
			session.close();
		}
	}

	private void updateLastActive(long uoid) throws UserException, ServerException {
		BimDatabaseSession session = bimDatabase.createSession();
		try {
			User user = session.get(StorePackage.eINSTANCE.getUser(), uoid, false);
			user.setLastSeen(new Date());
			session.store(user);
			session.commit();
		} catch (Exception e) {
			handleException(e);
		} finally {
			session.close();
		}
	}
}