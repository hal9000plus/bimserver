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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSymbolStyle()
 * @model
 * @generated
 */
public interface IfcSymbolStyle extends IfcPresentationStyle, IfcPresentationStyleSelect {
	/**
	 * Returns the value of the '<em><b>Style Of Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Of Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Of Symbol</em>' reference.
	 * @see #isSetStyleOfSymbol()
	 * @see #unsetStyleOfSymbol()
	 * @see #setStyleOfSymbol(IfcSymbolStyleSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSymbolStyle_StyleOfSymbol()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSymbolStyleSelect getStyleOfSymbol();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Of Symbol</em>' reference.
	 * @see #isSetStyleOfSymbol()
	 * @see #unsetStyleOfSymbol()
	 * @see #getStyleOfSymbol()
	 * @generated
	 */
	void setStyleOfSymbol(IfcSymbolStyleSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyleOfSymbol()
	 * @see #getStyleOfSymbol()
	 * @see #setStyleOfSymbol(IfcSymbolStyleSelect)
	 * @generated
	 */
	void unsetStyleOfSymbol();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style Of Symbol</em>' reference is set.
	 * @see #unsetStyleOfSymbol()
	 * @see #getStyleOfSymbol()
	 * @see #setStyleOfSymbol(IfcSymbolStyleSelect)
	 * @generated
	 */
	boolean isSetStyleOfSymbol();

} // IfcSymbolStyle
