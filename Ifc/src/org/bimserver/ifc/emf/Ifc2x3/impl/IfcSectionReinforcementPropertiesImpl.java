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
import org.bimserver.ifc.emf.Ifc2x3.IfcLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingBarRoleEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcSectionProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcSectionReinforcementProperties;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Section Reinforcement Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalEndPosition <em>Longitudinal End Position</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSectionReinforcementPropertiesImpl#getTransversePosition <em>Transverse Position</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSectionReinforcementPropertiesImpl#getReinforcementRole <em>Reinforcement Role</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSectionReinforcementPropertiesImpl#getSectionDefinition <em>Section Definition</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSectionReinforcementPropertiesImpl#getCrossSectionReinforcementDefinitions <em>Cross Section Reinforcement Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSectionReinforcementPropertiesImpl extends EObjectImpl implements IfcSectionReinforcementProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionReinforcementPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties();
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
	public IfcLengthMeasure getLongitudinalStartPosition() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalStartPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalStartPosition(IfcLengthMeasure newLongitudinalStartPosition) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalStartPosition(), newLongitudinalStartPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getLongitudinalEndPosition() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalEndPosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalEndPosition(IfcLengthMeasure newLongitudinalEndPosition) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_LongitudinalEndPosition(), newLongitudinalEndPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getTransversePosition() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransversePosition(IfcLengthMeasure newTransversePosition) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition(), newTransversePosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransversePosition() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransversePosition() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_TransversePosition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum getReinforcementRole() {
		return (IfcReinforcingBarRoleEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_ReinforcementRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReinforcementRole(IfcReinforcingBarRoleEnum newReinforcementRole) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_ReinforcementRole(), newReinforcementRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionProperties getSectionDefinition() {
		return (IfcSectionProperties) eGet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_SectionDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionDefinition(IfcSectionProperties newSectionDefinition) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_SectionDefinition(), newSectionDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
		return (EList<IfcReinforcementBarProperties>) eGet(Ifc2x3Package.eINSTANCE.getIfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions(),
				true);
	}

} //IfcSectionReinforcementPropertiesImpl
