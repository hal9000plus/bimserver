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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Work Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getCreators <em>Creators</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getWorkControlType <em>Work Control Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getUserDefinedControlType <em>User Defined Control Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl()
 * @model
 * @generated
 */
public interface IfcWorkControl extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(IfcIdentifier)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_Identifier()
	 * @model
	 * @generated
	 */
	IfcIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IfcIdentifier value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' reference.
	 * @see #setCreationDate(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_CreationDate()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getCreationDate();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getCreationDate <em>Creation Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' reference.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Creators</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.ifc.emf.Ifc2x3.IfcPerson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creators</em>' reference list.
	 * @see #isSetCreators()
	 * @see #unsetCreators()
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_Creators()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcPerson> getCreators();

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getCreators <em>Creators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreators()
	 * @see #getCreators()
	 * @generated
	 */
	void unsetCreators();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getCreators <em>Creators</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Creators</em>' reference list is set.
	 * @see #unsetCreators()
	 * @see #getCreators()
	 * @generated
	 */
	boolean isSetCreators();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' reference.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_Purpose()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getPurpose();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getPurpose <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' reference.
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getPurpose <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(IfcLabel)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getPurpose <em>Purpose</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' reference is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(IfcLabel)
	 * @generated
	 */
	boolean isSetPurpose();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(IfcTimeMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_Duration()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getDuration();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(IfcTimeMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(IfcTimeMeasure)
	 * @generated
	 */
	void unsetDuration();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getDuration <em>Duration</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' reference is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(IfcTimeMeasure)
	 * @generated
	 */
	boolean isSetDuration();

	/**
	 * Returns the value of the '<em><b>Total Float</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Float</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Float</em>' reference.
	 * @see #isSetTotalFloat()
	 * @see #unsetTotalFloat()
	 * @see #setTotalFloat(IfcTimeMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_TotalFloat()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getTotalFloat();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getTotalFloat <em>Total Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Float</em>' reference.
	 * @see #isSetTotalFloat()
	 * @see #unsetTotalFloat()
	 * @see #getTotalFloat()
	 * @generated
	 */
	void setTotalFloat(IfcTimeMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getTotalFloat <em>Total Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalFloat()
	 * @see #getTotalFloat()
	 * @see #setTotalFloat(IfcTimeMeasure)
	 * @generated
	 */
	void unsetTotalFloat();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getTotalFloat <em>Total Float</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Float</em>' reference is set.
	 * @see #unsetTotalFloat()
	 * @see #getTotalFloat()
	 * @see #setTotalFloat(IfcTimeMeasure)
	 * @generated
	 */
	boolean isSetTotalFloat();

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' reference.
	 * @see #setStartTime(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_StartTime()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getStartTime();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getStartTime <em>Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' reference.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>Finish Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Time</em>' reference.
	 * @see #isSetFinishTime()
	 * @see #unsetFinishTime()
	 * @see #setFinishTime(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_FinishTime()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getFinishTime();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getFinishTime <em>Finish Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Time</em>' reference.
	 * @see #isSetFinishTime()
	 * @see #unsetFinishTime()
	 * @see #getFinishTime()
	 * @generated
	 */
	void setFinishTime(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getFinishTime <em>Finish Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinishTime()
	 * @see #getFinishTime()
	 * @see #setFinishTime(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetFinishTime();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getFinishTime <em>Finish Time</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Finish Time</em>' reference is set.
	 * @see #unsetFinishTime()
	 * @see #getFinishTime()
	 * @see #setFinishTime(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetFinishTime();

	/**
	 * Returns the value of the '<em><b>Work Control Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControlTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Control Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Control Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcWorkControlTypeEnum
	 * @see #setWorkControlType(IfcWorkControlTypeEnum)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_WorkControlType()
	 * @model
	 * @generated
	 */
	IfcWorkControlTypeEnum getWorkControlType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getWorkControlType <em>Work Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Control Type</em>' attribute.
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcWorkControlTypeEnum
	 * @see #getWorkControlType()
	 * @generated
	 */
	void setWorkControlType(IfcWorkControlTypeEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Control Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Control Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Control Type</em>' reference.
	 * @see #isSetUserDefinedControlType()
	 * @see #unsetUserDefinedControlType()
	 * @see #setUserDefinedControlType(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWorkControl_UserDefinedControlType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getUserDefinedControlType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getUserDefinedControlType <em>User Defined Control Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Control Type</em>' reference.
	 * @see #isSetUserDefinedControlType()
	 * @see #unsetUserDefinedControlType()
	 * @see #getUserDefinedControlType()
	 * @generated
	 */
	void setUserDefinedControlType(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getUserDefinedControlType <em>User Defined Control Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedControlType()
	 * @see #getUserDefinedControlType()
	 * @see #setUserDefinedControlType(IfcLabel)
	 * @generated
	 */
	void unsetUserDefinedControlType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWorkControl#getUserDefinedControlType <em>User Defined Control Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Control Type</em>' reference is set.
	 * @see #unsetUserDefinedControlType()
	 * @see #getUserDefinedControlType()
	 * @see #setUserDefinedControlType(IfcLabel)
	 * @generated
	 */
	boolean isSetUserDefinedControlType();

} // IfcWorkControl
