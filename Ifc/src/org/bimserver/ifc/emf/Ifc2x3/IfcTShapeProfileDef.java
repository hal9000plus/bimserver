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
 * A representation of the model object '<em><b>Ifc TShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeEdgeRadius <em>Flange Edge Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebEdgeRadius <em>Web Edge Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebSlope <em>Web Slope</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef()
 * @model
 * @generated
 */
public interface IfcTShapeProfileDef extends IfcParameterizedProfileDef {
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_Depth()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getDepth <em>Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' reference.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Flange Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Width</em>' reference.
	 * @see #setFlangeWidth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_FlangeWidth()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getFlangeWidth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeWidth <em>Flange Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Width</em>' reference.
	 * @see #getFlangeWidth()
	 * @generated
	 */
	void setFlangeWidth(IfcPositiveLengthMeasure value);

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_WebThickness()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getWebThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebThickness <em>Web Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Thickness</em>' reference.
	 * @see #getWebThickness()
	 * @generated
	 */
	void setWebThickness(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Flange Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Thickness</em>' reference.
	 * @see #setFlangeThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_FlangeThickness()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getFlangeThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Thickness</em>' reference.
	 * @see #getFlangeThickness()
	 * @generated
	 */
	void setFlangeThickness(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Fillet Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fillet Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fillet Radius</em>' reference.
	 * @see #isSetFilletRadius()
	 * @see #unsetFilletRadius()
	 * @see #setFilletRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_FilletRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getFilletRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fillet Radius</em>' reference.
	 * @see #isSetFilletRadius()
	 * @see #unsetFilletRadius()
	 * @see #getFilletRadius()
	 * @generated
	 */
	void setFilletRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetFilletRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fillet Radius</em>' reference is set.
	 * @see #unsetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetFilletRadius();

	/**
	 * Returns the value of the '<em><b>Flange Edge Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Edge Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Edge Radius</em>' reference.
	 * @see #isSetFlangeEdgeRadius()
	 * @see #unsetFlangeEdgeRadius()
	 * @see #setFlangeEdgeRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_FlangeEdgeRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getFlangeEdgeRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeEdgeRadius <em>Flange Edge Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Edge Radius</em>' reference.
	 * @see #isSetFlangeEdgeRadius()
	 * @see #unsetFlangeEdgeRadius()
	 * @see #getFlangeEdgeRadius()
	 * @generated
	 */
	void setFlangeEdgeRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeEdgeRadius <em>Flange Edge Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeEdgeRadius()
	 * @see #getFlangeEdgeRadius()
	 * @see #setFlangeEdgeRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetFlangeEdgeRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeEdgeRadius <em>Flange Edge Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flange Edge Radius</em>' reference is set.
	 * @see #unsetFlangeEdgeRadius()
	 * @see #getFlangeEdgeRadius()
	 * @see #setFlangeEdgeRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetFlangeEdgeRadius();

	/**
	 * Returns the value of the '<em><b>Web Edge Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Edge Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Edge Radius</em>' reference.
	 * @see #isSetWebEdgeRadius()
	 * @see #unsetWebEdgeRadius()
	 * @see #setWebEdgeRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_WebEdgeRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getWebEdgeRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebEdgeRadius <em>Web Edge Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Edge Radius</em>' reference.
	 * @see #isSetWebEdgeRadius()
	 * @see #unsetWebEdgeRadius()
	 * @see #getWebEdgeRadius()
	 * @generated
	 */
	void setWebEdgeRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebEdgeRadius <em>Web Edge Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWebEdgeRadius()
	 * @see #getWebEdgeRadius()
	 * @see #setWebEdgeRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetWebEdgeRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebEdgeRadius <em>Web Edge Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Web Edge Radius</em>' reference is set.
	 * @see #unsetWebEdgeRadius()
	 * @see #getWebEdgeRadius()
	 * @see #setWebEdgeRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetWebEdgeRadius();

	/**
	 * Returns the value of the '<em><b>Web Slope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Slope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Slope</em>' reference.
	 * @see #isSetWebSlope()
	 * @see #unsetWebSlope()
	 * @see #setWebSlope(IfcPlaneAngleMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_WebSlope()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlaneAngleMeasure getWebSlope();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebSlope <em>Web Slope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Slope</em>' reference.
	 * @see #isSetWebSlope()
	 * @see #unsetWebSlope()
	 * @see #getWebSlope()
	 * @generated
	 */
	void setWebSlope(IfcPlaneAngleMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebSlope <em>Web Slope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWebSlope()
	 * @see #getWebSlope()
	 * @see #setWebSlope(IfcPlaneAngleMeasure)
	 * @generated
	 */
	void unsetWebSlope();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getWebSlope <em>Web Slope</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Web Slope</em>' reference is set.
	 * @see #unsetWebSlope()
	 * @see #getWebSlope()
	 * @see #setWebSlope(IfcPlaneAngleMeasure)
	 * @generated
	 */
	boolean isSetWebSlope();

	/**
	 * Returns the value of the '<em><b>Flange Slope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flange Slope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flange Slope</em>' reference.
	 * @see #isSetFlangeSlope()
	 * @see #unsetFlangeSlope()
	 * @see #setFlangeSlope(IfcPlaneAngleMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_FlangeSlope()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlaneAngleMeasure getFlangeSlope();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flange Slope</em>' reference.
	 * @see #isSetFlangeSlope()
	 * @see #unsetFlangeSlope()
	 * @see #getFlangeSlope()
	 * @generated
	 */
	void setFlangeSlope(IfcPlaneAngleMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlangeSlope()
	 * @see #getFlangeSlope()
	 * @see #setFlangeSlope(IfcPlaneAngleMeasure)
	 * @generated
	 */
	void unsetFlangeSlope();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getFlangeSlope <em>Flange Slope</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flange Slope</em>' reference is set.
	 * @see #unsetFlangeSlope()
	 * @see #getFlangeSlope()
	 * @see #setFlangeSlope(IfcPlaneAngleMeasure)
	 * @generated
	 */
	boolean isSetFlangeSlope();

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTShapeProfileDef_CentreOfGravityInY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' reference is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

} // IfcTShapeProfileDef
