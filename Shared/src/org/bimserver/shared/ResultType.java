package org.bimserver.shared;

public enum ResultType {
	IFC("IFC2x3", "ifc", "application/ifc", UseInCheckout.USE_IN_CHECKOUT, UserType.USER_TYPE, Type.MULTIPLE), 
	IFCXML("IFCXML2x3", "ifcxml", "application/ifcxml", UseInCheckout.USE_IN_CHECKOUT, UserType.USER_TYPE, Type.MULTIPLE), 
	TEXT("Plain text IFC", "txt", "text", UseInCheckout.USE_NOT_IN_CHECKOUT, UserType.USER_TYPE, Type.MULTIPLE),
	OBJECT_INFO("Object Info", "html", "text/html", UseInCheckout.USE_NOT_IN_CHECKOUT, UserType.USER_TYPE, Type.SINGLE),
	SOAP("SOAP", "xml", "xml", UseInCheckout.USE_NOT_IN_CHECKOUT, UserType.NO_USER_TYPE, Type.MULTIPLE),
	CITYGML("City GML 1.0.0", "gml", "application/gml", UseInCheckout.USE_NOT_IN_CHECKOUT, UserType.USER_TYPE, Type.MULTIPLE),
	COLLADA("Collada", "dae", "appliction/collada", UseInCheckout.USE_NOT_IN_CHECKOUT, UserType.USER_TYPE, Type.MULTIPLE),
	O3D_JSON("Google O3D (experimental)", "o3dtgz", "appliction/tgz", UseInCheckout.USE_NOT_IN_CHECKOUT, UserType.USER_TYPE, Type.MULTIPLE),
	KML("KML", "kml", "application/vnd.google-earth.kml+xml", UseInCheckout.USE_NOT_IN_CHECKOUT, UserType.NO_USER_TYPE, Type.MULTIPLE),
	KMZ("KMZ", "kmz", "application/vnd.google-earth.kmz", UseInCheckout.USE_NOT_IN_CHECKOUT, UserType.USER_TYPE, Type.MULTIPLE);

	public static enum UseInCheckout {
		USE_IN_CHECKOUT,
		USE_NOT_IN_CHECKOUT;
	}
	
	public static enum UserType {
		USER_TYPE,
		NO_USER_TYPE;
	}
	
	public static enum Type {
		SINGLE,
		MULTIPLE;
	}
	
	private final String defaultExtension;
	private final String contentType;
	private final String niceName;
	private final UseInCheckout useInCheckout;
	private final UserType userType;
	private final Type type;

	ResultType(String niceName, String defaultExtension, String contentType, UseInCheckout useInCheckout, UserType userType, Type type) {
		this.niceName = niceName;
		this.defaultExtension = defaultExtension;
		this.contentType = contentType;
		this.useInCheckout = useInCheckout;
		this.userType = userType;
		this.type = type;
	}
	
	public String getDefaultExtension() {
		return defaultExtension;
	}

	public String getContentType() {
		return contentType;
	}
	
	public boolean useInCheckout() {
		return useInCheckout == UseInCheckout.USE_IN_CHECKOUT;
	}

	public boolean isUserType() {
		return userType == UserType.USER_TYPE;
	}
	
	public Type getType() {
		return type;
	}

	public String getNiceName() {
		return niceName;
	}
}