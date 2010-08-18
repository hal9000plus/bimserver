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
import org.bimserver.ifc.emf.Ifc2x3.IfcCountMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcLabel;
import org.bimserver.ifc.emf.Ifc2x3.IfcLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingBarSurfaceEnum;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcement Bar Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcementBarPropertiesImpl#getTotalCrossSectionArea <em>Total Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcementBarPropertiesImpl#getSteelGrade <em>Steel Grade</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcementBarPropertiesImpl#getBarSurface <em>Bar Surface</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcementBarPropertiesImpl#getEffectiveDepth <em>Effective Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcementBarPropertiesImpl#getNominalBarDiameter <em>Nominal Bar Diameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcReinforcementBarPropertiesImpl#getBarCount <em>Bar Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcementBarPropertiesImpl extends EObjectImpl implements IfcReinforcementBarProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcementBarPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties();
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
	public IfcAreaMeasure getTotalCrossSectionArea() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_TotalCrossSectionArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCrossSectionArea(IfcAreaMeasure newTotalCrossSectionArea) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_TotalCrossSectionArea(), newTotalCrossSectionArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabel getSteelGrade() {
		return (IfcLabel) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_SteelGrade(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteelGrade(IfcLabel newSteelGrade) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_SteelGrade(), newSteelGrade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return (IfcReinforcingBarSurfaceEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_BarSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarSurface(IfcReinforcingBarSurfaceEnum newBarSurface) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_BarSurface(), newBarSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getEffectiveDepth() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDepth(IfcLengthMeasure newEffectiveDepth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth(), newEffectiveDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffectiveDepth() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffectiveDepth() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_EffectiveDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getNominalBarDiameter() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalBarDiameter(IfcPositiveLengthMeasure newNominalBarDiameter) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter(), newNominalBarDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalBarDiameter() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalBarDiameter() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_NominalBarDiameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCountMeasure getBarCount() {
		return (IfcCountMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarCount(IfcCountMeasure newBarCount) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount(), newBarCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarCount() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarCount() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcReinforcementBarProperties_BarCount());
	}

} //IfcReinforcementBarPropertiesImpl
