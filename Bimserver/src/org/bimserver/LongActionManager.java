package org.bimserver;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LongActionManager extends Thread {

	private final BlockingQueue<LongAction> queue = new LinkedBlockingQueue<LongAction>();
	private boolean running = true;

	public LongActionManager() {
		setName("LongActionManager");
	}

	public void start(LongCheckinAction longCheckinAction) {
		queue.add(longCheckinAction);
	}

	@Override
	public void run() {
		try {
			while (running) {
				LongAction longAction = queue.take();
				try {
					longAction.execute();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}