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
import org.bimserver.ifc.emf.Ifc2x3.IfcLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcMomentOfInertiaMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcSectionModulusMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcWarpingConstantMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getTorsionalConstantX <em>Torsional Constant X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getWarpingConstant <em>Warping Constant</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getShearCentreZ <em>Shear Centre Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getShearCentreY <em>Shear Centre Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralProfilePropertiesImpl extends IfcGeneralProfilePropertiesImpl implements IfcStructuralProfileProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMomentOfInertiaMeasure getTorsionalConstantX() {
		return (IfcMomentOfInertiaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalConstantX(IfcMomentOfInertiaMeasure newTorsionalConstantX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX(), newTorsionalConstantX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTorsionalConstantX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTorsionalConstantX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalConstantX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMomentOfInertiaMeasure getMomentOfInertiaYZ() {
		return (IfcMomentOfInertiaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaYZ(IfcMomentOfInertiaMeasure newMomentOfInertiaYZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ(), newMomentOfInertiaYZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaYZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaYZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaYZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMomentOfInertiaMeasure getMomentOfInertiaY() {
		return (IfcMomentOfInertiaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaY(IfcMomentOfInertiaMeasure newMomentOfInertiaY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY(), newMomentOfInertiaY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMomentOfInertiaMeasure getMomentOfInertiaZ() {
		return (IfcMomentOfInertiaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaZ(IfcMomentOfInertiaMeasure newMomentOfInertiaZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ(), newMomentOfInertiaZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MomentOfInertiaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWarpingConstantMeasure getWarpingConstant() {
		return (IfcWarpingConstantMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingConstant(IfcWarpingConstantMeasure newWarpingConstant) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant(), newWarpingConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingConstant() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingConstant() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_WarpingConstant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getShearCentreZ() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreZ(IfcLengthMeasure newShearCentreZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ(), newShearCentreZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearCentreZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearCentreZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getShearCentreY() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreY(IfcLengthMeasure newShearCentreY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY(), newShearCentreY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearCentreY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearCentreY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearCentreY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasure getShearDeformationAreaZ() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaZ(IfcAreaMeasure newShearDeformationAreaZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ(), newShearDeformationAreaZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearDeformationAreaZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearDeformationAreaZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasure getShearDeformationAreaY() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaY(IfcAreaMeasure newShearDeformationAreaY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY(), newShearDeformationAreaY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearDeformationAreaY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearDeformationAreaY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_ShearDeformationAreaY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionModulusMeasure getMaximumSectionModulusY() {
		return (IfcSectionModulusMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusY(IfcSectionModulusMeasure newMaximumSectionModulusY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY(), newMaximumSectionModulusY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumSectionModulusY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumSectionModulusY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionModulusMeasure getMinimumSectionModulusY() {
		return (IfcSectionModulusMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusY(IfcSectionModulusMeasure newMinimumSectionModulusY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY(), newMinimumSectionModulusY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSectionModulusY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSectionModulusY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionModulusMeasure getMaximumSectionModulusZ() {
		return (IfcSectionModulusMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusZ(IfcSectionModulusMeasure newMaximumSectionModulusZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ(), newMaximumSectionModulusZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumSectionModulusZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumSectionModulusZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MaximumSectionModulusZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionModulusMeasure getMinimumSectionModulusZ() {
		return (IfcSectionModulusMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusZ(IfcSectionModulusMeasure newMinimumSectionModulusZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ(), newMinimumSectionModulusZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSectionModulusZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSectionModulusZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_MinimumSectionModulusZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionModulusMeasure getTorsionalSectionModulus() {
		return (IfcSectionModulusMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalSectionModulus(IfcSectionModulusMeasure newTorsionalSectionModulus) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus(), newTorsionalSectionModulus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTorsionalSectionModulus() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTorsionalSectionModulus() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_TorsionalSectionModulus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getCentreOfGravityInX() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(IfcLengthMeasure newCentreOfGravityInX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX(), newCentreOfGravityInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getCentreOfGravityInY() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(IfcLengthMeasure newCentreOfGravityInY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY(), newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralProfileProperties_CentreOfGravityInY());
	}

} //IfcStructuralProfilePropertiesImpl
