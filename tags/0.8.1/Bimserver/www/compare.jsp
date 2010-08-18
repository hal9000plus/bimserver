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
<%@page import="org.bimserver.JspHelper"%>
<%@page import="org.bimserver.shared.SCompareResult"%>
<%@ include file="header.jsp" %>
<%
	if (request.getParameter("compare") != null) {
		int rid1 = Integer.parseInt(request.getParameter("rid1"));
		int rid2 = Integer.parseInt(request.getParameter("rid2"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		SProject project = loginManager.getService().getProjectById(pid);
		SRevision revision1 = loginManager.getService().getRevision(pid, rid1);
		SRevision revision2 = loginManager.getService().getRevision(pid, rid2);
		SCompareResult compareResult = loginManager.getService().compare(pid, rid1, rid2);
%>
Back to <a href="project.jsp?pid=<%=pid %>">project '<%= project.getName() %>'</a><br/><br/>
  <a href="#" id="emaillink">E-mail summary</a>
  <div id="emailform">
	<div id="emailajaxloader">
	E-mailing compare results... <img src="images/ajax-loader.gif"/>
	</div>
  	<form method="post" action="sendcompareemail.jsp" id="emailcompareform">
  		Send summary to <input type="text" id="address" name="address"/>
  		<input type="hidden" name="pid" value="<%=pid %>"/>
  		<input type="hidden" name="rid1" value="<%=rid1 %>"/>
  		<input type="hidden" name="rid2" value="<%=rid2 %>"/>
  		<input type="submit" name="email" value="Send"/>
  	</form>
  </div>
<%= JspHelper.writeCompareResult(compareResult, rid1, rid2, project) %>
<script>
	$(document).ready(function(){
		$("#emailform").hide();
		$("#emailajaxloader").hide();
	});
	$("#emaillink").click(function(){
		$("#emaillink").hide();
		$("#emailform").show();
		$("#address").focus();
	});
	$("#emailcompareform").submit(function(){
		$("#emailcompareform").hide();
		$("#emailajaxloader").show();
		$("#emailform").load("sendcompareemail.jsp?pid=<%=pid%>&rid1=<%=rid1%>&rid2=<%=rid2%>&address=" + $("#address").val());
		return false;
	});
</script>
<%}%>