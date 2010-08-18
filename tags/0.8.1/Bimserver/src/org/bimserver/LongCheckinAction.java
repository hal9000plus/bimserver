package org.bimserver;

import org.bimserver.database.BimDatabase;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.actions.BimDatabaseAction;
import org.bimserver.shared.UserException;

public class LongCheckinAction extends LongAction {

	private final BimDatabaseAction<Void> createCheckinAction;
	private final BimDatabase bimDatabase;

	public LongCheckinAction(BimDatabase bimDatabase, BimDatabaseAction<Void> createCheckinAction) {
		this.bimDatabase = bimDatabase;
		this.createCheckinAction = createCheckinAction;
	}

	public void execute() {
		try {
			BimDatabaseSession session = bimDatabase.createSession();
			session.executeAndCommitAction(createCheckinAction, Service.DEADLOCK_RETRIES);
		} catch (UserException e) {
			e.printStackTrace();
		} catch (BimDatabaseException e) {
			e.printStackTrace();
		}
	}
}