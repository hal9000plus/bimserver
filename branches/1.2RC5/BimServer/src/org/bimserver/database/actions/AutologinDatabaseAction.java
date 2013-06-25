package org.bimserver.database.actions;

/******************************************************************************
 * Copyright (C) 2009-2013  BIMserver.org
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

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.bimserver.BimServer;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ObjectState;
import org.bimserver.models.store.User;
import org.bimserver.models.store.UserType;
import org.bimserver.shared.exceptions.UserException;
import org.bimserver.utils.Hashers;
import org.bimserver.webservices.Service;
import org.bimserver.webservices.authorization.AdminAuthorization;
import org.bimserver.webservices.authorization.Authorization;
import org.bimserver.webservices.authorization.UserAuthorization;

public class AutologinDatabaseAction extends BimDatabaseAction<String>{

	private final String hash;
	private final String username;
	private final Service service;
	private BimServer bimServer;

	public AutologinDatabaseAction(BimServer bimServer, DatabaseSession databaseSession, Service service, AccessMethod accessMethod, String username, String hash) {
		super(databaseSession, accessMethod);
		this.bimServer = bimServer;
		this.service = service;
		this.username = username;
		this.hash = hash;
	}

	@Override
	public String execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		BimDatabaseAction<User> action = new GetUserByUserNameDatabaseAction(getDatabaseSession(), getAccessMethod(), username);
		User user = action.execute();
		if (user != null && hash.equals(Hashers.getSha256Hash(user.getUsername() + user.getPassword()))) {
			if (user.getState() == ObjectState.DELETED) {
				throw new UserException("User account has been deleted");
			} else if (user.getUserType() == UserType.SYSTEM) {
				throw new UserException("System user cannot login");
			}
			user.setLastSeen(new Date());
			
			Authorization authorization = null;
			if (user.getUserType() == UserType.ADMIN) {
				authorization = new AdminAuthorization(1, TimeUnit.DAYS);
			} else {
				authorization = new UserAuthorization(1, TimeUnit.DAYS);
			}
			authorization.setUoid(user.getOid());
			String asHexToken = authorization.asHexToken(bimServer.getEncryptionKey());
			
			service.setAuthorization(authorization);
			getDatabaseSession().store(user);
			return asHexToken;
		} else {
			throw new UserException("User not found");
		}
	}
}