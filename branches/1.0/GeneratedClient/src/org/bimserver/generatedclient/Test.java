package org.bimserver.generatedclient;

import javax.xml.ws.BindingProvider;

public class Test {
	public static void main(String[] args) {
		new Test().start();
	}

	private void start() {
		ServiceInterfaceService service = new ServiceInterfaceService();
		((javax.xml.ws.BindingProvider)service.getSoapPort()).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
		try {
			long addUser = service.getSoapPort().addUser("tes43@logic-labs.nl", "Test", SUserType.USER, true);
			System.out.println(addUser);
		} catch (UserException_Exception e) {
			e.printStackTrace();
		} catch (ServerException_Exception e) {
			e.printStackTrace();
		}
	}
}
