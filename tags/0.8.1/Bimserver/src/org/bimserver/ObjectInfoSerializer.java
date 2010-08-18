package org.bimserver;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import org.bimserver.emf.EmfModel;
import org.bimserver.emf.SerializerException;
import org.bimserver.ifc.BimModelSerializer;
import org.bimserver.ifc.FieldIgnoreMap;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ObjectInfoSerializer extends BimModelSerializer {

	public ObjectInfoSerializer(EmfModel<Long> model, FieldIgnoreMap fieldIgnoreMap) {
		super(model, fieldIgnoreMap);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void write(OutputStream outputStream) throws SerializerException {
		PrintWriter out = new PrintWriter(outputStream);
		EObject eObject = model.getMainObject();
		out.println("<h1>" + eObject.eClass().getName() + "</h1>");
		out.println("<table>");
		for (EStructuralFeature eStructuralFeature : eObject.eClass().getEAllStructuralFeatures()) {
			out.println("<tr>");
			out.println("<td>" + eStructuralFeature.getName() + "</td>");
			Object eGet = eObject.eGet(eStructuralFeature);
			if (eStructuralFeature instanceof EAttribute) {
				if (eStructuralFeature.getUpperBound() == 1) {
					out.println("<td>" + eGet + "</td>");
				} else {
					List<Object> list = (List<Object>) eGet;
					out.println("<td>");
					for (Object object : list) {
						out.println(object + " ");
					}
					out.println("</td>");
				}
			} else if (eStructuralFeature instanceof EReference) {
				if (eStructuralFeature.getUpperBound() == 1) {
					if (Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf((EClass) eStructuralFeature.getEType())
							|| eStructuralFeature.getEType() == Ifc2x3Package.eINSTANCE.getIfcGloballyUniqueId()) {
						EObject value = (EObject) eGet;
						if (value != null) {
							out.println("<td>" + value.eGet(value.eClass().getEStructuralFeature("wrappedValue")) + "</td>");
						}
					} else {

					}
				} else {
					if (Ifc2x3Package.eINSTANCE.getWrappedValue().isSuperTypeOf((EClass) eStructuralFeature.getEType())
							|| eStructuralFeature.getEType() == Ifc2x3Package.eINSTANCE.getIfcGloballyUniqueId()) {
						List<EObject> list = (List<EObject>) eGet;
						out.println("<td>");
						for (EObject object : list) {
							out.println("<td>" + object.eGet(object.eClass().getEStructuralFeature("wrappedValue")) + "</td>");
						}
						out.println("</td>");
					} else {

					}
				}
			}
			out.println("</tr>");
		}
		out.println("</table>");
		out.flush();
	}
}