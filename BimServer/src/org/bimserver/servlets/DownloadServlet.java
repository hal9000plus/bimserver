package org.bimserver.servlets;

/******************************************************************************
 * (c) Copyright bimserver.org 2009
 * Licensed under GNU GPLv3
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * For more information mail to license@bimserver.org
 *
 * Bimserver.org is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bimserver.org is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License a 
 * long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bimserver.LoginManager;
import org.bimserver.emf.EmfSerializer;
import org.bimserver.shared.CheckoutResult;
import org.bimserver.shared.ResultType;
import org.bimserver.shared.UserException;

public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 732025375536415841L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			LoginManager loginManager = (LoginManager)request.getSession().getAttribute("loginManager");
			if (loginManager == null) {
				loginManager = new LoginManager();
			}
			if (!loginManager.isLoggedIn()) {
				loginManager.loginAnonymous();
			}
			int pid = Integer.parseInt(request.getParameter("pid"));
			int rid = -1;
			if (request.getParameter("rid") == null) {
				rid = loginManager.getService().getLastRevision(pid).getId();
			} else {
				rid = Integer.parseInt(request.getParameter("rid"));
			}
			ResultType resultType = ResultType.IFC;
			if (request.getParameter("resultType") != null) {
				resultType = ResultType.valueOf(request.getParameter("resultType"));
			}
			CheckoutResult checkoutResult = null;
			if (request.getParameter("type") != null && request.getParameter("type").equals("checkout")) {
				checkoutResult = loginManager.getService().checkout(pid, rid, resultType);
			} else {
				if (request.getParameter("class") != null) {
					checkoutResult = loginManager.getService().downloadOfType(pid, rid, request.getParameter("class"), resultType);
				} else if (request.getParameter("oid") != null) {
					checkoutResult = loginManager.getService().downloadById(pid, rid, Integer.parseInt(request.getParameter("oid")), resultType);
				} else if (request.getParameter("guid") != null) {
					checkoutResult = loginManager.getService().downloadByGuid(pid, rid, request.getParameter("guid"), resultType);
				} else {
					checkoutResult = loginManager.getService().download(pid, rid, resultType);
				}
			}
			response.setContentType(resultType.getContentType());
			EmfSerializer serializer = (EmfSerializer)checkoutResult.getFile().getDataSource();
			response.setHeader("Content-Disposition", "inline; filename=\"" + checkoutResult.getProjectName() + "." + checkoutResult.getRevisionNr() + "." + resultType.getDefaultExtension() + "\"");
			serializer.write(response.getOutputStream());
		} catch (NumberFormatException e) {
			response.getWriter().println("Some number was incorrectly formatted");
		} catch (UserException e) {
			response.getWriter().println(e.getUserMessage());
		}
	}
}