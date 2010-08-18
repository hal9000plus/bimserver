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
import org.bimserver.ifc.emf.Ifc2x3.IfcIonConcentrationMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcLogical;
import org.bimserver.ifc.emf.Ifc2x3.IfcNormalisedRatioMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPHMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcWaterPropertiesImpl#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcWaterPropertiesImpl#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcWaterPropertiesImpl#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcWaterPropertiesImpl#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcWaterPropertiesImpl#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcWaterPropertiesImpl#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcWaterPropertiesImpl#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWaterPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcWaterProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWaterPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcWaterProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogical getIsPotable() {
		return (IfcLogical) eGet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_IsPotable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPotable(IfcLogical newIsPotable) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_IsPotable(), newIsPotable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIonConcentrationMeasure getHardness() {
		return (IfcIonConcentrationMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_Hardness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardness(IfcIonConcentrationMeasure newHardness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_Hardness(), newHardness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHardness() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_Hardness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHardness() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_Hardness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIonConcentrationMeasure getAlkalinityConcentration() {
		return (IfcIonConcentrationMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlkalinityConcentration(IfcIonConcentrationMeasure newAlkalinityConcentration) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration(), newAlkalinityConcentration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlkalinityConcentration() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlkalinityConcentration() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_AlkalinityConcentration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIonConcentrationMeasure getAcidityConcentration() {
		return (IfcIonConcentrationMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcidityConcentration(IfcIonConcentrationMeasure newAcidityConcentration) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration(), newAcidityConcentration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcidityConcentration() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcidityConcentration() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_AcidityConcentration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasure getImpuritiesContent() {
		return (IfcNormalisedRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpuritiesContent(IfcNormalisedRatioMeasure newImpuritiesContent) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent(), newImpuritiesContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpuritiesContent() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpuritiesContent() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_ImpuritiesContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPHMeasure getPHLevel() {
		return (IfcPHMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_PHLevel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHLevel(IfcPHMeasure newPHLevel) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_PHLevel(), newPHLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPHLevel() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_PHLevel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPHLevel() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_PHLevel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasure getDissolvedSolidsContent() {
		return (IfcNormalisedRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissolvedSolidsContent(IfcNormalisedRatioMeasure newDissolvedSolidsContent) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent(), newDissolvedSolidsContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDissolvedSolidsContent() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDissolvedSolidsContent() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcWaterProperties_DissolvedSolidsContent());
	}

} //IfcWaterPropertiesImpl
