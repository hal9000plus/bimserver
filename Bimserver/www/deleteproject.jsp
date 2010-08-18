<%@page import="org.bimserver.shared.UserException"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		try {
			int pid = Integer.parseInt(request.getParameter("pid"));
			if (loginManager.getService().deleteProject(pid)) {
				if (request.getParameter("ppid") != null) {
					response.sendRedirect("project.jsp?pid=" + request.getParameter("ppid"));
				} else {
					response.sendRedirect("main.jsp");
				}
			} else {
				out.println("Error");
			}
		} catch (UserException e) {
			out.println("<div class=\"errormessage\">" + e.getUserMessage() + "</div>");
		}
	}
%>
<%@ include file="footer.jsp" %>