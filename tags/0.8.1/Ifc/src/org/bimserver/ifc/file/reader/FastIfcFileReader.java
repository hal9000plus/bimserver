package org.bimserver.ifc.file.reader;

/******************************************************************************
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
 *****************************************************************************/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.tue.buildingsmart.express.dictionary.Attribute;
import nl.tue.buildingsmart.express.dictionary.BooleanType;
import nl.tue.buildingsmart.express.dictionary.DefinedType;
import nl.tue.buildingsmart.express.dictionary.EntityDefinition;
import nl.tue.buildingsmart.express.dictionary.ExplicitAttribute;
import nl.tue.buildingsmart.express.dictionary.IntegerType;
import nl.tue.buildingsmart.express.dictionary.RealType;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.dictionary.StringType;
import nl.tue.buildingsmart.express.dictionary.UnderlyingType;

import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Factory;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcBoolean;
import org.bimserver.ifc.emf.Ifc2x3.IfcLogical;
import org.bimserver.ifc.emf.Ifc2x3.Tristate;
import org.bimserver.utils.StringUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EEnumImpl;

public class FastIfcFileReader {

	private static final int AVERAGE_LINE_LENGTH = 58;

	public enum Mode {
		HEADER, DATA, FOOTER, DONE
	}

	private static final String WRAPPED_VALUE = "wrappedValue";
	private static final Map<String, EClassifier> classes = initClasses();

	private final Map<Long, List<WaitingObject>> waitingObjects = new HashMap<Long, List<WaitingObject>>();
	private final SchemaDefinition schema;
	private final EPackage ePackage;
	private Mode mode = Mode.HEADER;
	private BasicEmfModel<Long> model = new BasicEmfModel<Long>();

	public FastIfcFileReader(SchemaDefinition schema) {
		this.ePackage = Ifc2x3Package.eINSTANCE;
		this.schema = schema;
	}

