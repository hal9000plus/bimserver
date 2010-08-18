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
import org.bimserver.ifc.emf.Ifc2x3.IfcDimensionCount;
import org.bimserver.ifc.emf.Ifc2x3.IfcLogical;
import org.bimserver.ifc.emf.Ifc2x3.IfcParameterValue;
import org.bimserver.ifc.emf.Ifc2x3.IfcRectangularTrimmedSurface;
import org.bimserver.ifc.emf.Ifc2x3.IfcSurface;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangular Trimmed Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangularTrimmedSurfaceImpl#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangularTrimmedSurfaceImpl#getU1 <em>U1</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangularTrimmedSurfaceImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangularTrimmedSurfaceImpl#getU2 <em>U2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangularTrimmedSurfaceImpl#getV2 <em>V2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangularTrimmedSurfaceImpl#getUsense <em>Usense</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangularTrimmedSurfaceImpl#getVsense <em>Vsense</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangularTrimmedSurfaceImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangularTrimmedSurfaceImpl extends IfcBoundedSurfaceImpl implements IfcRectangularTrimmedSurface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangularTrimmedSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getBasisSurface() {
		return (IfcSurface) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_BasisSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisSurface(IfcSurface newBasisSurface) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_BasisSurface(), newBasisSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcParameterValue getU1() {
		return (IfcParameterValue) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU1(IfcParameterValue newU1) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U1(), newU1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcParameterValue getV1() {
		return (IfcParameterValue) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV1(IfcParameterValue newV1) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V1(), newV1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcParameterValue getU2() {
		return (IfcParameterValue) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU2(IfcParameterValue newU2) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_U2(), newU2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcParameterValue getV2() {
		return (IfcParameterValue) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV2(IfcParameterValue newV2) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_V2(), newV2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogical getUsense() {
		return (IfcLogical) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Usense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsense(IfcLogical newUsense) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Usense(), newUsense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogical getVsense() {
		return (IfcLogical) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Vsense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsense(IfcLogical newVsense) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Vsense(), newVsense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionCount getDim() {
		return (IfcDimensionCount) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Dim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(IfcDimensionCount newDim) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangularTrimmedSurface_Dim(), newDim);
	}

} //IfcRectangularTrimmedSurfaceImpl
