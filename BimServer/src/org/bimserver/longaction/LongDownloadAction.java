package org.bimserver.longaction;

import java.util.UUID;

import javax.activation.DataHandler;

import org.bimserver.SettingsManager;
import org.bimserver.database.BimDatabase;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.actions.DownloadDatabaseAction;
import org.bimserver.exceptions.NoSerializerFoundException;
import org.bimserver.ifc.EmfSerializer;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.SerializerException;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.bimserver.serializers.EmfSerializerFactory;
import org.bimserver.shared.LongActionState;
import org.bimserver.shared.LongActionState.ActionState;
import org.bimserver.shared.ResultType;
import org.bimserver.shared.SCheckoutResult;
import org.bimserver.shared.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongDownloadAction extends LongDownloadOrCheckoutAction {


	private static final Logger LOGGER = LoggerFactory.getLogger(LongDownloadAction.class);
	private final BimDatabase bimDatabase;
	private final LongActionManager longActionManager;
	private final AccessMethod accessMethod;
	private final EmfSerializerFactory emfSerializerFactory;
	private final ResultType resultType;
	private SCheckoutResult checkoutResult;
	private User user;
	private DownloadDatabaseAction action;
	private final long roid;
	private final long currentUoid;
	private final String id;
	private ActionState state = ActionState.UNKNOWN;
	private final SettingsManager settingsManager;

	public LongDownloadAction(long roid, long currentUoid, LongActionManager longActionManager, BimDatabase bimDatabase,
			AccessMethod accessMethod, EmfSerializerFactory emfSerializerFactory, SettingsManager settingsManager, ResultType resultType) {
		super();
		this.longActionManager = longActionManager;
		this.bimDatabase = bimDatabase;
		this.accessMethod = accessMethod;
		this.emfSerializerFactory = emfSerializerFactory;
		this.settingsManager = settingsManager;
		this.resultType = resultType;
		this.roid = roid;
		this.currentUoid = currentUoid;
		this.id = UUID.randomUUID().toString();
	}

	public void execute() {
		state = ActionState.STARTED;
		BimDatabaseSession session = bimDatabase.createReadOnlySession();
		try {
			action = new DownloadDatabaseAction(session, accessMethod, settingsManager, roid, currentUoid);
			IfcModel ifcModel = session.executeAction(action, org.bimserver.webservices.Service.DEADLOCK_RETRIES);
			Revision revision = session.get(StorePackage.eINSTANCE.getRevision(), roid, false);
			user = session.get(StorePackage.eINSTANCE.getUser(), currentUoid, false);
			checkoutResult = convertModelToCheckoutResult(revision.getProject(), user, ifcModel, resultType);
		} catch (Exception e) {
			LOGGER.error("", e);
		} finally {
			session.close();
			state = ActionState.FINISHED;
		}
	}

	@Override
	public SCheckoutResult getCheckoutResult() {
		return checkoutResult;
	}

	private SCheckoutResult convertModelToCheckoutResult(Project project, User user, IfcModel model, ResultType resultType)
			throws UserException, NoSerializerFoundException {
		SCheckoutResult checkoutResult = new SCheckoutResult();
		if (model.isValid()) {
			checkoutResult.setProjectName(project.getName());
			checkoutResult.setRevisionNr(model.getRevisionNr());
			EmfSerializer serializer;
			try {
				serializer = emfSerializerFactory.create(project, user, resultType, model, checkoutResult.getProjectName() + "."
						+ checkoutResult.getRevisionNr() + "." + resultType.getDefaultExtension());
				checkoutResult.setFile(new DataHandler(serializer));
			} catch (SerializerException e) {
				LOGGER.error("", e);
			}
		}
		return checkoutResult;
	}

	public boolean isRunning() {
		return longActionManager.isRunning(this);
	}

	@Override
	public String getIdentification() {
		return id;
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public synchronized LongActionState getState() {
		LongActionState ds = new LongActionState();
		ds.setProgress(action.getProgress());
		ds.setState(state);
		return ds;
	}
}