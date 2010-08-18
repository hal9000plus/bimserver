package org.bimserver.citygml;

/**
 * IFC Engine Java Wrapper test.
 */

/**
 * @author Peter Willems (TNO)
 * 
 */
public class IfcEngineTest {
	public static final String MODEL = "RioleringTestArkey.ifc";
	public static final String SCHEMA = "lib\\IFC2x3_Final.exp";
	private static final String IFC_DISTRIBUTION_PORT = "IFCDISTRIBUTIONPORT";
	private static final String IFC_FLOW_SEGMENT = "IFCFLOWSEGMENT";
	private static final String IFC_FLOW_FITTING = "IFCFLOWFITTING";
	private static final String IFC_FLOW_TERMINAL = "IFCFLOWTERMINAL";
	private static final String CONNECTED_FROM = "ConnectedFrom";
	private static final String CONNECTED_TO = "ConnectedTo";
	private static final String CONTAINED_IN = "ContainedIn";
	private static final String HAS_PORTS = "HasPorts";
	private static final String NAME = "Name";
	private static final String RELATED_ELEMENT = "RelatedElement";
	private static final String RELATING_PORT = "RelatingPort";

	private final IfcEngine engine;

	private final int modelID;

	public IfcEngineTest() throws Exception {
		engine = IfcEngine.getInstance();

		modelID = engine.sdaiOpenModelBN(1, MODEL, SCHEMA);

		if (modelID != 0) {
			firstStep();
		} else {
			System.out.println("Can't open model: " + MODEL);
		}
	}

	private void firstStep() throws Exception {
		int distributionPorts = engine.sdaiGetEntityExtentBN(modelID,
				IFC_DISTRIBUTION_PORT);
		int noDistributionPorts = engine.sdaiGetMemberCount(distributionPorts);

		for (int i = 0; i < noDistributionPorts; i++) {
			int distributionPort = (Integer) engine.engiGetAggrElement(
					distributionPorts, i, IfcEngine.sdaiINSTANCE);
			int connectedTo = (Integer) engine.sdaiGetAttrBN(distributionPort,
					CONNECTED_TO, IfcEngine.sdaiINSTANCE);
			int connectedFrom = (Integer) engine.sdaiGetAttrBN(
					distributionPort, CONNECTED_FROM, IfcEngine.sdaiINSTANCE);

			if (connectedTo == 0 && connectedFrom == 0) {
				String name = (String) engine.sdaiGetAttrBN(distributionPort,
						NAME, IfcEngine.sdaiSTRING);
				System.out.println("1 DistributionPort = " + name);
				secondStep(distributionPort);
			}
		}
	}

	private void secondStep(int distributionPort) throws Exception {
		int relConnectsPortToElement = (Integer) engine.sdaiGetAttrBN(
				distributionPort, CONTAINED_IN, IfcEngine.sdaiINSTANCE);
		int flowSegment = (Integer) engine.sdaiGetAttrBN(
				relConnectsPortToElement, RELATED_ELEMENT,
				IfcEngine.sdaiINSTANCE);

		String name = (String) engine.sdaiGetAttrBN(flowSegment, NAME,
				IfcEngine.sdaiSTRING);
		System.out.println("2 FlowSegment = " + name);
		thirdStep(flowSegment, distributionPort);
	}

	private void thirdStep(int flowSegment, int orgDistributionPort)
			throws Exception {
		int relConnectsPortToElements = (Integer) engine.sdaiGetAttrBN(
				flowSegment, HAS_PORTS, IfcEngine.sdaiAGGR);
		int noRelConnectsPortToElements = engine
				.sdaiGetMemberCount(relConnectsPortToElements);

		int relevantPortsFound = 0, originalPortsFound = 0;
		for (int i = 0; i < noRelConnectsPortToElements; i++) {
			int relConnectsPortToElement = (Integer) engine.engiGetAggrElement(
					relConnectsPortToElements, i, IfcEngine.sdaiINSTANCE);
			int distributionPort = (Integer) engine.sdaiGetAttrBN(
					relConnectsPortToElement, RELATING_PORT,
					IfcEngine.sdaiINSTANCE);

			if (distributionPort == orgDistributionPort)
				originalPortsFound++;
			else {
				String name = (String) engine.sdaiGetAttrBN(distributionPort,
						NAME, IfcEngine.sdaiSTRING);
				relevantPortsFound++;
				System.out.println("3 Port " + relevantPortsFound
						+ ": DistributionPort = " + name);
				fourthStep(distributionPort);
			}
		}
		if (originalPortsFound != 1)
			System.out.println("originalPortsFound != 1");
		if (relevantPortsFound != 1)
			System.out.println("relevantPortsFound != 1");
	}

