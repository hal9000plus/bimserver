package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.emf.EmfModel;
import org.bimserver.ifc.file.compare.Compare;
import org.bimserver.ifc.file.compare.CompareResult;
import org.bimserver.shared.UserException;

public class CompareDatabaseAction extends BimDatabaseAction<CompareResult> {

	private final int pid;
	private final int rid1;
	private final int rid2;
	private final int uid;

	public CompareDatabaseAction(int pid, int uid, int rid1, int rid2) {
		this.pid = pid;
		this.uid = uid;
		this.rid1 = rid1;
		this.rid2 = rid2;
	}

	@Override
	public CompareResult execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		Compare compare = new Compare(((DatabaseSession)bimDatabaseSession).getFieldIgnoreMap());
		EmfModel<Long> model1 = new DownloadDatabaseAction(pid, rid1, uid).execute(bimDatabaseSession);
		EmfModel<Long> model2 = new DownloadDatabaseAction(pid, rid2, uid).execute(bimDatabaseSession);
		return compare.compare(model1, model2);
	}
}