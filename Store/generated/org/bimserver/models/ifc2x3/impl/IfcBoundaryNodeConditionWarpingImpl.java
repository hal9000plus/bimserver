/**
 *  (c) Copyright bimserver.org 2009
 *  Licensed under GNU GPLv3
 *  http://www.gnu.org/licenses/gpl-3.0.txt
 *  For more information mail to license@bimserver.org
 *  
 *  Bimserver.org is free software: you can redistribute it and/or modify 
 *  it under the terms of the GNU General Public License as published by 
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  Bimserver.org is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License a 
 *  long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcBoundaryNodeConditionWarping;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Node Condition Warping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcBoundaryNodeConditionWarpingImpl#getWarpingStiffness <em>Warping Stiffness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcBoundaryNodeConditionWarpingImpl#getWarpingStiffnessAsString <em>Warping Stiffness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryNodeConditionWarpingImpl extends IfcBoundaryNodeConditionImpl implements IfcBoundaryNodeConditionWarping
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryNodeConditionWarpingImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWarpingStiffness()
	{
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingStiffness(float newWarpingStiffness)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffness(), newWarpingStiffness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingStiffness()
	{
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingStiffness()
	{
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarpingStiffnessAsString()
	{
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffnessAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingStiffnessAsString(String newWarpingStiffnessAsString)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffnessAsString(), newWarpingStiffnessAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingStiffnessAsString()
	{
		eUnset(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffnessAsString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingStiffnessAsString()
	{
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcBoundaryNodeConditionWarping_WarpingStiffnessAsString());
	}

} //IfcBoundaryNodeConditionWarpingImpl