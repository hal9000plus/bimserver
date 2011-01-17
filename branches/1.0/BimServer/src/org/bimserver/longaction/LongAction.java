package org.bimserver.longaction;

public abstract class LongAction {

	public abstract void execute();

	public abstract String getIdentification();
	
	public void waitForCompletion() {
		
	}
}