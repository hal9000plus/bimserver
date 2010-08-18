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
import org.bimserver.ifc.emf.Ifc2x3.IfcSpecificHeatCapacityMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcThermalConductivityMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcThermodynamicTemperatureMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Thermal Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcThermalMaterialPropertiesImpl#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcThermalMaterialPropertiesImpl#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcThermalMaterialPropertiesImpl#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcThermalMaterialPropertiesImpl#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcThermalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcThermalMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcThermalMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecificHeatCapacityMeasure getSpecificHeatCapacity() {
		return (IfcSpecificHeatCapacityMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure newSpecificHeatCapacity) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity(), newSpecificHeatCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecificHeatCapacity() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecificHeatCapacity() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_SpecificHeatCapacity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasure getBoilingPoint() {
		return (IfcThermodynamicTemperatureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoilingPoint(IfcThermodynamicTemperatureMeasure newBoilingPoint) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint(), newBoilingPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoilingPoint() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoilingPoint() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_BoilingPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasure getFreezingPoint() {
		return (IfcThermodynamicTemperatureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreezingPoint(IfcThermodynamicTemperatureMeasure newFreezingPoint) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint(), newFreezingPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFreezingPoint() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFreezingPoint() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_FreezingPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalConductivityMeasure getThermalConductivity() {
		return (IfcThermalConductivityMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalConductivity(IfcThermalConductivityMeasure newThermalConductivity) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity(), newThermalConductivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalConductivity() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalConductivity() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcThermalMaterialProperties_ThermalConductivity());
	}

} //IfcThermalMaterialPropertiesImpl
