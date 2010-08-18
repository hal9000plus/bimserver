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
import org.bimserver.ifc.emf.Ifc2x3.IfcPlaneAngleMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleDisplacement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Displacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementZ <em>Displacement Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleDisplacementImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadSingleDisplacement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleDisplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getDisplacementX() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementX(IfcLengthMeasure newDisplacementX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX(), newDisplacementX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getDisplacementY() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementY(IfcLengthMeasure newDisplacementY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY(), newDisplacementY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getDisplacementZ() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementZ(IfcLengthMeasure newDisplacementZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ(), newDisplacementZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_DisplacementZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlaneAngleMeasure getRotationalDisplacementRX() {
		return (IfcPlaneAngleMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRX(IfcPlaneAngleMeasure newRotationalDisplacementRX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX(), newRotationalDisplacementRX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlaneAngleMeasure getRotationalDisplacementRY() {
		return (IfcPlaneAngleMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRY(IfcPlaneAngleMeasure newRotationalDisplacementRY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY(), newRotationalDisplacementRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlaneAngleMeasure getRotationalDisplacementRZ() {
		return (IfcPlaneAngleMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRZ(IfcPlaneAngleMeasure newRotationalDisplacementRZ) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ(), newRotationalDisplacementRZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRZ() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRZ() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement_RotationalDisplacementRZ());
	}

} //IfcStructuralLoadSingleDisplacementImpl
