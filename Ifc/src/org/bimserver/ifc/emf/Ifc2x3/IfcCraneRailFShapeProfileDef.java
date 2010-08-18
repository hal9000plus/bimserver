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
 * A representation of the model object '<em><b>Ifc Crane Rail FShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getHeadWidth <em>Head Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getHeadDepth2 <em>Head Depth2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getHeadDepth3 <em>Head Depth3</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getBaseDepth1 <em>Base Depth1</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getBaseDepth2 <em>Base Depth2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef()
 * @model
 * @generated
 */
public interface IfcCraneRailFShapeProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>Overall Height</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Height</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Height</em>' reference.
	 * @see #setOverallHeight(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_OverallHeight()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getOverallHeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getOverallHeight <em>Overall Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Height</em>' reference.
	 * @see #getOverallHeight()
	 * @generated
	 */
	void setOverallHeight(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Head Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Width</em>' reference.
	 * @see #setHeadWidth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_HeadWidth()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getHeadWidth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getHeadWidth <em>Head Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Width</em>' reference.
	 * @see #getHeadWidth()
	 * @generated
	 */
	void setHeadWidth(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' reference.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_Radius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getRadius <em>Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' reference.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getRadius <em>Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getRadius <em>Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' reference is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetRadius();

	/**
	 * Returns the value of the '<em><b>Head Depth2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Depth2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Depth2</em>' reference.
	 * @see #setHeadDepth2(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_HeadDepth2()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getHeadDepth2();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getHeadDepth2 <em>Head Depth2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Depth2</em>' reference.
	 * @see #getHeadDepth2()
	 * @generated
	 */
	void setHeadDepth2(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Head Depth3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Depth3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Depth3</em>' reference.
	 * @see #setHeadDepth3(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_HeadDepth3()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getHeadDepth3();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getHeadDepth3 <em>Head Depth3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Depth3</em>' reference.
	 * @see #getHeadDepth3()
	 * @generated
	 */
	void setHeadDepth3(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Web Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Thickness</em>' reference.
	 * @see #setWebThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_WebThickness()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getWebThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getWebThickness <em>Web Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Thickness</em>' reference.
	 * @see #getWebThickness()
	 * @generated
	 */
	void setWebThickness(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Base Depth1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Depth1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Depth1</em>' reference.
	 * @see #setBaseDepth1(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_BaseDepth1()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getBaseDepth1();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getBaseDepth1 <em>Base Depth1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Depth1</em>' reference.
	 * @see #getBaseDepth1()
	 * @generated
	 */
	void setBaseDepth1(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Base Depth2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Depth2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Depth2</em>' reference.
	 * @see #setBaseDepth2(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_BaseDepth2()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getBaseDepth2();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getBaseDepth2 <em>Base Depth2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Depth2</em>' reference.
	 * @see #getBaseDepth2()
	 * @generated
	 */
	void setBaseDepth2(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In Y</em>' reference.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCraneRailFShapeProfileDef_CentreOfGravityInY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In Y</em>' reference.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @generated
	 */
	void setCentreOfGravityInY(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailFShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' reference is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

} // IfcCraneRailFShapeProfileDef
