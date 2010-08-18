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
<%@page import="org.bimserver.rights.RightsManager"%>
<%@page import="org.bimserver.shared.DataObject"%>
<%@page import="org.bimserver.shared.DataObject.SimpleDataValue"%>
<%@page import="org.bimserver.shared.DataObject.ReferenceDataValue"%>
<%@page import="org.bimserver.shared.DataObject.ReferenceDataValue"%>
<%@page import="org.bimserver.shared.DataObject.ReferenceDataValue"%>
<%@page import="org.bimserver.shared.DataObject.DataValue"%>
<%@page import="org.bimserver.shared.DataObject.ListDataValue"%>
<%@page import="org.bimserver.shared.DataObject.ListDataValue"%>
<%@page import="org.bimserver.shared.DataObject.ListDataValue"%>
<%@page import="org.bimserver.shared.DataObject.ReferenceDataValue"%>
<%@page import="org.bimserver.shared.DataObject.ReferenceDataValue"%>
<%@page import="org.bimserver.shared.DataObject.SimpleDataValue"%>
<%@page import="org.bimserver.shared.SRevisionSummary"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		EmfSerializerFactory emfSerializerFactory = EmfSerializerFactory.getInstance();
		int pid = Integer.parseInt(request.getParameter("pid"));
		try {
			SProject project = loginManager.getService().getProjectById(pid);
			List<SRevision> revisions = loginManager.getService().getAllRevisionsOfProject(pid).getRevisions();
			Collections.sort(revisions, new SRevisionIdComparator(false));
			List<SRevision> revisionsInc = loginManager.getService().getAllRevisionsOfProject(pid).getRevisions();
			Collections.sort(revisionsInc, new SRevisionIdComparator(true));
			List<SCheckout> checkouts = loginManager.getService().getAllCheckoutsOfProject(pid).getCheckouts();
			Collections.sort(checkouts);
			List<SUser> users = loginManager.getService().getAllAuthorizedUsers(project.getId()).getUsers();
			Collections.sort(users, new SUser.UserComparator());
			List<SUser> nonAuthorizedUsers = loginManager.getService().getAllNonAuthorizedUsers(project.getId()).getUsers();
			SRevision lastRevision = loginManager.getService().getLastRevision(pid);
			List<String> classes = loginManager.getService().getAvailableClasses().getClassNames();
			Collections.sort(classes);
			boolean anonymousAccess = loginManager.getService().getAllAuthorizedUsers(pid).getUsers().contains(loginManager.getService().getUserById(2));
			boolean hasUserManagementRights = users.contains(loginManager.getService().getUserById(loginManager.getUid()));
if (emfSerializerFactory.resultTypeEnabled(ResultType.O3D_JSON)) {
%>
<jsp:include page="o3d.jsp">
	<jsp:param name="pid" value="<%=pid %>"/>
</jsp:include><br/>
<%
}
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
<% if (project.getNumberOfRevisions() == 0) { %>
<div class="info"><img src="images/warning.png" alt="warning" />There are no revisions yet, click <a id="revisiontablink" href="#">on the revisions tab</a> to add a first revision, or <a id="subprojecttablink" href="#">add a subproject.</a></div>
<%}%>
<a href="editproject.jsp?pid=<%=pid %>">Edit project</a><br/><br/>
<table class="formtable">
<tr><td class="first">Name</td><td><%=project.getName() %></td></tr>
<%
	if (project.getParentId() != -1) {
		SProject parentProject = loginManager.getService().getProjectById(project.getParentId());
%>
<tr><td class="first">Parent</td><td><a href="project.jsp?pid=<%=parentProject.getId() %>"><%=parentProject.getName() %></a></td></tr>
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
Click <a href="revision.jsp?pid=<%=pid %>&amp;rid=<%=lastRevision.getId() %>">here</a> to go to the latest revision<br/><br/>
<p>
<a href="#" id="simpledownloadlink">Simple download</a>
<a href="#" id="advanceddownloadlink">Advanced download</a>
</p>
<div id="simpledownload">
<form action="<%=request.getContextPath() %>/download" method="post">
Download: <input type="hidden" name="pid" value="<%=pid %>"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getMultipleResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.getNiceName() %></option>
<%	
	}
%>
	</select> <label for="simplezip_<%=lastRevision.getId() %>">Zip</label><input type="checkbox" name="zip" id="simplezip_<%=lastRevision.getId() %>"/> <input type="submit" value="Download">
</form>
</div>
<div id="advanceddownload">
<script>
var projects = new Object();
<%=JspHelper.writeDownloadProjectTreeJavaScript(project, loginManager) %>
</script>
<form method="post" action="<%=request.getContextPath() %>/download">
<table class="formatted maintable">
	<tr><th>Project</th><th>Last revision</th><th>Revision</th></tr>
	<%=JspHelper.writeDownloadProjectTree(project, loginManager, 0) %>
</table>
Download:
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getMultipleResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.getNiceName() %></option>
<%	
	}
