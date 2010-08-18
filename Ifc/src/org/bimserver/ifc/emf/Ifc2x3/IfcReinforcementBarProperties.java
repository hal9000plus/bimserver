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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Reinforcement Bar Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getTotalCrossSectionArea <em>Total Cross Section Area</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getSteelGrade <em>Steel Grade</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getBarSurface <em>Bar Surface</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getEffectiveDepth <em>Effective Depth</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getNominalBarDiameter <em>Nominal Bar Diameter</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getBarCount <em>Bar Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcementBarProperties()
 * @model
 * @generated
 */
public interface IfcReinforcementBarProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Total Cross Section Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Cross Section Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Cross Section Area</em>' reference.
	 * @see #setTotalCrossSectionArea(IfcAreaMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcementBarProperties_TotalCrossSectionArea()
	 * @model
	 * @generated
	 */
	IfcAreaMeasure getTotalCrossSectionArea();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getTotalCrossSectionArea <em>Total Cross Section Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Cross Section Area</em>' reference.
	 * @see #getTotalCrossSectionArea()
	 * @generated
	 */
	void setTotalCrossSectionArea(IfcAreaMeasure value);

	/**
	 * Returns the value of the '<em><b>Steel Grade</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steel Grade</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steel Grade</em>' reference.
	 * @see #setSteelGrade(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcementBarProperties_SteelGrade()
	 * @model
	 * @generated
	 */
	IfcLabel getSteelGrade();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getSteelGrade <em>Steel Grade</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steel Grade</em>' reference.
	 * @see #getSteelGrade()
	 * @generated
	 */
	void setSteelGrade(IfcLabel value);

	/**
	 * Returns the value of the '<em><b>Bar Surface</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingBarSurfaceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Surface</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingBarSurfaceEnum
	 * @see #setBarSurface(IfcReinforcingBarSurfaceEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcementBarProperties_BarSurface()
	 * @model
	 * @generated
	 */
	IfcReinforcingBarSurfaceEnum getBarSurface();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getBarSurface <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Surface</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcReinforcingBarSurfaceEnum
	 * @see #getBarSurface()
	 * @generated
	 */
	void setBarSurface(IfcReinforcingBarSurfaceEnum value);

	/**
	 * Returns the value of the '<em><b>Effective Depth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Depth</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Depth</em>' reference.
	 * @see #isSetEffectiveDepth()
	 * @see #unsetEffectiveDepth()
	 * @see #setEffectiveDepth(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcementBarProperties_EffectiveDepth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getEffectiveDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getEffectiveDepth <em>Effective Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Depth</em>' reference.
	 * @see #isSetEffectiveDepth()
	 * @see #unsetEffectiveDepth()
	 * @see #getEffectiveDepth()
	 * @generated
	 */
	void setEffectiveDepth(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getEffectiveDepth <em>Effective Depth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffectiveDepth()
	 * @see #getEffectiveDepth()
	 * @see #setEffectiveDepth(IfcLengthMeasure)
	 * @generated
	 */
	void unsetEffectiveDepth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getEffectiveDepth <em>Effective Depth</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effective Depth</em>' reference is set.
	 * @see #unsetEffectiveDepth()
	 * @see #getEffectiveDepth()
	 * @see #setEffectiveDepth(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetEffectiveDepth();

	/**
	 * Returns the value of the '<em><b>Nominal Bar Diameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Bar Diameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Bar Diameter</em>' reference.
	 * @see #isSetNominalBarDiameter()
	 * @see #unsetNominalBarDiameter()
	 * @see #setNominalBarDiameter(IfcPositiveLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcementBarProperties_NominalBarDiameter()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveLengthMeasure getNominalBarDiameter();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getNominalBarDiameter <em>Nominal Bar Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Bar Diameter</em>' reference.
	 * @see #isSetNominalBarDiameter()
	 * @see #unsetNominalBarDiameter()
	 * @see #getNominalBarDiameter()
	 * @generated
	 */
	void setNominalBarDiameter(IfcPositiveLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getNominalBarDiameter <em>Nominal Bar Diameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominalBarDiameter()
	 * @see #getNominalBarDiameter()
	 * @see #setNominalBarDiameter(IfcPositiveLengthMeasure)
	 * @generated
	 */
	void unsetNominalBarDiameter();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getNominalBarDiameter <em>Nominal Bar Diameter</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal Bar Diameter</em>' reference is set.
	 * @see #unsetNominalBarDiameter()
	 * @see #getNominalBarDiameter()
	 * @see #setNominalBarDiameter(IfcPositiveLengthMeasure)
	 * @generated
	 */
	boolean isSetNominalBarDiameter();

	/**
	 * Returns the value of the '<em><b>Bar Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Count</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Count</em>' reference.
	 * @see #isSetBarCount()
	 * @see #unsetBarCount()
	 * @see #setBarCount(IfcCountMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcReinforcementBarProperties_BarCount()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCountMeasure getBarCount();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getBarCount <em>Bar Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Count</em>' reference.
	 * @see #isSetBarCount()
	 * @see #unsetBarCount()
	 * @see #getBarCount()
	 * @generated
	 */
	void setBarCount(IfcCountMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getBarCount <em>Bar Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBarCount()
	 * @see #getBarCount()
	 * @see #setBarCount(IfcCountMeasure)
	 * @generated
	 */
	void unsetBarCount();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcReinforcementBarProperties#getBarCount <em>Bar Count</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bar Count</em>' reference is set.
	 * @see #unsetBarCount()
	 * @see #getBarCount()
	 * @see #setBarCount(IfcCountMeasure)
	 * @generated
	 */
	boolean isSetBarCount();

} // IfcReinforcementBarProperties
