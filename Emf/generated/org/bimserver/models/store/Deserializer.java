/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.store;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deserializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.store.Deserializer#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.store.StorePackage#getDeserializer()
 * @model
 * @generated
 */
public interface Deserializer extends Plugin {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.store.UserSettings#getDeserializers <em>Deserializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' reference.
	 * @see #setSettings(UserSettings)
	 * @see org.bimserver.models.store.StorePackage#getDeserializer_Settings()
	 * @see org.bimserver.models.store.UserSettings#getDeserializers
	 * @model opposite="deserializers"
	 * @generated
	 */
	UserSettings getSettings();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.Deserializer#getSettings <em>Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(UserSettings value);

} // Deserializer