%>
	</select> <label for="advancedzip_<%=lastRevision.getId() %>">Zip</label><input type="checkbox" name="zip" id="advancedzip_<%=lastRevision.getId() %>"/> <input type="submit" value="Download">
<input type="hidden" name="multiple" value="true"/>
</form>
</div>
<% } %>
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
	for (int subpid : project.getSubProjects()) {
		SProject subProject = loginManager.getService().getProjectById(subpid);
		SRevision lastSubProjectRevision = loginManager.getService().getLastRevision(subProject.getId());
%>
	<tr<%=subProject.getState().equals("DELETED") ? " class=\"deleted\"" : "" %>>
		<td><a href="project.jsp?pid=<%=subProject.getId() %>"><%=subProject.getName() %></a></td>
		<td><%=lastSubProjectRevision == null ? "No revisions" : ("<a href=\"revision.jsp?pid=" + lastSubProjectRevision.getProjectId() + "&amp;rid=" + lastSubProjectRevision.getId() + "\">" + lastSubProjectRevision.getId() + "</a> by <a href=\"user.jsp?id=" + lastSubProjectRevision.getUserId() + "\">" + lastSubProjectRevision.getUsername() + "</a>")%></td>
		<td><%=subProject.getNumberOfRevisions() %></td>
		<td><%=subProject.getNumberOfCheckouts() %></td>
		<td><%=subProject.getNumberOfAuthorizedUsers() %></td>
	<% if (subProject.getState().equals("ACTIVE")) { %>
		<td><a href="deleteproject.jsp?ppid=<%=project.getId() %>&pid=<%=subProject.getId() %>">delete</a></td>
	<% } else if (subProject.getState().equals("DELETED")) { %>
		<td><a href="undeleteproject.jsp?ppid=<%=project.getId() %>&pid=<%=subProject.getId() %>">undelete</a></td>
	<% } %>
	</tr>
<%
	}
%>
</table>
<% } %>
</div>

<div class="tabbertab" title="Revisions<%=revisions.size() == 0 ? "" : " (" + revisions.size() + ")"%>">
<%
	SCheckout checkoutWarning = loginManager.getService().getShowCheckoutWarning(project.getId(), loginManager.getUid());
	if (checkoutWarning != null) {
		out.write("<div class=\"warning\"><img src=\"images/warning.png\" alt=\"warning\" />Warning, after your last checkout of this project (revision " + checkoutWarning.getRevisionId() + "), at least one other user has checked-in a newer revision</div>");
	}
	if (loginManager.getService().userHasCheckinRights(pid)) {
%>
<jsp:include page="upload.jsp">
	<jsp:param name="pid" value="<%=pid %>"/>
</jsp:include><br/>
<%		
	}
	if (revisions.size() > 1) {
%>
<fieldset>
<legend>Compare</legend>
	<div id="compareajaxloader">
	Comparing... <img src="images/ajax-loader.gif"/>
	</div>
	<form method="get" action="compare.jsp" id="compareform">
	<input type="hidden" name="pid" value="<%=pid %>"/>
	Revision <select name="rid1">
<%
for (SRevision otherRevision : revisionsInc) {
%>
	<option value="<%=otherRevision.getId() %>"><%=otherRevision.getId() %></option>
<%
}
%>
	</select> with 
	Revision <select name="rid2">
<%
for (SRevision otherRevision : revisionsInc) {
%>
	<option value="<%=otherRevision.getId() %>"><%=otherRevision.getId() %></option>
<%
}
%>
	</select>
	<button type="submit" name="compare" value="Compare">Compare</button>
	</form>
</fieldset>
<%}
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
</tr>
<%
		for (SRevision revision : revisions) {
%>
<tr style="<%=revision.isLastRevision() ? "font-weight: bold;" : "" %><%=revision.isFinalized() ? "" : "background-color: #CCCCCC" %>">
	<td><a href="revision.jsp?pid=<%=revision.getProjectId() %>&amp;rid=<%=revision.getId() %>"><%=revision.getId() %></a></td>
	<td><%=dateFormat.format(revision.getDate()) %></td>
	<td><a href="user.jsp?id=<%=revision.getUserId() %>"><%=revision.getUsername() %></a></td>
	<td><%=revision.getComment() %></td>
	<td><%=revision.isFinalized() ? revision.getSize() : "Processing" %></td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=pid %>"/>
	<input type="hidden" name="rid" value="<%=revision.getId() %>"/>
<%
	if (revision.isFinalized()) {
%>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getMultipleResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.getNiceName() %></option>
<%	
	}
%>
	</select> <label for="revisionzip_<%=revision.getId() %>">Zip</label><input type="checkbox" name="zip" id="revisionzip_<%=revision.getId() %>"/> <input type="submit" value="Download"/>
	</form>
	</td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=pid %>"/>
	<input type="hidden" name="rid" value="<%=revision.getId() %>"/>
	<input type="hidden" name="type" value="checkout"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getMultipleResultTypes()) {
		if (resultType.useInCheckout()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.getNiceName() %></option>
<%
		}
	}
