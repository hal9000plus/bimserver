<%@page import="org.bimserver.Version"%>
<%@page import="org.bimserver.VersionChecker"%>
<%@page import="org.bimserver.shared.UserException"%>
<%@page import="org.bimserver.ServerSettings"%>
<%@page import="org.bimserver.utils.Hashers"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.net.URLEncoder"%><jsp:include page="htmlheader.jsp" />
<jsp:useBean id="errorMessages" scope="request" class="org.bimserver.ErrorMessages" />
<jsp:useBean id="loginManager" scope="session" class="org.bimserver.web.LoginManager" />
<jsp:useBean id="serverInfo" scope="application" class="org.bimserver.ServerInfo" />
	<%
	if (serverInfo.isAvailable()) {
		Version version = VersionChecker.getInstance().getLocalVersion();
		boolean redirected = false;
		if (request.getParameter("login") != null) {
			try {
				if (loginManager.getService().login(request.getParameter("username"), request.getParameter("password"))) {
					if (request.getParameter("rememberme") != null) {
						String rememberHash = Hashers.getSha256Hash(request.getParameter("username") + Hashers.getSha256Hash(request.getParameter("password")));
						Cookie autologinCookie = new Cookie("autologin", rememberHash);
						autologinCookie.setMaxAge(2592000); // 30 days
						response.addCookie(autologinCookie);
						Cookie usernameCookie = new Cookie("username", request.getParameter("username"));
						usernameCookie.setMaxAge(2592000); // 30 days
						response.addCookie(usernameCookie);
					}
					if (request.getParameter("origurl") != null && !request.getParameter("origurl").endsWith("?null")) {
						response.sendRedirect(request.getParameter("origurl"));
					} else {
						response.sendRedirect("main.jsp");
					}
					redirected = true;
				} else {
					errorMessages.add("Login unsuccessful");
				}
			} catch (UserException e) {
				errorMessages.add(e.getUserMessage());
			}
		} else {
			Map<String, String> cookies = new HashMap<String, String>();
			if (request.getCookies() != null) {
				for (Cookie cookie : request.getCookies()) {
					cookies.put(cookie.getName(), cookie.getValue());
				}
			}
			if (request.getSession().getAttribute("loggingout") == null && cookies.containsKey("autologin") && cookies.containsKey("username")) {
				if (loginManager.getService().autologin(cookies.get("username"), cookies.get("autologin"))) {
					if (!loginManager.getService().isLoggedIn()) {
						response.sendRedirect(request.getContextPath() + "/login.jsp?origurl=" + URLEncoder.encode(request.getRequestURI() + "?" + request.getQueryString(), "UTF-8"));
					} else {
						response.sendRedirect(request.getContextPath() + "/main.jsp");
					}
					redirected = true;
				}
			}
		}
		if (!redirected) {
%>
<div class="loginwrapper">
<div class="header">
<a href="main.jsp"><img src="images/fulllogo.gif" title="BIMserver <%=version.getVersion() %>"/></a>
</div>
<br/>
<jsp:include page="loginExtra.jsp" />
<div>
<div class="loginwindow">
<% errorMessages.print(out); %>
<form id="loginForm" name="loginForm" method="post" action="login.jsp">
<table class="formtable">
<tr><td class="first"><label for="username">Username (e-mail)</label></td><td><input id="username" type="text" name="username" id="username" <%=request.getParameter("username") != null ? " value=\"" + request.getParameter("username") + "\"" : "" %> /></td></tr>
<tr><td class="first"><label for="password">Password</label></td><td><input id="password" type="password" name="password"/></td></tr>
<tr><td class="first"><label for="rememberme">Remember me</label></td><td><input id="rememberme" type="checkbox" name="rememberme"/></td></tr>
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
<%
if (ServerSettings.getSettings().isAllowSelfRegistration()) {
%>
<a href="register.jsp">Register here</a>
<%
}
%>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="resetpassword.jsp">Forgot your password?</a>
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
		}
} else {
%>
	<div class="error"><%=serverInfo.getErrorMessage() %></div>
<%
}
%>
<jsp:include page="footer.jsp" />