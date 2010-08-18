package org.bimserver.emf;

import java.util.Date;

public abstract class AbstractEmfModel<T> implements EmfModel<T> {
	private boolean valid = true;
	private String projectName;
	private int revisionNr;
	private String author;
	private Date date;
	private String authorizedUser;
	private String description;
	private double lon;
	private double lat;
	private int altitude;

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getRevisionNr() {
		return revisionNr;
	}

	public void setRevisionNr(int revisionNr) {
		this.revisionNr = revisionNr;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAuthorizedUser() {
		return authorizedUser;
	}

	public void setAuthorizedUser(String authorizedUser) {
		this.authorizedUser = authorizedUser;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	public double getLon() {
		return lon;
	}
	
	public double getLat() {
		return lat;
	}
	
	public int getAltitude() {
		return altitude;
	}
	
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
}