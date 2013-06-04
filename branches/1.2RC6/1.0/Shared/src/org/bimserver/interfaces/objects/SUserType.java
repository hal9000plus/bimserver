package org.bimserver.interfaces.objects;

public enum SUserType {
	ADMIN(0),
	USER(1),
	ANONYMOUS(2);
	int ordinal;

	SUserType(int ordinal) {
		this.ordinal = ordinal;
	}
	
	public int getOrdinal() {
		return ordinal;
	}
}