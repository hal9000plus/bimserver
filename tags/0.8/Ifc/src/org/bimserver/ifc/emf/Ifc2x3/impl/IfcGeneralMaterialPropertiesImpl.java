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
import org.bimserver.ifc.emf.Ifc2x3.IfcGeneralMaterialProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcMassDensityMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcMolecularWeightMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcNormalisedRatioMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcGeneralMaterialPropertiesImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcGeneralMaterialPropertiesImpl#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcGeneralMaterialPropertiesImpl#getMassDensity <em>Mass Density</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeneralMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcGeneralMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeneralMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMolecularWeightMeasure getMolecularWeight() {
		return (IfcMolecularWeightMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularWeight(IfcMolecularWeightMeasure newMolecularWeight) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight(), newMolecularWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMolecularWeight() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMolecularWeight() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_MolecularWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasure getPorosity() {
		return (IfcNormalisedRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorosity(IfcNormalisedRatioMeasure newPorosity) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity(), newPorosity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPorosity() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPorosity() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_Porosity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassDensityMeasure getMassDensity() {
		return (IfcMassDensityMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassDensity(IfcMassDensityMeasure newMassDensity) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity(), newMassDensity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMassDensity() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMassDensity() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcGeneralMaterialProperties_MassDensity());
	}

} //IfcGeneralMaterialPropertiesImpl
