/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.store.impl;

import org.bimserver.database.store.GeoTag;
import org.bimserver.database.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.database.store.impl.GeoTagImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.GeoTagImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.GeoTagImpl#getZ1 <em>Z1</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.GeoTagImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.GeoTagImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.GeoTagImpl#getZ2 <em>Z2</em>}</li>
 *   <li>{@link org.bimserver.database.store.impl.GeoTagImpl#getEpsg <em>Epsg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoTagImpl extends EObjectImpl implements GeoTag {
	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final float X1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected float x1 = X1_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final float Y1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected float y1 = Y1_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ1() <em>Z1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ1()
	 * @generated
	 * @ordered
	 */
	protected static final float Z1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZ1() <em>Z1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ1()
	 * @generated
	 * @ordered
	 */
	protected float z1 = Z1_EDEFAULT;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final float X2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected float x2 = X2_EDEFAULT;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final float Y2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected float y2 = Y2_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ2() <em>Z2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ2()
	 * @generated
	 * @ordered
	 */
	protected static final float Z2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getZ2() <em>Z2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ2()
	 * @generated
	 * @ordered
	 */
	protected float z2 = Z2_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpsg() <em>Epsg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsg()
	 * @generated
	 * @ordered
	 */
	protected static final int EPSG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEpsg() <em>Epsg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsg()
	 * @generated
	 * @ordered
	 */
	protected int epsg = EPSG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.GEO_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(float newX1) {
		float oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(float newY1) {
		float oldY1 = y1;
		y1 = newY1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__Y1, oldY1, y1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ1() {
		return z1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ1(float newZ1) {
		float oldZ1 = z1;
		z1 = newZ1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__Z1, oldZ1, z1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(float newX2) {
		float oldX2 = x2;
		x2 = newX2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__X2, oldX2, x2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(float newY2) {
		float oldY2 = y2;
		y2 = newY2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__Y2, oldY2, y2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ2() {
		return z2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ2(float newZ2) {
		float oldZ2 = z2;
		z2 = newZ2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__Z2, oldZ2, z2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEpsg() {
		return epsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpsg(int newEpsg) {
		int oldEpsg = epsg;
		epsg = newEpsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.GEO_TAG__EPSG, oldEpsg, epsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.GEO_TAG__X1:
				return getX1();
			case StorePackage.GEO_TAG__Y1:
				return getY1();
			case StorePackage.GEO_TAG__Z1:
				return getZ1();
			case StorePackage.GEO_TAG__X2:
				return getX2();
			case StorePackage.GEO_TAG__Y2:
				return getY2();
			case StorePackage.GEO_TAG__Z2:
				return getZ2();
			case StorePackage.GEO_TAG__EPSG:
				return getEpsg();
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
			case StorePackage.GEO_TAG__X1:
				setX1((Float)newValue);
				return;
			case StorePackage.GEO_TAG__Y1:
				setY1((Float)newValue);
				return;
			case StorePackage.GEO_TAG__Z1:
				setZ1((Float)newValue);
				return;
			case StorePackage.GEO_TAG__X2:
				setX2((Float)newValue);
				return;
			case StorePackage.GEO_TAG__Y2:
				setY2((Float)newValue);
				return;
			case StorePackage.GEO_TAG__Z2:
				setZ2((Float)newValue);
				return;
			case StorePackage.GEO_TAG__EPSG:
				setEpsg((Integer)newValue);
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
			case StorePackage.GEO_TAG__X1:
				setX1(X1_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__Z1:
				setZ1(Z1_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__X2:
				setX2(X2_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__Y2:
				setY2(Y2_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__Z2:
				setZ2(Z2_EDEFAULT);
				return;
			case StorePackage.GEO_TAG__EPSG:
				setEpsg(EPSG_EDEFAULT);
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
			case StorePackage.GEO_TAG__X1:
				return x1 != X1_EDEFAULT;
			case StorePackage.GEO_TAG__Y1:
				return y1 != Y1_EDEFAULT;
			case StorePackage.GEO_TAG__Z1:
				return z1 != Z1_EDEFAULT;
			case StorePackage.GEO_TAG__X2:
				return x2 != X2_EDEFAULT;
			case StorePackage.GEO_TAG__Y2:
				return y2 != Y2_EDEFAULT;
			case StorePackage.GEO_TAG__Z2:
				return z2 != Z2_EDEFAULT;
			case StorePackage.GEO_TAG__EPSG:
				return epsg != EPSG_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (x1: ");
		result.append(x1);
		result.append(", y1: ");
		result.append(y1);
		result.append(", z1: ");
		result.append(z1);
		result.append(", x2: ");
		result.append(x2);
		result.append(", y2: ");
		result.append(y2);
		result.append(", z2: ");
		result.append(z2);
		result.append(", epsg: ");
		result.append(epsg);
		result.append(')');
		return result.toString();
	}

} //GeoTagImpl
