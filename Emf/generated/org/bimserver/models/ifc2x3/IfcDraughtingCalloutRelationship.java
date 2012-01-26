/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;

import org.bimserver.emf.IdEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Draughting Callout Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface IfcDraughtingCalloutRelationship extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship_Name()
	 * @model unsettable="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Relating Draughting Callout</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcDraughtingCallout#getIsRelatedToCallout <em>Is Related To Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Draughting Callout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Draughting Callout</em>' reference.
	 * @see #isSetRelatingDraughtingCallout()
	 * @see #unsetRelatingDraughtingCallout()
	 * @see #setRelatingDraughtingCallout(IfcDraughtingCallout)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship_RelatingDraughtingCallout()
	 * @see org.bimserver.models.ifc2x3.IfcDraughtingCallout#getIsRelatedToCallout
	 * @model opposite="IsRelatedToCallout" unsettable="true"
	 * @generated
	 */
	IfcDraughtingCallout getRelatingDraughtingCallout();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Draughting Callout</em>' reference.
	 * @see #isSetRelatingDraughtingCallout()
	 * @see #unsetRelatingDraughtingCallout()
	 * @see #getRelatingDraughtingCallout()
	 * @generated
	 */
	void setRelatingDraughtingCallout(IfcDraughtingCallout value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatingDraughtingCallout()
	 * @see #getRelatingDraughtingCallout()
	 * @see #setRelatingDraughtingCallout(IfcDraughtingCallout)
	 * @generated
	 */
	void unsetRelatingDraughtingCallout();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relating Draughting Callout</em>' reference is set.
	 * @see #unsetRelatingDraughtingCallout()
	 * @see #getRelatingDraughtingCallout()
	 * @see #setRelatingDraughtingCallout(IfcDraughtingCallout)
	 * @generated
	 */
	boolean isSetRelatingDraughtingCallout();

	/**
	 * Returns the value of the '<em><b>Related Draughting Callout</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcDraughtingCallout#getIsRelatedFromCallout <em>Is Related From Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Draughting Callout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Draughting Callout</em>' reference.
	 * @see #isSetRelatedDraughtingCallout()
	 * @see #unsetRelatedDraughtingCallout()
	 * @see #setRelatedDraughtingCallout(IfcDraughtingCallout)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDraughtingCalloutRelationship_RelatedDraughtingCallout()
	 * @see org.bimserver.models.ifc2x3.IfcDraughtingCallout#getIsRelatedFromCallout
	 * @model opposite="IsRelatedFromCallout" unsettable="true"
	 * @generated
	 */
	IfcDraughtingCallout getRelatedDraughtingCallout();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Draughting Callout</em>' reference.
	 * @see #isSetRelatedDraughtingCallout()
	 * @see #unsetRelatedDraughtingCallout()
	 * @see #getRelatedDraughtingCallout()
	 * @generated
	 */
	void setRelatedDraughtingCallout(IfcDraughtingCallout value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatedDraughtingCallout()
	 * @see #getRelatedDraughtingCallout()
	 * @see #setRelatedDraughtingCallout(IfcDraughtingCallout)
	 * @generated
	 */
	void unsetRelatedDraughtingCallout();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Related Draughting Callout</em>' reference is set.
	 * @see #unsetRelatedDraughtingCallout()
	 * @see #getRelatedDraughtingCallout()
	 * @see #setRelatedDraughtingCallout(IfcDraughtingCallout)
	 * @generated
	 */
	boolean isSetRelatedDraughtingCallout();

} // IfcDraughtingCalloutRelationship
