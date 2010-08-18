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
 * A representation of the model object '<em><b>Ifc Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTable#getRows <em>Rows</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTable#getNumberOfHeadings <em>Number Of Headings</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTable#getNumberOfDataRows <em>Number Of Data Rows</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTable#getNumberOfCellsInRow <em>Number Of Cells In Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTable()
 * @model
 * @generated
 */
public interface IfcTable extends IfcMetricValueSelect {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcTableRow}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTableRow#getOfTable <em>Of Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTable_Rows()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcTableRow#getOfTable
	 * @model opposite="OfTable"
	 * @generated
	 */
	EList<IfcTableRow> getRows();

	/**
	 * Returns the value of the '<em><b>Number Of Headings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Headings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Headings</em>' reference.
	 * @see #setNumberOfHeadings(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTable_NumberOfHeadings()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' SIZEOF(QUERY( Temp <* Rows | Temp.IsHeading));'"
	 * @generated
	 */
	IfcInteger getNumberOfHeadings();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTable#getNumberOfHeadings <em>Number Of Headings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Headings</em>' reference.
	 * @see #getNumberOfHeadings()
	 * @generated
	 */
	void setNumberOfHeadings(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Number Of Data Rows</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Data Rows</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Data Rows</em>' reference.
	 * @see #setNumberOfDataRows(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTable_NumberOfDataRows()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' SIZEOF(QUERY( Temp <* Rows | NOT(Temp.IsHeading)));'"
	 * @generated
	 */
	IfcInteger getNumberOfDataRows();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTable#getNumberOfDataRows <em>Number Of Data Rows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Data Rows</em>' reference.
	 * @see #getNumberOfDataRows()
	 * @generated
	 */
	void setNumberOfDataRows(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Number Of Cells In Row</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Cells In Row</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Cells In Row</em>' reference.
	 * @see #setNumberOfCellsInRow(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTable_NumberOfCellsInRow()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' HIINDEX(Rows[1].RowCells);'"
	 * @generated
	 */
	IfcInteger getNumberOfCellsInRow();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTable#getNumberOfCellsInRow <em>Number Of Cells In Row</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Cells In Row</em>' reference.
	 * @see #getNumberOfCellsInRow()
	 * @generated
	 */
	void setNumberOfCellsInRow(IfcInteger value);

} // IfcTable
