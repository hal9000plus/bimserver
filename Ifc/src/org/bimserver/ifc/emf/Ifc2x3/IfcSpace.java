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
 * A representation of the model object '<em><b>Ifc Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpace#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpace#getHasCoverings <em>Has Coverings</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpace#getBoundedBy <em>Bounded By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpace()
 * @model
 * @generated
 */
public interface IfcSpace extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Interior Or Exterior Space</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcInternalOrExternalEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior Or Exterior Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior Or Exterior Space</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcInternalOrExternalEnum
	 * @see #setInteriorOrExteriorSpace(IfcInternalOrExternalEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpace_InteriorOrExteriorSpace()
	 * @model
	 * @generated
	 */
	IfcInternalOrExternalEnum getInteriorOrExteriorSpace();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpace#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior Or Exterior Space</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcInternalOrExternalEnum
	 * @see #getInteriorOrExteriorSpace()
	 * @generated
	 */
	void setInteriorOrExteriorSpace(IfcInternalOrExternalEnum value);

	/**
	 * Returns the value of the '<em><b>Elevation With Flooring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation With Flooring</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation With Flooring</em>' reference.
	 * @see #isSetElevationWithFlooring()
	 * @see #unsetElevationWithFlooring()
	 * @see #setElevationWithFlooring(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpace_ElevationWithFlooring()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getElevationWithFlooring();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation With Flooring</em>' reference.
	 * @see #isSetElevationWithFlooring()
	 * @see #unsetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @generated
	 */
	void setElevationWithFlooring(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @see #setElevationWithFlooring(IfcLengthMeasure)
	 * @generated
	 */
	void unsetElevationWithFlooring();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpace#getElevationWithFlooring <em>Elevation With Flooring</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation With Flooring</em>' reference is set.
	 * @see #unsetElevationWithFlooring()
	 * @see #getElevationWithFlooring()
	 * @see #setElevationWithFlooring(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetElevationWithFlooring();

	/**
	 * Returns the value of the '<em><b>Has Coverings</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversSpaces}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Coverings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Coverings</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpace_HasCoverings()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRelCoversSpaces#getRelatedSpace
	 * @model opposite="RelatedSpace"
	 * @generated
	 */
	EList<IfcRelCoversSpaces> getHasCoverings();

	/**
	 * Returns the value of the '<em><b>Bounded By</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcRelSpaceBoundary}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRelSpaceBoundary#getRelatingSpace <em>Relating Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded By</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpace_BoundedBy()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRelSpaceBoundary#getRelatingSpace
	 * @model opposite="RelatingSpace"
	 * @generated
	 */
	EList<IfcRelSpaceBoundary> getBoundedBy();

} // IfcSpace
