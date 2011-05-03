/**
 *  (c) Copyright bimserver.org 2009
 *  Licensed under GNU GPLv3
 *  http://www.gnu.org/licenses/gpl-3.0.txt
 *  For more information mail to license@bimserver.org
 *  
 *  Bimserver.org is free software: you can redistribute it and/or modify 
 *  it under the terms of the GNU General Public License as published by 
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  Bimserver.org is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License a 
 *  long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;

import org.bimserver.models.ifc2x3.IfcTypeProduct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElementType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElementType()
 * @model
 * @generated
 */
public interface IfcElementType extends IfcTypeProduct
{
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #isSetElementType()
	 * @see #unsetElementType()
	 * @see #setElementType(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElementType_ElementType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getElementType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElementType#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #isSetElementType()
	 * @see #unsetElementType()
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElementType#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementType()
	 * @see #getElementType()
	 * @see #setElementType(String)
	 * @generated
	 */
	void unsetElementType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElementType#getElementType <em>Element Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Element Type</em>' attribute is set.
	 * @see #unsetElementType()
	 * @see #getElementType()
	 * @see #setElementType(String)
	 * @generated
	 */
	boolean isSetElementType();

} // IfcElementType
