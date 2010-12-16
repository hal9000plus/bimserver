package org.bimserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class JarSettings {
	@XmlElement
	private File lastFile;

	@XmlElement
	private String jvm = "default";

	@XmlElement
	private String address = "localhost";

	@XmlElement
	private int port = 8082;

	@XmlElement
	private String heapsize = "1024m";

	@XmlElement
	private String stacksize = "1024k";

	public static JarSettings readFromFile(File file) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(JarSettings.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			JarSettings unmarshal = (JarSettings) unmarshaller.unmarshal(file);
			unmarshal.setLastFile(file);
			return unmarshal;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void setLastFile(File lastFile) {
		this.lastFile = lastFile;
	}

	public void save() {
		if (lastFile == null) {
			lastFile = new File("settings.xml");
		}
		save(lastFile);
	}

	public void save(File file) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(JarSettings.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(this, new FileOutputStream(file));
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getJvm() {
		return jvm;
	}

	public void setJvm(String jvm) {
		this.jvm = jvm;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHeapsize() {
		return heapsize;
	}

	public void setHeapsize(String heapsize) {
		this.heapsize = heapsize;
	}

	public String getStacksize() {
		return stacksize;
	}

	public void setStacksize(String stacksize) {
		this.stacksize = stacksize;
	}
}
