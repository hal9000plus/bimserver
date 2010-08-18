/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.store.impl;

import java.util.Collection;

import org.bimserver.database.store.Checkout;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.Project;
import org.bimserver.database.store.StorePackage;
import org.bimserver.database.store.VirtualRevision;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.database.store.impl.VirtualRevisionImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.VirtualRevisionImpl#getLastRevision <em>Last Revision</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.VirtualRevisionImpl#getCheckouts <em>Checkouts</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.VirtualRevisionImpl#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualRevisionImpl extends RevisionImpl implements VirtualRevision {
	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteRevision> revisions;
	/**
	 * The cached value of the '{@link #getLastRevision() <em>Last Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevision()
	 * @generated
	 * @ordered
	 */
	protected ConcreteRevision lastRevision;
	/**
	 * The cached value of the '{@link #getCheckouts() <em>Checkouts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckouts()
	 * @generated
	 * @ordered
	 */
	protected EList<Checkout> checkouts;
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.VIRTUAL_REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.VIRTUAL_REVISION__PROJECT, oldProject, project));
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
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.VIRTUAL_REVISION__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__VIRTUAL_REVISIONS, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, StorePackage.PROJECT__VIRTUAL_REVISIONS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VIRTUAL_REVISION__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteRevision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectResolvingEList<ConcreteRevision>(ConcreteRevision.class, this, StorePackage.VIRTUAL_REVISION__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteRevision getLastRevision() {
		if (lastRevision != null && lastRevision.eIsProxy()) {
			InternalEObject oldLastRevision = (InternalEObject)lastRevision;
			lastRevision = (ConcreteRevision)eResolveProxy(oldLastRevision);
			if (lastRevision != oldLastRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.VIRTUAL_REVISION__LAST_REVISION, oldLastRevision, lastRevision));
			}
		}
		return lastRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteRevision basicGetLastRevision() {
		return lastRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevision(ConcreteRevision newLastRevision) {
		ConcreteRevision oldLastRevision = lastRevision;
		lastRevision = newLastRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VIRTUAL_REVISION__LAST_REVISION, oldLastRevision, lastRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Checkout> getCheckouts() {
		if (checkouts == null) {
			checkouts = new EObjectWithInverseResolvingEList<Checkout>(Checkout.class, this, StorePackage.VIRTUAL_REVISION__CHECKOUTS, StorePackage.CHECKOUT__REVISION);
		}
		return checkouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.VIRTUAL_REVISION__CHECKOUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCheckouts()).basicAdd(otherEnd, msgs);
			case StorePackage.VIRTUAL_REVISION__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__VIRTUAL_REVISIONS, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.VIRTUAL_REVISION__CHECKOUTS:
				return ((InternalEList<?>)getCheckouts()).basicRemove(otherEnd, msgs);
			case StorePackage.VIRTUAL_REVISION__PROJECT:
				return basicSetProject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.VIRTUAL_REVISION__REVISIONS:
				return getRevisions();
			case StorePackage.VIRTUAL_REVISION__LAST_REVISION:
				if (resolve) return getLastRevision();
				return basicGetLastRevision();
			case StorePackage.VIRTUAL_REVISION__CHECKOUTS:
				return getCheckouts();
			case StorePackage.VIRTUAL_REVISION__PROJECT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StorePackage.VIRTUAL_REVISION__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends ConcreteRevision>)newValue);
				return;
			case StorePackage.VIRTUAL_REVISION__LAST_REVISION:
				setLastRevision((ConcreteRevision)newValue);
				return;
			case StorePackage.VIRTUAL_REVISION__CHECKOUTS:
				getCheckouts().clear();
				getCheckouts().addAll((Collection<? extends Checkout>)newValue);
				return;
			case StorePackage.VIRTUAL_REVISION__PROJECT:
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
			case StorePackage.VIRTUAL_REVISION__REVISIONS:
				getRevisions().clear();
				return;
			case StorePackage.VIRTUAL_REVISION__LAST_REVISION:
				setLastRevision((ConcreteRevision)null);
				return;
			case StorePackage.VIRTUAL_REVISION__CHECKOUTS:
				getCheckouts().clear();
				return;
			case StorePackage.VIRTUAL_REVISION__PROJECT:
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
			case StorePackage.VIRTUAL_REVISION__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case StorePackage.VIRTUAL_REVISION__LAST_REVISION:
				return lastRevision != null;
			case StorePackage.VIRTUAL_REVISION__CHECKOUTS:
				return checkouts != null && !checkouts.isEmpty();
			case StorePackage.VIRTUAL_REVISION__PROJECT:
				return project != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualRevisionImpl
