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
 * A representation of the model object '<em><b>Ifc Fuel Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFuelProperties()
 * @model
 * @generated
 */
public interface IfcFuelProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Combustion Temperature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Temperature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Temperature</em>' reference.
	 * @see #isSetCombustionTemperature()
	 * @see #unsetCombustionTemperature()
	 * @see #setCombustionTemperature(IfcThermodynamicTemperatureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFuelProperties_CombustionTemperature()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcThermodynamicTemperatureMeasure getCombustionTemperature();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combustion Temperature</em>' reference.
	 * @see #isSetCombustionTemperature()
	 * @see #unsetCombustionTemperature()
	 * @see #getCombustionTemperature()
	 * @generated
	 */
	void setCombustionTemperature(IfcThermodynamicTemperatureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCombustionTemperature()
	 * @see #getCombustionTemperature()
	 * @see #setCombustionTemperature(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	void unsetCombustionTemperature();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Combustion Temperature</em>' reference is set.
	 * @see #unsetCombustionTemperature()
	 * @see #getCombustionTemperature()
	 * @see #setCombustionTemperature(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	boolean isSetCombustionTemperature();

	/**
	 * Returns the value of the '<em><b>Carbon Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carbon Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carbon Content</em>' reference.
	 * @see #isSetCarbonContent()
	 * @see #unsetCarbonContent()
	 * @see #setCarbonContent(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFuelProperties_CarbonContent()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getCarbonContent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carbon Content</em>' reference.
	 * @see #isSetCarbonContent()
	 * @see #unsetCarbonContent()
	 * @see #getCarbonContent()
	 * @generated
	 */
	void setCarbonContent(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCarbonContent()
	 * @see #getCarbonContent()
	 * @see #setCarbonContent(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetCarbonContent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Carbon Content</em>' reference is set.
	 * @see #unsetCarbonContent()
	 * @see #getCarbonContent()
	 * @see #setCarbonContent(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetCarbonContent();

	/**
	 * Returns the value of the '<em><b>Lower Heating Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Heating Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Heating Value</em>' reference.
	 * @see #isSetLowerHeatingValue()
	 * @see #unsetLowerHeatingValue()
	 * @see #setLowerHeatingValue(IfcHeatingValueMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFuelProperties_LowerHeatingValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcHeatingValueMeasure getLowerHeatingValue();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Heating Value</em>' reference.
	 * @see #isSetLowerHeatingValue()
	 * @see #unsetLowerHeatingValue()
	 * @see #getLowerHeatingValue()
	 * @generated
	 */
	void setLowerHeatingValue(IfcHeatingValueMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerHeatingValue()
	 * @see #getLowerHeatingValue()
	 * @see #setLowerHeatingValue(IfcHeatingValueMeasure)
	 * @generated
	 */
	void unsetLowerHeatingValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Heating Value</em>' reference is set.
	 * @see #unsetLowerHeatingValue()
	 * @see #getLowerHeatingValue()
	 * @see #setLowerHeatingValue(IfcHeatingValueMeasure)
	 * @generated
	 */
	boolean isSetLowerHeatingValue();

	/**
	 * Returns the value of the '<em><b>Higher Heating Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Higher Heating Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Higher Heating Value</em>' reference.
	 * @see #isSetHigherHeatingValue()
	 * @see #unsetHigherHeatingValue()
	 * @see #setHigherHeatingValue(IfcHeatingValueMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFuelProperties_HigherHeatingValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcHeatingValueMeasure getHigherHeatingValue();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Higher Heating Value</em>' reference.
	 * @see #isSetHigherHeatingValue()
	 * @see #unsetHigherHeatingValue()
	 * @see #getHigherHeatingValue()
	 * @generated
	 */
	void setHigherHeatingValue(IfcHeatingValueMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHigherHeatingValue()
	 * @see #getHigherHeatingValue()
	 * @see #setHigherHeatingValue(IfcHeatingValueMeasure)
	 * @generated
	 */
	void unsetHigherHeatingValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Higher Heating Value</em>' reference is set.
	 * @see #unsetHigherHeatingValue()
	 * @see #getHigherHeatingValue()
	 * @see #setHigherHeatingValue(IfcHeatingValueMeasure)
	 * @generated
	 */
	boolean isSetHigherHeatingValue();

} // IfcFuelProperties
