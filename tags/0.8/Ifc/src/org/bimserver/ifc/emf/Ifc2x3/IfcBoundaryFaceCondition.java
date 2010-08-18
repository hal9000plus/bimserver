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
 * A representation of the model object '<em><b>Ifc Boundary Face Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryFaceCondition()
 * @model
 * @generated
 */
public interface IfcBoundaryFaceCondition extends IfcBoundaryCondition {
	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Area X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Area X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Area X</em>' reference.
	 * @see #isSetLinearStiffnessByAreaX()
	 * @see #unsetLinearStiffnessByAreaX()
	 * @see #setLinearStiffnessByAreaX(IfcModulusOfSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryFaceCondition_LinearStiffnessByAreaX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Area X</em>' reference.
	 * @see #isSetLinearStiffnessByAreaX()
	 * @see #unsetLinearStiffnessByAreaX()
	 * @see #getLinearStiffnessByAreaX()
	 * @generated
	 */
	void setLinearStiffnessByAreaX(IfcModulusOfSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByAreaX()
	 * @see #getLinearStiffnessByAreaX()
	 * @see #setLinearStiffnessByAreaX(IfcModulusOfSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessByAreaX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Area X</em>' reference is set.
	 * @see #unsetLinearStiffnessByAreaX()
	 * @see #getLinearStiffnessByAreaX()
	 * @see #setLinearStiffnessByAreaX(IfcModulusOfSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessByAreaX();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Area Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Area Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Area Y</em>' reference.
	 * @see #isSetLinearStiffnessByAreaY()
	 * @see #unsetLinearStiffnessByAreaY()
	 * @see #setLinearStiffnessByAreaY(IfcModulusOfSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryFaceCondition_LinearStiffnessByAreaY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Area Y</em>' reference.
	 * @see #isSetLinearStiffnessByAreaY()
	 * @see #unsetLinearStiffnessByAreaY()
	 * @see #getLinearStiffnessByAreaY()
	 * @generated
	 */
	void setLinearStiffnessByAreaY(IfcModulusOfSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByAreaY()
	 * @see #getLinearStiffnessByAreaY()
	 * @see #setLinearStiffnessByAreaY(IfcModulusOfSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessByAreaY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Area Y</em>' reference is set.
	 * @see #unsetLinearStiffnessByAreaY()
	 * @see #getLinearStiffnessByAreaY()
	 * @see #setLinearStiffnessByAreaY(IfcModulusOfSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessByAreaY();

	/**
	 * Returns the value of the '<em><b>Linear Stiffness By Area Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Stiffness By Area Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Stiffness By Area Z</em>' reference.
	 * @see #isSetLinearStiffnessByAreaZ()
	 * @see #unsetLinearStiffnessByAreaZ()
	 * @see #setLinearStiffnessByAreaZ(IfcModulusOfSubgradeReactionMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Stiffness By Area Z</em>' reference.
	 * @see #isSetLinearStiffnessByAreaZ()
	 * @see #unsetLinearStiffnessByAreaZ()
	 * @see #getLinearStiffnessByAreaZ()
	 * @generated
	 */
	void setLinearStiffnessByAreaZ(IfcModulusOfSubgradeReactionMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearStiffnessByAreaZ()
	 * @see #getLinearStiffnessByAreaZ()
	 * @see #setLinearStiffnessByAreaZ(IfcModulusOfSubgradeReactionMeasure)
	 * @generated
	 */
	void unsetLinearStiffnessByAreaZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Stiffness By Area Z</em>' reference is set.
	 * @see #unsetLinearStiffnessByAreaZ()
	 * @see #getLinearStiffnessByAreaZ()
	 * @see #setLinearStiffnessByAreaZ(IfcModulusOfSubgradeReactionMeasure)
	 * @generated
	 */
	boolean isSetLinearStiffnessByAreaZ();

} // IfcBoundaryFaceCondition
