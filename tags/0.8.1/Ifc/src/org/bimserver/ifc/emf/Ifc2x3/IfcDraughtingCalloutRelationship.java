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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Draughting Callout Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship()
 * @model
 * @generated
 */
public interface IfcDraughtingCalloutRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship_Name()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getName();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(IfcLabel)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' reference is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(IfcLabel)
	 * @generated
	 */
	boolean isSetName();

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcText getDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(IfcText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Relating Draughting Callout</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCallout#getIsRelatedToCallout <em>Is Related To Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Draughting Callout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Draughting Callout</em>' reference.
	 * @see #setRelatingDraughtingCallout(IfcDraughtingCallout)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship_RelatingDraughtingCallout()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCallout#getIsRelatedToCallout
	 * @model opposite="IsRelatedToCallout"
	 * @generated
	 */
	IfcDraughtingCallout getRelatingDraughtingCallout();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Draughting Callout</em>' reference.
	 * @see #getRelatingDraughtingCallout()
	 * @generated
	 */
	void setRelatingDraughtingCallout(IfcDraughtingCallout value);

	/**
	 * Returns the value of the '<em><b>Related Draughting Callout</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCallout#getIsRelatedFromCallout <em>Is Related From Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Draughting Callout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Draughting Callout</em>' reference.
	 * @see #setRelatedDraughtingCallout(IfcDraughtingCallout)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship_RelatedDraughtingCallout()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCallout#getIsRelatedFromCallout
	 * @model opposite="IsRelatedFromCallout"
	 * @generated
	 */
	IfcDraughtingCallout getRelatedDraughtingCallout();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Draughting Callout</em>' reference.
	 * @see #getRelatedDraughtingCallout()
	 * @generated
	 */
	void setRelatedDraughtingCallout(IfcDraughtingCallout value);

} // IfcDraughtingCalloutRelationship
