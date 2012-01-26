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
package org.bimserver.models.ifc2x3;

import org.bimserver.emf.IdEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Constraint Aggregation Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getRelatedConstraints <em>Related Constraints</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstraintAggregationRelationship()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface IfcConstraintAggregationRelationship extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstraintAggregationRelationship_Name()
	 * @model unsettable="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstraintAggregationRelationship_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Relating Constraint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcConstraint#getAggregates <em>Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Constraint</em>' reference.
	 * @see #isSetRelatingConstraint()
	 * @see #unsetRelatingConstraint()
	 * @see #setRelatingConstraint(IfcConstraint)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstraintAggregationRelationship_RelatingConstraint()
	 * @see org.bimserver.models.ifc2x3.IfcConstraint#getAggregates
	 * @model opposite="Aggregates" unsettable="true"
	 * @generated
	 */
	IfcConstraint getRelatingConstraint();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Constraint</em>' reference.
	 * @see #isSetRelatingConstraint()
	 * @see #unsetRelatingConstraint()
	 * @see #getRelatingConstraint()
	 * @generated
	 */
	void setRelatingConstraint(IfcConstraint value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatingConstraint()
	 * @see #getRelatingConstraint()
	 * @see #setRelatingConstraint(IfcConstraint)
	 * @generated
	 */
	void unsetRelatingConstraint();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relating Constraint</em>' reference is set.
	 * @see #unsetRelatingConstraint()
	 * @see #getRelatingConstraint()
	 * @see #setRelatingConstraint(IfcConstraint)
	 * @generated
	 */
	boolean isSetRelatingConstraint();

	/**
	 * Returns the value of the '<em><b>Related Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcConstraint}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcConstraint#getIsAggregatedIn <em>Is Aggregated In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Constraints</em>' reference list.
	 * @see #isSetRelatedConstraints()
	 * @see #unsetRelatedConstraints()
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstraintAggregationRelationship_RelatedConstraints()
	 * @see org.bimserver.models.ifc2x3.IfcConstraint#getIsAggregatedIn
	 * @model opposite="IsAggregatedIn" unsettable="true"
	 * @generated
	 */
	EList<IfcConstraint> getRelatedConstraints();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getRelatedConstraints <em>Related Constraints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatedConstraints()
	 * @see #getRelatedConstraints()
	 * @generated
	 */
	void unsetRelatedConstraints();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getRelatedConstraints <em>Related Constraints</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Related Constraints</em>' reference list is set.
	 * @see #unsetRelatedConstraints()
	 * @see #getRelatedConstraints()
	 * @generated
	 */
	boolean isSetRelatedConstraints();

	/**
	 * Returns the value of the '<em><b>Logical Aggregator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcLogicalOperatorEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Aggregator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Aggregator</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcLogicalOperatorEnum
	 * @see #isSetLogicalAggregator()
	 * @see #unsetLogicalAggregator()
	 * @see #setLogicalAggregator(IfcLogicalOperatorEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstraintAggregationRelationship_LogicalAggregator()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcLogicalOperatorEnum getLogicalAggregator();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Aggregator</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcLogicalOperatorEnum
	 * @see #isSetLogicalAggregator()
	 * @see #unsetLogicalAggregator()
	 * @see #getLogicalAggregator()
	 * @generated
	 */
	void setLogicalAggregator(IfcLogicalOperatorEnum value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogicalAggregator()
	 * @see #getLogicalAggregator()
	 * @see #setLogicalAggregator(IfcLogicalOperatorEnum)
	 * @generated
	 */
	void unsetLogicalAggregator();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Logical Aggregator</em>' attribute is set.
	 * @see #unsetLogicalAggregator()
	 * @see #getLogicalAggregator()
	 * @see #setLogicalAggregator(IfcLogicalOperatorEnum)
	 * @generated
	 */
	boolean isSetLogicalAggregator();

} // IfcConstraintAggregationRelationship
