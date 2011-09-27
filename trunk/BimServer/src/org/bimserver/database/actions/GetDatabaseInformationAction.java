package org.bimserver.database.actions;

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

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.DatabaseInformation;
import org.bimserver.shared.exceptions.UserException;

public class GetDatabaseInformationAction extends BimDatabaseAction<DatabaseInformation> {

	public GetDatabaseInformationAction(BimDatabaseSession bimDatabaseSession, AccessMethod accessMethod) {
		super(bimDatabaseSession, accessMethod);
	}

	@Override
	public DatabaseInformation execute() throws UserException, BimDeadlockException, BimDatabaseException {
		return getDatabaseSession().getDatabaseInformation();
	}
}