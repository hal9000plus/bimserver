package org.bimserver.ifcengine;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.bimserver.shared.ResourceFetcher;

public class FailSafeIfcEngine {
	private Process exec;
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private IfcEngineServer ifcEngineServer;
	private boolean running = true;
	private final File schemaFile;
	private final File nativeBaseDir;
	private EngineProces engineProces;
	private int port;
	private final ResourceFetcher resourceFetcher;
	private int restarts = 0;

	public FailSafeIfcEngine(final File schemaFile, final File nativeBaseDir, ResourceFetcher resourceFetcher, boolean useSecondJVM) {
		this.schemaFile = schemaFile;
		this.nativeBaseDir = nativeBaseDir;
		this.resourceFetcher = resourceFetcher;
		try {
			port = 12345;
			if (useSecondJVM) {
				engineProces = new EngineProces(this, port, schemaFile, nativeBaseDir, resourceFetcher);
				engineProces.start();
			} else {
				ifcEngineServer = new IfcEngineServer(port, schemaFile.getAbsolutePath(), nativeBaseDir.getAbsolutePath());
				ifcEngineServer.start();
			}
			connectClient();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void connectClient() throws UnknownHostException, IOException {
		for (int i = 0; i < 3; i++) {
			try {
				socket = new Socket("127.0.0.1", port);
				in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
				break;
			} catch (ConnectException e) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	public IfcEngineModel openModel(File ifcFile) throws IfcEngineException {
		writeCommand(Command.OPEN_MODEL);
		writeUTF(ifcFile.getAbsolutePath());
		flush();
		int modelId;
		modelId = readInt();
		return new IfcEngineModel(this, modelId);
	}

	int readInt() throws IfcEngineException {
		try {
			return in.readInt();
		} catch (IOException e) {
			throw new IfcEngineException(e);
		}
	}

	public void flush() throws IfcEngineException {
		try {
			out.flush();
		} catch (IOException e) {
			throw new IfcEngineException(e);
		}
	}

	void writeUTF(String value) throws IfcEngineException {
		try {
			out.writeUTF(value);
		} catch (IOException e) {
			throw new IfcEngineException(e);
		}
	}

	public void writeCommand(Command command) throws IfcEngineException {
		try {
			out.writeByte(command.getId());
		} catch (IOException e) {
			throw new IfcEngineException(e);
		}
	}

	public void close() {
		running = false;
		if (exec != null) {
			exec.destroy();
		}
		if (ifcEngineServer != null) {
			ifcEngineServer.close();
		}
	}

	public void writeInt(int value) throws IfcEngineException {
		try {
			out.writeInt(value);
		} catch (IOException e) {
			throw new IfcEngineException(e);
		}
	}

	public void writeBoolean(boolean value) throws IfcEngineException {
		try {
			out.writeBoolean(value);
		} catch (IOException e) {
			throw new IfcEngineException(e);
		}
	}

	public float readFloat() throws IfcEngineException {
		try {
			return in.readFloat();
		} catch (IOException e) {
			throw new IfcEngineException(e);
		}
	}

	public void engineStopped() {
		if (running && restarts < 10) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			restarts++;
			engineProces = new EngineProces(this, port, schemaFile, nativeBaseDir, resourceFetcher);
			engineProces.start();
			try {
				connectClient();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}