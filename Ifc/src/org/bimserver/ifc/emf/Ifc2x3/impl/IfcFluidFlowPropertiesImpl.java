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
import org.bimserver.ifc.emf.Ifc2x3.IfcDerivedMeasureValue;
import org.bimserver.ifc.emf.Ifc2x3.IfcFluidFlowProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcLabel;
import org.bimserver.ifc.emf.Ifc2x3.IfcLinearVelocityMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcMaterial;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveRatioMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPressureMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPropertySourceEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcThermodynamicTemperatureMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcTimeSeries;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fluid Flow Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getVelocityTimeSeries <em>Velocity Time Series</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getFlowrateTimeSeries <em>Flowrate Time Series</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getFluid <em>Fluid</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getPressureTimeSeries <em>Pressure Time Series</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getTemperatureSingleValue <em>Temperature Single Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getTemperatureTimeSeries <em>Temperature Time Series</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getFlowrateSingleValue <em>Flowrate Single Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getVelocitySingleValue <em>Velocity Single Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFluidFlowPropertiesImpl#getPressureSingleValue <em>Pressure Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFluidFlowPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcFluidFlowProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFluidFlowPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySourceEnum getPropertySource() {
		return (IfcPropertySourceEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PropertySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySource(IfcPropertySourceEnum newPropertySource) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PropertySource(), newPropertySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getFlowConditionTimeSeries() {
		return (IfcTimeSeries) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionTimeSeries(IfcTimeSeries newFlowConditionTimeSeries) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionTimeSeries(), newFlowConditionTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowConditionTimeSeries() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowConditionTimeSeries() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getVelocityTimeSeries() {
		return (IfcTimeSeries) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_VelocityTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocityTimeSeries(IfcTimeSeries newVelocityTimeSeries) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_VelocityTimeSeries(), newVelocityTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVelocityTimeSeries() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_VelocityTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVelocityTimeSeries() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_VelocityTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getFlowrateTimeSeries() {
		return (IfcTimeSeries) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowrateTimeSeries(IfcTimeSeries newFlowrateTimeSeries) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateTimeSeries(), newFlowrateTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowrateTimeSeries() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowrateTimeSeries() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getFluid() {
		return (IfcMaterial) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_Fluid(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFluid(IfcMaterial newFluid) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_Fluid(), newFluid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getPressureTimeSeries() {
		return (IfcTimeSeries) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PressureTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureTimeSeries(IfcTimeSeries newPressureTimeSeries) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PressureTimeSeries(), newPressureTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPressureTimeSeries() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PressureTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPressureTimeSeries() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PressureTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabel getUserDefinedPropertySource() {
		return (IfcLabel) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedPropertySource(IfcLabel newUserDefinedPropertySource) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource(), newUserDefinedPropertySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedPropertySource() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedPropertySource() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_UserDefinedPropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasure getTemperatureSingleValue() {
		return (IfcThermodynamicTemperatureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureSingleValue(IfcThermodynamicTemperatureMeasure newTemperatureSingleValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue(), newTemperatureSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTemperatureSingleValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemperatureSingleValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasure getWetBulbTemperatureSingleValue() {
		return (IfcThermodynamicTemperatureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureSingleValue(IfcThermodynamicTemperatureMeasure newWetBulbTemperatureSingleValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue(), newWetBulbTemperatureSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWetBulbTemperatureSingleValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWetBulbTemperatureSingleValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getWetBulbTemperatureTimeSeries() {
		return (IfcTimeSeries) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureTimeSeries(IfcTimeSeries newWetBulbTemperatureTimeSeries) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries(), newWetBulbTemperatureTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWetBulbTemperatureTimeSeries() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWetBulbTemperatureTimeSeries() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getTemperatureTimeSeries() {
		return (IfcTimeSeries) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureTimeSeries(IfcTimeSeries newTemperatureTimeSeries) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureTimeSeries(), newTemperatureTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTemperatureTimeSeries() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemperatureTimeSeries() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_TemperatureTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue getFlowrateSingleValue() {
		return (IfcDerivedMeasureValue) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowrateSingleValue(IfcDerivedMeasureValue newFlowrateSingleValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateSingleValue(), newFlowrateSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowrateSingleValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowrateSingleValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowrateSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveRatioMeasure getFlowConditionSingleValue() {
		return (IfcPositiveRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionSingleValue(IfcPositiveRatioMeasure newFlowConditionSingleValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue(), newFlowConditionSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowConditionSingleValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowConditionSingleValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_FlowConditionSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearVelocityMeasure getVelocitySingleValue() {
		return (IfcLinearVelocityMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocitySingleValue(IfcLinearVelocityMeasure newVelocitySingleValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue(), newVelocitySingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVelocitySingleValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVelocitySingleValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_VelocitySingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPressureMeasure getPressureSingleValue() {
		return (IfcPressureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureSingleValue(IfcPressureMeasure newPressureSingleValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue(), newPressureSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPressureSingleValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPressureSingleValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFluidFlowProperties_PressureSingleValue());
	}

} //IfcFluidFlowPropertiesImpl
