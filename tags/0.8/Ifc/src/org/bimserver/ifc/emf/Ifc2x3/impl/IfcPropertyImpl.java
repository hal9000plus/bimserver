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
import org.bimserver.ifc.emf.Ifc2x3.IfcComplexProperty;
import org.bimserver.ifc.emf.Ifc2x3.IfcIdentifier;
import org.bimserver.ifc.emf.Ifc2x3.IfcProperty;
import org.bimserver.ifc.emf.Ifc2x3.IfcPropertyDependencyRelationship;
import org.bimserver.ifc.emf.Ifc2x3.IfcText;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyImpl#getPropertyForDependance <em>Property For Dependance</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyImpl#getPropertyDependsOn <em>Property Depends On</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcPropertyImpl#getPartOfComplex <em>Part Of Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyImpl extends IfcRootObject implements IfcProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcProperty();
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
	public IfcIdentifier getName() {
		return (IfcIdentifier) eGet(Ifc2x3Package.eINSTANCE.getIfcProperty_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(IfcIdentifier newName) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcProperty_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcText getDescription() {
		return (IfcText) eGet(Ifc2x3Package.eINSTANCE.getIfcProperty_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(IfcText newDescription) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcProperty_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcProperty_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcProperty_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPropertyDependencyRelationship> getPropertyForDependance() {
		return (EList<IfcPropertyDependencyRelationship>) eGet(Ifc2x3Package.eINSTANCE.getIfcProperty_PropertyForDependance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPropertyDependencyRelationship> getPropertyDependsOn() {
		return (EList<IfcPropertyDependencyRelationship>) eGet(Ifc2x3Package.eINSTANCE.getIfcProperty_PropertyDependsOn(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcComplexProperty> getPartOfComplex() {
		return (EList<IfcComplexProperty>) eGet(Ifc2x3Package.eINSTANCE.getIfcProperty_PartOfComplex(), true);
	}

} //IfcPropertyImpl
