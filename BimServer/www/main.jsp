<%@page import="java.util.List" %>
<%@page import="org.bimserver.shared.SProject" %>
<%@page import="org.bimserver.shared.SRevision" %>
<%@page import="java.util.Collections"%>
<%@page import="org.bimserver.LoginManager"%>
<%@ include file="header.jsp" %>
<%
if (serverInfo.isAvailable()) {
	if (loginManager.isLoggedIn()) { %>

<%@page import="org.bimserver.JspHelper"%><h1>Projects</h1>
<fieldset>
<a href="addproject.jsp">Add project</a><br/><br/>
<%
	List<SProject> projects = loginManager.getService().getAllProjects().getProjects();
	Collections.sort(projects);
	if (projects.size() > 0) {

	for (SProject project : projects) {
		if (project.getParentId() == -1) {
			%>
			<table class="formatted">
			<tr>
				<th>Name</th>
				<th>Last revision</th>
				<th>Revisions</th>
				<th>Checkouts</th>
				<th>Authorized users</th>
				<th>Actions</th>
			</tr>
			<%
			out.write(JspHelper.writeProjectTree(project, loginManager, 0));
		}
	%>
	</table>
	<%
	}
	} else {
%>
No projects<br/><br/>
<%
	}
%>
<a class="rss" href="<%=request.getContextPath() %>/syndication/projects">Projects feed</a>
<%
	}
}
%>
</fieldset>
<%@ include file="footer.jsp" %>