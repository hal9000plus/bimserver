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
package org.bimserver.ifc.emf.Ifc2x3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Load Planar Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceX <em>Planar Force X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceY <em>Planar Force Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceZ <em>Planar Force Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadPlanarForce()
 * @model
 * @generated
 */
public interface IfcStructuralLoadPlanarForce extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Planar Force X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planar Force X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planar Force X</em>' reference.
	 * @see #isSetPlanarForceX()
	 * @see #unsetPlanarForceX()
	 * @see #setPlanarForceX(IfcPlanarForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadPlanarForce_PlanarForceX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlanarForceMeasure getPlanarForceX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceX <em>Planar Force X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planar Force X</em>' reference.
	 * @see #isSetPlanarForceX()
	 * @see #unsetPlanarForceX()
	 * @see #getPlanarForceX()
	 * @generated
	 */
	void setPlanarForceX(IfcPlanarForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceX <em>Planar Force X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlanarForceX()
	 * @see #getPlanarForceX()
	 * @see #setPlanarForceX(IfcPlanarForceMeasure)
	 * @generated
	 */
	void unsetPlanarForceX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceX <em>Planar Force X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Planar Force X</em>' reference is set.
	 * @see #unsetPlanarForceX()
	 * @see #getPlanarForceX()
	 * @see #setPlanarForceX(IfcPlanarForceMeasure)
	 * @generated
	 */
	boolean isSetPlanarForceX();

	/**
	 * Returns the value of the '<em><b>Planar Force Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planar Force Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planar Force Y</em>' reference.
	 * @see #isSetPlanarForceY()
	 * @see #unsetPlanarForceY()
	 * @see #setPlanarForceY(IfcPlanarForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadPlanarForce_PlanarForceY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlanarForceMeasure getPlanarForceY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceY <em>Planar Force Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planar Force Y</em>' reference.
	 * @see #isSetPlanarForceY()
	 * @see #unsetPlanarForceY()
	 * @see #getPlanarForceY()
	 * @generated
	 */
	void setPlanarForceY(IfcPlanarForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceY <em>Planar Force Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlanarForceY()
	 * @see #getPlanarForceY()
	 * @see #setPlanarForceY(IfcPlanarForceMeasure)
	 * @generated
	 */
	void unsetPlanarForceY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceY <em>Planar Force Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Planar Force Y</em>' reference is set.
	 * @see #unsetPlanarForceY()
	 * @see #getPlanarForceY()
	 * @see #setPlanarForceY(IfcPlanarForceMeasure)
	 * @generated
	 */
	boolean isSetPlanarForceY();

	/**
	 * Returns the value of the '<em><b>Planar Force Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planar Force Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planar Force Z</em>' reference.
	 * @see #isSetPlanarForceZ()
	 * @see #unsetPlanarForceZ()
	 * @see #setPlanarForceZ(IfcPlanarForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadPlanarForce_PlanarForceZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPlanarForceMeasure getPlanarForceZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceZ <em>Planar Force Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planar Force Z</em>' reference.
	 * @see #isSetPlanarForceZ()
	 * @see #unsetPlanarForceZ()
	 * @see #getPlanarForceZ()
	 * @generated
	 */
	void setPlanarForceZ(IfcPlanarForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceZ <em>Planar Force Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlanarForceZ()
	 * @see #getPlanarForceZ()
	 * @see #setPlanarForceZ(IfcPlanarForceMeasure)
	 * @generated
	 */
	void unsetPlanarForceZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadPlanarForce#getPlanarForceZ <em>Planar Force Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Planar Force Z</em>' reference is set.
	 * @see #unsetPlanarForceZ()
	 * @see #getPlanarForceZ()
	 * @see #setPlanarForceZ(IfcPlanarForceMeasure)
	 * @generated
	 */
	boolean isSetPlanarForceZ();

} // IfcStructuralLoadPlanarForce
