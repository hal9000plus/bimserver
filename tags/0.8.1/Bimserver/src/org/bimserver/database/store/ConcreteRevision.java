/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.store;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getUser <em>User</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getDate <em>Date</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getComment <em>Comment</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getSize <em>Size</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getProject <em>Project</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#isFinalized <em>Finalized</em>}</li>
 *   <li>{@link org.bimserver.database.store.ConcreteRevision#getChecksum <em>Checksum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.database.store.StorePackage#getConcreteRevision()
 * @model
 * @generated
 */
public interface ConcreteRevision extends Revision {

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.database.store.Project#getConcreteRevisions <em>Concrete Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Project()
	 * @see org.bimserver.database.store.Project#getConcreteRevisions
	 * @model opposite="concreteRevisions" required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Finalized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalized</em>' attribute.
	 * @see #setFinalized(boolean)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Finalized()
	 * @model
	 * @generated
	 */
	boolean isFinalized();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#isFinalized <em>Finalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalized</em>' attribute.
	 * @see #isFinalized()
	 * @generated
	 */
	void setFinalized(boolean value);

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(byte[])
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Checksum()
	 * @model
	 * @generated
	 */
	byte[] getChecksum();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getChecksum <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(byte[] value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_User()
	 * @model required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see org.bimserver.database.store.StorePackage#getConcreteRevision_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.ConcreteRevision#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

} // ConcreteRevision
