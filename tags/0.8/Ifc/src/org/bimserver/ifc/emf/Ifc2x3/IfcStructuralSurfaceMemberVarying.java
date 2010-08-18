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
 * A representation of the model object '<em><b>Ifc Structural Surface Member Varying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMemberVarying#getSubsequentThickness <em>Subsequent Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMemberVarying#getVaryingThicknessLocation <em>Varying Thickness Location</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMemberVarying#getVaryingThickness <em>Varying Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSurfaceMemberVarying()
 * @model
 * @generated
 */
public interface IfcStructuralSurfaceMemberVarying extends IfcStructuralSurfaceMember {
	/**
	 * Returns the value of the '<em><b>Subsequent Thickness</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Thickness</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Thickness</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSurfaceMemberVarying_SubsequentThickness()
	 * @model
	 * @generated
	 */
	EList<IfcPositiveLengthMeasure> getSubsequentThickness();

	/**
	 * Returns the value of the '<em><b>Varying Thickness Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varying Thickness Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varying Thickness Location</em>' reference.
	 * @see #setVaryingThicknessLocation(IfcShapeAspect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSurfaceMemberVarying_VaryingThicknessLocation()
	 * @model
	 * @generated
	 */
	IfcShapeAspect getVaryingThicknessLocation();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMemberVarying#getVaryingThicknessLocation <em>Varying Thickness Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varying Thickness Location</em>' reference.
	 * @see #getVaryingThicknessLocation()
	 * @generated
	 */
	void setVaryingThicknessLocation(IfcShapeAspect value);

	/**
	 * Returns the value of the '<em><b>Varying Thickness</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varying Thickness</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varying Thickness</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSurfaceMemberVarying_VaryingThickness()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' IfcAddToBeginOfList(SELF\\IfcStructuralSurfaceMember.Thickness, SubsequentThickness);'"
	 * @generated
	 */
	EList<IfcPositiveLengthMeasure> getVaryingThickness();

} // IfcStructuralSurfaceMemberVarying
