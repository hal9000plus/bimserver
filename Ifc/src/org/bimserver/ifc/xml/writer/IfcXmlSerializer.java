package org.bimserver.ifc.xml.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class IfcXmlSerializer extends EmfSerializer {

	private PrintWriter out;
	private final Map<EObject, Long> objectToOidMap;
	private int tabs;

	public IfcXmlSerializer(EmfModel<Long> model) {
		super(model);
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
		printLineTabbed("<ex:uos id=\"uos_1\" description=\"\" configuration=\"i-ifc2x3\" edo=\"\" xmlns=\"http://www.iai-international.org/ifcXML2/RC2/IFC2X3\" xsi:schemaLocation=\"http://www.iai-international.org/ifcXML2/RC2/IFC2X3 ifc2x3.xsd\">");
		tabs++;
		for (Long key : model.getObjects().keySet()) {
			EObject object = model.getObjects().get(key);
			if (object.eClass().getEStructuralFeature("wrappedValue") == null) {
				store(key, object);
			}
		}
		tabs--;
		printLineTabbed("</ex:uos>");
		tabs--;
		printLineTabbed("</ex:iso_10303_28>");
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
			Object value = object.eGet(structuralFeature);
			if (value == null) {
			} else {
				EClassifier classifier = structuralFeature.getEType();
				if (structuralFeature.getUpperBound() == 1) {
					if (classifier instanceof EClass) {
						EClass type = ((EClass) classifier);
						printTabbed("<" + structuralFeature.getName() + ">");
						EStructuralFeature wrappedFeature = type.getEStructuralFeature("wrappedValue");
						if (wrappedFeature != null) {
							Object get = ((EObject) value).eGet(wrappedFeature);
							print(get.toString());
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
					printLineTabbed("<" + structuralFeature.getName() + " ex:cType=\"set\" >");
					tabs++;
					int i = 0;
					for (Object o : list) {
						if (o instanceof EObject) {
							EObject eObject = (EObject) o;
							EStructuralFeature wrappedFeature = eObject.eClass().getEStructuralFeature("wrappedValue");
							if (wrappedFeature != null) {
								Object val = eObject.eGet(wrappedFeature);
								printLineTabbed("<" + eObject.eClass().getName() + " ex:pos=\"" + i + "\">" + val + "</" + eObject.eClass().getName() + ">");
							} else {
								String ref = "i" + objectToOidMap.get(eObject);
								printLineTabbed("<" + eObject.eClass().getName() + " ex:pos=\"" + i + "\" xsi:nil=\"true\" ref=\"" + ref + "\" />");
							}
							i++;
						}
					}
					tabs--;
					printLineTabbed("</" + structuralFeature.getName() + ">");
				}
			}
		}
		tabs--;
		printLineTabbed("</" + object.eClass().getName() + ">");
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