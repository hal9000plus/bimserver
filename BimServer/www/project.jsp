<%@page import="java.util.List" %>
<%@page import="org.bimserver.shared.SProject" %>
<%@page import="org.bimserver.shared.SCheckout" %>
<%@page import="org.bimserver.shared.SRevision" %>
<%@page import="org.bimserver.shared.SUser" %>
<%@page import="java.text.DateFormat" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Comparator"%>
<%@page import="org.bimserver.SRevisionIdComparator"%>
<%@page import="org.bimserver.shared.UserException"%>
<%@page import="org.bimserver.EmfSerializerFactory"%>
<%@page import="org.bimserver.shared.ResultType"%>
<%@page import="org.bimserver.JspHelper"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		EmfSerializerFactory emfSerializerFactory = EmfSerializerFactory.getInstance();
		int projectId = Integer.parseInt(request.getParameter("id"));
		try {
	SProject project = loginManager.getService().getProjectById(projectId);
	List<SRevision> revisions = loginManager.getService().getAllRevisionsOfProject(projectId).getRevisions();
	Collections.sort(revisions, new SRevisionIdComparator(false));
	List<SCheckout> checkouts = loginManager.getService().getAllCheckoutsOfProject(projectId).getCheckouts();
	Collections.sort(checkouts);
	List<SUser> users = loginManager.getService().getAllAuthorizedUsers(project.getId()).getUsers();
	Collections.sort(users, new SUser.UserComparator());
	List<SUser> nonAuthorizedUsers = loginManager.getService().getAllNonAuthorizedUsers(project.getId()).getUsers();
	SRevision lastRevision = loginManager.getService().getLastRevision(projectId);
	List<String> classes = loginManager.getService().getAvailableClasses().getClassNames();
	Collections.sort(classes);
	boolean anonymousAccess = loginManager.getService().getAllAuthorizedUsers(projectId).getUsers().contains(loginManager.getService().getUserById(2));
%>
<h1>Project details (<%=project.getName() %>)</h1>
<%if (request.getParameter("message") != null) {
	out.println("<div class=\"errormessage\">" + request.getParameter("message") + "</div>");
}
%>
<div id="guide">
 <div id="guidewrap">
  <ol id="breadcrumb">
        <li id="bc-home">
            <a  href="main.jsp" id="usernav-home" class="home">Home</a>
        </li>
            <li>
                <%= JspHelper.generateBreadCrumbPath(project, loginManager.getService()) %>
            </li>
    </ol>
 </div>
</div>
<div id="guide_wrap_btm"> </div>
  
<div class="tabber" id="projecttabber">
  <div class="tabbertab" title="Details">
<a href="editproject.jsp?id=<%=projectId %>">Edit project</a><br/><br/>
<table class="formtable">
<tr><td class="first">Name</td><td><%=project.getName() %></td></tr>
<%
	if (project.getParentId() != -1) {
		SProject parentProject = loginManager.getService().getProjectById(project.getParentId());
%>
<tr><td class="first">Parent</td><td><a href="project.jsp?id=<%=parentProject.getId() %>"><%=parentProject.getName() %></a></td></tr>
<%
	}
%>
<tr><td class="first">Created on</td><td><%=dateFormat.format(project.getCreatedOn()) %></td></tr>
<tr><td class="first">Created by</td><td><a href="user.jsp?id=<%=project.getCreatedByUserId()%>"><%=project.getCreateByUsername() %></a></td></tr>
<% if (lastRevision != null) {%>
<tr><td class="first">Last update on</td><td><%=dateFormat.format(lastRevision.getDate()) %></td></tr>
<tr><td class="first">Last update by</td><td><a href="user.jsp?id=<%=lastRevision.getUserId() %>"><%=lastRevision.getUsername() %></a></td></tr>
<% } %>
<tr><td class="first">State</td><td><%=project.getState().toLowerCase() %></td></tr>
<tr><td class="first">Anonymous access</td><td><%=anonymousAccess %></td></tr>
<tr><td class="first">Description</td><td><%=project.getDescription() %></td></tr>
<% if (project.getGeoTag() != null) { %>
<tr><td class="first">Coord 1</td><td><%=project.getGeoTag().getX1() + "," + project.getGeoTag().getY1() + "," + project.getGeoTag().getZ1() %></td></tr>
<tr><td class="first">Coord 2</td><td><%=project.getGeoTag().getX2() + "," + project.getGeoTag().getY2() + "," + project.getGeoTag().getZ2() %></td></tr>
<tr><td class="first">EPSG</td><td><%=project.getGeoTag().getEpsg() %></td></tr>
<% } %>
</table><br/>
<%if (lastRevision != null) { %>
Click <a href="revision.jsp?pid=<%=projectId %>&amp;rid=<%=lastRevision.getId() %>">here</a> to go to the latest revision<br/><br/>
<form action="<%=request.getContextPath() %>/download" method="post">
Download: <input type="hidden" name="pid" value="<%=projectId %>"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select><input type="submit" value="Download"></td>
<% } %>
</form>
</div>
<div class="tabbertab" title="Sub Projects<%=project.getSubProjects().size() == 0 ? "" : " (" + project.getSubProjects().size() + ")" %>">
<a href="addproject.jsp?parentid=<%=project.getId() %>">Add sub project</a><br/><br/>
<%
	if (project.getSubProjects().size() == 0) {
%>
	No subprojects
<%
	} else {
%>
<table class="formatted">
<tr>
	<th>Name</th>
	<th>Last Revision</th>
	<th>Revisions</th>
	<th>Checkouts</th>
	<th>Authorized users</th>
	<th>Actions</th>
</tr>
<%
	for (int subProjectId : project.getSubProjects()) {
		SProject subProject = loginManager.getService().getProjectById(subProjectId);
		SRevision lastSubProjectRevision = loginManager.getService().getLastRevision(subProject.getId());
%>
	<tr>
		<td><a href="project.jsp?id=<%=subProject.getId() %>"><%=subProject.getName() %></a></td>
		<td><%=lastSubProjectRevision == null ? "No revisions" : ("<a href=\"revision.jsp?pid=" + lastSubProjectRevision.getProjectId() + "&amp;rid=" + lastSubProjectRevision.getId() + "\">" + lastSubProjectRevision.getId() + "</a> by <a href=\"user.jsp?id=" + lastSubProjectRevision.getUserId() + "\">" + lastSubProjectRevision.getUsername() + "</a>")%></td>
		<td><%=subProject.getNumberOfRevisions() %></td>
		<td><%=subProject.getNumberOfCheckouts() %></td>
		<td><%=subProject.getNumberOfAuthorizedUsers() %></td>
	<% if (subProject.getState().equals("ACTIVE")) { %>
		<td><a href="deleteproject.jsp?id=<%=subProject.getId() %>">delete</a></td>
	<% } else if (subProject.getState().equals("DELETED")) { %>
		<td class="deleted"><a href="undeleteproject.jsp?id=<%=subProject.getId() %>">undelete</a></td>
	<% } %>
	</tr>
<%
	}
%>
</table>
<% } %>
</div>
<div class="tabbertab" title="Query">
<%
	if (lastRevision == null) {
%>
	No queries can be done, since there are no revisions yet
<%
	} else {
%>
Note: Queries will be done on the latest revision (<a href="revision.jsp?pid=<%=projectId %>&amp;rid=<%=lastRevision.getId() %>"><%=lastRevision.getId() %></a>), open a specific revision to query other revisions<br/><br/>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=projectId %>"/>
<table>
<tr>
	<td width="120">Object ID</td>
	<td width="320"><input type="text" name="oid" id="oid" onkeyup="update()"/></td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select></td><td><input type="submit" value="Query"></td>
</tr>
</table>
</form>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=projectId %>"/>
<table>
<tr>
	<td width="120">Globally Unique ID</td>
	<td width="320"><input type="text" name="guid" id="guid" onkeyup="update()"/></td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select></td><td><input type="submit" value="Query"></td>
</tr>
</table>
</form>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=projectId %>"/>
<table>
<tr>
	<td width="120">IFC Class</td>
	<td width="320">
		<select name="class" id="cid" onchange="update()">
<%
	for (String className : classes) {
%>
<option value="<%=className%>"><%=className %></option>
<%
	}
%>
		</select>
	</td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select></td><td><input type="submit" value="Query"></td>
</tr>
</table>
</form>
<%
}
%>
</div>
  <div class="tabbertab" title="Revisions<%=revisions.size() == 0 ? "" : " (" + revisions.size() + ")"%>">
<%
	if (revisions.size() > 0 && project.getNumberOfCheckouts() > 0) {
		for (SCheckout checkout : checkouts) {
			if (checkout.getUserId() == loginManager.getUid() && checkout.isActive() && checkout.getRevisionId() < lastRevision.getId()) {
				out.write("<div class=\"warning\">Warning, after your last checkout of this project (revision " + checkout.getRevisionId() + "), a least one other user has checked-in a newer revision</div>");
			}
		}
	}

	if (loginManager.getService().userHasCheckinRights(projectId)) {
%>
<jsp:include page="upload.jsp">
	<jsp:param name="projectId" value="<%=projectId %>"/>
</jsp:include><br/>
<%		
	}
	if (revisions.size() > 0) {
%>

<table class="formatted">
<tr>
	<th>Id</th>
	<th>Date</th>
	<th>User</th>
	<th>Comment</th>
	<th>Size</th>
	<th>Download</th>
	<th>Checkout</th>
	<th>Compare</th>
</tr>
<%
		for (SRevision revision : revisions) {
%>
<tr <%=revision.isLastRevision() ? "style=\"font-weight: bold;\"" : "" %>>
	<td><a href="revision.jsp?pid=<%=revision.getProjectId() %>&amp;rid=<%=revision.getId() %>"><%=revision.getId() %></a></td>
	<td><%=dateFormat.format(revision.getDate()) %></td>
	<td><a href="user.jsp?id=<%=revision.getUserId() %>"><%=revision.getUsername() %></a></td>
	<td><%=revision.getComment() %></td>
	<td><%=revision.getSize() %></td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=projectId %>"/>
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
	<input type="hidden" name="pid" value="<%=projectId %>"/>
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
	<td>
<% if (revisions.size() > 1) { %>
		<form method="get" action="compare.jsp">
		<input type="hidden" name="rid1" value="<%=revision.getId() %>"/>
		<input type="hidden" name="pid" value="<%=projectId %>"/>
		<select name="rid2">
<%
	for (SRevision otherRevision : revisions) {
		if (otherRevision.getId() != revision.getId()) {
%>
		<option value="<%=otherRevision.getId() %>"><%=otherRevision.getId() %></option>
<%
		}
	}
%>
		</select>
		<button type="submit" name="compare" value="Compare">Compare</button>
		</form>
<% } %>
	</td>
</tr>
<%
		}
%>
</table>
<%
	} else {
%>
<div class="none">No revisions, upload an IFC file</div>
<%
	}
%>
<a class="rss" href="<%=request.getContextPath() %>/syndication/revisions?pid=<%=projectId %>">Revisions feed</a>
</div>
  <div class="tabbertab" title="Checkouts<%=checkouts.size() == 0 ? "" : " (" + checkouts.size() + ")" %>">
<h2>Checkouts</h2>
<%
	if (checkouts.size() > 0) {
%>
<table class="formatted">
<tr>
	<th>Revision Id</th>
	<th>User</th>
	<th>Date</th>
	<th>Download</th>
	<th>Checkout</th>
</tr>
<%
		for (SCheckout checkout : checkouts) {
%>
<tr>
	<td><a href="revision.jsp?pid=<%=checkout.getProjectId() %>&amp;rid=<%=checkout.getRevisionId() %>"><%=checkout.getRevisionId() %></a></td>
	<td><a href="user.jsp?id=<%=checkout.getUserId() %>"><%=checkout.getUsername() %></a></td>
	<td><%=dateFormat.format(checkout.getDate()) %></td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=projectId %>"/>
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
	<input type="hidden" name="pid" value="<%=projectId %>"/>
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
<a class="rss" href="<%=request.getContextPath() %>/syndication/checkouts?pid=<%=projectId %>">Checkouts feed</a>
  </div>
  <div class="tabbertab" id="summary" title="Summary">
<%
	if (lastRevision != null) {
%>
  <img id="ajaxloader" src="images/ajax-loader.gif"/>
  <a href="#" id="summarylink">Retrieve</a>
<%
} else {
%>
No summary available while there are no revisions
<%
}
%>
  </div>
  <div class="tabbertab" title="Authorized users<%=users.size() == 0 ? "" : " (" + users.size() + ")" %>">
<% if (nonAuthorizedUsers.size() > 0) { %>
<form method="post" action="addusertoproject.jsp">
<select name="uid">
<%
	for (SUser user : nonAuthorizedUsers) {
%>
<option value="<%=user.getId() %>"><%=user.getName() + " (" + user.getUsername() + ")" %></option>
<%
	}
%>
</select>
<input type="hidden" name="pid" value="<%=projectId %>"/>
<input type="hidden" name="type" value="project"/>
<input type="submit" value="Add"/>
</form>
<% } %>
<%
	if (users.size() > 0) {
%>
<table class="formatted">
<tr><th>Name</th><th>Username</th><th>Actions</th></tr>
<%
		for (SUser user : users) {
%>
<tr>
	<td><a href="user.jsp?id=<%=user.getId() %>"><%=user.getName() %></a></td>
	<td><a href="user.jsp?id=<%=user.getId() %>"><%=user.getUsername() %></a></td>
	<td><% if (!user.getUsername().equals("admin")) { %><a href="revokepermission.jsp?type=project&pid=<%=projectId %>&amp;uid=<%=user.getId() %>">revoke</a><% } %></td>
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
	if (lastRevision != null) {
%>
<script>
	$(document).ready(function(){
		$("#ajaxloader").hide();
	});
	$("#summarylink").click(function(){
		$("#summarylink").hide();
		$("#ajaxloader").show();
		$("#summary").load("summary.jsp?pid=<%=projectId%>&rid=<%=lastRevision.getId()%>");
	});
</script>
<%
	}
		} catch (UserException e) {
			out.println(e.getUserMessage());
		}
	}
%>
<jsp:include page="footer.jsp" />