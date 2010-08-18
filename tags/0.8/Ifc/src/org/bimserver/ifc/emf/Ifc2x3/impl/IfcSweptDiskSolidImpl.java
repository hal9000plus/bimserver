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
import org.bimserver.ifc.emf.Ifc2x3.IfcCurve;
import org.bimserver.ifc.emf.Ifc2x3.IfcParameterValue;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcSweptDiskSolid;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Swept Disk Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSweptDiskSolidImpl#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSweptDiskSolidImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSweptDiskSolidImpl#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSweptDiskSolidImpl#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcSweptDiskSolidImpl#getEndParam <em>End Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSweptDiskSolidImpl extends IfcSolidModelImpl implements IfcSweptDiskSolid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSweptDiskSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getDirectrix() {
		return (IfcCurve) eGet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_Directrix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectrix(IfcCurve newDirectrix) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_Directrix(), newDirectrix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_Radius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(IfcPositiveLengthMeasure newRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_Radius(), newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getInnerRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerRadius(IfcPositiveLengthMeasure newInnerRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius(), newInnerRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerRadius() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerRadius() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_InnerRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcParameterValue getStartParam() {
		return (IfcParameterValue) eGet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_StartParam(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartParam(IfcParameterValue newStartParam) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_StartParam(), newStartParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcParameterValue getEndParam() {
		return (IfcParameterValue) eGet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_EndParam(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndParam(IfcParameterValue newEndParam) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSweptDiskSolid_EndParam(), newEndParam);
	}

} //IfcSweptDiskSolidImpl
