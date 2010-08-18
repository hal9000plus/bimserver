//package org.bimserver;

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

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.GregorianCalendar;
//import java.util.Map;
//import java.util.Set;
//
//import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;
//import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;
//
//import org.bimserver.emf2codb.store.Checkout;
//import org.bimserver.emf2codb.store.Project;
//import org.bimserver.emf2codb.store.Revision;
//import org.bimserver.emf2codb.store.StoreFactory;
//import org.bimserver.emf2codb.store.StorePackage;
//import org.bimserver.emf2codb.store.User;
//import org.bimserver.ifc.file.reader.FastIfcFileReader;
//import org.bimserver.ifc.file.reader.IfcFileReader;
//import org.bimserver.ifc.file.writer.IfcFileWriter;
//import org.bimserver.ifc.store.IfcStoreException;
//import org.bimserver.utils.EmfModel;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
//
//import com.sleepycat.persist.impl.Store;
//
//public class IfcFileStore implements BimServerStore {
//	private static final File STORE_DIR = new File("ifcstore");
//	private SchemaDefinition schemaDefinition;
//	private Store store;
//	private File dataFile = new File(STORE_DIR, "data.xml");
//
//	public IfcFileStore() {
//		ExpressSchemaParser schemaParser = new ExpressSchemaParser(IfcFileReader.DEFAULT_SCHEMA_FILE);
//		schemaParser.parse();
//		schemaDefinition = schemaParser.getSchema();
//
//		readXml();
//	}
//
//	public void readXml() {
//		if (!dataFile.exists()) {
//			store = StoreFactory.eINSTANCE.createStore();
//			User adminUser = StoreFactory.eINSTANCE.createUser();
//			adminUser.setName("admin");
//			adminUser.setPassword("admin");
//			store.getUsers().add(adminUser);
//		} else {
//			ResourceSet resourceSet = new ResourceSetImpl();
//			resourceSet.getPackageRegistry().put(StorePackage.eNS_URI, StorePackage.eINSTANCE);
//			Map<String, Object> extensionMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
//			extensionMap.put("xml", new XMLResourceFactoryImpl());
//			URI fileURI = URI.createFileURI(dataFile.getAbsolutePath());
//			Resource poResource = resourceSet.getResource(fileURI, true);
//			store = (Store) poResource.getContents().get(0);
//		}
//	}
//
//	public void writeXml() {
//		try {
//			ResourceSet resourceSet = new ResourceSetImpl();
//			Map<String, Object> extensionMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
//			extensionMap.put("xml", new XMLResourceFactoryImpl());
//			URI fileURI = URI.createFileURI(dataFile.getAbsolutePath());
//			Resource poResource = resourceSet.createResource(fileURI);
//			poResource.getContents().add(store);
//			poResource.save(null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public Revision checkin(EmfModel model, Project project, User user, String comment) throws IfcStoreException {
//		if (!projectExists(project)) {
//			throw new IfcStoreException("Project " + project.getName() + " doest not exist");
//		}
//		if (!userExists(user)) {
//			throw new IfcStoreException("User " + user.getName() + " does not exists");
//		}
//		IfcFileWriter ifcFileWriter = new IfcFileWriter(model, schemaDefinition);
//		try {
//			Revision revision = createNewRevision(project, user, comment);
//			File file = new File(STORE_DIR, project.getName() + File.separator + revision.getId() + ".ifc");
//			ifcFileWriter.write(file);
//			revision.setSize(file.length());
//			store.getRevisions().add(revision);
//			project.setLastRevision(revision);
//			writeXml();
//			return revision;
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	private boolean userExists(User user) {
//		for (User u : store.getUsers()) {
//			if (u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword())) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	private Revision createNewRevision(Project project, User user, String comment) {
//		File projectFile = new File(STORE_DIR, project.getName());
//		int maxRevision = 0;
//		for (File revision : projectFile.listFiles()) {
//			int revisionNr = Integer.parseInt(revision.getName().substring(0, revision.getName().indexOf(".")));
//			maxRevision = Math.max(revisionNr, maxRevision);
//		}
//		Revision revision = StoreFactory.eINSTANCE.createRevision();
//		revision.setId(maxRevision + 1);
//		revision.setProject(project);
//		revision.setUser(user);
//		revision.setDate(new Date());
//		revision.setComment(comment);
//		return revision;
//	}
//
//	private void createProject(Project project) {
//		new File(STORE_DIR, project.getName()).mkdir();
//	}
//
//	private boolean projectExists(Project project) {
//		return new File(STORE_DIR, project.getName()).isDirectory();
//	}
//
//	public Project getProject(String projectName) {
//		for (Project project : store.getProjects()) {
//			if (project.getName().equals(projectName)) {
//				return project;
//			}
//		}
//		return null;
//	}
//
//	public User getUser(String username) {
//		for (User user : store.getUsers()) {
//			if (user.getName().equals(username)) {
//				return user;
//			}
//		}
//		return null;
//	}
//
//	public EmfModel checkout(Project project, User user, int revisionNr) {
//		if (projectExists(project)) {
//			Revision revision = null;
//			if (revisionNr == -1) {
//				revision = project.getLastRevision();
//			} else {
//				revision = getRevision(project, revisionNr);
//			}
//			FastIfcFileReader fileReader = new FastIfcFileReader();
//
//			Checkout checkout = StoreFactory.eINSTANCE.createCheckout();
//			checkout.setProject(project);
//			checkout.setRevision(revision);
//			checkout.setDate(new Date());
//			checkout.setUser(user);
//			store.getCheckouts().add(checkout);
//			writeXml();
//
//			try {
//				fileReader.read(new File(STORE_DIR, project.getName() + File.separator + revision.getId() + ".ifc"));
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//			return fileReader.getModel();
//		}
//		return null;
//	}
//
//	private Revision getRevision(Project project, int revisionNr) {
//		for (Revision revision : project.getRevisions()) {
//			if (revision.getId() == revisionNr) {
//				return revision;
//			}
//		}
//		return null;
//	}
//
//	public SchemaDefinition getSchema() {
//		return schemaDefinition;
//	}
//
//	public void addUser(String username, String password) {
//		User user = StoreFactory.eINSTANCE.createUser();
//		user.setName(username);
//		user.setPassword(password);
//		store.getUsers().add(user);
//		writeXml();
//	}
//
//	public void addProject(String projectName) {
//		Project project = StoreFactory.eINSTANCE.createProject();
//		project.setName(projectName);
//		new File(STORE_DIR, projectName).mkdir();
//		store.getProjects().add(project);
//		writeXml();
//	}
//
//	public void addUserToProject(String username, String projectName) {
//		getUser(username).getHasRightsOn().add(getProject(projectName));
//		writeXml();
//	}
//
//	public Set<Project> getAllProjects() {
//		return null;
////		return store.getProjects();
//	}
//
//	public Set<Revision> getAllRevisions(Project project) {
//		return null;
////		return project.getRevisions();
//	}
//
//	public Set<Checkout> getAllCheckouts(Project project) {
//		return null;
////		return project.getCheckouts();
//	}
//}