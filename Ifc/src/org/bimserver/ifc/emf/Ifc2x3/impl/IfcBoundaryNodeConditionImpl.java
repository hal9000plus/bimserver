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
import org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryNodeCondition;
import org.bimserver.ifc.emf.Ifc2x3.IfcLinearStiffnessMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcRotationalStiffnessMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Node Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessX <em>Linear Stiffness X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessY <em>Linear Stiffness Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessZ <em>Linear Stiffness Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessX <em>Rotational Stiffness X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryNodeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryNodeCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryNodeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearStiffnessMeasure getLinearStiffnessX() {
		return (IfcLinearStiffnessMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessX(IfcLinearStiffnessMeasure newLinearStiffnessX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX(), newLinearStiffnessX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearStiffnessMeasure getLinearStiffnessY() {
		return (IfcLinearStiffnessMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessY(IfcLinearStiffnessMeasure newLinearStiffnessY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY(), newLinearStiffnessY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearStiffnessMeasure getLinearStiffnessZ() {
		return (IfcLinearStiffnessMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessZ(IfcLinearStiffnessMeasure newLinearStiffnessZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ(), newLinearStiffnessZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_LinearStiffnessZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalStiffnessMeasure getRotationalStiffnessX() {
		return (IfcRotationalStiffnessMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessX(IfcRotationalStiffnessMeasure newRotationalStiffnessX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX(), newRotationalStiffnessX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalStiffnessMeasure getRotationalStiffnessY() {
		return (IfcRotationalStiffnessMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessY(IfcRotationalStiffnessMeasure newRotationalStiffnessY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY(), newRotationalStiffnessY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalStiffnessMeasure getRotationalStiffnessZ() {
		return (IfcRotationalStiffnessMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessZ(IfcRotationalStiffnessMeasure newRotationalStiffnessZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ(), newRotationalStiffnessZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeCondition_RotationalStiffnessZ());
	}

} //IfcBoundaryNodeConditionImpl
