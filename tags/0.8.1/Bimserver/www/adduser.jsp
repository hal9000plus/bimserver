<%@page import="java.util.List" %>
<%@page import="org.bimserver.shared.SProject" %>
<%@page import="java.text.DateFormat" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="org.bimserver.shared.UserException"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		if (request.getParameter("save") != null) {
			try {
				int userId = loginManager.getService().addUser(request.getParameter("username"), request.getParameter("password"), request.getParameter("name"));
				response.sendRedirect("user.jsp?id=" + userId);
			} catch (UserException e) {
				out.println("<div class=\"errormessage\">" + e.getUserMessage() + "</div>");
			}
		}
%>
<h1>Add user</h1>
<fieldset>
<form name="form" method="post" action="adduser.jsp">
<table>
<tr><td>Name</td><td><input type="text" name="name" autocomplete="off" value="<%=request.getParameter("name") != null ? request.getParameter("name") : "" %>"/></td></tr>
<tr><td>Username (E-mail address)</td><td><input type="text" name="username" autocomplete="off" value="<%=request.getParameter("username") != null ? request.getParameter("username") : "" %>"/></td></tr>
<tr><td>Password</td><td><input type="password" name="password" autocomplete="off"/></td></tr>
</table>
<input type="submit" value="Save" name="save"/>
</form>
<script type="text/javascript">
document.form.name.focus();
</script>
<% } %>
</fieldset>
<%@ include file="footer.jsp" %>