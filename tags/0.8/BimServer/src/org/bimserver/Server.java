package org.bimserver;

/******************************************************************************
 * (c) Copyright bimserver.org 2009
 * Licensed under GNU GPLv3
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * For more information mail to license@bimserver.org
 *
 * Bimserver.org is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bimserver.org is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License a 
 * long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {
	private org.mortbay.jetty.Server server;
	private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);

	public static void main(String[] args) {
		String address = "localhost";
		String port = "8082";
		for (String arg : args) {
			if (arg.startsWith("address=")) {
				address = arg.substring(8);
			} else if (arg.startsWith("port=")) {
				port = arg.substring(5);
			}
		}
		final Server server = new Server();
		Runtime.getRuntime().addShutdownHook(new Thread(){
			@Override
			public void run() {
				server.stop();
			}
		});
		server.start(address, port);
	}

	protected void stop() {
		LOGGER.info("Stopping server...");
		try {
			server.stop();
		} catch (Exception e) {
			LOGGER.error("", e);
		}
		LOGGER.info("Server stopped succesfully");
	}

	private void start(String address, String port) {
		LOGGER.info("Starting server...");
		System.setProperty("org.apache.cxf.Logger", "org.apache.cxf.common.logging.Log4jLogger");
		server = new org.mortbay.jetty.Server();
		SocketConnector socketConnector = new SocketConnector();
		socketConnector.setPort(Integer.parseInt(port));
		socketConnector.setHost(address);
		server.addConnector(socketConnector);

		WebAppContext context = new WebAppContext(server, "", "/bimserver");
		context.setResourceBase("www");
		
		WebAppContext root = new WebAppContext(server, "", "/");
		root.setResourceBase("root");
		try {
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("Server started succesfully");
	}
}