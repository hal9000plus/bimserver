package org.bimserver.ifc.xml.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import nl.tue.buildingsmart.express.dictionary.Attribute;
import nl.tue.buildingsmart.express.dictionary.ExplicitAttribute;
import nl.tue.buildingsmart.express.dictionary.ListType;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.dictionary.SetType;

import org.apache.commons.lang.StringEscapeUtils;
import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.IfcSerializer;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class IfcXmlSerializer extends IfcSerializer {

	private PrintWriter out;
	private final Map<EObject, Long> objectToOidMap;
	private int tabs;
	private final SchemaDefinition schemaDefinition;

	public IfcXmlSerializer(EmfModel<Long> model, SchemaDefinition schemaDefinition) {
		super(schemaDefinition, model);
		this.schemaDefinition = schemaDefinition;
		objectToOidMap = new HashMap<EObject, Long>((int) model.size());
		for (Long key : model.keySet()) {
			objectToOidMap.put(model.get(key), key);
		}
	}

	@Override
	public void write(OutputStream out) {
		this.out = new PrintWriter(out);
		printLineTabbed("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		tabs = 0;
		printLineTabbed("<ex:iso_10303_28 xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:ex=\"urn:iso.org:standard:10303:part(28):version(2):xmlschema:common\" xsi:schemaLocation=\"urn:iso.org:standard:10303:part(28):version(2):xmlschema:common ex.xsd\" version=\"2.0\">");
		tabs++;
		printLineTabbed("<ifc:uos id=\"uos_1\" description=\"\" configuration=\"i-ifc2x3\" edo=\"\" xmlns=\"http://www.iai-tech.org/ifcXML/IFC2x3/FINAL\" xsi:schemaLocation=\"http://www.iai-tech.org/ifcXML/IFC2x3/FINAL ifc2x3.xsd\">");
		tabs++;
		for (Long key : model.getObjects().keySet()) {
			EObject object = model.getObjects().get(key);
			if (object.eClass().getEStructuralFeature("wrappedValue") == null) {
				store(key, object);
			}
		}
		tabs--;
		printLineTabbed("</ifc:uos>");
		tabs--;
		printLineTabbed("</ex:iso_10303_28>");
		this.out.flush();
	}
	
	public void write(File file) {
		try {
			write(new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void store(Long key, EObject object) {
		printLineTabbed("<" + object.eClass().getName() + " id=\"i" + key + "\">");
		tabs++;
		for (EStructuralFeature structuralFeature : object.eClass().getEAllStructuralFeatures()) {
			if (!isInverse(structuralFeature)) {
				Object value = object.eGet(structuralFeature);
				if (value == null) {
				} else {
					EClassifier classifier = structuralFeature.getEType();
					if (structuralFeature.getUpperBound() == 1) {
						if (classifier instanceof EClass) {
							EObject eObject = (EObject)value;
							EClass type = eObject.eClass();
							printTabbed("<" + structuralFeature.getName() + ">");
							if (Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf(type)) {
								print("<" + type.getName() + ">");
								EStructuralFeature wrappedFeature = type.getEStructuralFeature("wrappedValue");
								Object get = ((EObject) value).eGet(wrappedFeature);
								if (wrappedFeature.getEType() == EcorePackage.eINSTANCE.getEString()) {
									printEscaped((String)get);
								} else {
									print(get.toString());
								}
								print("</" + type.getName() + ">");
							} else {
								String ref = "i" + objectToOidMap.get(value);
								print("<" + type.getName() + " xsi:nil=\"true\" ref=\"" + ref + "\"/>");
							}
							printLine("</" + structuralFeature.getName() + ">");
						} else if (classifier instanceof EEnum) {
							printTabbed("<" + structuralFeature.getName() + ">");
							print(value.toString().toLowerCase());
							printLine("</" + structuralFeature.getName() + ">");
						}
					} else {
						BasicEList<?> list = (BasicEList<?>) value;
						if (list.isEmpty()) {

						} else {
							Attribute attributeBN = schemaDefinition.getEntityBN(object.eClass().getName()).getAttributeBN(structuralFeature.getName());
							String type = "set";
							if (attributeBN instanceof ExplicitAttribute) {
								ExplicitAttribute explicitAttribute = (ExplicitAttribute) attributeBN;
								if (explicitAttribute.getDomain(true) instanceof SetType) {
									type = "set";
								} else if (explicitAttribute.getDomain(true) instanceof ListType) {
									type = "list";
								}
							}
							printLineTabbed("<" + structuralFeature.getName() + " ex:cType=\"" + type + "\" >");
							tabs++;
							int i = 0;
							for (Object o : list) {
								if (o instanceof EObject) {
									EObject eObject = (EObject) o;
									EStructuralFeature wrappedFeature = eObject.eClass().getEStructuralFeature("wrappedValue");
									if (wrappedFeature != null) {
										Object val = eObject.eGet(wrappedFeature);
										printLineTabbed("<" + eObject.eClass().getName() + " pos=\"" + i + "\">" + val + "</" + eObject.eClass().getName() + ">");
									} else {
										String ref = "i" + objectToOidMap.get(eObject);
										printLineTabbed("<" + eObject.eClass().getName() + " pos=\"" + i + "\" xsi:nil=\"true\" ref=\"" + ref + "\" />");
									}
									i++;
								}
							}
							tabs--;
							printLineTabbed("</" + structuralFeature.getName() + ">");
						}
					}
				}
			}
		}
		tabs--;
		printLineTabbed("</" + object.eClass().getName() + ">");
	}

	private void printEscaped(String value) {
		out.print(StringEscapeUtils.escapeXml(value));
	}

	private void writeTabs(int tabs) {
		for (int i = 0; i < tabs; i++) {
			out.print("\t");
		}
	}

	private void printTabbed(String str) {
		writeTabs(tabs);
		out.print(str);
	}

	private void printLineTabbed(String str) {
		writeTabs(tabs);
		out.println(str);
	}

	private void print(String str) {
		out.print(str);
	}

	private void printLine(String str) {
		out.println(str);
	}
}