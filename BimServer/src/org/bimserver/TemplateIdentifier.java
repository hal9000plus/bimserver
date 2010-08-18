package org.bimserver;

public enum TemplateIdentifier {
	REGISTRATION_EMAIL_BODY("registration_email_body.template"),
	REGISTRATION_EMAIL_SUBJECT("registration_email_subject.template");
	
	private final String fileName;

	TemplateIdentifier(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
}