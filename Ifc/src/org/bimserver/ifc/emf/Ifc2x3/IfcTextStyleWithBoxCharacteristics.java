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
 * A representation of the model object '<em><b>Ifc Text Style With Box Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getCharacterSpacing <em>Character Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleWithBoxCharacteristics()
 * @model
 * @generated
 */
public interface IfcTextStyleWithBoxCharacteristics extends IfcTextStyleSelect {
	/**
	 * Returns the value of the '<em><b>Box Height</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Height</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Height</em>' reference.
	 * @see #isSetBoxHeight()
	 * @see #unsetBoxHeight()
	 * @see #setBoxHeight(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleWithBoxCharacteristics_BoxHeight()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getBoxHeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Height</em>' reference.
	 * @see #isSetBoxHeight()
	 * @see #unsetBoxHeight()
	 * @see #getBoxHeight()
	 * @generated
	 */
	void setBoxHeight(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxHeight()
	 * @see #getBoxHeight()
	 * @see #setBoxHeight(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetBoxHeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Height</em>' reference is set.
	 * @see #unsetBoxHeight()
	 * @see #getBoxHeight()
	 * @see #setBoxHeight(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetBoxHeight();

	/**
	 * Returns the value of the '<em><b>Box Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Width</em>' reference.
	 * @see #isSetBoxWidth()
	 * @see #unsetBoxWidth()
	 * @see #setBoxWidth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleWithBoxCharacteristics_BoxWidth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getBoxWidth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Width</em>' reference.
	 * @see #isSetBoxWidth()
	 * @see #unsetBoxWidth()
	 * @see #getBoxWidth()
	 * @generated
	 */
	void setBoxWidth(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxWidth()
	 * @see #getBoxWidth()
	 * @see #setBoxWidth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetBoxWidth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Width</em>' reference is set.
	 * @see #unsetBoxWidth()
	 * @see #getBoxWidth()
	 * @see #setBoxWidth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetBoxWidth();

	/**
	 * Returns the value of the '<em><b>Box Slant Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Slant Angle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Slant Angle</em>' reference.
	 * @see #isSetBoxSlantAngle()
	 * @see #unsetBoxSlantAngle()
	 * @see #setBoxSlantAngle(IfcPlaneAngleMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlaneAngleMeasure getBoxSlantAngle();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Slant Angle</em>' reference.
	 * @see #isSetBoxSlantAngle()
	 * @see #unsetBoxSlantAngle()
	 * @see #getBoxSlantAngle()
	 * @generated
	 */
	void setBoxSlantAngle(IfcPlaneAngleMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxSlantAngle()
	 * @see #getBoxSlantAngle()
	 * @see #setBoxSlantAngle(IfcPlaneAngleMeasure)
	 * @generated
	 */
	void unsetBoxSlantAngle();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Slant Angle</em>' reference is set.
	 * @see #unsetBoxSlantAngle()
	 * @see #getBoxSlantAngle()
	 * @see #setBoxSlantAngle(IfcPlaneAngleMeasure)
	 * @generated
	 */
	boolean isSetBoxSlantAngle();

	/**
	 * Returns the value of the '<em><b>Box Rotate Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Rotate Angle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Rotate Angle</em>' reference.
	 * @see #isSetBoxRotateAngle()
	 * @see #unsetBoxRotateAngle()
	 * @see #setBoxRotateAngle(IfcPlaneAngleMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlaneAngleMeasure getBoxRotateAngle();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Rotate Angle</em>' reference.
	 * @see #isSetBoxRotateAngle()
	 * @see #unsetBoxRotateAngle()
	 * @see #getBoxRotateAngle()
	 * @generated
	 */
	void setBoxRotateAngle(IfcPlaneAngleMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxRotateAngle()
	 * @see #getBoxRotateAngle()
	 * @see #setBoxRotateAngle(IfcPlaneAngleMeasure)
	 * @generated
	 */
	void unsetBoxRotateAngle();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Rotate Angle</em>' reference is set.
	 * @see #unsetBoxRotateAngle()
	 * @see #getBoxRotateAngle()
	 * @see #setBoxRotateAngle(IfcPlaneAngleMeasure)
	 * @generated
	 */
	boolean isSetBoxRotateAngle();

	/**
	 * Returns the value of the '<em><b>Character Spacing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Spacing</em>' reference.
	 * @see #isSetCharacterSpacing()
	 * @see #unsetCharacterSpacing()
	 * @see #setCharacterSpacing(IfcSizeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleWithBoxCharacteristics_CharacterSpacing()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSizeSelect getCharacterSpacing();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getCharacterSpacing <em>Character Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Spacing</em>' reference.
	 * @see #isSetCharacterSpacing()
	 * @see #unsetCharacterSpacing()
	 * @see #getCharacterSpacing()
	 * @generated
	 */
	void setCharacterSpacing(IfcSizeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getCharacterSpacing <em>Character Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCharacterSpacing()
	 * @see #getCharacterSpacing()
	 * @see #setCharacterSpacing(IfcSizeSelect)
	 * @generated
	 */
	void unsetCharacterSpacing();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleWithBoxCharacteristics#getCharacterSpacing <em>Character Spacing</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Character Spacing</em>' reference is set.
	 * @see #unsetCharacterSpacing()
	 * @see #getCharacterSpacing()
	 * @see #setCharacterSpacing(IfcSizeSelect)
	 * @generated
	 */
	boolean isSetCharacterSpacing();

} // IfcTextStyleWithBoxCharacteristics
