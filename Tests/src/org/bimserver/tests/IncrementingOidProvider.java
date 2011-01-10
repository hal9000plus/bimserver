package org.bimserver.tests;

import org.bimserver.ifc.OidProvider;

public class IncrementingOidProvider implements OidProvider {

	private long counter;

	public IncrementingOidProvider(long start) {
		this.counter = start;
	}

	@Override
	public long newOid() {
		return counter++;
	}
}
