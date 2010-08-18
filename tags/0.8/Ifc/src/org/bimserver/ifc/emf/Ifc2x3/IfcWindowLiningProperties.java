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
 * A representation of the model object '<em><b>Ifc Window Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties()
 * @model
 * @generated
 */
public interface IfcWindowLiningProperties extends IfcPropertySetDefinition {
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_LiningDepth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getLiningDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetLiningDepth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' reference is set.
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_LiningThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getLiningThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningThickness()
	 * @see #getLiningThickness()
	 * @see #setLiningThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetLiningThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' reference is set.
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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_TransomThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getTransomThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransomThickness()
	 * @see #getTransomThickness()
	 * @see #setTransomThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetTransomThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Mullion Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mullion Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mullion Thickness</em>' reference.
	 * @see #isSetMullionThickness()
	 * @see #unsetMullionThickness()
	 * @see #setMullionThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_MullionThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getMullionThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mullion Thickness</em>' reference.
	 * @see #isSetMullionThickness()
	 * @see #unsetMullionThickness()
	 * @see #getMullionThickness()
	 * @generated
	 */
	void setMullionThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMullionThickness()
	 * @see #getMullionThickness()
	 * @see #setMullionThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetMullionThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mullion Thickness</em>' reference is set.
	 * @see #unsetMullionThickness()
	 * @see #getMullionThickness()
	 * @see #setMullionThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetMullionThickness();

	/**
	 * Returns the value of the '<em><b>First Transom Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Transom Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Transom Offset</em>' reference.
	 * @see #isSetFirstTransomOffset()
	 * @see #unsetFirstTransomOffset()
	 * @see #setFirstTransomOffset(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_FirstTransomOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getFirstTransomOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Transom Offset</em>' reference.
	 * @see #isSetFirstTransomOffset()
	 * @see #unsetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @generated
	 */
	void setFirstTransomOffset(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @see #setFirstTransomOffset(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetFirstTransomOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Transom Offset</em>' reference is set.
	 * @see #unsetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @see #setFirstTransomOffset(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetFirstTransomOffset();

	/**
	 * Returns the value of the '<em><b>Second Transom Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Transom Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Transom Offset</em>' reference.
	 * @see #isSetSecondTransomOffset()
	 * @see #unsetSecondTransomOffset()
	 * @see #setSecondTransomOffset(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_SecondTransomOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getSecondTransomOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Transom Offset</em>' reference.
	 * @see #isSetSecondTransomOffset()
	 * @see #unsetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @generated
	 */
	void setSecondTransomOffset(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @see #setSecondTransomOffset(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetSecondTransomOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Transom Offset</em>' reference is set.
	 * @see #unsetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @see #setSecondTransomOffset(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetSecondTransomOffset();

	/**
	 * Returns the value of the '<em><b>First Mullion Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Mullion Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Mullion Offset</em>' reference.
	 * @see #isSetFirstMullionOffset()
	 * @see #unsetFirstMullionOffset()
	 * @see #setFirstMullionOffset(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_FirstMullionOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getFirstMullionOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Mullion Offset</em>' reference.
	 * @see #isSetFirstMullionOffset()
	 * @see #unsetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @generated
	 */
	void setFirstMullionOffset(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @see #setFirstMullionOffset(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetFirstMullionOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Mullion Offset</em>' reference is set.
	 * @see #unsetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @see #setFirstMullionOffset(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetFirstMullionOffset();

	/**
	 * Returns the value of the '<em><b>Second Mullion Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Mullion Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Mullion Offset</em>' reference.
	 * @see #isSetSecondMullionOffset()
	 * @see #unsetSecondMullionOffset()
	 * @see #setSecondMullionOffset(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_SecondMullionOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getSecondMullionOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Mullion Offset</em>' reference.
	 * @see #isSetSecondMullionOffset()
	 * @see #unsetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @generated
	 */
	void setSecondMullionOffset(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @see #setSecondMullionOffset(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetSecondMullionOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Mullion Offset</em>' reference is set.
	 * @see #unsetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @see #setSecondMullionOffset(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetSecondMullionOffset();

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_ShapeAspectStyle()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	void unsetShapeAspectStyle();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape Aspect Style</em>' reference is set.
	 * @see #unsetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	boolean isSetShapeAspectStyle();

} // IfcWindowLiningProperties
