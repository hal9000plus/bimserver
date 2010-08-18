<%@page import="org.bimserver.shared.DataObject"%>
<%@page import="org.bimserver.shared.DataObject.DataValue"%>
<%@page import="org.bimserver.shared.DataObject.ReferenceDataValue"%>
<%@page import="org.bimserver.shared.DataObject.SimpleDataValue"%>
<%@page import="java.util.List"%>
<%@page import="org.bimserver.shared.SRevisionSummary"%>
<%@page import="org.bimserver.JspHelper"%>
<%@page import="org.bimserver.shared.SProject"%>
<%@page import="org.bimserver.shared.SRevision"%>
<jsp:useBean id="loginManager" scope="session" class="org.bimserver.LoginManager" />
<div class="tabbertab" title="Browser">
  	<%
  		int pid = Integer.parseInt(request.getParameter("pid"));
  		int rid = Integer.parseInt(request.getParameter("rid"));
  		SProject project = loginManager.getService().getProjectById(pid);
  		SRevision revision = loginManager.getService().getRevision(pid, rid);
  		DataObject dataObject = null;
  		if (request.getParameter("guid") != null) {
  			String guid = request.getParameter("guid");
	  		dataObject = loginManager.getService().getDataObjectByGuid(pid, rid, guid);
  		} else if (request.getParameter("oid") != null) {
  			long oid = Long.parseLong(request.getParameter("oid"));
  			String className = request.getParameter("className");
	  		dataObject = loginManager.getService().getDataObjectByOid(pid, rid, oid, className);
  		}
  		if (dataObject != null) {
  			out.println("<h1>" + dataObject.getType() + "</h1>");
  			out.println("<table>");
  			for (String fieldName : dataObject.getFields().keySet()) {
  				DataObject.DataValue dataValue = dataObject.getFields().get(fieldName);
  				if (dataValue instanceof DataObject.SimpleDataValue) {
	  				out.println("<tr><td>" + fieldName + "</td><td>" + dataValue.toString() +"</td></tr>");
  				} else if (dataValue instanceof DataObject.ReferenceDataValue) {
  					DataObject.ReferenceDataValue referenceDataValue = (DataObject.ReferenceDataValue)dataValue;
  					if (referenceDataValue.getGuid() != null) {
		  				out.println("<tr><td>" + fieldName + "</td><td><a href=\"" + request.getRequestURI() + "?pid=" + pid + "&rid=" + rid + "&guid=" + referenceDataValue.getGuid() + "\">" + referenceDataValue.getTypeName() +"</a></td></tr>");
  					} else {
		  				out.println("<tr><td>" + fieldName + "</td><td><a href=\"" + request.getRequestURI() + "?pid=" + pid + "&rid=" + rid + "&oid=" + referenceDataValue.getOid() + "&className=" + referenceDataValue.getTypeName() + "\">" + referenceDataValue.getTypeName() +"</a></td></tr>");
  					}
  				} else if (dataValue instanceof DataObject.ListDataValue) {
  					DataObject.ListDataValue listDataValue = (DataObject.ListDataValue)dataValue;
  					out.println("<tr><td>" + fieldName + "</td><td>");
  					for (DataObject.DataValue item : listDataValue.getValues()) {
  						if (item instanceof DataObject.ReferenceDataValue) {
  							DataObject.ReferenceDataValue referenceDataValue = (DataObject.ReferenceDataValue)item;
  							if (referenceDataValue.getGuid() != null) {
				  				out.println("<a href=\"" + request.getRequestURI() + "?pid=" + pid + "&rid=" + rid + "&guid=" + referenceDataValue.getGuid() + "\">" + referenceDataValue.getTypeName() +"</a> ");
  							} else {
				  				out.println("<a href=\"" + request.getRequestURI() + "?pid=" + pid + "&rid=" + rid + "&oid=" + referenceDataValue.getOid() + "&className=" + referenceDataValue.getTypeName() + "\">" + referenceDataValue.getTypeName() +"</a> ");
  							}
  						} else if (item instanceof DataObject.SimpleDataValue) {
  							DataObject.SimpleDataValue simpleDataValue = (DataObject.SimpleDataValue)item;
			  				out.println(simpleDataValue.toString() + " ");
  						}
  					}
  					out.println("</td></tr>");
  				}
  			}
  			out.println("</table>");
  		} else if (request.getParameter("className") != null) { 
			String className = request.getParameter("className");
			List<DataObject> dataObjects = loginManager.getService().getDataObjectsByType(pid, rid, className);
			out.println("<table class=\"formatted\">");
			out.println("<tr><th>Link</th><th>Name</th><th>GUID</th><th>Type</th></tr>");
			for (DataObject object : dataObjects) {
				out.println("<tr><td>");
				if (object.getGuid() != null) {
	  				out.println("<a href=\"" + request.getRequestURI() + "?pid=" + pid + "&rid=" + rid + "&guid=" + object.getGuid() + "\">link</a> ");
				} else {
	  				out.println("<a href=\"" + request.getRequestURI() + "?pid=" + pid + "&rid=" + rid + "&oid=" + object.getOid() + "&className=" + object.getType() + "\">link</a> ");
				}
				out.println("</td>");
				for (String name : object.getFields().keySet()) {
					if (name.equals("Name") || name.equals("GlobalId")) {
						out.println("<td>" + object.getFields().get(name) + "</td>");
					}
				}
				out.println("<td>" + object.getType() + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
  		} else {
  			SRevisionSummary revisionSummary = loginManager.getService().getRevisionSummary(pid, rid);
  			out.print(JspHelper.writeSummaryTable(project, pid, rid, revisionSummary, request));
  		}
  	%>
  </div>