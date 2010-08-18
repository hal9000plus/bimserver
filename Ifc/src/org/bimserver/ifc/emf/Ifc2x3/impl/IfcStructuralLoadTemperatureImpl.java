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
import org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature;
import org.bimserver.ifc.emf.Ifc2x3.IfcThermodynamicTemperatureMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Constant <em>Delta TConstant</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Y <em>Delta TY</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcStructuralLoadTemperatureImpl#getDeltaT_Z <em>Delta TZ</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadTemperatureImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadTemperature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasure getDeltaT_Constant() {
		return (IfcThermodynamicTemperatureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Constant(IfcThermodynamicTemperatureMeasure newDeltaT_Constant) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant(), newDeltaT_Constant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Constant() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Constant() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Constant());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasure getDeltaT_Y() {
		return (IfcThermodynamicTemperatureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Y(IfcThermodynamicTemperatureMeasure newDeltaT_Y) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y(), newDeltaT_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Y() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Y() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Y());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasure getDeltaT_Z() {
		return (IfcThermodynamicTemperatureMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaT_Z(IfcThermodynamicTemperatureMeasure newDeltaT_Z) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z(), newDeltaT_Z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeltaT_Z() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeltaT_Z() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcStructuralLoadTemperature_DeltaT_Z());
	}

} //IfcStructuralLoadTemperatureImpl
