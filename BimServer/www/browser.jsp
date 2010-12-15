<%@page import="org.bimserver.shared.SDataObject.SSimpleDataValue"%>
<%@page import="org.bimserver.shared.SDataObject"%>
<%@page import="org.bimserver.shared.SDataObject.SDataValue"%>
<%@page import="org.bimserver.shared.SDataObject.SReferenceDataValue"%>
<%@page import="org.bimserver.shared.SDataObject.SSimpleDataValue"%>
<%@page import="java.util.List"%>
<%@page import="org.bimserver.shared.SRevisionSummary"%>
<%@page import="org.bimserver.web.JspHelper"%>
<%@page import="org.bimserver.interfaces.objects.SProject"%>
<%@page import="org.bimserver.interfaces.objects.SRevision"%>
<div id="browser">
<jsp:useBean id="loginManager" scope="session" class="org.bimserver.web.LoginManager" />
  	<%
  		long roid = Long.parseLong(request.getParameter("roid"));
  		SRevision revision = loginManager.getService().getRevision(roid);
  		SProject project = loginManager.getService().getProjectByPoid(revision.getProjectId());
  		SDataObject dataObject = null;
  		if (request.getParameter("guid") != null) {
  			String guid = request.getParameter("guid");
	  		dataObject = loginManager.getService().getDataObjectByGuid(roid, guid);
  		} else if (request.getParameter("oid") != null) {
  			long oid = Long.parseLong(request.getParameter("oid"));
  			String className = request.getParameter("className");
	  		dataObject = loginManager.getService().getDataObjectByOid(roid, oid, className);
  		}
  		if (dataObject != null) {
			out.println("<a href=\"#\" class=\"browserlink\" browserUrl=\"" + request.getRequestURI() + "?roid=" + roid + "\">Home</a>");
  			out.println("<h1>" + dataObject.getType() + "</h1>");
  			out.println("<table>");
  			for (SDataValue dataValue : dataObject.getValues()) {
  				String fieldName = dataValue.getFieldName();
  				if (dataValue instanceof SDataObject.SSimpleDataValue) {
  					SSimpleDataValue simpleDataValue = (SSimpleDataValue)dataValue;
	  				out.println("<tr><td>" + fieldName + "</td><td>" + simpleDataValue.getStringValue() +"</td></tr>");
  				} else if (dataValue instanceof SDataObject.SReferenceDataValue) {
  					SDataObject.SReferenceDataValue referenceDataValue = (SDataObject.SReferenceDataValue)dataValue;
  					if (referenceDataValue.getGuid() != null) {
		  				out.println("<tr><td>" + fieldName + "</td><td><a href=\"#\" class=\"browserlink\" browserurl=\"" + request.getRequestURI() + "?roid=" + roid + "&guid=" + referenceDataValue.getGuid() + "\">" + referenceDataValue.getTypeName() +"</a></td></tr>");
  					} else {
		  				out.println("<tr><td>" + fieldName + "</td><td><a href=\"#\" class=\"browserlink\" browserurl=\"" + request.getRequestURI() + "?roid=" + roid + "&oid=" + referenceDataValue.getOid() + "&className=" + referenceDataValue.getTypeName() + "\">" + referenceDataValue.getTypeName() +"</a></td></tr>");
  					}
  				} else if (dataValue instanceof SDataObject.SListDataValue) {
  					SDataObject.SListDataValue listDataValue = (SDataObject.SListDataValue)dataValue;
  					out.println("<tr><td>" + fieldName + "</td><td>");
  					for (SDataObject.SDataValue item : listDataValue.getValues()) {
  						if (item instanceof SDataObject.SReferenceDataValue) {
  							SDataObject.SReferenceDataValue referenceDataValue = (SDataObject.SReferenceDataValue)item;
  							if (referenceDataValue.getGuid() != null) {
				  				out.println("<a href=\"#\" class=\"browserlink\" browserurl=\"" + request.getRequestURI() + "?roid=" + roid + "&guid=" + referenceDataValue.getGuid() + "\">" + referenceDataValue.getTypeName() +"</a> ");
  							} else {
				  				out.println("<a href=\"#\" class=\"browserlink\" browserurl=\"" + request.getRequestURI() + "?roid=" + roid + "&oid=" + referenceDataValue.getOid() + "&className=" + referenceDataValue.getTypeName() + "\">" + referenceDataValue.getTypeName() +"</a> ");
  							}
  						} else if (item instanceof SDataObject.SSimpleDataValue) {
  							SDataObject.SSimpleDataValue simpleDataValue = (SDataObject.SSimpleDataValue)item;
			  				out.println(simpleDataValue.getStringValue() + " ");
  						}
  					}
  					out.println("</td></tr>");
  				}
  			}
  			out.println("</table>");
%>
	<br/>
	<div id="browservisualizeloader">
		  Retrieving visualization... <img src="images/ajax-loader.gif"/>
  	</div>
  	<div id="browservisualizediv" style="background-color:white">
	  	<a href="#" id="browservisualizelink">Load visualization</a>
  	</div>
<%
  		} else if (request.getParameter("className") != null) { 
			String className = request.getParameter("className");
			List<SDataObject> dataObjects = loginManager.getService().getDataObjectsByType(roid, className);
			out.println("<a href=\"#\" class=\"browserlink\" browserUrl=\"" + request.getRequestURI() + "?roid=" + roid + "\">Home</a>");
			out.println("<table class=\"formatted\">");
			out.println("<tr><th>Link</th><th>GUID</th><th>Name</th><th>Type</th><th>Query</th></tr>");
			for (SDataObject object : dataObjects) {
				out.println("<tr><td>");
				if (object.getGuid() != null) {
	  				out.println("<a href=\"#\" class=\"browserlink\" browserurl=\"" + request.getRequestURI() + "?roid=" + roid + "&guid=" + object.getGuid() + "\">link</a> ");
				} else {
	  				out.println("<a href=\"#\" class=\"browserlink\" browserurl=\"" + request.getRequestURI() + "?roid=" + roid + "&oid=" + object.getOid() + "&className=" + object.getType() + "\">link</a> ");
				}
				out.println("</td>");
				String guid = null;
				String name = null;
				for (SDataValue sDataValue : object.getValues()) {
					if (sDataValue instanceof SSimpleDataValue) {
						SSimpleDataValue simpleDataValue = (SSimpleDataValue)sDataValue;
						if (sDataValue.getFieldName().equals("Name")) {
							name = (simpleDataValue.getStringValue() == null ? "" : simpleDataValue.getStringValue());
							out.println("<td>" + name + "</td>");
						} else if (sDataValue.getFieldName().equals("GlobalId")) {
							guid = (simpleDataValue.getStringValue() == null ? "" : simpleDataValue.getStringValue());
							out.println("<td>" + guid + "</td>");
						}
					}
				}
				if (name == null) {
					out.println("<td></td>");
				}
				if (guid == null) {
					out.println("<td></td>");
				}
				out.println("<td>" + object.getType() + "</td>");
				if (guid != null) {
					out.println("<td><a href=\"#\" class=\"guidquerylink\" guid=\"" + guid + "\">query</a></td>");
				} else {
					out.println("<td><a href=\"#\" class=\"oidquerylink\" oid=\"" + object.getOid() + "\">query</a></td>");
				}
				out.println("</tr>");
			}
			out.println("</table>");
  		} else {
  			SRevisionSummary revisionSummary = loginManager.getService().getRevisionSummary(roid);
  			out.print(JspHelper.writeSummaryTable(project, roid, revisionSummary, request));
  		}
  	%>
</div>
<script>
$(document).ready(function(){
	$("#browservisualizeloader").hide();
	$("#browservisualizelink").click(function(){
		$("#browservisualizelink").hide();
		$("#browservisualizeloader").show();
		var o3dId = "o3d" + (o3dcounter++);
		$("<div id='" + o3dId + "' style='width: 500px; height: 300px'></div>").appendTo("#browservisualizediv");
		g_idOfLoader = "browservisualizeloader";
		createClient(document.getElementById(o3dId), function(){
			<%
				if (request.getParameter("guid") != null) {
			%>
			loadFile(o3djs.util.getCurrentURI() + 'download?roid=<%=request.getParameter("roid") %>&guids=<%=request.getParameter("guid")%>&resultType=O3D_JSON', "browservisualizeloader");
			<%					
				} else if (request.getParameter("oid") != null) {
			%>
			loadFile(o3djs.util.getCurrentURI() + 'download?roid=<%=request.getParameter("roid") %>&oids=<%=request.getParameter("oid")%>&resultType=O3D_JSON', "browservisualizeloader");
			<%	
				}
			%>
		});
		return false;
	});
	instrumentBrowserLinks();
});
</script>