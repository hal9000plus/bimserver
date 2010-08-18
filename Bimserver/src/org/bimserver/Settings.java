package org.bimserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Settings {
	private boolean showVersionUpgradeAvailable;
	private boolean sendConfirmationEmailAfterRegistration;
	private boolean useCaching;
	private boolean allowSelfRegistration;
	private boolean useSecondEngineJvm; 
	private String registrationAddition;
	private String smtpServer;
	private String emailSenderAddress;
	private String databaseLocation;
	private String enabledExportTypes;
	
	public boolean isShowVersionUpgradeAvailable() {
		return showVersionUpgradeAvailable;
	}

	public void setShowVersionUpgradeAvailable(boolean showVersionUpgradeAvailable) {
		this.showVersionUpgradeAvailable = showVersionUpgradeAvailable;
	}

	public String getRegistrationAddition() {
		return registrationAddition;
	}

	public void setRegistrationAddition(String registrationAddition) {
		this.registrationAddition = registrationAddition;
	}

	public boolean isUseCaching() {
		return useCaching;
	}

	public void setUseCaching(boolean useCaching) {
		this.useCaching = useCaching;
	}

	public String getSmtpServer() {
		return smtpServer;
	}

	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}

	public String getEmailSenderAddress() {
		return emailSenderAddress;
	}

	public void setEmailSenderAddress(String emailSenderAddress) {
		this.emailSenderAddress = emailSenderAddress;
	}

	public boolean isSendConfirmationEmailAfterRegistration() {
		return sendConfirmationEmailAfterRegistration;
	}

	public void setSendConfirmationEmailAfterRegistration(boolean sendConfirmationEmailAfterRegistration) {
		this.sendConfirmationEmailAfterRegistration = sendConfirmationEmailAfterRegistration;
	}

	public static Settings readFromFile(File file) {
		if (file.exists() && file.isFile()) {
			try {
				JAXBContext jc = JAXBContext.newInstance(Settings.class);
				Unmarshaller unmarshaller = jc.createUnmarshaller();
				Object unmarshal = unmarshaller.unmarshal(new FileInputStream(file));
				return (Settings) unmarshal;
			} catch (JAXBException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return new Settings();
		} else {
			return new Settings();
		}
	}

	public void saveToFile(File file) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			saveToStream(fos);
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void saveToStream(OutputStream out) {
		try {
			JAXBContext jc = JAXBContext.newInstance(Settings.class);
			Marshaller marshaller = jc.createMarshaller();
			marshaller.marshal(this, out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static Settings readFromUrl(URL resource) {
		try {
			JAXBContext jc = JAXBContext.newInstance(Settings.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			Object unmarshal = unmarshaller.unmarshal(resource.openStream());
			Settings settings = (Settings) unmarshal;
			return settings;
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Settings();
	}

	public void setDatabaseLocation(String databaseLocation) {
		this.databaseLocation = databaseLocation;
	}

	public String getDatabaseLocation() {
		return databaseLocation;
	}

	public void setEnabledExportTypes(String enabledExportTypes) {
		this.enabledExportTypes = enabledExportTypes;
	}

	public String getEnabledExportTypes() {
		return enabledExportTypes;
	}

	public void setAllowSelfRegistration(boolean allowSelfRegistration) {
		this.allowSelfRegistration = allowSelfRegistration;
	}

	public boolean isAllowSelfRegistration() {
		return allowSelfRegistration;
	}

	public static Settings readFromStream(InputStream inputStream) {
		try {
			JAXBContext jc = JAXBContext.newInstance(Settings.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			Object unmarshal = unmarshaller.unmarshal(inputStream);
			return (Settings) unmarshal;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void save() {
		File file = ResourceHelper.getFile(ServerInitializer.getServletContext(), ServerInitializer.getResourceFetcher(), "settings.xml");
		saveToFile(file);
	}

	public static Settings read() {
		File file = ResourceHelper.getFile(ServerInitializer.getServletContext(), ServerInitializer.getResourceFetcher(), "settings.xml");
		return readFromFile(file);
	}

	public void setUseSecondEngineJvm(boolean useSecondEngineJvm) {
		this.useSecondEngineJvm = useSecondEngineJvm;
	}

	public boolean isUseSecondEngineJvm() {
		return useSecondEngineJvm;
	}
}