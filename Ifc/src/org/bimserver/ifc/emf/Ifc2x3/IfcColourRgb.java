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
 * A representation of the model object '<em><b>Ifc Colour Rgb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcColourRgb#getRed <em>Red</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcColourRgb#getGreen <em>Green</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcColourRgb#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcColourRgb()
 * @model
 * @generated
 */
public interface IfcColourRgb extends IfcColourSpecification, IfcColourOrFactor {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' reference.
	 * @see #setRed(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcColourRgb_Red()
	 * @model
	 * @generated
	 */
	IfcNormalisedRatioMeasure getRed();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcColourRgb#getRed <em>Red</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' reference.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(IfcNormalisedRatioMeasure value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' reference.
	 * @see #setGreen(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcColourRgb_Green()
	 * @model
	 * @generated
	 */
	IfcNormalisedRatioMeasure getGreen();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcColourRgb#getGreen <em>Green</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' reference.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(IfcNormalisedRatioMeasure value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' reference.
	 * @see #setBlue(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcColourRgb_Blue()
	 * @model
	 * @generated
	 */
	IfcNormalisedRatioMeasure getBlue();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcColourRgb#getBlue <em>Blue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' reference.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(IfcNormalisedRatioMeasure value);

} // IfcColourRgb
