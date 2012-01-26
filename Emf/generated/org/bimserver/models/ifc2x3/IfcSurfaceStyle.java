/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceStyle#getSide <em>Side</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceStyle#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceStyle()
 * @model
 * @generated
 */
public interface IfcSurfaceStyle extends IfcPresentationStyle, IfcPresentationStyleSelect {
	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcSurfaceSide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceSide
	 * @see #isSetSide()
	 * @see #unsetSide()
	 * @see #setSide(IfcSurfaceSide)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceStyle_Side()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSurfaceSide getSide();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyle#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceSide
	 * @see #isSetSide()
	 * @see #unsetSide()
	 * @see #getSide()
	 * @generated
	 */
	void setSide(IfcSurfaceSide value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyle#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSide()
	 * @see #getSide()
	 * @see #setSide(IfcSurfaceSide)
	 * @generated
	 */
	void unsetSide();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyle#getSide <em>Side</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Side</em>' attribute is set.
	 * @see #unsetSide()
	 * @see #getSide()
	 * @see #setSide(IfcSurfaceSide)
	 * @generated
	 */
	boolean isSetSide();

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcSurfaceStyleElementSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' reference list.
	 * @see #isSetStyles()
	 * @see #unsetStyles()
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceStyle_Styles()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcSurfaceStyleElementSelect> getStyles();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyle#getStyles <em>Styles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyles()
	 * @see #getStyles()
	 * @generated
	 */
	void unsetStyles();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyle#getStyles <em>Styles</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Styles</em>' reference list is set.
	 * @see #unsetStyles()
	 * @see #getStyles()
	 * @generated
	 */
	boolean isSetStyles();

} // IfcSurfaceStyle
