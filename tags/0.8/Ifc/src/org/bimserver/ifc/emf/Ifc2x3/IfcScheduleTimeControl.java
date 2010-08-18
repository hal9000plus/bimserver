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
 * A representation of the model object '<em><b>Ifc Schedule Time Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getEarlyStart <em>Early Start</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getLateStart <em>Late Start</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleStart <em>Schedule Start</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getEarlyFinish <em>Early Finish</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getLateFinish <em>Late Finish</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleFinish <em>Schedule Finish</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getIsCritical <em>Is Critical</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getStatusTime <em>Status Time</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleTimeControlAssigned <em>Schedule Time Control Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl()
 * @model
 * @generated
 */
public interface IfcScheduleTimeControl extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Actual Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Start</em>' reference.
	 * @see #isSetActualStart()
	 * @see #unsetActualStart()
	 * @see #setActualStart(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_ActualStart()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getActualStart();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualStart <em>Actual Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start</em>' reference.
	 * @see #isSetActualStart()
	 * @see #unsetActualStart()
	 * @see #getActualStart()
	 * @generated
	 */
	void setActualStart(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualStart <em>Actual Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActualStart()
	 * @see #getActualStart()
	 * @see #setActualStart(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetActualStart();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualStart <em>Actual Start</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actual Start</em>' reference is set.
	 * @see #unsetActualStart()
	 * @see #getActualStart()
	 * @see #setActualStart(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetActualStart();

	/**
	 * Returns the value of the '<em><b>Early Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Early Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Early Start</em>' reference.
	 * @see #isSetEarlyStart()
	 * @see #unsetEarlyStart()
	 * @see #setEarlyStart(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_EarlyStart()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getEarlyStart();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getEarlyStart <em>Early Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Start</em>' reference.
	 * @see #isSetEarlyStart()
	 * @see #unsetEarlyStart()
	 * @see #getEarlyStart()
	 * @generated
	 */
	void setEarlyStart(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getEarlyStart <em>Early Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEarlyStart()
	 * @see #getEarlyStart()
	 * @see #setEarlyStart(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetEarlyStart();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getEarlyStart <em>Early Start</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Early Start</em>' reference is set.
	 * @see #unsetEarlyStart()
	 * @see #getEarlyStart()
	 * @see #setEarlyStart(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetEarlyStart();

	/**
	 * Returns the value of the '<em><b>Late Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Late Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Late Start</em>' reference.
	 * @see #isSetLateStart()
	 * @see #unsetLateStart()
	 * @see #setLateStart(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_LateStart()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getLateStart();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getLateStart <em>Late Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Start</em>' reference.
	 * @see #isSetLateStart()
	 * @see #unsetLateStart()
	 * @see #getLateStart()
	 * @generated
	 */
	void setLateStart(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getLateStart <em>Late Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLateStart()
	 * @see #getLateStart()
	 * @see #setLateStart(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetLateStart();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getLateStart <em>Late Start</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Late Start</em>' reference is set.
	 * @see #unsetLateStart()
	 * @see #getLateStart()
	 * @see #setLateStart(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetLateStart();

	/**
	 * Returns the value of the '<em><b>Schedule Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Start</em>' reference.
	 * @see #isSetScheduleStart()
	 * @see #unsetScheduleStart()
	 * @see #setScheduleStart(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_ScheduleStart()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getScheduleStart();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleStart <em>Schedule Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Start</em>' reference.
	 * @see #isSetScheduleStart()
	 * @see #unsetScheduleStart()
	 * @see #getScheduleStart()
	 * @generated
	 */
	void setScheduleStart(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleStart <em>Schedule Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScheduleStart()
	 * @see #getScheduleStart()
	 * @see #setScheduleStart(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetScheduleStart();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleStart <em>Schedule Start</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schedule Start</em>' reference is set.
	 * @see #unsetScheduleStart()
	 * @see #getScheduleStart()
	 * @see #setScheduleStart(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetScheduleStart();

	/**
	 * Returns the value of the '<em><b>Actual Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Finish</em>' reference.
	 * @see #isSetActualFinish()
	 * @see #unsetActualFinish()
	 * @see #setActualFinish(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_ActualFinish()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getActualFinish();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualFinish <em>Actual Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Finish</em>' reference.
	 * @see #isSetActualFinish()
	 * @see #unsetActualFinish()
	 * @see #getActualFinish()
	 * @generated
	 */
	void setActualFinish(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualFinish <em>Actual Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActualFinish()
	 * @see #getActualFinish()
	 * @see #setActualFinish(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetActualFinish();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualFinish <em>Actual Finish</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actual Finish</em>' reference is set.
	 * @see #unsetActualFinish()
	 * @see #getActualFinish()
	 * @see #setActualFinish(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetActualFinish();

	/**
	 * Returns the value of the '<em><b>Early Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Early Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Early Finish</em>' reference.
	 * @see #isSetEarlyFinish()
	 * @see #unsetEarlyFinish()
	 * @see #setEarlyFinish(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_EarlyFinish()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getEarlyFinish();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getEarlyFinish <em>Early Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Finish</em>' reference.
	 * @see #isSetEarlyFinish()
	 * @see #unsetEarlyFinish()
	 * @see #getEarlyFinish()
	 * @generated
	 */
	void setEarlyFinish(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getEarlyFinish <em>Early Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEarlyFinish()
	 * @see #getEarlyFinish()
	 * @see #setEarlyFinish(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetEarlyFinish();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getEarlyFinish <em>Early Finish</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Early Finish</em>' reference is set.
	 * @see #unsetEarlyFinish()
	 * @see #getEarlyFinish()
	 * @see #setEarlyFinish(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetEarlyFinish();

	/**
	 * Returns the value of the '<em><b>Late Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Late Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Late Finish</em>' reference.
	 * @see #isSetLateFinish()
	 * @see #unsetLateFinish()
	 * @see #setLateFinish(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_LateFinish()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getLateFinish();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getLateFinish <em>Late Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Finish</em>' reference.
	 * @see #isSetLateFinish()
	 * @see #unsetLateFinish()
	 * @see #getLateFinish()
	 * @generated
	 */
	void setLateFinish(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getLateFinish <em>Late Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLateFinish()
	 * @see #getLateFinish()
	 * @see #setLateFinish(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetLateFinish();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getLateFinish <em>Late Finish</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Late Finish</em>' reference is set.
	 * @see #unsetLateFinish()
	 * @see #getLateFinish()
	 * @see #setLateFinish(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetLateFinish();

	/**
	 * Returns the value of the '<em><b>Schedule Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Finish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Finish</em>' reference.
	 * @see #isSetScheduleFinish()
	 * @see #unsetScheduleFinish()
	 * @see #setScheduleFinish(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_ScheduleFinish()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getScheduleFinish();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleFinish <em>Schedule Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Finish</em>' reference.
	 * @see #isSetScheduleFinish()
	 * @see #unsetScheduleFinish()
	 * @see #getScheduleFinish()
	 * @generated
	 */
	void setScheduleFinish(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleFinish <em>Schedule Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScheduleFinish()
	 * @see #getScheduleFinish()
	 * @see #setScheduleFinish(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetScheduleFinish();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleFinish <em>Schedule Finish</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schedule Finish</em>' reference is set.
	 * @see #unsetScheduleFinish()
	 * @see #getScheduleFinish()
	 * @see #setScheduleFinish(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetScheduleFinish();

	/**
	 * Returns the value of the '<em><b>Schedule Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Duration</em>' reference.
	 * @see #isSetScheduleDuration()
	 * @see #unsetScheduleDuration()
	 * @see #setScheduleDuration(IfcTimeMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_ScheduleDuration()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getScheduleDuration();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Duration</em>' reference.
	 * @see #isSetScheduleDuration()
	 * @see #unsetScheduleDuration()
	 * @see #getScheduleDuration()
	 * @generated
	 */
	void setScheduleDuration(IfcTimeMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScheduleDuration()
	 * @see #getScheduleDuration()
	 * @see #setScheduleDuration(IfcTimeMeasure)
	 * @generated
	 */
	void unsetScheduleDuration();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schedule Duration</em>' reference is set.
	 * @see #unsetScheduleDuration()
	 * @see #getScheduleDuration()
	 * @see #setScheduleDuration(IfcTimeMeasure)
	 * @generated
	 */
	boolean isSetScheduleDuration();

	/**
	 * Returns the value of the '<em><b>Actual Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Duration</em>' reference.
	 * @see #isSetActualDuration()
	 * @see #unsetActualDuration()
	 * @see #setActualDuration(IfcTimeMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_ActualDuration()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getActualDuration();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Duration</em>' reference.
	 * @see #isSetActualDuration()
	 * @see #unsetActualDuration()
	 * @see #getActualDuration()
	 * @generated
	 */
	void setActualDuration(IfcTimeMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActualDuration()
	 * @see #getActualDuration()
	 * @see #setActualDuration(IfcTimeMeasure)
	 * @generated
	 */
	void unsetActualDuration();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actual Duration</em>' reference is set.
	 * @see #unsetActualDuration()
	 * @see #getActualDuration()
	 * @see #setActualDuration(IfcTimeMeasure)
	 * @generated
	 */
	boolean isSetActualDuration();

	/**
	 * Returns the value of the '<em><b>Remaining Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Time</em>' reference.
	 * @see #isSetRemainingTime()
	 * @see #unsetRemainingTime()
	 * @see #setRemainingTime(IfcTimeMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_RemainingTime()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getRemainingTime();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Time</em>' reference.
	 * @see #isSetRemainingTime()
	 * @see #unsetRemainingTime()
	 * @see #getRemainingTime()
	 * @generated
	 */
	void setRemainingTime(IfcTimeMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemainingTime()
	 * @see #getRemainingTime()
	 * @see #setRemainingTime(IfcTimeMeasure)
	 * @generated
	 */
	void unsetRemainingTime();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remaining Time</em>' reference is set.
	 * @see #unsetRemainingTime()
	 * @see #getRemainingTime()
	 * @see #setRemainingTime(IfcTimeMeasure)
	 * @generated
	 */
	boolean isSetRemainingTime();

	/**
	 * Returns the value of the '<em><b>Free Float</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Float</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Float</em>' reference.
	 * @see #isSetFreeFloat()
	 * @see #unsetFreeFloat()
	 * @see #setFreeFloat(IfcTimeMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_FreeFloat()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getFreeFloat();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Float</em>' reference.
	 * @see #isSetFreeFloat()
	 * @see #unsetFreeFloat()
	 * @see #getFreeFloat()
	 * @generated
	 */
	void setFreeFloat(IfcTimeMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFreeFloat()
	 * @see #getFreeFloat()
	 * @see #setFreeFloat(IfcTimeMeasure)
	 * @generated
	 */
	void unsetFreeFloat();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Free Float</em>' reference is set.
	 * @see #unsetFreeFloat()
	 * @see #getFreeFloat()
	 * @see #setFreeFloat(IfcTimeMeasure)
	 * @generated
	 */
	boolean isSetFreeFloat();

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
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_TotalFloat()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getTotalFloat();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}' reference.
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
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalFloat()
	 * @see #getTotalFloat()
	 * @see #setTotalFloat(IfcTimeMeasure)
	 * @generated
	 */
	void unsetTotalFloat();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Is Critical</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Critical</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Critical</em>' reference.
	 * @see #setIsCritical(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_IsCritical()
	 * @model
	 * @generated
	 */
	IfcLogical getIsCritical();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getIsCritical <em>Is Critical</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Critical</em>' reference.
	 * @see #getIsCritical()
	 * @generated
	 */
	void setIsCritical(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Status Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Time</em>' reference.
	 * @see #isSetStatusTime()
	 * @see #unsetStatusTime()
	 * @see #setStatusTime(IfcDateTimeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_StatusTime()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDateTimeSelect getStatusTime();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getStatusTime <em>Status Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Time</em>' reference.
	 * @see #isSetStatusTime()
	 * @see #unsetStatusTime()
	 * @see #getStatusTime()
	 * @generated
	 */
	void setStatusTime(IfcDateTimeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getStatusTime <em>Status Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatusTime()
	 * @see #getStatusTime()
	 * @see #setStatusTime(IfcDateTimeSelect)
	 * @generated
	 */
	void unsetStatusTime();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getStatusTime <em>Status Time</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status Time</em>' reference is set.
	 * @see #unsetStatusTime()
	 * @see #getStatusTime()
	 * @see #setStatusTime(IfcDateTimeSelect)
	 * @generated
	 */
	boolean isSetStatusTime();

	/**
	 * Returns the value of the '<em><b>Start Float</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Float</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Float</em>' reference.
	 * @see #isSetStartFloat()
	 * @see #unsetStartFloat()
	 * @see #setStartFloat(IfcTimeMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_StartFloat()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getStartFloat();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Float</em>' reference.
	 * @see #isSetStartFloat()
	 * @see #unsetStartFloat()
	 * @see #getStartFloat()
	 * @generated
	 */
	void setStartFloat(IfcTimeMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartFloat()
	 * @see #getStartFloat()
	 * @see #setStartFloat(IfcTimeMeasure)
	 * @generated
	 */
	void unsetStartFloat();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Float</em>' reference is set.
	 * @see #unsetStartFloat()
	 * @see #getStartFloat()
	 * @see #setStartFloat(IfcTimeMeasure)
	 * @generated
	 */
	boolean isSetStartFloat();

	/**
	 * Returns the value of the '<em><b>Finish Float</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Float</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Float</em>' reference.
	 * @see #isSetFinishFloat()
	 * @see #unsetFinishFloat()
	 * @see #setFinishFloat(IfcTimeMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_FinishFloat()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeMeasure getFinishFloat();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Float</em>' reference.
	 * @see #isSetFinishFloat()
	 * @see #unsetFinishFloat()
	 * @see #getFinishFloat()
	 * @generated
	 */
	void setFinishFloat(IfcTimeMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinishFloat()
	 * @see #getFinishFloat()
	 * @see #setFinishFloat(IfcTimeMeasure)
	 * @generated
	 */
	void unsetFinishFloat();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Finish Float</em>' reference is set.
	 * @see #unsetFinishFloat()
	 * @see #getFinishFloat()
	 * @see #setFinishFloat(IfcTimeMeasure)
	 * @generated
	 */
	boolean isSetFinishFloat();

	/**
	 * Returns the value of the '<em><b>Completion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' reference.
	 * @see #isSetCompletion()
	 * @see #unsetCompletion()
	 * @see #setCompletion(IfcPositiveRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_Completion()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPositiveRatioMeasure getCompletion();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getCompletion <em>Completion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion</em>' reference.
	 * @see #isSetCompletion()
	 * @see #unsetCompletion()
	 * @see #getCompletion()
	 * @generated
	 */
	void setCompletion(IfcPositiveRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getCompletion <em>Completion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompletion()
	 * @see #getCompletion()
	 * @see #setCompletion(IfcPositiveRatioMeasure)
	 * @generated
	 */
	void unsetCompletion();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getCompletion <em>Completion</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Completion</em>' reference is set.
	 * @see #unsetCompletion()
	 * @see #getCompletion()
	 * @see #setCompletion(IfcPositiveRatioMeasure)
	 * @generated
	 */
	boolean isSetCompletion();

	/**
	 * Returns the value of the '<em><b>Schedule Time Control Assigned</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.ifc.emf.Ifc2x3.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Time Control Assigned</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Time Control Assigned</em>' reference.
	 * @see #setScheduleTimeControlAssigned(IfcRelAssignsTasks)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcScheduleTimeControl_ScheduleTimeControlAssigned()
	 * @see org.bimserver.ifc.emf.Ifc2x3.IfcRelAssignsTasks#getTimeForTask
	 * @model opposite="TimeForTask"
	 * @generated
	 */
	IfcRelAssignsTasks getScheduleTimeControlAssigned();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcScheduleTimeControl#getScheduleTimeControlAssigned <em>Schedule Time Control Assigned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Time Control Assigned</em>' reference.
	 * @see #getScheduleTimeControlAssigned()
	 * @generated
	 */
	void setScheduleTimeControlAssigned(IfcRelAssignsTasks value);

} // IfcScheduleTimeControl
