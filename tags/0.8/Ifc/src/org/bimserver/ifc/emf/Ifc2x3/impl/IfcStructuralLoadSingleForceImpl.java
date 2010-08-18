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
import org.bimserver.ifc.emf.Ifc2x3.IfcForceMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce;
import org.bimserver.ifc.emf.Ifc2x3.IfcTorqueMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleForceImpl#getForceX <em>Force X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleForceImpl#getForceY <em>Force Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleForceImpl#getForceZ <em>Force Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleForceImpl#getMomentX <em>Moment X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleForceImpl#getMomentY <em>Moment Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleForceImpl#getMomentZ <em>Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadSingleForce {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getForceX() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceX(IfcForceMeasure newForceX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX(), newForceX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getForceY() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceY(IfcForceMeasure newForceY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY(), newForceY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getForceZ() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceZ(IfcForceMeasure newForceZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ(), newForceZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_ForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTorqueMeasure getMomentX() {
		return (IfcTorqueMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentX(IfcTorqueMeasure newMomentX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX(), newMomentX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTorqueMeasure getMomentY() {
		return (IfcTorqueMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentY(IfcTorqueMeasure newMomentY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY(), newMomentY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTorqueMeasure getMomentZ() {
		return (IfcTorqueMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentZ(IfcTorqueMeasure newMomentZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ(), newMomentZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleForce_MomentZ());
	}

} //IfcStructuralLoadSingleForceImpl
