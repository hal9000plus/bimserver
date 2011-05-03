package org.bimserver.tests;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.ifc.FileFieldIgnoreMap;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.SchemaLoader;
import org.bimserver.ifc.file.reader.IfcStepDeserializer;
import org.bimserver.ifc.file.reader.IncorrectIfcFileException;
import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcBuildingStorey;
import org.bimserver.models.ifc2x3.IfcDoor;
import org.bimserver.models.ifc2x3.IfcProduct;
import org.bimserver.models.ifc2x3.IfcRelContainedInSpatialStructure;
import org.bimserver.shared.LocalDevelopmentResourceFetcher;
import org.bimserver.shared.ResourceFetcher;
import org.bimserver.utils.CollectionUtils;

public class SimpleTest {
	public static void main(String[] args) {
		new SimpleTest().start();
	}

	private void start() {
		SchemaDefinition schema = SchemaLoader.loadDefaultSchema();
		IfcStepDeserializer fastIfcFileReader = new IfcStepDeserializer(schema);
		ResourceFetcher resourceFetcher = new LocalDevelopmentResourceFetcher();
		FileFieldIgnoreMap fieldIgnoreMap = new FileFieldIgnoreMap(CollectionUtils.singleSet(Ifc2x3Package.eINSTANCE), resourceFetcher);
		try {
			fastIfcFileReader.read(TestFile.HAUS_SOURCE_FILE.getFile());
			IfcModel model = fastIfcFileReader.getModel();
            List<IfcBuildingStorey> stories = model.getAll(IfcBuildingStorey.class);
            Map<Float, IfcBuildingStorey> orderedStories = new TreeMap<Float, IfcBuildingStorey>();
            for (IfcBuildingStorey storey : stories) {
                orderedStories.put(storey.getElevation(), storey);
            }
            if (orderedStories.size() > 1) {
                IfcBuildingStorey firstFloor = stories.get(1);
                for (IfcRelContainedInSpatialStructure rel : firstFloor.getContainsElements()) {
                	for (IfcProduct product : rel.getRelatedElements()) {
                		if (product instanceof IfcDoor) {
                			IfcDoor ifcDoor = (IfcDoor)product;
                            if (ifcDoor.getOverallHeight() > 2) {
                                System.out.println(ifcDoor.getName() + " " + ifcDoor.getOverallHeight());
                            }
                		}
                	}
                }
            }
		} catch (IncorrectIfcFileException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}