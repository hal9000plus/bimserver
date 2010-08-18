<%@page import="java.util.List" %>
<%@page import="java.text.DateFormat" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="org.bimserver.shared.UserException"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		int uid = Integer.parseInt(request.getParameter("uid"));
		if (request.getParameter("save") != null) {
			try {
				String oldPassword = request.getParameter("oldpassword");
				String newPassword1 = request.getParameter("newpassword1");
				String newPassword2 = request.getParameter("newpassword2");
				String errorMessage = "";
				if (!newPassword1.equals(newPassword2)) {
					out.println("<div class=\"errormessage\">Password and password check did not match</div>");
				} else {
					loginManager.getService().changePassword(uid, oldPassword, newPassword1);
					response.sendRedirect("user.jsp?id=" + uid + "&mid=" + Message.PASSWORD_SUCCESFULLY_CHANGED.ordinal());
				}
			} catch (UserException e) {
				out.println("<div class=\"errormessage\">" + e.getUserMessage() + "</div>");
			}
		}
%>

<%@page import="org.bimserver.Message"%><h1>Change password</h1>
<fieldset>
<form name="form" method="post" action="changepassword.jsp">
<input type="hidden" name="uid" value="<%=request.getParameter("uid")%>">
<table class="formtable">
<%
	if (!loginManager.getUserType().equals("ADMIN") || loginManager.getUid() == uid) {
%>
<tr><td class="first">Old password</td><td><input type="password" name="oldpassword" /></td></tr>
<%		
	}
%>
<tr><td class="first">New password</td><td><input type="password" name="newpassword1" /></td></tr>
<tr><td class="first">New password (check)</td><td><input type="password" name="newpassword2" /></td></tr>
<tr><td class="first"></td><td align="right"><input type="submit" value="Change" name="save"/></td></tr>
</table>
</form>
<script type="text/javascript">
if (document.form.oldpassword) {
	document.form.oldpassword.focus();
} else {
	document.form.newpassword1.focus();
}
</script>
<% } %>
</fieldset>
<%@ include file="footer.jsp" %>