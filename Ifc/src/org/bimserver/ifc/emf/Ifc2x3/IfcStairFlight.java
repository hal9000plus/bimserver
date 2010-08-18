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
 * A representation of the model object '<em><b>Ifc Stair Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getNumberOfRiser <em>Number Of Riser</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getNumberOfTreads <em>Number Of Treads</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getRiserHeight <em>Riser Height</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getTreadLength <em>Tread Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStairFlight()
 * @model
 * @generated
 */
public interface IfcStairFlight extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Number Of Riser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Riser</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Riser</em>' reference.
	 * @see #setNumberOfRiser(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStairFlight_NumberOfRiser()
	 * @model
	 * @generated
	 */
	IfcInteger getNumberOfRiser();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getNumberOfRiser <em>Number Of Riser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Riser</em>' reference.
	 * @see #getNumberOfRiser()
	 * @generated
	 */
	void setNumberOfRiser(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Number Of Treads</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Treads</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Treads</em>' reference.
	 * @see #setNumberOfTreads(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStairFlight_NumberOfTreads()
	 * @model
	 * @generated
	 */
	IfcInteger getNumberOfTreads();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getNumberOfTreads <em>Number Of Treads</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Treads</em>' reference.
	 * @see #getNumberOfTreads()
	 * @generated
	 */
	void setNumberOfTreads(IfcInteger value);

	/**
	 * Returns the value of the '<em><b>Riser Height</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Riser Height</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riser Height</em>' reference.
	 * @see #isSetRiserHeight()
	 * @see #unsetRiserHeight()
	 * @see #setRiserHeight(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStairFlight_RiserHeight()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getRiserHeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getRiserHeight <em>Riser Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Riser Height</em>' reference.
	 * @see #isSetRiserHeight()
	 * @see #unsetRiserHeight()
	 * @see #getRiserHeight()
	 * @generated
	 */
	void setRiserHeight(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getRiserHeight <em>Riser Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRiserHeight()
	 * @see #getRiserHeight()
	 * @see #setRiserHeight(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetRiserHeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getRiserHeight <em>Riser Height</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Riser Height</em>' reference is set.
	 * @see #unsetRiserHeight()
	 * @see #getRiserHeight()
	 * @see #setRiserHeight(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetRiserHeight();

	/**
	 * Returns the value of the '<em><b>Tread Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tread Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tread Length</em>' reference.
	 * @see #isSetTreadLength()
	 * @see #unsetTreadLength()
	 * @see #setTreadLength(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStairFlight_TreadLength()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getTreadLength();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getTreadLength <em>Tread Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tread Length</em>' reference.
	 * @see #isSetTreadLength()
	 * @see #unsetTreadLength()
	 * @see #getTreadLength()
	 * @generated
	 */
	void setTreadLength(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getTreadLength <em>Tread Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTreadLength()
	 * @see #getTreadLength()
	 * @see #setTreadLength(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetTreadLength();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStairFlight#getTreadLength <em>Tread Length</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tread Length</em>' reference is set.
	 * @see #unsetTreadLength()
	 * @see #getTreadLength()
	 * @see #setTreadLength(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetTreadLength();

} // IfcStairFlight
