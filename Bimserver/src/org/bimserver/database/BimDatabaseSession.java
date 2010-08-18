package org.bimserver.database;

import java.util.Collection;
import java.util.Map;

import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.shared.Addition;
import org.bimserver.shared.ClassList;
import org.bimserver.shared.DatabaseInformation;
import org.bimserver.shared.UserException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

public interface BimDatabaseSession {

	<T> T executeAndCommitAction(BimDatabaseAction<T> action, int retries) throws BimDatabaseException, UserException;

	<T> T executeAction(BimDatabaseAction<T> action, int retries) throws BimDatabaseException, UserException;

	void close();

	Project getProjectByName(String name) throws BimDeadlockException, BimDatabaseException;

	int newPid();

	User getUserById(int uid) throws BimDeadlockException, BimDatabaseException;

	User getAdminUser() throws BimDeadlockException, BimDatabaseException;

	void savePidCounter() throws BimDeadlockException;

	void saveOidCounter() throws BimDeadlockException;

	long store(EObject eObject, CommitSet commitSet) throws BimDeadlockException;

	void saveUidCounter() throws BimDeadlockException;

	int newUid();

	User getUserByUserName(String name) throws BimDeadlockException, BimDatabaseException;

	Project getProjectById(int pid) throws BimDeadlockException, BimDatabaseException;

	ConcreteRevision createNewRevision(long size, int pid, int uid, String comment) throws BimDeadlockException, BimDatabaseException;

	void clearProject(int pid, int i, int id) throws BimDeadlockException;

	void store(Collection<EObject> values, int pid, int rid) throws BimDeadlockException;

	ConcreteRevision getRevision(int pid, int rid) throws BimDeadlockException, BimDatabaseException;

	VirtualRevision getVirtualRevision(int pid, int rid) throws BimDeadlockException, BimDatabaseException;

	Map<Long, EObject> getMap(int pid, int rid) throws BimDeadlockException, BimDatabaseException;

	EClass getEClassForName(String className);

	void convertAdditionToEObject(EObject object, Addition addition, Map<Long, EObject> processedAdditions, Map<Long, EObject> map);

	EObject get(short cid, long oid, ReadSet readSet, Map<Long, EObject> mapResult) throws BimDeadlockException, BimDatabaseException;

	Object convert(EClassifier type, String string);

	long getOid(EObject originalObject);

	void put(RecordIdentifier recordIdentifier, EObject object);

	Map<Long, EObject> getMapWithOid(int pid, int id, long oid) throws BimDeadlockException, BimDatabaseException;

	<T extends EObject> Map<Long, T> query(int pid, int rid, Condition condition, Class<T> clazz) throws BimDatabaseException, BimDeadlockException;

	<T extends EObject> T querySingle(int pid, int rid, Condition condition, Class<T> clazz) throws BimDatabaseException, BimDeadlockException;

	DatabaseInformation getDatabaseInformation() throws BimDatabaseException, BimDeadlockException;

	ObjectIdentifier getOidOfGuid(String guid, int pid, int rid) throws BimDeadlockException;

	void getAllOfType(String className, int pid, int rid, Map<Long, EObject> mapResult) throws BimDatabaseException, BimDeadlockException;

	Collection<EClass> getClasses();

	ClassList getClassList();

	void updateLastActive(int uid);

	void commit() throws BimDeadlockException, BimDatabaseException;

	int getCount(EClass eClass, ReadSet readSet) throws BimDatabaseException, BimDeadlockException;

	EClass getEClassForCid(short cid);

	short getCidForClassName(String className);
}