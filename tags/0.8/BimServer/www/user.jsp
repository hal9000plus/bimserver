<%@page import="java.util.List" %>
<%@page import="org.bimserver.shared.SUser" %>
<%@page import="java.text.DateFormat" %>
<%@page import="org.bimserver.shared.SCheckout" %>
<%@page import="org.bimserver.shared.SProject" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="java.util.Collections"%>
<%@page import="org.bimserver.shared.ProjectList"%>
<%@page import="org.bimserver.Message"%>
<%@page import="org.bimserver.shared.UserException"%>
<%@page import="org.bimserver.shared.ResultType"%>
<%@page import="org.bimserver.EmfSerializerFactory"%>
<%@page import="org.bimserver.SRevisionIdComparator"%>
<%@page import="org.bimserver.shared.SRevision"%>
<%@page import="org.bimserver.SRevisionDateComparator"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		EmfSerializerFactory emfSerializerFactory = EmfSerializerFactory.getInstance();
		try {
	if (request.getParameter("mid") != null) {
		out.println("<div class=\"succesmessage\">" + Message.get(Integer.parseInt(request.getParameter("mid"))) + "</div>");
	}
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
	int uid = Integer.parseInt(request.getParameter("id"));
	SUser user = loginManager.getService().getUserById(uid);
	loginManager.getService().getAllRevisionsByUser(user.getId());
	List<SRevision> revisions = loginManager.getService().getAllRevisionsByUser(user.getId()).getRevisions();
	Collections.sort(revisions, new SRevisionDateComparator(false));
	List<SCheckout> checkouts = loginManager.getService().getAllCheckoutsByUser(user.getId()).getCheckouts();
	Collections.sort(checkouts);
	List<SProject> projects = loginManager.getService().getUsersProjects(uid).getProjects();
	Collections.sort(projects);
	List<SProject> nonAuthorizedProjects = loginManager.getService().getAllNonAuthorizedProjectsOfUser(user.getId()).getProjects();
%>
<h1>User details (<%=user.getName() %>)</h1>
<div class="tabber" id="usertabber">
  <div class="tabbertab" title="Details">
<table class="formtable">
<tr><td class="first">Name</td><td><%=user.getName() %></td></tr>
<tr><td class="first">Username</td><td><%=user.getUsername() %></td></tr>
<tr><td class="first">Created on</td><td><%=dateFormat.format(user.getCreatedOn()) %></td></tr>
<tr><td class="first">Last seen</td><td><%=dateFormat.format(user.getLastSeen()) %></td></tr>
<tr><td class="first">State</td><td><%=user.getState().toLowerCase() %></td></tr>
<tr><td class="first">Change password</td><td><a href="changepassword.jsp?uid=<%=uid%>">Change password</a></td></tr>
<%
	if (user.getCreatedByUsername() != null) {
%>
<tr><td class="first">Created by</td><td><a href="user.jsp?id=<%=user.getCreatedByUserId()%>"><%=user.getCreatedByUsername() %></a></td></tr>
<%
	}
%>
</table>
  </div>
  <div class="tabbertab" title="Revisions<%=revisions.size() == 0 ? "" : " (" + revisions.size() + ")" %>">
<%
	if (revisions.size() > 0) {
%>
<table class="formatted">
<tr>
	<th>Project</th>
	<th>Revision Id</th>
	<th>Date</th>
	<th>Comment</th>
	<th>Size</th>
	<th>Download</th>
	<th>Checkout</th>
</tr>
<%
		for (SRevision revision : revisions) {
%>
<tr>
	<td><a href="project.jsp?id=<%=revision.getProjectId() %>"><%=revision.getProjectName() %></a></td>
	<td><a href="revision.jsp?pid=<%=revision.getProjectId() %>&amp;rid=<%=revision.getId() %>"><%=revision.getId() %></a></td>
	<td><%=dateFormat.format(revision.getDate()) %></td>
	<td><%=revision.getComment() %></td>
	<td><%=revision.getSize() %></td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=revision.getProjectId() %>"/>
	<input type="hidden" name="rid" value="<%=revision.getId() %>"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.name() %></option>
<%	
	}
%>
	</select><input type="submit" value="Download"/>
	</form>
	</td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=revision.getProjectId() %>"/>
	<input type="hidden" name="rid" value="<%=revision.getId() %>"/>
	<input type="hidden" name="type" value="checkout"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getResultTypes()) {
		if (resultType.useInCheckout()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.name() %></option>
<%
		}
	}
%>
	</select><input type="submit" value="Checkout"/>
	</form>
	</td>
</tr>
<%
		}
