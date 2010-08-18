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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getId <em>Id</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getMiddleNames <em>Middle Names</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getPrefixTitles <em>Prefix Titles</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getSuffixTitles <em>Suffix Titles</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getEngagedIn <em>Engaged In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson()
 * @model
 * @generated
 */
public interface IfcPerson extends IfcActorSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' reference.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(IfcIdentifier)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_Id()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcIdentifier getId();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' reference.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(IfcIdentifier value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getId <em>Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(IfcIdentifier)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getId <em>Id</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' reference is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(IfcIdentifier)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' reference.
	 * @see #isSetFamilyName()
	 * @see #unsetFamilyName()
	 * @see #setFamilyName(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_FamilyName()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getFamilyName();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getFamilyName <em>Family Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' reference.
	 * @see #isSetFamilyName()
	 * @see #unsetFamilyName()
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getFamilyName <em>Family Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFamilyName()
	 * @see #getFamilyName()
	 * @see #setFamilyName(IfcLabel)
	 * @generated
	 */
	void unsetFamilyName();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getFamilyName <em>Family Name</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Family Name</em>' reference is set.
	 * @see #unsetFamilyName()
	 * @see #getFamilyName()
	 * @see #setFamilyName(IfcLabel)
	 * @generated
	 */
	boolean isSetFamilyName();

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' reference.
	 * @see #isSetGivenName()
	 * @see #unsetGivenName()
	 * @see #setGivenName(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_GivenName()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getGivenName();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getGivenName <em>Given Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' reference.
	 * @see #isSetGivenName()
	 * @see #unsetGivenName()
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getGivenName <em>Given Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGivenName()
	 * @see #getGivenName()
	 * @see #setGivenName(IfcLabel)
	 * @generated
	 */
	void unsetGivenName();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getGivenName <em>Given Name</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Given Name</em>' reference is set.
	 * @see #unsetGivenName()
	 * @see #getGivenName()
	 * @see #setGivenName(IfcLabel)
	 * @generated
	 */
	boolean isSetGivenName();

	/**
	 * Returns the value of the '<em><b>Middle Names</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Names</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Names</em>' reference list.
	 * @see #isSetMiddleNames()
	 * @see #unsetMiddleNames()
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_MiddleNames()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcLabel> getMiddleNames();

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getMiddleNames <em>Middle Names</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMiddleNames()
	 * @see #getMiddleNames()
	 * @generated
	 */
	void unsetMiddleNames();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getMiddleNames <em>Middle Names</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Middle Names</em>' reference list is set.
	 * @see #unsetMiddleNames()
	 * @see #getMiddleNames()
	 * @generated
	 */
	boolean isSetMiddleNames();

	/**
	 * Returns the value of the '<em><b>Prefix Titles</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Titles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Titles</em>' reference list.
	 * @see #isSetPrefixTitles()
	 * @see #unsetPrefixTitles()
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_PrefixTitles()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcLabel> getPrefixTitles();

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getPrefixTitles <em>Prefix Titles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefixTitles()
	 * @see #getPrefixTitles()
	 * @generated
	 */
	void unsetPrefixTitles();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getPrefixTitles <em>Prefix Titles</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix Titles</em>' reference list is set.
	 * @see #unsetPrefixTitles()
	 * @see #getPrefixTitles()
	 * @generated
	 */
	boolean isSetPrefixTitles();

	/**
	 * Returns the value of the '<em><b>Suffix Titles</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix Titles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix Titles</em>' reference list.
	 * @see #isSetSuffixTitles()
	 * @see #unsetSuffixTitles()
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_SuffixTitles()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcLabel> getSuffixTitles();

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getSuffixTitles <em>Suffix Titles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuffixTitles()
	 * @see #getSuffixTitles()
	 * @generated
	 */
	void unsetSuffixTitles();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getSuffixTitles <em>Suffix Titles</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suffix Titles</em>' reference list is set.
	 * @see #unsetSuffixTitles()
	 * @see #getSuffixTitles()
	 * @generated
	 */
	boolean isSetSuffixTitles();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcActorRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see #isSetRoles()
	 * @see #unsetRoles()
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_Roles()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcActorRole> getRoles();

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getRoles <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoles()
	 * @see #getRoles()
	 * @generated
	 */
	void unsetRoles();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getRoles <em>Roles</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Roles</em>' reference list is set.
	 * @see #unsetRoles()
	 * @see #getRoles()
	 * @generated
	 */
	boolean isSetRoles();

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcAddress}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAddress#getOfPerson <em>Of Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see #isSetAddresses()
	 * @see #unsetAddresses()
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_Addresses()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcAddress#getOfPerson
	 * @model opposite="OfPerson" unsettable="true"
	 * @generated
	 */
	EList<IfcAddress> getAddresses();

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getAddresses <em>Addresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddresses()
	 * @see #getAddresses()
	 * @generated
	 */
	void unsetAddresses();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson#getAddresses <em>Addresses</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Addresses</em>' reference list is set.
	 * @see #unsetAddresses()
	 * @see #getAddresses()
	 * @generated
	 */
	boolean isSetAddresses();

	/**
	 * Returns the value of the '<em><b>Engaged In</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcPersonAndOrganization}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPersonAndOrganization#getThePerson <em>The Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engaged In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engaged In</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPerson_EngagedIn()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcPersonAndOrganization#getThePerson
	 * @model opposite="ThePerson"
	 * @generated
	 */
	EList<IfcPersonAndOrganization> getEngagedIn();

} // IfcPerson
