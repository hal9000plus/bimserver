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
 * A representation of the model object '<em><b>Ifc Electrical Base Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties()
 * @model
 * @generated
 */
public interface IfcElectricalBaseProperties extends IfcEnergyProperties {
	/**
	 * Returns the value of the '<em><b>Electric Current Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricCurrentEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electric Current Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric Current Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcElectricCurrentEnum
	 * @see #setElectricCurrentType(IfcElectricCurrentEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_ElectricCurrentType()
	 * @model
	 * @generated
	 */
	IfcElectricCurrentEnum getElectricCurrentType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric Current Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcElectricCurrentEnum
	 * @see #getElectricCurrentType()
	 * @generated
	 */
	void setElectricCurrentType(IfcElectricCurrentEnum value);

	/**
	 * Returns the value of the '<em><b>Input Voltage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Voltage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Voltage</em>' reference.
	 * @see #setInputVoltage(IfcElectricVoltageMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_InputVoltage()
	 * @model
	 * @generated
	 */
	IfcElectricVoltageMeasure getInputVoltage();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Voltage</em>' reference.
	 * @see #getInputVoltage()
	 * @generated
	 */
	void setInputVoltage(IfcElectricVoltageMeasure value);

	/**
	 * Returns the value of the '<em><b>Input Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Frequency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Frequency</em>' reference.
	 * @see #setInputFrequency(IfcFrequencyMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_InputFrequency()
	 * @model
	 * @generated
	 */
	IfcFrequencyMeasure getInputFrequency();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Frequency</em>' reference.
	 * @see #getInputFrequency()
	 * @generated
	 */
	void setInputFrequency(IfcFrequencyMeasure value);

	/**
	 * Returns the value of the '<em><b>Full Load Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Load Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Load Current</em>' reference.
	 * @see #isSetFullLoadCurrent()
	 * @see #unsetFullLoadCurrent()
	 * @see #setFullLoadCurrent(IfcElectricCurrentMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_FullLoadCurrent()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcElectricCurrentMeasure getFullLoadCurrent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Load Current</em>' reference.
	 * @see #isSetFullLoadCurrent()
	 * @see #unsetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @generated
	 */
	void setFullLoadCurrent(IfcElectricCurrentMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @see #setFullLoadCurrent(IfcElectricCurrentMeasure)
	 * @generated
	 */
	void unsetFullLoadCurrent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Full Load Current</em>' reference is set.
	 * @see #unsetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @see #setFullLoadCurrent(IfcElectricCurrentMeasure)
	 * @generated
	 */
	boolean isSetFullLoadCurrent();

	/**
	 * Returns the value of the '<em><b>Minimum Circuit Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Circuit Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Circuit Current</em>' reference.
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(IfcElectricCurrentMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_MinimumCircuitCurrent()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcElectricCurrentMeasure getMinimumCircuitCurrent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Circuit Current</em>' reference.
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @generated
	 */
	void setMinimumCircuitCurrent(IfcElectricCurrentMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(IfcElectricCurrentMeasure)
	 * @generated
	 */
	void unsetMinimumCircuitCurrent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Circuit Current</em>' reference is set.
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(IfcElectricCurrentMeasure)
	 * @generated
	 */
	boolean isSetMinimumCircuitCurrent();

	/**
	 * Returns the value of the '<em><b>Maximum Power Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Power Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Power Input</em>' reference.
	 * @see #isSetMaximumPowerInput()
	 * @see #unsetMaximumPowerInput()
	 * @see #setMaximumPowerInput(IfcPowerMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_MaximumPowerInput()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPowerMeasure getMaximumPowerInput();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Power Input</em>' reference.
	 * @see #isSetMaximumPowerInput()
	 * @see #unsetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @generated
	 */
	void setMaximumPowerInput(IfcPowerMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @see #setMaximumPowerInput(IfcPowerMeasure)
	 * @generated
	 */
	void unsetMaximumPowerInput();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Power Input</em>' reference is set.
	 * @see #unsetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @see #setMaximumPowerInput(IfcPowerMeasure)
	 * @generated
	 */
	boolean isSetMaximumPowerInput();

	/**
	 * Returns the value of the '<em><b>Rated Power Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Power Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Power Input</em>' reference.
	 * @see #isSetRatedPowerInput()
	 * @see #unsetRatedPowerInput()
	 * @see #setRatedPowerInput(IfcPowerMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_RatedPowerInput()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPowerMeasure getRatedPowerInput();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Power Input</em>' reference.
	 * @see #isSetRatedPowerInput()
	 * @see #unsetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @generated
	 */
	void setRatedPowerInput(IfcPowerMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @see #setRatedPowerInput(IfcPowerMeasure)
	 * @generated
	 */
	void unsetRatedPowerInput();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Power Input</em>' reference is set.
	 * @see #unsetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @see #setRatedPowerInput(IfcPowerMeasure)
	 * @generated
	 */
	boolean isSetRatedPowerInput();

	/**
	 * Returns the value of the '<em><b>Input Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Phase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Phase</em>' reference.
	 * @see #setInputPhase(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_InputPhase()
	 * @model
	 * @generated
	 */
	IfcInteger getInputPhase();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Phase</em>' reference.
	 * @see #getInputPhase()
	 * @generated
	 */
	void setInputPhase(IfcInteger value);

} // IfcElectricalBaseProperties