%>
	</select> <label for="checkoutzip_<%=revision.getId() %>">Zip</label><input type="checkbox" name="zip" id="checkoutzip_<%=revision.getId() %>"/> <input type="submit" value="Checkout"/>
	</form>
	</td>
<%
} else {
%>
<td>Press the refresh button on your browser after a while.</td>
<%	
}
%>
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
<a class="rss" href="<%=request.getContextPath() %>/syndication/revisions?pid=<%=pid %>">Revisions feed</a>
</div>
<%
	if (lastRevision != null) {
%>
<div class="tabbertab" title="Query">
Note: Queries will be done on the latest revision (<a href="revision.jsp?pid=<%=pid %>&amp;rid=<%=lastRevision.getId() %>"><%=lastRevision.getId() %></a>), open a specific revision to query other revisions<br/><br/>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=pid %>"/>
<table>
<tr>
	<td width="120">Object ID</td>
	<td width="320"><input type="text" name="oid" id="oid"/></td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getSingleResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.getNiceName() %></option>
<%	
	}
%>
	</select></td><td> <label for="queryoidzip_<%=lastRevision.getId() %>">Zip</label><input type="checkbox" name="zip" id="queryoidzip_<%=lastRevision.getId() %>"/> <input type="submit" value="Query"></td>
</tr>
</table>
</form>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=pid %>"/>
<table>
<tr>
	<td width="120">Globally Unique ID</td>
	<td width="320"><input type="text" name="guid" id="guid"/></td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getSingleResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.getNiceName() %></option>
<%	
	}
%>
	</select></td><td> <label for="queryguidzip_<%=lastRevision.getId() %>">Zip</label><input type="checkbox" name="zip" id="queryguidzip_<%=lastRevision.getId() %>"/> <input type="submit" value="Query"></td>
</tr>
</table>
</form>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=pid %>"/>
<table>
<tr>
	<td width="120">IFC Class</td>
	<td width="320">
		<select name="class" id="cid">
<%
	for (String className : classes) {
%><option value="<%=className%>"><%=className %></option>
<%
	}
%>
		</select>
	</td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getMultipleResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.getNiceName() %></option>
<%	
	}
%>
	</select></td><td> <label for="querycidzip_<%=lastRevision.getId() %>">Zip</label><input type="checkbox" name="zip" id="querycidzip_<%=lastRevision.getId() %>"/> <input type="submit" value="Query"></td>
</tr>
</table>
</form>
</div>
<%
}
%>
<%
	if (checkouts.size() > 0) {
%>
  <div class="tabbertab" title="Checkouts<%=checkouts.size() == 0 ? "" : " (" + checkouts.size() + ")" %>">
<table class="formatted">
<tr>
	<th>Revision Id</th>
	<th>User</th>
	<th>Date</th>
	<th>Active</th>
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
	<td><%=checkout.isActive() %></td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=pid %>"/>
	<input type="hidden" name="rid" value="<%=checkout.getRevisionId() %>"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getMultipleResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.getNiceName() %></option>
<%	
	}
%>
	</select> <label for="checkoutsdownloadzip_<%=checkout.getId() %>">Zip</label><input type="checkbox" name="zip" id="checkoutsdownloadzip_<%=checkout.getId() %>"/> <input type="submit" value="Download"/>
	</form>
	</td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=pid %>"/>
	<input type="hidden" name="rid" value="<%=checkout.getRevisionId() %>"/>
	<input type="hidden" name="type" value="checkout"/>
	<select name="resultType">
<%
	for (ResultType resultType : emfSerializerFactory.getMultipleResultTypes()) {
		if (resultType.useInCheckout()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.getNiceName() %></option>
<%
		}
	}
%>
	</select> <label for="checkoutscheckoutzip_<%=checkout.getId() %>">Zip</label><input type="checkbox" name="zip" id="checkoutscheckoutzip_<%=checkout.getId() %>"/> <input type="submit" value="Checkout"/>
	</form>
	</td>
