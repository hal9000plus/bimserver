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
import org.bimserver.ifc.emf.Ifc2x3.IfcConnectionTypeEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcInteger;
import org.bimserver.ifc.emf.Ifc2x3.IfcRelConnectsPathElements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Path Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelConnectsPathElementsImpl#getRelatingPriorities <em>Relating Priorities</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelConnectsPathElementsImpl#getRelatedPriorities <em>Related Priorities</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelConnectsPathElementsImpl#getRelatedConnectionType <em>Related Connection Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelConnectsPathElementsImpl#getRelatingConnectionType <em>Relating Connection Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelConnectsPathElementsImpl#getRelatingLayerCount <em>Relating Layer Count</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRelConnectsPathElementsImpl#getRelatedLayerCount <em>Related Layer Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPathElementsImpl extends IfcRelConnectsElementsImpl implements IfcRelConnectsPathElements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPathElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcInteger> getRelatingPriorities() {
		return (EList<IfcInteger>) eGet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingPriorities(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcInteger> getRelatedPriorities() {
		return (EList<IfcInteger>) eGet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedPriorities(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatedConnectionType() {
		return (IfcConnectionTypeEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedConnectionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedConnectionType(IfcConnectionTypeEnum newRelatedConnectionType) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedConnectionType(), newRelatedConnectionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum getRelatingConnectionType() {
		return (IfcConnectionTypeEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingConnectionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingConnectionType(IfcConnectionTypeEnum newRelatingConnectionType) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingConnectionType(), newRelatingConnectionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getRelatingLayerCount() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingLayerCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingLayerCount(IfcInteger newRelatingLayerCount) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatingLayerCount(), newRelatingLayerCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getRelatedLayerCount() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedLayerCount(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedLayerCount(IfcInteger newRelatedLayerCount) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelConnectsPathElements_RelatedLayerCount(), newRelatedLayerCount);
	}

} //IfcRelConnectsPathElementsImpl
