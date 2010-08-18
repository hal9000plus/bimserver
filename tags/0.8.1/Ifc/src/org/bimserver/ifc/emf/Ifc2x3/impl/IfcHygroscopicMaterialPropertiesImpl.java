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
import org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcIsothermalMoistureCapacityMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcMoistureDiffusivityMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveRatioMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcVaporPermeabilityMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcHygroscopicMaterialPropertiesImpl#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcHygroscopicMaterialPropertiesImpl#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcHygroscopicMaterialPropertiesImpl#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcHygroscopicMaterialPropertiesImpl#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcHygroscopicMaterialPropertiesImpl#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcHygroscopicMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcHygroscopicMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcHygroscopicMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveRatioMeasure getUpperVaporResistanceFactor() {
		return (IfcPositiveRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperVaporResistanceFactor(IfcPositiveRatioMeasure newUpperVaporResistanceFactor) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor(), newUpperVaporResistanceFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpperVaporResistanceFactor() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpperVaporResistanceFactor() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveRatioMeasure getLowerVaporResistanceFactor() {
		return (IfcPositiveRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerVaporResistanceFactor(IfcPositiveRatioMeasure newLowerVaporResistanceFactor) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor(), newLowerVaporResistanceFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerVaporResistanceFactor() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerVaporResistanceFactor() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIsothermalMoistureCapacityMeasure getIsothermalMoistureCapacity() {
		return (IfcIsothermalMoistureCapacityMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsothermalMoistureCapacity(IfcIsothermalMoistureCapacityMeasure newIsothermalMoistureCapacity) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity(), newIsothermalMoistureCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsothermalMoistureCapacity() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsothermalMoistureCapacity() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVaporPermeabilityMeasure getVaporPermeability() {
		return (IfcVaporPermeabilityMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaporPermeability(IfcVaporPermeabilityMeasure newVaporPermeability) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability(), newVaporPermeability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVaporPermeability() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVaporPermeability() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_VaporPermeability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMoistureDiffusivityMeasure getMoistureDiffusivity() {
		return (IfcMoistureDiffusivityMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoistureDiffusivity(IfcMoistureDiffusivityMeasure newMoistureDiffusivity) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity(), newMoistureDiffusivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoistureDiffusivity() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoistureDiffusivity() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcHygroscopicMaterialProperties_MoistureDiffusivity());
	}

} //IfcHygroscopicMaterialPropertiesImpl
