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
import org.bimserver.ifc.emf.Ifc2x3.IfcCartesianTransformationOperator3DnonUniform;
import org.bimserver.ifc.emf.Ifc2x3.IfcReal;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator3 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScale2 <em>Scale2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScale3 <em>Scale3</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScl2 <em>Scl2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCartesianTransformationOperator3DnonUniformImpl#getScl3 <em>Scl3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianTransformationOperator3DnonUniformImpl extends IfcCartesianTransformationOperator3DImpl implements
		IfcCartesianTransformationOperator3DnonUniform {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperator3DnonUniformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReal getScale2() {
		return (IfcReal) eGet(Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scale2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale2(IfcReal newScale2) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scale2(), newScale2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReal getScale3() {
		return (IfcReal) eGet(Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scale3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale3(IfcReal newScale3) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scale3(), newScale3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReal getScl2() {
		return (IfcReal) eGet(Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scl2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScl2(IfcReal newScl2) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scl2(), newScl2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReal getScl3() {
		return (IfcReal) eGet(Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scl3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScl3(IfcReal newScl3) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCartesianTransformationOperator3DnonUniform_Scl3(), newScl3);
	}

} //IfcCartesianTransformationOperator3DnonUniformImpl
