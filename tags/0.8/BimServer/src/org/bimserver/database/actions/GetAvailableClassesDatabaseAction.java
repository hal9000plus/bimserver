package org.bimserver.database.actions;

import org.bimserver.BimDatabaseAction;
import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.shared.ClassList;
import org.bimserver.shared.UserException;

public class GetAvailableClassesDatabaseAction extends BimDatabaseAction<ClassList> {

	@Override
	public ClassList execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		return bimDatabaseSession.getClassList();
	}
}