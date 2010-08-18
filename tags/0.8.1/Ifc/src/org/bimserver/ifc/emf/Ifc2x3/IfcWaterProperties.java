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
 * A representation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWaterProperties()
 * @model
 * @generated
 */
public interface IfcWaterProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Is Potable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Potable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Potable</em>' reference.
	 * @see #setIsPotable(IfcLogical)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWaterProperties_IsPotable()
	 * @model
	 * @generated
	 */
	IfcLogical getIsPotable();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getIsPotable <em>Is Potable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Potable</em>' reference.
	 * @see #getIsPotable()
	 * @generated
	 */
	void setIsPotable(IfcLogical value);

	/**
	 * Returns the value of the '<em><b>Hardness</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardness</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardness</em>' reference.
	 * @see #isSetHardness()
	 * @see #unsetHardness()
	 * @see #setHardness(IfcIonConcentrationMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWaterProperties_Hardness()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcIonConcentrationMeasure getHardness();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getHardness <em>Hardness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardness</em>' reference.
	 * @see #isSetHardness()
	 * @see #unsetHardness()
	 * @see #getHardness()
	 * @generated
	 */
	void setHardness(IfcIonConcentrationMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getHardness <em>Hardness</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHardness()
	 * @see #getHardness()
	 * @see #setHardness(IfcIonConcentrationMeasure)
	 * @generated
	 */
	void unsetHardness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getHardness <em>Hardness</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hardness</em>' reference is set.
	 * @see #unsetHardness()
	 * @see #getHardness()
	 * @see #setHardness(IfcIonConcentrationMeasure)
	 * @generated
	 */
	boolean isSetHardness();

	/**
	 * Returns the value of the '<em><b>Alkalinity Concentration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alkalinity Concentration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alkalinity Concentration</em>' reference.
	 * @see #isSetAlkalinityConcentration()
	 * @see #unsetAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(IfcIonConcentrationMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWaterProperties_AlkalinityConcentration()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcIonConcentrationMeasure getAlkalinityConcentration();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alkalinity Concentration</em>' reference.
	 * @see #isSetAlkalinityConcentration()
	 * @see #unsetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @generated
	 */
	void setAlkalinityConcentration(IfcIonConcentrationMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(IfcIonConcentrationMeasure)
	 * @generated
	 */
	void unsetAlkalinityConcentration();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alkalinity Concentration</em>' reference is set.
	 * @see #unsetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(IfcIonConcentrationMeasure)
	 * @generated
	 */
	boolean isSetAlkalinityConcentration();

	/**
	 * Returns the value of the '<em><b>Acidity Concentration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acidity Concentration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acidity Concentration</em>' reference.
	 * @see #isSetAcidityConcentration()
	 * @see #unsetAcidityConcentration()
	 * @see #setAcidityConcentration(IfcIonConcentrationMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWaterProperties_AcidityConcentration()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcIonConcentrationMeasure getAcidityConcentration();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acidity Concentration</em>' reference.
	 * @see #isSetAcidityConcentration()
	 * @see #unsetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @generated
	 */
	void setAcidityConcentration(IfcIonConcentrationMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @see #setAcidityConcentration(IfcIonConcentrationMeasure)
	 * @generated
	 */
	void unsetAcidityConcentration();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acidity Concentration</em>' reference is set.
	 * @see #unsetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @see #setAcidityConcentration(IfcIonConcentrationMeasure)
	 * @generated
	 */
	boolean isSetAcidityConcentration();

	/**
	 * Returns the value of the '<em><b>Impurities Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impurities Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impurities Content</em>' reference.
	 * @see #isSetImpuritiesContent()
	 * @see #unsetImpuritiesContent()
	 * @see #setImpuritiesContent(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWaterProperties_ImpuritiesContent()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getImpuritiesContent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impurities Content</em>' reference.
	 * @see #isSetImpuritiesContent()
	 * @see #unsetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @generated
	 */
	void setImpuritiesContent(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @see #setImpuritiesContent(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetImpuritiesContent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impurities Content</em>' reference is set.
	 * @see #unsetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @see #setImpuritiesContent(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetImpuritiesContent();

	/**
	 * Returns the value of the '<em><b>PH Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PH Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PH Level</em>' reference.
	 * @see #isSetPHLevel()
	 * @see #unsetPHLevel()
	 * @see #setPHLevel(IfcPHMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWaterProperties_PHLevel()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPHMeasure getPHLevel();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PH Level</em>' reference.
	 * @see #isSetPHLevel()
	 * @see #unsetPHLevel()
	 * @see #getPHLevel()
	 * @generated
	 */
	void setPHLevel(IfcPHMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPHLevel()
	 * @see #getPHLevel()
	 * @see #setPHLevel(IfcPHMeasure)
	 * @generated
	 */
	void unsetPHLevel();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PH Level</em>' reference is set.
	 * @see #unsetPHLevel()
	 * @see #getPHLevel()
	 * @see #setPHLevel(IfcPHMeasure)
	 * @generated
	 */
	boolean isSetPHLevel();

	/**
	 * Returns the value of the '<em><b>Dissolved Solids Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissolved Solids Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissolved Solids Content</em>' reference.
	 * @see #isSetDissolvedSolidsContent()
	 * @see #unsetDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(IfcNormalisedRatioMeasure)
	 * @see org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package#getIfcWaterProperties_DissolvedSolidsContent()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcNormalisedRatioMeasure getDissolvedSolidsContent();

	/**
	 * Sets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissolved Solids Content</em>' reference.
	 * @see #isSetDissolvedSolidsContent()
	 * @see #unsetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @generated
	 */
	void setDissolvedSolidsContent(IfcNormalisedRatioMeasure value);

	/**
	 * Unsets the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	void unsetDissolvedSolidsContent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.ifc.emf.Ifc2x3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dissolved Solids Content</em>' reference is set.
	 * @see #unsetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(IfcNormalisedRatioMeasure)
	 * @generated
	 */
	boolean isSetDissolvedSolidsContent();

} // IfcWaterProperties
