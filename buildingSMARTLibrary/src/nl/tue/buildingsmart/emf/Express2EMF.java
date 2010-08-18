package nl.tue.buildingsmart.emf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import nl.tue.buildingsmart.express.dictionary.AggregationType;
import nl.tue.buildingsmart.express.dictionary.Attribute;
import nl.tue.buildingsmart.express.dictionary.BaseType;
import nl.tue.buildingsmart.express.dictionary.BooleanType;
import nl.tue.buildingsmart.express.dictionary.DefinedType;
import nl.tue.buildingsmart.express.dictionary.DerivedAttribute2;
import nl.tue.buildingsmart.express.dictionary.EntityDefinition;
import nl.tue.buildingsmart.express.dictionary.EnumerationType;
import nl.tue.buildingsmart.express.dictionary.ExplicitAttribute;
import nl.tue.buildingsmart.express.dictionary.IntegerBound;
import nl.tue.buildingsmart.express.dictionary.IntegerType;
import nl.tue.buildingsmart.express.dictionary.InverseAttribute;
import nl.tue.buildingsmart.express.dictionary.ListType;
import nl.tue.buildingsmart.express.dictionary.LogicalType;
import nl.tue.buildingsmart.express.dictionary.NamedType;
import nl.tue.buildingsmart.express.dictionary.NumberType;
import nl.tue.buildingsmart.express.dictionary.RealType;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.dictionary.SelectType;
import nl.tue.buildingsmart.express.dictionary.SimpleType;
import nl.tue.buildingsmart.express.dictionary.StringType;
import nl.tue.buildingsmart.express.dictionary.UnderlyingType;
import nl.tue.buildingsmart.express.parser.SchemaLoader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Express2EMF {
	private static final Logger LOGGER = LoggerFactory.getLogger(Express2EMF.class);
	private final SchemaDefinition schema;
	private final EcoreFactory eFactory;
	private final EcorePackage ePackage;
	private final EPackage schemaPack;
	private final boolean createWrappedTypes;
	private final Map<String, EDataType> simpleTypeReplacementMap = new HashMap<String, EDataType>();

	public static void main(String[] args) {
		Express2EMF express2EMF = new Express2EMF("data" + File.separator + "IFC2X3_FINAL.exp", "Ifc2x3", true);
		express2EMF.writeEMF(".." + File.separator + "Ifc" + File.separator + "model" + File.separator + "IFC2X3.ecore");
	}

	public Express2EMF(String schemaFileName, String modelName, boolean createWrappedTypes) {
		this.createWrappedTypes = createWrappedTypes;
		schema = new SchemaLoader(schemaFileName).getSchema();
		eFactory = EcoreFactory.eINSTANCE;
		ePackage = EcorePackage.eINSTANCE;
		schemaPack = eFactory.createEPackage();
		try {
			new DerivedReader(new File(schemaFileName), schema);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		schemaPack.setName(modelName);
		schemaPack.setNsPrefix("iai");
		schemaPack.setNsURI("http:///buildingsmart.ifc.ecore");

		createTristate();

		if (createWrappedTypes) {
			addSimpleTypes();
		} else {
			generateSimpleTypeReplacementMap();
		}
		addDerivedTypes();
		addEnumerations();
		addClasses();
		addSupertypes();
		addSelects();
		addAttributes();
		addInverses();
		EClass ifcBooleanClass = (EClass) schemaPack.getEClassifier("IfcBoolean");
		ifcBooleanClass.getESuperTypes().add((EClass) schemaPack.getEClassifier("IfcValue"));
		EClass guid = (EClass) schemaPack.getEClassifier("IfcGloballyUniqueId");
		EReference ifcGuidLink = (EReference) ((EClass) schemaPack.getEClassifier("IfcRoot")).getEStructuralFeature("GlobalId");
		EReference ifcRootLink = eFactory.createEReference();
		ifcRootLink.setName("ifcRoot");
		ifcRootLink.setEType(schemaPack.getEClassifier("IfcRoot"));
		ifcRootLink.setEOpposite(ifcGuidLink);
		ifcGuidLink.setEOpposite(ifcRootLink);
		guid.getEStructuralFeatures().add(ifcRootLink);

		doRealDerivedAttributes();
	}

	private void doRealDerivedAttributes() {
		for (EntityDefinition entityDefinition : schema.getEntities()) {
			for (DerivedAttribute2 attributeName : entityDefinition.getDerivedAttributes().values()) {
				EClass eClass = (EClass) schemaPack.getEClassifier(entityDefinition.getName());
				EStructuralFeature derivedAttribute = eFactory.createEReference();
				if (attributeName.getType() != null) {
					if (attributeName.getType() instanceof EntityDefinition) {
						derivedAttribute.setEType(schemaPack.getEClassifier(((EntityDefinition) attributeName.getType()).getName()));
					} else if (attributeName.getType() instanceof IntegerType) {
						derivedAttribute.setEType(schemaPack.getEClassifier("IfcInteger"));
					} else if (attributeName.getType() instanceof RealType) {
						derivedAttribute.setEType(schemaPack.getEClassifier("IfcReal"));
					} else if (attributeName.getType() instanceof LogicalType) {
						derivedAttribute.setEType(schemaPack.getEClassifier("IfcLogical"));
					} else if (attributeName.getType() instanceof DefinedType) {
						derivedAttribute.setEType(schemaPack.getEClassifier(((DefinedType) attributeName.getType()).getName()));
					}
				}
				derivedAttribute.setName(attributeName.getName());
				derivedAttribute.setDerived(true);
				derivedAttribute.setTransient(true);
				derivedAttribute.setVolatile(true);
				if (attributeName.isCollection()) {
					derivedAttribute.setUpperBound(-1);
				}
				EAnnotation annotation = eFactory.createEAnnotation();
				annotation.setSource("http://www.iso.org/iso10303-11/EXPRESS");
				annotation.getDetails().put("code", attributeName.getExpressCode());
				derivedAttribute.getEAnnotations().add(annotation);
				if (eClass.getEStructuralFeature(derivedAttribute.getName()) == null) {
					eClass.getEStructuralFeatures().add(derivedAttribute);
				}
			}
		}
	}

	private void createTristate() {
		EEnum eEnum = eFactory.createEEnum();
		eEnum.setName("Tristate");
		EEnumLiteral trueLiteral = eFactory.createEEnumLiteral();
		trueLiteral.setName("TRUE");
		trueLiteral.setValue(0);
		EEnumLiteral falseLiteral = eFactory.createEEnumLiteral();
		falseLiteral.setName("FALSE");
		falseLiteral.setValue(1);
		EEnumLiteral undefinedLiteral = eFactory.createEEnumLiteral();
		undefinedLiteral.setName("UNDEFINED");
		undefinedLiteral.setValue(2);
		eEnum.getELiterals().add(trueLiteral);
		eEnum.getELiterals().add(falseLiteral);
		eEnum.getELiterals().add(undefinedLiteral);
		schemaPack.getEClassifiers().add(eEnum);
	}

	private void generateSimpleTypeReplacementMap() {
		Iterator<DefinedType> typeIter = schema.getTypes().iterator();
		while (typeIter.hasNext()) {
			DefinedType type = typeIter.next();
			UnderlyingType domain = type.getDomain();
			EDataType eType = null;
			if (domain instanceof SimpleType) {
				if (type.getDomain() instanceof IntegerType)
					eType = ePackage.getEInt();
				else if (type.getDomain() instanceof RealType) {
					eType = ePackage.getEFloat();
				} else if (type.getDomain() instanceof StringType) {
					eType = ePackage.getEString();
				} else if (type.getDomain() instanceof BooleanType) {
					eType = (EEnum) schemaPack.getEClassifier("Tristate");
				} else if (type.getDomain() instanceof NumberType) {
					eType = ePackage.getEFloat();
				} else if (type.getDomain() instanceof LogicalType) {
					eType = (EEnum) schemaPack.getEClassifier("Tristate");
				}
				simpleTypeReplacementMap.put(type.getName(), eType);
			}
		}
	}

	private void addInverses() {
		Iterator<EntityDefinition> entIter = schema.getEntities().iterator();
		while (entIter.hasNext()) {
			EntityDefinition ent = (EntityDefinition) entIter.next();
			Iterator<Attribute> attribIter = ent.getAttributes(false).iterator();
			EClass cls = (EClass) schemaPack.getEClassifier(ent.getName());
			// if (ent.getName().equals("IfcRepresentation")) {
			// InverseAttribute attrib = new
			// InverseAttribute("LayerAssignments", ent);
			// EntityDefinition entityBN =
			// schema.getEntityBN("IfcPresentationLayerAssignment");
			// attrib.setDomain(entityBN);
			// attrib.setInverted_attr((ExplicitAttribute)entityBN.getAttributeBN
			// ("AssignedItems"));
			// addInverseAttribute(attrib, cls);

			// EClass ifcLayeredItem =
			// (EClass)schemaPack.getEClassifier("IfcLayeredItem");
			// EReference createEReference = eFactory.createEReference();
			// createEReference.setName("LayerAssignments");
			// EClassifier classifier =
			// schemaPack.getEClassifier("IfcPresentationLayerAssignment");
			// createEReference.setEType(classifier);
			// EReference structuralFeature =
			// (EReference)((EClass)classifier).getEStructuralFeature
			// ("AssignedItems");
			// createEReference.setEOpposite(structuralFeature);
			// structuralFeature.setEOpposite(createEReference);
			// ifcLayeredItem.getEStructuralFeatures().add(createEReference);
			// }
			while (attribIter.hasNext()) {
				Attribute attrib = (Attribute) attribIter.next();
				// if (ent.getName().equals("IfcRepresentationItem") &&
				// attrib.getName().equals("LayerAssignments")) {
				//					
				// } else {
				if (attrib instanceof InverseAttribute) {
					addInverseAttribute(attrib, cls);
				}
				// }
			}
		}
	}

	private void addInverseAttribute(Attribute attrib, EClass cls) {
		InverseAttribute inverseAttribute = (InverseAttribute) attrib;
		EReference eRef = eFactory.createEReference();
		eRef.setName(attrib.getName());
		if (inverseAttribute.getMax_cardinality() != null) {
			IntegerBound max_cardinality = (IntegerBound) inverseAttribute.getMax_cardinality();
			if (max_cardinality.getBound_value() == -1) {
				eRef.setUpperBound(max_cardinality.getBound_value());
			} else {
				eRef.setUpperBound(max_cardinality.getBound_value() + 1);
			}
		}
		String type = (inverseAttribute).getDomain().getName();
		EClass classifier = (EClass) schemaPack.getEClassifier(type);
		eRef.setEType(classifier);
		String reverseName = inverseAttribute.getInverted_attr().getName();
		EReference reference = (EReference) classifier.getEStructuralFeature(reverseName);
		if (eRef.getEType() == classifier && reference.getEType() == cls) {
			reference.setEOpposite(eRef);
			eRef.setEOpposite(reference);
		} else {
			LOGGER.info("Inverse mismatch");
			LOGGER.info(classifier.getName() + "." + reference.getName() + " => " + cls.getName() + "." + eRef.getName());
		}
		cls.getEStructuralFeatures().add(eRef);
	}

	private void addAttributes() {
		Iterator<EntityDefinition> entIter = schema.getEntities().iterator();
		while (entIter.hasNext()) {
			EntityDefinition ent = (EntityDefinition) entIter.next();
			Iterator<Attribute> attribIter = ent.getAttributes(false).iterator();
			while (attribIter.hasNext()) {
				Attribute attrib = (Attribute) attribIter.next();
				if (attrib instanceof ExplicitAttribute) {
					processAttribute(ent, attrib);
				}
			}
		}
	}

	private void processAttribute(EntityDefinition ent, Attribute attrib) {
		ExplicitAttribute expAttrib = (ExplicitAttribute) attrib;
		BaseType domain = expAttrib.getDomain();
		if (domain instanceof NamedType) {
			NamedType nt = (NamedType) domain;
			if (nt instanceof EnumerationType) {
				EAttribute enumAttrib = eFactory.createEAttribute();
				enumAttrib.setName(attrib.getName());
				EClassifier eType = schemaPack.getEClassifier(nt.getName());
				enumAttrib.setEType(eType);
				EClass cls = (EClass) schemaPack.getEClassifier(ent.getName());
				cls.getEStructuralFeatures().add(enumAttrib);
			} else {
				// if (createWrappedTypes) {
				EClassifier eType = schemaPack.getEClassifier(nt.getName());
				if (eType != null) {
					EReference eRef = eFactory.createEReference();
					eRef.setName(attrib.getName());
					// Hardcoded hack to fix multiplicity for
					// IfcSpatialStructureElement which references
					// RefLatitude and RefLongitude
					if (eRef.getName().equals("RefLatitude") || eRef.getName().equals("RefLongitude")) {
						eRef.setUpperBound(3);
					}
					eRef.setUnsettable(((ExplicitAttribute) attrib).isOptional());
					eRef.setEType(eType);
					EClass cls = (EClass) schemaPack.getEClassifier(ent.getName());
					cls.getEStructuralFeatures().add(eRef);
				} else {
					EClass cls = (EClass) schemaPack.getEClassifier(ent.getName());

					EAttribute eAtt = eFactory.createEAttribute();
					EClassifier eType2 = simpleTypeReplacementMap.get(nt.getName());
					eAtt.setName(attrib.getName());
					eAtt.setEType(eType2);
					cls.getEStructuralFeatures().add(eAtt);

					if (eType2 == ePackage.getEFloat()) {
						// Hack for floating point values, create an extra field
						// to store string representation
						EAttribute eFloatStringAttibute = eFactory.createEAttribute();
						eFloatStringAttibute.setName("stringValue" + attrib.getName());
						eFloatStringAttibute.setEType(ePackage.getEString());
						cls.getEStructuralFeatures().add(eFloatStringAttibute);
					}
				}
			}
		} else if (domain instanceof AggregationType) {
			EReference eRef = eFactory.createEReference();
			eRef.setName(attrib.getName());
//			eRef.setUnique(false);
			BaseType bt = ((AggregationType) domain).getElement_type();
			eRef.setUpperBound(-1);
			eRef.setUnsettable(expAttrib.isOptional());
			EClass cls = (EClass) schemaPack.getEClassifier(ent.getName());
			if (bt instanceof NamedType) {
				NamedType nt = (NamedType) bt;
				EClassifier eType = schemaPack.getEClassifier(nt.getName());
				if (this.simpleTypeReplacementMap.containsKey(nt.getName())) {
					EAttribute attribute = eFactory.createEAttribute();
					attribute.setName(attrib.getName());
					attribute.setEType(this.simpleTypeReplacementMap.get(nt.getName()));
					attribute.setUpperBound(-1);
					cls.getEStructuralFeatures().add(attribute);
				} else {
					eRef.setEType(eType);
					cls.getEStructuralFeatures().add(eRef);
				}
			} else if (bt instanceof RealType) {
				if (createWrappedTypes) {
					EClassifier eType = schemaPack.getEClassifier("IfcReal");
					eRef.setEType(eType);
					cls.getEStructuralFeatures().add(eRef);
				} else {
					EAttribute attribute = eFactory.createEAttribute();
					attribute.setName(attrib.getName());
					attribute.setEType(ePackage.getEFloat());
					attribute.setUpperBound(-1);
					cls.getEStructuralFeatures().add(attribute);

					EAttribute stringAttribute = eFactory.createEAttribute();
					stringAttribute.setName("stringValue" + attrib.getName());
					stringAttribute.setEType(ePackage.getEString());
					cls.getEStructuralFeatures().add(stringAttribute);
				}
			} else if (bt instanceof IntegerType) {
				if (createWrappedTypes) {
					EClassifier eType = schemaPack.getEClassifier("IfcInteger");
					eRef.setEType(eType);
					cls.getEStructuralFeatures().add(eRef);
				} else {
					EAttribute attribute = eFactory.createEAttribute();
					attribute.setName(attrib.getName());
					attribute.setEType(ePackage.getEInt());
					attribute.setUpperBound(-1);
					cls.getEStructuralFeatures().add(attribute);
				}
			} else if (bt instanceof LogicalType) {
				if (createWrappedTypes) {
					EClassifier eType = schemaPack.getEClassifier("IfcLogical");
					eRef.setEType(eType);
					cls.getEStructuralFeatures().add(eRef);
				} else {
					EAttribute attribute = eFactory.createEAttribute();
					attribute.setName(attrib.getName());
					attribute.setEType(ePackage.getEBoolean());
					attribute.setUpperBound(-1);
					cls.getEStructuralFeatures().add(attribute);
				}
			} else if (domain instanceof ListType || domain instanceof nl.tue.buildingsmart.express.dictionary.ArrayType) {
				eRef.setOrdered(true);
			}
			if (domain instanceof nl.tue.buildingsmart.express.dictionary.ArrayType) {
				// TODO this is not yet implmented in simpelSDAI
				// eAttrib.setLowerBound(((nl.tue.buildingsmart.express.dictionary
				// .ArrayType)domain).getLower_index());
			}
		} else {
			EReference eRef = eFactory.createEReference();
			eRef.setName(attrib.getName());
			EClass cls = (EClass) schemaPack.getEClassifier(ent.getName());
			if (domain == null) {
				if (createWrappedTypes) {
					eRef.setEType(schemaPack.getEClassifier("IfcLogical"));
					cls.getEStructuralFeatures().add(eRef);
				} else {
					EAttribute attribute = eFactory.createEAttribute();
					attribute.setName(attrib.getName());
					attribute.setEType(schemaPack.getEClassifier("Tristate"));
					cls.getEStructuralFeatures().add(attribute);
				}
			} else if (domain instanceof IntegerType) {
				if (createWrappedTypes) {
					eRef.setEType(schemaPack.getEClassifier("IfcInteger"));
					cls.getEStructuralFeatures().add(eRef);
				} else {
					EAttribute attribute = eFactory.createEAttribute();
					attribute.setName(attrib.getName());
					attribute.setEType(ePackage.getEInt());
					cls.getEStructuralFeatures().add(attribute);
				}
			} else if (domain instanceof LogicalType) {
				if (createWrappedTypes) {
					eRef.setEType(schemaPack.getEClassifier("IfcLogical"));
					cls.getEStructuralFeatures().add(eRef);
				} else {
					EAttribute attribute = eFactory.createEAttribute();
					attribute.setName(attrib.getName());
					attribute.setEType(ePackage.getEBoolean());
					cls.getEStructuralFeatures().add(attribute);
				}
			} else if (domain instanceof RealType) {
				if (createWrappedTypes) {
					eRef.setEType(schemaPack.getEClassifier("IfcReal"));
					cls.getEStructuralFeatures().add(eRef);
				} else {
					EAttribute attribute = eFactory.createEAttribute();
					attribute.setName(attrib.getName());
					attribute.setEType(ePackage.getEFloat());
					cls.getEStructuralFeatures().add(attribute);

					EAttribute attibuteStringValue = eFactory.createEAttribute();
					attibuteStringValue.setName(attrib.getName());
					attibuteStringValue.setEType(ePackage.getEString());
					cls.getEStructuralFeatures().add(attibuteStringValue);
				}
			}
		}
	}

	private void addClasses() {
		Iterator<EntityDefinition> entIter = schema.getEntities().iterator();
		while (entIter.hasNext()) {
			EntityDefinition ent = entIter.next();
			EClass cls = eFactory.createEClass();
			cls.setName(ent.getName());
			schemaPack.getEClassifiers().add(cls);
		}
	}

	private void addSupertypes() {
		Iterator<EntityDefinition> entIter = schema.getEntities().iterator();
		while (entIter.hasNext()) {
			EntityDefinition ent = entIter.next();
			if (ent.getSupertypes().size() > 0) {
				EClass cls = (EClass) schemaPack.getEClassifier(ent.getName());
				EClass parent = (EClass) schemaPack.getEClassifier(ent.getSupertypes().get(0).getName());
				cls.getESuperTypes().add(parent);
			}
		}
	}

	private void addSelects() {
		Iterator<DefinedType> typeIter = schema.getTypes().iterator();
		while (typeIter.hasNext()) {
			DefinedType type = typeIter.next();
			if (type instanceof SelectType) {
				EClass selectType = eFactory.createEClass();
				selectType.setName(type.getName());
				selectType.setInterface(true);
				selectType.setAbstract(true);
				schemaPack.getEClassifiers().add(selectType);
				Iterator<NamedType> entIter = ((SelectType) type).getSelections().iterator();
				while (entIter.hasNext()) {
					NamedType nt = entIter.next();
					if (nt instanceof EntityDefinition) {
						EClass choice = (EClass) schemaPack.getEClassifier(nt.getName());
						choice.getESuperTypes().add(selectType);
					} else if (nt instanceof DefinedType) {
						UnderlyingType domain = ((DefinedType) nt).getDomain();
						if (domain instanceof RealType || domain instanceof StringType || domain instanceof IntegerType || domain instanceof NumberType
								|| domain instanceof LogicalType) {
							if (createWrappedTypes) {
								EClass choice = (EClass) schemaPack.getEClassifier(nt.getName());
								choice.getESuperTypes().add(selectType);
							}
						} else if (domain instanceof DefinedType) {
							DefinedType dt2 = (DefinedType) (domain);
							if (dt2.getDomain() instanceof RealType) {
								if (createWrappedTypes) {
									EClass choice = (EClass) schemaPack.getEClassifier(nt.getName());
									choice.getESuperTypes().add(selectType);
								}
							}
						}
						// debug
						// (nt.getName()+" is a "+nt.getClass()+":base:"+dt.
						// getDomain(true));
						// if (dt.getDomain() instanceof SimpleType){
						// EClass wrapper = eFactory.createEClass();
						// wrapper.getESuperTypes().add((EClass)schemaPack.
						// getEClassifier("SimpleTypeWrapper"));
						// EReference eRef = eFactory.createEReference();
						// eRef.setName("value");
						// eRef.setEType(schemaPack.getEClassifier(dt.getDomain()
						// .toString()));
						// wrapper.getEStructuralFeatures().add(eRef);
						// }

					}
				}
			}
		}
		typeIter = schema.getTypes().iterator();
		while (typeIter.hasNext()) {
			DefinedType type = typeIter.next();
			if (type instanceof SelectType) {
				EClass selectType = (EClass) schemaPack.getEClassifier(type.getName());
				Iterator<NamedType> entIter = ((SelectType) type).getSelections().iterator();
				while (entIter.hasNext()) {
					NamedType nt = entIter.next();
					if (nt instanceof SelectType) {
						EClass choice = (EClass) schemaPack.getEClassifier(nt.getName());
						choice.getESuperTypes().add(selectType);
					}
				}
			}
		}
	}

	private void modifySimpleType(DefinedType type, EClass testType) {
		EAttribute wrapperAttrib = eFactory.createEAttribute();
		wrapperAttrib.setName("wrappedValue");
		if (type.getDomain() instanceof IntegerType)
			wrapperAttrib.setEType(ePackage.getEInt());
		else if (type.getDomain() instanceof RealType) {
			wrapperAttrib.setEType(ePackage.getEFloat());
		} else if (type.getDomain() instanceof StringType) {
			wrapperAttrib.setEType(ePackage.getEString());
		} else if (type.getDomain() instanceof BooleanType) {
			wrapperAttrib.setEType(schemaPack.getEClassifier("Tristate"));
		} else if (type.getDomain() instanceof NumberType) {
			wrapperAttrib.setEType(ePackage.getEFloat());
		} else if (type.getDomain() instanceof LogicalType) {
			wrapperAttrib.setEType(schemaPack.getEClassifier("Tristate"));
		}
		testType.getEStructuralFeatures().add(wrapperAttrib);
		if (wrapperAttrib.getEType() == ePackage.getEFloat()) {
			EAttribute stringAttribute = eFactory.createEAttribute();
			stringAttribute.setEType(ePackage.getEString());
			stringAttribute.setName("stringValue" + wrapperAttrib.getName());
			testType.getEStructuralFeatures().add(stringAttribute);
		}
	}

	private void addSimpleTypes() {
		Iterator<DefinedType> typeIter = schema.getTypes().iterator();
		EClass wrappedValueSuperClass = EcoreFactory.eINSTANCE.createEClass();
		wrappedValueSuperClass.setName("WrappedValue");
		wrappedValueSuperClass.setAbstract(true);
		schemaPack.getEClassifiers().add(wrappedValueSuperClass);
		while (typeIter.hasNext()) {
			DefinedType type = typeIter.next();
			if (type.getDomain() instanceof SimpleType) {
				EClass testType = eFactory.createEClass();
				testType.getESuperTypes().add(wrappedValueSuperClass);
				testType.setName(type.getName());
				modifySimpleType(type, testType);
				schemaPack.getEClassifiers().add(testType);
			}
		}
	}

	/**
	 * constructs the EXPRESS TYPEs like IfcPositiveLength measure that are not
	 * simple types but derived types: <code>
	 * TYPE IfcPositiveLengthMeasure = IfcLengthMeasure;
	 * WHERE
	 *  WR1 : SELF > 0.;
	 * END_TYPE;
	 * </code>
	 */
	private void addDerivedTypes() {
		Iterator<DefinedType> typeIter = schema.getTypes().iterator();
		while (typeIter.hasNext()) {
			DefinedType type = typeIter.next();
			// debug (type.getName()+":"+type.getDomain(true).toString());
			// if ((type.getDomain() instanceof SimpleType)==false &&
			// (type instanceof EnumerationType)==false &&
			// (type instanceof SelectType)==false){

			/*
			 * one of the hard things TODO : TYPE IfcCompoundPlaneAngleMeasure =
			 * LIST [3:3] OF INTEGER; WHERE WR1 : { -360 <= SELF[1] < 360 }; WR2
			 * : { -60 <= SELF[2] < 60 }; WR3 : { -60 <= SELF[3] < 60 }; WR4 :
			 * ((SELF[1] >= 0) AND (SELF[2] >= 0) AND (SELF[3] >= 0)) OR
			 * ((SELF[1] <= 0) AND (SELF[2] <= 0) AND (SELF[3] <= 0)); END_TYPE;
			 * 
			 * I am skipping this for now, it only occurs once in the model
			 * future versions should definitely find an answer to this
			 */
			if (type.getName().equalsIgnoreCase("IfcCompoundPlaneAngleMeasure")) {
				EClass testType = eFactory.createEClass();
				testType.setName(type.getName());
				DefinedType type2 = new DefinedType("Integer");
				type2.setDomain(new IntegerType());
				modifySimpleType(type2, testType);
				schemaPack.getEClassifiers().add(testType);
			} else if (type.getDomain() instanceof DefinedType) {
				if (schemaPack.getEClassifier(type.getName()) != null) {
					EClass testType = (EClass) schemaPack.getEClassifier(type.getName());
					DefinedType domain = (DefinedType) type.getDomain();
					EClassifier classifier = schemaPack.getEClassifier(domain.getName());
					testType.getESuperTypes().add((EClass) classifier);
					testType.setInstanceClass(classifier.getInstanceClass());
				} else {
					EClass testType = eFactory.createEClass();
					testType.setName(type.getName());
					DefinedType domain = (DefinedType) type.getDomain();
					if (simpleTypeReplacementMap.containsKey(domain.getName())) {
						// We can't subclass because it's a 'primitive' type
						simpleTypeReplacementMap.put(type.getName(), simpleTypeReplacementMap.get(domain.getName()));
					} else {
						EClassifier classifier = null;
						classifier = schemaPack.getEClassifier(domain.getName());
						schemaPack.getEClassifier(domain.getName());
						testType.getESuperTypes().add((EClass) classifier);
						testType.setInstanceClass(classifier.getInstanceClass());
						schemaPack.getEClassifiers().add(testType);
					}
				}
			}
		}
	}

	private void addEnumerations() {
		Iterator<DefinedType> typeIter = schema.getTypes().iterator();
		while (typeIter.hasNext()) {
			DefinedType type = typeIter.next();
			if (type instanceof EnumerationType) {
				EEnum enumeration = eFactory.createEEnum();
				enumeration.setName(type.getName());

				EEnumLiteral nullValue = eFactory.createEEnumLiteral();
				nullValue.setName("NULL");
				nullValue.setLiteral("NULL");
				nullValue.setValue(0);
				enumeration.getELiterals().add(nullValue);

				int counter = 1;
				Iterator<String> values = ((EnumerationType) type).getElements().iterator();
				while (values.hasNext()) {
					String stringVal = values.next();
					if (!stringVal.equals("NULL")) {
						EEnumLiteral value = eFactory.createEEnumLiteral();
						value.setName(stringVal);
						value.setLiteral(stringVal);
						value.setValue(counter);
						counter++;
						enumeration.getELiterals().add(value);
					}
				}
				schemaPack.getEClassifiers().add(enumeration);
			}
		}
	}

	public void writeEMF(String fileName) {
		ResourceSet metaResourceSet = new ResourceSetImpl();
		metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMLResourceFactoryImpl());

		URI resUri = URI.createURI(fileName);
		Resource metaResource = metaResourceSet.createResource(resUri);
		metaResource.getContents().add(schemaPack);
		try {
			metaResource.save(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}