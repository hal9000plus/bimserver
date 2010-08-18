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
 * A representation of the model object '<em><b>Ifc Structural Load Single Displacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementZ <em>Displacement Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleDisplacement()
 * @model
 * @generated
 */
public interface IfcStructuralLoadSingleDisplacement extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Displacement X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement X</em>' reference.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #setDisplacementX(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleDisplacement_DisplacementX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getDisplacementX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementX <em>Displacement X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement X</em>' reference.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @generated
	 */
	void setDisplacementX(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementX <em>Displacement X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(IfcLengthMeasure)
	 * @generated
	 */
	void unsetDisplacementX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementX <em>Displacement X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement X</em>' reference is set.
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetDisplacementX();

	/**
	 * Returns the value of the '<em><b>Displacement Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement Y</em>' reference.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #setDisplacementY(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleDisplacement_DisplacementY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getDisplacementY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementY <em>Displacement Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement Y</em>' reference.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @generated
	 */
	void setDisplacementY(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementY <em>Displacement Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(IfcLengthMeasure)
	 * @generated
	 */
	void unsetDisplacementY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementY <em>Displacement Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement Y</em>' reference is set.
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetDisplacementY();

	/**
	 * Returns the value of the '<em><b>Displacement Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displacement Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement Z</em>' reference.
	 * @see #isSetDisplacementZ()
	 * @see #unsetDisplacementZ()
	 * @see #setDisplacementZ(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleDisplacement_DisplacementZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getDisplacementZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementZ <em>Displacement Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement Z</em>' reference.
	 * @see #isSetDisplacementZ()
	 * @see #unsetDisplacementZ()
	 * @see #getDisplacementZ()
	 * @generated
	 */
	void setDisplacementZ(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementZ <em>Displacement Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementZ()
	 * @see #getDisplacementZ()
	 * @see #setDisplacementZ(IfcLengthMeasure)
	 * @generated
	 */
	void unsetDisplacementZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getDisplacementZ <em>Displacement Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement Z</em>' reference is set.
	 * @see #unsetDisplacementZ()
	 * @see #getDisplacementZ()
	 * @see #setDisplacementZ(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetDisplacementZ();

	/**
	 * Returns the value of the '<em><b>Rotational Displacement RX</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Displacement RX</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Displacement RX</em>' reference.
	 * @see #isSetRotationalDisplacementRX()
	 * @see #unsetRotationalDisplacementRX()
	 * @see #setRotationalDisplacementRX(IfcPlaneAngleMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlaneAngleMeasure getRotationalDisplacementRX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Displacement RX</em>' reference.
	 * @see #isSetRotationalDisplacementRX()
	 * @see #unsetRotationalDisplacementRX()
	 * @see #getRotationalDisplacementRX()
	 * @generated
	 */
	void setRotationalDisplacementRX(IfcPlaneAngleMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalDisplacementRX()
	 * @see #getRotationalDisplacementRX()
	 * @see #setRotationalDisplacementRX(IfcPlaneAngleMeasure)
	 * @generated
	 */
	void unsetRotationalDisplacementRX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Displacement RX</em>' reference is set.
	 * @see #unsetRotationalDisplacementRX()
	 * @see #getRotationalDisplacementRX()
	 * @see #setRotationalDisplacementRX(IfcPlaneAngleMeasure)
	 * @generated
	 */
	boolean isSetRotationalDisplacementRX();

	/**
	 * Returns the value of the '<em><b>Rotational Displacement RY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Displacement RY</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Displacement RY</em>' reference.
	 * @see #isSetRotationalDisplacementRY()
	 * @see #unsetRotationalDisplacementRY()
	 * @see #setRotationalDisplacementRY(IfcPlaneAngleMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlaneAngleMeasure getRotationalDisplacementRY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Displacement RY</em>' reference.
	 * @see #isSetRotationalDisplacementRY()
	 * @see #unsetRotationalDisplacementRY()
	 * @see #getRotationalDisplacementRY()
	 * @generated
	 */
	void setRotationalDisplacementRY(IfcPlaneAngleMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalDisplacementRY()
	 * @see #getRotationalDisplacementRY()
	 * @see #setRotationalDisplacementRY(IfcPlaneAngleMeasure)
	 * @generated
	 */
	void unsetRotationalDisplacementRY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Displacement RY</em>' reference is set.
	 * @see #unsetRotationalDisplacementRY()
	 * @see #getRotationalDisplacementRY()
	 * @see #setRotationalDisplacementRY(IfcPlaneAngleMeasure)
	 * @generated
	 */
	boolean isSetRotationalDisplacementRY();

	/**
	 * Returns the value of the '<em><b>Rotational Displacement RZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotational Displacement RZ</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotational Displacement RZ</em>' reference.
	 * @see #isSetRotationalDisplacementRZ()
	 * @see #unsetRotationalDisplacementRZ()
	 * @see #setRotationalDisplacementRZ(IfcPlaneAngleMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlaneAngleMeasure getRotationalDisplacementRZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotational Displacement RZ</em>' reference.
	 * @see #isSetRotationalDisplacementRZ()
	 * @see #unsetRotationalDisplacementRZ()
	 * @see #getRotationalDisplacementRZ()
	 * @generated
	 */
	void setRotationalDisplacementRZ(IfcPlaneAngleMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotationalDisplacementRZ()
	 * @see #getRotationalDisplacementRZ()
	 * @see #setRotationalDisplacementRZ(IfcPlaneAngleMeasure)
	 * @generated
	 */
	void unsetRotationalDisplacementRZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotational Displacement RZ</em>' reference is set.
	 * @see #unsetRotationalDisplacementRZ()
	 * @see #getRotationalDisplacementRZ()
	 * @see #setRotationalDisplacementRZ(IfcPlaneAngleMeasure)
	 * @generated
	 */
	boolean isSetRotationalDisplacementRZ();

} // IfcStructuralLoadSingleDisplacement
