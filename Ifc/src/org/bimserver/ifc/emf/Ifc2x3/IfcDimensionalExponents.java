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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Dimensional Exponents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getLengthExponent <em>Length Exponent</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getMassExponent <em>Mass Exponent</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getTimeExponent <em>Time Exponent</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getElectricCurrentExponent <em>Electric Current Exponent</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDimensionalExponents()
 * @model
 * @generated
 */
public interface IfcDimensionalExponents extends EObject {
	/**
	 * Returns the value of the '<em><b>Length Exponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Exponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Exponent</em>' reference.
	 * @see #setLengthExponent(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDimensionalExponents_LengthExponent()
	 * @model
	 * @generated
	 */
	IfcInteger getLengthExponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getLengthExponent <em>Length Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Exponent</em>' reference.
	 * @see #getLengthExponent()
	 * @generated
	 */
	void setLengthExponent(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Mass Exponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Exponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Exponent</em>' reference.
	 * @see #setMassExponent(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDimensionalExponents_MassExponent()
	 * @model
	 * @generated
	 */
	IfcInteger getMassExponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getMassExponent <em>Mass Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Exponent</em>' reference.
	 * @see #getMassExponent()
	 * @generated
	 */
	void setMassExponent(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Time Exponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Exponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Exponent</em>' reference.
	 * @see #setTimeExponent(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDimensionalExponents_TimeExponent()
	 * @model
	 * @generated
	 */
	IfcInteger getTimeExponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getTimeExponent <em>Time Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Exponent</em>' reference.
	 * @see #getTimeExponent()
	 * @generated
	 */
	void setTimeExponent(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Electric Current Exponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electric Current Exponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric Current Exponent</em>' reference.
	 * @see #setElectricCurrentExponent(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDimensionalExponents_ElectricCurrentExponent()
	 * @model
	 * @generated
	 */
	IfcInteger getElectricCurrentExponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getElectricCurrentExponent <em>Electric Current Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric Current Exponent</em>' reference.
	 * @see #getElectricCurrentExponent()
	 * @generated
	 */
	void setElectricCurrentExponent(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Thermodynamic Temperature Exponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermodynamic Temperature Exponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermodynamic Temperature Exponent</em>' reference.
	 * @see #setThermodynamicTemperatureExponent(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDimensionalExponents_ThermodynamicTemperatureExponent()
	 * @model
	 * @generated
	 */
	IfcInteger getThermodynamicTemperatureExponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getThermodynamicTemperatureExponent <em>Thermodynamic Temperature Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermodynamic Temperature Exponent</em>' reference.
	 * @see #getThermodynamicTemperatureExponent()
	 * @generated
	 */
	void setThermodynamicTemperatureExponent(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Amount Of Substance Exponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Substance Exponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Substance Exponent</em>' reference.
	 * @see #setAmountOfSubstanceExponent(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDimensionalExponents_AmountOfSubstanceExponent()
	 * @model
	 * @generated
	 */
	IfcInteger getAmountOfSubstanceExponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getAmountOfSubstanceExponent <em>Amount Of Substance Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Substance Exponent</em>' reference.
	 * @see #getAmountOfSubstanceExponent()
	 * @generated
	 */
	void setAmountOfSubstanceExponent(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Luminous Intensity Exponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Intensity Exponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Intensity Exponent</em>' reference.
	 * @see #setLuminousIntensityExponent(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDimensionalExponents_LuminousIntensityExponent()
	 * @model
	 * @generated
	 */
	IfcInteger getLuminousIntensityExponent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDimensionalExponents#getLuminousIntensityExponent <em>Luminous Intensity Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Intensity Exponent</em>' reference.
	 * @see #getLuminousIntensityExponent()
	 * @generated
	 */
	void setLuminousIntensityExponent(IfcInteger value);

} // IfcDimensionalExponents
