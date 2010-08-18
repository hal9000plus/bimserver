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
 * A representation of the model object '<em><b>Ifc Permeable Covering Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getFrameDepth <em>Frame Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getFrameThickness <em>Frame Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPermeableCoveringProperties()
 * @model
 * @generated
 */
public interface IfcPermeableCoveringProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringOperationEnum
	 * @see #setOperationType(IfcPermeableCoveringOperationEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPermeableCoveringProperties_OperationType()
	 * @model
	 * @generated
	 */
	IfcPermeableCoveringOperationEnum getOperationType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringOperationEnum
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcPermeableCoveringOperationEnum value);

	/**
	 * Returns the value of the '<em><b>Panel Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcWindowPanelPositionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Position</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcWindowPanelPositionEnum
	 * @see #setPanelPosition(IfcWindowPanelPositionEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPermeableCoveringProperties_PanelPosition()
	 * @model
	 * @generated
	 */
	IfcWindowPanelPositionEnum getPanelPosition();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getPanelPosition <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Position</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcWindowPanelPositionEnum
	 * @see #getPanelPosition()
	 * @generated
	 */
	void setPanelPosition(IfcWindowPanelPositionEnum value);

	/**
	 * Returns the value of the '<em><b>Frame Depth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Depth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Depth</em>' reference.
	 * @see #isSetFrameDepth()
	 * @see #unsetFrameDepth()
	 * @see #setFrameDepth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPermeableCoveringProperties_FrameDepth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getFrameDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getFrameDepth <em>Frame Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Depth</em>' reference.
	 * @see #isSetFrameDepth()
	 * @see #unsetFrameDepth()
	 * @see #getFrameDepth()
	 * @generated
	 */
	void setFrameDepth(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getFrameDepth <em>Frame Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameDepth()
	 * @see #getFrameDepth()
	 * @see #setFrameDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetFrameDepth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getFrameDepth <em>Frame Depth</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Depth</em>' reference is set.
	 * @see #unsetFrameDepth()
	 * @see #getFrameDepth()
	 * @see #setFrameDepth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetFrameDepth();

	/**
	 * Returns the value of the '<em><b>Frame Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Thickness</em>' reference.
	 * @see #isSetFrameThickness()
	 * @see #unsetFrameThickness()
	 * @see #setFrameThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPermeableCoveringProperties_FrameThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getFrameThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getFrameThickness <em>Frame Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Thickness</em>' reference.
	 * @see #isSetFrameThickness()
	 * @see #unsetFrameThickness()
	 * @see #getFrameThickness()
	 * @generated
	 */
	void setFrameThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getFrameThickness <em>Frame Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameThickness()
	 * @see #getFrameThickness()
	 * @see #setFrameThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetFrameThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getFrameThickness <em>Frame Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Thickness</em>' reference is set.
	 * @see #unsetFrameThickness()
	 * @see #getFrameThickness()
	 * @see #setFrameThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetFrameThickness();

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPermeableCoveringProperties_ShapeAspectStyle()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	void unsetShapeAspectStyle();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPermeableCoveringProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape Aspect Style</em>' reference is set.
	 * @see #unsetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	boolean isSetShapeAspectStyle();

} // IfcPermeableCoveringProperties
