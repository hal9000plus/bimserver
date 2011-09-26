package org.bimserver.ifc;

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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataSource;

import org.bimserver.plugins.serializers.EmfSerializer;

public class EmfSerializerDataSource implements DataSource {

	private final EmfSerializer serializer;

	public EmfSerializerDataSource(EmfSerializer serializer) {
		this.serializer = serializer;
	}

	@Override
	public String getContentType() {
		return null;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return serializer.getInputStream();
	}

	@Override
	public String getName() {
		return serializer.getModel().getName();
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		return null;
	}

	public EmfSerializer getSerializer() {
		return serializer;
	}
}