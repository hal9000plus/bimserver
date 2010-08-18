package org.bimserver;

import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.citygml.IfcToCityGML;
import org.bimserver.collada.IfcToCollada;
import org.bimserver.collada.KmzSerializer;
import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.ifc.FieldIgnoreMap;
import org.bimserver.ifc.file.writer.IfcStepSerializer;
import org.bimserver.ifc.xml.writer.IfcXmlSerializer;
import org.bimserver.ifcengine.FailSafeIfcEngine;
import org.bimserver.o3d.O3dJsonSerializer;
import org.bimserver.shared.ResultType;
import org.bimserver.shared.ResultType.Type;

public class EmfSerializerFactory {
	public interface EmfSerializerCreator {
		EmfSerializer create(EmfModel<Long> model);
	}

	private final Map<ResultType, EmfSerializerCreator> emfSerializerCreators = new LinkedHashMap<ResultType, EmfSerializerCreator>();
	private static final EmfSerializerFactory INSTANCE = new EmfSerializerFactory();
	private FailSafeIfcEngine ifcEngine;
	private FieldIgnoreMap fieldIgnoreMap;
	private SchemaDefinition schemaDefinition;
	private Version version;

	private EmfSerializerFactory() {
	}

	public static EmfSerializerFactory getInstance() {
		return INSTANCE;
	}

	public void init(Version version, SchemaDefinition schemaDefinition, FieldIgnoreMap fieldIgnoreMap, FailSafeIfcEngine ifcEngine) {
		this.version = version;
		this.schemaDefinition = schemaDefinition;
		this.fieldIgnoreMap = fieldIgnoreMap;
		this.ifcEngine = ifcEngine;
	}
	
	public void register(ResultType type, EmfSerializerCreator emfSerializerCreater) {
		emfSerializerCreators.put(type, emfSerializerCreater);
	}

	public void unregister(ResultType type) {
		emfSerializerCreators.remove(type);
	}
	
	public EmfSerializer create(ResultType resultType, EmfModel<Long> model) {
		EmfSerializerCreator emfSerializerCreator = emfSerializerCreators.get(resultType);
		return emfSerializerCreator.create(model);
	}

	public boolean resultTypeEnabled(ResultType resultType) {
		return emfSerializerCreators.containsKey(resultType);
	}
	
	public Set<ResultType> getMultipleResultTypes() {
		Set<ResultType> result = new LinkedHashSet<ResultType>();
		for (ResultType resultType : emfSerializerCreators.keySet()) {
			if (resultType.getType() == Type.MULTIPLE) {
				result.add(resultType);
			}
		}
		return result;
	}

	public Set<ResultType> getSingleResultTypes() {
		return emfSerializerCreators.keySet();
	}
	
	public void initSerializers() {
		String enabledExportTypesString = ServerSettings.getSettings().getEnabledExportTypes();
		String[] enabledExportTypes = enabledExportTypesString.split(",");
		EnumSet<ResultType> enabled = EnumSet.noneOf(ResultType.class);
		for (String type : enabledExportTypes) {
			String upperCase = type.trim().toUpperCase();
			if (!upperCase.equals("")) {
				enabled.add(ResultType.valueOf(upperCase));
			}
		}
		if (enabled.contains(ResultType.IFC)) {
			register(ResultType.IFC, new EmfSerializerCreator() {
				@Override
				public EmfSerializer create(EmfModel<Long> model) {
					IfcStepSerializer ifcSerializer = new IfcStepSerializer(model, schemaDefinition);
					ifcSerializer.setFileDescription("Bimserver.org " + version.getLatest() + " generated IFC file");
					ifcSerializer.setPreProcessorVersion("Bimserver.org " + version.getLatest());
					return ifcSerializer;
				}
			});
		} else {
			unregister(ResultType.IFC);
		}
		if (enabled.contains(ResultType.IFCXML)) {
			register(ResultType.IFCXML, new EmfSerializerCreator() {
				@Override
				public EmfSerializer create(EmfModel<Long> model) {
					return new IfcXmlSerializer(model, schemaDefinition);
				}
			});
		} else {
			unregister(ResultType.IFCXML);
		}
		if (enabled.contains(ResultType.TEXT)) {
			register(ResultType.TEXT, new EmfSerializerCreator() {
				@Override
				public EmfSerializer create(EmfModel<Long> model) {
					IfcStepSerializer ifcSerializer = new IfcStepSerializer(model, schemaDefinition);
					ifcSerializer.setFileDescription("Bimserver.org " + version.getLatest() + " generated IFC file");
					ifcSerializer.setPreProcessorVersion("Bimserver.org " + version.getLatest());
					return ifcSerializer;
				}
			});
		} else {
			unregister(ResultType.TEXT);
		}
		if (enabled.contains(ResultType.CITYGML)) {
			register(ResultType.CITYGML, new EmfSerializerCreator() {
				@Override
				public EmfSerializer create(EmfModel<Long> model) {
					return new IfcToCityGML(model, schemaDefinition, fieldIgnoreMap, ifcEngine);
				}
			});
		} else {
			unregister(ResultType.CITYGML);
		}
		if (enabled.contains(ResultType.COLLADA)) {
			register(ResultType.COLLADA, new EmfSerializerCreator() {
				@Override
				public EmfSerializer create(EmfModel<Long> model) {
					return new IfcToCollada(model, schemaDefinition, fieldIgnoreMap, ifcEngine);
				}
			});
		} else {
			unregister(ResultType.COLLADA);
		}
		if (enabled.contains(ResultType.KMZ)) {
			register(ResultType.KMZ, new EmfSerializerCreator() {
				@Override
				public EmfSerializer create(EmfModel<Long> model) {
					return new KmzSerializer(model, schemaDefinition, fieldIgnoreMap, ifcEngine);
				}
			});
		} else {
			unregister(ResultType.KMZ);
		}
		if (enabled.contains(ResultType.O3D_JSON)) {
			register(ResultType.O3D_JSON, new EmfSerializerCreator() {
				@Override
				public EmfSerializer create(EmfModel<Long> model) {
					return new O3dJsonSerializer(model, fieldIgnoreMap, schemaDefinition, ifcEngine);
				}
			});
		} else {
			unregister(ResultType.O3D_JSON);
		}
		if (enabled.contains(ResultType.OBJECT_INFO)) {
			register(ResultType.OBJECT_INFO, new EmfSerializerCreator() {
				@Override
				public EmfSerializer create(EmfModel<Long> model) {
					return new ObjectInfoSerializer(model, fieldIgnoreMap);
				}
			});
		} else {
			unregister(ResultType.OBJECT_INFO);
		}
	}
}