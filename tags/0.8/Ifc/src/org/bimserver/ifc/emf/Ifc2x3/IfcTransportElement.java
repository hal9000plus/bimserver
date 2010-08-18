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
 * A representation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTransportElement()
 * @model
 * @generated
 */
public interface IfcTransportElement extends IfcElement {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElementTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcTransportElementTypeEnum
	 * @see #setOperationType(IfcTransportElementTypeEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTransportElement_OperationType()
	 * @model
	 * @generated
	 */
	IfcTransportElementTypeEnum getOperationType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcTransportElementTypeEnum
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcTransportElementTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Capacity By Weight</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Weight</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Weight</em>' reference.
	 * @see #isSetCapacityByWeight()
	 * @see #unsetCapacityByWeight()
	 * @see #setCapacityByWeight(IfcMassMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTransportElement_CapacityByWeight()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMassMeasure getCapacityByWeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Weight</em>' reference.
	 * @see #isSetCapacityByWeight()
	 * @see #unsetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @generated
	 */
	void setCapacityByWeight(IfcMassMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @see #setCapacityByWeight(IfcMassMeasure)
	 * @generated
	 */
	void unsetCapacityByWeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity By Weight</em>' reference is set.
	 * @see #unsetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @see #setCapacityByWeight(IfcMassMeasure)
	 * @generated
	 */
	boolean isSetCapacityByWeight();

	/**
	 * Returns the value of the '<em><b>Capacity By Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Number</em>' reference.
	 * @see #isSetCapacityByNumber()
	 * @see #unsetCapacityByNumber()
	 * @see #setCapacityByNumber(IfcCountMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTransportElement_CapacityByNumber()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCountMeasure getCapacityByNumber();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Number</em>' reference.
	 * @see #isSetCapacityByNumber()
	 * @see #unsetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @generated
	 */
	void setCapacityByNumber(IfcCountMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @see #setCapacityByNumber(IfcCountMeasure)
	 * @generated
	 */
	void unsetCapacityByNumber();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity By Number</em>' reference is set.
	 * @see #unsetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @see #setCapacityByNumber(IfcCountMeasure)
	 * @generated
	 */
	boolean isSetCapacityByNumber();

} // IfcTransportElement
