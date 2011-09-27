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

import org.bimserver.ifc.IfcRootObject;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcLabel;
import org.bimserver.ifc.emf.Ifc2x3.IfcLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcMaterialLayer;
import org.bimserver.ifc.emf.Ifc2x3.IfcMaterialLayerSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Material Layer Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMaterialLayerSetImpl#getMaterialLayers <em>Material Layers</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMaterialLayerSetImpl#getLayerSetName <em>Layer Set Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMaterialLayerSetImpl#getTotalThickness <em>Total Thickness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMaterialLayerSetImpl extends IfcRootObject implements IfcMaterialLayerSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMaterialLayerSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcMaterialLayerSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcMaterialLayer> getMaterialLayers() {
		return (EList<IfcMaterialLayer>) eGet(Ifc2x3Package.eINSTANCE.getIfcMaterialLayerSet_MaterialLayers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabel getLayerSetName() {
		return (IfcLabel) eGet(Ifc2x3Package.eINSTANCE.getIfcMaterialLayerSet_LayerSetName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayerSetName(IfcLabel newLayerSetName) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcMaterialLayerSet_LayerSetName(), newLayerSetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLayerSetName() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcMaterialLayerSet_LayerSetName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLayerSetName() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcMaterialLayerSet_LayerSetName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getTotalThickness() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcMaterialLayerSet_TotalThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalThickness(IfcLengthMeasure newTotalThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcMaterialLayerSet_TotalThickness(), newTotalThickness);
	}

} //IfcMaterialLayerSetImpl