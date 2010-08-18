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
 * A representation of the model object '<em><b>Ifc ZShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcZShapeProfileDef()
 * @model
 * @generated
 */
public interface IfcZShapeProfileDef extends IfcParameterizedProfileDef {
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcZShapeProfileDef_Depth()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getDepth <em>Depth</em>}' reference.
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcZShapeProfileDef_FlangeWidth()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getFlangeWidth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getFlangeWidth <em>Flange Width</em>}' reference.
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcZShapeProfileDef_WebThickness()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getWebThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getWebThickness <em>Web Thickness</em>}' reference.
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcZShapeProfileDef_FlangeThickness()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getFlangeThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getFlangeThickness <em>Flange Thickness</em>}' reference.
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcZShapeProfileDef_FilletRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getFilletRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFilletRadius()
	 * @see #getFilletRadius()
	 * @see #setFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetFilletRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getFilletRadius <em>Fillet Radius</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Edge Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Radius</em>' reference.
	 * @see #isSetEdgeRadius()
	 * @see #unsetEdgeRadius()
	 * @see #setEdgeRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcZShapeProfileDef_EdgeRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getEdgeRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Radius</em>' reference.
	 * @see #isSetEdgeRadius()
	 * @see #unsetEdgeRadius()
	 * @see #getEdgeRadius()
	 * @generated
	 */
	void setEdgeRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdgeRadius()
	 * @see #getEdgeRadius()
	 * @see #setEdgeRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetEdgeRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcZShapeProfileDef#getEdgeRadius <em>Edge Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edge Radius</em>' reference is set.
	 * @see #unsetEdgeRadius()
	 * @see #getEdgeRadius()
	 * @see #setEdgeRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetEdgeRadius();

} // IfcZShapeProfileDef
