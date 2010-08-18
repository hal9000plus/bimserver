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
 * A representation of the model object '<em><b>Ifc Mechanical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalMaterialProperties()
 * @model
 * @generated
 */
public interface IfcMechanicalMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Dynamic Viscosity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Viscosity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Viscosity</em>' reference.
	 * @see #isSetDynamicViscosity()
	 * @see #unsetDynamicViscosity()
	 * @see #setDynamicViscosity(IfcDynamicViscosityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalMaterialProperties_DynamicViscosity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDynamicViscosityMeasure getDynamicViscosity();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Viscosity</em>' reference.
	 * @see #isSetDynamicViscosity()
	 * @see #unsetDynamicViscosity()
	 * @see #getDynamicViscosity()
	 * @generated
	 */
	void setDynamicViscosity(IfcDynamicViscosityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDynamicViscosity()
	 * @see #getDynamicViscosity()
	 * @see #setDynamicViscosity(IfcDynamicViscosityMeasure)
	 * @generated
	 */
	void unsetDynamicViscosity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dynamic Viscosity</em>' reference is set.
	 * @see #unsetDynamicViscosity()
	 * @see #getDynamicViscosity()
	 * @see #setDynamicViscosity(IfcDynamicViscosityMeasure)
	 * @generated
	 */
	boolean isSetDynamicViscosity();

	/**
	 * Returns the value of the '<em><b>Young Modulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Young Modulus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Young Modulus</em>' reference.
	 * @see #isSetYoungModulus()
	 * @see #unsetYoungModulus()
	 * @see #setYoungModulus(IfcModulusOfElasticityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalMaterialProperties_YoungModulus()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfElasticityMeasure getYoungModulus();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Young Modulus</em>' reference.
	 * @see #isSetYoungModulus()
	 * @see #unsetYoungModulus()
	 * @see #getYoungModulus()
	 * @generated
	 */
	void setYoungModulus(IfcModulusOfElasticityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYoungModulus()
	 * @see #getYoungModulus()
	 * @see #setYoungModulus(IfcModulusOfElasticityMeasure)
	 * @generated
	 */
	void unsetYoungModulus();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Young Modulus</em>' reference is set.
	 * @see #unsetYoungModulus()
	 * @see #getYoungModulus()
	 * @see #setYoungModulus(IfcModulusOfElasticityMeasure)
	 * @generated
	 */
	boolean isSetYoungModulus();

	/**
	 * Returns the value of the '<em><b>Shear Modulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Modulus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Modulus</em>' reference.
	 * @see #isSetShearModulus()
	 * @see #unsetShearModulus()
	 * @see #setShearModulus(IfcModulusOfElasticityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalMaterialProperties_ShearModulus()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfElasticityMeasure getShearModulus();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Modulus</em>' reference.
	 * @see #isSetShearModulus()
	 * @see #unsetShearModulus()
	 * @see #getShearModulus()
	 * @generated
	 */
	void setShearModulus(IfcModulusOfElasticityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearModulus()
	 * @see #getShearModulus()
	 * @see #setShearModulus(IfcModulusOfElasticityMeasure)
	 * @generated
	 */
	void unsetShearModulus();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Modulus</em>' reference is set.
	 * @see #unsetShearModulus()
	 * @see #getShearModulus()
	 * @see #setShearModulus(IfcModulusOfElasticityMeasure)
	 * @generated
	 */
	boolean isSetShearModulus();

	/**
	 * Returns the value of the '<em><b>Poisson Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poisson Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poisson Ratio</em>' reference.
	 * @see #isSetPoissonRatio()
	 * @see #unsetPoissonRatio()
	 * @see #setPoissonRatio(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalMaterialProperties_PoissonRatio()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getPoissonRatio();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poisson Ratio</em>' reference.
	 * @see #isSetPoissonRatio()
	 * @see #unsetPoissonRatio()
	 * @see #getPoissonRatio()
	 * @generated
	 */
	void setPoissonRatio(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPoissonRatio()
	 * @see #getPoissonRatio()
	 * @see #setPoissonRatio(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetPoissonRatio();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Poisson Ratio</em>' reference is set.
	 * @see #unsetPoissonRatio()
	 * @see #getPoissonRatio()
	 * @see #setPoissonRatio(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetPoissonRatio();

	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coefficient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Expansion Coefficient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Expansion Coefficient</em>' reference.
	 * @see #isSetThermalExpansionCoefficient()
	 * @see #unsetThermalExpansionCoefficient()
	 * @see #setThermalExpansionCoefficient(IfcThermalExpansionCoefficientMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcThermalExpansionCoefficientMeasure getThermalExpansionCoefficient();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coefficient</em>' reference.
	 * @see #isSetThermalExpansionCoefficient()
	 * @see #unsetThermalExpansionCoefficient()
	 * @see #getThermalExpansionCoefficient()
	 * @generated
	 */
	void setThermalExpansionCoefficient(IfcThermalExpansionCoefficientMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalExpansionCoefficient()
	 * @see #getThermalExpansionCoefficient()
	 * @see #setThermalExpansionCoefficient(IfcThermalExpansionCoefficientMeasure)
	 * @generated
	 */
	void unsetThermalExpansionCoefficient();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Expansion Coefficient</em>' reference is set.
	 * @see #unsetThermalExpansionCoefficient()
	 * @see #getThermalExpansionCoefficient()
	 * @see #setThermalExpansionCoefficient(IfcThermalExpansionCoefficientMeasure)
	 * @generated
	 */
	boolean isSetThermalExpansionCoefficient();

} // IfcMechanicalMaterialProperties
