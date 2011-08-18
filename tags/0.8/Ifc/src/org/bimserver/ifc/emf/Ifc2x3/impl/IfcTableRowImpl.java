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
import org.bimserver.ifc.emf.Ifc2x3.IfcLogical;
import org.bimserver.ifc.emf.Ifc2x3.IfcTable;
import org.bimserver.ifc.emf.Ifc2x3.IfcTableRow;
import org.bimserver.ifc.emf.Ifc2x3.IfcValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTableRowImpl#getRowCells <em>Row Cells</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTableRowImpl#getIsHeading <em>Is Heading</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTableRowImpl#getOfTable <em>Of Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTableRowImpl extends IfcRootObject implements IfcTableRow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcTableRow();
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
	public EList<IfcValue> getRowCells() {
		return (EList<IfcValue>) eGet(Ifc2x3Package.eINSTANCE.getIfcTableRow_RowCells(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogical getIsHeading() {
		return (IfcLogical) eGet(Ifc2x3Package.eINSTANCE.getIfcTableRow_IsHeading(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHeading(IfcLogical newIsHeading) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTableRow_IsHeading(), newIsHeading);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTable getOfTable() {
		return (IfcTable) eGet(Ifc2x3Package.eINSTANCE.getIfcTableRow_OfTable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfTable(IfcTable newOfTable) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTableRow_OfTable(), newOfTable);
	}

} //IfcTableRowImpl