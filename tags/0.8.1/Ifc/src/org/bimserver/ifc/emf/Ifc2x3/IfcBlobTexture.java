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
 * A representation of the model object '<em><b>Ifc Blob Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBlobTexture#getRasterFormat <em>Raster Format</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBlobTexture#getRasterCode <em>Raster Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBlobTexture()
 * @model
 * @generated
 */
public interface IfcBlobTexture extends IfcSurfaceTexture {
	/**
	 * Returns the value of the '<em><b>Raster Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raster Format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raster Format</em>' reference.
	 * @see #setRasterFormat(IfcIdentifier)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBlobTexture_RasterFormat()
	 * @model
	 * @generated
	 */
	IfcIdentifier getRasterFormat();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBlobTexture#getRasterFormat <em>Raster Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raster Format</em>' reference.
	 * @see #getRasterFormat()
	 * @generated
	 */
	void setRasterFormat(IfcIdentifier value);

	/**
	 * Returns the value of the '<em><b>Raster Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raster Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raster Code</em>' reference.
	 * @see #setRasterCode(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBlobTexture_RasterCode()
	 * @model
	 * @generated
	 */
	IfcLogical getRasterCode();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBlobTexture#getRasterCode <em>Raster Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raster Code</em>' reference.
	 * @see #getRasterCode()
	 * @generated
	 */
	void setRasterCode(IfcLogical value);

} // IfcBlobTexture
