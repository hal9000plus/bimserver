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
 * A representation of the model object '<em><b>Ifc Rectangular Trimmed Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getUsense <em>Usense</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getVsense <em>Vsense</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface()
 * @model
 * @generated
 */
public interface IfcRectangularTrimmedSurface extends IfcBoundedSurface {
	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' reference.
	 * @see #setBasisSurface(IfcSurface)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_BasisSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getBasisSurface();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getBasisSurface <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>U1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U1</em>' reference.
	 * @see #setU1(IfcParameterValue)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_U1()
	 * @model
	 * @generated
	 */
	IfcParameterValue getU1();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U1</em>' reference.
	 * @see #getU1()
	 * @generated
	 */
	void setU1(IfcParameterValue value);

	/**
	 * Returns the value of the '<em><b>V1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1</em>' reference.
	 * @see #setV1(IfcParameterValue)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_V1()
	 * @model
	 * @generated
	 */
	IfcParameterValue getV1();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V1</em>' reference.
	 * @see #getV1()
	 * @generated
	 */
	void setV1(IfcParameterValue value);

	/**
	 * Returns the value of the '<em><b>U2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U2</em>' reference.
	 * @see #setU2(IfcParameterValue)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_U2()
	 * @model
	 * @generated
	 */
	IfcParameterValue getU2();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U2</em>' reference.
	 * @see #getU2()
	 * @generated
	 */
	void setU2(IfcParameterValue value);

	/**
	 * Returns the value of the '<em><b>V2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V2</em>' reference.
	 * @see #setV2(IfcParameterValue)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_V2()
	 * @model
	 * @generated
	 */
	IfcParameterValue getV2();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V2</em>' reference.
	 * @see #getV2()
	 * @generated
	 */
	void setV2(IfcParameterValue value);

	/**
	 * Returns the value of the '<em><b>Usense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usense</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usense</em>' reference.
	 * @see #setUsense(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_Usense()
	 * @model
	 * @generated
	 */
	IfcLogical getUsense();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getUsense <em>Usense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usense</em>' reference.
	 * @see #getUsense()
	 * @generated
	 */
	void setUsense(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Vsense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vsense</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vsense</em>' reference.
	 * @see #setVsense(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_Vsense()
	 * @model
	 * @generated
	 */
	IfcLogical getVsense();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getVsense <em>Vsense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vsense</em>' reference.
	 * @see #getVsense()
	 * @generated
	 */
	void setVsense(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' reference.
	 * @see #setDim(IfcDimensionCount)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_Dim()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.iso.org/iso10303-11/EXPRESS code=' BasisSurface.Dim;'"
	 * @generated
	 */
	IfcDimensionCount getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface#getDim <em>Dim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' reference.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(IfcDimensionCount value);

} // IfcRectangularTrimmedSurface
