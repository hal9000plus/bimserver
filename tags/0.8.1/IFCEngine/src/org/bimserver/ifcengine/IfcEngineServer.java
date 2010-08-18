package org.bimserver.ifcengine;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.bimserver.ifcengine.IfcEngine.InstanceVisualisationProperties;
import org.bimserver.ifcengine.IfcEngine.SurfaceProperties;

public class IfcEngineServer extends Thread {
	private boolean running = true;
	private final String schemaFileName;
	private final int port;
	private ServerSocket serverSocket;
	private IfcEngine ifcEngine;

	public static void main(String[] args) {
		IfcEngineServer ifcEngineServer = new IfcEngineServer((Integer) Integer.parseInt(args[0]), args[1], args[2]);
		ifcEngineServer.run(); // This is on purpose, when running from main function, an extra thead is unnecessary
	}

	public IfcEngineServer(int port, String schemaFileName, String nativeBaseDir) {
		this.port = port;
		this.schemaFileName = schemaFileName;
		ifcEngine = new IfcEngine(new File(nativeBaseDir));
	}

	public void run() {
		try {
			serverSocket = new ServerSocket(port);
			Socket socket = serverSocket.accept();
			DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			while (running) {
				byte commandId = in.readByte();
				Command command = Command.getCommand(commandId);
				switch (command) {
				case OPEN_MODEL: {
					String name = in.readUTF();
					int modelId = ifcEngine.sdaiOpenModelBN(0, name, schemaFileName);
					out.writeInt(modelId);
				}
					break;
				case FINALIZE_MODELLING: {
					int modelId = in.readInt();
					int indicesCount = in.readInt();
					int verticesCount = in.readInt();
					int[] indices = new int[indicesCount];
					float[] vertices = new float[verticesCount * 3];
					float[] normals = new float[verticesCount * 3];
					ifcEngine.finalizeModelling(modelId, vertices, normals, indices);
					for (int index : indices) {
						out.writeInt(index);
					}
					for (float vertex : vertices) {
						out.writeFloat(vertex);
					}
					for (float normal : normals) {
						out.writeFloat(normal);
					}
				}
					break;
				case INITIALIZE_MODELLING: {
					int modelId = in.readInt();
					SurfaceProperties surfaceProperties = ifcEngine.initializeModelling(modelId, 0.0);
					out.writeInt(surfaceProperties.getIndicesCount());
					out.writeInt(surfaceProperties.getVerticesCount());
				}
					break;
				case SET_POSTPROCESSING: {
					int modelId = in.readInt();
					ifcEngine.setPostProcessing(modelId, in.readBoolean());
				}
					break;
				case GET_INSTANCES: {
					int modelId = in.readInt();
					String name = in.readUTF();
					int aggrId = ifcEngine.sdaiGetEntityExtentBN(modelId, name);
					int nrObjects = ifcEngine.sdaiGetMemberCount(aggrId);
					out.writeInt(nrObjects);
					for (int k = 0; k < nrObjects; k++) {
						int instanceId = (Integer) ifcEngine.engiGetAggrElement(aggrId, k, IfcEngine.sdaiINSTANCE);
						out.writeInt(instanceId);
					}
				}
					break;
				case GET_VISUALISATION_PROPERTIES: {
					int modelId = in.readInt();
					int instanceId = in.readInt();
					InstanceVisualisationProperties instanceInModelling = ifcEngine.getInstanceInModelling(modelId, instanceId, 1);
					out.writeInt(instanceInModelling.getStartVertex());
					out.writeInt(instanceInModelling.getStartIndex());
					out.writeInt(instanceInModelling.getPrimitiveCount());
				}
					break;
				case CLOSE_MODEL: {
					int modelId = in.readInt();
					ifcEngine.sdaiCloseModel(modelId);
					break;
				}
				}
				out.flush();
			}
		} catch (IOException e) {
			if (running) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		running = false;
		if (serverSocket != null) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}