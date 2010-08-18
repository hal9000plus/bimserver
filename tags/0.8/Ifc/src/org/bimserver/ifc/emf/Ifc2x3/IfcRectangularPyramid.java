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
 * A representation of the model object '<em><b>Ifc Rectangular Pyramid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularPyramid#getXLength <em>XLength</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularPyramid#getYLength <em>YLength</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularPyramid#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularPyramid()
 * @model
 * @generated
 */
public interface IfcRectangularPyramid extends IfcCsgPrimitive3D {
	/**
	 * Returns the value of the '<em><b>XLength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XLength</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XLength</em>' reference.
	 * @see #setXLength(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularPyramid_XLength()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getXLength();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularPyramid#getXLength <em>XLength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XLength</em>' reference.
	 * @see #getXLength()
	 * @generated
	 */
	void setXLength(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>YLength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YLength</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YLength</em>' reference.
	 * @see #setYLength(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularPyramid_YLength()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getYLength();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularPyramid#getYLength <em>YLength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YLength</em>' reference.
	 * @see #getYLength()
	 * @generated
	 */
	void setYLength(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' reference.
	 * @see #setHeight(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularPyramid_Height()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getHeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularPyramid#getHeight <em>Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(IfcPositiveLengthMeasure value);

} // IfcRectangularPyramid
