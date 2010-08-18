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
 * A representation of the model object '<em><b>Ifc Structural Load Linear Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceX <em>Linear Force X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceY <em>Linear Force Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceZ <em>Linear Force Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentX <em>Linear Moment X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentY <em>Linear Moment Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentZ <em>Linear Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadLinearForce()
 * @model
 * @generated
 */
public interface IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Linear Force X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Force X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Force X</em>' reference.
	 * @see #isSetLinearForceX()
	 * @see #unsetLinearForceX()
	 * @see #setLinearForceX(IfcLinearForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadLinearForce_LinearForceX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearForceMeasure getLinearForceX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceX <em>Linear Force X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Force X</em>' reference.
	 * @see #isSetLinearForceX()
	 * @see #unsetLinearForceX()
	 * @see #getLinearForceX()
	 * @generated
	 */
	void setLinearForceX(IfcLinearForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceX <em>Linear Force X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearForceX()
	 * @see #getLinearForceX()
	 * @see #setLinearForceX(IfcLinearForceMeasure)
	 * @generated
	 */
	void unsetLinearForceX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceX <em>Linear Force X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Force X</em>' reference is set.
	 * @see #unsetLinearForceX()
	 * @see #getLinearForceX()
	 * @see #setLinearForceX(IfcLinearForceMeasure)
	 * @generated
	 */
	boolean isSetLinearForceX();

	/**
	 * Returns the value of the '<em><b>Linear Force Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Force Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Force Y</em>' reference.
	 * @see #isSetLinearForceY()
	 * @see #unsetLinearForceY()
	 * @see #setLinearForceY(IfcLinearForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadLinearForce_LinearForceY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearForceMeasure getLinearForceY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceY <em>Linear Force Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Force Y</em>' reference.
	 * @see #isSetLinearForceY()
	 * @see #unsetLinearForceY()
	 * @see #getLinearForceY()
	 * @generated
	 */
	void setLinearForceY(IfcLinearForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceY <em>Linear Force Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearForceY()
	 * @see #getLinearForceY()
	 * @see #setLinearForceY(IfcLinearForceMeasure)
	 * @generated
	 */
	void unsetLinearForceY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceY <em>Linear Force Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Force Y</em>' reference is set.
	 * @see #unsetLinearForceY()
	 * @see #getLinearForceY()
	 * @see #setLinearForceY(IfcLinearForceMeasure)
	 * @generated
	 */
	boolean isSetLinearForceY();

	/**
	 * Returns the value of the '<em><b>Linear Force Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Force Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Force Z</em>' reference.
	 * @see #isSetLinearForceZ()
	 * @see #unsetLinearForceZ()
	 * @see #setLinearForceZ(IfcLinearForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadLinearForce_LinearForceZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearForceMeasure getLinearForceZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceZ <em>Linear Force Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Force Z</em>' reference.
	 * @see #isSetLinearForceZ()
	 * @see #unsetLinearForceZ()
	 * @see #getLinearForceZ()
	 * @generated
	 */
	void setLinearForceZ(IfcLinearForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceZ <em>Linear Force Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearForceZ()
	 * @see #getLinearForceZ()
	 * @see #setLinearForceZ(IfcLinearForceMeasure)
	 * @generated
	 */
	void unsetLinearForceZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearForceZ <em>Linear Force Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Force Z</em>' reference is set.
	 * @see #unsetLinearForceZ()
	 * @see #getLinearForceZ()
	 * @see #setLinearForceZ(IfcLinearForceMeasure)
	 * @generated
	 */
	boolean isSetLinearForceZ();

	/**
	 * Returns the value of the '<em><b>Linear Moment X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Moment X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Moment X</em>' reference.
	 * @see #isSetLinearMomentX()
	 * @see #unsetLinearMomentX()
	 * @see #setLinearMomentX(IfcLinearMomentMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadLinearForce_LinearMomentX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearMomentMeasure getLinearMomentX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentX <em>Linear Moment X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Moment X</em>' reference.
	 * @see #isSetLinearMomentX()
	 * @see #unsetLinearMomentX()
	 * @see #getLinearMomentX()
	 * @generated
	 */
	void setLinearMomentX(IfcLinearMomentMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentX <em>Linear Moment X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearMomentX()
	 * @see #getLinearMomentX()
	 * @see #setLinearMomentX(IfcLinearMomentMeasure)
	 * @generated
	 */
	void unsetLinearMomentX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentX <em>Linear Moment X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Moment X</em>' reference is set.
	 * @see #unsetLinearMomentX()
	 * @see #getLinearMomentX()
	 * @see #setLinearMomentX(IfcLinearMomentMeasure)
	 * @generated
	 */
	boolean isSetLinearMomentX();

	/**
	 * Returns the value of the '<em><b>Linear Moment Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Moment Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Moment Y</em>' reference.
	 * @see #isSetLinearMomentY()
	 * @see #unsetLinearMomentY()
	 * @see #setLinearMomentY(IfcLinearMomentMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadLinearForce_LinearMomentY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearMomentMeasure getLinearMomentY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentY <em>Linear Moment Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Moment Y</em>' reference.
	 * @see #isSetLinearMomentY()
	 * @see #unsetLinearMomentY()
	 * @see #getLinearMomentY()
	 * @generated
	 */
	void setLinearMomentY(IfcLinearMomentMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentY <em>Linear Moment Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearMomentY()
	 * @see #getLinearMomentY()
	 * @see #setLinearMomentY(IfcLinearMomentMeasure)
	 * @generated
	 */
	void unsetLinearMomentY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentY <em>Linear Moment Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Moment Y</em>' reference is set.
	 * @see #unsetLinearMomentY()
	 * @see #getLinearMomentY()
	 * @see #setLinearMomentY(IfcLinearMomentMeasure)
	 * @generated
	 */
	boolean isSetLinearMomentY();

	/**
	 * Returns the value of the '<em><b>Linear Moment Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Moment Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Moment Z</em>' reference.
	 * @see #isSetLinearMomentZ()
	 * @see #unsetLinearMomentZ()
	 * @see #setLinearMomentZ(IfcLinearMomentMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadLinearForce_LinearMomentZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLinearMomentMeasure getLinearMomentZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentZ <em>Linear Moment Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Moment Z</em>' reference.
	 * @see #isSetLinearMomentZ()
	 * @see #unsetLinearMomentZ()
	 * @see #getLinearMomentZ()
	 * @generated
	 */
	void setLinearMomentZ(IfcLinearMomentMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentZ <em>Linear Moment Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinearMomentZ()
	 * @see #getLinearMomentZ()
	 * @see #setLinearMomentZ(IfcLinearMomentMeasure)
	 * @generated
	 */
	void unsetLinearMomentZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadLinearForce#getLinearMomentZ <em>Linear Moment Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linear Moment Z</em>' reference is set.
	 * @see #unsetLinearMomentZ()
	 * @see #getLinearMomentZ()
	 * @see #setLinearMomentZ(IfcLinearMomentMeasure)
	 * @generated
	 */
	boolean isSetLinearMomentZ();

} // IfcStructuralLoadLinearForce
