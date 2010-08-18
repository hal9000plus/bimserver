package org.bimserver.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bimserver.SRevisionIdComparator;
import org.bimserver.shared.AuthenticatedServiceWrapper;
import org.bimserver.shared.SCheckoutList;
import org.bimserver.shared.ProjectList;
import org.bimserver.shared.SCheckout;
import org.bimserver.shared.SProject;
import org.bimserver.shared.SRevision;
import org.bimserver.shared.SRevisionList;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.shared.UserException;

import com.sun.syndication.feed.synd.SyndContent;
import com.sun.syndication.feed.synd.SyndContentImpl;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndFeedImpl;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedOutput;

public class SyndicationServlet extends HttpServlet {
	private static final long serialVersionUID = -8204995157688379164L;
	private static final String FEED_TYPE = "atom_1.0";

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		response.setContentType("application/atom+xml");
		try {
			if (requestURI.endsWith("/projects")) {
				writeProjectsFeed(request, response);
			} else if (requestURI.contains("/revisions")) {
				writeRevisionsFeed(request, response);
			} else if (requestURI.contains("/checkouts")) {
				writeCheckoutsFeed(request, response);
			}
		} catch (UserException e) {
			response.setContentType("text/html");
			response.getWriter().println(e.getUserMessage());
		} catch (FeedException e) {
			e.printStackTrace();
		}
	}

	private void writeProjectsFeed(HttpServletRequest request, HttpServletResponse response) throws UserException, IOException, FeedException {
		SyndFeed feed = new SyndFeedImpl();
		feed.setFeedType(FEED_TYPE);

		feed.setTitle("BIMserver.org projects feed");
		feed.setLink(request.getContextPath());
		feed.setDescription("This feed represents all the publicly available projects within this bimserver");

		List<SyndEntry> entries = new ArrayList<SyndEntry>();
		ServiceInterface service = (ServiceInterface) getServletContext().getAttribute("service");
		AuthenticatedServiceWrapper serviceWrapper = new AuthenticatedServiceWrapper(service, service.createAnonymousToken(), false);
		try {
			ProjectList allProjects = serviceWrapper.getAllProjects();
			for (SProject sProject : allProjects.getProjects()) {
				SyndEntry entry = new SyndEntryImpl();
				entry.setTitle(sProject.getName());
				entry.setLink(request.getContextPath() + "/project.jsp?id=" + sProject.getId());
				entry.setPublishedDate(sProject.getCreatedOn());
				SyndContent description = new SyndContentImpl();
				description.setType("text/plain");
				description.setValue(sProject.getDescription());
				entry.setDescription(description);
				entries.add(entry);
			}
			if (allProjects.getProjects().size() == 0) {
				SyndEntry entry = new SyndEntryImpl();
				entry.setTitle("No projects found");
				entry.setLink(request.getContextPath() + "/main.jsp");
				entry.setPublishedDate(new Date());
				SyndContent description = new SyndContentImpl();
				description.setType("text/plain");
				description.setValue("No publicly available projects found");
				entry.setDescription(description);
				entries.add(entry);
			}
		} catch (UserException e) {
			e.printStackTrace();
		}
		feed.setEntries(entries);
		SyndFeedOutput output = new SyndFeedOutput();
		output.output(feed, response.getWriter());
	}

	private void writeRevisionsFeed(HttpServletRequest request, HttpServletResponse response) throws IOException, FeedException, UserException {
		ServiceInterface service = (ServiceInterface) getServletContext().getAttribute("service");
		AuthenticatedServiceWrapper serviceWrapper = new AuthenticatedServiceWrapper(service, service.createAnonymousToken(), false);
		int pid = Integer.parseInt(request.getParameter("pid"));
		SProject sProject = serviceWrapper.getProjectById(pid);

		SyndFeed feed = new SyndFeedImpl();
		feed.setFeedType(FEED_TYPE);

		feed.setTitle("BIMserver.org revisions feed for project '" + sProject.getName() + "'");
		feed.setLink(request.getContextPath());
		feed.setDescription("This feed represents all the revisions of project '" + sProject.getName() + "'");

		List<SyndEntry> entries = new ArrayList<SyndEntry>();
		try {
			SRevisionList allRevisionsOfProject = serviceWrapper.getAllRevisionsOfProject(pid);
			Collections.sort(allRevisionsOfProject.getRevisions(), new SRevisionIdComparator(false));
			for (SRevision sVirtualRevision : allRevisionsOfProject.getRevisions()) {
				SyndEntry entry = new SyndEntryImpl();
				entry.setTitle("Revision " + sVirtualRevision.getId());
				entry.setLink(request.getContextPath() + "/revision.jsp?pid=" + sVirtualRevision.getProjectId() + "&rid=" + sVirtualRevision.getId());
				entry.setPublishedDate(sVirtualRevision.getDate());
				SyndContent description = new SyndContentImpl();
				description.setType("text/html");
				description.setValue("<table><tr><td>User</td><td>" + sVirtualRevision.getUsername() + "</td></tr><tr><td>Comment</td><td>" + sVirtualRevision.getComment() + "</td></tr></table>");
				entry.setDescription(description);
				entries.add(entry);
			}
		} catch (UserException e) {
			e.printStackTrace();
		}
		feed.setEntries(entries);
		SyndFeedOutput output = new SyndFeedOutput();
		output.output(feed, response.getWriter());
	}

	private void writeCheckoutsFeed(HttpServletRequest request, HttpServletResponse response) throws UserException, IOException, FeedException {
		ServiceInterface service = (ServiceInterface) getServletContext().getAttribute("service");
		AuthenticatedServiceWrapper serviceWrapper = new AuthenticatedServiceWrapper(service, service.createAnonymousToken(), false);
		int pid = Integer.parseInt(request.getParameter("pid"));
		SProject sProject = serviceWrapper.getProjectById(pid);

		SyndFeed feed = new SyndFeedImpl();
		feed.setFeedType(FEED_TYPE);

		feed.setTitle("BIMserver.org checkouts feed for project '" + sProject.getName() + "'");
		feed.setLink(request.getContextPath());
		feed.setDescription("This feed represents all the checkouts of project '" + sProject.getName() + "'");

		List<SyndEntry> entries = new ArrayList<SyndEntry>();
		try {
			SCheckoutList allCheckoutsOfProject = serviceWrapper.getAllCheckoutsOfProject(pid);
			for (SCheckout sCheckout : allCheckoutsOfProject.getCheckouts()) {
				SyndEntry entry = new SyndEntryImpl();
				entry.setTitle(sCheckout.getUsername());
				entry.setLink(request.getContextPath() + "/checkout.jsp?pid=" + sProject.getId() + "&cid=" + sCheckout.getId());
				entry.setPublishedDate(sCheckout.getDate());
				SyndContent description = new SyndContentImpl();
				description.setType("text/plain");
				description.setValue("<table><tr><td>User</td><td>" + sCheckout.getUsername() + "</td></tr><tr><td>Revision</td><td>" + sCheckout.getRevisionId() + "</td></tr></table>");
				entry.setDescription(description);
				entries.add(entry);
			}
		} catch (UserException e) {
			e.printStackTrace();
		}
		feed.setEntries(entries);
		SyndFeedOutput output = new SyndFeedOutput();
		output.output(feed, response.getWriter());
	}
}