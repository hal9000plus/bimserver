<%@page import="java.util.List" %>
<%@page import="org.bimserver.shared.SUser" %>
<%@page import="java.util.Collections"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="header.jsp" %>
<h1>Users</h1>
<% if (loginManager.isLoggedIn() && loginManager.getUserType().equals("ADMIN")) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
%>
<fieldset>
<a href="adduser.jsp">Add user</a><br/><br/>
<table class="formatted">
<tr>
	<th>Name</th>
	<th>Username</th>
	<th>Created on</th>
	<th>Last seen</th>
	<th>Actions</th>
</tr>
<%
	List<SUser> users = loginManager.getService().getAllUsers().getUsers();
	Collections.sort(users, new SUser.UserComparator());
	for (SUser user : users) {
%>
<tr<%= user.getState().equals("DELETED") ? " class=\"deleted\"" : "" %>>
	<td><a href="user.jsp?id=<%=user.getId() %>"><%=user.getName() %></a></td>
	<td><a href="user.jsp?id=<%=user.getId() %>"><%=user.getUsername() %></a></td>
	<td><%=dateFormat.format(user.getCreatedOn()) %></td>
	<td><%=dateFormat.format(user.getLastSeen()) %></td>
	<td>
<%
	if (!user.isAdmin() && !user.isAnonymous()) {
		if (user.getState().equals("ACTIVE")) {
			%>
			<a href="deleteuser.jsp?id=<%=user.getId() %>">delete</a>
			<%
		} else if (user.getState().equals("DELETED")) {
			%>
			<a href="undeleteuser.jsp?id=<%=user.getId() %>">undelete</a>
			<%	
		}
	}
%>
	</td>
</tr>
<%
	}
%>
</table>
<% } else {
	out.println("Insufficient rights");
}
%>
</fieldset>
<%@ include file="footer.jsp" %>