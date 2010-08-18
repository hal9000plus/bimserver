package org.bimserver.database;

import com.sleepycat.je.DeadlockException;

public class BimDeadlockException extends Exception {

	public BimDeadlockException(DeadlockException e) {
		super(e);
	}

	private static final long serialVersionUID = 9043339658520339789L;

}
