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
import org.bimserver.ifc.emf.Ifc2x3.IfcCompositeCurve;
import org.bimserver.ifc.emf.Ifc2x3.IfcCompositeCurveSegment;
import org.bimserver.ifc.emf.Ifc2x3.IfcInteger;
import org.bimserver.ifc.emf.Ifc2x3.IfcLogical;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Composite Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCompositeCurveImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCompositeCurveImpl#getSelfIntersect <em>Self Intersect</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCompositeCurveImpl#getClosedCurve <em>Closed Curve</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcCompositeCurveImpl#getNSegments <em>NSegments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCompositeCurveImpl extends IfcBoundedCurveImpl implements IfcCompositeCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCompositeCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcCompositeCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcCompositeCurveSegment> getSegments() {
		return (EList<IfcCompositeCurveSegment>) eGet(Ifc2x3Package.eINSTANCE.getIfcCompositeCurve_Segments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogical getSelfIntersect() {
		return (IfcLogical) eGet(Ifc2x3Package.eINSTANCE.getIfcCompositeCurve_SelfIntersect(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(IfcLogical newSelfIntersect) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCompositeCurve_SelfIntersect(), newSelfIntersect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogical getClosedCurve() {
		return (IfcLogical) eGet(Ifc2x3Package.eINSTANCE.getIfcCompositeCurve_ClosedCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedCurve(IfcLogical newClosedCurve) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCompositeCurve_ClosedCurve(), newClosedCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInteger getNSegments() {
		return (IfcInteger) eGet(Ifc2x3Package.eINSTANCE.getIfcCompositeCurve_NSegments(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSegments(IfcInteger newNSegments) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcCompositeCurve_NSegments(), newNSegments);
	}

} //IfcCompositeCurveImpl
