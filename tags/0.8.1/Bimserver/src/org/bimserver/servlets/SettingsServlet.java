package org.bimserver.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import org.bimserver.EmfSerializerFactory;
import org.bimserver.LoginManager;
import org.bimserver.ResourceHelper;
import org.bimserver.ServerInitializer;
import org.bimserver.ServerSettings;
import org.bimserver.Settings;

public class SettingsServlet extends HttpServlet {

	private static final long serialVersionUID = 2330574636289622518L;

	@SuppressWarnings("unchecked")
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		LoginManager loginManager = (LoginManager) request.getSession().getAttribute("loginManager");
		if (loginManager.getUserType().equals("ADMIN")) {
			if (isMultipart) {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				factory.setSizeThreshold(1024 * 1024 * 100); // 100 MB
				ServletFileUpload upload = new ServletFileUpload(factory);
				try {
					List<FileItem> items = (List<FileItem>) upload.parseRequest(request);
					Iterator<FileItem> iter = items.iterator();
					while (iter.hasNext()) {
						FileItem item = iter.next();
						if (!item.isFormField() && item.getFieldName().equals("settings")) {
							InputStream inputStream = item.getInputStream();
							Settings readFromStream = Settings.readFromStream(inputStream);
							readFromStream.save();
							ServerSettings.setSettings(Settings.read());
							EmfSerializerFactory.getInstance().initSerializers();
							response.sendRedirect(getServletContext().getContextPath() + "/settings.jsp?msg=settingsfileuploadok");
							return;
						} else if (!item.isFormField() && item.getFieldName().equals("ignorefile")) {
							InputStream inputStream = item.getInputStream();
							File file = ResourceHelper.getFile(ServerInitializer.getServletContext(), ServerInitializer.getResourceFetcher(), "ignore.xml");
							FileOutputStream fos = new FileOutputStream(file);
							IOUtils.copy(inputStream, fos);
							fos.close();
							response.sendRedirect(getServletContext().getContextPath() + "/settings.jsp?msg=ignorefileuploadok");
							return;
						}
					}
				} catch (FileUploadException e) {
					e.printStackTrace();
				}
			}
			if (request.getParameter("action") != null && request.getParameter("action").equals("downloadsettings")) {
				Settings settings = ServerSettings.getSettings();
				response.setContentType("text/xml");
				response.setHeader("Content-Disposition", "inline; filename=\"settings.xml\"");
				settings.saveToStream(response.getOutputStream());
				return;
			} else if (request.getParameter("action") != null && request.getParameter("action").equals("downloadignorefile")) {
				response.setContentType("text/xml");
				response.setHeader("Content-Disposition", "inline; filename=\"ignore.xml\"");
				URL resource = ServerInitializer.getResourceFetcher().getResource("ignore.xml");
				InputStream openStream = resource.openStream();
				IOUtils.copy(openStream, response.getOutputStream());
				openStream.close();
				return;
			}
		}
	}
}