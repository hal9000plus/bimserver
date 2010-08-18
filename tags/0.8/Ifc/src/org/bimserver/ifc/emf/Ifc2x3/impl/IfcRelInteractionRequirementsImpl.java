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
import org.bimserver.ifc.emf.Ifc2x3.IfcCountMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcNormalisedRatioMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcRelInteractionRequirements;
import org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram;
import org.bimserver.ifc.emf.Ifc2x3.IfcSpatialStructureElement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelInteractionRequirementsImpl#getDailyInteraction <em>Daily Interaction</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelInteractionRequirementsImpl#getImportanceRating <em>Importance Rating</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelInteractionRequirementsImpl#getLocationOfInteraction <em>Location Of Interaction</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelInteractionRequirementsImpl#getRelatedSpaceProgram <em>Related Space Program</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelInteractionRequirementsImpl#getRelatingSpaceProgram <em>Relating Space Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelInteractionRequirementsImpl extends IfcRelConnectsImpl implements IfcRelInteractionRequirements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelInteractionRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCountMeasure getDailyInteraction() {
		return (IfcCountMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDailyInteraction(IfcCountMeasure newDailyInteraction) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction(), newDailyInteraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDailyInteraction() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDailyInteraction() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_DailyInteraction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasure getImportanceRating() {
		return (IfcNormalisedRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportanceRating(IfcNormalisedRatioMeasure newImportanceRating) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating(), newImportanceRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImportanceRating() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportanceRating() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_ImportanceRating());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getLocationOfInteraction() {
		return (IfcSpatialStructureElement) eGet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_LocationOfInteraction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationOfInteraction(IfcSpatialStructureElement newLocationOfInteraction) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_LocationOfInteraction(), newLocationOfInteraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocationOfInteraction() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_LocationOfInteraction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocationOfInteraction() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_LocationOfInteraction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram getRelatedSpaceProgram() {
		return (IfcSpaceProgram) eGet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_RelatedSpaceProgram(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSpaceProgram(IfcSpaceProgram newRelatedSpaceProgram) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_RelatedSpaceProgram(), newRelatedSpaceProgram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram getRelatingSpaceProgram() {
		return (IfcSpaceProgram) eGet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_RelatingSpaceProgram(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSpaceProgram(IfcSpaceProgram newRelatingSpaceProgram) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelInteractionRequirements_RelatingSpaceProgram(), newRelatingSpaceProgram);
	}

} //IfcRelInteractionRequirementsImpl
