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
import org.bimserver.ifc.emf.Ifc2x3.IfcCShapeProfileDef;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc CShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCShapeProfileDefImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCShapeProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCShapeProfileDefImpl#getGirth <em>Girth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCShapeProfileDefImpl#getInternalFilletRadius <em>Internal Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcCShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getDepth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_Depth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(IfcPositiveLengthMeasure newDepth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_Depth(), newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getWidth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_Width(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(IfcPositiveLengthMeasure newWidth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_Width(), newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getWallThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_WallThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThickness(IfcPositiveLengthMeasure newWallThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_WallThickness(), newWallThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getGirth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_Girth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGirth(IfcPositiveLengthMeasure newGirth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_Girth(), newGirth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getInternalFilletRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalFilletRadius(IfcPositiveLengthMeasure newInternalFilletRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius(), newInternalFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInternalFilletRadius() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInternalFilletRadius() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_InternalFilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getCentreOfGravityInX() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(IfcPositiveLengthMeasure newCentreOfGravityInX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX(), newCentreOfGravityInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcCShapeProfileDef_CentreOfGravityInX());
	}

} //IfcCShapeProfileDefImpl
