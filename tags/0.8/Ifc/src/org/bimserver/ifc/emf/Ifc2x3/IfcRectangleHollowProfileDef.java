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
 * A representation of the model object '<em><b>Ifc Rectangle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getInnerFilletRadius <em>Inner Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getOuterFilletRadius <em>Outer Fillet Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangleHollowProfileDef()
 * @model
 * @generated
 */
public interface IfcRectangleHollowProfileDef extends IfcRectangleProfileDef {
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangleHollowProfileDef_WallThickness()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getWallThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getWallThickness <em>Wall Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Thickness</em>' reference.
	 * @see #getWallThickness()
	 * @generated
	 */
	void setWallThickness(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Inner Fillet Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Fillet Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Fillet Radius</em>' reference.
	 * @see #isSetInnerFilletRadius()
	 * @see #unsetInnerFilletRadius()
	 * @see #setInnerFilletRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangleHollowProfileDef_InnerFilletRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getInnerFilletRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getInnerFilletRadius <em>Inner Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Fillet Radius</em>' reference.
	 * @see #isSetInnerFilletRadius()
	 * @see #unsetInnerFilletRadius()
	 * @see #getInnerFilletRadius()
	 * @generated
	 */
	void setInnerFilletRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getInnerFilletRadius <em>Inner Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInnerFilletRadius()
	 * @see #getInnerFilletRadius()
	 * @see #setInnerFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetInnerFilletRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getInnerFilletRadius <em>Inner Fillet Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inner Fillet Radius</em>' reference is set.
	 * @see #unsetInnerFilletRadius()
	 * @see #getInnerFilletRadius()
	 * @see #setInnerFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetInnerFilletRadius();

	/**
	 * Returns the value of the '<em><b>Outer Fillet Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Fillet Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Fillet Radius</em>' reference.
	 * @see #isSetOuterFilletRadius()
	 * @see #unsetOuterFilletRadius()
	 * @see #setOuterFilletRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangleHollowProfileDef_OuterFilletRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getOuterFilletRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getOuterFilletRadius <em>Outer Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Fillet Radius</em>' reference.
	 * @see #isSetOuterFilletRadius()
	 * @see #unsetOuterFilletRadius()
	 * @see #getOuterFilletRadius()
	 * @generated
	 */
	void setOuterFilletRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getOuterFilletRadius <em>Outer Fillet Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOuterFilletRadius()
	 * @see #getOuterFilletRadius()
	 * @see #setOuterFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetOuterFilletRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef#getOuterFilletRadius <em>Outer Fillet Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Outer Fillet Radius</em>' reference is set.
	 * @see #unsetOuterFilletRadius()
	 * @see #getOuterFilletRadius()
	 * @see #setOuterFilletRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetOuterFilletRadius();

} // IfcRectangleHollowProfileDef
