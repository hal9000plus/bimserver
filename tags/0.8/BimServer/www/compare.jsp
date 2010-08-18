<%@page import="org.bimserver.ifc.file.compare.CompareResult.Type"%>
<%@page import="org.bimserver.ifc.emf.Ifc2x3.IfcRoot"%>
<%@page import="org.bimserver.ifc.file.compare.CompareResult.Item"%>
<%@page import="java.util.List"%>
<%@page import="org.eclipse.emf.ecore.EClass"%>
<%@page import="java.util.Map"%>
<%@page import="java.io.PrintStream"%>
<%@page import="org.bimserver.ifc.file.compare.CompareResult"%>
<%@page import="org.bimserver.shared.SRevision"%>
<%@page import="org.bimserver.shared.SProject"%>
<%@ include file="header.jsp" %>
<%
	if (request.getParameter("compare") != null) {
		int rid1 = Integer.parseInt(request.getParameter("rid1"));
		int rid2 = Integer.parseInt(request.getParameter("rid2"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		SProject project = loginManager.getService().getProjectById(pid);
		SRevision revision1 = loginManager.getService().getRevision(pid, rid1);
		SRevision revision2 = loginManager.getService().getRevision(pid, rid2);
		CompareResult compareResult = loginManager.getService().compare(pid, rid1, rid2);
		Map<EClass, List<CompareResult.Item>> items = compareResult.getItems();
%>
Back to <a href="project.jsp?id=<%=pid %>">project '<%= project.getName() %>'</a><br/><br/>
<h1>Building Model Comparator</h1>
Compare results for revisions '<%=rid1 %>' and '<%=rid2 %>' of project '<%=project.getName() %>'<br/>
Total number of differences: <%=compareResult.size() %><br/> 
<table class="formatted">
	<tr>
		<th>Type</th>
		<th>Guid</th>
		<th>Name</th>
		<th>Difference</th>
	</tr>
<%
		for (EClass eClass : items.keySet()) {
			for (Item item : items.get(eClass)) {
				String name = "";
				String guid = "";
				if (item.eObject instanceof IfcRoot) {
					IfcRoot ifcRoot = (IfcRoot) item.eObject;
					if (ifcRoot.getName() != null) {
						name = ifcRoot.getName().getWrappedValue();
					}
					if (ifcRoot.getGlobalId() != null) {
						guid = ifcRoot.getGlobalId().getWrappedValue();
					}
				}
				out.append("<tr>");
				if (item.type == CompareResult.Type.ADDED) {
					out.append("<td>" + item.eObject.eClass().getName() + "</td>");
					out.append("<td>" + guid + "</td>");
					out.append("<td>" + name + "</td>");
					out.append("<td>Added</td>");
				} else if (item.type == Type.DELETED) {
					out.append("<td>" + item.eObject.eClass().getName() + "</td>");
					out.append("<td>" + guid + "</td>");
					out.append("<td>" + name + "</td>");
					out.append("<td>Deleted</td>");
				}
				out.append("</tr>");
			}
		}
	}
%>
</table>