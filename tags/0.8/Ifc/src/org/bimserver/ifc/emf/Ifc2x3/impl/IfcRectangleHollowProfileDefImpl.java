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
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcRectangleHollowProfileDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangleHollowProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangleHollowProfileDefImpl#getInnerFilletRadius <em>Inner Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRectangleHollowProfileDefImpl#getOuterFilletRadius <em>Outer Fillet Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangleHollowProfileDefImpl extends IfcRectangleProfileDefImpl implements IfcRectangleHollowProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangleHollowProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getWallThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_WallThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThickness(IfcPositiveLengthMeasure newWallThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_WallThickness(), newWallThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getInnerFilletRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerFilletRadius(IfcPositiveLengthMeasure newInnerFilletRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius(), newInnerFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInnerFilletRadius() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInnerFilletRadius() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_InnerFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getOuterFilletRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterFilletRadius(IfcPositiveLengthMeasure newOuterFilletRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius(), newOuterFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOuterFilletRadius() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOuterFilletRadius() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRectangleHollowProfileDef_OuterFilletRadius());
	}

} //IfcRectangleHollowProfileDefImpl
