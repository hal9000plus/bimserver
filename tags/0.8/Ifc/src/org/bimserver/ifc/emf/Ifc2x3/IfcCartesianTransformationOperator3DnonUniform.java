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
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator3 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform#getScale2 <em>Scale2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform#getScale3 <em>Scale3</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform#getScl2 <em>Scl2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform#getScl3 <em>Scl3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator3DnonUniform()
 * @model
 * @generated
 */
public interface IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D {
	/**
	 * Returns the value of the '<em><b>Scale2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale2</em>' reference.
	 * @see #setScale2(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator3DnonUniform_Scale2()
	 * @model
	 * @generated
	 */
	IfcReal getScale2();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform#getScale2 <em>Scale2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale2</em>' reference.
	 * @see #getScale2()
	 * @generated
	 */
	void setScale2(IfcReal value);

	/**
	 * Returns the value of the '<em><b>Scale3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale3</em>' reference.
	 * @see #setScale3(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator3DnonUniform_Scale3()
	 * @model
	 * @generated
	 */
	IfcReal getScale3();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform#getScale3 <em>Scale3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale3</em>' reference.
	 * @see #getScale3()
	 * @generated
	 */
	void setScale3(IfcReal value);

	/**
	 * Returns the value of the '<em><b>Scl2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scl2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scl2</em>' reference.
	 * @see #setScl2(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator3DnonUniform_Scl2()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' NVL(Scale2, SELF\\IfcCartesianTransformationOperator.Scl);'"
	 * @generated
	 */
	IfcReal getScl2();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform#getScl2 <em>Scl2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scl2</em>' reference.
	 * @see #getScl2()
	 * @generated
	 */
	void setScl2(IfcReal value);

	/**
	 * Returns the value of the '<em><b>Scl3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scl3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scl3</em>' reference.
	 * @see #setScl3(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcCartesianTransformationOperator3DnonUniform_Scl3()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' NVL(Scale3, SELF\\IfcCartesianTransformationOperator.Scl);'"
	 * @generated
	 */
	IfcReal getScl3();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform#getScl3 <em>Scl3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scl3</em>' reference.
	 * @see #getScl3()
	 * @generated
	 */
	void setScl3(IfcReal value);

} // IfcCartesianTransformationOperator3DnonUniform