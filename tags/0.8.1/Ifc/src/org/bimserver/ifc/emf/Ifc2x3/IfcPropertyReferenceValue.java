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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPropertyReferenceValue#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPropertyReferenceValue#getPropertyReference <em>Property Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPropertyReferenceValue()
 * @model
 * @generated
 */
public interface IfcPropertyReferenceValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Usage Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Name</em>' reference.
	 * @see #isSetUsageName()
	 * @see #unsetUsageName()
	 * @see #setUsageName(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPropertyReferenceValue_UsageName()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getUsageName();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPropertyReferenceValue#getUsageName <em>Usage Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Name</em>' reference.
	 * @see #isSetUsageName()
	 * @see #unsetUsageName()
	 * @see #getUsageName()
	 * @generated
	 */
	void setUsageName(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPropertyReferenceValue#getUsageName <em>Usage Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageName()
	 * @see #getUsageName()
	 * @see #setUsageName(IfcLabel)
	 * @generated
	 */
	void unsetUsageName();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPropertyReferenceValue#getUsageName <em>Usage Name</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Name</em>' reference is set.
	 * @see #unsetUsageName()
	 * @see #getUsageName()
	 * @see #setUsageName(IfcLabel)
	 * @generated
	 */
	boolean isSetUsageName();

	/**
	 * Returns the value of the '<em><b>Property Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Reference</em>' reference.
	 * @see #setPropertyReference(IfcObjectReferenceSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPropertyReferenceValue_PropertyReference()
	 * @model
	 * @generated
	 */
	IfcObjectReferenceSelect getPropertyReference();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPropertyReferenceValue#getPropertyReference <em>Property Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Reference</em>' reference.
	 * @see #getPropertyReference()
	 * @generated
	 */
	void setPropertyReference(IfcObjectReferenceSelect value);

} // IfcPropertyReferenceValue
