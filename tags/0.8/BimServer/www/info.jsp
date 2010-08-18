<%@ include file="header.jsp" %>
<%@page import="java.util.List" %>
<%@page import="org.bimserver.shared.SProject" %>
<%@page import="java.util.Collections"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="org.bimserver.utils.Formatters"%>
<%@page import="org.bimserver.shared.DatabaseInformation"%>
<%@page import="org.bimserver.VersionChecker"%>
<%@page import="java.util.Map"%>
<%@page import="org.bimserver.ServerInitializer"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.bimserver.ServerSettings"%>
<%
	if (loginManager.isLoggedIn() && loginManager.getUserType().equals("ADMIN")) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		DatabaseInformation databaseInformation = loginManager.getService().getDatabaseInformation();
		VersionChecker checkVersion = VersionChecker.getInstance(getServletContext());
		if (ServerSettings.getSettings().isShowVersionUpgradeAvailable() && checkVersion.updateNeeded()) {
%>

<%@page import="org.bimserver.database.Database"%><div class="error">
A newer version of the BIM Server is available online.<br/>
<a href="<%= checkVersion.getOnlineVersion().getSupportUrl() %>">Support</a> | <a href="<%= checkVersion.getOnlineVersion().getDownloadUrl() %>">Download</a><br/>
E-mail <a href="mailto:<%= checkVersion.getOnlineVersion().getSupportEmail() %>"><%= checkVersion.getOnlineVersion().getSupportEmail() %></a> for more info<br/>
</div>
<%
	}
