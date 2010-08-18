package org.bimserver;

import org.bimserver.shared.AuthenticatedServiceWrapper;
import org.bimserver.shared.SProject;
import org.bimserver.shared.SRevision;
import org.bimserver.shared.UserException;

public class JspHelper {
	public static String generateBreadCrumbPath(SRevision revision, AuthenticatedServiceWrapper serviceWrapper) throws UserException {
		String projectPath = generateBreadCrumbPath(serviceWrapper.getProjectById(revision.getProjectId()), serviceWrapper);
		return projectPath + " <a href=\"revision.jsp?pid=" + revision.getProjectId() + "&rid=" + revision.getId() + "\">" + revision.getId() + "</a>";
	}

	public static String generateBreadCrumbPath(SProject project, AuthenticatedServiceWrapper serviceWrapper) throws UserException {
		String path = "";
		while (project != null) {
			path = "<a id=\"usernav-home\" href=\"project.jsp?id=" + project.getId() + "\">" + project.getName() + "</a> " + path;
			if (project.getParentId() != -1) {
				project = serviceWrapper.getProjectById(project.getParentId());
			} else {
				project = null;
			}
		}
		return path;
	}

	public static String writeProjectTree(SProject project, LoginManager loginManager, int level) throws UserException {
		StringBuilder result = new StringBuilder();
		SRevision lastRevision = loginManager.getService().getLastRevision(project.getId());
		result.append("<tr" + (project.getState().equals("DELETED") ? " class=\"deleted\"" : "") + ">");
		result.append("<td>");
		for (int i = 0; i < level; i++) {
			result.append("&nbsp;&nbsp;");
		}
		if (level != 0) {
		result.append("<img src=\"images/subproject.gif\" alt=\"|->\" />");
		}
		result.append("<a href=\"project.jsp?id=" + project.getId() + "\">");
		result.append(project.getName());
		result.append("</a></td>");
		result.append("<td>"
				+ (lastRevision == null ? "No revisions"
						: ("<a href=\"revision.jsp?pid=" + lastRevision.getProjectId() + "&amp;rid=" + lastRevision.getId() + "\">" + lastRevision.getId()
								+ "</a> by <a href=\"user.jsp?id=" + lastRevision.getUserId() + "\">" + lastRevision.getUsername() + "</a>")) + "</td>");
		result.append("<td>" + project.getNumberOfRevisions() + "</td>");
		result.append("<td>" + project.getNumberOfCheckouts() + "</td>");
		result.append("<td>" + project.getNumberOfAuthorizedUsers() + "</td>");
		if (project.getState().equals("ACTIVE")) {
			result.append("<td><a href=\"deleteproject.jsp?id=" + project.getId() + "\">delete</a></td>");
		} else {
			result.append("<td class=\"deleted\"><a href=\"undeleteproject.jsp?id=" + project.getId() + "\">undelete</a></td>");
		}
		result.append("</tr>");
		for (int subProjectId : project.getSubProjects()) {
			result.append(writeProjectTree(loginManager.getService().getProjectById(subProjectId), loginManager, level + 1));
		}
		return result.toString();
	}
}