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
 * A representation of the model object '<em><b>Ifc Half Space Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcHalfSpaceSolid#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcHalfSpaceSolid#getAgreementFlag <em>Agreement Flag</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcHalfSpaceSolid#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHalfSpaceSolid()
 * @model
 * @generated
 */
public interface IfcHalfSpaceSolid extends IfcGeometricRepresentationItem, IfcBooleanOperand {
	/**
	 * Returns the value of the '<em><b>Base Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Surface</em>' reference.
	 * @see #setBaseSurface(IfcSurface)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHalfSpaceSolid_BaseSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getBaseSurface();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHalfSpaceSolid#getBaseSurface <em>Base Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Surface</em>' reference.
	 * @see #getBaseSurface()
	 * @generated
	 */
	void setBaseSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Agreement Flag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Flag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Flag</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Tristate
	 * @see #setAgreementFlag(Tristate)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHalfSpaceSolid_AgreementFlag()
	 * @model
	 * @generated
	 */
	Tristate getAgreementFlag();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHalfSpaceSolid#getAgreementFlag <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Flag</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Tristate
	 * @see #getAgreementFlag()
	 * @generated
	 */
	void setAgreementFlag(Tristate value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #setDim(int)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcHalfSpaceSolid_Dim()
	 * @model derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcHalfSpaceSolid#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

} // IfcHalfSpaceSolid
