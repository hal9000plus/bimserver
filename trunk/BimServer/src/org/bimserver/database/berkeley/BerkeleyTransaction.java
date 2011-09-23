package org.bimserver.database.berkeley;

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
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.BimTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.LockConflictException;
import com.sleepycat.je.Transaction;

public class BerkeleyTransaction implements BimTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(BerkeleyTransaction.class);
	private final Transaction transaction;
	private boolean transactionAlive = true;

	public BerkeleyTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	@Override
	public void setName(String name) {
		transaction.setName(name);
	}

	@Override
	public void close() {
		if (transactionAlive) {
			rollback();
		}
	}

	@Override
	public void rollback() {
		try {
			transaction.abort();
			transactionAlive = false;
		} catch (DatabaseException e) {
			LOGGER.error("", e);
		}
	}

	@Override
	public void commit() throws BimDeadlockException, BimDatabaseException {
		try {
			transaction.commit();
			transactionAlive = false;
		} catch (LockConflictException e) {
			throw new BimDeadlockException(e);
		} catch (DatabaseException e) {
			throw new BimDatabaseException(e);
		}
	}
}