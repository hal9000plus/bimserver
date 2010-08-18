<%@page import="org.bimserver.shared.UserException"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		try {
			int pid = Integer.parseInt(request.getParameter("id"));
			if (loginManager.getService().deleteProject(pid)) {
				response.sendRedirect("main.jsp");
			} else {
				out.println("Error");
			}
		} catch (UserException e) {
			out.println("<div class=\"errormessage\">" + e.getUserMessage() + "</div>");
		}
	}
%>
<%@ include file="footer.jsp" %>