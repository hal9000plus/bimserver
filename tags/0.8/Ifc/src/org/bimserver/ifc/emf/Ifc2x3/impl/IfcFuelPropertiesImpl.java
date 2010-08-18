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
import org.bimserver.ifc.emf.Ifc2x3.IfcFuelProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcHeatingValueMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveRatioMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcThermodynamicTemperatureMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fuel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFuelPropertiesImpl#getCombustionTemperature <em>Combustion Temperature</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFuelPropertiesImpl#getCarbonContent <em>Carbon Content</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFuelPropertiesImpl#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFuelPropertiesImpl#getHigherHeatingValue <em>Higher Heating Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFuelPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcFuelProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFuelPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcFuelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasure getCombustionTemperature() {
		return (IfcThermodynamicTemperatureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombustionTemperature(IfcThermodynamicTemperatureMeasure newCombustionTemperature) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature(), newCombustionTemperature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCombustionTemperature() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCombustionTemperature() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_CombustionTemperature());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveRatioMeasure getCarbonContent() {
		return (IfcPositiveRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_CarbonContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarbonContent(IfcPositiveRatioMeasure newCarbonContent) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_CarbonContent(), newCarbonContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCarbonContent() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_CarbonContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCarbonContent() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_CarbonContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatingValueMeasure getLowerHeatingValue() {
		return (IfcHeatingValueMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerHeatingValue(IfcHeatingValueMeasure newLowerHeatingValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue(), newLowerHeatingValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerHeatingValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerHeatingValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_LowerHeatingValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatingValueMeasure getHigherHeatingValue() {
		return (IfcHeatingValueMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigherHeatingValue(IfcHeatingValueMeasure newHigherHeatingValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue(), newHigherHeatingValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHigherHeatingValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHigherHeatingValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFuelProperties_HigherHeatingValue());
	}

} //IfcFuelPropertiesImpl
