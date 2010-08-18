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
 * A representation of the model object '<em><b>Ifc Tendon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getTensionForce <em>Tension Force</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getPreStress <em>Pre Stress</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon()
 * @model
 * @generated
 */
public interface IfcTendon extends IfcReinforcingElement {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcTendonTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcTendonTypeEnum
	 * @see #setPredefinedType(IfcTendonTypeEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcTendonTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcTendonTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcTendonTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Nominal Diameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Diameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Diameter</em>' reference.
	 * @see #setNominalDiameter(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon_NominalDiameter()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getNominalDiameter();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getNominalDiameter <em>Nominal Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Diameter</em>' reference.
	 * @see #getNominalDiameter()
	 * @generated
	 */
	void setNominalDiameter(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Cross Section Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Area</em>' reference.
	 * @see #setCrossSectionArea(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon_CrossSectionArea()
	 * @model
	 * @generated
	 */
	IfcAreaMeasure getCrossSectionArea();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getCrossSectionArea <em>Cross Section Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Area</em>' reference.
	 * @see #getCrossSectionArea()
	 * @generated
	 */
	void setCrossSectionArea(IfcAreaMeasure value);

	/**
	 * Returns the value of the '<em><b>Tension Force</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Force</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Force</em>' reference.
	 * @see #isSetTensionForce()
	 * @see #unsetTensionForce()
	 * @see #setTensionForce(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon_TensionForce()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getTensionForce();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getTensionForce <em>Tension Force</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Force</em>' reference.
	 * @see #isSetTensionForce()
	 * @see #unsetTensionForce()
	 * @see #getTensionForce()
	 * @generated
	 */
	void setTensionForce(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getTensionForce <em>Tension Force</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionForce()
	 * @see #getTensionForce()
	 * @see #setTensionForce(IfcForceMeasure)
	 * @generated
	 */
	void unsetTensionForce();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getTensionForce <em>Tension Force</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Force</em>' reference is set.
	 * @see #unsetTensionForce()
	 * @see #getTensionForce()
	 * @see #setTensionForce(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetTensionForce();

	/**
	 * Returns the value of the '<em><b>Pre Stress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Stress</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Stress</em>' reference.
	 * @see #isSetPreStress()
	 * @see #unsetPreStress()
	 * @see #setPreStress(IfcPressureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon_PreStress()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPressureMeasure getPreStress();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getPreStress <em>Pre Stress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Stress</em>' reference.
	 * @see #isSetPreStress()
	 * @see #unsetPreStress()
	 * @see #getPreStress()
	 * @generated
	 */
	void setPreStress(IfcPressureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getPreStress <em>Pre Stress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreStress()
	 * @see #getPreStress()
	 * @see #setPreStress(IfcPressureMeasure)
	 * @generated
	 */
	void unsetPreStress();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getPreStress <em>Pre Stress</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pre Stress</em>' reference is set.
	 * @see #unsetPreStress()
	 * @see #getPreStress()
	 * @see #setPreStress(IfcPressureMeasure)
	 * @generated
	 */
	boolean isSetPreStress();

	/**
	 * Returns the value of the '<em><b>Friction Coefficient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friction Coefficient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction Coefficient</em>' reference.
	 * @see #isSetFrictionCoefficient()
	 * @see #unsetFrictionCoefficient()
	 * @see #setFrictionCoefficient(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon_FrictionCoefficient()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getFrictionCoefficient();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction Coefficient</em>' reference.
	 * @see #isSetFrictionCoefficient()
	 * @see #unsetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @generated
	 */
	void setFrictionCoefficient(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @see #setFrictionCoefficient(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetFrictionCoefficient();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getFrictionCoefficient <em>Friction Coefficient</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Friction Coefficient</em>' reference is set.
	 * @see #unsetFrictionCoefficient()
	 * @see #getFrictionCoefficient()
	 * @see #setFrictionCoefficient(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetFrictionCoefficient();

	/**
	 * Returns the value of the '<em><b>Anchorage Slip</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchorage Slip</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchorage Slip</em>' reference.
	 * @see #isSetAnchorageSlip()
	 * @see #unsetAnchorageSlip()
	 * @see #setAnchorageSlip(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon_AnchorageSlip()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getAnchorageSlip();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchorage Slip</em>' reference.
	 * @see #isSetAnchorageSlip()
	 * @see #unsetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @generated
	 */
	void setAnchorageSlip(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @see #setAnchorageSlip(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetAnchorageSlip();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getAnchorageSlip <em>Anchorage Slip</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Anchorage Slip</em>' reference is set.
	 * @see #unsetAnchorageSlip()
	 * @see #getAnchorageSlip()
	 * @see #setAnchorageSlip(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetAnchorageSlip();

	/**
	 * Returns the value of the '<em><b>Min Curvature Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Curvature Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Curvature Radius</em>' reference.
	 * @see #isSetMinCurvatureRadius()
	 * @see #unsetMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTendon_MinCurvatureRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getMinCurvatureRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Curvature Radius</em>' reference.
	 * @see #isSetMinCurvatureRadius()
	 * @see #unsetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @generated
	 */
	void setMinCurvatureRadius(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetMinCurvatureRadius();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTendon#getMinCurvatureRadius <em>Min Curvature Radius</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Curvature Radius</em>' reference is set.
	 * @see #unsetMinCurvatureRadius()
	 * @see #getMinCurvatureRadius()
	 * @see #setMinCurvatureRadius(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetMinCurvatureRadius();

} // IfcTendon
