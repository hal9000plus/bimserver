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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style Font Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCurveStyleFontPattern#getVisibleSegmentLength <em>Visible Segment Length</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCurveStyleFontPattern#getInvisibleSegmentLength <em>Invisible Segment Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCurveStyleFontPattern()
 * @model
 * @generated
 */
public interface IfcCurveStyleFontPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Visible Segment Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Segment Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Segment Length</em>' reference.
	 * @see #setVisibleSegmentLength(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCurveStyleFontPattern_VisibleSegmentLength()
	 * @model
	 * @generated
	 */
	IfcLengthMeasure getVisibleSegmentLength();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCurveStyleFontPattern#getVisibleSegmentLength <em>Visible Segment Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Segment Length</em>' reference.
	 * @see #getVisibleSegmentLength()
	 * @generated
	 */
	void setVisibleSegmentLength(IfcLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Invisible Segment Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invisible Segment Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invisible Segment Length</em>' reference.
	 * @see #setInvisibleSegmentLength(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCurveStyleFontPattern_InvisibleSegmentLength()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getInvisibleSegmentLength();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCurveStyleFontPattern#getInvisibleSegmentLength <em>Invisible Segment Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invisible Segment Length</em>' reference.
	 * @see #getInvisibleSegmentLength()
	 * @generated
	 */
	void setInvisibleSegmentLength(IfcPositiveLengthMeasure value);

} // IfcCurveStyleFontPattern
