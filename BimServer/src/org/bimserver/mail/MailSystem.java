package org.bimserver.mail;

import java.util.Properties;

import javax.mail.Session;

import org.bimserver.ServerSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MailSystem {
	private static final Logger LOGGER = LoggerFactory.getLogger(MailSystem.class);
	private static final MailSystem INSTANCE = new MailSystem();

	private MailSystem() {
	}

	public static MailSystem getInstance() {
		return INSTANCE;
	}

	public Session createMailSession() {
		Properties props = new Properties();
		props.put("mail.smtp.host", ServerSettings.getSettings().getSmtpServer());
		props.put("mail.smtp.localhost", "bimserver.org");

		Session mailSession = Session.getDefaultInstance(props);
		return mailSession;
	}

	public static boolean isValidEmailAddress(String emailAddress) {
		if (emailAddress.contains("@") && emailAddress.contains(".")) {
			return true;
		}
		return false;
	}
}