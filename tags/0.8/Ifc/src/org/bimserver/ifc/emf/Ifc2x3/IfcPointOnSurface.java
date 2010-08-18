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
 * A representation of the model object '<em><b>Ifc Point On Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnSurface#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnSurface#getPointParameterU <em>Point Parameter U</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnSurface#getPointParameterV <em>Point Parameter V</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnSurface#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnSurface()
 * @model
 * @generated
 */
public interface IfcPointOnSurface extends IfcPoint {
	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' reference.
	 * @see #setBasisSurface(IfcSurface)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnSurface_BasisSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getBasisSurface();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnSurface#getBasisSurface <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Point Parameter U</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Parameter U</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter U</em>' reference.
	 * @see #setPointParameterU(IfcParameterValue)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnSurface_PointParameterU()
	 * @model
	 * @generated
	 */
	IfcParameterValue getPointParameterU();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnSurface#getPointParameterU <em>Point Parameter U</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter U</em>' reference.
	 * @see #getPointParameterU()
	 * @generated
	 */
	void setPointParameterU(IfcParameterValue value);

	/**
	 * Returns the value of the '<em><b>Point Parameter V</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Parameter V</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter V</em>' reference.
	 * @see #setPointParameterV(IfcParameterValue)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnSurface_PointParameterV()
	 * @model
	 * @generated
	 */
	IfcParameterValue getPointParameterV();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnSurface#getPointParameterV <em>Point Parameter V</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter V</em>' reference.
	 * @see #getPointParameterV()
	 * @generated
	 */
	void setPointParameterV(IfcParameterValue value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' reference.
	 * @see #setDim(IfcDimensionCount)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnSurface_Dim()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' BasisSurface.Dim;'"
	 * @generated
	 */
	IfcDimensionCount getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnSurface#getDim <em>Dim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' reference.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(IfcDimensionCount value);

} // IfcPointOnSurface
