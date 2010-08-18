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
 * A representation of the model object '<em><b>Ifc Postal Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getInternalLocation <em>Internal Location</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getAddressLines <em>Address Lines</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getPostalBox <em>Postal Box</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getTown <em>Town</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getRegion <em>Region</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPostalAddress()
 * @model
 * @generated
 */
public interface IfcPostalAddress extends IfcAddress {
	/**
	 * Returns the value of the '<em><b>Internal Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Location</em>' reference.
	 * @see #isSetInternalLocation()
	 * @see #unsetInternalLocation()
	 * @see #setInternalLocation(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPostalAddress_InternalLocation()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getInternalLocation();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getInternalLocation <em>Internal Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Location</em>' reference.
	 * @see #isSetInternalLocation()
	 * @see #unsetInternalLocation()
	 * @see #getInternalLocation()
	 * @generated
	 */
	void setInternalLocation(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getInternalLocation <em>Internal Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInternalLocation()
	 * @see #getInternalLocation()
	 * @see #setInternalLocation(IfcLabel)
	 * @generated
	 */
	void unsetInternalLocation();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getInternalLocation <em>Internal Location</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Internal Location</em>' reference is set.
	 * @see #unsetInternalLocation()
	 * @see #getInternalLocation()
	 * @see #setInternalLocation(IfcLabel)
	 * @generated
	 */
	boolean isSetInternalLocation();

	/**
	 * Returns the value of the '<em><b>Address Lines</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Lines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Lines</em>' reference list.
	 * @see #isSetAddressLines()
	 * @see #unsetAddressLines()
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPostalAddress_AddressLines()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcLabel> getAddressLines();

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getAddressLines <em>Address Lines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddressLines()
	 * @see #getAddressLines()
	 * @generated
	 */
	void unsetAddressLines();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getAddressLines <em>Address Lines</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Address Lines</em>' reference list is set.
	 * @see #unsetAddressLines()
	 * @see #getAddressLines()
	 * @generated
	 */
	boolean isSetAddressLines();

	/**
	 * Returns the value of the '<em><b>Postal Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Box</em>' reference.
	 * @see #isSetPostalBox()
	 * @see #unsetPostalBox()
	 * @see #setPostalBox(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPostalAddress_PostalBox()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getPostalBox();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getPostalBox <em>Postal Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Box</em>' reference.
	 * @see #isSetPostalBox()
	 * @see #unsetPostalBox()
	 * @see #getPostalBox()
	 * @generated
	 */
	void setPostalBox(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getPostalBox <em>Postal Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostalBox()
	 * @see #getPostalBox()
	 * @see #setPostalBox(IfcLabel)
	 * @generated
	 */
	void unsetPostalBox();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getPostalBox <em>Postal Box</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Postal Box</em>' reference is set.
	 * @see #unsetPostalBox()
	 * @see #getPostalBox()
	 * @see #setPostalBox(IfcLabel)
	 * @generated
	 */
	boolean isSetPostalBox();

	/**
	 * Returns the value of the '<em><b>Town</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Town</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Town</em>' reference.
	 * @see #isSetTown()
	 * @see #unsetTown()
	 * @see #setTown(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPostalAddress_Town()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getTown();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getTown <em>Town</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Town</em>' reference.
	 * @see #isSetTown()
	 * @see #unsetTown()
	 * @see #getTown()
	 * @generated
	 */
	void setTown(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getTown <em>Town</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTown()
	 * @see #getTown()
	 * @see #setTown(IfcLabel)
	 * @generated
	 */
	void unsetTown();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getTown <em>Town</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Town</em>' reference is set.
	 * @see #unsetTown()
	 * @see #getTown()
	 * @see #setTown(IfcLabel)
	 * @generated
	 */
	boolean isSetTown();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #isSetRegion()
	 * @see #unsetRegion()
	 * @see #setRegion(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPostalAddress_Region()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getRegion();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #isSetRegion()
	 * @see #unsetRegion()
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRegion()
	 * @see #getRegion()
	 * @see #setRegion(IfcLabel)
	 * @generated
	 */
	void unsetRegion();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getRegion <em>Region</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Region</em>' reference is set.
	 * @see #unsetRegion()
	 * @see #getRegion()
	 * @see #setRegion(IfcLabel)
	 * @generated
	 */
	boolean isSetRegion();

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' reference.
	 * @see #isSetPostalCode()
	 * @see #unsetPostalCode()
	 * @see #setPostalCode(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPostalAddress_PostalCode()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getPostalCode();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getPostalCode <em>Postal Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' reference.
	 * @see #isSetPostalCode()
	 * @see #unsetPostalCode()
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getPostalCode <em>Postal Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPostalCode()
	 * @see #getPostalCode()
	 * @see #setPostalCode(IfcLabel)
	 * @generated
	 */
	void unsetPostalCode();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getPostalCode <em>Postal Code</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Postal Code</em>' reference is set.
	 * @see #unsetPostalCode()
	 * @see #getPostalCode()
	 * @see #setPostalCode(IfcLabel)
	 * @generated
	 */
	boolean isSetPostalCode();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #setCountry(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPostalAddress_Country()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getCountry();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #isSetCountry()
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCountry()
	 * @see #getCountry()
	 * @see #setCountry(IfcLabel)
	 * @generated
	 */
	void unsetCountry();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress#getCountry <em>Country</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Country</em>' reference is set.
	 * @see #unsetCountry()
	 * @see #getCountry()
	 * @see #setCountry(IfcLabel)
	 * @generated
	 */
	boolean isSetCountry();

} // IfcPostalAddress
