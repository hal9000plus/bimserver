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
 * A representation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties()
 * @model
 * @generated
 */
public interface IfcGeneralMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Weight</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' reference.
	 * @see #isSetMolecularWeight()
	 * @see #unsetMolecularWeight()
	 * @see #setMolecularWeight(IfcMolecularWeightMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_MolecularWeight()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMolecularWeightMeasure getMolecularWeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' reference.
	 * @see #isSetMolecularWeight()
	 * @see #unsetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(IfcMolecularWeightMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @see #setMolecularWeight(IfcMolecularWeightMeasure)
	 * @generated
	 */
	void unsetMolecularWeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Molecular Weight</em>' reference is set.
	 * @see #unsetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @see #setMolecularWeight(IfcMolecularWeightMeasure)
	 * @generated
	 */
	boolean isSetMolecularWeight();

	/**
	 * Returns the value of the '<em><b>Porosity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porosity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porosity</em>' reference.
	 * @see #isSetPorosity()
	 * @see #unsetPorosity()
	 * @see #setPorosity(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_Porosity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getPorosity();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porosity</em>' reference.
	 * @see #isSetPorosity()
	 * @see #unsetPorosity()
	 * @see #getPorosity()
	 * @generated
	 */
	void setPorosity(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPorosity()
	 * @see #getPorosity()
	 * @see #setPorosity(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetPorosity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Porosity</em>' reference is set.
	 * @see #unsetPorosity()
	 * @see #getPorosity()
	 * @see #setPorosity(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetPorosity();

	/**
	 * Returns the value of the '<em><b>Mass Density</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Density</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Density</em>' reference.
	 * @see #isSetMassDensity()
	 * @see #unsetMassDensity()
	 * @see #setMassDensity(IfcMassDensityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_MassDensity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMassDensityMeasure getMassDensity();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Density</em>' reference.
	 * @see #isSetMassDensity()
	 * @see #unsetMassDensity()
	 * @see #getMassDensity()
	 * @generated
	 */
	void setMassDensity(IfcMassDensityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMassDensity()
	 * @see #getMassDensity()
	 * @see #setMassDensity(IfcMassDensityMeasure)
	 * @generated
	 */
	void unsetMassDensity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mass Density</em>' reference is set.
	 * @see #unsetMassDensity()
	 * @see #getMassDensity()
	 * @see #setMassDensity(IfcMassDensityMeasure)
	 * @generated
	 */
	boolean isSetMassDensity();

} // IfcGeneralMaterialProperties
