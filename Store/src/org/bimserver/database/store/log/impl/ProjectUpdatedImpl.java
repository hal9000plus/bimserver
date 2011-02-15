/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.store.log.impl;

import org.bimserver.database.store.Project;
import org.bimserver.database.store.log.LogPackage;
import org.bimserver.database.store.log.ProjectUpdated;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Updated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.database.store.log.impl.ProjectUpdatedImpl#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectUpdatedImpl extends LogActionImpl implements ProjectUpdated {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectUpdatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.PROJECT_UPDATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		Project project = (Project)eVirtualGet(LogPackage.PROJECT_UPDATED__PROJECT);
		if (project != null && ((EObject)project).eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				eVirtualSet(LogPackage.PROJECT_UPDATED__PROJECT, project);
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.PROJECT_UPDATED__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return (Project)eVirtualGet(LogPackage.PROJECT_UPDATED__PROJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		Project project = newProject;
		Object oldProject = eVirtualSet(LogPackage.PROJECT_UPDATED__PROJECT, project);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.PROJECT_UPDATED__PROJECT, oldProject == EVIRTUAL_NO_VALUE ? null : oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackage.PROJECT_UPDATED__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogPackage.PROJECT_UPDATED__PROJECT:
				setProject((Project)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogPackage.PROJECT_UPDATED__PROJECT:
				setProject((Project)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogPackage.PROJECT_UPDATED__PROJECT:
				return eVirtualGet(LogPackage.PROJECT_UPDATED__PROJECT) != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectUpdatedImpl
