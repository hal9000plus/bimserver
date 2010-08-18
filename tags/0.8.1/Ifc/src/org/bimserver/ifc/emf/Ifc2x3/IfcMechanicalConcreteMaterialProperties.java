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
 * A representation of the model object '<em><b>Ifc Mechanical Concrete Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties()
 * @model
 * @generated
 */
public interface IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Compressive Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compressive Strength</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressive Strength</em>' reference.
	 * @see #isSetCompressiveStrength()
	 * @see #unsetCompressiveStrength()
	 * @see #setCompressiveStrength(IfcPressureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_CompressiveStrength()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPressureMeasure getCompressiveStrength();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressive Strength</em>' reference.
	 * @see #isSetCompressiveStrength()
	 * @see #unsetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @generated
	 */
	void setCompressiveStrength(IfcPressureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @see #setCompressiveStrength(IfcPressureMeasure)
	 * @generated
	 */
	void unsetCompressiveStrength();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compressive Strength</em>' reference is set.
	 * @see #unsetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @see #setCompressiveStrength(IfcPressureMeasure)
	 * @generated
	 */
	boolean isSetCompressiveStrength();

	/**
	 * Returns the value of the '<em><b>Max Aggregate Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Aggregate Size</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Aggregate Size</em>' reference.
	 * @see #isSetMaxAggregateSize()
	 * @see #unsetMaxAggregateSize()
	 * @see #setMaxAggregateSize(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getMaxAggregateSize();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Aggregate Size</em>' reference.
	 * @see #isSetMaxAggregateSize()
	 * @see #unsetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @generated
	 */
	void setMaxAggregateSize(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @see #setMaxAggregateSize(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetMaxAggregateSize();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Aggregate Size</em>' reference is set.
	 * @see #unsetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @see #setMaxAggregateSize(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetMaxAggregateSize();

	/**
	 * Returns the value of the '<em><b>Admixtures Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admixtures Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admixtures Description</em>' reference.
	 * @see #isSetAdmixturesDescription()
	 * @see #unsetAdmixturesDescription()
	 * @see #setAdmixturesDescription(IfcText)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcText getAdmixturesDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admixtures Description</em>' reference.
	 * @see #isSetAdmixturesDescription()
	 * @see #unsetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @generated
	 */
	void setAdmixturesDescription(IfcText value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @see #setAdmixturesDescription(IfcText)
	 * @generated
	 */
	void unsetAdmixturesDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Admixtures Description</em>' reference is set.
	 * @see #unsetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @see #setAdmixturesDescription(IfcText)
	 * @generated
	 */
	boolean isSetAdmixturesDescription();

	/**
	 * Returns the value of the '<em><b>Workability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workability</em>' reference.
	 * @see #isSetWorkability()
	 * @see #unsetWorkability()
	 * @see #setWorkability(IfcText)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_Workability()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcText getWorkability();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workability</em>' reference.
	 * @see #isSetWorkability()
	 * @see #unsetWorkability()
	 * @see #getWorkability()
	 * @generated
	 */
	void setWorkability(IfcText value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkability()
	 * @see #getWorkability()
	 * @see #setWorkability(IfcText)
	 * @generated
	 */
	void unsetWorkability();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Workability</em>' reference is set.
	 * @see #unsetWorkability()
	 * @see #getWorkability()
	 * @see #setWorkability(IfcText)
	 * @generated
	 */
	boolean isSetWorkability();

	/**
	 * Returns the value of the '<em><b>Protective Pore Ratio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protective Pore Ratio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protective Pore Ratio</em>' reference.
	 * @see #isSetProtectivePoreRatio()
	 * @see #unsetProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getProtectivePoreRatio();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protective Pore Ratio</em>' reference.
	 * @see #isSetProtectivePoreRatio()
	 * @see #unsetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @generated
	 */
	void setProtectivePoreRatio(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetProtectivePoreRatio();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protective Pore Ratio</em>' reference is set.
	 * @see #unsetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetProtectivePoreRatio();

	/**
	 * Returns the value of the '<em><b>Water Impermeability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Impermeability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Impermeability</em>' reference.
	 * @see #isSetWaterImpermeability()
	 * @see #unsetWaterImpermeability()
	 * @see #setWaterImpermeability(IfcText)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_WaterImpermeability()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcText getWaterImpermeability();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Impermeability</em>' reference.
	 * @see #isSetWaterImpermeability()
	 * @see #unsetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @generated
	 */
	void setWaterImpermeability(IfcText value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @see #setWaterImpermeability(IfcText)
	 * @generated
	 */
	void unsetWaterImpermeability();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Water Impermeability</em>' reference is set.
	 * @see #unsetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @see #setWaterImpermeability(IfcText)
	 * @generated
	 */
	boolean isSetWaterImpermeability();

} // IfcMechanicalConcreteMaterialProperties
