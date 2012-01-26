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
 * A representation of the model object '<em><b>Ifc Classification Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcClassificationNotation#getNotationFacets <em>Notation Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcClassificationNotation()
 * @model
 * @generated
 */
public interface IfcClassificationNotation extends IfcClassificationNotationSelect {
	/**
	 * Returns the value of the '<em><b>Notation Facets</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcClassificationNotationFacet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation Facets</em>' reference list.
	 * @see #isSetNotationFacets()
	 * @see #unsetNotationFacets()
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcClassificationNotation_NotationFacets()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcClassificationNotationFacet> getNotationFacets();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcClassificationNotation#getNotationFacets <em>Notation Facets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotationFacets()
	 * @see #getNotationFacets()
	 * @generated
	 */
	void unsetNotationFacets();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcClassificationNotation#getNotationFacets <em>Notation Facets</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notation Facets</em>' reference list is set.
	 * @see #unsetNotationFacets()
	 * @see #getNotationFacets()
	 * @generated
	 */
	boolean isSetNotationFacets();

} // IfcClassificationNotation
