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
 * A representation of the model object '<em><b>Ifc Optical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleTransmittance <em>Visible Transmittance</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarTransmittance <em>Solar Transmittance</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarReflectanceFront <em>Solar Reflectance Front</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarReflectanceBack <em>Solar Reflectance Back</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties()
 * @model
 * @generated
 */
public interface IfcOpticalMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Visible Transmittance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Transmittance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Transmittance</em>' reference.
	 * @see #isSetVisibleTransmittance()
	 * @see #unsetVisibleTransmittance()
	 * @see #setVisibleTransmittance(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_VisibleTransmittance()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getVisibleTransmittance();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleTransmittance <em>Visible Transmittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Transmittance</em>' reference.
	 * @see #isSetVisibleTransmittance()
	 * @see #unsetVisibleTransmittance()
	 * @see #getVisibleTransmittance()
	 * @generated
	 */
	void setVisibleTransmittance(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleTransmittance <em>Visible Transmittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibleTransmittance()
	 * @see #getVisibleTransmittance()
	 * @see #setVisibleTransmittance(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetVisibleTransmittance();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleTransmittance <em>Visible Transmittance</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible Transmittance</em>' reference is set.
	 * @see #unsetVisibleTransmittance()
	 * @see #getVisibleTransmittance()
	 * @see #setVisibleTransmittance(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetVisibleTransmittance();

	/**
	 * Returns the value of the '<em><b>Solar Transmittance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar Transmittance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar Transmittance</em>' reference.
	 * @see #isSetSolarTransmittance()
	 * @see #unsetSolarTransmittance()
	 * @see #setSolarTransmittance(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_SolarTransmittance()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getSolarTransmittance();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarTransmittance <em>Solar Transmittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar Transmittance</em>' reference.
	 * @see #isSetSolarTransmittance()
	 * @see #unsetSolarTransmittance()
	 * @see #getSolarTransmittance()
	 * @generated
	 */
	void setSolarTransmittance(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarTransmittance <em>Solar Transmittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolarTransmittance()
	 * @see #getSolarTransmittance()
	 * @see #setSolarTransmittance(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetSolarTransmittance();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarTransmittance <em>Solar Transmittance</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solar Transmittance</em>' reference is set.
	 * @see #unsetSolarTransmittance()
	 * @see #getSolarTransmittance()
	 * @see #setSolarTransmittance(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetSolarTransmittance();

	/**
	 * Returns the value of the '<em><b>Thermal Ir Transmittance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Ir Transmittance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Ir Transmittance</em>' reference.
	 * @see #isSetThermalIrTransmittance()
	 * @see #unsetThermalIrTransmittance()
	 * @see #setThermalIrTransmittance(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_ThermalIrTransmittance()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getThermalIrTransmittance();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Ir Transmittance</em>' reference.
	 * @see #isSetThermalIrTransmittance()
	 * @see #unsetThermalIrTransmittance()
	 * @see #getThermalIrTransmittance()
	 * @generated
	 */
	void setThermalIrTransmittance(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalIrTransmittance()
	 * @see #getThermalIrTransmittance()
	 * @see #setThermalIrTransmittance(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetThermalIrTransmittance();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Ir Transmittance</em>' reference is set.
	 * @see #unsetThermalIrTransmittance()
	 * @see #getThermalIrTransmittance()
	 * @see #setThermalIrTransmittance(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetThermalIrTransmittance();

	/**
	 * Returns the value of the '<em><b>Thermal Ir Emissivity Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Ir Emissivity Back</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Ir Emissivity Back</em>' reference.
	 * @see #isSetThermalIrEmissivityBack()
	 * @see #unsetThermalIrEmissivityBack()
	 * @see #setThermalIrEmissivityBack(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_ThermalIrEmissivityBack()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getThermalIrEmissivityBack();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Ir Emissivity Back</em>' reference.
	 * @see #isSetThermalIrEmissivityBack()
	 * @see #unsetThermalIrEmissivityBack()
	 * @see #getThermalIrEmissivityBack()
	 * @generated
	 */
	void setThermalIrEmissivityBack(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalIrEmissivityBack()
	 * @see #getThermalIrEmissivityBack()
	 * @see #setThermalIrEmissivityBack(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetThermalIrEmissivityBack();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Ir Emissivity Back</em>' reference is set.
	 * @see #unsetThermalIrEmissivityBack()
	 * @see #getThermalIrEmissivityBack()
	 * @see #setThermalIrEmissivityBack(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetThermalIrEmissivityBack();

	/**
	 * Returns the value of the '<em><b>Thermal Ir Emissivity Front</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Ir Emissivity Front</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Ir Emissivity Front</em>' reference.
	 * @see #isSetThermalIrEmissivityFront()
	 * @see #unsetThermalIrEmissivityFront()
	 * @see #setThermalIrEmissivityFront(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_ThermalIrEmissivityFront()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getThermalIrEmissivityFront();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Ir Emissivity Front</em>' reference.
	 * @see #isSetThermalIrEmissivityFront()
	 * @see #unsetThermalIrEmissivityFront()
	 * @see #getThermalIrEmissivityFront()
	 * @generated
	 */
	void setThermalIrEmissivityFront(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThermalIrEmissivityFront()
	 * @see #getThermalIrEmissivityFront()
	 * @see #setThermalIrEmissivityFront(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetThermalIrEmissivityFront();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thermal Ir Emissivity Front</em>' reference is set.
	 * @see #unsetThermalIrEmissivityFront()
	 * @see #getThermalIrEmissivityFront()
	 * @see #setThermalIrEmissivityFront(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetThermalIrEmissivityFront();

	/**
	 * Returns the value of the '<em><b>Visible Reflectance Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Reflectance Back</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Reflectance Back</em>' reference.
	 * @see #isSetVisibleReflectanceBack()
	 * @see #unsetVisibleReflectanceBack()
	 * @see #setVisibleReflectanceBack(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_VisibleReflectanceBack()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getVisibleReflectanceBack();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Reflectance Back</em>' reference.
	 * @see #isSetVisibleReflectanceBack()
	 * @see #unsetVisibleReflectanceBack()
	 * @see #getVisibleReflectanceBack()
	 * @generated
	 */
	void setVisibleReflectanceBack(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibleReflectanceBack()
	 * @see #getVisibleReflectanceBack()
	 * @see #setVisibleReflectanceBack(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetVisibleReflectanceBack();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible Reflectance Back</em>' reference is set.
	 * @see #unsetVisibleReflectanceBack()
	 * @see #getVisibleReflectanceBack()
	 * @see #setVisibleReflectanceBack(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetVisibleReflectanceBack();

	/**
	 * Returns the value of the '<em><b>Visible Reflectance Front</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Reflectance Front</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Reflectance Front</em>' reference.
	 * @see #isSetVisibleReflectanceFront()
	 * @see #unsetVisibleReflectanceFront()
	 * @see #setVisibleReflectanceFront(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_VisibleReflectanceFront()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getVisibleReflectanceFront();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Reflectance Front</em>' reference.
	 * @see #isSetVisibleReflectanceFront()
	 * @see #unsetVisibleReflectanceFront()
	 * @see #getVisibleReflectanceFront()
	 * @generated
	 */
	void setVisibleReflectanceFront(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibleReflectanceFront()
	 * @see #getVisibleReflectanceFront()
	 * @see #setVisibleReflectanceFront(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetVisibleReflectanceFront();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible Reflectance Front</em>' reference is set.
	 * @see #unsetVisibleReflectanceFront()
	 * @see #getVisibleReflectanceFront()
	 * @see #setVisibleReflectanceFront(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetVisibleReflectanceFront();

	/**
	 * Returns the value of the '<em><b>Solar Reflectance Front</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar Reflectance Front</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar Reflectance Front</em>' reference.
	 * @see #isSetSolarReflectanceFront()
	 * @see #unsetSolarReflectanceFront()
	 * @see #setSolarReflectanceFront(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_SolarReflectanceFront()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getSolarReflectanceFront();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarReflectanceFront <em>Solar Reflectance Front</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar Reflectance Front</em>' reference.
	 * @see #isSetSolarReflectanceFront()
	 * @see #unsetSolarReflectanceFront()
	 * @see #getSolarReflectanceFront()
	 * @generated
	 */
	void setSolarReflectanceFront(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarReflectanceFront <em>Solar Reflectance Front</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolarReflectanceFront()
	 * @see #getSolarReflectanceFront()
	 * @see #setSolarReflectanceFront(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetSolarReflectanceFront();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarReflectanceFront <em>Solar Reflectance Front</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solar Reflectance Front</em>' reference is set.
	 * @see #unsetSolarReflectanceFront()
	 * @see #getSolarReflectanceFront()
	 * @see #setSolarReflectanceFront(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetSolarReflectanceFront();

	/**
	 * Returns the value of the '<em><b>Solar Reflectance Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar Reflectance Back</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar Reflectance Back</em>' reference.
	 * @see #isSetSolarReflectanceBack()
	 * @see #unsetSolarReflectanceBack()
	 * @see #setSolarReflectanceBack(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcOpticalMaterialProperties_SolarReflectanceBack()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getSolarReflectanceBack();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarReflectanceBack <em>Solar Reflectance Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar Reflectance Back</em>' reference.
	 * @see #isSetSolarReflectanceBack()
	 * @see #unsetSolarReflectanceBack()
	 * @see #getSolarReflectanceBack()
	 * @generated
	 */
	void setSolarReflectanceBack(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarReflectanceBack <em>Solar Reflectance Back</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSolarReflectanceBack()
	 * @see #getSolarReflectanceBack()
	 * @see #setSolarReflectanceBack(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetSolarReflectanceBack();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcOpticalMaterialProperties#getSolarReflectanceBack <em>Solar Reflectance Back</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Solar Reflectance Back</em>' reference is set.
	 * @see #unsetSolarReflectanceBack()
	 * @see #getSolarReflectanceBack()
	 * @see #setSolarReflectanceBack(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetSolarReflectanceBack();

} // IfcOpticalMaterialProperties
