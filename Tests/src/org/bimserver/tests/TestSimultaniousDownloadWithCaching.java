package org.bimserver.tests;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.bimserver.BimServer;
import org.bimserver.BimServerConfig;
import org.bimserver.LocalDevPluginLoader;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseRestartRequiredException;
import org.bimserver.database.berkeley.DatabaseInitException;
import org.bimserver.interfaces.objects.SDeserializerPluginConfiguration;
import org.bimserver.interfaces.objects.SDownloadResult;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.interfaces.objects.SSerializerPluginConfiguration;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ServerState;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.serializers.CacheStoringEmfSerializerDataSource;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.shared.InterfaceMap;
import org.bimserver.shared.LocalDevelopmentResourceFetcher;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.shared.interfaces.ServiceInterface;

public class TestSimultaniousDownloadWithCaching {
	public static void main(String[] args) {
		new TestSimultaniousDownloadWithCaching().start();
	}

	private void start() {
		BimServerConfig config = new BimServerConfig();
		File homeDir = new File("home");
		try {
			if (homeDir.isDirectory()) {
				FileUtils.forceDelete(homeDir);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		config.setClassPath(System.getProperty("java.class.path"));
		config.setHomeDir(homeDir);
		config.setInitialProtocolBuffersPort(8020);
		config.setPort(8080);
		config.setStartEmbeddedWebServer(true);
		config.setResourceFetcher(new LocalDevelopmentResourceFetcher());
		final BimServer bimServer = new BimServer(config);
		try {
			LocalDevPluginLoader.loadPlugins(bimServer.getPluginManager());
			bimServer.start();
			if (bimServer.getServerInfo().getServerState() == ServerState.NOT_SETUP) {
				bimServer.getSystemService().setup("http://localhost", "localhost", "no-reply@bimserver.org", "Administrator", "admin@bimserver.org", "admin");
			}
		} catch (PluginException e2) {
			e2.printStackTrace();
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (DatabaseInitException e) {
			e.printStackTrace();
		} catch (BimserverDatabaseException e) {
			e.printStackTrace();
		} catch (DatabaseRestartRequiredException e) {
			e.printStackTrace();
		} catch (UserException e) {
			e.printStackTrace();
		}

		try {
			InterfaceMap interfaceMap = bimServer.getServiceFactory().newServiceMap(AccessMethod.INTERNAL, "");
			ServiceInterface serviceInterface = interfaceMap.get(ServiceInterface.class);
			serviceInterface.login("admin@bimserver.org", "admin");
			serviceInterface.setSettingCacheOutputFiles(true);
			serviceInterface.setSettingGenerateGeometryOnCheckin(false);
			final SProject project = serviceInterface.addProject("test");
			SDeserializerPluginConfiguration deserializerByName = serviceInterface.getDeserializerByName("IfcStepDeserializer");
			File file = new File("../TestData/data/AC11-Institute-Var-2-IFC.ifc");
			serviceInterface.checkin(project.getOid(), "test", deserializerByName.getOid(), file.length(), file.getName(), new DataHandler(new FileDataSource(file)), false, true);
			final SProject projectUpdate = serviceInterface.getProjectByPoid(project.getOid());
			ThreadPoolExecutor executor = new ThreadPoolExecutor(20, 20, 1, TimeUnit.HOURS, new ArrayBlockingQueue<Runnable>(1000));
			for (int i=0; i<20; i++) {
				executor.execute(new Runnable(){
					@Override
					public void run() {
						try {
							InterfaceMap serviceMap = bimServer.getServiceFactory().newServiceMap(AccessMethod.INTERNAL, "");
							ServiceInterface serviceInterface = serviceMap.get(ServiceInterface.class);
							serviceInterface.login("admin@bimserver.org", "admin");
							SSerializerPluginConfiguration serializerPluginConfiguration = serviceInterface.getSerializerByName("Ifc2x3");
							Long download = serviceInterface.download(projectUpdate.getLastRevisionId(), serializerPluginConfiguration.getOid(), true, true);
							SDownloadResult downloadData = serviceInterface.getDownloadData(download);
							if (downloadData.getFile().getDataSource() instanceof CacheStoringEmfSerializerDataSource) {
								CacheStoringEmfSerializerDataSource c = (CacheStoringEmfSerializerDataSource)downloadData.getFile().getDataSource();
								try {
									ByteArrayOutputStream baos = new ByteArrayOutputStream();
									c.writeToOutputStream(baos);
									System.out.println(baos.size());
								} catch (SerializerException e) {
									e.printStackTrace();
								}
							} else {
								ByteArrayOutputStream baos = new ByteArrayOutputStream();
								IOUtils.copy(downloadData.getFile().getInputStream(), baos);
								System.out.println(baos.size());
							}
							serviceInterface.cleanupDownload(download);
						} catch (ServerException e) {
							e.printStackTrace();
						} catch (UserException e) {
							e.printStackTrace();
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}});
			}
			executor.shutdown();
			executor.awaitTermination(1, TimeUnit.HOURS);
			bimServer.stop();
		} catch (ServerException e1) {
			e1.printStackTrace();
		} catch (UserException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}