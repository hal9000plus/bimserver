package org.bimserver.citygml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import nl.tue.buildingsmart.emf.DerivedReader;
import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.citygml.objects.Annotation;
import org.bimserver.citygml.objects.Beam;
import org.bimserver.citygml.objects.Column;
import org.bimserver.citygml.objects.FlowTerminal;
import org.bimserver.citygml.objects.GlobalId;
import org.bimserver.citygml.objects.OpeningElement;
import org.bimserver.citygml.objects.Railing;
import org.bimserver.citygml.objects.Stair;
import org.bimserver.emf.BasicEmfModel;
import org.bimserver.emf.EmfModel;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.ifc.FileFieldIgnoreMap;
import org.bimserver.ifc.IfcRootObject;
import org.bimserver.ifc.ResourceFetcher;
import org.bimserver.ifc.database.IfcDatabase;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Factory;
import org.bimserver.ifc.emf.Ifc2x3.Ifc2x3Package;
import org.bimserver.ifc.emf.Ifc2x3.IfcAnnotation;
import org.bimserver.ifc.emf.Ifc2x3.IfcBeam;
import org.bimserver.ifc.emf.Ifc2x3.IfcBuilding;
import org.bimserver.ifc.emf.Ifc2x3.IfcBuildingElementProxy;
import org.bimserver.ifc.emf.Ifc2x3.IfcBuildingStorey;
import org.bimserver.ifc.emf.Ifc2x3.IfcColumn;
import org.bimserver.ifc.emf.Ifc2x3.IfcDoor;
import org.bimserver.ifc.emf.Ifc2x3.IfcElement;
import org.bimserver.ifc.emf.Ifc2x3.IfcFlowTerminal;
import org.bimserver.ifc.emf.Ifc2x3.IfcFurnishingElement;
import org.bimserver.ifc.emf.Ifc2x3.IfcInternalOrExternalEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcLabel;
import org.bimserver.ifc.emf.Ifc2x3.IfcObjectDefinition;
import org.bimserver.ifc.emf.Ifc2x3.IfcOpeningElement;
import org.bimserver.ifc.emf.Ifc2x3.IfcPostalAddress;
import org.bimserver.ifc.emf.Ifc2x3.IfcProduct;
import org.bimserver.ifc.emf.Ifc2x3.IfcProject;
import org.bimserver.ifc.emf.Ifc2x3.IfcRailing;
import org.bimserver.ifc.emf.Ifc2x3.IfcRelContainedInSpatialStructure;
import org.bimserver.ifc.emf.Ifc2x3.IfcRelDecomposes;
import org.bimserver.ifc.emf.Ifc2x3.IfcRelFillsElement;
import org.bimserver.ifc.emf.Ifc2x3.IfcRelSpaceBoundary;
import org.bimserver.ifc.emf.Ifc2x3.IfcRelVoidsElement;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoof;
import org.bimserver.ifc.emf.Ifc2x3.IfcRoot;
import org.bimserver.ifc.emf.Ifc2x3.IfcSite;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlab;
import org.bimserver.ifc.emf.Ifc2x3.IfcSlabTypeEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcSpace;
import org.bimserver.ifc.emf.Ifc2x3.IfcStair;
import org.bimserver.ifc.emf.Ifc2x3.IfcStairTypeEnum;
import org.bimserver.ifc.emf.Ifc2x3.IfcVirtualElement;
import org.bimserver.ifc.emf.Ifc2x3.IfcWallStandardCase;
import org.bimserver.ifc.emf.Ifc2x3.IfcWindow;
import org.bimserver.ifc.emf.Ifc2x3.WrappedValue;
import org.bimserver.ifc.file.reader.FastIfcFileReader;
import org.bimserver.ifc.file.writer.IfcSerializer;
import org.bimserver.tests.TestFile;
import org.bimserver.utils.CollectionUtils;
import org.citygml4j.CityGMLContext;
import org.citygml4j.factory.CityGMLFactory;
import org.citygml4j.factory.GMLFactory;
import org.citygml4j.factory.XALFactory;
import org.citygml4j.impl.jaxb.citygml.generics._0_4.GenericDoubleAttributeImpl;
import org.citygml4j.model.citygml.CityGMLModuleVersion;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.building.BoundarySurface;
import org.citygml4j.model.citygml.building.BoundarySurfaceProperty;
import org.citygml4j.model.citygml.building.Building;
import org.citygml4j.model.citygml.building.BuildingFurniture;
import org.citygml4j.model.citygml.building.Door;
import org.citygml4j.model.citygml.building.FloorSurface;
import org.citygml4j.model.citygml.building.InteriorFurnitureProperty;
import org.citygml4j.model.citygml.building.InteriorRoomProperty;
import org.citygml4j.model.citygml.building.OpeningProperty;
import org.citygml4j.model.citygml.building.RoofSurface;
import org.citygml4j.model.citygml.building.Room;
import org.citygml4j.model.citygml.building.Window;
import org.citygml4j.model.citygml.core.Address;
import org.citygml4j.model.citygml.core.AddressProperty;
import org.citygml4j.model.citygml.core.CityModel;
import org.citygml4j.model.citygml.core.CityObject;
import org.citygml4j.model.citygml.core.CityObjectMember;
import org.citygml4j.model.citygml.core.CoreModule;
import org.citygml4j.model.citygml.core.XalAddressProperty;
import org.citygml4j.model.gml.Code;
import org.citygml4j.model.gml.CompositeSurface;
import org.citygml4j.model.gml.DirectPositionList;
import org.citygml4j.model.gml.Exterior;
import org.citygml4j.model.gml.GeometryProperty;
import org.citygml4j.model.gml.LinearRing;
import org.citygml4j.model.gml.MultiSurface;
import org.citygml4j.model.gml.MultiSurfaceProperty;
import org.citygml4j.model.gml.Polygon;
import org.citygml4j.model.gml.Solid;
import org.citygml4j.model.gml.SolidProperty;
import org.citygml4j.model.gml.SurfaceProperty;
import org.citygml4j.model.xal.AddressDetails;
import org.citygml4j.util.JAXBNamespacePrefixMapper;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ade.RailingTypeEnum;
import ade.StairTypeEnum;

