package org.bimserver.ifcengine.jvm;

/******************************************************************************
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * BIMserver software uses the IFC Engine DLL library build.
 * This binary Engine DLL is NOT open source. The IFC Engine DLL is a closed source product owned by the Netherlands Organisation for Applied Scientifc Research TNO.
 * The latest versions are available for download from http://ifcengine.com.
 * In case of none commercial use there is no license fee and redistribution of the binary is allowed as long as clearly mentioned that the IFC Engine DLL is used. The BIMserver.org software is non-commercial so users of the BIMserver software can use it free of charge.
 * Within the Open Source BIMserver software there is one exception to the normal conditions: A special version of the IFC Engine DLL is used that includes Clashdetection functionality, this version is not commercially available. For more information, please contact the owner at info@ifcengine.com
 *****************************************************************************/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.bimserver.ifcengine.Command;
import org.bimserver.ifcengine.SdaiTypes;
import org.bimserver.ifcengine.jvm.IfcEngine.SurfaceProperties;
import org.bimserver.plugins.ifcengine.IfcEngineClash;
import org.bimserver.plugins.ifcengine.IfcEngineException;
import org.bimserver.plugins.ifcengine.IfcEngineInstanceVisualisationProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jna.Pointer;

public class IfcEngineServer extends Thread {
	private static final Logger LOGGER = LoggerFactory.getLogger(IfcEngineServer.class);
	private volatile boolean running = true;
	private final String schemaFileName;
	private IfcEngine ifcEngine;
	private final Map<Integer, Pointer> pointers = new HashMap<Integer, Pointer>();
	private int pointerCounter = 0;
	private final InputStream in;
	private final OutputStream out;

	public static void main(String[] args) {
		try {
			IfcEngineServer ifcEngineServer = new IfcEngineServer(args[0], System.in, System.out);
			ifcEngineServer.run();
		} catch (Exception e) {
			LOGGER.error("", e);
		}
	}

	public IfcEngineServer(String schemaFileName, InputStream in, OutputStream out) {
		this.schemaFileName = schemaFileName;
		this.in = in;
		this.out = out;
		this.ifcEngine = new IfcEngine();
	}

