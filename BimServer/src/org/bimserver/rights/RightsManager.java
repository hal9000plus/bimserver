package org.bimserver.rights;

import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;

public class RightsManager {
	
	public static boolean hasRightsOnProjectOrSuperProjectsOrSubProjects(User user, Project project) {
		while (project != null) {
			if (hasRightsOnProjectOrSubProjects(user, project)) {
				return true;
			}
			project = project.getParent();
		}
		return false;
	}
	
	public static boolean hasRightsOnProjectOrSuperProjects(User user, Project project) {
		if (hasRightsOnProject(user, project)) {
			return true;
		}
		if (project.getParent() != null) {
			if (hasRightsOnProjectOrSuperProjects(user, project.getParent())) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasRightsOnProjectOrSubProjects(User user, Project project) {
		if (hasRightsOnProject(user, project)) {
			return true;
		}
		for (Project subProject : project.getSubProjects()) {
			if (hasRightsOnProject(user, subProject)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasRightsOnProject(User user, Project project) {
		for (User authorizedUser : project.getHasAuthorizedUsers()) {
			if (authorizedUser == user) {
				return true;
			}
		}
		return false;
	}
}