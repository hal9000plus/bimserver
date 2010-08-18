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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Electronic Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getMimeContentType <em>Mime Content Type</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getMimeSubtype <em>Mime Subtype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDocumentElectronicFormat()
 * @model
 * @generated
 */
public interface IfcDocumentElectronicFormat extends EObject {
	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' reference.
	 * @see #isSetFileExtension()
	 * @see #unsetFileExtension()
	 * @see #setFileExtension(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDocumentElectronicFormat_FileExtension()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getFileExtension();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getFileExtension <em>File Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' reference.
	 * @see #isSetFileExtension()
	 * @see #unsetFileExtension()
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getFileExtension <em>File Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFileExtension()
	 * @see #getFileExtension()
	 * @see #setFileExtension(IfcLabel)
	 * @generated
	 */
	void unsetFileExtension();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getFileExtension <em>File Extension</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>File Extension</em>' reference is set.
	 * @see #unsetFileExtension()
	 * @see #getFileExtension()
	 * @see #setFileExtension(IfcLabel)
	 * @generated
	 */
	boolean isSetFileExtension();

	/**
	 * Returns the value of the '<em><b>Mime Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Content Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Content Type</em>' reference.
	 * @see #isSetMimeContentType()
	 * @see #unsetMimeContentType()
	 * @see #setMimeContentType(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDocumentElectronicFormat_MimeContentType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getMimeContentType();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getMimeContentType <em>Mime Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Content Type</em>' reference.
	 * @see #isSetMimeContentType()
	 * @see #unsetMimeContentType()
	 * @see #getMimeContentType()
	 * @generated
	 */
	void setMimeContentType(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getMimeContentType <em>Mime Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMimeContentType()
	 * @see #getMimeContentType()
	 * @see #setMimeContentType(IfcLabel)
	 * @generated
	 */
	void unsetMimeContentType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getMimeContentType <em>Mime Content Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mime Content Type</em>' reference is set.
	 * @see #unsetMimeContentType()
	 * @see #getMimeContentType()
	 * @see #setMimeContentType(IfcLabel)
	 * @generated
	 */
	boolean isSetMimeContentType();

	/**
	 * Returns the value of the '<em><b>Mime Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Subtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Subtype</em>' reference.
	 * @see #isSetMimeSubtype()
	 * @see #unsetMimeSubtype()
	 * @see #setMimeSubtype(IfcLabel)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcDocumentElectronicFormat_MimeSubtype()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLabel getMimeSubtype();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getMimeSubtype <em>Mime Subtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Subtype</em>' reference.
	 * @see #isSetMimeSubtype()
	 * @see #unsetMimeSubtype()
	 * @see #getMimeSubtype()
	 * @generated
	 */
	void setMimeSubtype(IfcLabel value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getMimeSubtype <em>Mime Subtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMimeSubtype()
	 * @see #getMimeSubtype()
	 * @see #setMimeSubtype(IfcLabel)
	 * @generated
	 */
	void unsetMimeSubtype();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcDocumentElectronicFormat#getMimeSubtype <em>Mime Subtype</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mime Subtype</em>' reference is set.
	 * @see #unsetMimeSubtype()
	 * @see #getMimeSubtype()
	 * @see #setMimeSubtype(IfcLabel)
	 * @generated
	 */
	boolean isSetMimeSubtype();

} // IfcDocumentElectronicFormat
