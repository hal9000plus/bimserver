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
 * A representation of the model object '<em><b>Ifc Organization Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getRelatingOrganization <em>Relating Organization</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getRelatedOrganizations <em>Related Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOrganizationRelationship()
 * @model
 * @generated
 */
public interface IfcOrganizationRelationship extends EObject {
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOrganizationRelationship_Name()
	 * @model
	 * @generated
	 */
	IfcLabel getName();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(IfcLabel value);

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOrganizationRelationship_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcText getDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getDescription <em>Description</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(IfcText)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getDescription <em>Description</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Relating Organization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganization#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Organization</em>' reference.
	 * @see #setRelatingOrganization(IfcOrganization)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOrganizationRelationship_RelatingOrganization()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcOrganization#getRelates
	 * @model opposite="Relates"
	 * @generated
	 */
	IfcOrganization getRelatingOrganization();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganizationRelationship#getRelatingOrganization <em>Relating Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Organization</em>' reference.
	 * @see #getRelatingOrganization()
	 * @generated
	 */
	void setRelatingOrganization(IfcOrganization value);

	/**
	 * Returns the value of the '<em><b>Related Organizations</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganization}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOrganization#getIsRelatedBy <em>Is Related By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Organizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Organizations</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOrganizationRelationship_RelatedOrganizations()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcOrganization#getIsRelatedBy
	 * @model opposite="IsRelatedBy"
	 * @generated
	 */
	EList<IfcOrganization> getRelatedOrganizations();

} // IfcOrganizationRelationship
