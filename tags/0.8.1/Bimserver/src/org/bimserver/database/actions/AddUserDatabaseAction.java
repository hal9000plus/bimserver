package org.bimserver.database.actions;

import java.util.Date;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.CommitSet;
import org.bimserver.database.Database;
import org.bimserver.database.store.StoreFactory;
import org.bimserver.database.store.User;
import org.bimserver.database.store.UserType;
import org.bimserver.shared.UserException;
import org.bimserver.utils.Hashers;

public class AddUserDatabaseAction extends BimDatabaseAction<Integer> {
	private final String name;
	private final String password;
	private final UserType userType;
	private final int createrUid;
	private final String username;

	public AddUserDatabaseAction(String username, String password, String name, UserType userType, int createrUid) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.createrUid = createrUid;
	}

	public Integer execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDatabaseException, BimDeadlockException {
		if (username == null || username.trim().equals("")) {
			throw new UserException("Invalid username");
		}
		if (name == null || name.trim().equals("")) {
			throw new UserException("Invalid name");
		}
		if (password == null || password.trim().equals("")) {
			throw new UserException("Invalid password");
		}
		if (bimDatabaseSession.getUserByUserName(username) != null) {
			throw new UserException("A user with the username " + username + " already exists");
		}
		User actingUser = bimDatabaseSession.getUserById(createrUid);
		if (createrUid != -1 && actingUser.getUserType() != UserType.ADMIN) {
			throw new UserException("Only admin users can create other users");
		}
		final User user = StoreFactory.eINSTANCE.createUser();
		user.setId(bimDatabaseSession.newUid());
		user.setName(name);
		user.setUsername(username);
		user.setPassword(Hashers.getSha256Hash(password));
		user.setCreatedOn(new Date());
		user.setCreatedBy(bimDatabaseSession.getUserById(createrUid));
		user.setUserType(userType);
		user.setLastSeen(new Date());
		bimDatabaseSession.store(user, new CommitSet(Database.STORE_PROJECT_ID, -1));
		bimDatabaseSession.savePidCounter();
		bimDatabaseSession.saveOidCounter();
		bimDatabaseSession.saveUidCounter();
		return user.getId();
	}
}