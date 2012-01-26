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
 * A representation of the model object '<em><b>Ifc Monetary Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMonetaryUnit#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMonetaryUnit()
 * @model
 * @generated
 */
public interface IfcMonetaryUnit extends IfcUnit {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcCurrencyEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcCurrencyEnum
	 * @see #isSetCurrency()
	 * @see #unsetCurrency()
	 * @see #setCurrency(IfcCurrencyEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMonetaryUnit_Currency()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCurrencyEnum getCurrency();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMonetaryUnit#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcCurrencyEnum
	 * @see #isSetCurrency()
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(IfcCurrencyEnum value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMonetaryUnit#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(IfcCurrencyEnum)
	 * @generated
	 */
	void unsetCurrency();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMonetaryUnit#getCurrency <em>Currency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Currency</em>' attribute is set.
	 * @see #unsetCurrency()
	 * @see #getCurrency()
	 * @see #setCurrency(IfcCurrencyEnum)
	 * @generated
	 */
	boolean isSetCurrency();

} // IfcMonetaryUnit
