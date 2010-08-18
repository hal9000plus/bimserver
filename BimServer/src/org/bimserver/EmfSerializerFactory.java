package org.bimserver;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.shared.ResultType;

public class EmfSerializerFactory {
	public interface EmfSerializerCreator {
		EmfSerializer create(EmfModel<Long> model);
	}

	private final Map<ResultType, EmfSerializerCreator> emfSerializerCreators = new LinkedHashMap<ResultType, EmfSerializerCreator>();
	private static final EmfSerializerFactory INSTANCE = new EmfSerializerFactory();

	private EmfSerializerFactory() {
	}

	public static EmfSerializerFactory getInstance() {
		return INSTANCE;
	}

	public void register(ResultType type, EmfSerializerCreator emfSerializerCreater) {
		emfSerializerCreators.put(type, emfSerializerCreater);
	}

	public EmfSerializer create(ResultType resultType, EmfModel<Long> model) {
		EmfSerializerCreator emfSerializerCreator = emfSerializerCreators.get(resultType);
		return emfSerializerCreator.create(model);
	}

	public Set<ResultType> getResultTypes() {
		return emfSerializerCreators.keySet();
	}
}