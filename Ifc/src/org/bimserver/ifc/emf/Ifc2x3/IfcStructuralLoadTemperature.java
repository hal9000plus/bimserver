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
 * A representation of the model object '<em><b>Ifc Structural Load Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature()
 * @model
 * @generated
 */
public interface IfcStructuralLoadTemperature extends IfcStructuralLoadStatic {
	/**
	 * Returns the value of the '<em><b>Delta TConstant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TConstant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TConstant</em>' reference.
	 * @see #isSetDeltaT_Constant()
	 * @see #unsetDeltaT_Constant()
	 * @see #setDeltaT_Constant(IfcThermodynamicTemperatureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_Constant()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcThermodynamicTemperatureMeasure getDeltaT_Constant();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TConstant</em>' reference.
	 * @see #isSetDeltaT_Constant()
	 * @see #unsetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @generated
	 */
	void setDeltaT_Constant(IfcThermodynamicTemperatureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @see #setDeltaT_Constant(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	void unsetDeltaT_Constant();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TConstant</em>' reference is set.
	 * @see #unsetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @see #setDeltaT_Constant(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	boolean isSetDeltaT_Constant();

	/**
	 * Returns the value of the '<em><b>Delta TY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TY</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TY</em>' reference.
	 * @see #isSetDeltaT_Y()
	 * @see #unsetDeltaT_Y()
	 * @see #setDeltaT_Y(IfcThermodynamicTemperatureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_Y()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcThermodynamicTemperatureMeasure getDeltaT_Y();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TY</em>' reference.
	 * @see #isSetDeltaT_Y()
	 * @see #unsetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @generated
	 */
	void setDeltaT_Y(IfcThermodynamicTemperatureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @see #setDeltaT_Y(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	void unsetDeltaT_Y();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TY</em>' reference is set.
	 * @see #unsetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @see #setDeltaT_Y(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	boolean isSetDeltaT_Y();

	/**
	 * Returns the value of the '<em><b>Delta TZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TZ</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TZ</em>' reference.
	 * @see #isSetDeltaT_Z()
	 * @see #unsetDeltaT_Z()
	 * @see #setDeltaT_Z(IfcThermodynamicTemperatureMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_Z()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcThermodynamicTemperatureMeasure getDeltaT_Z();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TZ</em>' reference.
	 * @see #isSetDeltaT_Z()
	 * @see #unsetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @generated
	 */
	void setDeltaT_Z(IfcThermodynamicTemperatureMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @see #setDeltaT_Z(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	void unsetDeltaT_Z();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TZ</em>' reference is set.
	 * @see #unsetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @see #setDeltaT_Z(IfcThermodynamicTemperatureMeasure)
	 * @generated
	 */
	boolean isSetDeltaT_Z();

} // IfcStructuralLoadTemperature