	public void run() {
		try {
			DataInputStream in = new DataInputStream(new BufferedInputStream(this.in));
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(this.out));
			while (running) {
				byte commandId = in.readByte();
				Command command = Command.getCommand(commandId);
				// LOGGER.info("Command " + command + " received");
				switch (command) {
				case CHECK_CONNECTION: {
					in.readBoolean();
					out.writeBoolean(true);
				}
					break;
				case OPEN_MODEL: {
					String name = in.readUTF();
					Pointer modelId = ifcEngine.sdaiOpenModelBN(0, name, schemaFileName);
					int newPointerKey = savePointer(modelId);
					out.writeInt(newPointerKey);
				}
					break;
				case OPEN_MODEL_STREAMING: {
					int size = in.readInt();
					Pointer modelId = ifcEngine.loadFromInputStream(in, size, schemaFileName);
					int newPointerKey = savePointer(modelId);
					out.writeInt(newPointerKey);
				}
					break;
				case FINALIZE_MODELLING: {
					int modelId = in.readInt();
					int indicesCount = in.readInt();
					int verticesCount = in.readInt();
					if (indicesCount != 0 && verticesCount != 0) {
						boolean is64 = is64();
						int[] indices = new int[indicesCount * (is64 ? 2 : 1)];
						float[] vertices = new float[verticesCount * 3];
						float[] normals = new float[verticesCount * 3];
						ifcEngine.finalizeModelling(pointers.get(modelId), vertices, normals, indices);
						boolean even = true;
						for (int index : indices) {
							if (!is64 || even) {
								out.writeInt(index);
							}
							even = !even;
						}
						for (float vertex : vertices) {
							out.writeFloat(vertex);
						}
						for (float normal : normals) {
							out.writeFloat(normal);
						}
					}
				}
					break;
				case INITIALIZE_MODELLING: {
					int modelId = in.readInt();
					SurfaceProperties surfaceProperties = ifcEngine.initializeModelling(pointers.get(modelId), 0.0);
					out.writeInt(surfaceProperties.getIndicesCount());
					out.writeInt(surfaceProperties.getVerticesCount());
				}
					break;
				case SET_POSTPROCESSING: {
					int modelId = in.readInt();
					ifcEngine.setPostProcessing(pointers.get(modelId), in.readBoolean() ? 1 : 0);
				}
					break;
				case GET_INSTANCES: {
					int modelId = in.readInt();
					String name = in.readUTF();
					Pointer aggrId = ifcEngine.sdaiGetEntityExtentBN(pointers.get(modelId), name);
					int nrObjects = ifcEngine.sdaiGetMemberCount(aggrId);
					out.writeInt(nrObjects);
					for (int k = 0; k < nrObjects; k++) {
						Object instanceId = (Pointer) ifcEngine.engiGetAggrElement(aggrId, k, SdaiTypes.INSTANCE);
						if (instanceId instanceof Pointer) {
							out.writeInt(savePointer((Pointer) instanceId));
						} else {
							throw new IfcEngineException("Unimplemented");
						}
					}
				}
					break;
				case FIND_CLASHES_BY_GUID: {
					int modelId = in.readInt();
					double dist = in.readDouble();
					int nrClashes = ifcEngine.initializeClashes(pointers.get(modelId), dist);
					if (nrClashes > 0) {
						Set<IfcEngineClash> clashes = ifcEngine.finalizeClashesByGuid(pointers.get(modelId), nrClashes);
						out.writeInt(nrClashes);
						for (IfcEngineClash clash : clashes) {
							out.writeUTF(clash.getGuid1());
							out.writeUTF(clash.getGuid2());
						}
					} else {
						out.writeInt(0);
					}
				}
					break;
				case FIND_CLASHES_BY_EID: {
					int modelId = in.readInt();
					double dist = in.readDouble();
					int nrClashes = ifcEngine.initializeClashes(pointers.get(modelId), dist);
					if (nrClashes > 0) {
						Set<IfcEngineClash> clashes = ifcEngine.finalizeClashesByEI(pointers.get(modelId), nrClashes);
						out.writeInt(nrClashes);
						for (IfcEngineClash clash : clashes) {
							out.writeLong(clash.getEid1());
							out.writeLong(clash.getEid2());
						}
					} else {
						out.writeInt(0);
					}
				}
					break;
				case GET_VISUALISATION_PROPERTIES: {
					int modelId = in.readInt();
					int instanceId = in.readInt();
					IfcEngineInstanceVisualisationProperties instanceInModelling = ifcEngine.getInstanceInModelling(pointers.get(modelId), pointers.get(instanceId), 1);
					out.writeInt(instanceInModelling.getStartVertex());
					out.writeInt(instanceInModelling.getStartIndex());
					out.writeInt(instanceInModelling.getPrimitiveCount());
				}
					break;
				case CLOSE_MODEL: {
					int modelId = in.readInt();
					ifcEngine.sdaiCloseModel(pointers.get(modelId));
					pointers.remove(modelId);
					break;
				}
				case GET_INSTANCE_FROM_EXPRESSID: {
					in.readInt(); // modelid
					int expressId = in.readInt();
					Pointer internalGetInstanceFromP21Line = ifcEngine.internalGetInstanceFromP21Line(expressId);
					out.writeInt(savePointer(internalGetInstanceFromP21Line));
					break;
				}
				case CLOSE: {
					close();
					System.exit(0);
				}
					break;
				}
				out.flush();
			}
		} catch (IOException e) {
			if (running) {
				LOGGER.error("", e);
			}
		} catch (Exception e) {
			LOGGER.error("", e);
		}
	}

	private boolean is64() {
		return System.getProperty("sun.arch.data.model").equals("64");
	}

	private int savePointer(Pointer modelId) {
		int newPointerKey = pointerCounter++;
		pointers.put(newPointerKey, modelId);
		return newPointerKey;
	}

	private void close() {
		running = false;
	}
}