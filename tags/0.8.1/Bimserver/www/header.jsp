<%@page import="org.bimserver.VersionChecker"%>
<%@page import="org.bimserver.Version"%>
<%@page import="java.net.URLEncoder"%>
<jsp:useBean id="serverInfo" scope="application" class="org.bimserver.ServerInfo" />
<jsp:useBean id="loginManager" scope="session" class="org.bimserver.LoginManager" />
<jsp:useBean id="errorMessages" scope="request" class="org.bimserver.ErrorMessages" />
<jsp:include page="htmlheader.jsp" />
<%
	if (serverInfo.isAvailable()) {
%>
<div class="sitewrapper">
<div class="header">
<a href="main.jsp">
<%
	Version version = VersionChecker.getInstance().getLocalVersion();
%>
<img class="headerimage" src="images/logo.gif" alt="BIM Server" title="BIM Server <%=version.getLatest() %>"/></a>
<%
		if (loginManager.isLoggedIn()) {
	%>
		<div class="menubar">
			<jsp:include page="mainmenu.jsp" />
			 <a class="menu" href="user.jsp?id=<%=loginManager.getService().getLoggedInUser().getId() %>"><%= loginManager.getService().getLoggedInUser().getName() %></a>
			 <a class="endmenu" href="logout.jsp">Logout</a> </div>
			<br/><br/>
			<jsp:include page="extra.jsp" />
		
	<%
		} else {
			if (!request.getServletPath().equals("/login.jsp")) {
				response.sendRedirect(request.getContextPath() + "/login.jsp?origurl=" + URLEncoder.encode(request.getRequestURI() + "?" + request.getQueryString(), "UTF-8"));
			}
		}
	} else {
%>
	<div class="error"><%=serverInfo.getErrorMessage() %></div>
<%
	}
%>
</div>
<div class="main">