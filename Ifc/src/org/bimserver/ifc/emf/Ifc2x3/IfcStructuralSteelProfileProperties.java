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
 * A representation of the model object '<em><b>Ifc Structural Steel Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getShearAreaZ <em>Shear Area Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getShearAreaY <em>Shear Area Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSteelProfileProperties()
 * @model
 * @generated
 */
public interface IfcStructuralSteelProfileProperties extends IfcStructuralProfileProperties {
	/**
	 * Returns the value of the '<em><b>Shear Area Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Area Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Area Z</em>' reference.
	 * @see #isSetShearAreaZ()
	 * @see #unsetShearAreaZ()
	 * @see #setShearAreaZ(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSteelProfileProperties_ShearAreaZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAreaMeasure getShearAreaZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getShearAreaZ <em>Shear Area Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Area Z</em>' reference.
	 * @see #isSetShearAreaZ()
	 * @see #unsetShearAreaZ()
	 * @see #getShearAreaZ()
	 * @generated
	 */
	void setShearAreaZ(IfcAreaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getShearAreaZ <em>Shear Area Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearAreaZ()
	 * @see #getShearAreaZ()
	 * @see #setShearAreaZ(IfcAreaMeasure)
	 * @generated
	 */
	void unsetShearAreaZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getShearAreaZ <em>Shear Area Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Area Z</em>' reference is set.
	 * @see #unsetShearAreaZ()
	 * @see #getShearAreaZ()
	 * @see #setShearAreaZ(IfcAreaMeasure)
	 * @generated
	 */
	boolean isSetShearAreaZ();

	/**
	 * Returns the value of the '<em><b>Shear Area Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Area Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Area Y</em>' reference.
	 * @see #isSetShearAreaY()
	 * @see #unsetShearAreaY()
	 * @see #setShearAreaY(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSteelProfileProperties_ShearAreaY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAreaMeasure getShearAreaY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getShearAreaY <em>Shear Area Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Area Y</em>' reference.
	 * @see #isSetShearAreaY()
	 * @see #unsetShearAreaY()
	 * @see #getShearAreaY()
	 * @generated
	 */
	void setShearAreaY(IfcAreaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getShearAreaY <em>Shear Area Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearAreaY()
	 * @see #getShearAreaY()
	 * @see #setShearAreaY(IfcAreaMeasure)
	 * @generated
	 */
	void unsetShearAreaY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getShearAreaY <em>Shear Area Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Area Y</em>' reference is set.
	 * @see #unsetShearAreaY()
	 * @see #getShearAreaY()
	 * @see #setShearAreaY(IfcAreaMeasure)
	 * @generated
	 */
	boolean isSetShearAreaY();

	/**
	 * Returns the value of the '<em><b>Plastic Shape Factor Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plastic Shape Factor Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plastic Shape Factor Y</em>' reference.
	 * @see #isSetPlasticShapeFactorY()
	 * @see #unsetPlasticShapeFactorY()
	 * @see #setPlasticShapeFactorY(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSteelProfileProperties_PlasticShapeFactorY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getPlasticShapeFactorY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plastic Shape Factor Y</em>' reference.
	 * @see #isSetPlasticShapeFactorY()
	 * @see #unsetPlasticShapeFactorY()
	 * @see #getPlasticShapeFactorY()
	 * @generated
	 */
	void setPlasticShapeFactorY(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlasticShapeFactorY()
	 * @see #getPlasticShapeFactorY()
	 * @see #setPlasticShapeFactorY(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetPlasticShapeFactorY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plastic Shape Factor Y</em>' reference is set.
	 * @see #unsetPlasticShapeFactorY()
	 * @see #getPlasticShapeFactorY()
	 * @see #setPlasticShapeFactorY(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetPlasticShapeFactorY();

	/**
	 * Returns the value of the '<em><b>Plastic Shape Factor Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plastic Shape Factor Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plastic Shape Factor Z</em>' reference.
	 * @see #isSetPlasticShapeFactorZ()
	 * @see #unsetPlasticShapeFactorZ()
	 * @see #setPlasticShapeFactorZ(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralSteelProfileProperties_PlasticShapeFactorZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getPlasticShapeFactorZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plastic Shape Factor Z</em>' reference.
	 * @see #isSetPlasticShapeFactorZ()
	 * @see #unsetPlasticShapeFactorZ()
	 * @see #getPlasticShapeFactorZ()
	 * @generated
	 */
	void setPlasticShapeFactorZ(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlasticShapeFactorZ()
	 * @see #getPlasticShapeFactorZ()
	 * @see #setPlasticShapeFactorZ(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetPlasticShapeFactorZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralSteelProfileProperties#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Plastic Shape Factor Z</em>' reference is set.
	 * @see #unsetPlasticShapeFactorZ()
	 * @see #getPlasticShapeFactorZ()
	 * @see #setPlasticShapeFactorZ(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetPlasticShapeFactorZ();

} // IfcStructuralSteelProfileProperties