	public void read(InputStream in, long fileSize) throws IncorrectIfcFileException, Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
		int initialCapacity = (int) (fileSize / AVERAGE_LINE_LENGTH);
		model = new BasicEmfModel<Long>(initialCapacity);
		int lineNumber = 0;
		try {
			String line = reader.readLine();
			MessageDigest md = MessageDigest.getInstance("MD5");
			while (line != null) {
				byte[] bytes = line.getBytes("UTF-8");
				md.update(bytes, 0, bytes.length);
				try {
					while (!processLine(line.trim())) {
						line += reader.readLine();
						lineNumber++;
					}
				} catch (IncorrectIfcFileException e) {
					throw new IncorrectIfcFileException("Error on line " + lineNumber + " (" + e.getMessage() + ") " + line, e);
				} catch (Exception e) {
					e.printStackTrace();
					throw new Exception("Error on line " + lineNumber + " (" + e.getMessage() + ") " + line, e);
				}
				line = reader.readLine();
				lineNumber++;
			}
			model.setChecksum(md.digest());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void read(File sourceFile) throws IncorrectIfcFileException, Exception {
		FileInputStream in = new FileInputStream(sourceFile);
		read(in, sourceFile.length());
		in.close();
	}

	public EmfModel<Long> getModel() {
		return model;
	}

	private static Map<String, EClassifier> initClasses() {
		HashMap<String, EClassifier> classes = new HashMap<String, EClassifier>(Ifc2x3Package.eINSTANCE.getEClassifiers().size());
		for (EClassifier classifier : Ifc2x3Package.eINSTANCE.getEClassifiers()) {
			classes.put(classifier.getName().toUpperCase(), classifier);
		}
		return classes;
	}

	private boolean processLine(String line) throws IncorrectIfcFileException {
		switch (mode) {
		case HEADER:
			if (line.equals("DATA;")) {
				mode = Mode.DATA;
			}
			break;
		case DATA:
			if (line.equals("ENDSEC;")) {
				mode = Mode.FOOTER;
			} else {
				if (line.length() > 0 && line.charAt(0) == '#') {
					while (line.endsWith("*/")) {
						line = line.substring(0, line.lastIndexOf("/*")).trim();
					}
					if (line.endsWith(";")) {
						processRecord(line);
					} else {
						return false;
					}
				}
			}
			break;
		case FOOTER:
			if (line.equals("ENDSEC;")) {
				mode = Mode.DONE;
			}
			break;
		case DONE:
		}
		return true;
	}

	public void processRecord(String line) throws IncorrectIfcFileException {
		int equalSignLocation = line.indexOf("=");
		int lastIndexOfSemiColon = line.lastIndexOf(";");
		int indexOfFirstParen = line.indexOf("(");
		long recordNumber = Long.parseLong(line.substring(1, equalSignLocation).trim());
		String name = line.substring(equalSignLocation + 1, indexOfFirstParen).trim();
		EClass classifier = (EClass) classes.get(name);
		if (classifier != null) {
			EObject object = Ifc2x3Factory.eINSTANCE.create(classifier);
			String realData = line.substring(indexOfFirstParen + 1, lastIndexOfSemiColon - 1);
			int lastIndex = 0;
			EntityDefinition entityBN = schema.getEntityBN(name);
			for (Attribute attribute : entityBN.getAttributesCached(true)) {
				if (attribute instanceof ExplicitAttribute) {
					if (!entityBN.isDerived(attribute.getName())) {
						EStructuralFeature structuralFeature = classifier.getEStructuralFeature(attribute.getName());
						if (structuralFeature == null) {
							throw new IncorrectIfcFileException("Unknown feature " + classifier.getName() + "." + attribute.getName());
						}
						int nextIndex = StringUtils.nextString(realData, lastIndex);
						String val = null;
						try {
							val = realData.substring(lastIndex, nextIndex - 1).trim();
						} catch (Exception e) {
							int expected = 0;
							for (Attribute attribute2 : entityBN.getAttributesCached(true)) {
								if (attribute2 instanceof ExplicitAttribute) {
									expected++;
								}
							}
							throw new IncorrectIfcFileException(classifier.getName() + " expects " + expected + " fields, but less found");
						}
						lastIndex = nextIndex;
						char firstChar = val.charAt(0);
						if (firstChar == '$') {
							object.eUnset(structuralFeature);
						} else if (firstChar == '#') {
							readReference(val, object, structuralFeature);
						} else if (firstChar == '.') {
							readEnum(val, object, structuralFeature);
						} else if (firstChar == '(') {
							readList(val, object, structuralFeature);
						} else if (firstChar == '*') {
						} else {
							if (structuralFeature.getUpperBound() == 1) {
								object.eSet(structuralFeature, convert(structuralFeature.getEType(), val));
							}
						}
					} else {
						int nextIndex = StringUtils.nextString(realData, lastIndex);
						lastIndex = nextIndex;
					}
				}
			}
			if (waitingObjects.containsKey(recordNumber)) {
				updateNode(recordNumber, classifier, object);
			}
			model.add(recordNumber, object);
		} else {
			throw new IncorrectIfcFileException(name + " is not a known entity");
		}
	}

	@SuppressWarnings("unchecked")
	private void readList(String val, EObject object, EStructuralFeature structuralFeature) throws IncorrectIfcFileException {
		int index = 0;
		if (structuralFeature.getUpperBound() == 1) {
			throw new IncorrectIfcFileException("Field " + structuralFeature.getName() + " of " + structuralFeature.getEContainingClass().getName() + " is no aggregation");
		}
		BasicEList list = (BasicEList<EObject>) object.eGet(structuralFeature);
		String realData = val.substring(1, val.length() - 1);
		int lastIndex = 0;
		while (lastIndex != realData.length() + 1) {
			int nextIndex = StringUtils.nextString(realData, lastIndex);
			String a = realData.substring(lastIndex, nextIndex - 1).trim();
			lastIndex = nextIndex;
			if (a.length() > 0) {
				if (a.charAt(0) == '#') {
					Long referenceId = Long.parseLong(a.substring(1));
					if (model.containsKey(referenceId)) {
						EObject referencedObject = model.get(referenceId);
						if (referencedObject != null) {
							while (list.size() <= index) {
								list.addUnique(ePackage.getEFactoryInstance().create(referencedObject.eClass()));
							}
							list.setUnique(index, referencedObject);
						}
					} else {
						List<WaitingObject> waitingList = null;
						if (waitingObjects.containsKey(referenceId)) {
							waitingList = waitingObjects.get(referenceId);
						} else {
							waitingList = new ArrayList<WaitingObject>();
							waitingObjects.put(referenceId, waitingList);
						}
						waitingList.add(new WaitingObject(object, structuralFeature, index));
					}
				} else {
					Object convert = convert(structuralFeature.getEType(), a);
					while (list.size() <= index) {
						list.addUnique(convert);
					}
					if (convert != null) {
						list.setUnique(index, convert);
					}
				}
			}
			index++;
		}
	}

	@SuppressWarnings("unchecked")
	private void updateNode(Long id, EClass ec, EObject eObject) throws IncorrectIfcFileException {
		for (WaitingObject waitingObject : waitingObjects.get(id)) {
			if (waitingObject.getStructuralFeature().getUpperBound() != 1) {
				BasicEList<EObject> list = (BasicEList<EObject>) waitingObject.getObject().eGet(waitingObject.getStructuralFeature());
				if (waitingObject.getIndex() == -1) {
					list.addUnique(eObject);
				} else {
					if (((EClass) waitingObject.getStructuralFeature().getEType()).isSuperTypeOf(eObject.eClass())) {
						while (list.size() <= waitingObject.getIndex()) {
							list.addUnique(ec.getEPackage().getEFactoryInstance().create(eObject.eClass()));
						}
						list.setUnique(waitingObject.getIndex(), eObject);
					} else {
						throw new IncorrectIfcFileException("Field " + waitingObject.getStructuralFeature().getName() + " of "
								+ waitingObject.getStructuralFeature().getEContainingClass().getName() + " cannot contain a " + eObject.eClass().getName());
					}
				}
			} else {
				if (((EClass) waitingObject.getStructuralFeature().getEType()).isSuperTypeOf(eObject.eClass())) {
					waitingObject.getObject().eSet(waitingObject.getStructuralFeature(), eObject);
				} else {
					throw new IncorrectIfcFileException("Field " + waitingObject.getStructuralFeature().getName() + " of "
							+ waitingObject.getStructuralFeature().getEContainingClass().getName() + " cannot contain a " + eObject.eClass().getName());
				}
			}
		}
		waitingObjects.remove(id);
	}

	private Object convertSimpleValue(Class<?> instanceClass, String value) {
		if (!value.equals("")) {
			if (instanceClass == Double.class || instanceClass == double.class) {
				return Double.parseDouble(value);
			} else if (instanceClass == Integer.class || instanceClass == int.class) {
				return Integer.parseInt(value);
			} else if (instanceClass == Long.class || instanceClass == long.class) {
				return Long.parseLong(value);
			} else if (instanceClass == Boolean.class || instanceClass == boolean.class) {
				return Boolean.parseBoolean(value);
			} else if (instanceClass == Float.class || instanceClass == float.class) {
				return Float.parseFloat(value);
			} else if (instanceClass == String.class) {
				return value;
			}
		}
		return null;
	}

	private Object convert(EClassifier classifier, String value) throws IncorrectIfcFileException {
		if (classifier != null) {
			if (classifier instanceof EClassImpl) {
				if (null != ((EClassImpl) classifier).getEStructuralFeature(WRAPPED_VALUE)) {
					EObject create = ePackage.getEFactoryInstance().create((EClass) classifier);
					Class<?> instanceClass = create.eClass().getEStructuralFeature(WRAPPED_VALUE).getEType().getInstanceClass();
					if (value.equals("")) {

					} else {
						if (instanceClass == Integer.class || instanceClass == int.class) {
							try {
								create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), Integer.parseInt(value));
							} catch (NumberFormatException e) {
								throw new IncorrectIfcFileException(value + " is not a valid integer value");
							}
						} else if (instanceClass == Long.class || instanceClass == long.class) {
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), Long.parseLong(value));
						} else if (instanceClass == Boolean.class || instanceClass == boolean.class) {
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), value.equals(".T."));
						} else if (instanceClass == Float.class || instanceClass == float.class) {
							try {
								create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), Float.parseFloat(value));
							} catch (NumberFormatException e) {
								throw new IncorrectIfcFileException(value + " is not a valid floating point number");
							}
							create.eSet(create.eClass().getEStructuralFeature("stringValue" + WRAPPED_VALUE), value);
						} else if (instanceClass == String.class) {
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), value.substring(1, value.length() - 1));
						} else if (instanceClass == Tristate.class) {
							Tristate tristate = null;
							if (value.equals(".T.")) {
								tristate = Tristate.TRUE;
							} else if (value.equals(".F.")) {
								tristate = Tristate.FALSE;
							} else if (value.equals(".U.")) {
								tristate = Tristate.UNDEFINED;
							}
							create.eSet(create.eClass().getEStructuralFeature(WRAPPED_VALUE), tristate);
						}
					}
					return create;
				} else {
					return processInline(classifier, value);
				}
			} else if (classifier instanceof EDataType) {
				return convertSimpleValue(classifier.getInstanceClass(), value);
			}
		}
		return null;
	}

	private Object processInline(EClassifier classifier, String value) throws IncorrectIfcFileException {
		if (value.indexOf("(") != -1) {
			String typeName = value.substring(0, value.indexOf("(")).trim();
			String v = value.substring(value.indexOf("(") + 1, value.length() - 1);
			EClass cl = (EClass) classes.get(typeName);
			if (cl == null) {
				DefinedType typeBN = schema.getTypeBN(typeName);
				if (typeBN == null) {
					throw new IncorrectIfcFileException(typeName + " is not an existing IFC entity");
				}
				return convertSimpleValue(typeBN.getDomain(), v);
			} else {
				return convert(cl, v);
			}
		} else {
			return convertSimpleValue(classifier.getInstanceClass(), value);
		}
	}

	private Object convertSimpleValue(UnderlyingType domain, String value) {
		if (!value.equals("")) {
			if (domain instanceof RealType) {
				return Float.parseFloat(value);
			} else if (domain instanceof IntegerType) {
				return Integer.parseInt(value);
			} else if (domain instanceof BooleanType) {
				return Boolean.parseBoolean(value);
			} else if (domain instanceof StringType) {
				return value;
			}
		}
		return null;
	}

	private void readEnum(String val, EObject object, EStructuralFeature structuralFeature) throws IncorrectIfcFileException {
		if (val.equals(".T.")) {
			if (structuralFeature.getEType().getName().equals("IfcBoolean")) {
				IfcBoolean createIfcBoolean = Ifc2x3Factory.eINSTANCE.createIfcBoolean();
				createIfcBoolean.setWrappedValue(Tristate.TRUE);
				object.eSet(structuralFeature, createIfcBoolean);
			} else {
				IfcLogical createIfcBoolean = Ifc2x3Factory.eINSTANCE.createIfcLogical();
				createIfcBoolean.setWrappedValue(Tristate.TRUE);
				object.eSet(structuralFeature, createIfcBoolean);
			}
		} else if (val.equals(".F.")) {
			if (structuralFeature.getEType().getName().equals("IfcBoolean")) {
				IfcBoolean createIfcBoolean = Ifc2x3Factory.eINSTANCE.createIfcBoolean();
				createIfcBoolean.setWrappedValue(Tristate.FALSE);
				object.eSet(structuralFeature, createIfcBoolean);
			} else {
				IfcLogical createIfcBoolean = Ifc2x3Factory.eINSTANCE.createIfcLogical();
				createIfcBoolean.setWrappedValue(Tristate.FALSE);
				object.eSet(structuralFeature, createIfcBoolean);
			}
		} else if (val.equals(".U.")) {
			if (structuralFeature.getEType().getName().equals("IfcBoolean")) {
				IfcBoolean createIfcBoolean = Ifc2x3Factory.eINSTANCE.createIfcBoolean();
				createIfcBoolean.setWrappedValue(Tristate.UNDEFINED);
				object.eSet(structuralFeature, createIfcBoolean);
			} else {
				IfcLogical createIfcBoolean = Ifc2x3Factory.eINSTANCE.createIfcLogical();
				createIfcBoolean.setWrappedValue(Tristate.UNDEFINED);
				object.eSet(structuralFeature, createIfcBoolean);
			}
		} else {
			if (structuralFeature.getEType() instanceof EEnumImpl) {
				String realEnumValue = val.substring(1, val.length() - 1);
				EEnumLiteral enumValue = (((EEnumImpl) structuralFeature.getEType()).getEEnumLiteral(realEnumValue));
				if (enumValue == null) {
					throw new IncorrectIfcFileException("Enum type " + structuralFeature.getEType().getName() + " has no literal value '" + realEnumValue + "'");
				}
				object.eSet(structuralFeature, enumValue.getInstance());
			} else {
				throw new IncorrectIfcFileException("Value " + val + " indicates enum type but " + structuralFeature.getEType().getName() + " expected");
			}
		}
	}

	private void readReference(String val, EObject object, EStructuralFeature structuralFeature) throws IncorrectIfcFileException {
		long referenceId;
		try {
			referenceId = Long.parseLong(val.substring(1));
		} catch (NumberFormatException e) {
			throw new IncorrectIfcFileException("'" + val + "' is not a valid reference");
		}
		if (model.containsKey(referenceId)) {
			object.eSet(structuralFeature, model.get(referenceId));
		} else {
			List<WaitingObject> waitingList = null;
			if (waitingObjects.containsKey(referenceId)) {
				waitingList = waitingObjects.get(referenceId);
			} else {
				waitingList = new ArrayList<WaitingObject>();
				waitingObjects.put(referenceId, waitingList);
			}
			waitingList.add(new WaitingObject(object, structuralFeature, -1));
		}
	}
}