%>
</table>
<%
	} else {
%>
<div class="none">None</div>
<%		
	}
%>
</div>
<div class="tabbertab" title="Checkouts<%=checkouts.size() == 0 ? "" : " (" + checkouts.size() + ")" %>">
<%
	if (checkouts.size() > 0) {
%>
<table class="formatted">
<tr>
	<th>Project</th>
	<th>Revision Id</th>
	<th>Date</th>
	<th>Download</th>
	<th>Checkout</th>
</tr>
<%
		for (SCheckout checkout : checkouts) {
%>
<tr>
	<td><a href="project.jsp?id=<%=checkout.getProjectId() %>"><%=checkout.getProjectName() %></a></td>
	<td><a href="revision.jsp?pid=<%=checkout.getProjectId() %>&amp;rid=<%=checkout.getRevisionId() %>"><%=checkout.getRevisionId() %></a></td>
	<td><%=dateFormat.format(checkout.getDate()) %></td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=checkout.getProjectId() %>"/>
	<input type="hidden" name="rid" value="<%=checkout.getRevisionId() %>"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.name() %></option>
<%	
	}
%>
	</select><input type="submit" value="Download"/>
	</form>
	</td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=checkout.getProjectId() %>"/>
	<input type="hidden" name="rid" value="<%=checkout.getRevisionId() %>"/>
	<input type="hidden" name="type" value="checkout"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getResultTypes()) {
		if (resultType.useInCheckout()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.name() %></option>
<%
		}
	}
%>
	</select><input type="submit" value="Checkout"/>
	</form>
	</td>
</tr>
<%
		}
%>
</table>
<%
	} else {
%>
<div class="none">None</div>
<%
	}
%>
</div>
<div class="tabbertab" title="Projects<%=projects.size() == 0 ? "" : " (" + projects.size() + ")" %>">
<% if (nonAuthorizedProjects.size() > 0) { %>
<form method="post" action="addusertoproject.jsp">
<select name="pid">
<%
	for (SProject project : nonAuthorizedProjects) {
%>
<option value="<%=project.getId() %>"><%=project.getName() %></option>
<%
	}
%>
</select>
<input type="hidden" name="uid" value="<%=uid %>"/>
<input type="hidden" name="type" value="user"/>
<input type="submit" value="Add"/>
</form>
<% } %>
<%
	if (projects.size() > 0) {
%>
<table class="formatted">
<tr>
	<th>Project</th>
	<th>Actions</th>
</tr>
<%
		for (SProject project : projects) {
%>
<tr>
	<td><a href="project.jsp?id=<%=project.getId() %>"><%=project.getName() %></a></td>
	<td><% if (!user.getName().equals("admin")) { %><a href="revokepermission.jsp?type=user&amp;pid=<%=project.getId() %>&amp;uid=<%=uid %>">revoke</a><% } %></td>
</tr>
<%
		}
%>
</table>
<%
	} else {
%>
<div class="none">None</div>
<%
	}
%>
</div>
</div>
<% 
	} catch (UserException e) {
		out.println("<div class=\"errormessage\">" + e.getUserMessage() + "</div>");
	}
}
%>
<%@ include file="footer.jsp" %>