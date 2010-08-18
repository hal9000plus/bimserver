<%@page import="org.bimserver.shared.SRevisionSummary"%>
<%@page import="java.util.Map"%>
<%@page import="org.bimserver.shared.SProject"%>
<%@page import="org.bimserver.JspHelper"%>
<jsp:useBean id="loginManager" scope="session" class="org.bimserver.LoginManager" />
<%
int pid = Integer.parseInt(request.getParameter("pid"));
SProject project = loginManager.getService().getProjectById(pid);
int rid = Integer.parseInt(request.getParameter("rid"));
SRevisionSummary revisionSummary = loginManager.getService().getRevisionSummary(pid, rid);
%>
  <a href="#" id="emaillink">E-mail summary</a>
  <div id="emailform">
	<div id="emailajaxloader">
	E-mailing revision summary... <img src="images/ajax-loader.gif"/>
	</div>
  	<form method="post" action="sendsummaryemail.jsp" id="emailsummaryform">
  		Send summary to <input type="text" id="address" name="address"/>
  		<input type="hidden" name="pid" value="<%=pid %>"/>
  		<input type="hidden" name="rid" value="<%=rid %>"/>
  		<input type="submit" name="email" value="Send"/>
  	</form>
  </div>
  <br/>
<%= JspHelper.writeSummaryTable(project, pid, rid, revisionSummary, request) %>
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
	$("#emailsummaryform").submit(function(){
		$("#emailsummaryform").hide();
		$("#emailajaxloader").show();
		$("#emailform").load("sendsummaryemail.jsp?pid=<%=pid%>&rid=<%=rid%>&address=" + $("#address").val());
		return false;
	});
</script>