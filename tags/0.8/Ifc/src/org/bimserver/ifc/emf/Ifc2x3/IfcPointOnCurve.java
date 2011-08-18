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
 * A representation of the model object '<em><b>Ifc Point On Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnCurve#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnCurve#getPointParameter <em>Point Parameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnCurve#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnCurve()
 * @model
 * @generated
 */
public interface IfcPointOnCurve extends IfcPoint {
	/**
	 * Returns the value of the '<em><b>Basis Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Curve</em>' reference.
	 * @see #setBasisCurve(IfcCurve)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnCurve_BasisCurve()
	 * @model
	 * @generated
	 */
	IfcCurve getBasisCurve();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnCurve#getBasisCurve <em>Basis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Point Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter</em>' reference.
	 * @see #setPointParameter(IfcParameterValue)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnCurve_PointParameter()
	 * @model
	 * @generated
	 */
	IfcParameterValue getPointParameter();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnCurve#getPointParameter <em>Point Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter</em>' reference.
	 * @see #getPointParameter()
	 * @generated
	 */
	void setPointParameter(IfcParameterValue value);

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPointOnCurve_Dim()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' BasisCurve.Dim;'"
	 * @generated
	 */
	IfcDimensionCount getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPointOnCurve#getDim <em>Dim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' reference.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(IfcDimensionCount value);

} // IfcPointOnCurve