	private void fourthStep(int distributionPort) throws Exception {
		int relConnectsPort = (Integer) engine.sdaiGetAttrBN(distributionPort,
				CONNECTED_FROM, IfcEngine.sdaiINSTANCE);
		int relatingDistributionPort = (Integer) engine.sdaiGetAttrBN(
				relConnectsPort, RELATING_PORT, IfcEngine.sdaiINSTANCE);

		String name = (String) engine.sdaiGetAttrBN(relatingDistributionPort,
				NAME, IfcEngine.sdaiSTRING);
		System.out.println("4 RelatingDistributionPort = " + name);

		fifthStep(relatingDistributionPort);
	}

	private void fifthStep(int distributionPort) throws Exception {
		int relConnectsPortToElement = (Integer) engine.sdaiGetAttrBN(
				distributionPort, CONTAINED_IN, IfcEngine.sdaiINSTANCE);
		int unknown = (Integer) engine.sdaiGetAttrBN(relConnectsPortToElement,
				RELATED_ELEMENT, IfcEngine.sdaiINSTANCE);
		String name = (String) engine.sdaiGetAttrBN(unknown, NAME,
				IfcEngine.sdaiSTRING);

		int flowSegmentEntity = engine.sdaiGetEntity(modelID, IFC_FLOW_SEGMENT);
		int flowFittingEntity = engine.sdaiGetEntity(modelID, IFC_FLOW_FITTING);
		int flowTerminalEntity = engine.sdaiGetEntity(modelID,
				IFC_FLOW_TERMINAL);
		if (engine.sdaiGetInstanceType(unknown) == flowSegmentEntity) {
			System.out.println("5 FlowSegment = " + name);
			thirdStep(unknown, distributionPort);
		} else {
			if (engine.sdaiGetInstanceType(unknown) == flowFittingEntity) {
				System.out.println("5 FlowFitting = " + name);
				sixthStep(unknown, distributionPort);
			} else {
				if (engine.sdaiGetInstanceType(unknown) == flowTerminalEntity)
					System.out.println("5 Endpoint (terminal) = " + name);
				else
					System.out.println("Incorrect entity found in FifthStep");
			}
		}
	}

	private void sixthStep(int flowSegment, int orgDistributionPort)
			throws Exception {
		int relConnectsPortToElements = (Integer) engine.sdaiGetAttrBN(
				flowSegment, HAS_PORTS, IfcEngine.sdaiAGGR);
		int noRelConnectsPortToElements = engine
				.sdaiGetMemberCount(relConnectsPortToElements);

		int relevantPortsFound = 0, originalPortsFound = 0;
		for (int i = 0; i < noRelConnectsPortToElements; i++) {
			int relConnectsPortToElement = (Integer) engine.engiGetAggrElement(
					relConnectsPortToElements, i, IfcEngine.sdaiINSTANCE);
			int distributionPort = (Integer) engine.sdaiGetAttrBN(
					relConnectsPortToElement, RELATING_PORT,
					IfcEngine.sdaiINSTANCE);

			if (distributionPort == orgDistributionPort)
				originalPortsFound++;
			else {
				String name = (String) engine.sdaiGetAttrBN(distributionPort,
						NAME, IfcEngine.sdaiSTRING);
				relevantPortsFound++;
				System.out.println("6 port" + relevantPortsFound
						+ ": DistributionPort = " + name);
				fourthStep(distributionPort);
				relevantPortsFound++;
			}
		}
		if (originalPortsFound != 1)
			System.out.println("originalPortsFound != 1");
		if (relevantPortsFound < 1)
			System.out.println("relevantPortsFound < 1");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new IfcEngineTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
