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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcQuantityTime#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcQuantityTime#getTimeValueAsString <em>Time Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcQuantityTime()
 * @model
 * @generated
 */
public interface IfcQuantityTime extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' attribute.
	 * @see #isSetTimeValue()
	 * @see #unsetTimeValue()
	 * @see #setTimeValue(double)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcQuantityTime_TimeValue()
	 * @model unsettable="true"
	 * @generated
	 */
	double getTimeValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcQuantityTime#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' attribute.
	 * @see #isSetTimeValue()
	 * @see #unsetTimeValue()
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(double value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcQuantityTime#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeValue()
	 * @see #getTimeValue()
	 * @see #setTimeValue(double)
	 * @generated
	 */
	void unsetTimeValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcQuantityTime#getTimeValue <em>Time Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Value</em>' attribute is set.
	 * @see #unsetTimeValue()
	 * @see #getTimeValue()
	 * @see #setTimeValue(double)
	 * @generated
	 */
	boolean isSetTimeValue();

	/**
	 * Returns the value of the '<em><b>Time Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value As String</em>' attribute.
	 * @see #isSetTimeValueAsString()
	 * @see #unsetTimeValueAsString()
	 * @see #setTimeValueAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcQuantityTime_TimeValueAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTimeValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcQuantityTime#getTimeValueAsString <em>Time Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value As String</em>' attribute.
	 * @see #isSetTimeValueAsString()
	 * @see #unsetTimeValueAsString()
	 * @see #getTimeValueAsString()
	 * @generated
	 */
	void setTimeValueAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcQuantityTime#getTimeValueAsString <em>Time Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeValueAsString()
	 * @see #getTimeValueAsString()
	 * @see #setTimeValueAsString(String)
	 * @generated
	 */
	void unsetTimeValueAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcQuantityTime#getTimeValueAsString <em>Time Value As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time Value As String</em>' attribute is set.
	 * @see #unsetTimeValueAsString()
	 * @see #getTimeValueAsString()
	 * @see #setTimeValueAsString(String)
	 * @generated
	 */
	boolean isSetTimeValueAsString();

} // IfcQuantityTime
