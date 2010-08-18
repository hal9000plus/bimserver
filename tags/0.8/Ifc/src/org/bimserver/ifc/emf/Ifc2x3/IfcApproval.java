/**
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
 * 
 *
 * $Id$
 */
package org.bimserver.ifc.emf.Ifc2x3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Approval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalDateTime <em>Approval Date Time</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalLevel <em>Approval Level</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalQualifier <em>Approval Qualifier</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getActors <em>Actors</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getRelates <em>Relates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval()
 * @model
 * @generated
 */
public interface IfcApproval extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(IfcText)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcText getDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(IfcText value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(IfcText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getDescription <em>Description</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' reference is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(IfcText)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Approval Date Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Date Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Date Time</em>' reference.
	 * @see #setApprovalDateTime(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_ApprovalDateTime()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getApprovalDateTime();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalDateTime <em>Approval Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Date Time</em>' reference.
	 * @see #getApprovalDateTime()
	 * @generated
	 */
	void setApprovalDateTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Approval Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Status</em>' reference.
	 * @see #isSetApprovalStatus()
	 * @see #unsetApprovalStatus()
	 * @see #setApprovalStatus(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_ApprovalStatus()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getApprovalStatus();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalStatus <em>Approval Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Status</em>' reference.
	 * @see #isSetApprovalStatus()
	 * @see #unsetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @generated
	 */
	void setApprovalStatus(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalStatus <em>Approval Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @see #setApprovalStatus(IfcLabel)
	 * @generated
	 */
	void unsetApprovalStatus();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalStatus <em>Approval Status</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approval Status</em>' reference is set.
	 * @see #unsetApprovalStatus()
	 * @see #getApprovalStatus()
	 * @see #setApprovalStatus(IfcLabel)
	 * @generated
	 */
	boolean isSetApprovalStatus();

	/**
	 * Returns the value of the '<em><b>Approval Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Level</em>' reference.
	 * @see #isSetApprovalLevel()
	 * @see #unsetApprovalLevel()
	 * @see #setApprovalLevel(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_ApprovalLevel()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getApprovalLevel();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalLevel <em>Approval Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Level</em>' reference.
	 * @see #isSetApprovalLevel()
	 * @see #unsetApprovalLevel()
	 * @see #getApprovalLevel()
	 * @generated
	 */
	void setApprovalLevel(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalLevel <em>Approval Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovalLevel()
	 * @see #getApprovalLevel()
	 * @see #setApprovalLevel(IfcLabel)
	 * @generated
	 */
	void unsetApprovalLevel();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalLevel <em>Approval Level</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approval Level</em>' reference is set.
	 * @see #unsetApprovalLevel()
	 * @see #getApprovalLevel()
	 * @see #setApprovalLevel(IfcLabel)
	 * @generated
	 */
	boolean isSetApprovalLevel();

	/**
	 * Returns the value of the '<em><b>Approval Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Qualifier</em>' reference.
	 * @see #isSetApprovalQualifier()
	 * @see #unsetApprovalQualifier()
	 * @see #setApprovalQualifier(IfcText)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_ApprovalQualifier()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcText getApprovalQualifier();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalQualifier <em>Approval Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Qualifier</em>' reference.
	 * @see #isSetApprovalQualifier()
	 * @see #unsetApprovalQualifier()
	 * @see #getApprovalQualifier()
	 * @generated
	 */
	void setApprovalQualifier(IfcText value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalQualifier <em>Approval Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprovalQualifier()
	 * @see #getApprovalQualifier()
	 * @see #setApprovalQualifier(IfcText)
	 * @generated
	 */
	void unsetApprovalQualifier();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getApprovalQualifier <em>Approval Qualifier</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approval Qualifier</em>' reference is set.
	 * @see #unsetApprovalQualifier()
	 * @see #getApprovalQualifier()
	 * @see #setApprovalQualifier(IfcText)
	 * @generated
	 */
	boolean isSetApprovalQualifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_Name()
	 * @model
	 * @generated
	 */
	IfcLabel getName();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(IfcLabel value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(IfcIdentifier)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_Identifier()
	 * @model
	 * @generated
	 */
	IfcIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApproval#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IfcIdentifier value);

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcApprovalActorRelationship}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApprovalActorRelationship#getApproval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_Actors()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcApprovalActorRelationship#getApproval
	 * @model opposite="Approval"
	 * @generated
	 */
	EList<IfcApprovalActorRelationship> getActors();

	/**
	 * Returns the value of the '<em><b>Is Related With</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcApprovalRelationship}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApprovalRelationship#getRelatedApproval <em>Related Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related With</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_IsRelatedWith()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcApprovalRelationship#getRelatedApproval
	 * @model opposite="RelatedApproval"
	 * @generated
	 */
	EList<IfcApprovalRelationship> getIsRelatedWith();

	/**
	 * Returns the value of the '<em><b>Relates</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcApprovalRelationship}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcApprovalRelationship#getRelatingApproval <em>Relating Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcApproval_Relates()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcApprovalRelationship#getRelatingApproval
	 * @model opposite="RelatingApproval"
	 * @generated
	 */
	EList<IfcApprovalRelationship> getRelates();

} // IfcApproval
