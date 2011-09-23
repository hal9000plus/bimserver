package org.bimserver.rights;

import org.bimserver.database.store.Project;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;

public class RightsManager {
	
	public static boolean hasRightsOnProjectOrSuperProjectsOrSubProjects(User user, Project project) {
		if (user.getUserType() == UserType.ADMIN) {
			return true;
		}
		while (project != null) {
			if (hasRightsOnProjectOrSubProjects(user, project)) {
				return true;
			}
			project = project.getParent();
		}
		return false;
	}
	
	public static boolean hasRightsOnProjectOrSuperProjects(User user, Project project) {
		if (user.getUserType() == UserType.ADMIN) {
			return true;
		}
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
		if (user.getUserType() == UserType.ADMIN) {
			return true;
		}
		if (hasRightsOnProject(user, project)) {
			return true;
		}
		for (Project subProject : project.getSubProjects()) {
			if (hasRightsOnProjectOrSubProjects(user, subProject)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasRightsOnProject(User user, Project project) {
		if (user.getUserType() == UserType.ADMIN) {
			return true;
		}
		for (User authorizedUser : project.getHasAuthorizedUsers()) {
			if (authorizedUser == user) {
				return true;
			}
		}
		return false;
	}
}