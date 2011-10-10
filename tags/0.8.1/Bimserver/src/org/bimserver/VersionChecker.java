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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

import org.bimserver.shared.ResourceFetcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VersionChecker {
	private GregorianCalendar lastCheck;
	private Version onlineVersion;
	private static final Logger LOGGER = LoggerFactory.getLogger(VersionChecker.class);
	private static VersionChecker VERSION_CHECKER = null;
	private final ResourceFetcher resourceFetcher;

	private VersionChecker(ResourceFetcher resourceFetcher) {
		this.resourceFetcher = resourceFetcher;
	}

	public static VersionChecker getInstance() {
		return VERSION_CHECKER;
	}

	public static VersionChecker init(ResourceFetcher resourceFetcher) {
		VERSION_CHECKER = new VersionChecker(resourceFetcher);
		return VERSION_CHECKER;
	}
	
	public synchronized Version getOnlineVersion() {
		if (lastCheck == null || lastCheck.before(getReferenceDate())) {
			LOGGER.info("Fetching online version info");
			try {
				URL url = new URL("http://www.bimserver.org/version/latest.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Version.class);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				onlineVersion = (Version) unmarshaller.unmarshal(url);
				lastCheck = new GregorianCalendar();
				return onlineVersion;
			} catch (UnmarshalException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			if (onlineVersion == null) {
				onlineVersion = new Version();
				onlineVersion.setDownloadUrl("unknown");
				onlineVersion.setLatest("unknown");
				onlineVersion.setSupportEmail("unknown");
				onlineVersion.setSupportUrl("unknown");
				lastCheck = new GregorianCalendar();
			}
		}
		return onlineVersion;
	}

	private GregorianCalendar getReferenceDate() {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.add(Calendar.HOUR_OF_DAY, -1);
		return gregorianCalendar;
	}

	public Version getLocalVersion() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Version.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Version version = (Version) unmarshaller.unmarshal(resourceFetcher.getResource("version.xml"));
			return version;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateNeeded() {
		return !getLocalVersion().getLatest().equals(getOnlineVersion().getLatest());
	}
}