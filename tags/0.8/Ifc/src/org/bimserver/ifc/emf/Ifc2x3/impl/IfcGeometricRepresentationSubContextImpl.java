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
import org.bimserver.ifc.emf.Ifc2x3.IfcGeometricProjectionEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcGeometricRepresentationContext;
import org.bimserver.ifc.emf.Ifc2x3.IfcGeometricRepresentationSubContext;
import org.bimserver.ifc.emf.Ifc2x3.IfcLabel;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveRatioMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Geometric Representation Sub Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcGeometricRepresentationSubContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcGeometricRepresentationSubContextImpl#getTargetScale <em>Target Scale</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcGeometricRepresentationSubContextImpl#getTargetView <em>Target View</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcGeometricRepresentationSubContextImpl#getUserDefinedTargetView <em>User Defined Target View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeometricRepresentationSubContextImpl extends IfcGeometricRepresentationContextImpl implements IfcGeometricRepresentationSubContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeometricRepresentationSubContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationContext getParentContext() {
		return (IfcGeometricRepresentationContext) eGet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_ParentContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentContext(IfcGeometricRepresentationContext newParentContext) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_ParentContext(), newParentContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveRatioMeasure getTargetScale() {
		return (IfcPositiveRatioMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetScale(IfcPositiveRatioMeasure newTargetScale) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale(), newTargetScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetScale() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetScale() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetScale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricProjectionEnum getTargetView() {
		return (IfcGeometricProjectionEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetView(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetView(IfcGeometricProjectionEnum newTargetView) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_TargetView(), newTargetView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabel getUserDefinedTargetView() {
		return (IfcLabel) eGet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedTargetView(IfcLabel newUserDefinedTargetView) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView(), newUserDefinedTargetView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedTargetView() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedTargetView() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcGeometricRepresentationSubContext_UserDefinedTargetView());
	}

} //IfcGeometricRepresentationSubContextImpl