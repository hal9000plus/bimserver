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
 * A representation of the model object '<em><b>Ifc Calendar Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCalendarDate#getDayComponent <em>Day Component</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCalendarDate#getMonthComponent <em>Month Component</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCalendarDate#getYearComponent <em>Year Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCalendarDate()
 * @model
 * @generated
 */
public interface IfcCalendarDate extends IfcDateTimeSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Day Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Component</em>' reference.
	 * @see #setDayComponent(IfcDayInMonthNumber)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCalendarDate_DayComponent()
	 * @model
	 * @generated
	 */
	IfcDayInMonthNumber getDayComponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCalendarDate#getDayComponent <em>Day Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Component</em>' reference.
	 * @see #getDayComponent()
	 * @generated
	 */
	void setDayComponent(IfcDayInMonthNumber value);

	/**
	 * Returns the value of the '<em><b>Month Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month Component</em>' reference.
	 * @see #setMonthComponent(IfcMonthInYearNumber)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCalendarDate_MonthComponent()
	 * @model
	 * @generated
	 */
	IfcMonthInYearNumber getMonthComponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCalendarDate#getMonthComponent <em>Month Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month Component</em>' reference.
	 * @see #getMonthComponent()
	 * @generated
	 */
	void setMonthComponent(IfcMonthInYearNumber value);

	/**
	 * Returns the value of the '<em><b>Year Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Component</em>' reference.
	 * @see #setYearComponent(IfcYearNumber)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCalendarDate_YearComponent()
	 * @model
	 * @generated
	 */
	IfcYearNumber getYearComponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCalendarDate#getYearComponent <em>Year Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Component</em>' reference.
	 * @see #getYearComponent()
	 * @generated
	 */
	void setYearComponent(IfcYearNumber value);

} // IfcCalendarDate
