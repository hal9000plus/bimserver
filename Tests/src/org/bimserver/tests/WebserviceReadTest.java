package org.bimserver.tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.bimserver.shared.CheckoutResult;
import org.bimserver.shared.ProjectList;
import org.bimserver.shared.ResultType;
import org.bimserver.shared.SProject;
import org.bimserver.shared.SRevision;
import org.bimserver.shared.SRevisionList;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.shared.Token;
import org.bimserver.shared.UserException;

public class WebserviceReadTest {
	public static void main(String[] args) {
		new WebserviceReadTest().start();
	}

	private void start() {
		ClientProxyFactoryBean clientProxyFactoryBean = new ClientProxyFactoryBean();
		clientProxyFactoryBean.setServiceClass(ServiceInterface.class);
		clientProxyFactoryBean.setAddress("http://localhost:8081/bimserver/services/anonymous");
		ServiceInterface client = (ServiceInterface) clientProxyFactoryBean.create();

		HTTPConduit http = (HTTPConduit) ClientProxy.getClient(client).getConduit();
		http.getClient().setConnectionTimeout(3600000); // 1 hour
		http.getClient().setAllowChunking(false);
		http.getClient().setReceiveTimeout(3600000); // 1 hour
		
		try {
			Token token = client.login("admin", "admin");
			ProjectList allProjects = client.getAllProjects(token);
			for (SProject project : allProjects.getProjects()) {
				SRevisionList revisions = client.getAllRevisionsOfProject(token, project.getId());
				for (SRevision revision : revisions.getRevisions()) {
					CheckoutResult download = client.download(token, project.getId(), revision.getId(), ResultType.IFC);
					File file = new File("downloaded" + File.separator + download.getProjectName() + download.getRevisionNr() + ".ifc");
					try {
						InputStream inputStream = download.getFile().getInputStream();
						FileOutputStream out = new FileOutputStream(file);
						byte[] buffer = new byte[1024];
						int red = inputStream.read(buffer);
						while (red != -1) {
							out.write(buffer, 0, red);
							red = inputStream.read(buffer);
						}
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (UserException e) {
			e.printStackTrace();
		}
		
	}
}
