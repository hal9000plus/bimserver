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
package org.bimserver.ifc.emf.Ifc2x3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Space Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getSpaceProgramIdentifier <em>Space Program Identifier</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getRequestedLocation <em>Requested Location</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getStandardRequiredArea <em>Standard Required Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getHasInteractionReqsFrom <em>Has Interaction Reqs From</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getHasInteractionReqsTo <em>Has Interaction Reqs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceProgram()
 * @model
 * @generated
 */
public interface IfcSpaceProgram extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Space Program Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Program Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Program Identifier</em>' reference.
	 * @see #setSpaceProgramIdentifier(IfcIdentifier)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceProgram_SpaceProgramIdentifier()
	 * @model
	 * @generated
	 */
	IfcIdentifier getSpaceProgramIdentifier();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getSpaceProgramIdentifier <em>Space Program Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Program Identifier</em>' reference.
	 * @see #getSpaceProgramIdentifier()
	 * @generated
	 */
	void setSpaceProgramIdentifier(IfcIdentifier value);

	/**
	 * Returns the value of the '<em><b>Max Required Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Required Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Required Area</em>' reference.
	 * @see #isSetMaxRequiredArea()
	 * @see #unsetMaxRequiredArea()
	 * @see #setMaxRequiredArea(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceProgram_MaxRequiredArea()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAreaMeasure getMaxRequiredArea();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Required Area</em>' reference.
	 * @see #isSetMaxRequiredArea()
	 * @see #unsetMaxRequiredArea()
	 * @see #getMaxRequiredArea()
	 * @generated
	 */
	void setMaxRequiredArea(IfcAreaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxRequiredArea()
	 * @see #getMaxRequiredArea()
	 * @see #setMaxRequiredArea(IfcAreaMeasure)
	 * @generated
	 */
	void unsetMaxRequiredArea();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getMaxRequiredArea <em>Max Required Area</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Required Area</em>' reference is set.
	 * @see #unsetMaxRequiredArea()
	 * @see #getMaxRequiredArea()
	 * @see #setMaxRequiredArea(IfcAreaMeasure)
	 * @generated
	 */
	boolean isSetMaxRequiredArea();

	/**
	 * Returns the value of the '<em><b>Min Required Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Required Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Required Area</em>' reference.
	 * @see #isSetMinRequiredArea()
	 * @see #unsetMinRequiredArea()
	 * @see #setMinRequiredArea(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceProgram_MinRequiredArea()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAreaMeasure getMinRequiredArea();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Required Area</em>' reference.
	 * @see #isSetMinRequiredArea()
	 * @see #unsetMinRequiredArea()
	 * @see #getMinRequiredArea()
	 * @generated
	 */
	void setMinRequiredArea(IfcAreaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinRequiredArea()
	 * @see #getMinRequiredArea()
	 * @see #setMinRequiredArea(IfcAreaMeasure)
	 * @generated
	 */
	void unsetMinRequiredArea();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getMinRequiredArea <em>Min Required Area</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Required Area</em>' reference is set.
	 * @see #unsetMinRequiredArea()
	 * @see #getMinRequiredArea()
	 * @see #setMinRequiredArea(IfcAreaMeasure)
	 * @generated
	 */
	boolean isSetMinRequiredArea();

	/**
	 * Returns the value of the '<em><b>Requested Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Location</em>' reference.
	 * @see #isSetRequestedLocation()
	 * @see #unsetRequestedLocation()
	 * @see #setRequestedLocation(IfcSpatialStructureElement)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceProgram_RequestedLocation()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSpatialStructureElement getRequestedLocation();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getRequestedLocation <em>Requested Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Location</em>' reference.
	 * @see #isSetRequestedLocation()
	 * @see #unsetRequestedLocation()
	 * @see #getRequestedLocation()
	 * @generated
	 */
	void setRequestedLocation(IfcSpatialStructureElement value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getRequestedLocation <em>Requested Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequestedLocation()
	 * @see #getRequestedLocation()
	 * @see #setRequestedLocation(IfcSpatialStructureElement)
	 * @generated
	 */
	void unsetRequestedLocation();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getRequestedLocation <em>Requested Location</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requested Location</em>' reference is set.
	 * @see #unsetRequestedLocation()
	 * @see #getRequestedLocation()
	 * @see #setRequestedLocation(IfcSpatialStructureElement)
	 * @generated
	 */
	boolean isSetRequestedLocation();

	/**
	 * Returns the value of the '<em><b>Standard Required Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Required Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Required Area</em>' reference.
	 * @see #setStandardRequiredArea(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceProgram_StandardRequiredArea()
	 * @model
	 * @generated
	 */
	IfcAreaMeasure getStandardRequiredArea();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcSpaceProgram#getStandardRequiredArea <em>Standard Required Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Required Area</em>' reference.
	 * @see #getStandardRequiredArea()
	 * @generated
	 */
	void setStandardRequiredArea(IfcAreaMeasure value);

	/**
	 * Returns the value of the '<em><b>Has Interaction Reqs From</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcRelInteractionRequirements}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRelInteractionRequirements#getRelatedSpaceProgram <em>Related Space Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interaction Reqs From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interaction Reqs From</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceProgram_HasInteractionReqsFrom()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRelInteractionRequirements#getRelatedSpaceProgram
	 * @model opposite="RelatedSpaceProgram"
	 * @generated
	 */
	EList<IfcRelInteractionRequirements> getHasInteractionReqsFrom();

	/**
	 * Returns the value of the '<em><b>Has Interaction Reqs To</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcRelInteractionRequirements}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRelInteractionRequirements#getRelatingSpaceProgram <em>Relating Space Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Interaction Reqs To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Interaction Reqs To</em>' reference list.
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcSpaceProgram_HasInteractionReqsTo()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRelInteractionRequirements#getRelatingSpaceProgram
	 * @model opposite="RelatingSpaceProgram"
	 * @generated
	 */
	EList<IfcRelInteractionRequirements> getHasInteractionReqsTo();

} // IfcSpaceProgram
