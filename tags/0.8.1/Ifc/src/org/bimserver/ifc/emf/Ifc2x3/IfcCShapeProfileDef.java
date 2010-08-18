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
 * A representation of the model object '<em><b>Ifc CShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getWidth <em>Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getGirth <em>Girth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getInternalFilletRadius <em>Internal Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCShapeProfileDef()
 * @model
 * @generated
 */
public interface IfcCShapeProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' reference.
	 * @see #setDepth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCShapeProfileDef_Depth()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getDepth <em>Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' reference.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' reference.
	 * @see #setWidth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCShapeProfileDef_Width()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getWidth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getWidth <em>Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Wall Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall Thickness</em>' reference.
	 * @see #setWallThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCShapeProfileDef_WallThickness()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getWallThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getWallThickness <em>Wall Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Thickness</em>' reference.
	 * @see #getWallThickness()
	 * @generated
	 */
	void setWallThickness(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Girth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Girth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Girth</em>' reference.
	 * @see #setGirth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCShapeProfileDef_Girth()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getGirth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getGirth <em>Girth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Girth</em>' reference.
	 * @see #getGirth()
	 * @generated
	 */
	void setGirth(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Internal Fillet Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Fillet Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Fillet Radius</em>' reference.
	 * @see #isSetInternalFilletRadius()
	 * @see #unsetInternalFilletRadius()
	 * @see #setInternalFilletRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCShapeProfileDef_InternalFilletRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getInternalFilletRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getInternalFilletRadius <em>Internal Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Fillet Radius</em>' reference.
	 * @see #isSetInternalFilletRadius()
	 * @see #unsetInternalFilletRadius()
	 * @see #getInternalFilletRadius()
	 * @generated
	 */
	void setInternalFilletRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getInternalFilletRadius <em>Internal Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInternalFilletRadius()
	 * @see #getInternalFilletRadius()
	 * @see #setInternalFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetInternalFilletRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getInternalFilletRadius <em>Internal Fillet Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Internal Fillet Radius</em>' reference is set.
	 * @see #unsetInternalFilletRadius()
	 * @see #getInternalFilletRadius()
	 * @see #setInternalFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetInternalFilletRadius();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In X</em>' reference.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCShapeProfileDef_CentreOfGravityInX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getCentreOfGravityInX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In X</em>' reference.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @generated
	 */
	void setCentreOfGravityInX(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetCentreOfGravityInX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In X</em>' reference is set.
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetCentreOfGravityInX();

} // IfcCShapeProfileDef
