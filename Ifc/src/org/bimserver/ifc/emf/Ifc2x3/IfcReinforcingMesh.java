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
 * A representation of the model object '<em><b>Ifc Reinforcing Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getMeshLength <em>Mesh Length</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getMeshWidth <em>Mesh Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh()
 * @model
 * @generated
 */
public interface IfcReinforcingMesh extends IfcReinforcingElement {
	/**
	 * Returns the value of the '<em><b>Mesh Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh Length</em>' reference.
	 * @see #isSetMeshLength()
	 * @see #unsetMeshLength()
	 * @see #setMeshLength(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh_MeshLength()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getMeshLength();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getMeshLength <em>Mesh Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh Length</em>' reference.
	 * @see #isSetMeshLength()
	 * @see #unsetMeshLength()
	 * @see #getMeshLength()
	 * @generated
	 */
	void setMeshLength(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getMeshLength <em>Mesh Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeshLength()
	 * @see #getMeshLength()
	 * @see #setMeshLength(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetMeshLength();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getMeshLength <em>Mesh Length</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mesh Length</em>' reference is set.
	 * @see #unsetMeshLength()
	 * @see #getMeshLength()
	 * @see #setMeshLength(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetMeshLength();

	/**
	 * Returns the value of the '<em><b>Mesh Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh Width</em>' reference.
	 * @see #isSetMeshWidth()
	 * @see #unsetMeshWidth()
	 * @see #setMeshWidth(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh_MeshWidth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getMeshWidth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getMeshWidth <em>Mesh Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh Width</em>' reference.
	 * @see #isSetMeshWidth()
	 * @see #unsetMeshWidth()
	 * @see #getMeshWidth()
	 * @generated
	 */
	void setMeshWidth(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getMeshWidth <em>Mesh Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeshWidth()
	 * @see #getMeshWidth()
	 * @see #setMeshWidth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetMeshWidth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getMeshWidth <em>Mesh Width</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mesh Width</em>' reference is set.
	 * @see #unsetMeshWidth()
	 * @see #getMeshWidth()
	 * @see #setMeshWidth(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetMeshWidth();

	/**
	 * Returns the value of the '<em><b>Longitudinal Bar Nominal Diameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal Bar Nominal Diameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal Bar Nominal Diameter</em>' reference.
	 * @see #setLongitudinalBarNominalDiameter(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh_LongitudinalBarNominalDiameter()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getLongitudinalBarNominalDiameter();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getLongitudinalBarNominalDiameter <em>Longitudinal Bar Nominal Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Bar Nominal Diameter</em>' reference.
	 * @see #getLongitudinalBarNominalDiameter()
	 * @generated
	 */
	void setLongitudinalBarNominalDiameter(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Transverse Bar Nominal Diameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transverse Bar Nominal Diameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transverse Bar Nominal Diameter</em>' reference.
	 * @see #setTransverseBarNominalDiameter(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh_TransverseBarNominalDiameter()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getTransverseBarNominalDiameter();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getTransverseBarNominalDiameter <em>Transverse Bar Nominal Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transverse Bar Nominal Diameter</em>' reference.
	 * @see #getTransverseBarNominalDiameter()
	 * @generated
	 */
	void setTransverseBarNominalDiameter(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Longitudinal Bar Cross Section Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal Bar Cross Section Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal Bar Cross Section Area</em>' reference.
	 * @see #setLongitudinalBarCrossSectionArea(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh_LongitudinalBarCrossSectionArea()
	 * @model
	 * @generated
	 */
	IfcAreaMeasure getLongitudinalBarCrossSectionArea();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getLongitudinalBarCrossSectionArea <em>Longitudinal Bar Cross Section Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Bar Cross Section Area</em>' reference.
	 * @see #getLongitudinalBarCrossSectionArea()
	 * @generated
	 */
	void setLongitudinalBarCrossSectionArea(IfcAreaMeasure value);

	/**
	 * Returns the value of the '<em><b>Transverse Bar Cross Section Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transverse Bar Cross Section Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transverse Bar Cross Section Area</em>' reference.
	 * @see #setTransverseBarCrossSectionArea(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh_TransverseBarCrossSectionArea()
	 * @model
	 * @generated
	 */
	IfcAreaMeasure getTransverseBarCrossSectionArea();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getTransverseBarCrossSectionArea <em>Transverse Bar Cross Section Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transverse Bar Cross Section Area</em>' reference.
	 * @see #getTransverseBarCrossSectionArea()
	 * @generated
	 */
	void setTransverseBarCrossSectionArea(IfcAreaMeasure value);

	/**
	 * Returns the value of the '<em><b>Longitudinal Bar Spacing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal Bar Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal Bar Spacing</em>' reference.
	 * @see #setLongitudinalBarSpacing(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh_LongitudinalBarSpacing()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getLongitudinalBarSpacing();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getLongitudinalBarSpacing <em>Longitudinal Bar Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Bar Spacing</em>' reference.
	 * @see #getLongitudinalBarSpacing()
	 * @generated
	 */
	void setLongitudinalBarSpacing(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Transverse Bar Spacing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transverse Bar Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transverse Bar Spacing</em>' reference.
	 * @see #setTransverseBarSpacing(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcingMesh_TransverseBarSpacing()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getTransverseBarSpacing();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingMesh#getTransverseBarSpacing <em>Transverse Bar Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transverse Bar Spacing</em>' reference.
	 * @see #getTransverseBarSpacing()
	 * @generated
	 */
	void setTransverseBarSpacing(IfcPositiveLengthMeasure value);

} // IfcReinforcingMesh
