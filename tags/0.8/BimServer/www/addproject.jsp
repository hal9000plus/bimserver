<%@page import="java.util.List" %>
<%@page import="org.bimserver.shared.SProject" %>
<%@page import="org.bimserver.shared.SGeoTag" %>
<%@page import="java.text.DateFormat" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="org.bimserver.shared.UserException"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		if (request.getParameter("save") != null) {
			try {
				SGeoTag geoTag = null;
				if (request.getParameter("coordcheck") != null) {
					geoTag = new SGeoTag();
					geoTag.setX1(Float.parseFloat(request.getParameter("x1")));
					geoTag.setY1(Float.parseFloat(request.getParameter("y1")));
					geoTag.setZ1(Float.parseFloat(request.getParameter("z1")));
					geoTag.setX2(Float.parseFloat(request.getParameter("x2")));
					geoTag.setY2(Float.parseFloat(request.getParameter("y2")));
					geoTag.setZ2(Float.parseFloat(request.getParameter("z2")));
					geoTag.setEpsg(Integer.parseInt(request.getParameter("epsg")));
				}
				int projectId = -1;
				if (request.getParameter("parentid") != null) {
					projectId = loginManager.getService().addProject(request.getParameter("name"), Integer.parseInt(request.getParameter("parentid")), geoTag);
				} else {
					projectId = loginManager.getService().addProject(request.getParameter("name"), geoTag);
				}
				if (request.getParameter("anonymous") != null) {
					loginManager.getService().addUserToProject(2, projectId);
				}
				if (request.getParameter("parentid") != null) {
					response.sendRedirect("project.jsp?id=" + request.getParameter("parentid"));
				} else {
					response.sendRedirect("project.jsp?id=" + projectId);
				}
			} catch (NumberFormatException e) {
				out.println("<div class=\"errormessage\">" + e.getMessage() + "</div>");
			} catch (UserException e) {
				out.println("<div class=\"errormessage\">" + e.getUserMessage() + "</div>");
			}
		}
%>
<%@page import="org.bimserver.database.store.GeoTag"%><h1>Add project</h1>
<fieldset>
<form name="form" method="post" action="addproject.jsp">
<table class="formtable">
<tr>
	<td class="first">Name</td>
	<td><input type="text" name="name" value="<%= request.getParameter("name") != null ? request.getParameter("name") : "" %>"/></td>
</tr>
</table>
<% if (request.getParameter("parentid") == null) { %>
<label for="anonymous" class="checkbox">Anonymous access</label><input id="anonymous" name="anonymous" type="checkbox" class="checkbox" <%=request.getParameter("anonymous") == null ? "" : "checked=\"checked\"" %>/><br/><br/>
<label for="coordcheck" class="checkbox">Geolocate</label><input id="coordcheck" name="coordcheck" type="checkbox" class="checkbox" <%=request.getParameter("coordcheck") == null ? "" : "checked=\"checked\"" %>/><br/><br/>
<table class="formtable" id="coordchecktable">
<tr>
	<td class="first">x1</td>
	<td><input type="text" name="x1" value="<%= request.getParameter("x1") != null ? request.getParameter("x1") : "" %>"/></td>
</tr>
<tr>
	<td class="first">y1</td>
	<td><input type="text" name="y1" value="<%= request.getParameter("y1") != null ? request.getParameter("y1") : "" %>"/></td>
</tr>
<tr>
	<td class="first">z1</td>
	<td><input type="text" name="z1" value="<%= request.getParameter("z1") != null ? request.getParameter("z1") : "" %>"/></td>
</tr>
<tr>
	<td class="first">x2</td>
	<td><input type="text" name="x2" value="<%= request.getParameter("x2") != null ? request.getParameter("x2") : "" %>"/></td>
</tr>
<tr>
	<td class="first">y2</td>
	<td><input type="text" name="y2" value="<%= request.getParameter("y2") != null ? request.getParameter("y2") : "" %>"/></td>
</tr>
<tr>
	<td class="first">z2</td>
	<td><input type="text" name="z2" value="<%= request.getParameter("z2") != null ? request.getParameter("z2") : "" %>"/></td>
</tr>
<tr>
	<td class="first">EPSG</td>
	<td><input type="text" name="epsg" value="<%= request.getParameter("epsg") != null ? request.getParameter("epsg") : "4326" %>"/></td>
</tr>
</table>
<% } %>
<input type="submit" value="Save" name="save"/>
<%
	if (request.getParameter("parentid") != null) {
%>
<input type="hidden" name="parentid" value="<%=request.getParameter("parentid") %>"/>
<%
	}
%>
</form>
<script type="text/javascript">
$(document).ready(function(){
	document.form.name.focus();
<% if (request.getParameter("coordcheck") == null) { %>
	$("#coordchecktable").hide();
<%}%>
	$("#coordcheck").click(function(){
		if ($("#coordcheck").attr('checked')) {
			$("#coordchecktable").show();
		} else {
			$("#coordchecktable").hide();
		}
	});
});
</script>
<% } %>
</fieldset>
<%@ include file="footer.jsp" %>