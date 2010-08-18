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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc BSpline Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getControlPointsList <em>Control Points List</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getCurveForm <em>Curve Form</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getClosedCurve <em>Closed Curve</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getSelfIntersect <em>Self Intersect</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getUpperIndexOnControlPoints <em>Upper Index On Control Points</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getControlPoints <em>Control Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBSplineCurve()
 * @model
 * @generated
 */
public interface IfcBSplineCurve extends IfcBoundedCurve {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' reference.
	 * @see #setDegree(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBSplineCurve_Degree()
	 * @model
	 * @generated
	 */
	IfcInteger getDegree();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getDegree <em>Degree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Control Points List</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Points List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Points List</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBSplineCurve_ControlPointsList()
	 * @model
	 * @generated
	 */
	EList<IfcCartesianPoint> getControlPointsList();

	/**
	 * Returns the value of the '<em><b>Curve Form</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurveForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Form</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurveForm
	 * @see #setCurveForm(IfcBSplineCurveForm)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBSplineCurve_CurveForm()
	 * @model
	 * @generated
	 */
	IfcBSplineCurveForm getCurveForm();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getCurveForm <em>Curve Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Form</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurveForm
	 * @see #getCurveForm()
	 * @generated
	 */
	void setCurveForm(IfcBSplineCurveForm value);

	/**
	 * Returns the value of the '<em><b>Closed Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Curve</em>' reference.
	 * @see #setClosedCurve(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBSplineCurve_ClosedCurve()
	 * @model
	 * @generated
	 */
	IfcLogical getClosedCurve();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getClosedCurve <em>Closed Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Curve</em>' reference.
	 * @see #getClosedCurve()
	 * @generated
	 */
	void setClosedCurve(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Self Intersect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Intersect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Intersect</em>' reference.
	 * @see #setSelfIntersect(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBSplineCurve_SelfIntersect()
	 * @model
	 * @generated
	 */
	IfcLogical getSelfIntersect();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getSelfIntersect <em>Self Intersect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Intersect</em>' reference.
	 * @see #getSelfIntersect()
	 * @generated
	 */
	void setSelfIntersect(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Upper Index On Control Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Index On Control Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Index On Control Points</em>' reference.
	 * @see #setUpperIndexOnControlPoints(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBSplineCurve_UpperIndexOnControlPoints()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' (SIZEOF(ControlPointsList) - 1);'"
	 * @generated
	 */
	IfcInteger getUpperIndexOnControlPoints();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBSplineCurve#getUpperIndexOnControlPoints <em>Upper Index On Control Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Index On Control Points</em>' reference.
	 * @see #getUpperIndexOnControlPoints()
	 * @generated
	 */
	void setUpperIndexOnControlPoints(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Control Points</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Points</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBSplineCurve_ControlPoints()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' IfcListToArray(ControlPointsList,0,UpperIndexOnControlPoints);'"
	 * @generated
	 */
	EList<IfcCartesianPoint> getControlPoints();

} // IfcBSplineCurve
