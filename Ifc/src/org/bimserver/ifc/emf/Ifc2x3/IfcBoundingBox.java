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
 * A representation of the model object '<em><b>Ifc Bounding Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getCorner <em>Corner</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getXDim <em>XDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getYDim <em>YDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getZDim <em>ZDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundingBox()
 * @model
 * @generated
 */
public interface IfcBoundingBox extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner</em>' reference.
	 * @see #setCorner(IfcCartesianPoint)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundingBox_Corner()
	 * @model
	 * @generated
	 */
	IfcCartesianPoint getCorner();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getCorner <em>Corner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner</em>' reference.
	 * @see #getCorner()
	 * @generated
	 */
	void setCorner(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>XDim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDim</em>' reference.
	 * @see #setXDim(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundingBox_XDim()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getXDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getXDim <em>XDim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDim</em>' reference.
	 * @see #getXDim()
	 * @generated
	 */
	void setXDim(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>YDim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDim</em>' reference.
	 * @see #setYDim(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundingBox_YDim()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getYDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getYDim <em>YDim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDim</em>' reference.
	 * @see #getYDim()
	 * @generated
	 */
	void setYDim(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>ZDim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZDim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZDim</em>' reference.
	 * @see #setZDim(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundingBox_ZDim()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getZDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getZDim <em>ZDim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZDim</em>' reference.
	 * @see #getZDim()
	 * @generated
	 */
	void setZDim(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' reference.
	 * @see #setDim(IfcDimensionCount)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundingBox_Dim()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' 3;'"
	 * @generated
	 */
	IfcDimensionCount getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundingBox#getDim <em>Dim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' reference.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(IfcDimensionCount value);

} // IfcBoundingBox
