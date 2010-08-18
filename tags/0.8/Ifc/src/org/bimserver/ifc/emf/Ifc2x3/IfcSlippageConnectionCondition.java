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
 * A representation of the model object '<em><b>Ifc Slippage Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageX <em>Slippage X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageY <em>Slippage Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageZ <em>Slippage Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSlippageConnectionCondition()
 * @model
 * @generated
 */
public interface IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition {
	/**
	 * Returns the value of the '<em><b>Slippage X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slippage X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slippage X</em>' reference.
	 * @see #isSetSlippageX()
	 * @see #unsetSlippageX()
	 * @see #setSlippageX(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSlippageConnectionCondition_SlippageX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getSlippageX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageX <em>Slippage X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slippage X</em>' reference.
	 * @see #isSetSlippageX()
	 * @see #unsetSlippageX()
	 * @see #getSlippageX()
	 * @generated
	 */
	void setSlippageX(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageX <em>Slippage X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlippageX()
	 * @see #getSlippageX()
	 * @see #setSlippageX(IfcLengthMeasure)
	 * @generated
	 */
	void unsetSlippageX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageX <em>Slippage X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slippage X</em>' reference is set.
	 * @see #unsetSlippageX()
	 * @see #getSlippageX()
	 * @see #setSlippageX(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetSlippageX();

	/**
	 * Returns the value of the '<em><b>Slippage Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slippage Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slippage Y</em>' reference.
	 * @see #isSetSlippageY()
	 * @see #unsetSlippageY()
	 * @see #setSlippageY(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSlippageConnectionCondition_SlippageY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getSlippageY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageY <em>Slippage Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slippage Y</em>' reference.
	 * @see #isSetSlippageY()
	 * @see #unsetSlippageY()
	 * @see #getSlippageY()
	 * @generated
	 */
	void setSlippageY(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageY <em>Slippage Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlippageY()
	 * @see #getSlippageY()
	 * @see #setSlippageY(IfcLengthMeasure)
	 * @generated
	 */
	void unsetSlippageY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageY <em>Slippage Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slippage Y</em>' reference is set.
	 * @see #unsetSlippageY()
	 * @see #getSlippageY()
	 * @see #setSlippageY(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetSlippageY();

	/**
	 * Returns the value of the '<em><b>Slippage Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slippage Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slippage Z</em>' reference.
	 * @see #isSetSlippageZ()
	 * @see #unsetSlippageZ()
	 * @see #setSlippageZ(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSlippageConnectionCondition_SlippageZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getSlippageZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageZ <em>Slippage Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slippage Z</em>' reference.
	 * @see #isSetSlippageZ()
	 * @see #unsetSlippageZ()
	 * @see #getSlippageZ()
	 * @generated
	 */
	void setSlippageZ(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageZ <em>Slippage Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSlippageZ()
	 * @see #getSlippageZ()
	 * @see #setSlippageZ(IfcLengthMeasure)
	 * @generated
	 */
	void unsetSlippageZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSlippageConnectionCondition#getSlippageZ <em>Slippage Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Slippage Z</em>' reference is set.
	 * @see #unsetSlippageZ()
	 * @see #getSlippageZ()
	 * @see #setSlippageZ(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetSlippageZ();

} // IfcSlippageConnectionCondition
