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
 * A representation of the model object '<em><b>Ifc Thermal Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcThermalMaterialProperties()
 * @model
 * @generated
 */
public interface IfcThermalMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Specific Heat Capacity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Heat Capacity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Heat Capacity</em>' reference.
	 * @see #isSetSpecificHeatCapacity()
	 * @see #unsetSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcThermalMaterialProperties_SpecificHeatCapacity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSpecificHeatCapacityMeasure getSpecificHeatCapacity();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Heat Capacity</em>' reference.
	 * @see #isSetSpecificHeatCapacity()
	 * @see #unsetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 */
	void setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure)
	 * @generated
	 */
	void unsetSpecificHeatCapacity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specific Heat Capacity</em>' reference is set.
	 * @see #unsetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure)
	 * @generated
	 */
	boolean isSetSpecificHeatCapacity();

	/**
	 * Returns the value of the '<em><b>Boiling Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boiling Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boiling Point</em>' reference.
	 * @see #isSetBoilingPoint()
	 * @see #unsetBoilingPoint()
	 * @see #setBoilingPoint(IfcThermodynamicTemperatureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcThermalMaterialProperties_BoilingPoint()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcThermodynamicTemperatureMeasure getBoilingPoint();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boiling Point</em>' reference.
	 * @see #isSetBoilingPoint()
	 * @see #unsetBoilingPoint()
	 * @see #getBoilingPoint()
	 * @generated
	 */
	void setBoilingPoint(IfcThermodynamicTemperatureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoilingPoint()
	 * @see #getBoilingPoint()
	 * @see #setBoilingPoint(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	void unsetBoilingPoint();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boiling Point</em>' reference is set.
	 * @see #unsetBoilingPoint()
	 * @see #getBoilingPoint()
	 * @see #setBoilingPoint(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	boolean isSetBoilingPoint();

	/**
	 * Returns the value of the '<em><b>Freezing Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freezing Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freezing Point</em>' reference.
	 * @see #isSetFreezingPoint()
	 * @see #unsetFreezingPoint()
	 * @see #setFreezingPoint(IfcThermodynamicTemperatureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcThermalMaterialProperties_FreezingPoint()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcThermodynamicTemperatureMeasure getFreezingPoint();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freezing Point</em>' reference.
	 * @see #isSetFreezingPoint()
	 * @see #unsetFreezingPoint()
	 * @see #getFreezingPoint()
	 * @generated
	 */
	void setFreezingPoint(IfcThermodynamicTemperatureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreezingPoint()
	 * @see #getFreezingPoint()
	 * @see #setFreezingPoint(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	void unsetFreezingPoint();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Freezing Point</em>' reference is set.
	 * @see #unsetFreezingPoint()
	 * @see #getFreezingPoint()
	 * @see #setFreezingPoint(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	boolean isSetFreezingPoint();

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Conductivity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Conductivity</em>' reference.
	 * @see #isSetThermalConductivity()
	 * @see #unsetThermalConductivity()
	 * @see #setThermalConductivity(IfcThermalConductivityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcThermalMaterialProperties_ThermalConductivity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcThermalConductivityMeasure getThermalConductivity();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity</em>' reference.
	 * @see #isSetThermalConductivity()
	 * @see #unsetThermalConductivity()
	 * @see #getThermalConductivity()
	 * @generated
	 */
	void setThermalConductivity(IfcThermalConductivityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalConductivity()
	 * @see #getThermalConductivity()
	 * @see #setThermalConductivity(IfcThermalConductivityMeasure)
	 * @generated
	 */
	void unsetThermalConductivity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Conductivity</em>' reference is set.
	 * @see #unsetThermalConductivity()
	 * @see #getThermalConductivity()
	 * @see #setThermalConductivity(IfcThermalConductivityMeasure)
	 * @generated
	 */
	boolean isSetThermalConductivity();

} // IfcThermalMaterialProperties
