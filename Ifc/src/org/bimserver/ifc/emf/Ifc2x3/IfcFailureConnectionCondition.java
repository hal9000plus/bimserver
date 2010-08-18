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
 * A representation of the model object '<em><b>Ifc Failure Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition()
 * @model
 * @generated
 */
public interface IfcFailureConnectionCondition extends IfcStructuralConnectionCondition {
	/**
	 * Returns the value of the '<em><b>Tension Failure X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure X</em>' reference.
	 * @see #isSetTensionFailureX()
	 * @see #unsetTensionFailureX()
	 * @see #setTensionFailureX(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getTensionFailureX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure X</em>' reference.
	 * @see #isSetTensionFailureX()
	 * @see #unsetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @generated
	 */
	void setTensionFailureX(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @see #setTensionFailureX(IfcForceMeasure)
	 * @generated
	 */
	void unsetTensionFailureX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure X</em>' reference is set.
	 * @see #unsetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @see #setTensionFailureX(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetTensionFailureX();

	/**
	 * Returns the value of the '<em><b>Tension Failure Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure Y</em>' reference.
	 * @see #isSetTensionFailureY()
	 * @see #unsetTensionFailureY()
	 * @see #setTensionFailureY(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getTensionFailureY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure Y</em>' reference.
	 * @see #isSetTensionFailureY()
	 * @see #unsetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @generated
	 */
	void setTensionFailureY(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @see #setTensionFailureY(IfcForceMeasure)
	 * @generated
	 */
	void unsetTensionFailureY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure Y</em>' reference is set.
	 * @see #unsetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @see #setTensionFailureY(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetTensionFailureY();

	/**
	 * Returns the value of the '<em><b>Tension Failure Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure Z</em>' reference.
	 * @see #isSetTensionFailureZ()
	 * @see #unsetTensionFailureZ()
	 * @see #setTensionFailureZ(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getTensionFailureZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure Z</em>' reference.
	 * @see #isSetTensionFailureZ()
	 * @see #unsetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @generated
	 */
	void setTensionFailureZ(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @see #setTensionFailureZ(IfcForceMeasure)
	 * @generated
	 */
	void unsetTensionFailureZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure Z</em>' reference is set.
	 * @see #unsetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @see #setTensionFailureZ(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetTensionFailureZ();

	/**
	 * Returns the value of the '<em><b>Compression Failure X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure X</em>' reference.
	 * @see #isSetCompressionFailureX()
	 * @see #unsetCompressionFailureX()
	 * @see #setCompressionFailureX(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getCompressionFailureX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure X</em>' reference.
	 * @see #isSetCompressionFailureX()
	 * @see #unsetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @generated
	 */
	void setCompressionFailureX(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @see #setCompressionFailureX(IfcForceMeasure)
	 * @generated
	 */
	void unsetCompressionFailureX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure X</em>' reference is set.
	 * @see #unsetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @see #setCompressionFailureX(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetCompressionFailureX();

	/**
	 * Returns the value of the '<em><b>Compression Failure Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure Y</em>' reference.
	 * @see #isSetCompressionFailureY()
	 * @see #unsetCompressionFailureY()
	 * @see #setCompressionFailureY(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getCompressionFailureY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure Y</em>' reference.
	 * @see #isSetCompressionFailureY()
	 * @see #unsetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @generated
	 */
	void setCompressionFailureY(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @see #setCompressionFailureY(IfcForceMeasure)
	 * @generated
	 */
	void unsetCompressionFailureY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure Y</em>' reference is set.
	 * @see #unsetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @see #setCompressionFailureY(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetCompressionFailureY();

	/**
	 * Returns the value of the '<em><b>Compression Failure Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure Z</em>' reference.
	 * @see #isSetCompressionFailureZ()
	 * @see #unsetCompressionFailureZ()
	 * @see #setCompressionFailureZ(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getCompressionFailureZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure Z</em>' reference.
	 * @see #isSetCompressionFailureZ()
	 * @see #unsetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @generated
	 */
	void setCompressionFailureZ(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @see #setCompressionFailureZ(IfcForceMeasure)
	 * @generated
	 */
	void unsetCompressionFailureZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure Z</em>' reference is set.
	 * @see #unsetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @see #setCompressionFailureZ(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetCompressionFailureZ();

} // IfcFailureConnectionCondition
