package org.bimserver;

import java.io.File;

import javax.servlet.ServletContext;

import org.bimserver.shared.ResourceFetcher;
import org.bimserver.utils.StringUtils;

public class ResourceHelper {
	public static File getFile(ServletContext servletContext, ResourceFetcher resourceFetcher, String name) {
		String prettyFileUrl = StringUtils.getPrettyFileUrl(resourceFetcher.getResource(name));
		if (servletContext.getContextPath().equals("")) {
			prettyFileUrl = prettyFileUrl.replace("WEB-INF", "ROOT/WEB-INF");
		}
		return new File(prettyFileUrl);
	}
}