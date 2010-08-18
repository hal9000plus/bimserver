package org.bimserver.ifcengine;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;

import org.bimserver.shared.ResourceFetcher;
import org.bimserver.utils.StreamReaderToLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EngineProces extends Thread {
	private static final Logger LOGGER = LoggerFactory.getLogger(EngineProces.class);
	private Process process;
	private final File nativeBaseDir;
	private final int port;
	private final File schemaFile;
	private final FailSafeIfcEngine failSafeIfcEngine;
	private final ResourceFetcher resourceFetcher;

	public EngineProces(FailSafeIfcEngine failSafeIfcEngine, int port, File schemaFile, File nativeBaseDir, ResourceFetcher resourceFetcher) {
		this.failSafeIfcEngine = failSafeIfcEngine;
		this.port = port;
		this.schemaFile = schemaFile;
		this.nativeBaseDir = nativeBaseDir;
		this.resourceFetcher = resourceFetcher;
		setName("EngineProces");
		setDaemon(true);
	}

	public void run() {
		try {
			String command = "java -classpath ";
			File binFile = new File(".." + File.separator + "IFCEngine" + File.separator + "bin");
			if (binFile.exists()) {
				// For local development
				if (binFile.getAbsolutePath().contains(" ")) {
					command += "\"" + binFile.getAbsolutePath() + "\"" + File.pathSeparator;
				} else {
					command += binFile.getAbsolutePath() + File.pathSeparator;
				}
			}
			File libFile = new File(".." + File.separator + "IFCEngine" + "lib" + File.separator);
			if (libFile.exists()) {
				if (libFile.getAbsolutePath().contains(" ")) {
					command += "\"" + libFile.getAbsolutePath() + File.pathSeparator + "\"";
				} else {
					command += libFile.getAbsolutePath() + File.pathSeparator;
				}
			}
			command += addJar(command, "slf4j-api-1.5.6.jar");
			command += addJar(command, "slf4j-log4j12-1.5.6.jar");
			command += addJar(command, "log4j.jar");
			command += addJar(command, "bimserver.jar");
			command += addJar(command, "JNative.jar");
			command += " org.bimserver.ifcengine.IfcEngineServer";
			command += " " + port;
			if (schemaFile.getAbsolutePath().contains(" ")) {
				command += " \"" + schemaFile.getAbsolutePath() + "\"";
			} else {
				command += " " + schemaFile.getAbsolutePath();
			}
			if (nativeBaseDir.getAbsolutePath().contains(" ")) {
				command += " \"" + nativeBaseDir.getAbsolutePath() + "\"";
			} else {
				command += " " + nativeBaseDir.getAbsolutePath();
			}
			LOGGER.info(command);
			process = Runtime.getRuntime().exec(command);
			new StreamReaderToLog("EngineProces - InputStreamProcessor", process.getInputStream()).start();
			new StreamReaderToLog("EngineProces - ErrorStreamProcessor", process.getErrorStream()).start();
			process.waitFor();
			failSafeIfcEngine.engineStopped();
		} catch (Exception e) {
			LOGGER.error("", e);
		}
	}

	private String addJar(String command, String string) throws UnsupportedEncodingException, URISyntaxException {
		URL resource = resourceFetcher.getResource("lib/" + string);
		if (resource != null) {
			File file = new File(resource.toURI());
			String fileString = file.getAbsolutePath();
			if (fileString.contains(" ")) {
				return "\"" + fileString + "\"" + File.pathSeparator;
			} else {
				return fileString + File.pathSeparator;
			}
		}
		return "";
	}
}