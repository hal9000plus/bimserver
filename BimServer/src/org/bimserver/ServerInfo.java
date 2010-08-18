package org.bimserver;

public class ServerInfo {
	private static String errorMessage;
	
	public boolean isAvailable() {
		return errorMessage == null;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public static void setErrorMessage(String errorMessage) {
		ServerInfo.errorMessage = errorMessage;
	}
}
