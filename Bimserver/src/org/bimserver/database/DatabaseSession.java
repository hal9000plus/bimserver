package org.bimserver.database;

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

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.database.query.conditions.AttributeCondition;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.conditions.HasReferenceToCondition;
import org.bimserver.database.query.conditions.IsOfTypeCondition;
import org.bimserver.database.query.literals.IntegerLiteral;
import org.bimserver.database.query.literals.StringLiteral;
import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.StoreFactory;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.User;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.ifc.FieldIgnoreMap;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Factory;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcGloballyUniqueId;
import org.bimserver.ifc.emf.Ifc2x3.Tristate;
import org.bimserver.ifc.emf.Ifc2x3.WrappedValue;
import org.bimserver.shared.Addition;
import org.bimserver.shared.ClassList;
import org.bimserver.shared.DatabaseInformation;
import org.bimserver.shared.UserException;
import org.bimserver.utils.BinUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseSession implements BimDatabaseSession {
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseSession.class);
	private final HashMap<RecordIdentifier, EObject> cacheKO = new HashMap<RecordIdentifier, EObject>();
	private final HashMap<EObject, RecordIdentifier> cacheOK = new HashMap<EObject, RecordIdentifier>();
	private final Database database;
	private BimTransaction bimTransaction;

	public DatabaseSession(Database database, BimTransaction bimTransaction) {
		this.database = database;
		this.bimTransaction = bimTransaction;
	}

	public BimTransaction getBimTransaction() {
		return bimTransaction;
	}

	public boolean containsObject(EObject object) {
		return cacheOK.containsKey(object);
	}

	public boolean containsKey(RecordIdentifier pidOidPair) {
		return cacheKO.containsKey(pidOidPair);
	}

	public EObject getObject(RecordIdentifier pidOidPair) {
		return cacheKO.get(pidOidPair);
	}

	public void put(RecordIdentifier pidOidPair, EObject object) {
		cacheKO.put(pidOidPair, object);
		cacheOK.put(object, pidOidPair);
	}

	public long getOid(EObject object) {
		return cacheOK.get(object).getOid();
	}

	public void dump() {
		System.out.println("dumping cache");
		for (RecordIdentifier ri : cacheKO.keySet()) {
			System.out.println(ri.toString() + " " + cacheKO.get(ri));
		}
		System.out.println("done dumping cache");
	}

	public void clear() {
		cacheKO.clear();
		cacheOK.clear();
	}

	public void close() {
		bimTransaction.close();
	}

	@Override
	public <T> T executeAction(BimDatabaseAction<T> action, int retries) throws BimDatabaseException, UserException {
		for (int i = 0; i < retries; i++) {
			try {
				return action.execute(this);
			} catch (BimDeadlockException e) {
				bimTransaction.rollback();
				bimTransaction = database.getColumnDatabase().startTransaction();
				LOGGER.info("Deadlock while executing " + action.getClass().getSimpleName() + " run (" + i + ")");
				if (i < retries - 1) {
					try {
						Thread.sleep(new Random().nextInt((i + 1) * 1000));
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
			} catch (BimDatabaseException e) {
				throw e;
			}
		}
		throw new BimDatabaseException("Too many deadlocks (" + retries + ")");
	}

	@Override
	public <T> T executeAndCommitAction(BimDatabaseAction<T> action, int retries) throws BimDatabaseException, UserException {
		for (int i = 0; i < retries; i++) {
			try {
				T result = action.execute(this);
				bimTransaction.commit();
				return result;
			} catch (BimDeadlockException e) {
				bimTransaction.rollback();
				bimTransaction = database.getColumnDatabase().startTransaction();
				LOGGER.info("Deadlock while executing " + action.getClass().getSimpleName() + " run (" + i + ")");
			} catch (BimDatabaseException e) {
				LOGGER.error("", e);
				throw e;
			}
			if (i < retries - 1) {
				try {
					Thread.sleep(new Random().nextInt((i + 1) * 1000));
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
		throw new BimDatabaseException("Too many deadlocks (" + retries + ")");
	}

	@Override
	public void clearProject(int pid, int oldRid, int newRid) throws BimDeadlockException {
		ByteBuffer keyBuffer = ByteBuffer.allocate(16);
		ByteBuffer searchKeyBuffer = ByteBuffer.allocate(12);
		for (EClass classifier : database.getClasses()) {
			byte[] pidArray = BinUtils.intToByteArray(pid);
			SearchingRecordIterator recordIterator = database.getColumnDatabase().getRecordIterator(classifier.getName(), pidArray, pidArray, this);
			try {
				Record next = recordIterator.next();
				while (next != null) {
					keyBuffer.position(0);
					keyBuffer.put(next.getKey());
					keyBuffer.position(0);
					keyBuffer.getInt();
					long foundOid = keyBuffer.getLong();
					int foundRid = -keyBuffer.getInt();
					if (next.getValue().length == 1 && next.getValue()[0] == -1) {
						// was already deleted in previous revision
					} else if (foundRid > oldRid) {
						// skip, we probably just added it
					} else if (oldRid == foundRid) {
						delete(classifier.getName(), pid, newRid, foundOid);
					}
					searchKeyBuffer.position(0);
					searchKeyBuffer.putInt(pid);
					searchKeyBuffer.putLong(foundOid + 1);
					next = recordIterator.next(searchKeyBuffer.array());
				}
			} finally {
				recordIterator.close();
			}
		}
	}

	private boolean delete(String className, int pid, int rid, long oid) throws BimDeadlockException {
		ByteBuffer buffer = createKeyBuffer(pid, oid, rid);
		try {
			database.getColumnDatabase().store(className, buffer.array(), new byte[] { -1 }, this);
		} catch (BimDatabaseException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Object convert(EClassifier type, String value) {
		return database.convert(type, value);
	}

	@Override
	public void convertAdditionToEObject(EObject object, Addition addition, Map<Long, EObject> processedAdditions, Map<Long, EObject> map) {
		database.convertAdditionToEObject(object, addition, processedAdditions, map);
	}

	public ConcreteRevision createNewRevision(long size, int pid, int uid, String comment) throws BimDatabaseException, BimDeadlockException {
		ConcreteRevision revision = StoreFactory.eINSTANCE.createConcreteRevision();
		Project project = getProjectById(pid);
		if (project.getConcreteRevisions().isEmpty()) {
			revision.setId(1);
		} else {
			revision.setId(project.getConcreteRevisions().size() + 1);
		}
		revision.setProject(project);
		revision.setComment(comment);
		revision.setDate(new Date());
		User user = getUserById(uid);
		revision.setUser(user);
		revision.setSize(size);

		createNewVirtualRevision(project, revision);

		for (Checkout checkout : project.getCheckouts()) {
			if (checkout.getUser() == user) {
				checkout.setActive(false);
			}
		}

		Project parent = project.getParent();
		while (parent != null) {
			VirtualRevision virtualRevision = StoreFactory.eINSTANCE.createVirtualRevision();
			virtualRevision.setProject(parent);
			if (parent.getLastVirtualRevision() != null) {
				VirtualRevision lastRevision = (VirtualRevision) parent.getLastVirtualRevision();
				for (ConcreteRevision oldRevision : lastRevision.getRevisions()) {
					if (oldRevision.getProject() != project) {
						virtualRevision.getRevisions().add(oldRevision);
					}
				}
			}
			virtualRevision.getRevisions().add(revision);
			virtualRevision.setLastRevision(revision);
			if (parent.getLastVirtualRevision() == null) {
				virtualRevision.setId(1);
			} else {
				virtualRevision.setId(parent.getLastVirtualRevision().getId() + 1);
			}
			parent.setLastVirtualRevision(virtualRevision);
			store(virtualRevision, new CommitSet(Database.STORE_PROJECT_ID, -1));
			parent = parent.getParent();
		}
		return revision;
	}

	private void createNewVirtualRevision(Project project, ConcreteRevision revision) throws BimDeadlockException {
		VirtualRevision virtualRevision = StoreFactory.eINSTANCE.createVirtualRevision();
		virtualRevision.getRevisions().add(revision);
		virtualRevision.setLastRevision(revision);
		if (project.getVirtualRevisions().isEmpty()) {
			virtualRevision.setId(1);
		} else {
			virtualRevision.setId(project.getVirtualRevisions().size() + 1);
			for (ConcreteRevision concreteRevision : project.getVirtualRevisions().get(0).getRevisions()) {
				if (concreteRevision.getProject() != project) {
					virtualRevision.getRevisions().add(concreteRevision);
				}
			}
		}
		virtualRevision.setProject(project);
		project.setLastVirtualRevision(virtualRevision);
		store(virtualRevision, new CommitSet(Database.STORE_PROJECT_ID, -1));
	}

	public EObject get(short cid, long oid, ReadSet readSet, Map<Long, EObject> mapResult) throws BimDatabaseException, BimDeadlockException {
		ByteBuffer keyBuffer = createKeyBuffer(readSet.getPid(), oid, readSet.getRid());
		EClass eClass = getEClassForCid(cid);
		byte[] value = database.getColumnDatabase().get(eClass.getName(), keyBuffer.array(), this);
		if (value == null) {
			return null;
		} else {
			ByteBuffer buffer = ByteBuffer.wrap(value);
			EObject object = convertByteArrayToObject(eClass, eClass, oid, buffer, readSet, mapResult);
			put(new RecordIdentifier(readSet.getPid(), oid, readSet.getRid()), object);
			return object;
		}
	}

	public EObject convertByteArrayToObject(EClass originalQueryClass, EClass eClass, long key, ByteBuffer buffer, ReadSet readSet, Map<Long, EObject> mapResult)
			throws BimDatabaseException, BimDeadlockException {
		EObject object = eClass.getEPackage().getEFactoryInstance().create(eClass);
		readSet.setReading(key, object);
		if (buffer.capacity() == 1 && buffer.get(0) == -1) {
			buffer.position(buffer.position() + 1);
			return null;
		}
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			if (!feature.isTransient() && !feature.isVolatile()) {
				if (database.shouldIgnoreField(originalQueryClass, eClass, feature)) {
					// we have to do some reading to maintain a correct index
					database.fakeRead(buffer, feature);
				} else {
					Object newValue = null;
					if (feature.getUpperBound() > 1 || feature.getUpperBound() == -1) {
						if (feature.getEType() instanceof EEnum) {
						} else if (feature.getEType() instanceof EClass) {
							if (buffer.capacity() == 1 && buffer.get(0) == -1) {
								buffer.position(buffer.position() + 1);
							} else {
								short listSize = buffer.getShort();
								BasicEList<Object> list = new BasicEList<Object>(listSize);
								boolean wrappedValue = Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf((EClass) (feature.getEType()));
								for (int i = 0; i < listSize; i++) {
									Object reference = null;
									if (wrappedValue) {
										reference = readWrappedValue(feature, buffer);
									} else {
										reference = readReference(originalQueryClass, buffer, readSet, mapResult);
									}
									if (reference != null) {
										list.addUnique(reference);
									}
								}
								object.eSet(feature, list);
							}
						} else if (feature.getEType() instanceof EDataType) {
							short listSize = buffer.getShort();
							BasicEList<Object> list = new BasicEList<Object>(listSize);
							for (int i = 0; i < listSize; i++) {
								Object reference = readPrimitiveValue(feature.getEType(), buffer);
								if (reference != null) {
									list.addUnique(reference);
								}
							}
							object.eSet(feature, list);
						}
					} else {
						if (feature.getEType() instanceof EEnum) {
							int enumOrdinal = buffer.getInt();
							EEnumLiteral enumLiteral = (((EEnumImpl) feature.getEType()).getEEnumLiteral(enumOrdinal));
							newValue = enumLiteral.getInstance();
						} else if (feature.getEType() instanceof EClass) {
							boolean wrappedValue = Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf((EClass) (feature.getEType()));
							if (wrappedValue) {
								newValue = readWrappedValue(feature, buffer);
							} else {
								newValue = readReference(originalQueryClass, buffer, readSet, mapResult);
							}
						} else if (feature.getEType() instanceof EDataType) {
							newValue = readPrimitiveValue(feature.getEType(), buffer);
						}
					}
					if (newValue != null) {
						object.eSet(feature, newValue);
					}
				}
			}
		}
		return object;
	}

	private Object readWrappedValue(EStructuralFeature feature, ByteBuffer buffer) {
		short cid = buffer.getShort();
		if (cid == -1) {
			return null;
		}
		EClass eClass = database.getEClassForCid(cid);
		EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature("wrappedValue");
		Object primitiveValue = readPrimitiveValue(eStructuralFeature.getEType(), buffer);
		EObject eObject = Ifc2x3Factory.eINSTANCE.create(eClass);
		eObject.eSet(eStructuralFeature, primitiveValue);
		if (eStructuralFeature.getEType() == EcorePackage.eINSTANCE.getEFloat()) {
			eObject.eSet(eClass.getEStructuralFeature("stringValuewrappedValue"), readPrimitiveValue(EcorePackage.eINSTANCE.getEString(), buffer));
		}
		return eObject;
	}

	private EObject readReference(EClass originalQueryClass, ByteBuffer buffer, ReadSet readSet, Map<Long, EObject> mapResult) throws BimDatabaseException,
			BimDeadlockException {
		if (buffer.capacity() == 1 && buffer.get(0) == -1) {
			buffer.position(buffer.position() + 1);
			return null;
		}
		short cid = buffer.getShort();
		if (cid != -1) {
			long oid = buffer.getLong();
			if (containsKey(new RecordIdentifier(readSet.getPid(), oid, readSet.getRid()))) {
				return getObject(new RecordIdentifier(readSet.getPid(), oid, readSet.getRid()));
			} else {
				if (readSet.isReading(oid)) {
					return readSet.get(oid);
				} else {
					int descRid = readSet.getRid();
					byte[] referenceValue = null;
					EClass classifier = database.getEClassForCid(cid);
					while (referenceValue == null && (descRid > 0 || descRid == -1)) {
						ByteBuffer pidoidrid = createKeyBuffer(readSet.getPid(), oid, descRid);
						referenceValue = database.getColumnDatabase().getFirstStartingWith(classifier.getName(), pidoidrid.array(), this);
						descRid--;
					}
					if (referenceValue == null) {
						throw new BimDatabaseException("Unsatisfied reference error, there is no " + classifier.getName() + " with pid " + readSet.getPid()
								+ ", oid " + oid + ", rid <= " + readSet.getRid());
					}
					if (referenceValue.length == 1 && referenceValue[0] == -1) {
					} else if (referenceValue != null) {
						ByteBuffer referenceBuffer = ByteBuffer.wrap(referenceValue);
						EObject newObject = convertByteArrayToObject(originalQueryClass, classifier, oid, referenceBuffer, readSet, mapResult);
						RecordIdentifier recordIdentifier = new RecordIdentifier(readSet.getPid(), oid, readSet.getRid());
						put(recordIdentifier, newObject);
						mapResult.put(oid, newObject);
						return newObject;
					}
				}
			}
		}
		return null;
	}

	@Override
	public User getAdminUser() throws BimDatabaseException, BimDeadlockException {
		return getUserByUserName("admin");
	}

	@Override
	public EClass getEClassForName(String className) {
		return database.getEClassForName(className);
	}

	@Override
	public EClass getEClassForCid(short cid) {
		return database.getEClassForCid(cid);
	}

	@Override
	public Map<Long, EObject> getMap(int pid, int rid) throws BimDatabaseException, BimDeadlockException {
		Map<Long, EObject> mapResult = new TreeMap<Long, EObject>();
		ReadSet readSet = new ReadSet(pid, rid);
		for (EClass eClass : database.getClasses()) {
			getMap(eClass, readSet, mapResult);
		}
		return mapResult;
	}

	public void getMap(EClass eClass, ReadSet readSet, Map<Long, EObject> mapResult) throws BimDatabaseException, BimDeadlockException {
		SearchingRecordIterator recordIterator = database.getColumnDatabase().getRecordIterator(eClass.getName(), BinUtils.intToByteArray(readSet.getPid()),
				BinUtils.intToByteArray(readSet.getPid()), this);
		try {
			Record record = recordIterator.next();
			ByteBuffer nextKeyStart = ByteBuffer.allocate(12);
			while (record != null) {
				ByteBuffer keyBuffer = ByteBuffer.wrap(record.getKey());
				int pid = keyBuffer.getInt();
				long oid = keyBuffer.getLong();
				int rid = -keyBuffer.getInt();
				ByteBuffer valueBuffer = ByteBuffer.wrap(record.getValue());
				int map = getMap(eClass, eClass, readSet, mapResult, valueBuffer, pid, oid, rid);
				if (map == 1) {
					nextKeyStart.position(0);
					nextKeyStart.putInt(readSet.getPid());
					nextKeyStart.putLong(oid + 1);
					record = recordIterator.next(nextKeyStart.array());
				} else {
					record = recordIterator.next();
				}
			}
		} finally {
			recordIterator.close();
		}
	}

	public int getCount(EClass eClass, ReadSet readSet) throws BimDatabaseException, BimDeadlockException {
		int count = 0;
		SearchingRecordIterator recordIterator = database.getColumnDatabase().getRecordIterator(eClass.getName(), BinUtils.intToByteArray(readSet.getPid()),
				BinUtils.intToByteArray(readSet.getPid()), this);
		try {
			Record record = recordIterator.next();
			ByteBuffer nextKeyStart = ByteBuffer.allocate(12);
			while (record != null) {
				ByteBuffer keyBuffer = ByteBuffer.wrap(record.getKey());
				int pid = keyBuffer.getInt();
				long oid = keyBuffer.getLong();
				int rid = -keyBuffer.getInt();
				int map = getCount(readSet, pid, rid);
				if (map == 1) {
					nextKeyStart.position(0);
					nextKeyStart.putInt(readSet.getPid());
					nextKeyStart.putLong(oid + 1);
					record = recordIterator.next(nextKeyStart.array());
				} else {
					record = recordIterator.next();
				}
				count++;
			}
		} finally {
			recordIterator.close();
		}
		return count;
	}

	private int getMap(EClass originalQueryClass, EClass eClass, ReadSet readSet, Map<Long, EObject> mapResult, ByteBuffer buffer, int pid, long oid, int rid)
			throws BimDatabaseException, BimDeadlockException {
		if (pid == readSet.getPid()) {
			if (rid <= readSet.getRid()) {
				RecordIdentifier recordIdentifier = new RecordIdentifier(readSet.getPid(), oid, rid);
				if (containsKey(recordIdentifier)) {
					EObject object = getObject(recordIdentifier);
					mapResult.put(oid, object);
					readSet.setReading(oid, object);
					return 1;
				} else {
					EObject object = null;
					if (readSet.isReading(oid)) {
						object = readSet.get(oid);
					} else {
						if (buffer.capacity() == 1 && buffer.get(0) == -1) {
							buffer.position(buffer.position() + 1);
							return 1;
							// deleted entity
						} else {
							object = convertByteArrayToObject(originalQueryClass, eClass, oid, buffer, readSet, mapResult);
						}
					}
					if (object != null) {
						mapResult.put(oid, object);
						put(recordIdentifier, object);
						return 1;
					}
				}
			} else {
				return -1;
			}
		} else {
			return 0;
		}
		return 0;
	}

	private int getCount(ReadSet readSet, int pid, int rid) {
		if (pid == readSet.getPid()) {
			if (rid <= readSet.getRid()) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return 0;
		}
	}

	@Override
	public Map<Long, EObject> getMapWithOid(int pid, int rid, long oid) throws BimDatabaseException, BimDeadlockException {
		EClass eClass = getClassOfObjectId(pid, rid, oid);
		if (eClass == null) {
			return new HashMap<Long, EObject>();
		}
		clear();
		if (eClass == null) {
			return null;
		} else {
			HashMap<Long, EObject> result = new HashMap<Long, EObject>();
			ByteBuffer key = createKeyBuffer(pid, oid, rid);
			byte[] value = database.getColumnDatabase().get(eClass.getName(), key.array(), this);
			if (value == null) {
				return null;
			}
			ByteBuffer valueBuffer = ByteBuffer.wrap(value);
			getMap(eClass, eClass, new ReadSet(pid, rid), result, valueBuffer, pid, oid, rid);
			return result;
		}
	}

	private EClass getClassOfObjectId(int pid, int rid, long oid) throws BimDatabaseException, BimDeadlockException {
		for (EClass eClass : database.getClasses()) {
			if (get(database.getCidOfEClass(eClass), oid, new ReadSet(pid, rid), new HashMap<Long, EObject>()) != null) {
				return eClass;
			}
		}
		return null;
	}

	@Override
	public Project getProjectById(int pid) throws BimDatabaseException, BimDeadlockException {
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getProject_Id(), new IntegerLiteral(pid));
		return querySingle(Database.STORE_PROJECT_ID, -1, condition, Project.class);
	}

	public <T extends EObject> T querySingle(int pid, int rid, Condition condition, Class<T> clazz) throws BimDatabaseException, BimDeadlockException {
		Collection<T> values = query(pid, rid, condition, clazz).values();
		if (values.size() == 0) {
			return null;
		}
		return values.iterator().next();
	}

	public <T extends EObject> Map<Long, T> query(int pid, int rid, Condition condition, Class<T> clazz) throws BimDatabaseException, BimDeadlockException {
		ReadSet readSet = new ReadSet(pid, rid);
		Set<EClass> eClasses = new HashSet<EClass>();
		condition.getEClassRequirements(eClasses);
		Map<Long, T> result = new HashMap<Long, T>();
		for (EClass eClass : eClasses) {
			Map<Long, EObject> map = new HashMap<Long, EObject>();
			getMap(eClass, readSet, map);
			for (Long oid : map.keySet()) {
				if (condition.matches(map.get(oid))) {
					result.put(oid, clazz.cast(map.get(oid)));
				}
			}
		}
		return result;
	}

	@Override
	public Project getProjectByName(String projectName) throws BimDatabaseException, BimDeadlockException {
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getProject_Name(), new StringLiteral(projectName));
		return querySingle(Database.STORE_PROJECT_ID, -1, condition, Project.class);
	}

	@Override
	public ConcreteRevision getRevision(int pid, int rid) throws BimDatabaseException, BimDeadlockException {
		Project project = getProjectById(pid);
		Condition revisionNrCondition = new AttributeCondition(StorePackage.eINSTANCE.getRevision_Id(), new IntegerLiteral(rid));
		Condition projectLinkCondition = new HasReferenceToCondition(StorePackage.eINSTANCE.getConcreteRevision_Project(), project);
		return querySingle(Database.STORE_PROJECT_ID, -1, revisionNrCondition.and(projectLinkCondition), ConcreteRevision.class);
	}

	@Override
	public User getUserById(int uid) throws BimDatabaseException, BimDeadlockException {
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getUser_Id(), new IntegerLiteral(uid));
		return querySingle(Database.STORE_PROJECT_ID, -1, condition, User.class);
	}

	@Override
	public User getUserByUserName(String username) throws BimDatabaseException, BimDeadlockException {
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getUser_Username(), new StringLiteral(username));
		return querySingle(Database.STORE_PROJECT_ID, -1, condition, User.class);
	}

	@Override
	public int newPid() {
		return database.newPid();
	}

	@Override
	public int newUid() {
		return database.newUid();
	}

	@Override
	public void saveOidCounter() throws BimDeadlockException {
		database.getRegistry().save(Database.OID_COUNTER, database.getOidCounter(), this);
	}

	@Override
	public void savePidCounter() throws BimDeadlockException {
		database.getRegistry().save(Database.PID_COUNTER, database.getPidCounter(), this);
	}

	@Override
	public void saveUidCounter() throws BimDeadlockException {
		database.getRegistry().save(Database.UID_COUNTER, database.getUidCounter(), this);
	}

	private ByteBuffer createKeyBuffer(int pid, long oid, int rid) {
		ByteBuffer keyBuffer = ByteBuffer.allocate(16);
		keyBuffer.putInt(pid);
		keyBuffer.putLong(oid);
		keyBuffer.putInt(-rid);
		return keyBuffer;
	}

	@Override
	public long store(EObject object, CommitSet commitSet) throws BimDeadlockException {
		long oid = -1;
		if (containsObject(object)) {
			oid = getOid(object);
		} else {
			oid = database.newOid();
		}
		commitSet.add(object, oid);
		try {
			ByteBuffer keyBuffer = createKeyBuffer(commitSet.getPid(), oid, commitSet.getRid());
			put(new RecordIdentifier(commitSet.getPid(), oid, commitSet.getRid()), object);
			database.getColumnDatabase().store(object.eClass().getName(), keyBuffer.array(), convertObjectToByteArray(object, commitSet).array(), this);
			return oid;
		} catch (BimDatabaseException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public GrowingByteBuffer convertObjectToByteArray(EObject object, CommitSet commitSet) throws BimDeadlockException, BimDatabaseException {
		GrowingByteBuffer buffer = new GrowingByteBuffer();
		for (EStructuralFeature feature : object.eClass().getEAllStructuralFeatures()) {
			if (!feature.isTransient() && !feature.isVolatile()) {
				if (feature.getUpperBound() > 1 || feature.getUpperBound() == -1) {
					if (feature.getEType() instanceof EEnum) {
						// Aggregate relations to enums never occur... at this
						// moment
					} else if (feature.getEType() instanceof EClass) {
						EList<?> list = (EList<?>) object.eGet(feature);
						buffer.putShort((short) list.size());
						boolean wrappedValue = Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf((EClass) feature.getEType());
						for (Object o : list) {
							if (wrappedValue) {
								writeWrappedValue(o, buffer, commitSet);
							} else {
								writeReference(o, commitSet, buffer);
							}
						}
					} else if (feature.getEType() instanceof EDataType) {
						EList<?> list = (EList<?>) object.eGet(feature);
						buffer.putShort((short) list.size());
						for (Object o : list) {
							writePrimitiveValue(feature, o, buffer);
						}
					}
				} else {
					Object value = object.eGet(feature);
					if (feature.getEType() instanceof EEnum) {
						buffer.putInt(((Enum<?>) value).ordinal());
					} else if (feature.getEType() instanceof EClass) {
						boolean wrappedValue = Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf((EClass) feature.getEType());
						if (wrappedValue) {
							writeWrappedValue(value, buffer, commitSet);
						} else {
							writeReference(value, commitSet, buffer);
						}
					} else if (feature.getEType() instanceof EDataType) {
						writePrimitiveValue(feature, value, buffer);
					}
				}
			}
		}
		return buffer;
	}

	public Object readPrimitiveValue(EClassifier classifier, ByteBuffer buffer) {
		if (classifier == EcorePackage.eINSTANCE.getEString()) {
			short length = buffer.getShort();
			return BinUtils.readString(buffer, length);
		} else if (classifier == EcorePackage.eINSTANCE.getEInt()) {
			return buffer.getInt();
		} else if (classifier == EcorePackage.eINSTANCE.getELong()) {
			return buffer.getLong();
		} else if (classifier == EcorePackage.eINSTANCE.getEFloat()) {
			return buffer.getFloat();
		} else if (classifier == EcorePackage.eINSTANCE.getEDouble()) {
			return buffer.getDouble();
		} else if (classifier == EcorePackage.eINSTANCE.getEBoolean()) {
			return buffer.get() == 1;
		} else if (classifier == EcorePackage.eINSTANCE.getEDate()) {
			return new Date(buffer.getLong());
		} else if (classifier == EcorePackage.eINSTANCE.getEByteArray()) {
			int size = buffer.getInt();
			byte[] result = new byte[size];
			buffer.get(result);
			return result;
		} else if (classifier == Ifc2x3Package.eINSTANCE.getTristate()) {
			int ordinal = buffer.getInt();
			return Tristate.get(ordinal);
		} else {
			throw new RuntimeException("Unsupported type " + classifier.getName());
		}
	}

	private void writeWrappedValue(Object value, GrowingByteBuffer buffer, CommitSet commitSet) throws BimDatabaseException, BimDeadlockException {
		if (value == null) {
			buffer.putShort((short) -1);
			return;
		}
		WrappedValue wrappedValue = (WrappedValue) value;
		EStructuralFeature eStructuralFeature = wrappedValue.eClass().getEStructuralFeature("wrappedValue");
		Short cid = database.getCidOfEClass(wrappedValue.eClass());
		buffer.putShort(cid);
		writePrimitiveValue(eStructuralFeature, wrappedValue.eGet(eStructuralFeature), buffer);
		if (eStructuralFeature.getEType() == EcorePackage.eINSTANCE.getEFloat()) {
			EStructuralFeature floatValueFeature = wrappedValue.eClass().getEStructuralFeature("stringValuewrappedValue");
			writePrimitiveValue(floatValueFeature, wrappedValue.eGet(floatValueFeature), buffer);
		}
		if (wrappedValue instanceof IfcGloballyUniqueId) {
			GrowingByteBuffer convertObjectToByteArray = convertObjectToByteArray(wrappedValue, commitSet);
			ByteBuffer createKeyBuffer = createKeyBuffer(commitSet.getPid(), getReferenceOid(wrappedValue, commitSet), commitSet.getRid());
			try {
				database.getColumnDatabase().store("IfcGloballyUniqueId", createKeyBuffer.array(), convertObjectToByteArray.array(), this);
			} catch (BimDeadlockException e) {
				e.printStackTrace();
			}
		}
	}

	public void writePrimitiveValue(EStructuralFeature feature, Object value, GrowingByteBuffer buffer) throws BimDatabaseException {
		if (feature.getEType() == EcorePackage.eINSTANCE.getEString()) {
			if (value == null) {
				buffer.putShort((short) 0);
			} else {
				String stringValue = (String) value;
				try {
					byte[] bytes = stringValue.getBytes("UTF-8");
					if (bytes.length > Short.MAX_VALUE) {
						throw new BimDatabaseException("String value too long");
					}
					buffer.putShort((short) bytes.length);
					buffer.put(bytes);
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		} else if (feature.getEType() == EcorePackage.eINSTANCE.getEInt()) {
			buffer.putInt((Integer) value);
		} else if (feature.getEType() == EcorePackage.eINSTANCE.getEDouble()) {
			buffer.putDouble((Double) value);
		} else if (feature.getEType() == EcorePackage.eINSTANCE.getEFloat()) {
			buffer.putFloat((Float) value);
		} else if (feature.getEType() == EcorePackage.eINSTANCE.getELong()) {
			buffer.putLong((Long) value);
		} else if (feature.getEType() == EcorePackage.eINSTANCE.getEBoolean()) {
			buffer.put(((Boolean) value) ? (byte) 1 : (byte) 0);
		} else if (feature.getEType() == EcorePackage.eINSTANCE.getEDate()) {
			if (value == null) {
				buffer.put(new byte[8]);
			} else {
				buffer.putLong(((Date) value).getTime());
			}
		} else if (feature.getEType() == Ifc2x3Package.eINSTANCE.getTristate()) {
			Enumerator eEnumLiteral = (Enumerator) value;
			buffer.putInt(eEnumLiteral.getValue());
		} else if (feature.getEType() == EcorePackage.eINSTANCE.getEByteArray()) {
			if (value == null) {
				buffer.putInt(0);
			} else {
				byte[] bytes = (byte[])value;
				buffer.putInt(bytes.length);
				buffer.put(bytes);
			}
		} else {
			throw new RuntimeException("Unsupported type " + feature.getEType().getName());
		}
	}

	private void writeReference(Object value, CommitSet commitSet, GrowingByteBuffer buffer) throws BimDeadlockException {
		if (value == null) {
			buffer.putShort((byte) -1);
		} else {
			Short cid = database.getCidOfEClass(((EObject) value).eClass());
			buffer.putShort(cid);
			buffer.putLong(getReferenceOid((EObject) value, commitSet));
		}
	}

	private long getReferenceOid(EObject object, CommitSet commitSet) throws BimDeadlockException {
		if (commitSet.isStoring(object)) {
			return commitSet.getOid(object);
		} else {
			if (object != null) {
				return store(object, commitSet);
			} else {
				return -1;
			}
		}
	}

	@Override
	public void store(Collection<EObject> values, int pid, int rid) throws BimDeadlockException {
		CommitSet commitSet = new CommitSet(pid, rid);
		for (EObject object : values) {
			if (!commitSet.isStoring(object)) {
				store(object, commitSet);
			}
		}
		saveOidCounter();
	}

	@Override
	public void getAllOfType(String className, int pid, int rid, Map<Long, EObject> mapResult) throws BimDatabaseException, BimDeadlockException {
		getMap(getEClassForName(className), new ReadSet(pid, rid), mapResult);
	}

	@Override
	public Collection<EClass> getClasses() {
		return database.getClasses();
	}

	@Override
	public DatabaseInformation getDatabaseInformation() throws BimDatabaseException, BimDeadlockException {
		DatabaseInformation databaseInformation = new DatabaseInformation();
		databaseInformation.setNumberOfProjects(getObjectCount(Project.class));
		databaseInformation.setNumberOfUsers(getObjectCount(User.class));
		databaseInformation.setNumberOfCheckouts(getObjectCount(Checkout.class));
		databaseInformation.setNumberOfRevisions(getObjectCount(ConcreteRevision.class));
		databaseInformation.setType(database.getColumnDatabase().getType());
		databaseInformation.setDatabaseSizeInBytes(database.getColumnDatabase().getDatabaseSizeInBytes());
		databaseInformation.setSchemaVersion(database.getRegistry().readInt(Database.SCHEMA_VERSION, this));
		String stats = database.getColumnDatabase().getStats();
		Scanner scanner = new Scanner(stats);
		String title = "";
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains("=")) {
				databaseInformation.addGenericLine(title, line.substring(0, line.indexOf("=")), line.substring(line.indexOf("=") + 1));
			} else {
				title = line;
			}
		}
		databaseInformation.setLocation(database.getColumnDatabase().getLocation());
		return databaseInformation;
	}

	private int getObjectCount(Class<? extends EObject> clazz) throws BimDatabaseException, BimDeadlockException {
		Condition condition = new IsOfTypeCondition((EClass) StorePackage.eINSTANCE.getEClassifier(clazz.getSimpleName()));
		return query(Database.STORE_PROJECT_ID, -1, condition, clazz).size();
	}

	@Override
	public ObjectIdentifier getOidOfGuid(String guid, int pid, int rid) throws BimDeadlockException {
		RecordIterator recordIterator = database.getColumnDatabase().getRecordIterator("IfcGloballyUniqueId", BinUtils.intToByteArray(pid),
				BinUtils.intToByteArray(pid), this);
		try {
			Record record = recordIterator.next();
			while (record != null) {
				ByteBuffer buffer = ByteBuffer.wrap(record.getKey());
				int pidOfRecord = buffer.getInt();
				buffer.getLong();
				int ridOfRecord = -buffer.getInt();
				if (ridOfRecord == rid && pid == pidOfRecord) {
					ByteBuffer value = ByteBuffer.wrap(record.getValue());
					if (value.capacity() > 1) {
						short stringLength = value.getShort();
						String s = BinUtils.readString(value, stringLength);
						if (s.equals(guid)) {
							short referenceCid = value.getShort();
							// Read the next value, because this is the
							// (manually added) IfcRoot field, pointing to the
							// Object referring this Guid
							long referencedOid = value.getLong();
							return new ObjectIdentifier(referencedOid, referenceCid);
						}
					}
				}
				record = recordIterator.next();
			}
		} finally {
			recordIterator.close();
		}
		return null;
	}

	public void commit() throws BimDeadlockException, BimDatabaseException {
		bimTransaction.commit();
	}

	@Override
	public ClassList getClassList() {
		return database.getAvailableClasses();
	}

	@Override
	public void updateLastActive(int uid) {
		try {
			User user = getUserById(uid);
			user.setLastSeen(new Date());
			store(user, new CommitSet(Database.STORE_PROJECT_ID, -1));
		} catch (BimDatabaseException e) {
			e.printStackTrace();
		} catch (BimDeadlockException e) {
			e.printStackTrace();
		}
	}

	@Override
	public VirtualRevision getVirtualRevision(int pid, int rid) throws BimDeadlockException, BimDatabaseException {
		Project project = getProjectById(pid);
		Condition revisionNrCondition = new AttributeCondition(StorePackage.eINSTANCE.getRevision_Id(), new IntegerLiteral(rid));
		Condition projectLinkCondition = new HasReferenceToCondition(StorePackage.eINSTANCE.getVirtualRevision_Project(), project);
		return querySingle(Database.STORE_PROJECT_ID, -1, revisionNrCondition.and(projectLinkCondition), VirtualRevision.class);
	}

	public FieldIgnoreMap getFieldIgnoreMap() {
		return database.getFieldIgnoreMap();
	}

	@Override
	public short getCidForClassName(String className) {
		return database.getCidOfEClass(getEClassForName(className));
	}
}