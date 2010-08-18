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
import org.bimserver.ifc.emf.Ifc2x3.IfcPlanarForceMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Planar Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceX <em>Planar Force X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceY <em>Planar Force Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceZ <em>Planar Force Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadPlanarForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadPlanarForce {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadPlanarForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarForceMeasure getPlanarForceX() {
		return (IfcPlanarForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceX(IfcPlanarForceMeasure newPlanarForceX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX(), newPlanarForceX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarForceMeasure getPlanarForceY() {
		return (IfcPlanarForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceY(IfcPlanarForceMeasure newPlanarForceY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY(), newPlanarForceY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarForceMeasure getPlanarForceZ() {
		return (IfcPlanarForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceZ(IfcPlanarForceMeasure newPlanarForceZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ(), newPlanarForceZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadPlanarForce_PlanarForceZ());
	}

} //IfcStructuralLoadPlanarForceImpl
