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
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcTrapeziumProfileDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trapezium Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTrapeziumProfileDefImpl#getBottomXDim <em>Bottom XDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTrapeziumProfileDefImpl#getTopXDim <em>Top XDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTrapeziumProfileDefImpl#getYDim <em>YDim</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcTrapeziumProfileDefImpl#getTopXOffset <em>Top XOffset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTrapeziumProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcTrapeziumProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTrapeziumProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getBottomXDim() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef_BottomXDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomXDim(IfcPositiveLengthMeasure newBottomXDim) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef_BottomXDim(), newBottomXDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getTopXDim() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXDim(IfcPositiveLengthMeasure newTopXDim) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXDim(), newTopXDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getYDim() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef_YDim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDim(IfcPositiveLengthMeasure newYDim) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef_YDim(), newYDim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getTopXOffset() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopXOffset(IfcLengthMeasure newTopXOffset) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcTrapeziumProfileDef_TopXOffset(), newTopXOffset);
	}

} //IfcTrapeziumProfileDefImpl
