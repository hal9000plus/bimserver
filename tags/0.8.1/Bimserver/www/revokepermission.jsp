<%@page import="org.bimserver.shared.UserException"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		try {
			int pid = Integer.parseInt(request.getParameter("pid"));
			int uid = Integer.parseInt(request.getParameter("uid"));
			loginManager.getService().removeUserFromProject(uid, pid);
			if (request.getParameter("type").equals("project")) {
				response.sendRedirect("project.jsp?pid=" + pid);
			} else if (request.getParameter("type").equals("user")) {
				response.sendRedirect("user.jsp?id=" + uid);
			}
		} catch (UserException e) {
			out.println("<div class=\"errormessage\">" + e.getUserMessage() + "</div>");
		}
	}
%>