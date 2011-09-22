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
 * A representation of the model object '<em><b>Ifc Derived Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDerivedProfileDef#getParentProfile <em>Parent Profile</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDerivedProfileDef#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDerivedProfileDef#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDerivedProfileDef()
 * @model
 * @generated
 */
public interface IfcDerivedProfileDef extends IfcProfileDef {
	/**
	 * Returns the value of the '<em><b>Parent Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Profile</em>' reference.
	 * @see #setParentProfile(IfcProfileDef)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDerivedProfileDef_ParentProfile()
	 * @model
	 * @generated
	 */
	IfcProfileDef getParentProfile();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDerivedProfileDef#getParentProfile <em>Parent Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Profile</em>' reference.
	 * @see #getParentProfile()
	 * @generated
	 */
	void setParentProfile(IfcProfileDef value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference.
	 * @see #setOperator(IfcCartesianTransformationOperator2D)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDerivedProfileDef_Operator()
	 * @model
	 * @generated
	 */
	IfcCartesianTransformationOperator2D getOperator();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDerivedProfileDef#getOperator <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IfcCartesianTransformationOperator2D value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #setLabel(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDerivedProfileDef_Label()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getLabel();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDerivedProfileDef#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDerivedProfileDef#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabel()
	 * @see #getLabel()
	 * @see #setLabel(IfcLabel)
	 * @generated
	 */
	void unsetLabel();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDerivedProfileDef#getLabel <em>Label</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label</em>' reference is set.
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @see #setLabel(IfcLabel)
	 * @generated
	 */
	boolean isSetLabel();

} // IfcDerivedProfileDef