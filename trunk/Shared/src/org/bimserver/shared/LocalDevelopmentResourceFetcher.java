package org.bimserver.shared;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class LocalDevelopmentResourceFetcher extends ResourceFetcher {
	@Override
	public URL getResource(String name) {
		try {
			File file = getFile(name);
			if (file != null) {
				return file.getAbsoluteFile().toURI().toURL();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public File getFile(String name) {
		if (name.equals("lib/")) { // The binary lib folder
			File file = new File("../IFCEngine/lib");
			return file;
		}
		if (name.startsWith("lib")) {
			for (File projectFile : new File("..").listFiles()) {
				File file = new File(projectFile, name);
				if (file.exists()) {
					return file;
				}
			}
		}
		File file = new File(new File("../BimServer/deploy" + File.separator + "local"), name);
		if (file.exists()) {
			return file;
		} else {
			File shared = new File("../BimServer/deploy" + File.separator + "shared", name);
			if (shared.exists()) {
				return shared;
			}
			return null;
		}
	}
}