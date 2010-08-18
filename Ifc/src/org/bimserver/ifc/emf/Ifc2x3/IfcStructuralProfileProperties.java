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
 * A representation of the model object '<em><b>Ifc Structural Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties()
 * @model
 * @generated
 */
public interface IfcStructuralProfileProperties extends IfcGeneralProfileProperties {
	/**
	 * Returns the value of the '<em><b>Torsional Constant X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Constant X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Constant X</em>' reference.
	 * @see #isSetTorsionalConstantX()
	 * @see #unsetTorsionalConstantX()
	 * @see #setTorsionalConstantX(IfcMomentOfInertiaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_TorsionalConstantX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMomentOfInertiaMeasure getTorsionalConstantX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Constant X</em>' reference.
	 * @see #isSetTorsionalConstantX()
	 * @see #unsetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @generated
	 */
	void setTorsionalConstantX(IfcMomentOfInertiaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @see #setTorsionalConstantX(IfcMomentOfInertiaMeasure)
	 * @generated
	 */
	void unsetTorsionalConstantX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Torsional Constant X</em>' reference is set.
	 * @see #unsetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @see #setTorsionalConstantX(IfcMomentOfInertiaMeasure)
	 * @generated
	 */
	boolean isSetTorsionalConstantX();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia YZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia YZ</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia YZ</em>' reference.
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(IfcMomentOfInertiaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaYZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMomentOfInertiaMeasure getMomentOfInertiaYZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia YZ</em>' reference.
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @generated
	 */
	void setMomentOfInertiaYZ(IfcMomentOfInertiaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(IfcMomentOfInertiaMeasure)
	 * @generated
	 */
	void unsetMomentOfInertiaYZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia YZ</em>' reference is set.
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(IfcMomentOfInertiaMeasure)
	 * @generated
	 */
	boolean isSetMomentOfInertiaYZ();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia Y</em>' reference.
	 * @see #isSetMomentOfInertiaY()
	 * @see #unsetMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(IfcMomentOfInertiaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMomentOfInertiaMeasure getMomentOfInertiaY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia Y</em>' reference.
	 * @see #isSetMomentOfInertiaY()
	 * @see #unsetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @generated
	 */
	void setMomentOfInertiaY(IfcMomentOfInertiaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(IfcMomentOfInertiaMeasure)
	 * @generated
	 */
	void unsetMomentOfInertiaY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia Y</em>' reference is set.
	 * @see #unsetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(IfcMomentOfInertiaMeasure)
	 * @generated
	 */
	boolean isSetMomentOfInertiaY();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia Z</em>' reference.
	 * @see #isSetMomentOfInertiaZ()
	 * @see #unsetMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(IfcMomentOfInertiaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMomentOfInertiaMeasure getMomentOfInertiaZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia Z</em>' reference.
	 * @see #isSetMomentOfInertiaZ()
	 * @see #unsetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @generated
	 */
	void setMomentOfInertiaZ(IfcMomentOfInertiaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(IfcMomentOfInertiaMeasure)
	 * @generated
	 */
	void unsetMomentOfInertiaZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia Z</em>' reference is set.
	 * @see #unsetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(IfcMomentOfInertiaMeasure)
	 * @generated
	 */
	boolean isSetMomentOfInertiaZ();

	/**
	 * Returns the value of the '<em><b>Warping Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Constant</em>' reference.
	 * @see #isSetWarpingConstant()
	 * @see #unsetWarpingConstant()
	 * @see #setWarpingConstant(IfcWarpingConstantMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_WarpingConstant()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcWarpingConstantMeasure getWarpingConstant();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Constant</em>' reference.
	 * @see #isSetWarpingConstant()
	 * @see #unsetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @generated
	 */
	void setWarpingConstant(IfcWarpingConstantMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @see #setWarpingConstant(IfcWarpingConstantMeasure)
	 * @generated
	 */
	void unsetWarpingConstant();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warping Constant</em>' reference is set.
	 * @see #unsetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @see #setWarpingConstant(IfcWarpingConstantMeasure)
	 * @generated
	 */
	boolean isSetWarpingConstant();

	/**
	 * Returns the value of the '<em><b>Shear Centre Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre Z</em>' reference.
	 * @see #isSetShearCentreZ()
	 * @see #unsetShearCentreZ()
	 * @see #setShearCentreZ(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearCentreZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getShearCentreZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre Z</em>' reference.
	 * @see #isSetShearCentreZ()
	 * @see #unsetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @generated
	 */
	void setShearCentreZ(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @see #setShearCentreZ(IfcLengthMeasure)
	 * @generated
	 */
	void unsetShearCentreZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Centre Z</em>' reference is set.
	 * @see #unsetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @see #setShearCentreZ(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetShearCentreZ();

	/**
	 * Returns the value of the '<em><b>Shear Centre Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre Y</em>' reference.
	 * @see #isSetShearCentreY()
	 * @see #unsetShearCentreY()
	 * @see #setShearCentreY(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearCentreY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getShearCentreY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre Y</em>' reference.
	 * @see #isSetShearCentreY()
	 * @see #unsetShearCentreY()
	 * @see #getShearCentreY()
	 * @generated
	 */
	void setShearCentreY(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearCentreY()
	 * @see #getShearCentreY()
	 * @see #setShearCentreY(IfcLengthMeasure)
	 * @generated
	 */
	void unsetShearCentreY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Centre Y</em>' reference is set.
	 * @see #unsetShearCentreY()
	 * @see #getShearCentreY()
	 * @see #setShearCentreY(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetShearCentreY();

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area Z</em>' reference.
	 * @see #isSetShearDeformationAreaZ()
	 * @see #unsetShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearDeformationAreaZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAreaMeasure getShearDeformationAreaZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area Z</em>' reference.
	 * @see #isSetShearDeformationAreaZ()
	 * @see #unsetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @generated
	 */
	void setShearDeformationAreaZ(IfcAreaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(IfcAreaMeasure)
	 * @generated
	 */
	void unsetShearDeformationAreaZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Deformation Area Z</em>' reference is set.
	 * @see #unsetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(IfcAreaMeasure)
	 * @generated
	 */
	boolean isSetShearDeformationAreaZ();

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area Y</em>' reference.
	 * @see #isSetShearDeformationAreaY()
	 * @see #unsetShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearDeformationAreaY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAreaMeasure getShearDeformationAreaY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area Y</em>' reference.
	 * @see #isSetShearDeformationAreaY()
	 * @see #unsetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @generated
	 */
	void setShearDeformationAreaY(IfcAreaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(IfcAreaMeasure)
	 * @generated
	 */
	void unsetShearDeformationAreaY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Deformation Area Y</em>' reference is set.
	 * @see #unsetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(IfcAreaMeasure)
	 * @generated
	 */
	boolean isSetShearDeformationAreaY();

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus Y</em>' reference.
	 * @see #isSetMaximumSectionModulusY()
	 * @see #unsetMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(IfcSectionModulusMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MaximumSectionModulusY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSectionModulusMeasure getMaximumSectionModulusY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus Y</em>' reference.
	 * @see #isSetMaximumSectionModulusY()
	 * @see #unsetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @generated
	 */
	void setMaximumSectionModulusY(IfcSectionModulusMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(IfcSectionModulusMeasure)
	 * @generated
	 */
	void unsetMaximumSectionModulusY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Section Modulus Y</em>' reference is set.
	 * @see #unsetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(IfcSectionModulusMeasure)
	 * @generated
	 */
	boolean isSetMaximumSectionModulusY();

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus Y</em>' reference.
	 * @see #isSetMinimumSectionModulusY()
	 * @see #unsetMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(IfcSectionModulusMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MinimumSectionModulusY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSectionModulusMeasure getMinimumSectionModulusY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus Y</em>' reference.
	 * @see #isSetMinimumSectionModulusY()
	 * @see #unsetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @generated
	 */
	void setMinimumSectionModulusY(IfcSectionModulusMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(IfcSectionModulusMeasure)
	 * @generated
	 */
	void unsetMinimumSectionModulusY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Section Modulus Y</em>' reference is set.
	 * @see #unsetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(IfcSectionModulusMeasure)
	 * @generated
	 */
	boolean isSetMinimumSectionModulusY();

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus Z</em>' reference.
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(IfcSectionModulusMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MaximumSectionModulusZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSectionModulusMeasure getMaximumSectionModulusZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus Z</em>' reference.
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @generated
	 */
	void setMaximumSectionModulusZ(IfcSectionModulusMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(IfcSectionModulusMeasure)
	 * @generated
	 */
	void unsetMaximumSectionModulusZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Section Modulus Z</em>' reference is set.
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(IfcSectionModulusMeasure)
	 * @generated
	 */
	boolean isSetMaximumSectionModulusZ();

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus Z</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus Z</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus Z</em>' reference.
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(IfcSectionModulusMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MinimumSectionModulusZ()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSectionModulusMeasure getMinimumSectionModulusZ();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus Z</em>' reference.
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @generated
	 */
	void setMinimumSectionModulusZ(IfcSectionModulusMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(IfcSectionModulusMeasure)
	 * @generated
	 */
	void unsetMinimumSectionModulusZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Section Modulus Z</em>' reference is set.
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(IfcSectionModulusMeasure)
	 * @generated
	 */
	boolean isSetMinimumSectionModulusZ();

	/**
	 * Returns the value of the '<em><b>Torsional Section Modulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Section Modulus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Section Modulus</em>' reference.
	 * @see #isSetTorsionalSectionModulus()
	 * @see #unsetTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(IfcSectionModulusMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_TorsionalSectionModulus()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSectionModulusMeasure getTorsionalSectionModulus();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Section Modulus</em>' reference.
	 * @see #isSetTorsionalSectionModulus()
	 * @see #unsetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @generated
	 */
	void setTorsionalSectionModulus(IfcSectionModulusMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(IfcSectionModulusMeasure)
	 * @generated
	 */
	void unsetTorsionalSectionModulus();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Torsional Section Modulus</em>' reference is set.
	 * @see #unsetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(IfcSectionModulusMeasure)
	 * @generated
	 */
	boolean isSetTorsionalSectionModulus();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In X</em>' reference.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_CentreOfGravityInX()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getCentreOfGravityInX();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In X</em>' reference.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @generated
	 */
	void setCentreOfGravityInX(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(IfcLengthMeasure)
	 * @generated
	 */
	void unsetCentreOfGravityInX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In X</em>' reference is set.
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetCentreOfGravityInX();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In Y</em>' reference.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_CentreOfGravityInY()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In Y</em>' reference.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @generated
	 */
	void setCentreOfGravityInY(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcLengthMeasure)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' reference is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

} // IfcStructuralProfileProperties
