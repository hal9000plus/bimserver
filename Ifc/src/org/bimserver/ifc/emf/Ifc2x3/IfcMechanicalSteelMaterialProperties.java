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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Steel Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getRelaxations <em>Relaxations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalSteelMaterialProperties()
 * @model
 * @generated
 */
public interface IfcMechanicalSteelMaterialProperties extends IfcMechanicalMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Yield Stress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yield Stress</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield Stress</em>' reference.
	 * @see #isSetYieldStress()
	 * @see #unsetYieldStress()
	 * @see #setYieldStress(IfcPressureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalSteelMaterialProperties_YieldStress()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPressureMeasure getYieldStress();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yield Stress</em>' reference.
	 * @see #isSetYieldStress()
	 * @see #unsetYieldStress()
	 * @see #getYieldStress()
	 * @generated
	 */
	void setYieldStress(IfcPressureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYieldStress()
	 * @see #getYieldStress()
	 * @see #setYieldStress(IfcPressureMeasure)
	 * @generated
	 */
	void unsetYieldStress();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Yield Stress</em>' reference is set.
	 * @see #unsetYieldStress()
	 * @see #getYieldStress()
	 * @see #setYieldStress(IfcPressureMeasure)
	 * @generated
	 */
	boolean isSetYieldStress();

	/**
	 * Returns the value of the '<em><b>Ultimate Stress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultimate Stress</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimate Stress</em>' reference.
	 * @see #isSetUltimateStress()
	 * @see #unsetUltimateStress()
	 * @see #setUltimateStress(IfcPressureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalSteelMaterialProperties_UltimateStress()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPressureMeasure getUltimateStress();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Stress</em>' reference.
	 * @see #isSetUltimateStress()
	 * @see #unsetUltimateStress()
	 * @see #getUltimateStress()
	 * @generated
	 */
	void setUltimateStress(IfcPressureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUltimateStress()
	 * @see #getUltimateStress()
	 * @see #setUltimateStress(IfcPressureMeasure)
	 * @generated
	 */
	void unsetUltimateStress();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ultimate Stress</em>' reference is set.
	 * @see #unsetUltimateStress()
	 * @see #getUltimateStress()
	 * @see #setUltimateStress(IfcPressureMeasure)
	 * @generated
	 */
	boolean isSetUltimateStress();

	/**
	 * Returns the value of the '<em><b>Ultimate Strain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultimate Strain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimate Strain</em>' reference.
	 * @see #isSetUltimateStrain()
	 * @see #unsetUltimateStrain()
	 * @see #setUltimateStrain(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalSteelMaterialProperties_UltimateStrain()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getUltimateStrain();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Strain</em>' reference.
	 * @see #isSetUltimateStrain()
	 * @see #unsetUltimateStrain()
	 * @see #getUltimateStrain()
	 * @generated
	 */
	void setUltimateStrain(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUltimateStrain()
	 * @see #getUltimateStrain()
	 * @see #setUltimateStrain(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetUltimateStrain();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ultimate Strain</em>' reference is set.
	 * @see #unsetUltimateStrain()
	 * @see #getUltimateStrain()
	 * @see #setUltimateStrain(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetUltimateStrain();

	/**
	 * Returns the value of the '<em><b>Hardening Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardening Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardening Module</em>' reference.
	 * @see #isSetHardeningModule()
	 * @see #unsetHardeningModule()
	 * @see #setHardeningModule(IfcModulusOfElasticityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalSteelMaterialProperties_HardeningModule()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcModulusOfElasticityMeasure getHardeningModule();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardening Module</em>' reference.
	 * @see #isSetHardeningModule()
	 * @see #unsetHardeningModule()
	 * @see #getHardeningModule()
	 * @generated
	 */
	void setHardeningModule(IfcModulusOfElasticityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHardeningModule()
	 * @see #getHardeningModule()
	 * @see #setHardeningModule(IfcModulusOfElasticityMeasure)
	 * @generated
	 */
	void unsetHardeningModule();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hardening Module</em>' reference is set.
	 * @see #unsetHardeningModule()
	 * @see #getHardeningModule()
	 * @see #setHardeningModule(IfcModulusOfElasticityMeasure)
	 * @generated
	 */
	boolean isSetHardeningModule();

	/**
	 * Returns the value of the '<em><b>Proportional Stress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proportional Stress</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proportional Stress</em>' reference.
	 * @see #isSetProportionalStress()
	 * @see #unsetProportionalStress()
	 * @see #setProportionalStress(IfcPressureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalSteelMaterialProperties_ProportionalStress()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPressureMeasure getProportionalStress();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proportional Stress</em>' reference.
	 * @see #isSetProportionalStress()
	 * @see #unsetProportionalStress()
	 * @see #getProportionalStress()
	 * @generated
	 */
	void setProportionalStress(IfcPressureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProportionalStress()
	 * @see #getProportionalStress()
	 * @see #setProportionalStress(IfcPressureMeasure)
	 * @generated
	 */
	void unsetProportionalStress();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Proportional Stress</em>' reference is set.
	 * @see #unsetProportionalStress()
	 * @see #getProportionalStress()
	 * @see #setProportionalStress(IfcPressureMeasure)
	 * @generated
	 */
	boolean isSetProportionalStress();

	/**
	 * Returns the value of the '<em><b>Plastic Strain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plastic Strain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plastic Strain</em>' reference.
	 * @see #isSetPlasticStrain()
	 * @see #unsetPlasticStrain()
	 * @see #setPlasticStrain(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalSteelMaterialProperties_PlasticStrain()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getPlasticStrain();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plastic Strain</em>' reference.
	 * @see #isSetPlasticStrain()
	 * @see #unsetPlasticStrain()
	 * @see #getPlasticStrain()
	 * @generated
	 */
	void setPlasticStrain(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlasticStrain()
	 * @see #getPlasticStrain()
	 * @see #setPlasticStrain(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetPlasticStrain();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plastic Strain</em>' reference is set.
	 * @see #unsetPlasticStrain()
	 * @see #getPlasticStrain()
	 * @see #setPlasticStrain(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetPlasticStrain();

	/**
	 * Returns the value of the '<em><b>Relaxations</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcRelaxation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaxations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaxations</em>' reference list.
	 * @see #isSetRelaxations()
	 * @see #unsetRelaxations()
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalSteelMaterialProperties_Relaxations()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcRelaxation> getRelaxations();

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getRelaxations <em>Relaxations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelaxations()
	 * @see #getRelaxations()
	 * @generated
	 */
	void unsetRelaxations();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalSteelMaterialProperties#getRelaxations <em>Relaxations</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relaxations</em>' reference list is set.
	 * @see #unsetRelaxations()
	 * @see #getRelaxations()
	 * @generated
	 */
	boolean isSetRelaxations();

} // IfcMechanicalSteelMaterialProperties
