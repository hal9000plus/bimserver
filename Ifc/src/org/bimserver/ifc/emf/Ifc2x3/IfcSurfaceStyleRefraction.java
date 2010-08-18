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
 * A representation of the model object '<em><b>Ifc Surface Style Refraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSurfaceStyleRefraction()
 * @model
 * @generated
 */
public interface IfcSurfaceStyleRefraction extends IfcSurfaceStyleElementSelect {
	/**
	 * Returns the value of the '<em><b>Refraction Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refraction Index</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refraction Index</em>' reference.
	 * @see #isSetRefractionIndex()
	 * @see #unsetRefractionIndex()
	 * @see #setRefractionIndex(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSurfaceStyleRefraction_RefractionIndex()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcReal getRefractionIndex();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refraction Index</em>' reference.
	 * @see #isSetRefractionIndex()
	 * @see #unsetRefractionIndex()
	 * @see #getRefractionIndex()
	 * @generated
	 */
	void setRefractionIndex(IfcReal value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefractionIndex()
	 * @see #getRefractionIndex()
	 * @see #setRefractionIndex(IfcReal)
	 * @generated
	 */
	void unsetRefractionIndex();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSurfaceStyleRefraction#getRefractionIndex <em>Refraction Index</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refraction Index</em>' reference is set.
	 * @see #unsetRefractionIndex()
	 * @see #getRefractionIndex()
	 * @see #setRefractionIndex(IfcReal)
	 * @generated
	 */
	boolean isSetRefractionIndex();

	/**
	 * Returns the value of the '<em><b>Dispersion Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispersion Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispersion Factor</em>' reference.
	 * @see #isSetDispersionFactor()
	 * @see #unsetDispersionFactor()
	 * @see #setDispersionFactor(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSurfaceStyleRefraction_DispersionFactor()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcReal getDispersionFactor();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispersion Factor</em>' reference.
	 * @see #isSetDispersionFactor()
	 * @see #unsetDispersionFactor()
	 * @see #getDispersionFactor()
	 * @generated
	 */
	void setDispersionFactor(IfcReal value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDispersionFactor()
	 * @see #getDispersionFactor()
	 * @see #setDispersionFactor(IfcReal)
	 * @generated
	 */
	void unsetDispersionFactor();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSurfaceStyleRefraction#getDispersionFactor <em>Dispersion Factor</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dispersion Factor</em>' reference is set.
	 * @see #unsetDispersionFactor()
	 * @see #getDispersionFactor()
	 * @see #setDispersionFactor(IfcReal)
	 * @generated
	 */
	boolean isSetDispersionFactor();

} // IfcSurfaceStyleRefraction
