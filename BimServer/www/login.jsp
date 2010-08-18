<%@page import="org.bimserver.Version"%>
<%@page import="org.bimserver.VersionChecker"%>
<%@page import="org.bimserver.shared.UserException"%>
<jsp:include page="htmlheader.jsp" />
<jsp:useBean id="errorMessages" scope="request" class="org.bimserver.ErrorMessages" />
<jsp:useBean id="loginManager" scope="session" class="org.bimserver.LoginManager" />
<jsp:useBean id="serverInfo" scope="application" class="org.bimserver.ServerInfo" />
	<%
	if (serverInfo.isAvailable()) {
		Version version = VersionChecker.getInstance(getServletContext()).getLocalVersion();
		if (request.getParameter("login") != null) {
			try {
				if (loginManager.login(request.getParameter("username"), request.getParameter("password"))) {
					if (request.getParameter("origurl") != null && !request.getParameter("origurl").endsWith("?null")) {
						response.sendRedirect(request.getParameter("origurl"));
					} else {
						response.sendRedirect("main.jsp");
					}
				} else {
					errorMessages.add("Login unsuccesfull");
				}
			} catch (UserException e) {
				errorMessages.add(e.getUserMessage());
			}
		}
%>
<div class="loginwrapper">
<jsp:include page="loginExtra.jsp" />
<div class="header">
<a href="main.jsp"><img class="headerimage" src="images/fulllogo.gif" title="BIM Server <%=version.getLatest() %>"/></a>
</div>
<div class="main">
<div class="loginwindow">
<% errorMessages.print(out); %>
<form id="loginForm" name="loginForm" method="post" action="login.jsp">
<table class="formtable">
<tr><td class="first">Username</td><td><input type="text" name="username" id="username" <%=request.getParameter("username") != null ? " value=\"" + request.getParameter("username") + "\"" : "" %> /></td></tr>
<tr><td class="first">Password</td><td><input type="password" name="password"/></td></tr>
<tr><td></td><td align="right"><input name="login" type="submit" value="Login"/></td></tr>
</table>
<%
	if (request.getParameter("origurl") != null) {
%>
<input type="hidden" name="origurl" value="<%=request.getParameter("origurl") %>"/>
<%
	}
%>
</form>
<a href="register.jsp">Register here</a>
</div>
<script type="text/javascript">
<%
	if (request.getParameter("username") != null && !request.getParameter("username").equals("")) {
		out.println("document.loginForm.password.focus();");		
	} else {
		out.println("document.loginForm.username.focus();");		
	}
%>
</script>
<%
} else {
%>
	<div class="error"><%=serverInfo.getErrorMessage() %></div>
<%
}
%>
<jsp:include page="footer.jsp" />