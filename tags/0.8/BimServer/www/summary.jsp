<%@page import="org.bimserver.shared.SRevisionSummary"%>
<%@page import="java.util.Map"%>
<jsp:useBean id="loginManager" scope="session" class="org.bimserver.LoginManager" />
<%
int pid = Integer.parseInt(request.getParameter("pid"));
int rid = Integer.parseInt(request.getParameter("rid"));
SRevisionSummary revisionSummary = loginManager.getService().getRevisionSummary(pid, rid);
%>  
  <table class="formatted">
  	<tr><th>Entity</th><th>Amount</th></tr>
  	<%
  		Map<String, Map<String, Integer>> map = revisionSummary.getMap();
		for (String group : map.keySet()) {
  			%>
				<tr><td colspan="2" class="summarygroup"><%=group %></td></tr>
			<%
			Map<String, Integer> subMap = map.get(group);
	  		for (String className : subMap.keySet()) {
	  			Integer amount = subMap.get(className);
	  			%>
	  				<tr><td><span class="summaryitem"><%=className %></span></td><td><%=amount %></td></tr>
	  			<%
	  		}
  		}
  	%>
  </table>