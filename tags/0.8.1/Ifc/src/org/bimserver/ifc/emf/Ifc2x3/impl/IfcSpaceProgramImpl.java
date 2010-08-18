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
import org.bimserver.ifc.emf.Ifc2x3.IfcIdentifier;
import org.bimserver.ifc.emf.Ifc2x3.IfcRelInteractionRequirements;
import org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram;
import org.bimserver.ifc.emf.Ifc2x3.IfcSpatialStructureElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceProgramImpl#getSpaceProgramIdentifier <em>Space Program Identifier</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceProgramImpl#getMaxRequiredArea <em>Max Required Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceProgramImpl#getMinRequiredArea <em>Min Required Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceProgramImpl#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceProgramImpl#getStandardRequiredArea <em>Standard Required Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceProgramImpl#getHasInteractionReqsFrom <em>Has Interaction Reqs From</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSpaceProgramImpl#getHasInteractionReqsTo <em>Has Interaction Reqs To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSpaceProgramImpl extends IfcControlImpl implements IfcSpaceProgram {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcSpaceProgram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIdentifier getSpaceProgramIdentifier() {
		return (IfcIdentifier) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_SpaceProgramIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceProgramIdentifier(IfcIdentifier newSpaceProgramIdentifier) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_SpaceProgramIdentifier(), newSpaceProgramIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasure getMaxRequiredArea() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequiredArea(IfcAreaMeasure newMaxRequiredArea) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea(), newMaxRequiredArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxRequiredArea() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxRequiredArea() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_MaxRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasure getMinRequiredArea() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRequiredArea(IfcAreaMeasure newMinRequiredArea) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea(), newMinRequiredArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinRequiredArea() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinRequiredArea() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_MinRequiredArea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getRequestedLocation() {
		return (IfcSpatialStructureElement) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_RequestedLocation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestedLocation(IfcSpatialStructureElement newRequestedLocation) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_RequestedLocation(), newRequestedLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestedLocation() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_RequestedLocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestedLocation() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_RequestedLocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasure getStandardRequiredArea() {
		return (IfcAreaMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_StandardRequiredArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRequiredArea(IfcAreaMeasure newStandardRequiredArea) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_StandardRequiredArea(), newStandardRequiredArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelInteractionRequirements> getHasInteractionReqsFrom() {
		return (EList<IfcRelInteractionRequirements>) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_HasInteractionReqsFrom(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelInteractionRequirements> getHasInteractionReqsTo() {
		return (EList<IfcRelInteractionRequirements>) eGet(Ifc2x3Package.eINSTANCE.getIfcSpaceProgram_HasInteractionReqsTo(), true);
	}

} //IfcSpaceProgramImpl
