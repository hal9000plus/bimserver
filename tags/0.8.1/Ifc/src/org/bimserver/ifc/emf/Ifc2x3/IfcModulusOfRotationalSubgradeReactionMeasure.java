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
 * A representation of the model object '<em><b>Ifc Modulus Of Rotational Subgrade Reaction Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcModulusOfRotationalSubgradeReactionMeasure#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcModulusOfRotationalSubgradeReactionMeasure#getStringValuewrappedValue <em>String Valuewrapped Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcModulusOfRotationalSubgradeReactionMeasure()
 * @model
 * @generated
 */
public interface IfcModulusOfRotationalSubgradeReactionMeasure extends WrappedValue, IfcDerivedMeasureValue {
	/**
	 * Returns the value of the '<em><b>Wrapped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value</em>' attribute.
	 * @see #setWrappedValue(float)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcModulusOfRotationalSubgradeReactionMeasure_WrappedValue()
	 * @model
	 * @generated
	 */
	float getWrappedValue();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcModulusOfRotationalSubgradeReactionMeasure#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Value</em>' attribute.
	 * @see #getWrappedValue()
	 * @generated
	 */
	void setWrappedValue(float value);

	/**
	 * Returns the value of the '<em><b>String Valuewrapped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Valuewrapped Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Valuewrapped Value</em>' attribute.
	 * @see #setStringValuewrappedValue(String)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcModulusOfRotationalSubgradeReactionMeasure_StringValuewrappedValue()
	 * @model
	 * @generated
	 */
	String getStringValuewrappedValue();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcModulusOfRotationalSubgradeReactionMeasure#getStringValuewrappedValue <em>String Valuewrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Valuewrapped Value</em>' attribute.
	 * @see #getStringValuewrappedValue()
	 * @generated
	 */
	void setStringValuewrappedValue(String value);

} // IfcModulusOfRotationalSubgradeReactionMeasure