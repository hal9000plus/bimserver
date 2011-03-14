package org.bimserver.database.actions;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.bimserver.ServerInitializer;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.mail.MailSystem;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.User;
import org.bimserver.settings.ServerSettings;
import org.bimserver.shared.UserException;
import org.bimserver.templating.TemplateEngine;
import org.bimserver.templating.TemplateIdentifier;
import org.bimserver.utils.GeneratorUtils;
import org.bimserver.utils.Hashers;

public class RequestPasswordChangeDatabaseAction extends BimDatabaseAction<Void> {

	private final long uoid;

	public RequestPasswordChangeDatabaseAction(BimDatabaseSession bimDatabaseSession, AccessMethod accessMethod, long uoid) {
		super(bimDatabaseSession, accessMethod);
		this.uoid = uoid;
	}

	@Override
	public Void execute() throws UserException, BimDeadlockException, BimDatabaseException {
		final User user = getUserByUoid(uoid);
		final String token = GeneratorUtils.generateToken();
		user.setValidationToken(Hashers.getSha256Hash(token));
		user.setValidationTokenCreated(new Date());
		getDatabaseSession().store(user);
		getDatabaseSession().addPostCommitAction(new PostCommitAction() {
			@Override
			public void execute() throws UserException {
				if (MailSystem.isValidEmailAddress(user.getUsername())) {
					Session mailSession = MailSystem.getInstance().createMailSession();
					
					Message msg = new MimeMessage(mailSession);
					
					try {
						InternetAddress addressFrom = new InternetAddress(ServerSettings.getSettings().getEmailSenderAddress());
						msg.setFrom(addressFrom);
						
						InternetAddress[] addressTo = new InternetAddress[1];
						addressTo[0] = new InternetAddress(user.getUsername());
						msg.setRecipients(Message.RecipientType.TO, addressTo);
						
						Map<String, Object> context = new HashMap<String, Object>();
						context.put("name", user.getName());
						context.put("username", user.getUsername());
						context.put("siteaddress", ServerSettings.getSettings().getSiteAddress());
						context.put("validationlink", ServerSettings.getSettings().getSiteAddress() + ServerInitializer.getServletContext().getContextPath() + "/validate.jsp?uoid=" + user.getOid() + "&token=" + token);
						String body = null;
						String subject = null;
						body = TemplateEngine.getTemplateEngine().process(context, TemplateIdentifier.PASSWORD_RESET_EMAIL_BODY);
						subject = TemplateEngine.getTemplateEngine().process(context, TemplateIdentifier.PASSWORD_RESET_EMAIL_SUBJECT);
						msg.setContent(body, "text/html");
						msg.setSubject(subject.trim());
						Transport.send(msg);
					} catch (AddressException e) {
						e.printStackTrace();
					} catch (MessagingException e) {
						e.printStackTrace();
					}
				}
			}
		});
		return null;
	}
}
