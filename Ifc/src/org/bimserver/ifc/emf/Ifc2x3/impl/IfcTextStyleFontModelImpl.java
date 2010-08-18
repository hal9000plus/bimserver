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
import org.bimserver.ifc.emf.Ifc2x3.IfcFontStyle;
import org.bimserver.ifc.emf.Ifc2x3.IfcFontVariant;
import org.bimserver.ifc.emf.Ifc2x3.IfcFontWeight;
import org.bimserver.ifc.emf.Ifc2x3.IfcSizeSelect;
import org.bimserver.ifc.emf.Ifc2x3.IfcTextFontName;
import org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleFontModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Text Style Font Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTextStyleFontModelImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTextStyleFontModelImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTextStyleFontModelImpl#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTextStyleFontModelImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTextStyleFontModelImpl#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTextStyleFontModelImpl extends IfcPreDefinedTextFontImpl implements IfcTextStyleFontModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTextStyleFontModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcTextFontName> getFontFamily() {
		return (EList<IfcTextFontName>) eGet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontFamily(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontFamily() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontFamily());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontFamily() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontFamily());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFontStyle getFontStyle() {
		return (IfcFontStyle) eGet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(IfcFontStyle newFontStyle) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontStyle(), newFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontStyle() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontStyle() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFontVariant getFontVariant() {
		return (IfcFontVariant) eGet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontVariant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontVariant(IfcFontVariant newFontVariant) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontVariant(), newFontVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontVariant() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontVariant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontVariant() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontVariant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFontWeight getFontWeight() {
		return (IfcFontWeight) eGet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontWeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(IfcFontWeight newFontWeight) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontWeight(), newFontWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFontWeight() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFontWeight() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getFontSize() {
		return (IfcSizeSelect) eGet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontSize(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(IfcSizeSelect newFontSize) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTextStyleFontModel_FontSize(), newFontSize);
	}

} //IfcTextStyleFontModelImpl
