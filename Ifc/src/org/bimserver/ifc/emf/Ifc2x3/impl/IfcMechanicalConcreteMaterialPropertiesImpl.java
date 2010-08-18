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
import org.bimserver.ifc.emf.Ifc2x3.IfcMechanicalConcreteMaterialProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcNormalisedRatioMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPressureMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcText;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Concrete Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getCompressiveStrength <em>Compressive Strength</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getMaxAggregateSize <em>Max Aggregate Size</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getAdmixturesDescription <em>Admixtures Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getWorkability <em>Workability</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getProtectivePoreRatio <em>Protective Pore Ratio</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getWaterImpermeability <em>Water Impermeability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalConcreteMaterialPropertiesImpl extends IfcMechanicalMaterialPropertiesImpl implements IfcMechanicalConcreteMaterialProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalConcreteMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPressureMeasure getCompressiveStrength() {
		return (IfcPressureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressiveStrength(IfcPressureMeasure newCompressiveStrength) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength(), newCompressiveStrength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressiveStrength() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressiveStrength() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_CompressiveStrength());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getMaxAggregateSize() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAggregateSize(IfcPositiveLengthMeasure newMaxAggregateSize) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize(), newMaxAggregateSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxAggregateSize() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxAggregateSize() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcText getAdmixturesDescription() {
		return (IfcText) eGet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmixturesDescription(IfcText newAdmixturesDescription) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription(), newAdmixturesDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdmixturesDescription() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdmixturesDescription() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcText getWorkability() {
		return (IfcText) eGet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkability(IfcText newWorkability) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability(), newWorkability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkability() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkability() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_Workability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasure getProtectivePoreRatio() {
		return (IfcNormalisedRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectivePoreRatio(IfcNormalisedRatioMeasure newProtectivePoreRatio) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio(), newProtectivePoreRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtectivePoreRatio() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtectivePoreRatio() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcText getWaterImpermeability() {
		return (IfcText) eGet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterImpermeability(IfcText newWaterImpermeability) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability(), newWaterImpermeability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWaterImpermeability() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWaterImpermeability() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties_WaterImpermeability());
	}

} //IfcMechanicalConcreteMaterialPropertiesImpl
