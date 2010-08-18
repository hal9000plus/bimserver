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
 * A representation of the model object '<em><b>Ifc Asymmetric IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeWidth <em>Top Flange Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcAsymmetricIShapeProfileDef()
 * @model
 * @generated
 */
public interface IfcAsymmetricIShapeProfileDef extends IfcIShapeProfileDef {
	/**
	 * Returns the value of the '<em><b>Top Flange Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Width</em>' reference.
	 * @see #setTopFlangeWidth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcAsymmetricIShapeProfileDef_TopFlangeWidth()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getTopFlangeWidth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeWidth <em>Top Flange Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Width</em>' reference.
	 * @see #getTopFlangeWidth()
	 * @generated
	 */
	void setTopFlangeWidth(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Top Flange Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Thickness</em>' reference.
	 * @see #isSetTopFlangeThickness()
	 * @see #unsetTopFlangeThickness()
	 * @see #setTopFlangeThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcAsymmetricIShapeProfileDef_TopFlangeThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getTopFlangeThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Thickness</em>' reference.
	 * @see #isSetTopFlangeThickness()
	 * @see #unsetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @generated
	 */
	void setTopFlangeThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @see #setTopFlangeThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetTopFlangeThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Thickness</em>' reference is set.
	 * @see #unsetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @see #setTopFlangeThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetTopFlangeThickness();

	/**
	 * Returns the value of the '<em><b>Top Flange Fillet Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Fillet Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Fillet Radius</em>' reference.
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getTopFlangeFilletRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Fillet Radius</em>' reference.
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @generated
	 */
	void setTopFlangeFilletRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetTopFlangeFilletRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Fillet Radius</em>' reference is set.
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetTopFlangeFilletRadius();

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' reference is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

} // IfcAsymmetricIShapeProfileDef
