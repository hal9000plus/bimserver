<jsp:useBean id="loginManager" scope="session" class="org.bimserver.LoginManager" />
<%
	loginManager.logout();
	response.sendRedirect("login.jsp");
%>