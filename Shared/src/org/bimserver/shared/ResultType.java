package org.bimserver.shared;

public enum ResultType {
	IFC("ifc", "application/ifc", true), 
	IFCXML("ifcxml", "text/xml", true), 
	TEXT("txt", "text", false),
	SOAP("xml", "xml", false),
	CITYGML("gml", "application/gml", false),
	COLLADA("dae", "appliction/collada", false),
	O3D_JSON("o3dtgz", "appliction/tgz", false),
	KML("kml", "application/vnd.google-earth.kml+xml", false),
	KMZ("kmz", "application/vnd.google-earth.kmz", false);

	private final String defaultExtension;
	private final String contentType;
	private final boolean useInCheckout;

	ResultType(String defaultExtension, String contentType, boolean useInCheckout) {
		this.defaultExtension = defaultExtension;
		this.contentType = contentType;
		this.useInCheckout = useInCheckout;
	}
	
	public String getDefaultExtension() {
		return defaultExtension;
	}

	public String getContentType() {
		return contentType;
	}
	
	public boolean useInCheckout() {
		return useInCheckout;
	}
}