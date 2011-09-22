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
import org.bimserver.ifc.emf.Ifc2x3.IfcBoundaryFaceCondition;
import org.bimserver.ifc.emf.Ifc2x3.IfcModulusOfSubgradeReactionMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Face Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryFaceConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryFaceCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryFaceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaX() {
		return (IfcModulusOfSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaX(IfcModulusOfSubgradeReactionMeasure newLinearStiffnessByAreaX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX(), newLinearStiffnessByAreaX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaY() {
		return (IfcModulusOfSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaY(IfcModulusOfSubgradeReactionMeasure newLinearStiffnessByAreaY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY(), newLinearStiffnessByAreaY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfSubgradeReactionMeasure getLinearStiffnessByAreaZ() {
		return (IfcModulusOfSubgradeReactionMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaZ(IfcModulusOfSubgradeReactionMeasure newLinearStiffnessByAreaZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ(), newLinearStiffnessByAreaZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryFaceCondition_LinearStiffnessByAreaZ());
	}

} //IfcBoundaryFaceConditionImpl