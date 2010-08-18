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
import org.bimserver.ifc.emf.Ifc2x3.IfcLabel;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveRatioMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPowerMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPropertySourceEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcText;
import org.bimserver.ifc.emf.Ifc2x3.IfcThermalLoadSourceEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcThermalLoadTypeEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcTimeSeries;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Thermal Load Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getApplicableValueRatio <em>Applicable Value Ratio</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadSource <em>Thermal Load Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getSourceDescription <em>Source Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadType <em>Thermal Load Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSpaceThermalLoadPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcSpaceThermalLoadProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceThermalLoadPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveRatioMeasure getApplicableValueRatio() {
		return (IfcPositiveRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableValueRatio(IfcPositiveRatioMeasure newApplicableValueRatio) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio(), newApplicableValueRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableValueRatio() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableValueRatio() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ApplicableValueRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadSourceEnum getThermalLoadSource() {
		return (IfcThermalLoadSourceEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadSource(IfcThermalLoadSourceEnum newThermalLoadSource) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadSource(), newThermalLoadSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySourceEnum getPropertySource() {
		return (IfcPropertySourceEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySource(IfcPropertySourceEnum newPropertySource) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_PropertySource(), newPropertySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcText getSourceDescription() {
		return (IfcText) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDescription(IfcText newSourceDescription) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription(), newSourceDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourceDescription() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceDescription() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_SourceDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPowerMeasure getMaximumValue() {
		return (IfcPowerMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumValue(IfcPowerMeasure newMaximumValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MaximumValue(), newMaximumValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPowerMeasure getMinimumValue() {
		return (IfcPowerMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValue(IfcPowerMeasure newMinimumValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue(), newMinimumValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_MinimumValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getThermalLoadTimeSeriesValues() {
		return (IfcTimeSeries) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadTimeSeriesValues(IfcTimeSeries newThermalLoadTimeSeriesValues) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues(), newThermalLoadTimeSeriesValues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalLoadTimeSeriesValues() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalLoadTimeSeriesValues() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabel getUserDefinedThermalLoadSource() {
		return (IfcLabel) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedThermalLoadSource(IfcLabel newUserDefinedThermalLoadSource) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource(), newUserDefinedThermalLoadSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedThermalLoadSource() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedThermalLoadSource() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabel getUserDefinedPropertySource() {
		return (IfcLabel) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedPropertySource(IfcLabel newUserDefinedPropertySource) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource(), newUserDefinedPropertySource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedPropertySource() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedPropertySource() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_UserDefinedPropertySource());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadTypeEnum getThermalLoadType() {
		return (IfcThermalLoadTypeEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadType(IfcThermalLoadTypeEnum newThermalLoadType) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceThermalLoadProperties_ThermalLoadType(), newThermalLoadType);
	}

} //IfcSpaceThermalLoadPropertiesImpl
