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
 * A representation of the model object '<em><b>Ifc Axis1 Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcAxis1Placement#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcAxis1Placement#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcAxis1Placement()
 * @model
 * @generated
 */
public interface IfcAxis1Placement extends IfcPlacement {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #isSetAxis()
	 * @see #unsetAxis()
	 * @see #setAxis(IfcDirection)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcAxis1Placement_Axis()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDirection getAxis();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAxis1Placement#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #isSetAxis()
	 * @see #unsetAxis()
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(IfcDirection value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAxis1Placement#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxis()
	 * @see #getAxis()
	 * @see #setAxis(IfcDirection)
	 * @generated
	 */
	void unsetAxis();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAxis1Placement#getAxis <em>Axis</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis</em>' reference is set.
	 * @see #unsetAxis()
	 * @see #getAxis()
	 * @see #setAxis(IfcDirection)
	 * @generated
	 */
	boolean isSetAxis();

	/**
	 * Returns the value of the '<em><b>Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' reference.
	 * @see #setZ(IfcDirection)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcAxis1Placement_Z()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' NVL (IfcNormalise(Axis), IfcRepresentationItem() || IfcGeometricRepresentationItem () || IfcDirection([0.0,0.0,1.0]));'"
	 * @generated
	 */
	IfcDirection getZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAxis1Placement#getZ <em>Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(IfcDirection value);

} // IfcAxis1Placement
