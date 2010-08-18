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
package org.bimserver.ifc.emf.Ifc2x3.impl;

import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryEdgeCondition;
import org.bimserver.ifc.emf.Ifc2x3.IfcModulusOfLinearSubgradeReactionMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcModulusOfRotationalSubgradeReactionMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Edge Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryEdgeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryEdgeCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryEdgeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthX() {
		return (IfcModulusOfLinearSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthX(IfcModulusOfLinearSubgradeReactionMeasure newLinearStiffnessByLengthX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX(), newLinearStiffnessByLengthX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthY() {
		return (IfcModulusOfLinearSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthY(IfcModulusOfLinearSubgradeReactionMeasure newLinearStiffnessByLengthY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY(), newLinearStiffnessByLengthY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfLinearSubgradeReactionMeasure getLinearStiffnessByLengthZ() {
		return (IfcModulusOfLinearSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthZ(IfcModulusOfLinearSubgradeReactionMeasure newLinearStiffnessByLengthZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ(), newLinearStiffnessByLengthZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_LinearStiffnessByLengthZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthX() {
		return (IfcModulusOfRotationalSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionMeasure newRotationalStiffnessByLengthX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX(), newRotationalStiffnessByLengthX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthY() {
		return (IfcModulusOfRotationalSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionMeasure newRotationalStiffnessByLengthY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY(), newRotationalStiffnessByLengthY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfRotationalSubgradeReactionMeasure getRotationalStiffnessByLengthZ() {
		return (IfcModulusOfRotationalSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionMeasure newRotationalStiffnessByLengthZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ(), newRotationalStiffnessByLengthZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryEdgeCondition_RotationalStiffnessByLengthZ());
	}

} //IfcBoundaryEdgeConditionImpl
