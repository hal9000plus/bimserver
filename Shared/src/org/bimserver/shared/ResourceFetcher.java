package org.bimserver.shared;

import java.net.URL;

public abstract class ResourceFetcher {
	public abstract URL getResource(String name);
}