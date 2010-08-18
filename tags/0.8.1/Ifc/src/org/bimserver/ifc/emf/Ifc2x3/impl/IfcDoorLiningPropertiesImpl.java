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
import org.bimserver.ifc.emf.Ifc2x3.IfcDoorLiningProperties;
import org.bimserver.ifc.emf.Ifc2x3.IfcLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcShapeAspect;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getThresholdDepth <em>Threshold Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getThresholdThickness <em>Threshold Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getTransomOffset <em>Transom Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getLiningOffset <em>Lining Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getThresholdOffset <em>Threshold Offset</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getCasingThickness <em>Casing Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getCasingDepth <em>Casing Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcDoorLiningPropertiesImpl#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDoorLiningPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcDoorLiningProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorLiningPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getLiningDepth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningDepth(IfcPositiveLengthMeasure newLiningDepth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth(), newLiningDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningDepth() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningDepth() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getLiningThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningThickness(IfcPositiveLengthMeasure newLiningThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness(), newLiningThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningThickness() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningThickness() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getThresholdDepth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdDepth(IfcPositiveLengthMeasure newThresholdDepth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth(), newThresholdDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdDepth() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdDepth() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getThresholdThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdThickness(IfcPositiveLengthMeasure newThresholdThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness(), newThresholdThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdThickness() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdThickness() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getTransomThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomThickness(IfcPositiveLengthMeasure newTransomThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness(), newTransomThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomThickness() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomThickness() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_TransomThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getTransomOffset() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransomOffset(IfcLengthMeasure newTransomOffset) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset(), newTransomOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransomOffset() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransomOffset() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_TransomOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getLiningOffset() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiningOffset(IfcLengthMeasure newLiningOffset) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset(), newLiningOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLiningOffset() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLiningOffset() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_LiningOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasure getThresholdOffset() {
		return (IfcLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdOffset(IfcLengthMeasure newThresholdOffset) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset(), newThresholdOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThresholdOffset() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThresholdOffset() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ThresholdOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getCasingThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingThickness(IfcPositiveLengthMeasure newCasingThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness(), newCasingThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingThickness() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingThickness() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_CasingThickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getCasingDepth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingDepth(IfcPositiveLengthMeasure newCasingDepth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth(), newCasingDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingDepth() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingDepth() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_CasingDepth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getShapeAspectStyle() {
		return (IfcShapeAspect) eGet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ShapeAspectStyle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeAspectStyle(IfcShapeAspect newShapeAspectStyle) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ShapeAspectStyle(), newShapeAspectStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShapeAspectStyle() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ShapeAspectStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShapeAspectStyle() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcDoorLiningProperties_ShapeAspectStyle());
	}

} //IfcDoorLiningPropertiesImpl
