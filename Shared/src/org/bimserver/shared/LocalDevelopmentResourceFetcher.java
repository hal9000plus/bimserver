package org.bimserver.shared;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class LocalDevelopmentResourceFetcher extends ResourceFetcher {
	@Override
	public URL getResource(String name) {
		try {
			if (name.equals("lib/")) { // The binary lib folder
				File file = new File("../IFCEngine/lib");
				return file.toURI().toURL();
			}
			if (name.startsWith("lib")) {
				for (File projectFile : new File("..").listFiles()) {
					File file = new File(projectFile, name);
					if (file.exists()) {
						return file.toURI().toURL();
					}
				}
			}
			File file = new File(new File("deploy" + File.separator + "local"), name);
			if (file.exists()) {
				return file.toURI().toURL();
			} else {
				File shared = new File("deploy" + File.separator + "shared", name);
				if (shared.exists()) {
					return shared.toURI().toURL();
				}
				return null;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}