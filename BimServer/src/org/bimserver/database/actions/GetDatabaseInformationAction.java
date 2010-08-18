package org.bimserver.database.actions;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.shared.DatabaseInformation;
import org.bimserver.shared.UserException;

public class GetDatabaseInformationAction extends BimDatabaseAction<DatabaseInformation> {

	@Override
	public DatabaseInformation execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		return bimDatabaseSession.getDatabaseInformation();
	}
}