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
import org.bimserver.ifc.emf.Ifc2x3.IfcProperty;
import org.bimserver.ifc.emf.Ifc2x3.IfcPropertyDependencyRelationship;
import org.bimserver.ifc.emf.Ifc2x3.IfcText;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Dependency Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyDependencyRelationshipImpl#getDependingProperty <em>Depending Property</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyDependencyRelationshipImpl#getDependantProperty <em>Dependant Property</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyDependencyRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyDependencyRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyDependencyRelationshipImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyDependencyRelationshipImpl extends IfcRootObject implements IfcPropertyDependencyRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyDependencyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship();
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
	public IfcProperty getDependingProperty() {
		return (IfcProperty) eGet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_DependingProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependingProperty(IfcProperty newDependingProperty) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_DependingProperty(), newDependingProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProperty getDependantProperty() {
		return (IfcProperty) eGet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_DependantProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependantProperty(IfcProperty newDependantProperty) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_DependantProperty(), newDependantProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabel getName() {
		return (IfcLabel) eGet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(IfcLabel newName) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcText getDescription() {
		return (IfcText) eGet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(IfcText newDescription) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcText getExpression() {
		return (IfcText) eGet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(IfcText newExpression) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExpression() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Expression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpression() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcPropertyDependencyRelationship_Expression());
	}

} //IfcPropertyDependencyRelationshipImpl
