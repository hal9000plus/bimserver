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

import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcInteger;
import org.bimserver.ifc.emf.Ifc2x3.IfcTable;
import org.bimserver.ifc.emf.Ifc2x3.IfcTableRow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTableImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTableImpl#getNumberOfHeadings <em>Number Of Headings</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTableImpl#getNumberOfDataRows <em>Number Of Data Rows</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTableImpl#getNumberOfCellsInRow <em>Number Of Cells In Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTableImpl extends EObjectImpl implements IfcTable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcTable();
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
	@SuppressWarnings("unchecked")
	public EList<IfcTableRow> getRows() {
		return (EList<IfcTableRow>) eGet(Ifc2x3Package.eINSTANCE.getIfcTable_Rows(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getNumberOfHeadings() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcTable_NumberOfHeadings(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfHeadings(IfcInteger newNumberOfHeadings) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTable_NumberOfHeadings(), newNumberOfHeadings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getNumberOfDataRows() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcTable_NumberOfDataRows(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDataRows(IfcInteger newNumberOfDataRows) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTable_NumberOfDataRows(), newNumberOfDataRows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getNumberOfCellsInRow() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcTable_NumberOfCellsInRow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCellsInRow(IfcInteger newNumberOfCellsInRow) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTable_NumberOfCellsInRow(), newNumberOfCellsInRow);
	}

} //IfcTableImpl
