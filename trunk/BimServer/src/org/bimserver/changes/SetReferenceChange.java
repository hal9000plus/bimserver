package org.bimserver.changes;

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
import org.bimserver.emf.IdEObject;
import org.bimserver.shared.exceptions.UserException;
import org.eclipse.emf.ecore.EReference;

public class SetReferenceChange implements Change {

	private final long oid;
	private final String referenceName;
	private final long referenceOid;
	private final String className;
	private final String referencedClassName;

	public SetReferenceChange(long oid, String className, String referenceName, long referenceOid, String referencedClassName) {
		this.oid = oid;
		this.className = className;
		this.referenceName = referenceName;
		this.referencedClassName = referencedClassName;
		this.referenceOid = referenceOid;
	}

	@Override
	public void execute(int pid, int rid, BimDatabaseSession bimDatabaseSession) throws UserException, BimDeadlockException, BimDatabaseException {
		IdEObject idEObject = bimDatabaseSession.get(bimDatabaseSession.getEClassForName(className), oid, false, null);
		if (idEObject == null) {
			throw new UserException("No object of type " + className + " found in project with pid " + pid);
		}
		EReference eReference = bimDatabaseSession.getMetaDataManager().getEReference(className, referenceName);
		if (eReference == null) {
			throw new UserException("No reference with the name " + referenceName + " found in class " + className);
		}
		if (eReference.isMany()) {
			throw new UserException("Reference is not of type 'single'");
		}
		IdEObject referencedObject = bimDatabaseSession.get(bimDatabaseSession.getEClassForName(referencedClassName), referenceOid, false, null);
		if (referencedObject == null) {
			throw new UserException("Referenced object of type " + referencedClassName + " with oid " + referenceOid + " not found");
		}
		idEObject.eSet(eReference, referencedObject);
		bimDatabaseSession.store(idEObject);
	}
}