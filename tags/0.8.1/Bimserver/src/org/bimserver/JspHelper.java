package org.bimserver;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.bimserver.shared.AuthenticatedServiceWrapper;
import org.bimserver.shared.SCompareResult;
import org.bimserver.shared.SProject;
import org.bimserver.shared.SRevision;
import org.bimserver.shared.SRevisionSummary;
import org.bimserver.shared.UserException;

public class JspHelper {
	public static String generateBreadCrumbPath(SRevision revision, AuthenticatedServiceWrapper serviceWrapper) throws UserException {
		String projectPath = generateBreadCrumbPath(serviceWrapper.getProjectById(revision.getProjectId()), serviceWrapper);
		return projectPath + " <a href=\"revision.jsp?pid=" + revision.getProjectId() + "&rid=" + revision.getId() + "\">" + revision.getId() + "</a>";
	}

	public static String generateBreadCrumbPath(SProject project, AuthenticatedServiceWrapper serviceWrapper) throws UserException {
		String path = "";
		while (project != null) {
			path = "<a id=\"usernav-home\" href=\"project.jsp?pid=" + project.getId() + "\">" + project.getName() + "</a> " + path;
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
		result.append("<a href=\"project.jsp?pid=" + project.getId() + "\">");
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
			result.append("<td><a href=\"deleteproject.jsp?pid=" + project.getId() + "\">delete</a></td>");
		} else {
			result.append("<td><a href=\"undeleteproject.jsp?pid=" + project.getId() + "\">undelete</a></td>");
		}
		result.append("</tr>");
		for (int subProjectId : project.getSubProjects()) {
			if (loginManager.getService().userHasRights(subProjectId) && (!loginManager.getService().getProjectById(subProjectId).getState().equals("DELETED")) || loginManager.getUserType().equals("ADMIN")) {
				SProject subProject = loginManager.getService().getProjectById(subProjectId);
				result.append(writeProjectTree(subProject, loginManager, level + 1));
			}
		}
		return result.toString();
	}

	public static String writeDownloadProjectTreeJavaScript(SProject project, LoginManager loginManager) throws UserException {
		StringBuilder result = new StringBuilder();
		result.append("projects.project" + project.getId() + " = new Object();\n");
		result.append("projects.project" + project.getId() + ".id = " + project.getId() + ";\n");
		result.append("projects.project" + project.getId() + ".name = \"" + project.getName() + "\";\n");
		result.append("projects.project" + project.getId() + ".subprojects = new Array();\n");
		int i=0;
		for (int subProjectId : project.getSubProjects()) {
			SProject subProject = loginManager.getService().getProjectById(subProjectId);
			result.append(writeDownloadProjectTreeJavaScript(subProject, loginManager));
			result.append("projects.project" + project.getId() + ".subprojects[" + (i++) + "] = projects.project" + subProject.getId() + ";\n");
			result.append("projects.project" + subProject.getId() + ".superproject = projects.project" + project.getId() + ";\n");
		}
		return result.toString();
	}
	
	public static String writeDownloadProjectTree(SProject project, LoginManager loginManager, int level) throws UserException {
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
		result.append("<td><select class=\"treeselect\" name=\"treeselect" + project.getId() + "\" id=\"treeselect" + project.getId() + "\">");
		result.append("<option value=\"[off]\">Off</option>");
		for (SRevision revision : loginManager.getService().getAllRevisionsOfProject(project.getId()).getRevisions()) {
			result.append("<option value=\"" + revision.getId() + "\">" + revision.getId() + "</option>");
		}
		result.append("</select></td>");
		result.append("</tr>");
		for (int subProjectId : project.getSubProjects()) {
			SProject subProject = loginManager.getService().getProjectById(subProjectId);
			if (subProject.getNumberOfRevisions() > 0) {
				result.append(writeDownloadProjectTree(subProject, loginManager, level + 1));
			}
		}
		return result.toString();
	}

	public static String writeSummaryTable(SProject project, int pid, int rid, SRevisionSummary revisionSummary, HttpServletRequest request) {
		StringBuilder builder = new StringBuilder();
		builder.append("<h1>Summary of project " + project.getName() + ", revision " + rid + "</h1>");
		builder.append("<table class=\"formatted\">");
		builder.append("<tr><th>Entity</th><th>Amount</th></tr>");
		Map<String, Map<String, Integer>> map = revisionSummary.getMap();
		for (String group : map.keySet()) {
			builder.append("<tr><td colspan=\"2\" class=\"summarygroup\">" + group + "</td></tr>");
			Map<String, Integer> subMap = map.get(group);
			for (String className : subMap.keySet()) {
				Integer amount = subMap.get(className);
				builder.append("<tr><td><span class=\"summaryitem\"><a href=\"" + request.getRequestURI() + "?pid=" + pid + "&rid=" + rid + "&className=" + className + "\">" + className + "</a></span></td><td>" + amount + "</td></tr>");
			}
		}
		builder.append("</table>");
		return builder.toString();
	}

	public static String writeCompareResult(SCompareResult compareResult, int rid1, int rid2, SProject project) {
		StringBuilder builder = new StringBuilder();
		builder.append("<h1>Building Model Comparator</h1>");
		builder.append("Compare results for revisions '" + rid1 + "' and '" + rid2 + "' of project '" + project.getName() + "'<br/>");
		builder.append("Total number of differences: " + compareResult.size() + "<br/>");
		builder.append("<table class=\"formatted\">");
		builder.append("<tr>");
		builder.append("<th>Type</th>");
		builder.append("<th>Guid</th>");
		builder.append("<th>Name</th>");
		builder.append("<th>Difference</th>");
		builder.append("</tr>");
		Map<String, List<SCompareResult.Item>> items = compareResult.getItems();
		for (String eClass : items.keySet()) {
			for (SCompareResult.Item item : items.get(eClass)) {
				String name = "";
				String guid = "";
				if (item.dataObject.getGuid() != null) {
					guid = item.dataObject.getGuid();
				} else if (item.dataObject.getName() != null) {
					name = item.dataObject.getName();
				}
				builder.append("<tr>");
				if (item.type == SCompareResult.Type.ADDED) {
					builder.append("<td>" + eClass + "</td>");
					builder.append("<td>" + guid + "</td>");
					builder.append("<td>" + name + "</td>");
					builder.append("<td>Added</td>");
				} else if (item.type == SCompareResult.Type.DELETED) {
					builder.append("<td>" + eClass + "</td>");
					builder.append("<td>" + guid + "</td>");
					builder.append("<td>" + name + "</td>");
					builder.append("<td>Deleted</td>");
				}
				builder.append("</tr>");
			}
		}
		builder.append("</table>");
		return builder.toString();
	}
}