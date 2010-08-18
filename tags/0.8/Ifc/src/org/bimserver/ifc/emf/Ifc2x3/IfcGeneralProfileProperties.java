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
 * A representation of the model object '<em><b>Ifc General Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getPhysicalWeight <em>Physical Weight</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getCrossSectionArea <em>Cross Section Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralProfileProperties()
 * @model
 * @generated
 */
public interface IfcGeneralProfileProperties extends IfcProfileProperties {
	/**
	 * Returns the value of the '<em><b>Physical Weight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Weight</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Weight</em>' reference.
	 * @see #isSetPhysicalWeight()
	 * @see #unsetPhysicalWeight()
	 * @see #setPhysicalWeight(IfcMassPerLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralProfileProperties_PhysicalWeight()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMassPerLengthMeasure getPhysicalWeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getPhysicalWeight <em>Physical Weight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Weight</em>' reference.
	 * @see #isSetPhysicalWeight()
	 * @see #unsetPhysicalWeight()
	 * @see #getPhysicalWeight()
	 * @generated
	 */
	void setPhysicalWeight(IfcMassPerLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getPhysicalWeight <em>Physical Weight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhysicalWeight()
	 * @see #getPhysicalWeight()
	 * @see #setPhysicalWeight(IfcMassPerLengthMeasure)
	 * @generated
	 */
	void unsetPhysicalWeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getPhysicalWeight <em>Physical Weight</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Physical Weight</em>' reference is set.
	 * @see #unsetPhysicalWeight()
	 * @see #getPhysicalWeight()
	 * @see #setPhysicalWeight(IfcMassPerLengthMeasure)
	 * @generated
	 */
	boolean isSetPhysicalWeight();

	/**
	 * Returns the value of the '<em><b>Perimeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perimeter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perimeter</em>' reference.
	 * @see #isSetPerimeter()
	 * @see #unsetPerimeter()
	 * @see #setPerimeter(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralProfileProperties_Perimeter()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getPerimeter();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getPerimeter <em>Perimeter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perimeter</em>' reference.
	 * @see #isSetPerimeter()
	 * @see #unsetPerimeter()
	 * @see #getPerimeter()
	 * @generated
	 */
	void setPerimeter(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getPerimeter <em>Perimeter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPerimeter()
	 * @see #getPerimeter()
	 * @see #setPerimeter(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetPerimeter();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getPerimeter <em>Perimeter</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Perimeter</em>' reference is set.
	 * @see #unsetPerimeter()
	 * @see #getPerimeter()
	 * @see #setPerimeter(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetPerimeter();

	/**
	 * Returns the value of the '<em><b>Minimum Plate Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Plate Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Plate Thickness</em>' reference.
	 * @see #isSetMinimumPlateThickness()
	 * @see #unsetMinimumPlateThickness()
	 * @see #setMinimumPlateThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralProfileProperties_MinimumPlateThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getMinimumPlateThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Plate Thickness</em>' reference.
	 * @see #isSetMinimumPlateThickness()
	 * @see #unsetMinimumPlateThickness()
	 * @see #getMinimumPlateThickness()
	 * @generated
	 */
	void setMinimumPlateThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumPlateThickness()
	 * @see #getMinimumPlateThickness()
	 * @see #setMinimumPlateThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetMinimumPlateThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Plate Thickness</em>' reference is set.
	 * @see #unsetMinimumPlateThickness()
	 * @see #getMinimumPlateThickness()
	 * @see #setMinimumPlateThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetMinimumPlateThickness();

	/**
	 * Returns the value of the '<em><b>Maximum Plate Thickness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Plate Thickness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Plate Thickness</em>' reference.
	 * @see #isSetMaximumPlateThickness()
	 * @see #unsetMaximumPlateThickness()
	 * @see #setMaximumPlateThickness(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralProfileProperties_MaximumPlateThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getMaximumPlateThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Plate Thickness</em>' reference.
	 * @see #isSetMaximumPlateThickness()
	 * @see #unsetMaximumPlateThickness()
	 * @see #getMaximumPlateThickness()
	 * @generated
	 */
	void setMaximumPlateThickness(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumPlateThickness()
	 * @see #getMaximumPlateThickness()
	 * @see #setMaximumPlateThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetMaximumPlateThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Plate Thickness</em>' reference is set.
	 * @see #unsetMaximumPlateThickness()
	 * @see #getMaximumPlateThickness()
	 * @see #setMaximumPlateThickness(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetMaximumPlateThickness();

	/**
	 * Returns the value of the '<em><b>Cross Section Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Area</em>' reference.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #setCrossSectionArea(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcGeneralProfileProperties_CrossSectionArea()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAreaMeasure getCrossSectionArea();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getCrossSectionArea <em>Cross Section Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Area</em>' reference.
	 * @see #isSetCrossSectionArea()
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @generated
	 */
	void setCrossSectionArea(IfcAreaMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getCrossSectionArea <em>Cross Section Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(IfcAreaMeasure)
	 * @generated
	 */
	void unsetCrossSectionArea();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcGeneralProfileProperties#getCrossSectionArea <em>Cross Section Area</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cross Section Area</em>' reference is set.
	 * @see #unsetCrossSectionArea()
	 * @see #getCrossSectionArea()
	 * @see #setCrossSectionArea(IfcAreaMeasure)
	 * @generated
	 */
	boolean isSetCrossSectionArea();

} // IfcGeneralProfileProperties
