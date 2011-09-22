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
 * A representation of the model object '<em><b>Ifc Covering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCovering#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCovering#getCoversSpaces <em>Covers Spaces</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCovering#getCovers <em>Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCovering()
 * @model
 * @generated
 */
public interface IfcCovering extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcCoveringTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcCoveringTypeEnum
	 * @see #setPredefinedType(IfcCoveringTypeEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCovering_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcCoveringTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCovering#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcCoveringTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCoveringTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Covers Spaces</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversSpaces}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversSpaces#getRelatedCoverings <em>Related Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covers Spaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers Spaces</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCovering_CoversSpaces()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversSpaces#getRelatedCoverings
	 * @model opposite="RelatedCoverings" upper="2"
	 * @generated
	 */
	EList<IfcRelCoversSpaces> getCoversSpaces();

	/**
	 * Returns the value of the '<em><b>Covers</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversBldgElements}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversBldgElements#getRelatedCoverings <em>Related Coverings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Covers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covers</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCovering_Covers()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversBldgElements#getRelatedCoverings
	 * @model opposite="RelatedCoverings" upper="2"
	 * @generated
	 */
	EList<IfcRelCoversBldgElements> getCovers();

} // IfcCovering