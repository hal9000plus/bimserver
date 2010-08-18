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
package org.bimserver.ifc.emf.Ifc2x3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Space Thermal Load Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getThermalLoadSource <em>Thermal Load Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getThermalLoadType <em>Thermal Load Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties()
 * @model
 * @generated
 */
public interface IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Applicable Value Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Value Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Value Ratio</em>' reference.
	 * @see #isSetApplicableValueRatio()
	 * @see #unsetApplicableValueRatio()
	 * @see #setApplicableValueRatio(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_ApplicableValueRatio()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getApplicableValueRatio();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Value Ratio</em>' reference.
	 * @see #isSetApplicableValueRatio()
	 * @see #unsetApplicableValueRatio()
	 * @see #getApplicableValueRatio()
	 * @generated
	 */
	void setApplicableValueRatio(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicableValueRatio()
	 * @see #getApplicableValueRatio()
	 * @see #setApplicableValueRatio(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetApplicableValueRatio();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Value Ratio</em>' reference is set.
	 * @see #unsetApplicableValueRatio()
	 * @see #getApplicableValueRatio()
	 * @see #setApplicableValueRatio(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetApplicableValueRatio();

	/**
	 * Returns the value of the '<em><b>Thermal Load Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalLoadSourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Source</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcThermalLoadSourceEnum
	 * @see #setThermalLoadSource(IfcThermalLoadSourceEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_ThermalLoadSource()
	 * @model
	 * @generated
	 */
	IfcThermalLoadSourceEnum getThermalLoadSource();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getThermalLoadSource <em>Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Source</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcThermalLoadSourceEnum
	 * @see #getThermalLoadSource()
	 * @generated
	 */
	void setThermalLoadSource(IfcThermalLoadSourceEnum value);

	/**
	 * Returns the value of the '<em><b>Property Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcPropertySourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Source</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcPropertySourceEnum
	 * @see #setPropertySource(IfcPropertySourceEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_PropertySource()
	 * @model
	 * @generated
	 */
	IfcPropertySourceEnum getPropertySource();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getPropertySource <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Source</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcPropertySourceEnum
	 * @see #getPropertySource()
	 * @generated
	 */
	void setPropertySource(IfcPropertySourceEnum value);

	/**
	 * Returns the value of the '<em><b>Source Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Description</em>' reference.
	 * @see #isSetSourceDescription()
	 * @see #unsetSourceDescription()
	 * @see #setSourceDescription(IfcText)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_SourceDescription()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcText getSourceDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Description</em>' reference.
	 * @see #isSetSourceDescription()
	 * @see #unsetSourceDescription()
	 * @see #getSourceDescription()
	 * @generated
	 */
	void setSourceDescription(IfcText value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceDescription()
	 * @see #getSourceDescription()
	 * @see #setSourceDescription(IfcText)
	 * @generated
	 */
	void unsetSourceDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Description</em>' reference is set.
	 * @see #unsetSourceDescription()
	 * @see #getSourceDescription()
	 * @see #setSourceDescription(IfcText)
	 * @generated
	 */
	boolean isSetSourceDescription();

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' reference.
	 * @see #setMaximumValue(IfcPowerMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_MaximumValue()
	 * @model
	 * @generated
	 */
	IfcPowerMeasure getMaximumValue();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getMaximumValue <em>Maximum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' reference.
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(IfcPowerMeasure value);

	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Value</em>' reference.
	 * @see #isSetMinimumValue()
	 * @see #unsetMinimumValue()
	 * @see #setMinimumValue(IfcPowerMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_MinimumValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPowerMeasure getMinimumValue();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' reference.
	 * @see #isSetMinimumValue()
	 * @see #unsetMinimumValue()
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(IfcPowerMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumValue()
	 * @see #getMinimumValue()
	 * @see #setMinimumValue(IfcPowerMeasure)
	 * @generated
	 */
	void unsetMinimumValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Value</em>' reference is set.
	 * @see #unsetMinimumValue()
	 * @see #getMinimumValue()
	 * @see #setMinimumValue(IfcPowerMeasure)
	 * @generated
	 */
	boolean isSetMinimumValue();

	/**
	 * Returns the value of the '<em><b>Thermal Load Time Series Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Time Series Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Time Series Values</em>' reference.
	 * @see #isSetThermalLoadTimeSeriesValues()
	 * @see #unsetThermalLoadTimeSeriesValues()
	 * @see #setThermalLoadTimeSeriesValues(IfcTimeSeries)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeSeries getThermalLoadTimeSeriesValues();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Time Series Values</em>' reference.
	 * @see #isSetThermalLoadTimeSeriesValues()
	 * @see #unsetThermalLoadTimeSeriesValues()
	 * @see #getThermalLoadTimeSeriesValues()
	 * @generated
	 */
	void setThermalLoadTimeSeriesValues(IfcTimeSeries value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalLoadTimeSeriesValues()
	 * @see #getThermalLoadTimeSeriesValues()
	 * @see #setThermalLoadTimeSeriesValues(IfcTimeSeries)
	 * @generated
	 */
	void unsetThermalLoadTimeSeriesValues();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Load Time Series Values</em>' reference is set.
	 * @see #unsetThermalLoadTimeSeriesValues()
	 * @see #getThermalLoadTimeSeriesValues()
	 * @see #setThermalLoadTimeSeriesValues(IfcTimeSeries)
	 * @generated
	 */
	boolean isSetThermalLoadTimeSeriesValues();

	/**
	 * Returns the value of the '<em><b>User Defined Thermal Load Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Thermal Load Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Thermal Load Source</em>' reference.
	 * @see #isSetUserDefinedThermalLoadSource()
	 * @see #unsetUserDefinedThermalLoadSource()
	 * @see #setUserDefinedThermalLoadSource(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getUserDefinedThermalLoadSource();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Thermal Load Source</em>' reference.
	 * @see #isSetUserDefinedThermalLoadSource()
	 * @see #unsetUserDefinedThermalLoadSource()
	 * @see #getUserDefinedThermalLoadSource()
	 * @generated
	 */
	void setUserDefinedThermalLoadSource(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedThermalLoadSource()
	 * @see #getUserDefinedThermalLoadSource()
	 * @see #setUserDefinedThermalLoadSource(IfcLabel)
	 * @generated
	 */
	void unsetUserDefinedThermalLoadSource();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Thermal Load Source</em>' reference is set.
	 * @see #unsetUserDefinedThermalLoadSource()
	 * @see #getUserDefinedThermalLoadSource()
	 * @see #setUserDefinedThermalLoadSource(IfcLabel)
	 * @generated
	 */
	boolean isSetUserDefinedThermalLoadSource();

	/**
	 * Returns the value of the '<em><b>User Defined Property Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Property Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Property Source</em>' reference.
	 * @see #isSetUserDefinedPropertySource()
	 * @see #unsetUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_UserDefinedPropertySource()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getUserDefinedPropertySource();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Property Source</em>' reference.
	 * @see #isSetUserDefinedPropertySource()
	 * @see #unsetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @generated
	 */
	void setUserDefinedPropertySource(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(IfcLabel)
	 * @generated
	 */
	void unsetUserDefinedPropertySource();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Property Source</em>' reference is set.
	 * @see #unsetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(IfcLabel)
	 * @generated
	 */
	boolean isSetUserDefinedPropertySource();

	/**
	 * Returns the value of the '<em><b>Thermal Load Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalLoadTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcThermalLoadTypeEnum
	 * @see #setThermalLoadType(IfcThermalLoadTypeEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceThermalLoadProperties_ThermalLoadType()
	 * @model
	 * @generated
	 */
	IfcThermalLoadTypeEnum getThermalLoadType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceThermalLoadProperties#getThermalLoadType <em>Thermal Load Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcThermalLoadTypeEnum
	 * @see #getThermalLoadType()
	 * @generated
	 */
	void setThermalLoadType(IfcThermalLoadTypeEnum value);

} // IfcSpaceThermalLoadProperties
