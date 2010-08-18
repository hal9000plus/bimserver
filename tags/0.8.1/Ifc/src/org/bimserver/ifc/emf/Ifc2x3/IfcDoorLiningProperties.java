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
 * A representation of the model object '<em><b>Ifc Door Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdDepth <em>Threshold Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdThickness <em>Threshold Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getTransomOffset <em>Transom Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningOffset <em>Lining Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdOffset <em>Threshold Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getCasingThickness <em>Casing Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getCasingDepth <em>Casing Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties()
 * @model
 * @generated
 */
public interface IfcDoorLiningProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Lining Depth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Depth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Depth</em>' reference.
	 * @see #isSetLiningDepth()
	 * @see #unsetLiningDepth()
	 * @see #setLiningDepth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_LiningDepth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getLiningDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningDepth <em>Lining Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Depth</em>' reference.
	 * @see #isSetLiningDepth()
	 * @see #unsetLiningDepth()
	 * @see #getLiningDepth()
	 * @generated
	 */
	void setLiningDepth(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningDepth <em>Lining Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetLiningDepth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningDepth <em>Lining Depth</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Depth</em>' reference is set.
	 * @see #unsetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetLiningDepth();

	/**
	 * Returns the value of the '<em><b>Lining Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Thickness</em>' reference.
	 * @see #isSetLiningThickness()
	 * @see #unsetLiningThickness()
	 * @see #setLiningThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_LiningThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getLiningThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningThickness <em>Lining Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Thickness</em>' reference.
	 * @see #isSetLiningThickness()
	 * @see #unsetLiningThickness()
	 * @see #getLiningThickness()
	 * @generated
	 */
	void setLiningThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningThickness <em>Lining Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningThickness()
	 * @see #getLiningThickness()
	 * @see #setLiningThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetLiningThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningThickness <em>Lining Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Thickness</em>' reference is set.
	 * @see #unsetLiningThickness()
	 * @see #getLiningThickness()
	 * @see #setLiningThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetLiningThickness();

	/**
	 * Returns the value of the '<em><b>Threshold Depth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Depth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Depth</em>' reference.
	 * @see #isSetThresholdDepth()
	 * @see #unsetThresholdDepth()
	 * @see #setThresholdDepth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_ThresholdDepth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getThresholdDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdDepth <em>Threshold Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Depth</em>' reference.
	 * @see #isSetThresholdDepth()
	 * @see #unsetThresholdDepth()
	 * @see #getThresholdDepth()
	 * @generated
	 */
	void setThresholdDepth(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdDepth <em>Threshold Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThresholdDepth()
	 * @see #getThresholdDepth()
	 * @see #setThresholdDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetThresholdDepth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdDepth <em>Threshold Depth</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threshold Depth</em>' reference is set.
	 * @see #unsetThresholdDepth()
	 * @see #getThresholdDepth()
	 * @see #setThresholdDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetThresholdDepth();

	/**
	 * Returns the value of the '<em><b>Threshold Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Thickness</em>' reference.
	 * @see #isSetThresholdThickness()
	 * @see #unsetThresholdThickness()
	 * @see #setThresholdThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_ThresholdThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getThresholdThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdThickness <em>Threshold Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Thickness</em>' reference.
	 * @see #isSetThresholdThickness()
	 * @see #unsetThresholdThickness()
	 * @see #getThresholdThickness()
	 * @generated
	 */
	void setThresholdThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdThickness <em>Threshold Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThresholdThickness()
	 * @see #getThresholdThickness()
	 * @see #setThresholdThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetThresholdThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdThickness <em>Threshold Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threshold Thickness</em>' reference is set.
	 * @see #unsetThresholdThickness()
	 * @see #getThresholdThickness()
	 * @see #setThresholdThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetThresholdThickness();

	/**
	 * Returns the value of the '<em><b>Transom Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transom Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transom Thickness</em>' reference.
	 * @see #isSetTransomThickness()
	 * @see #unsetTransomThickness()
	 * @see #setTransomThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_TransomThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getTransomThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getTransomThickness <em>Transom Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transom Thickness</em>' reference.
	 * @see #isSetTransomThickness()
	 * @see #unsetTransomThickness()
	 * @see #getTransomThickness()
	 * @generated
	 */
	void setTransomThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getTransomThickness <em>Transom Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransomThickness()
	 * @see #getTransomThickness()
	 * @see #setTransomThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetTransomThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getTransomThickness <em>Transom Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transom Thickness</em>' reference is set.
	 * @see #unsetTransomThickness()
	 * @see #getTransomThickness()
	 * @see #setTransomThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetTransomThickness();

	/**
	 * Returns the value of the '<em><b>Transom Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transom Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transom Offset</em>' reference.
	 * @see #isSetTransomOffset()
	 * @see #unsetTransomOffset()
	 * @see #setTransomOffset(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_TransomOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getTransomOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getTransomOffset <em>Transom Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transom Offset</em>' reference.
	 * @see #isSetTransomOffset()
	 * @see #unsetTransomOffset()
	 * @see #getTransomOffset()
	 * @generated
	 */
	void setTransomOffset(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getTransomOffset <em>Transom Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransomOffset()
	 * @see #getTransomOffset()
	 * @see #setTransomOffset(IfcLengthMeasure)
	 * @generated
	 */
	void unsetTransomOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getTransomOffset <em>Transom Offset</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transom Offset</em>' reference is set.
	 * @see #unsetTransomOffset()
	 * @see #getTransomOffset()
	 * @see #setTransomOffset(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetTransomOffset();

	/**
	 * Returns the value of the '<em><b>Lining Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Offset</em>' reference.
	 * @see #isSetLiningOffset()
	 * @see #unsetLiningOffset()
	 * @see #setLiningOffset(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_LiningOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getLiningOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningOffset <em>Lining Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Offset</em>' reference.
	 * @see #isSetLiningOffset()
	 * @see #unsetLiningOffset()
	 * @see #getLiningOffset()
	 * @generated
	 */
	void setLiningOffset(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningOffset <em>Lining Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningOffset()
	 * @see #getLiningOffset()
	 * @see #setLiningOffset(IfcLengthMeasure)
	 * @generated
	 */
	void unsetLiningOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getLiningOffset <em>Lining Offset</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Offset</em>' reference is set.
	 * @see #unsetLiningOffset()
	 * @see #getLiningOffset()
	 * @see #setLiningOffset(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetLiningOffset();

	/**
	 * Returns the value of the '<em><b>Threshold Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Offset</em>' reference.
	 * @see #isSetThresholdOffset()
	 * @see #unsetThresholdOffset()
	 * @see #setThresholdOffset(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_ThresholdOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getThresholdOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdOffset <em>Threshold Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Offset</em>' reference.
	 * @see #isSetThresholdOffset()
	 * @see #unsetThresholdOffset()
	 * @see #getThresholdOffset()
	 * @generated
	 */
	void setThresholdOffset(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdOffset <em>Threshold Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThresholdOffset()
	 * @see #getThresholdOffset()
	 * @see #setThresholdOffset(IfcLengthMeasure)
	 * @generated
	 */
	void unsetThresholdOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getThresholdOffset <em>Threshold Offset</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threshold Offset</em>' reference is set.
	 * @see #unsetThresholdOffset()
	 * @see #getThresholdOffset()
	 * @see #setThresholdOffset(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetThresholdOffset();

	/**
	 * Returns the value of the '<em><b>Casing Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Casing Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casing Thickness</em>' reference.
	 * @see #isSetCasingThickness()
	 * @see #unsetCasingThickness()
	 * @see #setCasingThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_CasingThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getCasingThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getCasingThickness <em>Casing Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casing Thickness</em>' reference.
	 * @see #isSetCasingThickness()
	 * @see #unsetCasingThickness()
	 * @see #getCasingThickness()
	 * @generated
	 */
	void setCasingThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getCasingThickness <em>Casing Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCasingThickness()
	 * @see #getCasingThickness()
	 * @see #setCasingThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetCasingThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getCasingThickness <em>Casing Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Casing Thickness</em>' reference is set.
	 * @see #unsetCasingThickness()
	 * @see #getCasingThickness()
	 * @see #setCasingThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetCasingThickness();

	/**
	 * Returns the value of the '<em><b>Casing Depth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Casing Depth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casing Depth</em>' reference.
	 * @see #isSetCasingDepth()
	 * @see #unsetCasingDepth()
	 * @see #setCasingDepth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_CasingDepth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getCasingDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getCasingDepth <em>Casing Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casing Depth</em>' reference.
	 * @see #isSetCasingDepth()
	 * @see #unsetCasingDepth()
	 * @see #getCasingDepth()
	 * @generated
	 */
	void setCasingDepth(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getCasingDepth <em>Casing Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCasingDepth()
	 * @see #getCasingDepth()
	 * @see #setCasingDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetCasingDepth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getCasingDepth <em>Casing Depth</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Casing Depth</em>' reference is set.
	 * @see #unsetCasingDepth()
	 * @see #getCasingDepth()
	 * @see #setCasingDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetCasingDepth();

	/**
	 * Returns the value of the '<em><b>Shape Aspect Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Aspect Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #isSetShapeAspectStyle()
	 * @see #unsetShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDoorLiningProperties_ShapeAspectStyle()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #isSetShapeAspectStyle()
	 * @see #unsetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(IfcShapeAspect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	void unsetShapeAspectStyle();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape Aspect Style</em>' reference is set.
	 * @see #unsetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	boolean isSetShapeAspectStyle();

} // IfcDoorLiningProperties
