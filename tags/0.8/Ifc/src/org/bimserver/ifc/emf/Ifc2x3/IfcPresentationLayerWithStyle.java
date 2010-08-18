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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Presentation Layer With Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPresentationLayerWithStyle#getLayerOn <em>Layer On</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPresentationLayerWithStyle#getLayerFrozen <em>Layer Frozen</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPresentationLayerWithStyle#getLayerBlocked <em>Layer Blocked</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcPresentationLayerWithStyle#getLayerStyles <em>Layer Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPresentationLayerWithStyle()
 * @model
 * @generated
 */
public interface IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment {
	/**
	 * Returns the value of the '<em><b>Layer On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer On</em>' reference.
	 * @see #setLayerOn(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPresentationLayerWithStyle_LayerOn()
	 * @model
	 * @generated
	 */
	IfcLogical getLayerOn();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPresentationLayerWithStyle#getLayerOn <em>Layer On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer On</em>' reference.
	 * @see #getLayerOn()
	 * @generated
	 */
	void setLayerOn(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Layer Frozen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Frozen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Frozen</em>' reference.
	 * @see #setLayerFrozen(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPresentationLayerWithStyle_LayerFrozen()
	 * @model
	 * @generated
	 */
	IfcLogical getLayerFrozen();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPresentationLayerWithStyle#getLayerFrozen <em>Layer Frozen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Frozen</em>' reference.
	 * @see #getLayerFrozen()
	 * @generated
	 */
	void setLayerFrozen(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Layer Blocked</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Blocked</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Blocked</em>' reference.
	 * @see #setLayerBlocked(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPresentationLayerWithStyle_LayerBlocked()
	 * @model
	 * @generated
	 */
	IfcLogical getLayerBlocked();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcPresentationLayerWithStyle#getLayerBlocked <em>Layer Blocked</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Blocked</em>' reference.
	 * @see #getLayerBlocked()
	 * @generated
	 */
	void setLayerBlocked(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Layer Styles</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcPresentationStyleSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Styles</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcPresentationLayerWithStyle_LayerStyles()
	 * @model
	 * @generated
	 */
	EList<IfcPresentationStyleSelect> getLayerStyles();

} // IfcPresentationLayerWithStyle
