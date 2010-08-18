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
 * A representation of the model object '<em><b>Ifc Rib Plate Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibHeight <em>Rib Height</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibWidth <em>Rib Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibSpacing <em>Rib Spacing</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRibPlateProfileProperties()
 * @model
 * @generated
 */
public interface IfcRibPlateProfileProperties extends IfcProfileProperties {
	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' reference.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #setThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRibPlateProfileProperties_Thickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getThickness <em>Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' reference.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getThickness <em>Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThickness()
	 * @see #getThickness()
	 * @see #setThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getThickness <em>Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness</em>' reference is set.
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @see #setThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetThickness();

	/**
	 * Returns the value of the '<em><b>Rib Height</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rib Height</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Height</em>' reference.
	 * @see #isSetRibHeight()
	 * @see #unsetRibHeight()
	 * @see #setRibHeight(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRibPlateProfileProperties_RibHeight()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getRibHeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibHeight <em>Rib Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Height</em>' reference.
	 * @see #isSetRibHeight()
	 * @see #unsetRibHeight()
	 * @see #getRibHeight()
	 * @generated
	 */
	void setRibHeight(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibHeight <em>Rib Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRibHeight()
	 * @see #getRibHeight()
	 * @see #setRibHeight(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetRibHeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibHeight <em>Rib Height</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rib Height</em>' reference is set.
	 * @see #unsetRibHeight()
	 * @see #getRibHeight()
	 * @see #setRibHeight(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetRibHeight();

	/**
	 * Returns the value of the '<em><b>Rib Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rib Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Width</em>' reference.
	 * @see #isSetRibWidth()
	 * @see #unsetRibWidth()
	 * @see #setRibWidth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRibPlateProfileProperties_RibWidth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getRibWidth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibWidth <em>Rib Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Width</em>' reference.
	 * @see #isSetRibWidth()
	 * @see #unsetRibWidth()
	 * @see #getRibWidth()
	 * @generated
	 */
	void setRibWidth(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibWidth <em>Rib Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRibWidth()
	 * @see #getRibWidth()
	 * @see #setRibWidth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetRibWidth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibWidth <em>Rib Width</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rib Width</em>' reference is set.
	 * @see #unsetRibWidth()
	 * @see #getRibWidth()
	 * @see #setRibWidth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetRibWidth();

	/**
	 * Returns the value of the '<em><b>Rib Spacing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rib Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Spacing</em>' reference.
	 * @see #isSetRibSpacing()
	 * @see #unsetRibSpacing()
	 * @see #setRibSpacing(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRibPlateProfileProperties_RibSpacing()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getRibSpacing();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibSpacing <em>Rib Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Spacing</em>' reference.
	 * @see #isSetRibSpacing()
	 * @see #unsetRibSpacing()
	 * @see #getRibSpacing()
	 * @generated
	 */
	void setRibSpacing(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibSpacing <em>Rib Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRibSpacing()
	 * @see #getRibSpacing()
	 * @see #setRibSpacing(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetRibSpacing();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getRibSpacing <em>Rib Spacing</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rib Spacing</em>' reference is set.
	 * @see #unsetRibSpacing()
	 * @see #getRibSpacing()
	 * @see #setRibSpacing(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetRibSpacing();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateDirectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateDirectionEnum
	 * @see #setDirection(IfcRibPlateDirectionEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRibPlateProfileProperties_Direction()
	 * @model
	 * @generated
	 */
	IfcRibPlateDirectionEnum getDirection();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateDirectionEnum
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(IfcRibPlateDirectionEnum value);

} // IfcRibPlateProfileProperties
