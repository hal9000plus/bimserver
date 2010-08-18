package org.bimserver.tests;

import java.io.File;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.bimserver.shared.SGeoTag;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.shared.Token;
import org.bimserver.shared.UserException;

public class NewChangeSetTest {
	public static void main(String[] args) {
		try {
			new NewChangeSetTest().start();
		} catch (UserException e) {
			e.printStackTrace();
		}
	}

	private void start() throws UserException {
		ClientProxyFactoryBean clientProxyFactoryBean = new ClientProxyFactoryBean();
		clientProxyFactoryBean.setServiceClass(ServiceInterface.class);
		clientProxyFactoryBean.setAddress("http://localhost:8081/bimserver/services/anonymous");
		ServiceInterface client = (ServiceInterface) clientProxyFactoryBean.create();

		HTTPConduit http = (HTTPConduit) ClientProxy.getClient(client).getConduit();
		http.getClient().setConnectionTimeout(3600000); // 1 hour
		http.getClient().setAllowChunking(false);
		http.getClient().setReceiveTimeout(3600000); // 1 hour
		
		Token token = client.login("admin", "admin");
		
		int pid = client.addProject(token, "test", new SGeoTag());
		
		File sourceFile = TestFile.REVIT_QUANTITIES.getFile();
		client.checkin(token, pid, "initial", sourceFile.length(), new DataHandler(new FileDataSource(sourceFile)));
		
		client.processChangeSetFile(token, pid, "test", new DataHandler(new FileDataSource(new File("../TestData/changesets/docinfochangeset.xml"))));
	}
}
