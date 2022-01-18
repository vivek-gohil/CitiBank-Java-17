package com.citibank.main;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.Scanner;

public class NoOpGarbageCollectionMain {
	private static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		System.out.println("Starting");
		while (true) {
			for (int i = 0; i < 100000; i++) {
				list.add("" + i);
			}
			if (calculatePercentageMemoryUsed() > 85) {
				System.out.println("Over 85% memory utilization");
				System.out.println("Do you want to clear memory yes(y) or no(n)");
				String input = new Scanner(System.in).next();
				if (input.equalsIgnoreCase("y")) {
					list.clear(); // I am calling garbage collector
					System.out.println("Memory Cleared");
					System.out.println("After Memory Cloeared Current Percentage Of Memory Used :: "
							+ calculatePercentageMemoryUsed());
				}
			}
		}
	}

	private static long calculatePercentageMemoryUsed() {
		MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
		MemoryUsage heapUsage = memoryBean.getHeapMemoryUsage();
		long maxMemory = heapUsage.getMax() / (1024 * 1024);
		long usedMemory = heapUsage.getUsed() / (1024 * 1024);
		long percentageUsed = (long) (100.0 * ((1.0 * usedMemory) / (1.0 * maxMemory)));
		System.out.println(" Used :: " + usedMemory + " Max Memory :: " + maxMemory + " Percentage Used :: "
				+ percentageUsed + "% List size ::  " + list.size());
		return percentageUsed;
	}
}
