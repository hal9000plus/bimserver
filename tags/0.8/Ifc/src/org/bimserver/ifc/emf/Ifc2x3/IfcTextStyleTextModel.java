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
 * A representation of the model object '<em><b>Ifc Text Style Text Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getWordSpacing <em>Word Spacing</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getLineHeight <em>Line Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleTextModel()
 * @model
 * @generated
 */
public interface IfcTextStyleTextModel extends IfcTextStyleSelect {
	/**
	 * Returns the value of the '<em><b>Text Indent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Indent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Indent</em>' reference.
	 * @see #isSetTextIndent()
	 * @see #unsetTextIndent()
	 * @see #setTextIndent(IfcSizeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleTextModel_TextIndent()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSizeSelect getTextIndent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextIndent <em>Text Indent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Indent</em>' reference.
	 * @see #isSetTextIndent()
	 * @see #unsetTextIndent()
	 * @see #getTextIndent()
	 * @generated
	 */
	void setTextIndent(IfcSizeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextIndent <em>Text Indent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextIndent()
	 * @see #getTextIndent()
	 * @see #setTextIndent(IfcSizeSelect)
	 * @generated
	 */
	void unsetTextIndent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextIndent <em>Text Indent</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Indent</em>' reference is set.
	 * @see #unsetTextIndent()
	 * @see #getTextIndent()
	 * @see #setTextIndent(IfcSizeSelect)
	 * @generated
	 */
	boolean isSetTextIndent();

	/**
	 * Returns the value of the '<em><b>Text Align</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align</em>' reference.
	 * @see #isSetTextAlign()
	 * @see #unsetTextAlign()
	 * @see #setTextAlign(IfcTextAlignment)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleTextModel_TextAlign()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTextAlignment getTextAlign();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align</em>' reference.
	 * @see #isSetTextAlign()
	 * @see #unsetTextAlign()
	 * @see #getTextAlign()
	 * @generated
	 */
	void setTextAlign(IfcTextAlignment value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextAlign()
	 * @see #getTextAlign()
	 * @see #setTextAlign(IfcTextAlignment)
	 * @generated
	 */
	void unsetTextAlign();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Align</em>' reference is set.
	 * @see #unsetTextAlign()
	 * @see #getTextAlign()
	 * @see #setTextAlign(IfcTextAlignment)
	 * @generated
	 */
	boolean isSetTextAlign();

	/**
	 * Returns the value of the '<em><b>Text Decoration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Decoration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Decoration</em>' reference.
	 * @see #isSetTextDecoration()
	 * @see #unsetTextDecoration()
	 * @see #setTextDecoration(IfcTextDecoration)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleTextModel_TextDecoration()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTextDecoration getTextDecoration();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Decoration</em>' reference.
	 * @see #isSetTextDecoration()
	 * @see #unsetTextDecoration()
	 * @see #getTextDecoration()
	 * @generated
	 */
	void setTextDecoration(IfcTextDecoration value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextDecoration()
	 * @see #getTextDecoration()
	 * @see #setTextDecoration(IfcTextDecoration)
	 * @generated
	 */
	void unsetTextDecoration();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Decoration</em>' reference is set.
	 * @see #unsetTextDecoration()
	 * @see #getTextDecoration()
	 * @see #setTextDecoration(IfcTextDecoration)
	 * @generated
	 */
	boolean isSetTextDecoration();

	/**
	 * Returns the value of the '<em><b>Letter Spacing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Letter Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter Spacing</em>' reference.
	 * @see #isSetLetterSpacing()
	 * @see #unsetLetterSpacing()
	 * @see #setLetterSpacing(IfcSizeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleTextModel_LetterSpacing()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSizeSelect getLetterSpacing();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getLetterSpacing <em>Letter Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter Spacing</em>' reference.
	 * @see #isSetLetterSpacing()
	 * @see #unsetLetterSpacing()
	 * @see #getLetterSpacing()
	 * @generated
	 */
	void setLetterSpacing(IfcSizeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getLetterSpacing <em>Letter Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLetterSpacing()
	 * @see #getLetterSpacing()
	 * @see #setLetterSpacing(IfcSizeSelect)
	 * @generated
	 */
	void unsetLetterSpacing();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getLetterSpacing <em>Letter Spacing</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Letter Spacing</em>' reference is set.
	 * @see #unsetLetterSpacing()
	 * @see #getLetterSpacing()
	 * @see #setLetterSpacing(IfcSizeSelect)
	 * @generated
	 */
	boolean isSetLetterSpacing();

	/**
	 * Returns the value of the '<em><b>Word Spacing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Spacing</em>' reference.
	 * @see #isSetWordSpacing()
	 * @see #unsetWordSpacing()
	 * @see #setWordSpacing(IfcSizeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleTextModel_WordSpacing()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSizeSelect getWordSpacing();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getWordSpacing <em>Word Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Spacing</em>' reference.
	 * @see #isSetWordSpacing()
	 * @see #unsetWordSpacing()
	 * @see #getWordSpacing()
	 * @generated
	 */
	void setWordSpacing(IfcSizeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getWordSpacing <em>Word Spacing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWordSpacing()
	 * @see #getWordSpacing()
	 * @see #setWordSpacing(IfcSizeSelect)
	 * @generated
	 */
	void unsetWordSpacing();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getWordSpacing <em>Word Spacing</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Word Spacing</em>' reference is set.
	 * @see #unsetWordSpacing()
	 * @see #getWordSpacing()
	 * @see #setWordSpacing(IfcSizeSelect)
	 * @generated
	 */
	boolean isSetWordSpacing();

	/**
	 * Returns the value of the '<em><b>Text Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Transform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Transform</em>' reference.
	 * @see #isSetTextTransform()
	 * @see #unsetTextTransform()
	 * @see #setTextTransform(IfcTextTransformation)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleTextModel_TextTransform()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTextTransformation getTextTransform();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Transform</em>' reference.
	 * @see #isSetTextTransform()
	 * @see #unsetTextTransform()
	 * @see #getTextTransform()
	 * @generated
	 */
	void setTextTransform(IfcTextTransformation value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextTransform()
	 * @see #getTextTransform()
	 * @see #setTextTransform(IfcTextTransformation)
	 * @generated
	 */
	void unsetTextTransform();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Transform</em>' reference is set.
	 * @see #unsetTextTransform()
	 * @see #getTextTransform()
	 * @see #setTextTransform(IfcTextTransformation)
	 * @generated
	 */
	boolean isSetTextTransform();

	/**
	 * Returns the value of the '<em><b>Line Height</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Height</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Height</em>' reference.
	 * @see #isSetLineHeight()
	 * @see #unsetLineHeight()
	 * @see #setLineHeight(IfcSizeSelect)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcTextStyleTextModel_LineHeight()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSizeSelect getLineHeight();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getLineHeight <em>Line Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Height</em>' reference.
	 * @see #isSetLineHeight()
	 * @see #unsetLineHeight()
	 * @see #getLineHeight()
	 * @generated
	 */
	void setLineHeight(IfcSizeSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getLineHeight <em>Line Height</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineHeight()
	 * @see #getLineHeight()
	 * @see #setLineHeight(IfcSizeSelect)
	 * @generated
	 */
	void unsetLineHeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcTextStyleTextModel#getLineHeight <em>Line Height</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Height</em>' reference is set.
	 * @see #unsetLineHeight()
	 * @see #getLineHeight()
	 * @see #setLineHeight(IfcSizeSelect)
	 * @generated
	 */
	boolean isSetLineHeight();

} // IfcTextStyleTextModel
