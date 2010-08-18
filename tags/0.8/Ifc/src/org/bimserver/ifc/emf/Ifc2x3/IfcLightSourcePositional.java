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
 * A representation of the model object '<em><b>Ifc Light Source Positional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getPosition <em>Position</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getDistanceAttenuation <em>Distance Attenuation</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getQuadricAttenuation <em>Quadric Attenuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcLightSourcePositional()
 * @model
 * @generated
 */
public interface IfcLightSourcePositional extends IfcLightSource {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcCartesianPoint)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcLightSourcePositional_Position()
	 * @model
	 * @generated
	 */
	IfcCartesianPoint getPosition();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' reference.
	 * @see #setRadius(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcLightSourcePositional_Radius()
	 * @model
	 * @generated
	 */
	IfcPositiveLengthMeasure getRadius();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getRadius <em>Radius</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' reference.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(IfcPositiveLengthMeasure value);

	/**
	 * Returns the value of the '<em><b>Constant Attenuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Attenuation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Attenuation</em>' reference.
	 * @see #setConstantAttenuation(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcLightSourcePositional_ConstantAttenuation()
	 * @model
	 * @generated
	 */
	IfcReal getConstantAttenuation();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getConstantAttenuation <em>Constant Attenuation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Attenuation</em>' reference.
	 * @see #getConstantAttenuation()
	 * @generated
	 */
	void setConstantAttenuation(IfcReal value);

	/**
	 * Returns the value of the '<em><b>Distance Attenuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Attenuation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Attenuation</em>' reference.
	 * @see #setDistanceAttenuation(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcLightSourcePositional_DistanceAttenuation()
	 * @model
	 * @generated
	 */
	IfcReal getDistanceAttenuation();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getDistanceAttenuation <em>Distance Attenuation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Attenuation</em>' reference.
	 * @see #getDistanceAttenuation()
	 * @generated
	 */
	void setDistanceAttenuation(IfcReal value);

	/**
	 * Returns the value of the '<em><b>Quadric Attenuation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quadric Attenuation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quadric Attenuation</em>' reference.
	 * @see #setQuadricAttenuation(IfcReal)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcLightSourcePositional_QuadricAttenuation()
	 * @model
	 * @generated
	 */
	IfcReal getQuadricAttenuation();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcLightSourcePositional#getQuadricAttenuation <em>Quadric Attenuation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quadric Attenuation</em>' reference.
	 * @see #getQuadricAttenuation()
	 * @generated
	 */
	void setQuadricAttenuation(IfcReal value);

} // IfcLightSourcePositional
