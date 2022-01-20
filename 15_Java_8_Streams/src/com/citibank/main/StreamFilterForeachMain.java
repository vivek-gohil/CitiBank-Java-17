package com.citibank.main;

import java.util.Arrays;
import java.util.List;

public class StreamFilterForeachMain {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vivek", "Bahubali", "Trupti", "Samarth");

		// print all accept bahubali
		for (String name : names) {
			if (!name.equals("Bahubali")) {
				System.out.println(name);
			}
		}
		System.out.println("---------------------------");

		// Using Streams
		names.stream().filter(name -> !name.equals("Bahubali")).forEach(s -> System.out.println(s));
		System.out.println("---------------------------");

		names.stream().filter(name -> !name.equals("Bahubali")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("---------------------------");
		names.stream().filter(name -> !name.equals("Bahubali")).map(s -> s.toUpperCase()).forEach(System.out::println);
		System.out.println("---------------------------");
		System.out.println(names);
	}
}
