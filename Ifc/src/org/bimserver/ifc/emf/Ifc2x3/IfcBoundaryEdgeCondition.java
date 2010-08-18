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
 * A representation of the model object '<em><b>Ifc Boundary Edge Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryEdgeCondition()
 * @model
 * @generated
 */
public interface IfcBoundaryEdgeCondition extends IfcBoundaryCondition {
	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Length X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Length X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Length X</em>' reference.
	 * @see #isSetLinearStiffnessByLengthX()
	 * @see #unsetLinearStiffnessByLengthX()
	 * @see #setLinearStiffnessByLengthX(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Length X</em>' reference.
	 * @see #isSetLinearStiffnessByLengthX()
	 * @see #unsetLinearStiffnessByLengthX()
	 * @see #getLinearStiffnessByLengthX()
	 * @generated
	 */
	void setLinearStiffnessByLengthX(IfcModulusOfLinearSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByLengthX()
	 * @see #getLinearStiffnessByLengthX()
	 * @see #setLinearStiffnessByLengthX(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessByLengthX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Length X</em>' reference is set.
	 * @see #unsetLinearStiffnessByLengthX()
	 * @see #getLinearStiffnessByLengthX()
	 * @see #setLinearStiffnessByLengthX(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessByLengthX();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Length Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Length Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Length Y</em>' reference.
	 * @see #isSetLinearStiffnessByLengthY()
	 * @see #unsetLinearStiffnessByLengthY()
	 * @see #setLinearStiffnessByLengthY(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Length Y</em>' reference.
	 * @see #isSetLinearStiffnessByLengthY()
	 * @see #unsetLinearStiffnessByLengthY()
	 * @see #getLinearStiffnessByLengthY()
	 * @generated
	 */
	void setLinearStiffnessByLengthY(IfcModulusOfLinearSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByLengthY()
	 * @see #getLinearStiffnessByLengthY()
	 * @see #setLinearStiffnessByLengthY(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessByLengthY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Length Y</em>' reference is set.
	 * @see #unsetLinearStiffnessByLengthY()
	 * @see #getLinearStiffnessByLengthY()
	 * @see #setLinearStiffnessByLengthY(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessByLengthY();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Length Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Length Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Length Z</em>' reference.
	 * @see #isSetLinearStiffnessByLengthZ()
	 * @see #unsetLinearStiffnessByLengthZ()
	 * @see #setLinearStiffnessByLengthZ(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Length Z</em>' reference.
	 * @see #isSetLinearStiffnessByLengthZ()
	 * @see #unsetLinearStiffnessByLengthZ()
	 * @see #getLinearStiffnessByLengthZ()
	 * @generated
	 */
	void setLinearStiffnessByLengthZ(IfcModulusOfLinearSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByLengthZ()
	 * @see #getLinearStiffnessByLengthZ()
	 * @see #setLinearStiffnessByLengthZ(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessByLengthZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Length Z</em>' reference is set.
	 * @see #unsetLinearStiffnessByLengthZ()
	 * @see #getLinearStiffnessByLengthZ()
	 * @see #setLinearStiffnessByLengthZ(IfcModulusOfLinearSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessByLengthZ();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness By Length X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness By Length X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness By Length X</em>' reference.
	 * @see #isSetRotationalStiffnessByLengthX()
	 * @see #unsetRotationalStiffnessByLengthX()
	 * @see #setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness By Length X</em>' reference.
	 * @see #isSetRotationalStiffnessByLengthX()
	 * @see #unsetRotationalStiffnessByLengthX()
	 * @see #getRotationalStiffnessByLengthX()
	 * @generated
	 */
	void setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessByLengthX()
	 * @see #getRotationalStiffnessByLengthX()
	 * @see #setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetRotationalStiffnessByLengthX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness By Length X</em>' reference is set.
	 * @see #unsetRotationalStiffnessByLengthX()
	 * @see #getRotationalStiffnessByLengthX()
	 * @see #setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetRotationalStiffnessByLengthX();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness By Length Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness By Length Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness By Length Y</em>' reference.
	 * @see #isSetRotationalStiffnessByLengthY()
	 * @see #unsetRotationalStiffnessByLengthY()
	 * @see #setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness By Length Y</em>' reference.
	 * @see #isSetRotationalStiffnessByLengthY()
	 * @see #unsetRotationalStiffnessByLengthY()
	 * @see #getRotationalStiffnessByLengthY()
	 * @generated
	 */
	void setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessByLengthY()
	 * @see #getRotationalStiffnessByLengthY()
	 * @see #setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetRotationalStiffnessByLengthY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness By Length Y</em>' reference is set.
	 * @see #unsetRotationalStiffnessByLengthY()
	 * @see #getRotationalStiffnessByLengthY()
	 * @see #setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetRotationalStiffnessByLengthY();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness By Length Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness By Length Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness By Length Z</em>' reference.
	 * @see #isSetRotationalStiffnessByLengthZ()
	 * @see #unsetRotationalStiffnessByLengthZ()
	 * @see #setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness By Length Z</em>' reference.
	 * @see #isSetRotationalStiffnessByLengthZ()
	 * @see #unsetRotationalStiffnessByLengthZ()
	 * @see #getRotationalStiffnessByLengthZ()
	 * @generated
	 */
	void setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessByLengthZ()
	 * @see #getRotationalStiffnessByLengthZ()
	 * @see #setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetRotationalStiffnessByLengthZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness By Length Z</em>' reference is set.
	 * @see #unsetRotationalStiffnessByLengthZ()
	 * @see #getRotationalStiffnessByLengthZ()
	 * @see #setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetRotationalStiffnessByLengthZ();

} // IfcBoundaryEdgeCondition
