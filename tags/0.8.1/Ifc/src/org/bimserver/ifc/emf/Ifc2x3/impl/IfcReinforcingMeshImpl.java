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
import org.bimserver.ifc.emf.Ifc2x3.IfcAreaMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcing Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcingMeshImpl#getMeshLength <em>Mesh Length</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcingMeshImpl#getMeshWidth <em>Mesh Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcingMeshImpl#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcingMeshImpl#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcingMeshImpl#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcingMeshImpl#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcingMeshImpl#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcingMeshImpl#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcingMeshImpl extends IfcReinforcingElementImpl implements IfcReinforcingMesh {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcingMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getMeshLength() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_MeshLength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshLength(IfcPositiveLengthMeasure newMeshLength) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_MeshLength(), newMeshLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeshLength() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_MeshLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeshLength() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_MeshLength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getMeshWidth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshWidth(IfcPositiveLengthMeasure newMeshWidth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth(), newMeshWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeshWidth() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeshWidth() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_MeshWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getLongitudinalBarNominalDiameter() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarNominalDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarNominalDiameter(IfcPositiveLengthMeasure newLongitudinalBarNominalDiameter) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarNominalDiameter(), newLongitudinalBarNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getTransverseBarNominalDiameter() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarNominalDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarNominalDiameter(IfcPositiveLengthMeasure newTransverseBarNominalDiameter) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarNominalDiameter(), newTransverseBarNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasure getLongitudinalBarCrossSectionArea() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarCrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarCrossSectionArea(IfcAreaMeasure newLongitudinalBarCrossSectionArea) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarCrossSectionArea(), newLongitudinalBarCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasure getTransverseBarCrossSectionArea() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarCrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarCrossSectionArea(IfcAreaMeasure newTransverseBarCrossSectionArea) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarCrossSectionArea(), newTransverseBarCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getLongitudinalBarSpacing() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalBarSpacing(IfcPositiveLengthMeasure newLongitudinalBarSpacing) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_LongitudinalBarSpacing(), newLongitudinalBarSpacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getTransverseBarSpacing() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransverseBarSpacing(IfcPositiveLengthMeasure newTransverseBarSpacing) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcingMesh_TransverseBarSpacing(), newTransverseBarSpacing);
	}

} //IfcReinforcingMeshImpl
