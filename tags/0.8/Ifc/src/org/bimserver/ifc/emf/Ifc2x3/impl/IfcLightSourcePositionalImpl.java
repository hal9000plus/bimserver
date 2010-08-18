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
import org.bimserver.ifc.emf.Ifc2x3.IfcCartesianPoint;
import org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcReal;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Positional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcLightSourcePositionalImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcLightSourcePositionalImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcLightSourcePositionalImpl#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcLightSourcePositionalImpl#getDistanceAttenuation <em>Distance Attenuation</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcLightSourcePositionalImpl#getQuadricAttenuation <em>Quadric Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightSourcePositionalImpl extends IfcLightSourceImpl implements IfcLightSourcePositional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourcePositionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getPosition() {
		return (IfcCartesianPoint) eGet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_Position(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcCartesianPoint newPosition) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_Position(), newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getRadius() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_Radius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(IfcPositiveLengthMeasure newRadius) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_Radius(), newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReal getConstantAttenuation() {
		return (IfcReal) eGet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_ConstantAttenuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantAttenuation(IfcReal newConstantAttenuation) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_ConstantAttenuation(), newConstantAttenuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReal getDistanceAttenuation() {
		return (IfcReal) eGet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_DistanceAttenuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAttenuation(IfcReal newDistanceAttenuation) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_DistanceAttenuation(), newDistanceAttenuation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReal getQuadricAttenuation() {
		return (IfcReal) eGet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_QuadricAttenuation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuadricAttenuation(IfcReal newQuadricAttenuation) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcLightSourcePositional_QuadricAttenuation(), newQuadricAttenuation);
	}

} //IfcLightSourcePositionalImpl
