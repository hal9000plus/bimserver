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
 * A representation of the model object '<em><b>Ifc Ellipse Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcEllipseProfileDef#getSemiAxis1 <em>Semi Axis1</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcEllipseProfileDef#getSemiAxis2 <em>Semi Axis2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcEllipseProfileDef()
 * @model
 * @generated
 */
public interface IfcEllipseProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>Semi Axis1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semi Axis1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Axis1</em>' reference.
	 * @see #setSemiAxis1(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcEllipseProfileDef_SemiAxis1()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getSemiAxis1();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcEllipseProfileDef#getSemiAxis1 <em>Semi Axis1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Axis1</em>' reference.
	 * @see #getSemiAxis1()
	 * @generated
	 */
	void setSemiAxis1(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Semi Axis2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semi Axis2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semi Axis2</em>' reference.
	 * @see #setSemiAxis2(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcEllipseProfileDef_SemiAxis2()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getSemiAxis2();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcEllipseProfileDef#getSemiAxis2 <em>Semi Axis2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Axis2</em>' reference.
	 * @see #getSemiAxis2()
	 * @generated
	 */
	void setSemiAxis2(IfcPositiveLengthMeasure value);

} // IfcEllipseProfileDef
