package com.citibank.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MemoryLeakDemo {
	private static BlockingQueue<byte[]> queue = new LinkedBlockingDeque<byte[]>();

	public static void main(String[] args) {

		Runnable producer = () -> {
			while (true) {
				// generate 1mb of object every 10ms
				queue.offer(new byte[1 * 1024 * 1024]);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable consumer = () -> {
			while (true) {
				// process every 100ms
				try {
					queue.take();
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};

		new Thread(producer, "Producer Thread").start();
		new Thread(consumer, "Consumer Thread").start();
	}
}
