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
package org.bimserver.ifc.emf.Ifc2x3.impl;

import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcPositiveLengthMeasure;
import org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateDirectionEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcRibPlateProfileProperties;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rib Plate Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRibPlateProfilePropertiesImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRibPlateProfilePropertiesImpl#getRibHeight <em>Rib Height</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRibPlateProfilePropertiesImpl#getRibWidth <em>Rib Width</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRibPlateProfilePropertiesImpl#getRibSpacing <em>Rib Spacing</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.impl.IfcRibPlateProfilePropertiesImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRibPlateProfilePropertiesImpl extends IfcProfilePropertiesImpl implements IfcRibPlateProfileProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRibPlateProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getThickness() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(IfcPositiveLengthMeasure newThickness) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness(), newThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThickness() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThickness() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_Thickness());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getRibHeight() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibHeight(IfcPositiveLengthMeasure newRibHeight) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight(), newRibHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibHeight() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibHeight() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getRibWidth() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibWidth(IfcPositiveLengthMeasure newRibWidth) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth(), newRibWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibWidth() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibWidth() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibWidth());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasure getRibSpacing() {
		return (IfcPositiveLengthMeasure) eGet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibSpacing(IfcPositiveLengthMeasure newRibSpacing) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing(), newRibSpacing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibSpacing() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibSpacing() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_RibSpacing());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateDirectionEnum getDirection() {
		return (IfcRibPlateDirectionEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_Direction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(IfcRibPlateDirectionEnum newDirection) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRibPlateProfileProperties_Direction(), newDirection);
	}

} //IfcRibPlateProfilePropertiesImpl
