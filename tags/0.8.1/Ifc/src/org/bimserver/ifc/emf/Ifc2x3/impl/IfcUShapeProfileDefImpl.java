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
import org.bimserver.ifc.emf.Ifc2x3.IfcPlaneAngleMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcUShapeProfileDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc UShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcUShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcUShapeProfileDefImpl#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcUShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcUShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcUShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcUShapeProfileDefImpl#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcUShapeProfileDefImpl#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcUShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcUShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcUShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcUShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getDepth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_Depth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(IfcPositiveLengthMeasure newDepth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_Depth(), newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getFlangeWidth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeWidth(IfcPositiveLengthMeasure newFlangeWidth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeWidth(), newFlangeWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getWebThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_WebThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(IfcPositiveLengthMeasure newWebThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_WebThickness(), newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getFlangeThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeThickness(IfcPositiveLengthMeasure newFlangeThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeThickness(), newFlangeThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getFilletRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadius(IfcPositiveLengthMeasure newFilletRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius(), newFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilletRadius() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilletRadius() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FilletRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getEdgeRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeRadius(IfcPositiveLengthMeasure newEdgeRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius(), newEdgeRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeRadius() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeRadius() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_EdgeRadius());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlaneAngleMeasure getFlangeSlope() {
		return (IfcPlaneAngleMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeSlope(IfcPlaneAngleMeasure newFlangeSlope) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope(), newFlangeSlope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeSlope() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeSlope() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_FlangeSlope());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getCentreOfGravityInX() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(IfcPositiveLengthMeasure newCentreOfGravityInX) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX(), newCentreOfGravityInX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInX() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInX() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcUShapeProfileDef_CentreOfGravityInX());
	}

} //IfcUShapeProfileDefImpl
