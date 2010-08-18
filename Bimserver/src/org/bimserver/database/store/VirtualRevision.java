/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.store;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.database.store.VirtualRevision#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bimserver.database.store.VirtualRevision#getLastRevision <em>Last Revision</em>}</li>
 *   <li>{@link org.bimserver.database.store.VirtualRevision#getCheckouts <em>Checkouts</em>}</li>
 *   <li>{@link org.bimserver.database.store.VirtualRevision#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.database.store.StorePackage#getVirtualRevision()
 * @model
 * @generated
 */
public interface VirtualRevision extends Revision {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.database.store.Project#getVirtualRevisions <em>Virtual Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see org.bimserver.database.store.StorePackage#getVirtualRevision_Project()
	 * @see org.bimserver.database.store.Project#getVirtualRevisions
	 * @model opposite="virtualRevisions" required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.VirtualRevision#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.database.store.ConcreteRevision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see org.bimserver.database.store.StorePackage#getVirtualRevision_Revisions()
	 * @model
	 * @generated
	 */
	EList<ConcreteRevision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Last Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Revision</em>' reference.
	 * @see #setLastRevision(ConcreteRevision)
	 * @see org.bimserver.database.store.StorePackage#getVirtualRevision_LastRevision()
	 * @model
	 * @generated
	 */
	ConcreteRevision getLastRevision();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.VirtualRevision#getLastRevision <em>Last Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision</em>' reference.
	 * @see #getLastRevision()
	 * @generated
	 */
	void setLastRevision(ConcreteRevision value);

	/**
	 * Returns the value of the '<em><b>Checkouts</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.database.store.Checkout}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.database.store.Checkout#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkouts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkouts</em>' reference list.
	 * @see org.bimserver.database.store.StorePackage#getVirtualRevision_Checkouts()
	 * @see org.bimserver.database.store.Checkout#getRevision
	 * @model opposite="revision"
	 * @generated
	 */
	EList<Checkout> getCheckouts();

} // VirtualRevision
