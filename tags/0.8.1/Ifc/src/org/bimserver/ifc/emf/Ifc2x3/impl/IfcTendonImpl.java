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
import org.bimserver.ifc.emf.Ifc2x3.IfcAreaMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcForceMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcNormalisedRatioMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPressureMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcTendon;
import org.bimserver.ifc.emf.Ifc2x3.IfcTendonTypeEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Tendon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTendonImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTendonImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTendonImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTendonImpl#getTensionForce <em>Tension Force</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTendonImpl#getPreStress <em>Pre Stress</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTendonImpl#getFrictionCoefficient <em>Friction Coefficient</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTendonImpl#getAnchorageSlip <em>Anchorage Slip</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTendonImpl#getMinCurvatureRadius <em>Min Curvature Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTendonImpl extends IfcReinforcingElementImpl implements IfcTendon {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTendonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcTendon();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonTypeEnum getPredefinedType() {
		return (IfcTendonTypeEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcTendon_PredefinedType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcTendonTypeEnum newPredefinedType) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTendon_PredefinedType(), newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getNominalDiameter() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTendon_NominalDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(IfcPositiveLengthMeasure newNominalDiameter) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTendon_NominalDiameter(), newNominalDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasure getCrossSectionArea() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTendon_CrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionArea(IfcAreaMeasure newCrossSectionArea) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTendon_CrossSectionArea(), newCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getTensionForce() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTendon_TensionForce(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionForce(IfcForceMeasure newTensionForce) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTendon_TensionForce(), newTensionForce);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionForce() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTendon_TensionForce());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionForce() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTendon_TensionForce());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPressureMeasure getPreStress() {
		return (IfcPressureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTendon_PreStress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreStress(IfcPressureMeasure newPreStress) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTendon_PreStress(), newPreStress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreStress() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTendon_PreStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreStress() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTendon_PreStress());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasure getFrictionCoefficient() {
		return (IfcNormalisedRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTendon_FrictionCoefficient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrictionCoefficient(IfcNormalisedRatioMeasure newFrictionCoefficient) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTendon_FrictionCoefficient(), newFrictionCoefficient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrictionCoefficient() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTendon_FrictionCoefficient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrictionCoefficient() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTendon_FrictionCoefficient());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getAnchorageSlip() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTendon_AnchorageSlip(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorageSlip(IfcPositiveLengthMeasure newAnchorageSlip) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTendon_AnchorageSlip(), newAnchorageSlip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnchorageSlip() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTendon_AnchorageSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnchorageSlip() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTendon_AnchorageSlip());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getMinCurvatureRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTendon_MinCurvatureRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCurvatureRadius(IfcPositiveLengthMeasure newMinCurvatureRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTendon_MinCurvatureRadius(), newMinCurvatureRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinCurvatureRadius() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcTendon_MinCurvatureRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinCurvatureRadius() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcTendon_MinCurvatureRadius());
	}

} //IfcTendonImpl
