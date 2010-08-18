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
 * A representation of the model object '<em><b>Ifc Products Of Combustion Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcProductsOfCombustionProperties()
 * @model
 * @generated
 */
public interface IfcProductsOfCombustionProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Specific Heat Capacity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Heat Capacity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Heat Capacity</em>' reference.
	 * @see #isSetSpecificHeatCapacity()
	 * @see #unsetSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcProductsOfCombustionProperties_SpecificHeatCapacity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSpecificHeatCapacityMeasure getSpecificHeatCapacity();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Heat Capacity</em>' reference.
	 * @see #isSetSpecificHeatCapacity()
	 * @see #unsetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 */
	void setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure)
	 * @generated
	 */
	void unsetSpecificHeatCapacity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specific Heat Capacity</em>' reference is set.
	 * @see #unsetSpecificHeatCapacity()
	 * @see #getSpecificHeatCapacity()
	 * @see #setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure)
	 * @generated
	 */
	boolean isSetSpecificHeatCapacity();

	/**
	 * Returns the value of the '<em><b>N20 Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N20 Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N20 Content</em>' reference.
	 * @see #isSetN20Content()
	 * @see #unsetN20Content()
	 * @see #setN20Content(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcProductsOfCombustionProperties_N20Content()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getN20Content();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N20 Content</em>' reference.
	 * @see #isSetN20Content()
	 * @see #unsetN20Content()
	 * @see #getN20Content()
	 * @generated
	 */
	void setN20Content(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetN20Content()
	 * @see #getN20Content()
	 * @see #setN20Content(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetN20Content();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>N20 Content</em>' reference is set.
	 * @see #unsetN20Content()
	 * @see #getN20Content()
	 * @see #setN20Content(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetN20Content();

	/**
	 * Returns the value of the '<em><b>CO Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CO Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO Content</em>' reference.
	 * @see #isSetCOContent()
	 * @see #unsetCOContent()
	 * @see #setCOContent(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcProductsOfCombustionProperties_COContent()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getCOContent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO Content</em>' reference.
	 * @see #isSetCOContent()
	 * @see #unsetCOContent()
	 * @see #getCOContent()
	 * @generated
	 */
	void setCOContent(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCOContent()
	 * @see #getCOContent()
	 * @see #setCOContent(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetCOContent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CO Content</em>' reference is set.
	 * @see #unsetCOContent()
	 * @see #getCOContent()
	 * @see #setCOContent(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetCOContent();

	/**
	 * Returns the value of the '<em><b>CO2 Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CO2 Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO2 Content</em>' reference.
	 * @see #isSetCO2Content()
	 * @see #unsetCO2Content()
	 * @see #setCO2Content(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcProductsOfCombustionProperties_CO2Content()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getCO2Content();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO2 Content</em>' reference.
	 * @see #isSetCO2Content()
	 * @see #unsetCO2Content()
	 * @see #getCO2Content()
	 * @generated
	 */
	void setCO2Content(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCO2Content()
	 * @see #getCO2Content()
	 * @see #setCO2Content(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetCO2Content();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>CO2 Content</em>' reference is set.
	 * @see #unsetCO2Content()
	 * @see #getCO2Content()
	 * @see #setCO2Content(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetCO2Content();

} // IfcProductsOfCombustionProperties
