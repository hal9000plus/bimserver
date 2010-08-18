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
 * A representation of the model object '<em><b>Ifc Structural Load Single Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceX <em>Force X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceY <em>Force Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceZ <em>Force Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentX <em>Moment X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentY <em>Moment Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentZ <em>Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleForce()
 * @model
 * @generated
 */
public interface IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Force X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force X</em>' reference.
	 * @see #isSetForceX()
	 * @see #unsetForceX()
	 * @see #setForceX(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleForce_ForceX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getForceX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceX <em>Force X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force X</em>' reference.
	 * @see #isSetForceX()
	 * @see #unsetForceX()
	 * @see #getForceX()
	 * @generated
	 */
	void setForceX(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceX <em>Force X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceX()
	 * @see #getForceX()
	 * @see #setForceX(IfcForceMeasure)
	 * @generated
	 */
	void unsetForceX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceX <em>Force X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force X</em>' reference is set.
	 * @see #unsetForceX()
	 * @see #getForceX()
	 * @see #setForceX(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetForceX();

	/**
	 * Returns the value of the '<em><b>Force Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Y</em>' reference.
	 * @see #isSetForceY()
	 * @see #unsetForceY()
	 * @see #setForceY(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleForce_ForceY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getForceY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceY <em>Force Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Y</em>' reference.
	 * @see #isSetForceY()
	 * @see #unsetForceY()
	 * @see #getForceY()
	 * @generated
	 */
	void setForceY(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceY <em>Force Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceY()
	 * @see #getForceY()
	 * @see #setForceY(IfcForceMeasure)
	 * @generated
	 */
	void unsetForceY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceY <em>Force Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force Y</em>' reference is set.
	 * @see #unsetForceY()
	 * @see #getForceY()
	 * @see #setForceY(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetForceY();

	/**
	 * Returns the value of the '<em><b>Force Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Z</em>' reference.
	 * @see #isSetForceZ()
	 * @see #unsetForceZ()
	 * @see #setForceZ(IfcForceMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleForce_ForceZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcForceMeasure getForceZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceZ <em>Force Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Z</em>' reference.
	 * @see #isSetForceZ()
	 * @see #unsetForceZ()
	 * @see #getForceZ()
	 * @generated
	 */
	void setForceZ(IfcForceMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceZ <em>Force Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceZ()
	 * @see #getForceZ()
	 * @see #setForceZ(IfcForceMeasure)
	 * @generated
	 */
	void unsetForceZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getForceZ <em>Force Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force Z</em>' reference is set.
	 * @see #unsetForceZ()
	 * @see #getForceZ()
	 * @see #setForceZ(IfcForceMeasure)
	 * @generated
	 */
	boolean isSetForceZ();

	/**
	 * Returns the value of the '<em><b>Moment X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment X</em>' reference.
	 * @see #isSetMomentX()
	 * @see #unsetMomentX()
	 * @see #setMomentX(IfcTorqueMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleForce_MomentX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTorqueMeasure getMomentX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentX <em>Moment X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment X</em>' reference.
	 * @see #isSetMomentX()
	 * @see #unsetMomentX()
	 * @see #getMomentX()
	 * @generated
	 */
	void setMomentX(IfcTorqueMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentX <em>Moment X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentX()
	 * @see #getMomentX()
	 * @see #setMomentX(IfcTorqueMeasure)
	 * @generated
	 */
	void unsetMomentX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentX <em>Moment X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment X</em>' reference is set.
	 * @see #unsetMomentX()
	 * @see #getMomentX()
	 * @see #setMomentX(IfcTorqueMeasure)
	 * @generated
	 */
	boolean isSetMomentX();

	/**
	 * Returns the value of the '<em><b>Moment Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Y</em>' reference.
	 * @see #isSetMomentY()
	 * @see #unsetMomentY()
	 * @see #setMomentY(IfcTorqueMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleForce_MomentY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTorqueMeasure getMomentY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentY <em>Moment Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Y</em>' reference.
	 * @see #isSetMomentY()
	 * @see #unsetMomentY()
	 * @see #getMomentY()
	 * @generated
	 */
	void setMomentY(IfcTorqueMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentY <em>Moment Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentY()
	 * @see #getMomentY()
	 * @see #setMomentY(IfcTorqueMeasure)
	 * @generated
	 */
	void unsetMomentY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentY <em>Moment Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Y</em>' reference is set.
	 * @see #unsetMomentY()
	 * @see #getMomentY()
	 * @see #setMomentY(IfcTorqueMeasure)
	 * @generated
	 */
	boolean isSetMomentY();

	/**
	 * Returns the value of the '<em><b>Moment Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Z</em>' reference.
	 * @see #isSetMomentZ()
	 * @see #unsetMomentZ()
	 * @see #setMomentZ(IfcTorqueMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadSingleForce_MomentZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTorqueMeasure getMomentZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentZ <em>Moment Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Z</em>' reference.
	 * @see #isSetMomentZ()
	 * @see #unsetMomentZ()
	 * @see #getMomentZ()
	 * @generated
	 */
	void setMomentZ(IfcTorqueMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentZ <em>Moment Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentZ()
	 * @see #getMomentZ()
	 * @see #setMomentZ(IfcTorqueMeasure)
	 * @generated
	 */
	void unsetMomentZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadSingleForce#getMomentZ <em>Moment Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Z</em>' reference is set.
	 * @see #unsetMomentZ()
	 * @see #getMomentZ()
	 * @see #setMomentZ(IfcTorqueMeasure)
	 * @generated
	 */
	boolean isSetMomentZ();

} // IfcStructuralLoadSingleForce