%>
<h1>Info</h1>
<div class="tabber" id="infotabber">
	<%@ include file="extraInfo.jsp" %>
	<div class="tabbertab" title="System">
		<table class="formatted infotable">
			<tr><td colspan="2" class="tabletitle">System</td></tr>
			<tr><td class="firstcolumn">CPU Cores</td><td><%=Runtime.getRuntime().availableProcessors() %></td></tr>
			<tr><td class="firstcolumn">Date/Time</td><td><%=new GregorianCalendar().getTime() %></td></tr>
			<tr><td colspan="2" class="tabletitle">Operating System</td></tr>
			<tr><td class="firstcolumn">OS Name</td><td><%=System.getProperty("os.name") %></td></tr>
			<tr><td class="firstcolumn">OS Version</td><td><%=System.getProperty("os.version") %></td></tr>
			<tr><td colspan="2" class="tabletitle">User</td></tr>
			<tr><td class="firstcolumn">User</td><td><%=System.getProperty("user.name") %></td></tr>
			<tr><td class="firstcolumn">User home</td><td><%=System.getProperty("user.home") %></td></tr>
			<tr><td class="firstcolumn">User dir</td><td><%=System.getProperty("user.dir") %></td></tr>
		</table>
	</div>
	<div class="tabbertab" title="Java">
		<table class="formatted infotable">
			<tr><td colspan="2" class="tabletitle">Memory</td></tr>
			<tr><td class="firstcolumn">Total mem</td><td><%=Formatters.bytesToString(Runtime.getRuntime().totalMemory()) %></td></tr>
			<tr><td class="firstcolumn">Used mem</td><td><%=Formatters.bytesToString(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) %></td></tr>
			<tr><td class="firstcolumn">Free mem</td><td><%=Formatters.bytesToString(Runtime.getRuntime().freeMemory()) %></td></tr>
			<tr><td class="firstcolumn">Max mem</td><td><%=Formatters.bytesToString(Runtime.getRuntime().maxMemory()) %></td></tr>
			<tr><td class="firstcolumn">Threads</td><td><%=Thread.activeCount() %></td></tr>
			<tr><td colspan="2" class="tabletitle">Java</td></tr>
			<tr><td class="firstcolumn">Java Home</td><td><%=System.getProperty("java.home") %></td></tr>
			<tr><td class="firstcolumn">Java Version</td><td><%=System.getProperty("java.version") %></td></tr>
			<tr><td class="firstcolumn">Java Vendor</td><td><%=System.getProperty("java.vendor") %></td></tr>
			<tr><td class="firstcolumn">Java Vendor URL</td><td><%=System.getProperty("java.vendor.url") %></td></tr>
			<tr><td colspan="2" class="tabletitle">Java VM</td></tr>
			<tr><td class="firstcolumn">Java VM version</td><td><%=System.getProperty("java.vm.version") %></td></tr>
			<tr><td class="firstcolumn">Java VM vendor</td><td><%=System.getProperty("java.vm.vendor") %></td></tr>
			<tr><td class="firstcolumn">Java VM name</td><td><%=System.getProperty("java.vm.name") %></td></tr>
			<tr><td colspan="2" class="tabletitle">Java Specification</td></tr>
			<tr><td class="firstcolumn">Java Spec version</td><td><%=System.getProperty("java.specification.version") %></td></tr>
			<tr><td class="firstcolumn">Java Spec vendor</td><td><%=System.getProperty("java.specification.vendor") %></td></tr>
			<tr><td class="firstcolumn">Java Spec name</td><td><%=System.getProperty("java.specification.name") %></td></tr>
			<tr><td colspan="2" class="tabletitle">Java Other</td></tr>
			<tr><td class="firstcolumn">Java Class version</td><td><%=System.getProperty("java.class.version") %></td></tr>
			<tr><td class="firstcolumn">Java Class path</td><td><%=System.getProperty("java.class.path") %></td></tr>
			<tr><td class="firstcolumn">Java Library path</td><td><%=System.getProperty("java.library.path") %></td></tr>
			<tr><td class="firstcolumn">Java IO tempdir</td><td><%=System.getProperty("java.io.tmpdir") %></td></tr>
			<tr><td class="firstcolumn">Java Compiler</td><td><%=System.getProperty("java.compiler") %></td></tr>
			<tr><td class="firstcolumn">Java ext dir</td><td><%=System.getProperty("java.ext.dirs") %></td></tr>
			<tr><td class="firstcolumn">File separator</td><td><%=System.getProperty("file.separator") %></td></tr>
			<tr><td class="firstcolumn">Path separator</td><td><%=System.getProperty("path.separator") %></td></tr>
			<tr><td class="firstcolumn">Line separator</td><td><%=System.getProperty("line.separator") %></td></tr>
		</table>
	</div>
	<div class="tabbertab" title="BIM Server">
		<table class="formatted infotable">
			<tr><td colspan="2" class="tabletitle">Version</td></tr>
			<tr><td class="firstcolumn">Local Version</td><td><%=checkVersion.getLocalVersion().getLatest() %></td></tr>
			<tr><td class="firstcolumn">Latest Version</td><td><%=checkVersion.getOnlineVersion().getLatest() %></td></tr>
			<tr><td class="firstcolumn">Schema Version</td><td><%=Database.APPLICATION_SCHEMA_VERSION %></td></tr>
			<tr><td colspan="2" class="tabletitle">Counts</td></tr>
			<tr><td class="firstcolumn">Projects</td><td><%=databaseInformation.getNumberOfProjects() %></td></tr>
			<tr><td class="firstcolumn">Users</td><td><%=databaseInformation.getNumberOfUsers() %></td></tr>
			<tr><td class="firstcolumn">Revisions</td><td><%=databaseInformation.getNumberOfRevisions() %></td></tr>
			<tr><td class="firstcolumn">Checkouts</td><td><%=databaseInformation.getNumberOfCheckouts() %></td></tr>
			<tr><td colspan="2" class="tabletitle">Other</td></tr>
			<tr><td class="firstcolumn">Server started at</td><td><%=dateFormat.format(ServerInitializer.getServerStartTime().getTime()) %></td></tr>
			<tr><td class="firstcolumn">Uptime</td><td><%=Formatters.millisecondsToString(new GregorianCalendar().getTimeInMillis() - ServerInitializer.getServerStartTime().getTimeInMillis()) %></td></tr>
		</table>
	</div>
	<div class="tabbertab" title="Database">
		<table class="formatted infotable">
			<tr><td colspan="2" class="tabletitle">General Information</td></tr>
			<tr><td class="firstcolumn">Location</td><td><%=databaseInformation.getLocation() %></td></tr>
			<tr><td class="firstcolumn">Type</td><td><%=databaseInformation.getType() %></td></tr>
			<tr><td class="firstcolumn">Size</td><td><%=Formatters.bytesToString(databaseInformation.getDatabaseSizeInBytes()) %></td></tr>
			<tr><td class="firstcolumn">Schema Version</td><td><%=databaseInformation.getSchemaVersion() %></td></tr>
			<%
				Map<String, Map<String, String>> genericLines = databaseInformation.getGenericLines();
				for (String title : genericLines.keySet()) {
					out.println("<tr><td colspan=\"2\" class=\"tabletitle\">" + title + "</td></tr>");
					for (String key : genericLines.get(title).keySet()) {
						out.println("<tr><td class=\"firstcolumn\">" + key + "</td><td>" + genericLines.get(title).get(key) + "</td></tr>");
					}
				}
			%>
		</table>
	</div>
	<div class="tabbertab" title="Web Service">
		<table class="formatted infotable">
			<tr><td colspan="2" class="tabletitle">General Information</td></tr>
			<tr><td class="firstcolumn">WSDL</td><td><a href="services/anonymous?wsdl">WSDL</a></td></tr>
			<tr><td class="firstcolumn">Active tokens</td><td><%=loginManager.getNumberOfTokens() %></td></tr>
		</table>
	</div>
</div>
<% } else {
	out.println("Insufficient rights");
}%>
<%@ include file="footer.jsp" %>