public class IfcToCityGML extends EmfSerializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(IfcToCityGML.class);
	private final IfcEngine ifcEngine;
	private final GMLFactory gml;
	private final FileFieldIgnoreMap ignoreMap;
	private final XALFactory xal;
	private final CityGMLFactory citygml;
	private final Map<EObject, CityObject> convertedObjects;
	private final File subfiles = new File("subfiles");
	private final CityGMLContext ctx;
	private final XBuildingAdeContext xBuildingAdeContext;
	private final EmfModel<Long> model;
	private final SchemaDefinition schemaDefinition;
	private int convertCounter;
	private final File schemaFile;

	public static void main(String[] args) {
		try {
			TestFile testFile = TestFile.HAUS_SOURCE_FILE;
			File ifcSchemaFile = new File("lib\\IFC2x3_Final.exp");
			ExpressSchemaParser schemaParser = new ExpressSchemaParser(ifcSchemaFile);
			schemaParser.parse();
			SchemaDefinition schema = schemaParser.getSchema();
			new DerivedReader(ifcSchemaFile, schema);
			FastIfcFileReader fastIfcFileReader = new FastIfcFileReader(schema);
			fastIfcFileReader.read(testFile.getFile());
			ResourceFetcher resourceFetcher = new ResourceFetcher() {
				@Override
				public URL getResource(String name) {
					return getClass().getResource(name);
				}
			};
			FileFieldIgnoreMap ignoreMap = new FileFieldIgnoreMap(CollectionUtils.singleSet(Ifc2x3Package.eINSTANCE), resourceFetcher);
			File outputFile = new File("output", testFile.getFile().getName().replace(".ifc", ".gml"));
			new IfcToCityGML(fastIfcFileReader.getModel(), schema, new File("lib\\IFC2x3_Final.exp"), ignoreMap)
					.write(new FileOutputStream(outputFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public IfcToCityGML(EmfModel<Long> emfModel, SchemaDefinition schemaDefinition, File schemaFile, FileFieldIgnoreMap ignoreMap) {
		super(emfModel);
		this.schemaFile = schemaFile;
		this.ignoreMap = ignoreMap;
		if (!subfiles.isDirectory()) {
			subfiles.mkdir();
		}
		this.model = emfModel;
		this.schemaDefinition = schemaDefinition;
		ctx = new CityGMLContext();
		citygml = ctx.createCityGMLFactory(CityGMLModuleVersion.v0_4_0);
		gml = ctx.createGMLFactory();
		xal = ctx.createXALFactory();
		xBuildingAdeContext = new XBuildingAdeContext();
		ctx.registerADEContext(xBuildingAdeContext);
		ifcEngine = IfcEngine.getInstance();
		convertedObjects = new HashMap<EObject, CityObject>();
	}

	private Code createName(String value) {
		Code code = gml.createCode();
		code.setValue(value);
		return code;
	}

	public void write(OutputStream out) {
		PrintWriter writer = new PrintWriter(out);
		try {
			IfcDatabase<Long> ifcDatabase = new IfcDatabase<Long>(model, null);
			CityModel cityModel = citygml.createCityModel();
			for (IfcProject ifcProject : ifcDatabase.getAll(IfcProject.class)) {
				for (IfcRelDecomposes ifcRelDecomposes : ifcProject.getIsDecomposedBy()) {
					for (IfcObjectDefinition ifcObjectDefinition : ifcRelDecomposes.getRelatedObjects()) {
						if (ifcObjectDefinition instanceof IfcBuilding) {
							IfcBuilding ifcBuilding = (IfcBuilding) ifcObjectDefinition;
							processBuilding(cityModel, ifcBuilding);
						} else if (ifcObjectDefinition instanceof IfcSite) {
							IfcSite ifcSite = (IfcSite) ifcObjectDefinition;
							for (IfcRelDecomposes siteComposites : ifcSite.getIsDecomposedBy()) {
								for (IfcObjectDefinition siteCompositeObject : siteComposites.getRelatedObjects()) {
									if (siteCompositeObject instanceof IfcBuilding) {
										processBuilding(cityModel, (IfcBuilding) siteCompositeObject);
									} else {
										System.out.println("2: " + siteCompositeObject);
									}
								}
							}
						} else {
							System.out.println("1: " + ifcObjectDefinition);
						}
					}
				}
			}
			JAXBContext jaxbCtx = ctx.createJAXBContext();
			Marshaller marshaller = jaxbCtx.createMarshaller();

			JAXBNamespacePrefixMapper nsMapper = new JAXBNamespacePrefixMapper();
			nsMapper.setNamespacePrefixMapping(CoreModule.v0_4_0.getNamespaceUri(), "core");
			nsMapper.setNamespacePrefixMapping(XBuildingAdeContext.NAMESPACE_URI, "xbuilding");

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", nsMapper);
			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, CoreModule.v0_4_0.getNamespaceUri() + " " + CoreModule.v0_4_0.getSchemaLocation());

			JAXBElement<?> cityModelElement = citygml.cityGML2jaxb(cityModel);

			marshaller.marshal(cityModelElement, writer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void processBuilding(CityModel cityModel, IfcBuilding ifcBuilding) {
		Building building = citygml.createBuilding();
		setGlobalId(building, ifcBuilding);
		setName(building.getName(), ifcBuilding.getName());
		Solid solid = gml.createSolid();
		SolidProperty solidProperty = gml.createSolidProperty();
		solidProperty.setSolid(solid);
		building.setLod2Solid(solidProperty);
		CompositeSurface compositeSurface = gml.createCompositeSurface();
		SurfaceProperty exterior = gml.createSurfaceProperty();
		exterior.setSurface(compositeSurface);
		solid.setExterior(exterior);

		CityObjectMember cityObjectMember = citygml.createCityObjectMember();
		cityObjectMember.setCityObject(building);
		cityModel.addCityObjectMember(cityObjectMember);

		IfcPostalAddress ifcBuildingAddress = ifcBuilding.getBuildingAddress();
		if (ifcBuildingAddress != null) {
			building.addAddress(createAddress(ifcBuildingAddress));
		}

		for (IfcRelDecomposes ifcRelDecomposes : ifcBuilding.getIsDecomposedBy()) {
			for (IfcObjectDefinition ifcObjectDefinition : ifcRelDecomposes.getRelatedObjects()) {
				if (ifcObjectDefinition instanceof IfcBuildingStorey) {
					IfcBuildingStorey ifcBuildingStorey = (IfcBuildingStorey) ifcObjectDefinition;
					processStorey(building, ifcBuildingStorey);
				} else {
					System.out.println("3: " + ifcObjectDefinition);
				}
			}
		}
	}

	private void setGlobalId(CityObject cityObject, IfcRoot ifcRoot) {
		if (ifcRoot != null && ifcRoot.getGlobalId() != null && ifcRoot.getGlobalId().getWrappedValue() != null) {
			GlobalId globalId = new GlobalId();
			globalId.setValue(ifcRoot.getGlobalId().getWrappedValue());
			cityObject.addGenericApplicationPropertyOfCityObject(globalId);
		}
	}

	private void processStorey(Building building, IfcBuildingStorey ifcBuildingStorey) {
		for (IfcRelDecomposes ifcRelDecomposes : ifcBuildingStorey.getIsDecomposedBy()) {
			for (IfcObjectDefinition ifcObjectDefinition : ifcRelDecomposes.getRelatedObjects()) {
				if (ifcObjectDefinition instanceof IfcSpace) {
					IfcSpace ifcSpace = (IfcSpace) ifcObjectDefinition;
					processSpace(building, ifcSpace);
				} else {
					System.out.println("4: " + ifcObjectDefinition);
				}
			}
		}
		for (IfcRelContainedInSpatialStructure spatialStructure : ifcBuildingStorey.getContainsElements()) {
			for (IfcProduct ifcProduct : spatialStructure.getRelatedElements()) {
				if (ifcProduct instanceof IfcRoof) {
					RoofSurface roofSurface = citygml.createRoofSurface();
					MultiSurfaceProperty roofMSP = gml.createMultiSurfaceProperty();
					MultiSurface roofMs = gml.createMultiSurface();
					roofMSP.setMultiSurface(roofMs);
					roofSurface.setLod4MultiSurface(roofMSP);
					setGeometry(roofMs, (IfcRootObject) ifcProduct);
					BoundarySurfaceProperty boundarySurfaceProperty = citygml.createBoundarySurfaceProperty();
					boundarySurfaceProperty.setObject(roofSurface);
					convertedObjects.put(ifcProduct, roofSurface);
					setName(roofSurface.getName(), ifcProduct.getName());
					setGlobalId(roofSurface, ifcProduct);
//					IfcRoof ifcRoof = (IfcRoof)ifcProduct;
//					RoofTypeEnum roofTypeEnum = RoofTypeEnum.valueOf(ifcRoof.getShapeType().getName());
//					roofSurface.addGenericApplicationPropertyOfCityObject(roofTypeEnum);
					building.addBoundedBySurface(boundarySurfaceProperty);
				} else {
					ADEComponent cityObject = processProduct(ifcProduct);
					if (cityObject != null) {
						building.addGenericApplicationPropertyOfBuilding(cityObject);
					}
				}
			}
		}
	}

	private ADEComponent processProduct(IfcProduct ifcProduct) {
		if (ifcProduct instanceof IfcStair) {
			Stair stair = new Stair();
			MultiSurfaceProperty stairMSP = gml.createMultiSurfaceProperty();
			MultiSurface stairMs = gml.createMultiSurface();
			setGeometry(stairMs, (IfcRootObject) ifcProduct);
			stairMSP.setMultiSurface(stairMs);
			stair.setLod3MultiSurface(stairMSP);
			setName(stair.getName(), ifcProduct.getName());
			setGlobalId(stair, ifcProduct);
			stair.setGlobalId(ifcProduct.getGlobalId());
			IfcStairTypeEnum ifcShapeType = ((IfcStair)ifcProduct).getShapeType();
			stair.setType(StairTypeEnum.valueOf(ifcShapeType.getName().replace("_", "___")));
			return stair;
		} else if (ifcProduct instanceof IfcWindow || ifcProduct instanceof IfcWallStandardCase || ifcProduct instanceof IfcDoor || ifcProduct instanceof IfcSlab) {
		} else if (ifcProduct instanceof IfcRailing) {
			Railing railing = new Railing();
			IfcRailing ifcRailing = (IfcRailing)ifcProduct;
			MultiSurfaceProperty railingMSP = gml.createMultiSurfaceProperty();
			MultiSurface stairMs = gml.createMultiSurface();
			setGeometry(stairMs, (IfcRootObject) ifcProduct);
			railingMSP.setMultiSurface(stairMs);
			railing.setLod3MultiSurface(railingMSP);
			setName(railing.getName(), ifcProduct.getName());
			setGlobalId(railing, ifcProduct);
			railing.setGlobalId(ifcProduct.getGlobalId());
			railing.setPredefinedType(RailingTypeEnum.valueOf(ifcRailing.getPredefinedType().getName().replace("_", "___")));
			return railing;
		} else if (ifcProduct instanceof IfcAnnotation) {
			Annotation annotation = new Annotation();
			MultiSurfaceProperty annotationMSP = gml.createMultiSurfaceProperty();
			MultiSurface stairMs = gml.createMultiSurface();
			setGeometry(stairMs, (IfcRootObject) ifcProduct);
			annotationMSP.setMultiSurface(stairMs);
			annotation.setLod3MultiSurface(annotationMSP);
			setName(annotation.getName(), ifcProduct.getName());
			setGlobalId(annotation, ifcProduct);
			annotation.setGlobalId(ifcProduct.getGlobalId());
			return annotation;
		} else if (ifcProduct instanceof IfcColumn) {
			Column column = new Column();
			MultiSurfaceProperty columnMSP = gml.createMultiSurfaceProperty();
			MultiSurface stairMs = gml.createMultiSurface();
			setGeometry(stairMs, (IfcRootObject) ifcProduct);
			columnMSP.setMultiSurface(stairMs);
			column.setLod3MultiSurface(columnMSP);
			setName(column.getName(), ifcProduct.getName());
			setGlobalId(column, ifcProduct);
			column.setGlobalId(ifcProduct.getGlobalId());
			return column;
		} else if (ifcProduct instanceof IfcBuildingElementProxy) {
			// Do nothing, this is a bad IFC thing
		} else if (ifcProduct instanceof IfcBeam) {
			Beam beam = new Beam();
			MultiSurfaceProperty beamMSP = gml.createMultiSurfaceProperty();
			MultiSurface stairMs = gml.createMultiSurface();
			setGeometry(stairMs, (IfcRootObject) ifcProduct);
			beamMSP.setMultiSurface(stairMs);
			beam.setLod3MultiSurface(beamMSP);
			setName(beam.getName(), ifcProduct.getName());
			setGlobalId(beam, ifcProduct);
			beam.setGlobalId(ifcProduct.getGlobalId());
			return beam;
		} else if (ifcProduct instanceof IfcOpeningElement) {
			OpeningElement openingElement = new OpeningElement();
			MultiSurfaceProperty openingElementMSP = gml.createMultiSurfaceProperty();
			MultiSurface stairMs = gml.createMultiSurface();
			setGeometry(stairMs, (IfcRootObject) ifcProduct);
			openingElementMSP.setMultiSurface(stairMs);
			openingElement.setLod3MultiSurface(openingElementMSP);
			setName(openingElement.getName(), ifcProduct.getName());
			setGlobalId(openingElement, ifcProduct);
			ifcProduct.setGlobalId(ifcProduct.getGlobalId());
			return openingElement;
		} else {
			System.out.println("5: " + ifcProduct);
		}
		return null;
	}

	private void processSpace(Building building, IfcSpace ifcSpace) {
		Room room = citygml.createRoom();
		setName(room.getName(), ifcSpace.getName());
		setGlobalId(room, ifcSpace);
		convertedObjects.put(ifcSpace, room);
		MultiSurfaceProperty multiSurfaceProperty = gml.createMultiSurfaceProperty();
		MultiSurface ms = gml.createMultiSurface();
		multiSurfaceProperty.setMultiSurface(ms);
		room.setLod4MultiSurface(multiSurfaceProperty);
		InteriorRoomProperty createInteriorRoomProperty = citygml.createInteriorRoomProperty();
		createInteriorRoomProperty.setObject(room);
		building.addInteriorRoom(createInteriorRoomProperty);
		setGeometry(ms, (IfcRootObject) ifcSpace);
		for (IfcRelSpaceBoundary boundary : ifcSpace.getBoundedBy()) {
			IfcElement ifcRelating = boundary.getRelatedBuildingElement();
			if (ifcRelating instanceof IfcWallStandardCase) {
				IfcWallStandardCase ifcWall = (IfcWallStandardCase) ifcRelating;
				if (convertedObjects.containsKey(ifcWall)) {
				} else {
					BoundarySurface boundarySurface = null;
					if (boundary.getInternalOrExternalBoundary() == IfcInternalOrExternalEnum.INTERNAL) {
						boundarySurface = citygml.createInteriorWallSurface();
					} else {
						boundarySurface = citygml.createWallSurface();
					}
					setName(boundarySurface.getName(), ifcWall.getName());
					setGlobalId(boundarySurface, ifcWall);
					convertedObjects.put(ifcWall, boundarySurface);
					BoundarySurfaceProperty boundarySurfaceProperty = citygml.createBoundarySurfaceProperty();
					boundarySurfaceProperty.setObject(boundarySurface);
					MultiSurface wallMs = gml.createMultiSurface();
					MultiSurfaceProperty wallMSP = gml.createMultiSurfaceProperty();
					wallMSP.setMultiSurface(wallMs);
					boundarySurface.setLod4MultiSurface(wallMSP);
					setGeometry(wallMs, (IfcRootObject) ifcWall);
					room.addBoundedBySurface(boundarySurfaceProperty);
					for (IfcRelVoidsElement ifcRelVoidsElement : ifcWall.getHasOpenings()) {
						IfcOpeningElement ifcOpeningElement = (IfcOpeningElement) ifcRelVoidsElement.getRelatedOpeningElement();
						for (IfcRelFillsElement filling : ifcOpeningElement.getHasFillings()) {
							IfcElement ifcRelatedBuildingElement = filling.getRelatedBuildingElement();
							if (ifcRelatedBuildingElement instanceof IfcWindow) {
								if (convertedObjects.containsKey(ifcRelatedBuildingElement)) {
								} else {
									Window window = citygml.createWindow();
									IfcWindow ifcWindow = (IfcWindow)ifcRelatedBuildingElement;
									setName(window.getName(), ifcRelatedBuildingElement.getName());
									setGlobalId(window, ifcRelatedBuildingElement);
									convertedObjects.put(ifcRelatedBuildingElement, window);
									MultiSurfaceProperty windowMSP = gml.createMultiSurfaceProperty();
									MultiSurface windowMs = gml.createMultiSurface();
									windowMSP.setMultiSurface(windowMs);
									window.setLod4MultiSurface(windowMSP);
									setGeometry(windowMs, (IfcRootObject) ifcRelatedBuildingElement);
									OpeningProperty openingProperty = citygml.createOpeningProperty();
									openingProperty.setObject(window);
									boundarySurface.addOpening(openingProperty);
									GenericDoubleAttributeImpl genericAttributeWidth = new GenericDoubleAttributeImpl();
									genericAttributeWidth.setValue((double)ifcWindow.getOverallWidth().getWrappedValue());
									genericAttributeWidth.setName("OverallWidth");
									window.addGenericAttribute(genericAttributeWidth);
									GenericDoubleAttributeImpl genericAttributeHeight = new GenericDoubleAttributeImpl();
									genericAttributeHeight.setValue((double)ifcWindow.getOverallHeight().getWrappedValue());
									genericAttributeHeight.setName("OverallHeight");
									window.addGenericAttribute(genericAttributeHeight);
									boundarySurface.addOpening(openingProperty);
								}
							} else if (ifcRelatedBuildingElement instanceof IfcDoor) {
								if (convertedObjects.containsKey(ifcRelatedBuildingElement)) {
								} else {
									IfcDoor ifcDoor = (IfcDoor)ifcRelatedBuildingElement;
									Door door = citygml.createDoor();
									setName(door.getName(), ifcRelatedBuildingElement.getName());
									setGlobalId(door, ifcRelatedBuildingElement);
									convertedObjects.put(ifcRelatedBuildingElement, door);
									MultiSurfaceProperty doorMSP = gml.createMultiSurfaceProperty();
									MultiSurface doorMs = gml.createMultiSurface();
									doorMSP.setMultiSurface(doorMs);
									door.setLod4MultiSurface(doorMSP);
									setGeometry(doorMs, (IfcRootObject) ifcRelatedBuildingElement);
									OpeningProperty openingProperty = citygml.createOpeningProperty();
									openingProperty.setObject(door);
									GenericDoubleAttributeImpl genericAttributeWidth = new GenericDoubleAttributeImpl();
									genericAttributeWidth.setName("OverallWidth");
									genericAttributeWidth.setValue((double)ifcDoor.getOverallWidth().getWrappedValue());
									door.addGenericAttribute(genericAttributeWidth);
									GenericDoubleAttributeImpl genericAttributeHeight = new GenericDoubleAttributeImpl();
									genericAttributeHeight.setValue((double)ifcDoor.getOverallHeight().getWrappedValue());
									genericAttributeHeight.setName("OverallHeight");
									door.addGenericAttribute(genericAttributeHeight);
									boundarySurface.addOpening(openingProperty);
								}
							} else {
								System.out.println("6: " + ifcRelatedBuildingElement);
							}
						}
					}
				}
			} else if (ifcRelating instanceof IfcSlab) {
				if (convertedObjects.containsKey(ifcRelating)) {
				} else {
					IfcSlab ifcSlab = (IfcSlab) ifcRelating;
					if (ifcSlab.getPredefinedType() == IfcSlabTypeEnum.ROOF) {
						RoofSurface roofSurface = citygml.createRoofSurface();
						MultiSurfaceProperty roofMSP = gml.createMultiSurfaceProperty();
						MultiSurface roofMs = gml.createMultiSurface();
						roofMSP.setMultiSurface(roofMs);
						roofSurface.setLod4MultiSurface(roofMSP);
						setGeometry(roofMs, (IfcRootObject) ifcRelating);
						BoundarySurfaceProperty boundarySurfaceProperty = citygml.createBoundarySurfaceProperty();
						boundarySurfaceProperty.setObject(roofSurface);
						room.addBoundedBySurface(boundarySurfaceProperty);
						setName(roofSurface.getName(), ifcSlab.getName());
						setGlobalId(roofSurface, ifcSlab);
						convertedObjects.put(ifcRelating, roofSurface);
					} else if (ifcSlab.getPredefinedType() == IfcSlabTypeEnum.FLOOR || ifcSlab.getPredefinedType() == IfcSlabTypeEnum.BASESLAB
							|| ifcSlab.getPredefinedType() == IfcSlabTypeEnum.LANDING) {
						FloorSurface floorSurface = citygml.createFloorSurface();
						MultiSurfaceProperty floorMSP = gml.createMultiSurfaceProperty();
						MultiSurface floorMs = gml.createMultiSurface();
						floorMSP.setMultiSurface(floorMs);
						floorSurface.setLod4MultiSurface(floorMSP);
						setGeometry(floorMs, (IfcRootObject) ifcRelating);
						BoundarySurfaceProperty boundarySurfaceProperty = citygml.createBoundarySurfaceProperty();
						boundarySurfaceProperty.setObject(floorSurface);
						room.addBoundedBySurface(boundarySurfaceProperty);
						setName(floorSurface.getName(), ifcSlab.getName());
						setGlobalId(floorSurface, ifcSlab);
						convertedObjects.put(ifcRelating, floorSurface);
					} else {
						System.out.println("Unimplemented slab type " + ifcSlab.getPredefinedType());
					}
				}
			} else if (ifcRelating instanceof IfcRoof) {
				if (convertedObjects.containsKey(ifcRelating)) {
				} else {
					RoofSurface roofSurface = citygml.createRoofSurface();
					MultiSurfaceProperty roofMSP = gml.createMultiSurfaceProperty();
					MultiSurface roofMs = gml.createMultiSurface();
					roofMSP.setMultiSurface(roofMs);
					roofSurface.setLod4MultiSurface(roofMSP);
					setGeometry(roofMs, (IfcRootObject) ifcRelating);
					BoundarySurfaceProperty boundarySurfaceProperty = citygml.createBoundarySurfaceProperty();
					boundarySurfaceProperty.setObject(roofSurface);
					room.addBoundedBySurface(boundarySurfaceProperty);
					setName(roofSurface.getName(), ifcRelating.getName());
					setGlobalId(roofSurface, ifcRelating);
					convertedObjects.put(ifcRelating, roofSurface);
				}
			} else if (ifcRelating instanceof IfcOpeningElement) {
				room.addGenericApplicationPropertyOfRoom(processProduct(ifcRelating));
			} else if (ifcRelating instanceof IfcColumn) {
				room.addGenericApplicationPropertyOfRoom(processProduct(ifcRelating));
			} else if (ifcRelating == null || ifcRelating instanceof IfcWindow || ifcRelating instanceof IfcDoor || ifcRelating instanceof IfcVirtualElement) {
				// ignore
			} else {
				System.out.println("8: " + ifcRelating);
			}
		}
		for (IfcRelContainedInSpatialStructure contains : ifcSpace.getContainsElements()) {
			for (IfcProduct ifcProduct : contains.getRelatedElements()) {
				if (ifcProduct instanceof IfcFurnishingElement) {
					if (convertedObjects.containsKey(ifcProduct)) {
					} else {
						BuildingFurniture buildingFurniture = citygml.createBuildingFurniture();
						GeometryProperty createGeometryProperty = gml.createGeometryProperty();
						MultiSurface createMultiSurface = gml.createMultiSurface();
						setGeometry(createMultiSurface, (IfcRootObject) ifcProduct);
						createGeometryProperty.setGeometry(createMultiSurface);
						buildingFurniture.setLod4Geometry(createGeometryProperty);
						convertedObjects.put(ifcProduct, buildingFurniture);
						InteriorFurnitureProperty ifp = citygml.createInteriorFurnitureProperty();
						ifp.setObject(buildingFurniture);
						setName(buildingFurniture.getName(), ifcProduct.getName());
						setGlobalId(buildingFurniture, ifcProduct);
						room.addInteriorFurniture(ifp);
					}
				} else if (ifcProduct instanceof IfcFlowTerminal) {
					FlowTerminal flowTerminal = new FlowTerminal();
					setName(flowTerminal.getName(), ifcProduct.getName());
					MultiSurfaceProperty createGeometryProperty = gml.createMultiSurfaceProperty();
					MultiSurface createMultiSurface = gml.createMultiSurface();
					setGeometry(createMultiSurface, (IfcRootObject) ifcProduct);
					createGeometryProperty.setMultiSurface(createMultiSurface);
					flowTerminal.setLod3MultiSurface(createGeometryProperty);
					room.getGenericApplicationPropertyOfRoom().add(flowTerminal);
					setName(flowTerminal.getName(), ifcProduct.getName());
					setGlobalId(flowTerminal, ifcProduct);
					flowTerminal.setGlobalId(ifcProduct.getGlobalId());
				}
			}
		}
	}

	private void setName(List<Code> name, IfcLabel label) {
		if (label != null && label.getWrappedValue() != null) {
			name.add(createName(label.getWrappedValue()));
		}
	}

	private AddressProperty createAddress(IfcPostalAddress ifcBuildingAddress) {
		Address address = citygml.createAddress();
		XalAddressProperty xalAddressProperty = citygml.createXalAddressProperty();
		AddressDetails addressDetails = xal.createAddressDetails();
		xalAddressProperty.setAddressDetails(addressDetails);
		address.setXalAddress(xalAddressProperty);
		AddressProperty addressProperty = citygml.createAddressProperty();
		addressProperty.setObject(address);
		return addressProperty;
	}

	private void setGeometry(MultiSurface ms, IfcRootObject ifcRootObject) {
		convertCounter++;
		EmfModel<Long> basicEmfModel = new BasicEmfModel<Long>();
		convertToSubset(ifcRootObject.eClass(), ifcRootObject, basicEmfModel, new HashMap<EObject, EObject>());
		IfcSerializer ifcSerializer = new IfcSerializer(basicEmfModel, schemaDefinition);
		File file = new File(subfiles, convertCounter + ".ifc");
		try {
			ifcSerializer.write(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			int modelID = ifcEngine.sdaiOpenModelBN(convertCounter, file.getAbsolutePath(), schemaFile.getAbsolutePath());
			IfcEngine.SurfaceProperties sp = ifcEngine.initializeModelling(modelID, 0.0);
			int verticesCount = sp.getVerticesCount();
			float[] coordinates = new float[verticesCount * 3];
			float[] normals = new float[verticesCount * 3];
			int[] indices = new int[sp.getIndicesCount()];
			ifcEngine.finalizeModelling(modelID, coordinates, normals, indices);
			for (int i = 0; i < indices.length; i += 3) {
				int i1 = indices[i];
				int i2 = indices[i + 1];
				int i3 = indices[i + 2];
				ms.addSurfaceMember(createSurfaceProperty(gml, Arrays.asList(new Double[] { (double) coordinates[i1 * 3], (double) coordinates[i1 * 3 + 1],
						(double) coordinates[i1 * 3 + 2], (double) coordinates[i2 * 3], (double) coordinates[i2 * 3 + 1], (double) coordinates[i2 * 3 + 2],
						(double) coordinates[i3 * 3], (double) coordinates[i3 * 3 + 1], (double) coordinates[i3 * 3 + 2], (double) coordinates[i1 * 3],
						(double) coordinates[i1 * 3 + 1], (double) coordinates[i1 * 3 + 2] })));
				ms.addSurfaceMember(createSurfaceProperty(gml, Arrays.asList(new Double[] { (double) coordinates[i1 * 3], (double) coordinates[i1 * 3 + 1],
						(double) coordinates[i1 * 3 + 2], (double) coordinates[i3 * 3], (double) coordinates[i3 * 3 + 1], (double) coordinates[i3 * 3 + 2],
						(double) coordinates[i2 * 3], (double) coordinates[i2 * 3 + 1], (double) coordinates[i2 * 3 + 2], (double) coordinates[i1 * 3],
						(double) coordinates[i1 * 3 + 1], (double) coordinates[i1 * 3 + 2] })));
			}
			ifcEngine.sdaiCloseModel(modelID);
		} catch (Exception e) {
			LOGGER.error("", e);
		}
	}

	@SuppressWarnings("unchecked")
	private EObject convertToSubset(EClass originalClass, IfcRootObject ifcRootObject, EmfModel<Long> newModel, Map<EObject, EObject> converted) {
		EObject newObject = Ifc2x3Factory.eINSTANCE.create(ifcRootObject.eClass());
		converted.put(ifcRootObject, newObject);
		if (!(newObject instanceof WrappedValue)) {
			newModel.add(newObject);
		}
		for (EStructuralFeature eStructuralFeature : ifcRootObject.eClass().getEAllStructuralFeatures()) {
			if (!ignoreMap.shouldIgnoreField(ifcRootObject.eClass(), ifcRootObject.eClass(), eStructuralFeature)) {
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
									toList.addUnique(convertToSubset(originalClass, (IfcRootObject) o, newModel, converted));
								}
							}
						} else {
							if (converted.containsKey(get)) {
								newObject.eSet(eStructuralFeature, converted.get(get));
							} else {
								newObject.eSet(eStructuralFeature, convertToSubset(originalClass, (IfcRootObject) get, newModel, converted));
							}
						}
					}
				}
			}
		}
		return newObject;
	}

	private static SurfaceProperty createSurfaceProperty(GMLFactory gml, List<Double> points) {
		Polygon polygon = gml.createPolygon();

		Exterior exterior = gml.createExterior();
		polygon.setExterior(exterior);

		LinearRing linearRing = gml.createLinearRing();
		exterior.setRing(linearRing);

		DirectPositionList posList = gml.createDirectPositionList();
		posList.setValue(points);
		posList.setSrsDimension(3);
		linearRing.setPosList(posList);

		SurfaceProperty surfaceProperty = gml.createSurfaceProperty();
		surfaceProperty.setSurface(polygon);

		return surfaceProperty;
	}
}