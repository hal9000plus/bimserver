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
 * A representation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties()
 * @model
 * @generated
 */
public interface IfcHygroscopicMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Upper Vapor Resistance Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Vapor Resistance Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Vapor Resistance Factor</em>' reference.
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getUpperVaporResistanceFactor();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Vapor Resistance Factor</em>' reference.
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @generated
	 */
	void setUpperVaporResistanceFactor(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetUpperVaporResistanceFactor();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Upper Vapor Resistance Factor</em>' reference is set.
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetUpperVaporResistanceFactor();

	/**
	 * Returns the value of the '<em><b>Lower Vapor Resistance Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Vapor Resistance Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Vapor Resistance Factor</em>' reference.
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getLowerVaporResistanceFactor();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Vapor Resistance Factor</em>' reference.
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @generated
	 */
	void setLowerVaporResistanceFactor(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetLowerVaporResistanceFactor();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Vapor Resistance Factor</em>' reference is set.
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetLowerVaporResistanceFactor();

	/**
	 * Returns the value of the '<em><b>Isothermal Moisture Capacity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isothermal Moisture Capacity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isothermal Moisture Capacity</em>' reference.
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(IfcIsothermalMoistureCapacityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcIsothermalMoistureCapacityMeasure getIsothermalMoistureCapacity();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isothermal Moisture Capacity</em>' reference.
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @generated
	 */
	void setIsothermalMoistureCapacity(IfcIsothermalMoistureCapacityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(IfcIsothermalMoistureCapacityMeasure)
	 * @generated
	 */
	void unsetIsothermalMoistureCapacity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isothermal Moisture Capacity</em>' reference is set.
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(IfcIsothermalMoistureCapacityMeasure)
	 * @generated
	 */
	boolean isSetIsothermalMoistureCapacity();

	/**
	 * Returns the value of the '<em><b>Vapor Permeability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vapor Permeability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vapor Permeability</em>' reference.
	 * @see #isSetVaporPermeability()
	 * @see #unsetVaporPermeability()
	 * @see #setVaporPermeability(IfcVaporPermeabilityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_VaporPermeability()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcVaporPermeabilityMeasure getVaporPermeability();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vapor Permeability</em>' reference.
	 * @see #isSetVaporPermeability()
	 * @see #unsetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @generated
	 */
	void setVaporPermeability(IfcVaporPermeabilityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @see #setVaporPermeability(IfcVaporPermeabilityMeasure)
	 * @generated
	 */
	void unsetVaporPermeability();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vapor Permeability</em>' reference is set.
	 * @see #unsetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @see #setVaporPermeability(IfcVaporPermeabilityMeasure)
	 * @generated
	 */
	boolean isSetVaporPermeability();

	/**
	 * Returns the value of the '<em><b>Moisture Diffusivity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moisture Diffusivity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moisture Diffusivity</em>' reference.
	 * @see #isSetMoistureDiffusivity()
	 * @see #unsetMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(IfcMoistureDiffusivityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_MoistureDiffusivity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMoistureDiffusivityMeasure getMoistureDiffusivity();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moisture Diffusivity</em>' reference.
	 * @see #isSetMoistureDiffusivity()
	 * @see #unsetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @generated
	 */
	void setMoistureDiffusivity(IfcMoistureDiffusivityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(IfcMoistureDiffusivityMeasure)
	 * @generated
	 */
	void unsetMoistureDiffusivity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moisture Diffusivity</em>' reference is set.
	 * @see #unsetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(IfcMoistureDiffusivityMeasure)
	 * @generated
	 */
	boolean isSetMoistureDiffusivity();

} // IfcHygroscopicMaterialProperties
