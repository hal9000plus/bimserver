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
 * A representation of the model object '<em><b>Ifc Boundary Node Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessX <em>Linear Stiffness X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessY <em>Linear Stiffness Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessZ <em>Linear Stiffness Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessX <em>Rotational Stiffness X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryNodeCondition()
 * @model
 * @generated
 */
public interface IfcBoundaryNodeCondition extends IfcBoundaryCondition {
	/**
	 * Returns the value of the '<em><b>Linear Stiffness X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness X</em>' reference.
	 * @see #isSetLinearStiffnessX()
	 * @see #unsetLinearStiffnessX()
	 * @see #setLinearStiffnessX(IfcLinearStiffnessMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryNodeCondition_LinearStiffnessX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearStiffnessMeasure getLinearStiffnessX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessX <em>Linear Stiffness X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness X</em>' reference.
	 * @see #isSetLinearStiffnessX()
	 * @see #unsetLinearStiffnessX()
	 * @see #getLinearStiffnessX()
	 * @generated
	 */
	void setLinearStiffnessX(IfcLinearStiffnessMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessX <em>Linear Stiffness X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessX()
	 * @see #getLinearStiffnessX()
	 * @see #setLinearStiffnessX(IfcLinearStiffnessMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessX <em>Linear Stiffness X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness X</em>' reference is set.
	 * @see #unsetLinearStiffnessX()
	 * @see #getLinearStiffnessX()
	 * @see #setLinearStiffnessX(IfcLinearStiffnessMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessX();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness Y</em>' reference.
	 * @see #isSetLinearStiffnessY()
	 * @see #unsetLinearStiffnessY()
	 * @see #setLinearStiffnessY(IfcLinearStiffnessMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryNodeCondition_LinearStiffnessY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearStiffnessMeasure getLinearStiffnessY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessY <em>Linear Stiffness Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness Y</em>' reference.
	 * @see #isSetLinearStiffnessY()
	 * @see #unsetLinearStiffnessY()
	 * @see #getLinearStiffnessY()
	 * @generated
	 */
	void setLinearStiffnessY(IfcLinearStiffnessMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessY <em>Linear Stiffness Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessY()
	 * @see #getLinearStiffnessY()
	 * @see #setLinearStiffnessY(IfcLinearStiffnessMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessY <em>Linear Stiffness Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness Y</em>' reference is set.
	 * @see #unsetLinearStiffnessY()
	 * @see #getLinearStiffnessY()
	 * @see #setLinearStiffnessY(IfcLinearStiffnessMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessY();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness Z</em>' reference.
	 * @see #isSetLinearStiffnessZ()
	 * @see #unsetLinearStiffnessZ()
	 * @see #setLinearStiffnessZ(IfcLinearStiffnessMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryNodeCondition_LinearStiffnessZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearStiffnessMeasure getLinearStiffnessZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessZ <em>Linear Stiffness Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness Z</em>' reference.
	 * @see #isSetLinearStiffnessZ()
	 * @see #unsetLinearStiffnessZ()
	 * @see #getLinearStiffnessZ()
	 * @generated
	 */
	void setLinearStiffnessZ(IfcLinearStiffnessMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessZ <em>Linear Stiffness Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessZ()
	 * @see #getLinearStiffnessZ()
	 * @see #setLinearStiffnessZ(IfcLinearStiffnessMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getLinearStiffnessZ <em>Linear Stiffness Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness Z</em>' reference is set.
	 * @see #unsetLinearStiffnessZ()
	 * @see #getLinearStiffnessZ()
	 * @see #setLinearStiffnessZ(IfcLinearStiffnessMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessZ();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness X</em>' reference.
	 * @see #isSetRotationalStiffnessX()
	 * @see #unsetRotationalStiffnessX()
	 * @see #setRotationalStiffnessX(IfcRotationalStiffnessMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryNodeCondition_RotationalStiffnessX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcRotationalStiffnessMeasure getRotationalStiffnessX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessX <em>Rotational Stiffness X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness X</em>' reference.
	 * @see #isSetRotationalStiffnessX()
	 * @see #unsetRotationalStiffnessX()
	 * @see #getRotationalStiffnessX()
	 * @generated
	 */
	void setRotationalStiffnessX(IfcRotationalStiffnessMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessX <em>Rotational Stiffness X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessX()
	 * @see #getRotationalStiffnessX()
	 * @see #setRotationalStiffnessX(IfcRotationalStiffnessMeasure)
	 * @generated
	 */
	void unsetRotationalStiffnessX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessX <em>Rotational Stiffness X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness X</em>' reference is set.
	 * @see #unsetRotationalStiffnessX()
	 * @see #getRotationalStiffnessX()
	 * @see #setRotationalStiffnessX(IfcRotationalStiffnessMeasure)
	 * @generated
	 */
	boolean isSetRotationalStiffnessX();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness Y</em>' reference.
	 * @see #isSetRotationalStiffnessY()
	 * @see #unsetRotationalStiffnessY()
	 * @see #setRotationalStiffnessY(IfcRotationalStiffnessMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryNodeCondition_RotationalStiffnessY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcRotationalStiffnessMeasure getRotationalStiffnessY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness Y</em>' reference.
	 * @see #isSetRotationalStiffnessY()
	 * @see #unsetRotationalStiffnessY()
	 * @see #getRotationalStiffnessY()
	 * @generated
	 */
	void setRotationalStiffnessY(IfcRotationalStiffnessMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessY()
	 * @see #getRotationalStiffnessY()
	 * @see #setRotationalStiffnessY(IfcRotationalStiffnessMeasure)
	 * @generated
	 */
	void unsetRotationalStiffnessY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness Y</em>' reference is set.
	 * @see #unsetRotationalStiffnessY()
	 * @see #getRotationalStiffnessY()
	 * @see #setRotationalStiffnessY(IfcRotationalStiffnessMeasure)
	 * @generated
	 */
	boolean isSetRotationalStiffnessY();

	/**
	 * Returns the value of the '<em><b>Rotational Stiffness Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Stiffness Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Stiffness Z</em>' reference.
	 * @see #isSetRotationalStiffnessZ()
	 * @see #unsetRotationalStiffnessZ()
	 * @see #setRotationalStiffnessZ(IfcRotationalStiffnessMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryNodeCondition_RotationalStiffnessZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcRotationalStiffnessMeasure getRotationalStiffnessZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Stiffness Z</em>' reference.
	 * @see #isSetRotationalStiffnessZ()
	 * @see #unsetRotationalStiffnessZ()
	 * @see #getRotationalStiffnessZ()
	 * @generated
	 */
	void setRotationalStiffnessZ(IfcRotationalStiffnessMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalStiffnessZ()
	 * @see #getRotationalStiffnessZ()
	 * @see #setRotationalStiffnessZ(IfcRotationalStiffnessMeasure)
	 * @generated
	 */
	void unsetRotationalStiffnessZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Stiffness Z</em>' reference is set.
	 * @see #unsetRotationalStiffnessZ()
	 * @see #getRotationalStiffnessZ()
	 * @see #setRotationalStiffnessZ(IfcRotationalStiffnessMeasure)
	 * @generated
	 */
	boolean isSetRotationalStiffnessZ();

} // IfcBoundaryNodeCondition
