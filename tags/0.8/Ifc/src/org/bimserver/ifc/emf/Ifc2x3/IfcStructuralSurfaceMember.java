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
 * A representation of the model object '<em><b>Ifc Structural Surface Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSurfaceMember()
 * @model
 * @generated
 */
public interface IfcStructuralSurfaceMember extends IfcStructuralMember {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceTypeEnum
	 * @see #setPredefinedType(IfcStructuralSurfaceTypeEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSurfaceMember_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcStructuralSurfaceTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcStructuralSurfaceTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' reference.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #setThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSurfaceMember_Thickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' reference.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThickness()
	 * @see #getThickness()
	 * @see #setThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness</em>' reference is set.
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @see #setThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetThickness();

} // IfcStructuralSurfaceMember