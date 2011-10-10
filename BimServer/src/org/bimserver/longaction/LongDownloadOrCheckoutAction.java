package org.bimserver.longaction;

/******************************************************************************
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import javax.activation.DataHandler;

import org.bimserver.BimServer;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.exceptions.NoSerializerFoundException;
import org.bimserver.interfaces.objects.SCheckoutResult;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ActionState;
import org.bimserver.models.store.LongActionState;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.EmfSerializerDataSource;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.shared.exceptions.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class LongDownloadOrCheckoutAction extends LongAction<DownloadParameters> {
	protected static final Logger LOGGER = LoggerFactory.getLogger(LongDownloadAction.class);
	protected final AccessMethod accessMethod;
	protected final DownloadParameters downloadParameters;
	protected final long currentUoid;
	protected ActionState state = ActionState.UNKNOWN;
	protected SCheckoutResult checkoutResult;
	protected User user;
	private final BimServer bimServer;

	protected LongDownloadOrCheckoutAction(BimServer bimServer, DownloadParameters downloadParameters, AccessMethod accessMethod, long currentUoid) {
		super();
		this.bimServer = bimServer;
		this.accessMethod = accessMethod;
		this.downloadParameters = downloadParameters;
		this.currentUoid = currentUoid;
	}

	public SCheckoutResult getCheckoutResult() {
		return checkoutResult;
	}

	public abstract LongActionState getState();

	public User getUser() {
		return user;
	}

	protected SCheckoutResult convertModelToCheckoutResult(Project project, User user, IfcModelInterface model, DownloadParameters downloadParameters)
			throws UserException, NoSerializerFoundException {
		SCheckoutResult checkoutResult = new SCheckoutResult();
		if (model.isValid()) {
			checkoutResult.setProjectName(project.getName());
			checkoutResult.setRevisionNr(model.getRevisionNr());
			try {
				EmfSerializer serializer = getBimServer().getEmfSerializerFactory().create(project, user, model, downloadParameters);
				if (serializer == null) {
					throw new UserException("Error, no serializer found");
				}
				checkoutResult.setFile(new DataHandler(new EmfSerializerDataSource(serializer)));
			} catch (SerializerException e) {
				LOGGER.error("", e);
			}
		}
		return checkoutResult;
	}

	protected void executeAction(BimDatabaseAction<? extends IfcModelInterface> action, DownloadParameters downloadParameters, BimDatabaseSession session,
			boolean commit) throws BimDatabaseException, UserException, NoSerializerFoundException {
		if (action == null) {
			checkoutResult = new SCheckoutResult();
			checkoutResult.setFile(new DataHandler(getBimServer().getDiskCacheManager().get(downloadParameters)));
		} else {
			IfcModelInterface ifcModel = null;
			Revision revision = session.get(StorePackage.eINSTANCE.getRevision(), downloadParameters.getRoid(), false, null);
			user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false, null);
			revision.getProject().getGeoTag().load(); // Little hack to make sure this is lazily loaded, because after the executeAndCommitAction the session won't be usable
			if (commit) {
				ifcModel = session.executeAndCommitAction(action, org.bimserver.webservices.Service.DEADLOCK_RETRIES);
			} else {
				ifcModel = session.executeAction(action, org.bimserver.webservices.Service.DEADLOCK_RETRIES);
			}
			checkoutResult = convertModelToCheckoutResult(revision.getProject(), user, ifcModel, downloadParameters);
			if (checkoutResult != null) {
				getBimServer().getDiskCacheManager().store(downloadParameters, checkoutResult.getFile());
			}
		}
		done();
	}

	public BimServer getBimServer() {
		return bimServer;
	}
}