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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getAxisTag <em>Axis Tag</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getAxisCurve <em>Axis Curve</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getSameSense <em>Same Sense</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getPartOfW <em>Part Of W</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getPartOfV <em>Part Of V</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getPartOfU <em>Part Of U</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getHasIntersections <em>Has Intersections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGridAxis()
 * @model
 * @generated
 */
public interface IfcGridAxis extends EObject {
	/**
	 * Returns the value of the '<em><b>Axis Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Tag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Tag</em>' reference.
	 * @see #isSetAxisTag()
	 * @see #unsetAxisTag()
	 * @see #setAxisTag(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGridAxis_AxisTag()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getAxisTag();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getAxisTag <em>Axis Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Tag</em>' reference.
	 * @see #isSetAxisTag()
	 * @see #unsetAxisTag()
	 * @see #getAxisTag()
	 * @generated
	 */
	void setAxisTag(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getAxisTag <em>Axis Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxisTag()
	 * @see #getAxisTag()
	 * @see #setAxisTag(IfcLabel)
	 * @generated
	 */
	void unsetAxisTag();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getAxisTag <em>Axis Tag</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis Tag</em>' reference is set.
	 * @see #unsetAxisTag()
	 * @see #getAxisTag()
	 * @see #setAxisTag(IfcLabel)
	 * @generated
	 */
	boolean isSetAxisTag();

	/**
	 * Returns the value of the '<em><b>Axis Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Curve</em>' reference.
	 * @see #setAxisCurve(IfcCurve)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGridAxis_AxisCurve()
	 * @model
	 * @generated
	 */
	IfcCurve getAxisCurve();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getAxisCurve <em>Axis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Curve</em>' reference.
	 * @see #getAxisCurve()
	 * @generated
	 */
	void setAxisCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' reference.
	 * @see #setSameSense(IfcBoolean)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGridAxis_SameSense()
	 * @model
	 * @generated
	 */
	IfcBoolean getSameSense();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGridAxis#getSameSense <em>Same Sense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' reference.
	 * @see #getSameSense()
	 * @generated
	 */
	void setSameSense(IfcBoolean value);

	/**
	 * Returns the value of the '<em><b>Part Of W</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcGrid}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGrid#getWAxes <em>WAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of W</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of W</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGridAxis_PartOfW()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcGrid#getWAxes
	 * @model opposite="WAxes" upper="2"
	 * @generated
	 */
	EList<IfcGrid> getPartOfW();

	/**
	 * Returns the value of the '<em><b>Part Of V</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcGrid}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGrid#getVAxes <em>VAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of V</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of V</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGridAxis_PartOfV()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcGrid#getVAxes
	 * @model opposite="VAxes" upper="2"
	 * @generated
	 */
	EList<IfcGrid> getPartOfV();

	/**
	 * Returns the value of the '<em><b>Part Of U</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcGrid}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGrid#getUAxes <em>UAxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of U</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of U</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGridAxis_PartOfU()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcGrid#getUAxes
	 * @model opposite="UAxes" upper="2"
	 * @generated
	 */
	EList<IfcGrid> getPartOfU();

	/**
	 * Returns the value of the '<em><b>Has Intersections</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcVirtualGridIntersection}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcVirtualGridIntersection#getIntersectingAxes <em>Intersecting Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Intersections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Intersections</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGridAxis_HasIntersections()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcVirtualGridIntersection#getIntersectingAxes
	 * @model opposite="IntersectingAxes"
	 * @generated
	 */
	EList<IfcVirtualGridIntersection> getHasIntersections();

} // IfcGridAxis
