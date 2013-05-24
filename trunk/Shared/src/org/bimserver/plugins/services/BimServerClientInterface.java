package org.bimserver.plugins.services;

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

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.shared.PublicInterfaceNotFoundException;
import org.bimserver.shared.ServiceHolder;
import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;

public interface BimServerClientInterface extends ServiceHolder {

	IfcModelInterface getModel(long poid, long roid, boolean deep) throws BimServerClientException, UserException, ServerException, PublicInterfaceNotFoundException;
}