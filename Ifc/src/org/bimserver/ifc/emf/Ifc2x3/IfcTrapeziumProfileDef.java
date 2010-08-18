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
 * A representation of the model object '<em><b>Ifc Trapezium Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef#getBottomXDim <em>Bottom XDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef#getTopXDim <em>Top XDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef#getYDim <em>YDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef#getTopXOffset <em>Top XOffset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTrapeziumProfileDef()
 * @model
 * @generated
 */
public interface IfcTrapeziumProfileDef extends IfcParameterizedProfileDef {
	/**
	 * Returns the value of the '<em><b>Bottom XDim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom XDim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom XDim</em>' reference.
	 * @see #setBottomXDim(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTrapeziumProfileDef_BottomXDim()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getBottomXDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef#getBottomXDim <em>Bottom XDim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom XDim</em>' reference.
	 * @see #getBottomXDim()
	 * @generated
	 */
	void setBottomXDim(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Top XDim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top XDim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top XDim</em>' reference.
	 * @see #setTopXDim(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTrapeziumProfileDef_TopXDim()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getTopXDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef#getTopXDim <em>Top XDim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top XDim</em>' reference.
	 * @see #getTopXDim()
	 * @generated
	 */
	void setTopXDim(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>YDim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDim</em>' reference.
	 * @see #setYDim(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTrapeziumProfileDef_YDim()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getYDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef#getYDim <em>YDim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDim</em>' reference.
	 * @see #getYDim()
	 * @generated
	 */
	void setYDim(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Top XOffset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top XOffset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top XOffset</em>' reference.
	 * @see #setTopXOffset(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTrapeziumProfileDef_TopXOffset()
	 * @model
	 * @generated
	 */
	IfcLengthMeasure getTopXOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef#getTopXOffset <em>Top XOffset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top XOffset</em>' reference.
	 * @see #getTopXOffset()
	 * @generated
	 */
	void setTopXOffset(IfcLengthMeasure value);

} // IfcTrapeziumProfileDef
