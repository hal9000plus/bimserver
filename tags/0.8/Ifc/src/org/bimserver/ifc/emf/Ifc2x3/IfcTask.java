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
 * A representation of the model object '<em><b>Ifc Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getStatus <em>Status</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getWorkMethod <em>Work Method</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getIsMilestone <em>Is Milestone</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTask()
 * @model
 * @generated
 */
public interface IfcTask extends IfcProcess {
	/**
	 * Returns the value of the '<em><b>Task Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Id</em>' reference.
	 * @see #setTaskId(IfcIdentifier)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTask_TaskId()
	 * @model
	 * @generated
	 */
	IfcIdentifier getTaskId();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getTaskId <em>Task Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Id</em>' reference.
	 * @see #getTaskId()
	 * @generated
	 */
	void setTaskId(IfcIdentifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTask_Status()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getStatus();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(IfcLabel)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getStatus <em>Status</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' reference is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(IfcLabel)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Work Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Method</em>' reference.
	 * @see #isSetWorkMethod()
	 * @see #unsetWorkMethod()
	 * @see #setWorkMethod(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTask_WorkMethod()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getWorkMethod();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getWorkMethod <em>Work Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Method</em>' reference.
	 * @see #isSetWorkMethod()
	 * @see #unsetWorkMethod()
	 * @see #getWorkMethod()
	 * @generated
	 */
	void setWorkMethod(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getWorkMethod <em>Work Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkMethod()
	 * @see #getWorkMethod()
	 * @see #setWorkMethod(IfcLabel)
	 * @generated
	 */
	void unsetWorkMethod();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getWorkMethod <em>Work Method</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Work Method</em>' reference is set.
	 * @see #unsetWorkMethod()
	 * @see #getWorkMethod()
	 * @see #setWorkMethod(IfcLabel)
	 * @generated
	 */
	boolean isSetWorkMethod();

	/**
	 * Returns the value of the '<em><b>Is Milestone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Milestone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Milestone</em>' reference.
	 * @see #setIsMilestone(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTask_IsMilestone()
	 * @model
	 * @generated
	 */
	IfcLogical getIsMilestone();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getIsMilestone <em>Is Milestone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Milestone</em>' reference.
	 * @see #getIsMilestone()
	 * @generated
	 */
	void setIsMilestone(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(IfcInteger)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTask_Priority()
	 * @model
	 * @generated
	 */
	IfcInteger getPriority();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTask#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(IfcInteger value);

} // IfcTask
