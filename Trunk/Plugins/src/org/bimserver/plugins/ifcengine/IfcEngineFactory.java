package org.bimserver.plugins.ifcengine;

import java.io.File;
import java.util.Iterator;
import java.util.ServiceLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfcEngineFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(IfcEngineFactory.class);
	private IfcEnginePlugin ifcEngine;
	private final File schemaFile;
	private final File nativeBaseDir;
	private final File tempDir;
	private final String classPath;
	
	public IfcEngineFactory(File schemaFile, File nativeBaseDir, File tempDir, String classPath) {
		this.schemaFile = schemaFile;
		this.nativeBaseDir = nativeBaseDir;
		this.tempDir = tempDir;
		this.classPath = classPath;
		ServiceLoader<IfcEnginePlugin> loader = ServiceLoader.load(IfcEnginePlugin.class);
		Iterator<IfcEnginePlugin> iterator = loader.iterator();
		if (iterator.hasNext()) {
			ifcEngine = iterator.next();
			LOGGER.info("Loading ifc engine: " + ifcEngine.getName());
		}
	}
	
	public IfcEngine createIfcEngine() throws IfcEngineException {
		return ifcEngine.createIfcEngine(schemaFile, nativeBaseDir, tempDir, classPath);
	}
}