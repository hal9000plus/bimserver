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
 * A representation of the model object '<em><b>Ifc Coordinated Universal Time Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCoordinatedUniversalTimeOffset#getHourOffset <em>Hour Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCoordinatedUniversalTimeOffset#getMinuteOffset <em>Minute Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCoordinatedUniversalTimeOffset#getSense <em>Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCoordinatedUniversalTimeOffset()
 * @model
 * @generated
 */
public interface IfcCoordinatedUniversalTimeOffset extends EObject {
	/**
	 * Returns the value of the '<em><b>Hour Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour Offset</em>' reference.
	 * @see #setHourOffset(IfcHourInDay)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCoordinatedUniversalTimeOffset_HourOffset()
	 * @model
	 * @generated
	 */
	IfcHourInDay getHourOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCoordinatedUniversalTimeOffset#getHourOffset <em>Hour Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour Offset</em>' reference.
	 * @see #getHourOffset()
	 * @generated
	 */
	void setHourOffset(IfcHourInDay value);

	/**
	 * Returns the value of the '<em><b>Minute Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute Offset</em>' reference.
	 * @see #isSetMinuteOffset()
	 * @see #unsetMinuteOffset()
	 * @see #setMinuteOffset(IfcMinuteInHour)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCoordinatedUniversalTimeOffset_MinuteOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMinuteInHour getMinuteOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCoordinatedUniversalTimeOffset#getMinuteOffset <em>Minute Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute Offset</em>' reference.
	 * @see #isSetMinuteOffset()
	 * @see #unsetMinuteOffset()
	 * @see #getMinuteOffset()
	 * @generated
	 */
	void setMinuteOffset(IfcMinuteInHour value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCoordinatedUniversalTimeOffset#getMinuteOffset <em>Minute Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinuteOffset()
	 * @see #getMinuteOffset()
	 * @see #setMinuteOffset(IfcMinuteInHour)
	 * @generated
	 */
	void unsetMinuteOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCoordinatedUniversalTimeOffset#getMinuteOffset <em>Minute Offset</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minute Offset</em>' reference is set.
	 * @see #unsetMinuteOffset()
	 * @see #getMinuteOffset()
	 * @see #setMinuteOffset(IfcMinuteInHour)
	 * @generated
	 */
	boolean isSetMinuteOffset();

	/**
	 * Returns the value of the '<em><b>Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcAheadOrBehind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sense</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcAheadOrBehind
	 * @see #setSense(IfcAheadOrBehind)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCoordinatedUniversalTimeOffset_Sense()
	 * @model
	 * @generated
	 */
	IfcAheadOrBehind getSense();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCoordinatedUniversalTimeOffset#getSense <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sense</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcAheadOrBehind
	 * @see #getSense()
	 * @generated
	 */
	void setSense(IfcAheadOrBehind value);

} // IfcCoordinatedUniversalTimeOffset
