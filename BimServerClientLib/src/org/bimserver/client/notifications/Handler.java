package org.bimserver.client.notifications;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import org.bimserver.models.log.AccessMethod;
import org.bimserver.shared.NotificationInterface;
import org.bimserver.shared.ServiceFactory;
import org.bimserver.shared.meta.SService;
import org.bimserver.shared.pb.ProtocolBuffersMetaData;
import org.bimserver.shared.pb.ReflectiveRpcChannel;
import org.bimserver.shared.pb.ProtocolBuffersMetaData.MethodDescriptorContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.DynamicMessage;
import com.google.protobuf.Message;
import com.google.protobuf.ServiceException;
import com.google.protobuf.DynamicMessage.Builder;

public class Handler extends Thread {
	private static final Logger LOGGER = LoggerFactory.getLogger(Handler.class);
	private final Socket socket;
	private final ProtocolBuffersMetaData protocolBuffersMetaData;
	private final SService sService;
	private final SocketNotificationsClient socketNotificationsClient;
	private ServiceFactory serviceFactory;
	private boolean running;

	public Handler(SocketNotificationsClient socketNotificationsClient, Socket socket, final NotificationInterface notificationInterface, ProtocolBuffersMetaData protocolBuffersMetaData, SService sService) {
		this.socketNotificationsClient = socketNotificationsClient;
		this.socket = socket;
		this.protocolBuffersMetaData = protocolBuffersMetaData;
		this.sService = sService;
		serviceFactory = new ServiceFactory() {
			@Override
			public Object newService(AccessMethod accessMethod, String remoteAddress) {
				return notificationInterface;
			}
			
			@Override
			public String getName() {
				return "NotifierInterface";
			}
		};
	}

	@Override
	public void run() {
		running = true;
		ReflectiveRpcChannel reflectiveRpcChannel = new ReflectiveRpcChannel(serviceFactory.newService(AccessMethod.PROTOCOL_BUFFERS, socket.getRemoteSocketAddress().toString()), protocolBuffersMetaData, sService);
		try {
			while (running) {
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				String serviceName = dis.readUTF();
				String methodName = dis.readUTF();
				MethodDescriptorContainer methodDescriptorContainer = protocolBuffersMetaData.getMethod(serviceName, methodName);
				
				Builder newBuilder = DynamicMessage.newBuilder(methodDescriptorContainer.getInputDescriptor());
				newBuilder.mergeDelimitedFrom(dis);
				DynamicMessage request = newBuilder.build();
				try {
					Message response = reflectiveRpcChannel.callBlockingMethod(methodDescriptorContainer, request);
					response.writeDelimitedTo(socket.getOutputStream());
				} catch (ServiceException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		socketNotificationsClient.notifyDisconnect();
	}

	public void close() {
		running = false;
		interrupt();
		try {
			socket.close();
		} catch (IOException e) {
			LOGGER.error("", e);
		}
	}
}