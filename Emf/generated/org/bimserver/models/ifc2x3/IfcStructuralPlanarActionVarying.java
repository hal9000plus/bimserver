/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Planar Action Varying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralPlanarActionVarying()
 * @model
 * @generated
 */
public interface IfcStructuralPlanarActionVarying extends IfcStructuralPlanarAction {
	/**
	 * Returns the value of the '<em><b>Varying Applied Load Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varying Applied Load Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varying Applied Load Location</em>' reference.
	 * @see #isSetVaryingAppliedLoadLocation()
	 * @see #unsetVaryingAppliedLoadLocation()
	 * @see #setVaryingAppliedLoadLocation(IfcShapeAspect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralPlanarActionVarying_VaryingAppliedLoadLocation()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcShapeAspect getVaryingAppliedLoadLocation();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varying Applied Load Location</em>' reference.
	 * @see #isSetVaryingAppliedLoadLocation()
	 * @see #unsetVaryingAppliedLoadLocation()
	 * @see #getVaryingAppliedLoadLocation()
	 * @generated
	 */
	void setVaryingAppliedLoadLocation(IfcShapeAspect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVaryingAppliedLoadLocation()
	 * @see #getVaryingAppliedLoadLocation()
	 * @see #setVaryingAppliedLoadLocation(IfcShapeAspect)
	 * @generated
	 */
	void unsetVaryingAppliedLoadLocation();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying#getVaryingAppliedLoadLocation <em>Varying Applied Load Location</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Varying Applied Load Location</em>' reference is set.
	 * @see #unsetVaryingAppliedLoadLocation()
	 * @see #getVaryingAppliedLoadLocation()
	 * @see #setVaryingAppliedLoadLocation(IfcShapeAspect)
	 * @generated
	 */
	boolean isSetVaryingAppliedLoadLocation();

	/**
	 * Returns the value of the '<em><b>Subsequent Applied Loads</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcStructuralLoad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsequent Applied Loads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsequent Applied Loads</em>' reference list.
	 * @see #isSetSubsequentAppliedLoads()
	 * @see #unsetSubsequentAppliedLoads()
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralPlanarActionVarying_SubsequentAppliedLoads()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcStructuralLoad> getSubsequentAppliedLoads();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubsequentAppliedLoads()
	 * @see #getSubsequentAppliedLoads()
	 * @generated
	 */
	void unsetSubsequentAppliedLoads();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying#getSubsequentAppliedLoads <em>Subsequent Applied Loads</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subsequent Applied Loads</em>' reference list is set.
	 * @see #unsetSubsequentAppliedLoads()
	 * @see #getSubsequentAppliedLoads()
	 * @generated
	 */
	boolean isSetSubsequentAppliedLoads();

} // IfcStructuralPlanarActionVarying
