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
package org.bimserver.ifc.emf.Ifc2x3.impl;

import org.bimserver.ifc.IfcRootObject;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcCalendarDate;
import org.bimserver.ifc.emf.Ifc2x3.IfcDayInMonthNumber;
import org.bimserver.ifc.emf.Ifc2x3.IfcMonthInYearNumber;
import org.bimserver.ifc.emf.Ifc2x3.IfcYearNumber;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Calendar Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCalendarDateImpl#getDayComponent <em>Day Component</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCalendarDateImpl#getMonthComponent <em>Month Component</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCalendarDateImpl#getYearComponent <em>Year Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCalendarDateImpl extends IfcRootObject implements IfcCalendarDate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCalendarDateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcCalendarDate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDayInMonthNumber getDayComponent() {
		return (IfcDayInMonthNumber) eGet(Ifc2x3Package.eINSTANCE.getIfcCalendarDate_DayComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayComponent(IfcDayInMonthNumber newDayComponent) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCalendarDate_DayComponent(), newDayComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonthInYearNumber getMonthComponent() {
		return (IfcMonthInYearNumber) eGet(Ifc2x3Package.eINSTANCE.getIfcCalendarDate_MonthComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonthComponent(IfcMonthInYearNumber newMonthComponent) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCalendarDate_MonthComponent(), newMonthComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcYearNumber getYearComponent() {
		return (IfcYearNumber) eGet(Ifc2x3Package.eINSTANCE.getIfcCalendarDate_YearComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearComponent(IfcYearNumber newYearComponent) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCalendarDate_YearComponent(), newYearComponent);
	}

} //IfcCalendarDateImpl
