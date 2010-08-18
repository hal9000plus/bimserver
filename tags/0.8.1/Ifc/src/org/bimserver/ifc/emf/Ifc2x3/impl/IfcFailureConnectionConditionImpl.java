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
import org.bimserver.ifc.emf.Ifc2x3.IfcFailureConnectionCondition;
import org.bimserver.ifc.emf.Ifc2x3.IfcForceMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Failure Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFailureConnectionConditionImpl#getTensionFailureX <em>Tension Failure X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFailureConnectionConditionImpl#getTensionFailureY <em>Tension Failure Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFailureConnectionConditionImpl#getTensionFailureZ <em>Tension Failure Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFailureConnectionConditionImpl#getCompressionFailureX <em>Compression Failure X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFailureConnectionConditionImpl#getCompressionFailureY <em>Compression Failure Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcFailureConnectionConditionImpl#getCompressionFailureZ <em>Compression Failure Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFailureConnectionConditionImpl extends IfcStructuralConnectionConditionImpl implements IfcFailureConnectionCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFailureConnectionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getTensionFailureX() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureX(IfcForceMeasure newTensionFailureX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX(), newTensionFailureX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getTensionFailureY() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureY(IfcForceMeasure newTensionFailureY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY(), newTensionFailureY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getTensionFailureZ() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureZ(IfcForceMeasure newTensionFailureZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ(), newTensionFailureZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionFailureZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionFailureZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_TensionFailureZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getCompressionFailureX() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureX(IfcForceMeasure newCompressionFailureX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX(), newCompressionFailureX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getCompressionFailureY() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureY(IfcForceMeasure newCompressionFailureY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY(), newCompressionFailureY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasure getCompressionFailureZ() {
		return (IfcForceMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureZ(IfcForceMeasure newCompressionFailureZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ(), newCompressionFailureZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressionFailureZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressionFailureZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcFailureConnectionCondition_CompressionFailureZ());
	}

} //IfcFailureConnectionConditionImpl
