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
import org.bimserver.ifc.emf.Ifc2x3.IfcElectricCurrentEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcElectricCurrentMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcElectricVoltageMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcElectricalBaseProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcFrequencyMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcInteger;
import org.bimserver.ifc.emf.Ifc2x3.IfcPowerMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electrical Base Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcElectricalBasePropertiesImpl#getElectricCurrentType <em>Electric Current Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcElectricalBasePropertiesImpl#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcElectricalBasePropertiesImpl#getInputFrequency <em>Input Frequency</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcElectricalBasePropertiesImpl#getFullLoadCurrent <em>Full Load Current</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcElectricalBasePropertiesImpl#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcElectricalBasePropertiesImpl#getMaximumPowerInput <em>Maximum Power Input</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcElectricalBasePropertiesImpl#getRatedPowerInput <em>Rated Power Input</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcElectricalBasePropertiesImpl#getInputPhase <em>Input Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElectricalBasePropertiesImpl extends IfcEnergyPropertiesImpl implements IfcElectricalBaseProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricalBasePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentEnum getElectricCurrentType() {
		return (IfcElectricCurrentEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_ElectricCurrentType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricCurrentType(IfcElectricCurrentEnum newElectricCurrentType) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_ElectricCurrentType(), newElectricCurrentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricVoltageMeasure getInputVoltage() {
		return (IfcElectricVoltageMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_InputVoltage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVoltage(IfcElectricVoltageMeasure newInputVoltage) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_InputVoltage(), newInputVoltage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFrequencyMeasure getInputFrequency() {
		return (IfcFrequencyMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_InputFrequency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFrequency(IfcFrequencyMeasure newInputFrequency) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_InputFrequency(), newInputFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentMeasure getFullLoadCurrent() {
		return (IfcElectricCurrentMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullLoadCurrent(IfcElectricCurrentMeasure newFullLoadCurrent) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent(), newFullLoadCurrent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFullLoadCurrent() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFullLoadCurrent() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_FullLoadCurrent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentMeasure getMinimumCircuitCurrent() {
		return (IfcElectricCurrentMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCircuitCurrent(IfcElectricCurrentMeasure newMinimumCircuitCurrent) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent(), newMinimumCircuitCurrent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumCircuitCurrent() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumCircuitCurrent() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_MinimumCircuitCurrent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPowerMeasure getMaximumPowerInput() {
		return (IfcPowerMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPowerInput(IfcPowerMeasure newMaximumPowerInput) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput(), newMaximumPowerInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumPowerInput() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumPowerInput() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_MaximumPowerInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPowerMeasure getRatedPowerInput() {
		return (IfcPowerMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedPowerInput(IfcPowerMeasure newRatedPowerInput) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput(), newRatedPowerInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRatedPowerInput() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRatedPowerInput() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_RatedPowerInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getInputPhase() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_InputPhase(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPhase(IfcInteger newInputPhase) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricalBaseProperties_InputPhase(), newInputPhase);
	}

} //IfcElectricalBasePropertiesImpl
