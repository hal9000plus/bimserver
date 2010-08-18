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
import org.bimserver.ifc.emf.Ifc2x3.IfcLinearForceMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcLinearMomentMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Linear Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadLinearForceImpl#getLinearForceX <em>Linear Force X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadLinearForceImpl#getLinearForceY <em>Linear Force Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadLinearForceImpl#getLinearForceZ <em>Linear Force Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentX <em>Linear Moment X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentY <em>Linear Moment Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentZ <em>Linear Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadLinearForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadLinearForce {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadLinearForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearForceMeasure getLinearForceX() {
		return (IfcLinearForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceX(IfcLinearForceMeasure newLinearForceX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX(), newLinearForceX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearForceMeasure getLinearForceY() {
		return (IfcLinearForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceY(IfcLinearForceMeasure newLinearForceY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY(), newLinearForceY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearForceMeasure getLinearForceZ() {
		return (IfcLinearForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceZ(IfcLinearForceMeasure newLinearForceZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ(), newLinearForceZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearMomentMeasure getLinearMomentX() {
		return (IfcLinearMomentMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentX(IfcLinearMomentMeasure newLinearMomentX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX(), newLinearMomentX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearMomentMeasure getLinearMomentY() {
		return (IfcLinearMomentMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentY(IfcLinearMomentMeasure newLinearMomentY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY(), newLinearMomentY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearMomentMeasure getLinearMomentZ() {
		return (IfcLinearMomentMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentZ(IfcLinearMomentMeasure newLinearMomentZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ(), newLinearMomentZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadLinearForce_LinearMomentZ());
	}

} //IfcStructuralLoadLinearForceImpl
