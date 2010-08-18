<%@page import="java.util.List" %>
<%@page import="org.bimserver.shared.SProject" %>
<%@page import="org.bimserver.shared.SCheckout" %>
<%@page import="org.bimserver.shared.SRevision" %>
<%@page import="java.text.DateFormat" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.util.Collections"%>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="org.bimserver.shared.UserException"%>
<%@page import="org.bimserver.shared.ResultType"%>
<%@page import="org.bimserver.EmfSerializerFactory"%>
<%@page import="org.bimserver.JspHelper"%>
<%@ include file="header.jsp" %>
<%
	if (loginManager.isLoggedIn()) {
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
			int pid = Integer.parseInt(request.getParameter("pid"));
			int rid = Integer.parseInt(request.getParameter("rid"));
			SRevision revision = loginManager.getService().getRevision(pid, rid);
			List<SCheckout> checkouts = loginManager.getService().getAllCheckoutsOfRevision(pid, rid).getCheckouts();
			Collections.sort(checkouts);
			List<String> classes = loginManager.getService().getAvailableClasses().getClassNames();
			Collections.sort(classes);
%>
<h1>Revision details (Project: <%= revision.getProjectName()%>, Revision: <%=revision.getId() %>)</h1>
<div id="guide">
 <div id="guidewrap">
  <ol id="breadcrumb">
        <li id="bc-home">
            <a  href="main.jsp" id="usernav-home" class="home">Home</a>
        </li>
            <li>
                <%=JspHelper.generateBreadCrumbPath(revision, loginManager.getService()) %>
            </li>
    </ol>
 </div>
</div>
<div id="guide_wrap_btm"> </div>

<div class="tabber" id="revisiontabber">
  <div class="tabbertab" title="Details">
  <table class="formtable">
<tr><td class="first">Id</td><td><%= revision.getId() %></td></tr>
<tr><td class="first">Project</td><td><a href="project.jsp?id=<%=revision.getProjectId() %>"><%= revision.getProjectName() %></a></td></tr>
<tr><td class="first">User</td><td><a href="user.jsp?id=<%=revision.getUserId() %>"><%= revision.getUsername() %></a></td></tr>
<tr><td class="first">Date</td><td><%= dateFormat.format(revision.getDate()) %></td></tr>
<tr><td class="first">Comment</td><td><%= revision.getComment() %></td></tr>
<tr><td class="first">Size</td><td><%= revision.getSize() %></td></tr>
</table><br/>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=pid %>"/>
<input type="hidden" name="rid" value="<%=rid %>"/>
<table><tr><td width="100">Download:</td>
<td><select name="resultType">
<%
	for (ResultType resultType : EmfSerializerFactory.getInstance().getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select><input type="submit" value="Download"></td>
</table>
</form>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=pid %>"/>
<input type="hidden" name="rid" value="<%=rid %>"/>
<table><tr><td width="100">Checkout:</td>
<td><select name="resultType">
<%
	for (ResultType resultType : EmfSerializerFactory.getInstance().getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select><input type="submit" value="Checkout">
</table>
</form>
</div>
<div class="tabbertab" title="Query">
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=pid %>"/>
<input type="hidden" name="rid" value="<%=rid %>"/>
<table>
<tr>
	<td width="120">Object ID</td>
	<td width="320"><input type="text" name="oid" id="oid" onkeyup="update()"/></td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : EmfSerializerFactory.getInstance().getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select></td><td><input type="submit" value="Query"></td>
</tr>
</table>
</form>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=pid %>"/>
<input type="hidden" name="rid" value="<%=rid %>"/>
<table>
<tr>
	<td width="120">Globally Unique ID</td>
	<td width="320"><input type="text" name="guid" id="guid" onkeyup="update()"/></td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : EmfSerializerFactory.getInstance().getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select></td><td><input type="submit" value="Query"></td>
</tr>
</table>
</form>
<form action="<%=request.getContextPath() %>/download" method="post">
<input type="hidden" name="pid" value="<%=pid %>"/>
<input type="hidden" name="rid" value="<%=rid %>"/>
<table>
<tr>
	<td width="120">IFC Class</td>
	<td width="320">
		<select name="class" id="cid" onchange="update()">
<%
	for (String className : classes) {
%>
<option value="<%=className%>"><%=className %></option>
<%
	}
%>
		</select>
	</td>
	<td>Type</td><td><select name="resultType">
<%
	for (ResultType resultType : EmfSerializerFactory.getInstance().getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%= resultType.name() %></option>
<%	
	}
%>
	</select></td><td><input type="submit" value="Query"></td>
</tr>
</table>
</form>
<a class="link" href="get/pid=<%=pid %>/rid=<%=rid%>">IFC-Link</a>
  </div>
  <div class="tabbertab" id="summary" title="Summary">
  <img id="ajaxloader" src="images/ajax-loader.gif"/>
  <a href="#" id="summarylink">Retrieve</a>
  </div>
  <div class="tabbertab" title="Checkouts<%=checkouts.size() == 0 ? "" : " (" + checkouts.size() + ")"%>">
<%
if (checkouts.size() > 0) {
%>
<table class="formatted">
<tr>
	<th>User</th>
	<th>Date</th>
	<th>Download</th>
	<th>Checkout</th>
</tr>
<%
	for (SCheckout checkout : checkouts) {
%>
<tr>
	<td><a href="user.jsp?id=<%=checkout.getUserId() %>"><%=checkout.getUsername() %></a></td>
	<td><%=dateFormat.format(checkout.getDate()) %></td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=pid %>"/>
	<input type="hidden" name="rid" value="<%=checkout.getRevisionId() %>"/>
	<select name="resultType">
<%
	for (ResultType resultType : EmfSerializerFactory.getInstance().getResultTypes()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.name() %></option>
<%	
	}
%>
	</select><input type="submit" value="Download"/>
	</form>
	</td>
	<td>
	<form method="post" action="<%=request.getContextPath() %>/download">
	<input type="hidden" name="pid" value="<%=pid %>"/>
	<input type="hidden" name="rid" value="<%=checkout.getRevisionId() %>"/>
	<input type="hidden" name="type" value="checkout"/>
	<select name="resultType">
<%
	for (ResultType resultType : EmfSerializerFactory.getInstance().getResultTypes()) {
		if (resultType.useInCheckout()) {
%>
	<option value="<%=resultType.name() %>"><%=resultType.name() %></option>
<%
		}
	}
%>
	</select><input type="submit" value="Checkout"/>
	</form>
	</td>
</tr>
<%
	}
%>
</table>
<%
} else {
%>
<div class="none">None</div>
<%
}
%>
</div>
</div>
<script>
	$(document).ready(function(){
		$("#ajaxloader").hide();
	});
	$("#summarylink").click(function(){
		$("#summarylink").hide();
		$("#ajaxloader").show();
		$("#summary").load("summary.jsp?pid=<%=pid%>&rid=<%=rid%>");
	});
</script>
<%
} catch (UserException e) {
	out.println(e.getUserMessage());	
}
}
%>
<%@ include file="footer.jsp" %>