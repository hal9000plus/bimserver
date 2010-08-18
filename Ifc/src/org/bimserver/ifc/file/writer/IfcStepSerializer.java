package org.bimserver.ifc.file.writer;

/************************************************************
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
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.tue.buildingsmart.express.dictionary.EntityDefinition;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.IfcSerializer;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcGloballyUniqueId;
import org.bimserver.ifc.emf.Ifc2x3.Tristate;
import org.bimserver.ifc.emf.Ifc2x3.WrappedValue;
import org.bimserver.utils.UTFPrintWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class IfcStepSerializer extends IfcSerializer {
	private static final String NULL = "NULL";
	private static final EcorePackage ECORE_PACKAGE_INSTANCE = EcorePackage.eINSTANCE;
	private static final String OPEN_CLOSE_PAREN = "()";
	private static final String ASTERISK = "*";
	private static final String ASTERISK_COMMA = "*,";
	private static final String PAREN_CLOSE_SEMICOLON = ");";
	private static final String DOT_0 = ".0";
	private static final String DASH = "#";
	private static final String IFC_LOGICAL = "IfcLogical";
	private static final String IFC_BOOLEAN = "IfcBoolean";
	private static final String DOT = ".";
	private static final String COMMA = ",";
	private static final String CLOSE_PAREN = ")";
	private static final String BOOLEAN_UNDEFINED = ".U.";
	private static final String SINGLE_QUOTE = "'";
	private static final String BOOLEAN_FALSE = ".F.";
	private static final String BOOLEAN_TRUE = ".T.";
	private static final String DOLLAR = "$";
	private static final String PAREN_OPEN = "(";
	private static final String WRAPPED_VALUE = "wrappedValue";
	private static final String STRING_VALUE_WRAPPED_VALUE = "stringValue" + WRAPPED_VALUE;
	private final Map<Long, EObject> oidToObjectMap;
	private final Map<EObject, Long> objectToOidMap;
	private UTFPrintWriter out;

	private String fileDescription = "";
	private String name = "";
	private String author = "";
	private String organization = "";
	private String originatingSystem = "";
	private String authorization = "";
	private String preProcessorVersion = "";
	private Date date = new Date();

	public IfcStepSerializer(EmfModel<Long> model, SchemaDefinition schema) {
		super(schema, model);
		setAuthor(model.getAuthor());
		setAuthorization(model.getAuthorizedUser());
		setName(model.getProjectName() + "." + model.getRevisionNr());

		oidToObjectMap = model.getObjects();
		objectToOidMap = new HashMap<EObject, Long>((int) model.size());
		for (Long key : model.keySet()) {
			EObject value = model.get(key);
			if (!(value instanceof WrappedValue)) {
				objectToOidMap.put(value, key);
			}
		}
	}

	public void write(OutputStream out) {
		try {
			this.out = new UTFPrintWriter(out);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		writeHeader();
		for (Long key : oidToObjectMap.keySet()) {
			write(key, oidToObjectMap.get(key));
		}
		writeFooter();
		this.out.flush();
	}

	public void write(File file) throws FileNotFoundException {
		try {
			write(new FileOutputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public void setOriginatingSystem(String originatingSystem) {
		this.originatingSystem = originatingSystem;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setPreProcessorVersion(String preProcessorVersion) {
		this.preProcessorVersion = preProcessorVersion;
	}

	private void writeFooter() {
		out.println("ENDSEC;");
		out.println("END-ISO-10303-21;");
	}

	private void writeHeader() {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss");
		String dateString = dateFormatter.format(date);

		out.println("ISO-10303-21;");
		out.println("HEADER;");
		out.println("FILE_DESCRIPTION (('" + fileDescription + "'), '2;1');");
		out.println("FILE_NAME ('" + name + "', '" + dateString + "', ('" + author + "'), ('" + organization + "'), '" + preProcessorVersion + "', '" + originatingSystem + "', '"
				+ authorization + "');");
		out.println("FILE_SCHEMA (('IFC2X3'));");
		out.println("ENDSEC;");
		out.println("DATA;");
		// out.println("//This program comes with ABSOLUTELY NO WARRANTY.");
		// out.println("//This is free software, and you are welcome to redistribute it under certain conditions. See www.bimserver.org <http://www.bimserver.org>");
	}

	private void printPrimitive(Object val) {
		if (val instanceof Tristate) {
			Tristate bool = (Tristate) val;
			if (bool == Tristate.TRUE) {
				out.print(BOOLEAN_TRUE);
			} else if (bool == Tristate.FALSE) {
				out.print(BOOLEAN_FALSE);
			} else if (bool == Tristate.UNDEFINED) {
				out.print(BOOLEAN_UNDEFINED);
			}
		} else if (val instanceof Float) {
			String string = val.toString();
			if (string.endsWith(DOT_0)) {
				out.print(string.substring(0, string.length() - 1));
			} else {
				out.print(string);
			}
		} else if (val instanceof String) {
			out.print(SINGLE_QUOTE);
			out.print(val.toString());
			out.print(SINGLE_QUOTE);
		} else {
			out.print(val == null ? "$" : val.toString());
		}
	}

	private void write(Long key, EObject object) {
		EClass eClass = object.eClass();
		if (eClass.getEStructuralFeature(WRAPPED_VALUE) != null) {
			return;
		}
		out.print(DASH);
		out.print(String.valueOf(key));
		out.print("= ");
		out.print(upperCases.get(eClass));
		out.print(PAREN_OPEN);
		boolean isFirst = true;
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			if (!feature.isDerived() && !feature.isVolatile()) {
				EClassifier type = feature.getEType();
				if (type instanceof EEnum) {
					if (!isFirst) {
						out.print(COMMA);
					}
					writeEnum(object, feature);
					isFirst = false;
				} else if (type instanceof EClass) {
					if (!isInverse(feature)) {
						if (!isFirst) {
							out.print(COMMA);
						}
						writeEClass(object, feature);
						isFirst = false;
					}
				} else if (type instanceof EDataType) {
					if (!isFirst) {
						out.print(COMMA);
					}
					writeEDataType(object, feature);
					isFirst = false;
				}
			}
		}
		out.println(PAREN_CLOSE_SEMICOLON);
	}

	private void writeEDataType(EObject object, EStructuralFeature feature) {
		EntityDefinition entityBN = schema.getEntityBNNoCaseConvert(upperCases.get(object.eClass()));
		if (entityBN != null && entityBN.isDerived(feature.getName())) {
			out.print(ASTERISK_COMMA);
		} else if (feature.getUpperBound() != 1) {
			writeList(object, feature);
		} else {
			writeObject(object, feature);
		}
	}

	private void writeEClass(EObject object, EStructuralFeature feature) {
		Object referencedObject = object.eGet(feature);
		if (referencedObject instanceof WrappedValue || referencedObject instanceof IfcGloballyUniqueId) {
			writeWrappedValue(object, feature, ((EObject)referencedObject).eClass());
		} else {
			EntityDefinition entityBN = schema.getEntityBNNoCaseConvert(upperCases.get(object.eClass()));
			if (referencedObject instanceof EObject && objectToOidMap.containsKey((EObject) referencedObject)) {
				out.print(DASH);
				out.print(String.valueOf(objectToOidMap.get((EObject) referencedObject)));
			} else {
				if (entityBN != null && entityBN.isDerived(feature.getName())) {
					out.print(ASTERISK);
				} else if (feature.getUpperBound() != 1) {
					writeList(object, feature);
				} else {
					writeObject(object, feature);
				}
			}
		}
	}

	private void writeObject(EObject object, EStructuralFeature feature) {
		Object ref = object.eGet(feature);
		if (ref == null) {
			EClassifier type = feature.getEType();
			if (type instanceof EClass) {
				EStructuralFeature structuralFeature = ((EClass) type).getEStructuralFeature(WRAPPED_VALUE);
				if (structuralFeature != null) {
					String name = structuralFeature.getEType().getName();
					if (structuralFeature.isUnsettable()) {
						out.print(DOLLAR);
					} else if (name.equals(IFC_BOOLEAN) || name.equals(IFC_LOGICAL)) {
						out.print(BOOLEAN_UNDEFINED);
					} else {
						out.print(DOLLAR);
					}
				} else {
					out.print(DOLLAR);
				}
			} else {
				out.print(DOLLAR);
			}
		} else {
			if (ref instanceof EObject) {
				writeEmbedded(ref);
			} else {
				printPrimitive(ref);
			}
		}
	}

	private void writeEmbedded(Object ref) {
		EObject eObject = (EObject) ref;
		EClass class1 = eObject.eClass();
		out.print(upperCases.get(class1));
		out.print(PAREN_OPEN);
		EStructuralFeature structuralFeature = class1.getEStructuralFeature(WRAPPED_VALUE);
		if (structuralFeature != null) {
			Object get = eObject.eGet(structuralFeature);
			if (structuralFeature.getEType() == ECORE_PACKAGE_INSTANCE.getEFloat()) {
				out.print(eObject.eGet(class1.getEStructuralFeature(STRING_VALUE_WRAPPED_VALUE)));
			} else {
				printPrimitive(get);
			}
		}
		out.print(CLOSE_PAREN);
	}

	private void writeList(EObject object, EStructuralFeature feature) {
		List<?> list = (List<?>) object.eGet(feature);
		if (list.size() == 0) {
			if (feature.isUnsettable()) {
				out.print(DOLLAR);
			} else {
				out.print(OPEN_CLOSE_PAREN);
			}
		} else {
			out.print(PAREN_OPEN);
			boolean first = true;
			for (Object listObject : list) {
				if (!first) {
					out.print(COMMA);
				}
				EObject eObject = (EObject) listObject;
				if (objectToOidMap.containsKey(eObject)) {
					out.print(DASH);
					out.print(String.valueOf(objectToOidMap.get(eObject)));
				} else {
					if (listObject == null) {
						out.print(DOLLAR);
					} else {
						if (listObject instanceof WrappedValue && Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf((EClass) feature.getEType())) {
							Object realVal = eObject.eGet(eObject.eClass().getEStructuralFeature("wrappedValue"));
							if (realVal instanceof Float) {
								out.print(eObject.eGet(eObject.eClass().getEStructuralFeature(STRING_VALUE_WRAPPED_VALUE)));
							} else {
								printPrimitive(realVal);
							}
						} else if (listObject instanceof EObject) {
							EClass class1 = eObject.eClass();
							EStructuralFeature structuralFeature = class1.getEStructuralFeature(WRAPPED_VALUE);
							if (structuralFeature != null) {
								Object realVal = eObject.eGet(structuralFeature);
								out.print(upperCases.get(class1));
								out.print(PAREN_OPEN);
								if (realVal instanceof Float) {
									out.print(eObject.eGet(class1.getEStructuralFeature(STRING_VALUE_WRAPPED_VALUE)));
								} else {
									printPrimitive(realVal);
								}
								out.print(CLOSE_PAREN);
							}
						} else {
							printPrimitive(listObject);
						}
					}
				}
				first = false;
			}
			out.print(CLOSE_PAREN);
		}
	}

	private void writeWrappedValue(EObject object, EStructuralFeature feature, EClass ec) {
		Object get = object.eGet(feature);
		EStructuralFeature structuralFeature = ec.getEStructuralFeature(WRAPPED_VALUE);
		if (get instanceof EObject) {
			EObject betweenObject = (EObject) get;
			if (betweenObject != null) {
				if (structuralFeature == null) {
					writeEmbedded(betweenObject);
				} else {
					Object val = betweenObject.eGet(structuralFeature);
					String name = structuralFeature.getEType().getName();
					if ((name.equals(IFC_BOOLEAN) || name.equals(IFC_LOGICAL)) && val == null) {
						out.print(BOOLEAN_UNDEFINED);
					} else if (structuralFeature.getEType() == ECORE_PACKAGE_INSTANCE.getEFloat()) {
						out.print(betweenObject.eGet(betweenObject.eClass().getEStructuralFeature(STRING_VALUE_WRAPPED_VALUE)));
					} else {
						printPrimitive(val);
					}
				}
			}
		} else if (get instanceof EList<?>) {
			EList<?> list = (EList<?>) get;
			if (list.size() == 0) {
				if (feature.isUnsettable()) {
					out.print(DOLLAR);
				} else {
					out.print(OPEN_CLOSE_PAREN);
				}
			} else {
				out.print(PAREN_OPEN);
				boolean first = true;
				for (Object o : list) {
					if (!first) {
						out.print(COMMA);
					}
					EObject object2 = (EObject) o;
					Object val = object2.eGet(structuralFeature);
					if (structuralFeature.getEType() == ECORE_PACKAGE_INSTANCE.getEFloat()) {
						out.print(object2.eGet(object2.eClass().getEStructuralFeature("stringValue" + structuralFeature.getName())));
					} else {
						printPrimitive(val);
					}
					first = false;
				}
				out.print(CLOSE_PAREN);
			}
		} else {
			if (get == null) {
				EClassifier type = structuralFeature.getEType();
				if (type == IFC_PACKAGE_INSTANCE.getIfcBoolean() || type == IFC_PACKAGE_INSTANCE.getIfcLogical() || type == ECORE_PACKAGE_INSTANCE.getEBoolean()) {
					if (feature.isUnsettable()) {
						out.print(DOLLAR);
					} else {
						out.print(BOOLEAN_UNDEFINED);
					}
				} else {
					EntityDefinition entityBN = schema.getEntityBN(object.eClass().getName());
					if (entityBN != null && entityBN.isDerived(feature.getName())) {
						out.print("*");
					} else {
						out.print(DOLLAR);
					}
				}
			}
		}
	}

	private void writeEnum(EObject object, EStructuralFeature feature) {
		Object val = object.eGet(feature);
		if (val == null) {
			out.print(DOLLAR);
		} else {
			if (((Enum<?>) val).toString().equals(NULL)) {
				out.print(DOLLAR);
			} else {
				out.print(DOT);
				out.print(val.toString());
				out.print(DOT);
			}
		}
	}
}