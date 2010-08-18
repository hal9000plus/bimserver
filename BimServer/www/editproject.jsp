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
<%@page import="org.bimserver.shared.SGeoTag"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		EmfSerializerFactory emfSerializerFactory = EmfSerializerFactory.getInstance();
		int projectId = Integer.parseInt(request.getParameter("id"));
		boolean anonymousAccess = loginManager.getService().getAllAuthorizedUsers(projectId).getUsers().contains(loginManager.getService().getUserById(2));
		try {
			SProject project = loginManager.getService().getProjectById(projectId);
			SGeoTag geoTag = project.getGeoTag();
			if (geoTag == null) {
				geoTag = new SGeoTag();
			}
			if (request.getParameter("save") != null) {
				if (request.getParameter("coordcheck") != null) {
					geoTag.setX1(Float.parseFloat(request.getParameter("x1")));
					geoTag.setY1(Float.parseFloat(request.getParameter("y1")));
					geoTag.setZ1(Float.parseFloat(request.getParameter("z1")));
					geoTag.setX2(Float.parseFloat(request.getParameter("x2")));
					geoTag.setY2(Float.parseFloat(request.getParameter("y2")));
					geoTag.setZ2(Float.parseFloat(request.getParameter("z2")));
					geoTag.setEpsg(Integer.parseInt(request.getParameter("epsg")));
					loginManager.getService().updateProject(projectId, request.getParameter("description"), geoTag);
				} else {
					loginManager.getService().updateProject(projectId, request.getParameter("description"), null);				
				}
				if (request.getParameter("anonymous") == null) {
					loginManager.getService().removeUserFromProject(2, projectId );
				} else {
					loginManager.getService().addUserToProject(2, projectId );
				}
				response.sendRedirect("project.jsp?id=" + projectId);
			}
%>
<h1>Project details (<%=project.getName() %>)</h1>
<%if (request.getParameter("message") != null) {
	out.println("<div class=\"errormessage\">" + request.getParameter("message") + "</div>");
}
%>
<%= JspHelper.generateBreadCrumbPath(project, loginManager.getService()) %>
<div class="tabber" id="projecttabber">
  <div class="tabbertab" title="Details">
<form method="post" action="editproject.jsp">
<table class="formtable">
<tr><td class="first">Name</td><td><%=project.getName() %></td></tr>
<tr><td class="first">Description</td><td><textarea name="description" cols="80" rows="5"><%=project.getDescription() %></textarea></td></tr>
<tr><td><label for="anonymous" class="checkbox">Anonymous access</label></td><td><input id="anonymous" name="anonymous" type="checkbox" class="checkbox" <%=anonymousAccess ? "checked=\"checked\"" : "" %>/></td></tr>
<tr><td><label for="coordcheck" class="checkbox">Geolocate</label></td><td><input id="coordcheck" name="coordcheck" class="checkbox" type="checkbox" <%=project.getGeoTag() == null ? "" : "checked=\"checked\"" %>/></td></tr>
<tr class="coordcheckrow">
	<td class="first">x1</td>
	<td><input type="text" name="x1" value="<%= geoTag.getX1() %>"/></td>
</tr>
<tr class="coordcheckrow">
	<td class="first">y1</td>
	<td><input type="text" name="y1" value="<%= geoTag.getY1() %>"/></td>
</tr>
<tr class="coordcheckrow">
	<td class="first">z1</td>
	<td><input type="text" name="z1" value="<%= geoTag.getZ1() %>"/></td>
</tr>
<tr class="coordcheckrow">
	<td class="first">x2</td>
	<td><input type="text" name="x2" value="<%= geoTag.getX2() %>"/></td>
</tr>
<tr class="coordcheckrow">
	<td class="first">y2</td>
	<td><input type="text" name="y2" value="<%= geoTag.getY2() %>"/></td>
</tr>
<tr class="coordcheckrow">
	<td class="first">z2</td>
	<td><input type="text" name="z2" value="<%= geoTag.getZ2() %>"/></td>
</tr>
<tr class="coordcheckrow">
	<td class="first">EPSG</td>
	<td><input type="text" name="epsg" value="<%= geoTag.getEpsg() %>"/></td>
</tr>
</table>
<input type="submit" value="Save" name="save"/>
<input type="hidden" name="id" value="<%=request.getParameter("id") %>"/>
</form>
</div>
</div>
<script type="text/javascript">
$(document).ready(function(){
<% if (project.getGeoTag() == null) { %>
	$(".coordcheckrow").hide();
<%}%>
	$("#coordcheck").click(function(){
		if ($("#coordcheck").attr('checked')) {
			$(".coordcheckrow").show();
		} else {
			$(".coordcheckrow").hide();
		}
	});
});
</script>
<%
		} catch (UserException e) {
			out.println(e.getUserMessage());
		}
	}
%>
<jsp:include page="footer.jsp" />