</tr>
<%
		}
%>
</table>
<a class="rss" href="<%=request.getContextPath() %>/syndication/checkouts?pid=<%=pid %>">Checkouts feed</a>
  </div>
<%
	}
%>
<%
	if (false && lastRevision != null) {
%>
  <div class="tabbertab" id="summary" title="Summary">
  <div id="summaryajaxloader">
	  Retrieving summary... <img src="images/ajax-loader.gif"/>
  </div>
  <a href="#" id="summaryajaxlink">Retrieve</a>
  </div>
<%
}
%>
<%
	if (emfSerializerFactory.resultTypeEnabled(ResultType.O3D_JSON) && lastRevision != null) {
%>
  <div class="tabbertab" title="Visualize">
	<div id="visualizeloader">
		  Retrieving visualization... <img src="images/ajax-loader.gif"/>
  	</div>
  	<div id="visualizediv">
	  	<a href="#" id="visualizelink">Retrieve</a>
  	</div>
	<div id="o3d" style="width: 100%; height: 500px"></div>
	<div style="color: red;" id="loading"></div>
  </div>
<%}%>
<%
if (lastRevision != null) {
%>
<jsp:include page="browser.jsp">
	<jsp:param name="pid" value="<%=pid %>"/>
	<jsp:param name="rid" value="<%=lastRevision.getId()%>"/>
</jsp:include>
<%} %>
  <div class="tabbertab" title="Authorized users<%=users.size() == 0 ? "" : " (" + users.size() + ")" %>">
<% if (nonAuthorizedUsers.size() > 0 && hasUserManagementRights) { %>
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
<input type="hidden" name="pid" value="<%=pid %>"/>
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
	<td><% if (hasUserManagementRights && !user.getUsername().equals("admin")) { %><a href="revokepermission.jsp?type=project&pid=<%=pid %>&amp;uid=<%=user.getId() %>">revoke</a><% } %></td>
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
<script>
	$(document).ready(function(){
		$("#revisiontablink").click(function (){
			document.getElementById("projecttabber").tabber.tabShow(2);	
			return false;
		});
	});
</script>
<script>
	$(document).ready(function(){
		$("#subprojecttablink").click(function (){
			document.getElementById("projecttabber").tabber.tabShow(1);
			return false;
		});
	});
</script>

<%
	if (lastRevision != null) {
%>
<script>
	$(document).ready(function(){
		$("#summaryajaxloader").hide();
		$("#compareajaxloader").hide();
		$("#advanceddownload").hide();
		$("#simpledownloadlink").hide();
		$("#visualizeloader").hide();
		$("#visualizelink").click(function (){
			$("#visualizelink").hide();
			$("#visualizeloader").show();
			init();
		});
		$("#summaryajaxlink").click(function(){
			$("#summaryajaxlink").hide();
			$("#summaryajaxloader").show();
			$("#summary").load("summary.jsp?pid=<%=pid%>&rid=<%=lastRevision.getId()%>");
		});
		$("#compareform").submit(function(){
			$("#compareform").hide();
			$("#compareajaxloader").show();
		});
		$("#advanceddownloadlink").click(function(){
			$("#simpledownload").hide();
			$("#advanceddownloadlink").hide();
			$("#simpledownloadlink").show();
			$("#advanceddownload").show();
		});
		$("#simpledownloadlink").click(function(){
			$("#advanceddownload").hide();
			$("#simpledownloadlink").hide();
			$("#advanceddownloadlink").show();
			$("#simpledownload").show();
		});
		function setOffSupers(pid) {
			var project = projects["project" + pid];
			if (project.superproject != null && project.superproject != "undefined") {
				$("#treeselect" + project.superproject.id).val("Off");
				setOffSupers(project.superproject.id);
			}
		}
		function setOffSubs(pid) {
			var project = projects["project" + pid];
			for (var i in project.subprojects) {
				$("#treeselect" + project.subprojects[i].id).val("Off");
				setOffSubs(project.subprojects[i].id);
			}
		}
		$(".treeselect").change(function(e){
			var idString = e.target.id;
			var id = idString.substring(10);
			if ($("#treeselect" + id).val() != "[off]") {
				var revisionId = e.target.value;
				var project = projects["project" + id];
				setOffSupers(project.id);
				setOffSubs(project.id);
			}
		});
	});
</script>
<%
	}
		} catch (UserException e) {
			if (e.getCause() instanceof OutOfMemoryError) {
				response.sendRedirect(getServletContext().getContextPath());
			} else {
				out.println(e.getUserMessage());
			}
		}
	}
%>
<jsp:include page="footer.jsp" />