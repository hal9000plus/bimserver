package org.bimserver.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bimserver.interfaces.objects.SProject;
import org.bimserver.interfaces.objects.SRevision;
import org.bimserver.shared.ServiceException;
import org.bimserver.shared.UserException;
import org.bimserver.web.LoginManager;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProgressServlet extends HttpServlet {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProgressServlet.class);
	private static final long serialVersionUID = -1957923502114983147L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("application/json");
			LoginManager loginManager = (LoginManager) request.getSession().getAttribute("loginManager");
			JSONObject result = new JSONObject();
			JSONArray revisions = new JSONArray();
			if (loginManager != null) {
				long poid = Long.parseLong(request.getParameter("poid"));
				SProject project = loginManager.getService().getProjectByPoid(poid);
				if (project != null) {
					for (long roid : project.getRevisions()) {
						try {
							SRevision revision = loginManager.getService().getRevision(roid);
							JSONObject object = new JSONObject();
							object.put("roid", roid);
							object.put("state", revision.getState());
							object.put("totalsize", revision.getSize());
							object.put("lastError", revision.getLastError());
							object.put("clashes", revision.getNrClashes());
							object.put("islast", (loginManager.getService().getProjectByPoid(revision.getProjectId()).getLastRevisionId() == revision.getOid()));
							revisions.put(object);
						} catch (UserException e) {
							// This is probably a browser trying to load stuff that is not there anymore
						}
					}
					result.put("lastRevision", project.getLastRevisionId());
				}
				result.put("revisions", revisions);
			} else {
				revisions.put("error");
			}
			result.write(response.getWriter());
		} catch (NumberFormatException e) {
			LOGGER.error("", e);
		} catch (JSONException e) {
			LOGGER.error("", e);
		} catch (ServiceException e) {
			LOGGER.error("", e);
		}
	}
}