
<%@page import="org.bimserver.database.store.UserType"%><jsp:useBean id="loginManager" scope="session" class="org.bimserver.LoginManager" />
<a class="menu" href="main.jsp">Projects</a>
<%
	if (loginManager.getUserType().equals("ADMIN")) {
%>
<a class="menu" href="users.jsp">Users</a><a class="menu" href="info.jsp">Info</a>
<%	
	}
%>