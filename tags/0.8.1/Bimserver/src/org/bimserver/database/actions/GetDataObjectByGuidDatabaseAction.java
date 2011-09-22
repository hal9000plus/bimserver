package org.bimserver.database.actions;

import org.bimserver.database.BimDatabaseException;
import org.bimserver.database.BimDatabaseSession;
import org.bimserver.database.BimDeadlockException;
import org.bimserver.database.ObjectIdentifier;
import org.bimserver.database.store.ConcreteRevision;
import org.bimserver.database.store.VirtualRevision;
import org.bimserver.shared.DataObject;
import org.bimserver.shared.UserException;

public class GetDataObjectByGuidDatabaseAction extends BimDatabaseAction<DataObject>{

	private final int pid;
	private final int rid;
	private final String guid;

	public GetDataObjectByGuidDatabaseAction(int pid, int rid, String guid) {
		this.pid = pid;
		this.rid = rid;
		this.guid = guid;
	}
	
	@Override
	public DataObject execute(BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		VirtualRevision virtualRevision = bimDatabaseSession.getVirtualRevision(pid, rid);
		ObjectIdentifier objectIdentifier = null;
		for (ConcreteRevision concreteRevision : virtualRevision.getRevisions()) {
			objectIdentifier = bimDatabaseSession.getOidOfGuid(guid, concreteRevision.getProject().getId(), concreteRevision.getId());
			if (objectIdentifier != null) {
				long oidOfGuid = objectIdentifier.getOid();
				if (oidOfGuid != -1) {
					break;
				}
			}
		}
		if (objectIdentifier == null) {
			throw new UserException("Guid " + guid + " not found");
		}
		
		return new GetDataObjectByOidDatabaseAction(pid, rid, objectIdentifier.getOid(), objectIdentifier.getCid()).execute(bimDatabaseSession);
	}
}