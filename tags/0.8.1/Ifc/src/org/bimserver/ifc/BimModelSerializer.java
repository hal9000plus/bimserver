package org.bimserver.ifc;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Factory;
import org.bimserver.ifc.emf.Ifc2x3.WrappedValue;
import org.bimserver.utils.TempUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class BimModelSerializer extends EmfSerializer {
	private final FieldIgnoreMap fieldIgnoreMap;
	private int convertCounter;

	public BimModelSerializer(EmfModel<Long> model, FieldIgnoreMap fieldIgnoreMap) {
		super(model);
		this.fieldIgnoreMap = fieldIgnoreMap;
		TempUtils.makeTempDir("bimserver" + File.separator + this.hashCode());
	}

	protected File createTempFile() {
		File makeTempFile = TempUtils.makeTempFile("bimserver" + File.separator + this.hashCode() + File.separator + (convertCounter++) + ".ifc");
		try {
			makeTempFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return makeTempFile;
	}

	@SuppressWarnings("unchecked")
	protected EObject convertToSubset(EClass originalClass, EObject ifcRootObject, EmfModel<Long> newModel, Map<EObject, EObject> converted) {
		EObject newObject = Ifc2x3Factory.eINSTANCE.create(ifcRootObject.eClass());
		converted.put(ifcRootObject, newObject);
		if (!(newObject instanceof WrappedValue)) {
			newModel.add(newObject);
		}
		for (EStructuralFeature eStructuralFeature : ifcRootObject.eClass().getEAllStructuralFeatures()) {
			if (!fieldIgnoreMap.shouldIgnoreField(ifcRootObject.eClass(), ifcRootObject.eClass(), eStructuralFeature)) {
				Object get = ifcRootObject.eGet(eStructuralFeature);
				if (eStructuralFeature instanceof EAttribute) {
					if (get instanceof Float || get instanceof Double) {
						EStructuralFeature floatStringFeature = ifcRootObject.eClass().getEStructuralFeature("stringValuewrappedValue");
						Object floatString = ifcRootObject.eGet(floatStringFeature);
						newObject.eSet(floatStringFeature, floatString);
					}
					newObject.eSet(eStructuralFeature, get);
				} else if (eStructuralFeature instanceof EReference) {
					if (get == null) {
					} else {
						if (eStructuralFeature.getUpperBound() == -1 || eStructuralFeature.getUpperBound() > 1) {
							BasicEList<EObject> list = (BasicEList<EObject>) get;
							BasicEList<EObject> toList = (BasicEList<EObject>) newObject.eGet(eStructuralFeature);
							for (Object o : list) {
								if (converted.containsKey(o)) {
									toList.addUnique(converted.get(o));
								} else {
									toList.addUnique(convertToSubset(originalClass, (EObject) o, newModel, converted));
								}
							}
						} else {
							if (converted.containsKey(get)) {
								newObject.eSet(eStructuralFeature, converted.get(get));
							} else {
								newObject.eSet(eStructuralFeature, convertToSubset(originalClass, (EObject) get, newModel, converted));
							}
						}
					}
				}
			}
		}
		return newObject;
	}

	public FieldIgnoreMap getFieldIgnoreMap() {
		return fieldIgnoreMap;
	}
}