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
package org.bimserver.ifc.emf.Ifc2x3.impl;

import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcInteger;
import org.bimserver.ifc.emf.Ifc2x3.IfcPixelTexture;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Pixel Texture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPixelTextureImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPixelTextureImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPixelTextureImpl#getColourComponents <em>Colour Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPixelTextureImpl extends IfcSurfaceTextureImpl implements IfcPixelTexture {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPixelTextureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcPixelTexture();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getWidth() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcPixelTexture_Width(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(IfcInteger newWidth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcPixelTexture_Width(), newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getHeight() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcPixelTexture_Height(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(IfcInteger newHeight) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcPixelTexture_Height(), newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getColourComponents() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcPixelTexture_ColourComponents(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourComponents(IfcInteger newColourComponents) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcPixelTexture_ColourComponents(), newColourComponents);
	}

} //IfcPixelTextureImpl