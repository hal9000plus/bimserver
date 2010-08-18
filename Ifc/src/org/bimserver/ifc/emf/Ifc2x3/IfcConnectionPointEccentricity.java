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
 * A representation of the model object '<em><b>Ifc Connection Point Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInX <em>Eccentricity In X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInY <em>Eccentricity In Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInZ <em>Eccentricity In Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcConnectionPointEccentricity()
 * @model
 * @generated
 */
public interface IfcConnectionPointEccentricity extends IfcConnectionPointGeometry {
	/**
	 * Returns the value of the '<em><b>Eccentricity In X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eccentricity In X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eccentricity In X</em>' reference.
	 * @see #isSetEccentricityInX()
	 * @see #unsetEccentricityInX()
	 * @see #setEccentricityInX(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcConnectionPointEccentricity_EccentricityInX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getEccentricityInX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInX <em>Eccentricity In X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eccentricity In X</em>' reference.
	 * @see #isSetEccentricityInX()
	 * @see #unsetEccentricityInX()
	 * @see #getEccentricityInX()
	 * @generated
	 */
	void setEccentricityInX(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInX <em>Eccentricity In X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEccentricityInX()
	 * @see #getEccentricityInX()
	 * @see #setEccentricityInX(IfcLengthMeasure)
	 * @generated
	 */
	void unsetEccentricityInX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInX <em>Eccentricity In X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eccentricity In X</em>' reference is set.
	 * @see #unsetEccentricityInX()
	 * @see #getEccentricityInX()
	 * @see #setEccentricityInX(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetEccentricityInX();

	/**
	 * Returns the value of the '<em><b>Eccentricity In Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eccentricity In Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eccentricity In Y</em>' reference.
	 * @see #isSetEccentricityInY()
	 * @see #unsetEccentricityInY()
	 * @see #setEccentricityInY(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcConnectionPointEccentricity_EccentricityInY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getEccentricityInY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInY <em>Eccentricity In Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eccentricity In Y</em>' reference.
	 * @see #isSetEccentricityInY()
	 * @see #unsetEccentricityInY()
	 * @see #getEccentricityInY()
	 * @generated
	 */
	void setEccentricityInY(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInY <em>Eccentricity In Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEccentricityInY()
	 * @see #getEccentricityInY()
	 * @see #setEccentricityInY(IfcLengthMeasure)
	 * @generated
	 */
	void unsetEccentricityInY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInY <em>Eccentricity In Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eccentricity In Y</em>' reference is set.
	 * @see #unsetEccentricityInY()
	 * @see #getEccentricityInY()
	 * @see #setEccentricityInY(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetEccentricityInY();

	/**
	 * Returns the value of the '<em><b>Eccentricity In Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eccentricity In Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eccentricity In Z</em>' reference.
	 * @see #isSetEccentricityInZ()
	 * @see #unsetEccentricityInZ()
	 * @see #setEccentricityInZ(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcConnectionPointEccentricity_EccentricityInZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getEccentricityInZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInZ <em>Eccentricity In Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eccentricity In Z</em>' reference.
	 * @see #isSetEccentricityInZ()
	 * @see #unsetEccentricityInZ()
	 * @see #getEccentricityInZ()
	 * @generated
	 */
	void setEccentricityInZ(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInZ <em>Eccentricity In Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEccentricityInZ()
	 * @see #getEccentricityInZ()
	 * @see #setEccentricityInZ(IfcLengthMeasure)
	 * @generated
	 */
	void unsetEccentricityInZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcConnectionPointEccentricity#getEccentricityInZ <em>Eccentricity In Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eccentricity In Z</em>' reference is set.
	 * @see #unsetEccentricityInZ()
	 * @see #getEccentricityInZ()
	 * @see #setEccentricityInZ(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetEccentricityInZ();

} // IfcConnectionPointEccentricity
