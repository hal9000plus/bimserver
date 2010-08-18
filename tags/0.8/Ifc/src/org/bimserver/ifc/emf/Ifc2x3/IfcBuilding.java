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
 * A representation of the model object '<em><b>Ifc Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getBuildingAddress <em>Building Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBuilding()
 * @model
 * @generated
 */
public interface IfcBuilding extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Elevation Of Ref Height</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Of Ref Height</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Of Ref Height</em>' reference.
	 * @see #isSetElevationOfRefHeight()
	 * @see #unsetElevationOfRefHeight()
	 * @see #setElevationOfRefHeight(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBuilding_ElevationOfRefHeight()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getElevationOfRefHeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Of Ref Height</em>' reference.
	 * @see #isSetElevationOfRefHeight()
	 * @see #unsetElevationOfRefHeight()
	 * @see #getElevationOfRefHeight()
	 * @generated
	 */
	void setElevationOfRefHeight(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationOfRefHeight()
	 * @see #getElevationOfRefHeight()
	 * @see #setElevationOfRefHeight(IfcLengthMeasure)
	 * @generated
	 */
	void unsetElevationOfRefHeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation Of Ref Height</em>' reference is set.
	 * @see #unsetElevationOfRefHeight()
	 * @see #getElevationOfRefHeight()
	 * @see #setElevationOfRefHeight(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetElevationOfRefHeight();

	/**
	 * Returns the value of the '<em><b>Elevation Of Terrain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Of Terrain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Of Terrain</em>' reference.
	 * @see #isSetElevationOfTerrain()
	 * @see #unsetElevationOfTerrain()
	 * @see #setElevationOfTerrain(IfcLengthMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBuilding_ElevationOfTerrain()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLengthMeasure getElevationOfTerrain();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Of Terrain</em>' reference.
	 * @see #isSetElevationOfTerrain()
	 * @see #unsetElevationOfTerrain()
	 * @see #getElevationOfTerrain()
	 * @generated
	 */
	void setElevationOfTerrain(IfcLengthMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationOfTerrain()
	 * @see #getElevationOfTerrain()
	 * @see #setElevationOfTerrain(IfcLengthMeasure)
	 * @generated
	 */
	void unsetElevationOfTerrain();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation Of Terrain</em>' reference is set.
	 * @see #unsetElevationOfTerrain()
	 * @see #getElevationOfTerrain()
	 * @see #setElevationOfTerrain(IfcLengthMeasure)
	 * @generated
	 */
	boolean isSetElevationOfTerrain();

	/**
	 * Returns the value of the '<em><b>Building Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Address</em>' reference.
	 * @see #isSetBuildingAddress()
	 * @see #unsetBuildingAddress()
	 * @see #setBuildingAddress(IfcPostalAddress)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcBuilding_BuildingAddress()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPostalAddress getBuildingAddress();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getBuildingAddress <em>Building Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Address</em>' reference.
	 * @see #isSetBuildingAddress()
	 * @see #unsetBuildingAddress()
	 * @see #getBuildingAddress()
	 * @generated
	 */
	void setBuildingAddress(IfcPostalAddress value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getBuildingAddress <em>Building Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuildingAddress()
	 * @see #getBuildingAddress()
	 * @see #setBuildingAddress(IfcPostalAddress)
	 * @generated
	 */
	void unsetBuildingAddress();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcBuilding#getBuildingAddress <em>Building Address</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Building Address</em>' reference is set.
	 * @see #unsetBuildingAddress()
	 * @see #getBuildingAddress()
	 * @see #setBuildingAddress(IfcPostalAddress)
	 * @generated
	 */
	boolean isSetBuildingAddress();

} // IfcBuilding
