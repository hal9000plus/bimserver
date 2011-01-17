package org.bimserver.longaction;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongActionManager {

	private static final Logger LOGGER = LoggerFactory.getLogger(LongActionManager.class);
	private final Map<LongAction, Thread> threads = new HashMap<LongAction, Thread>();
	private volatile boolean running = true;

	public synchronized void start(final LongAction longAction) throws CannotBeScheduledException {
		if (running) {
			LOGGER.info("Running long action");
			Thread thread = new Thread(new Runnable(){
				@Override
				public void run() {
					longAction.execute();
					synchronized (LongActionManager.this) {
						LOGGER.info("Removing long action");
						threads.remove(longAction);
					}
				}
			});
			thread.setDaemon(true);
			thread.setName(longAction.getIdentification());
			threads.put(longAction, thread);
			thread.start();
		} else {
			throw new CannotBeScheduledException();
		}
	}

	public synchronized void shutdown() {
		running = false;
	}
	
	/*
	 * Untested method
	 */
	public synchronized void shutdownGracefully() {
		running = false;
		Iterator<LongAction> iterator = threads.keySet().iterator();
		while (iterator.hasNext()) {
			LongAction longAction = iterator.next();
			longAction.waitForCompletion();
		}
	}
}