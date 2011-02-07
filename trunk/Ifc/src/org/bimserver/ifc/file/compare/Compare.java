package org.bimserver.ifc.file.compare;

import org.bimserver.emf.IdEObject;
import org.bimserver.ifc.FieldIgnoreMap;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.database.IfcDatabase;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.shared.SCompareResult.SCompareType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compare {
	private static final Logger LOGGER = LoggerFactory.getLogger(Compare.class);
	private final FieldIgnoreMap fieldIgnoreMap;

	public Compare(FieldIgnoreMap fieldIgnoreMap) {
		this.fieldIgnoreMap = fieldIgnoreMap;
	}

	public CompareResult compare(IfcModel model1, IfcModel model2, SCompareType sCompareType) {
		CompareResult result = new CompareResult();
		try {
			IfcDatabase database1 = new IfcDatabase(model1, fieldIgnoreMap);
			database1.buildGuidIndex();
			IfcDatabase database2 = new IfcDatabase(model2, fieldIgnoreMap);
			database2.buildGuidIndex();

			for (EClassifier eClassifier : Ifc2x3Package.eINSTANCE.getEClassifiers()) {
				if (eClassifier instanceof EClass && Ifc2x3Package.eINSTANCE.getIfcRoot().isSuperTypeOf((EClass) eClassifier)) {
					EClass eClass = (EClass) eClassifier;
					for (String guid : database1.getGuids(eClass)) {
						IdEObject eObject1 = database1.getByGuid(eClass, guid);
						IdEObject eObject2 = database2.getByGuid(eClass, guid);
						if  (eObject2 == null) {
							if (sCompareType == SCompareType.ALL || sCompareType == SCompareType.DELETE) {
								result.addDeleted(eObject1);
							}
						}
					}
					for (String guid : database2.getGuids(eClass)) {
						IdEObject eObject1 = database1.getByGuid(eClass, guid);
						IdEObject eObject2 = database2.getByGuid(eClass, guid);
						if (eObject1 == null) {
							if (sCompareType == SCompareType.ALL || sCompareType == SCompareType.ADD) {
								result.addAdded(eObject2);
							}
						} else {
							compareEObjects(eClass, eObject1, eObject2, result, sCompareType);
						}
					}
				}
			}
		} catch (Exception e) {
			LOGGER.error("", e);
		}
		return result;
	}

	private void compareEObjects(EClass originalQueryClass, IdEObject eObject1, IdEObject eObject2, CompareResult result, SCompareType sCompareType) {
		if (eObject1.eClass() != eObject2.eClass()) {
			return;
		}
		EClass eClass = eObject1.eClass();
		if (sCompareType == SCompareType.ALL || sCompareType == SCompareType.MODIFY) {
			for (EStructuralFeature eStructuralFeature : eClass.getEAllStructuralFeatures()) {
				if (!fieldIgnoreMap.shouldIgnoreField(originalQueryClass, eClass, eStructuralFeature)) {
					if (eStructuralFeature.getName().endsWith("AsString")) {
						continue;
					}
					Object value1 = eObject1.eGet(eStructuralFeature);
					Object value2 = eObject2.eGet(eStructuralFeature);
					if (eStructuralFeature.isMany()) {
					} else {
						if (eStructuralFeature.getEType() instanceof EClass) {
							if (value1 == null && value2 == null) {
							} else if (value1 == null && value2 != null) {
								EClass value2Class = ((EObject) value2).eClass();
								if (Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf(value2Class)) {
									Object realVal2 = ((EObject) value2).eGet(value2Class.getEStructuralFeature("wrappedValue"));
									result.addModified(eObject1, eStructuralFeature, null, realVal2);
								}
							} else if (value1 != null && value2 == null) {
								EClass value1Class = ((EObject) value1).eClass();
								if (Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf(value1Class)) {
									Object realVal1 = ((EObject) value1).eGet(value1Class.getEStructuralFeature("wrappedValue"));
									result.addModified(eObject1, eStructuralFeature, realVal1, null);
								}
							} else {
								EClass value1Class = ((EObject) value1).eClass();
								if (Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf(((EObject) value1).eClass())) {
									Object realVal1 = ((EObject) value1).eGet(value1Class.getEStructuralFeature("wrappedValue"));
									Object realVal2 = ((EObject) value2).eGet(value1Class.getEStructuralFeature("wrappedValue"));
									if (!realVal1.equals(realVal2)) {
										result.addModified(eObject1, eStructuralFeature, realVal1, realVal2);
									}
								}
							}
						} else if (eStructuralFeature.getEType() instanceof EDataType) {
							if (value1 == null && value2 == null) {
							} else if (value1 == null && value2 != null) {
								result.addModified(eObject1, eStructuralFeature, value1, value2);
							} else if (value1 != null && value2 == null) {
								result.addModified(eObject1, eStructuralFeature, value1, value2);
							} else if (!value1.equals(value2)) {
								result.addModified(eObject1, eStructuralFeature, value1, value2);
							}
						}
					}
				}
			}
		}
	}
}