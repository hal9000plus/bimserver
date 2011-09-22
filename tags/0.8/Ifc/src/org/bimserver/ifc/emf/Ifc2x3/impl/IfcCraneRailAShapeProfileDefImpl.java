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
import org.bimserver.ifc.emf.Ifc2x3.IfcCraneRailAShapeProfileDef;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Crane Rail AShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseWidth2 <em>Base Width2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getHeadWidth <em>Head Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getHeadDepth2 <em>Head Depth2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getHeadDepth3 <em>Head Depth3</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseWidth4 <em>Base Width4</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth1 <em>Base Depth1</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth2 <em>Base Depth2</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getBaseDepth3 <em>Base Depth3</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCraneRailAShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCraneRailAShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcCraneRailAShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCraneRailAShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getOverallHeight() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeight(IfcPositiveLengthMeasure newOverallHeight) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_OverallHeight(), newOverallHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getBaseWidth2() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseWidth2(IfcPositiveLengthMeasure newBaseWidth2) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth2(), newBaseWidth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(IfcPositiveLengthMeasure newRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius(), newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_Radius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getHeadWidth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadWidth(IfcPositiveLengthMeasure newHeadWidth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadWidth(), newHeadWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getHeadDepth2() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth2(IfcPositiveLengthMeasure newHeadDepth2) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth2(), newHeadDepth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getHeadDepth3() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth3(IfcPositiveLengthMeasure newHeadDepth3) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_HeadDepth3(), newHeadDepth3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getWebThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(IfcPositiveLengthMeasure newWebThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_WebThickness(), newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getBaseWidth4() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseWidth4(IfcPositiveLengthMeasure newBaseWidth4) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseWidth4(), newBaseWidth4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getBaseDepth1() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth1(IfcPositiveLengthMeasure newBaseDepth1) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth1(), newBaseDepth1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getBaseDepth2() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth2(IfcPositiveLengthMeasure newBaseDepth2) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth2(), newBaseDepth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getBaseDepth3() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth3(IfcPositiveLengthMeasure newBaseDepth3) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_BaseDepth3(), newBaseDepth3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getCentreOfGravityInY() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(IfcPositiveLengthMeasure newCentreOfGravityInY) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY(), newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcCraneRailAShapeProfileDef_CentreOfGravityInY());
	}

} //IfcCraneRailAShapeProfileDefImpl