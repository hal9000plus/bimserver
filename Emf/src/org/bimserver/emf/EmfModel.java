package org.bimserver.emf;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface EmfModel<T> {

	void setLon(double lon);

	void setLat(double lat);

	double getLon();

	double getLat();

	void setProjectName(String name);

	void setRevisionNr(int id);

	void setAuthor(String name);

	void setAuthorizedUser(String name);

	void setDate(Date date);

	boolean isValid();

	String getProjectName();

	int getRevisionNr();

	long size();

	Collection<EObject> getValues();

	String getAuthor();

	String getAuthorizedUser();

	Map<T, EObject> getObjects();

	Collection<T> keySet();

	EObject get(Long key);

	Map<? extends Long, ? extends EObject> getMap();

	void add(EObject newObject);

	void add(T t, EObject newObject);

	void setDescription(String description);

	String getDescription();

	int getAltitude();
	
	void setAltitude(int altitude);
}