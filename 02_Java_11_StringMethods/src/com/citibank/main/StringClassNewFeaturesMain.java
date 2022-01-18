package com.citibank.main;

import java.util.List;
import java.util.stream.Collectors;

public class StringClassNewFeaturesMain {
	public static void main(String[] args) {
		System.out.println("1. isBlank");
		String name = "Citibank NA";
		System.out.println("Checking if value of name variable is blank :: " + name.isBlank());
		name = " ";
		System.out.println("Checking if value of name variable is blank :: " + name.isBlank());

		System.out.println("2.isBlank vs isEmpty");
		name = "Citibank NA";
		System.out.println("Checking if value of name variable is empty :: " + name.isEmpty());
		name = " ";
		System.out.println("Checking if value of name variable is empty :: " + name.isEmpty());

		name = null;
		// System.out.println("Checking if value of name variable is empty :: " +
		// name.isBlank());
		// System.out.println("Checking if value of name variable is empty :: " +
		// name.isEmpty());

		System.out.println("3. lines");
		String str = "Abhishek\nSaresh\nAlok\nArpit";
		System.out.println(str);
		List<String> nameList = str.lines().collect(Collectors.toList());
		System.out.println(nameList);

		System.out.println("4. strip");
		str = " Citibank NA ";
		System.out.print("start");
		System.out.print(str);
		System.out.print("end");
		// start Citibank NA end
		System.out.println();
		System.out.println("value of String after calling strip method");
		System.out.print("start");
		System.out.print(str.strip());
		// System.out.print(str.trim());
		System.out.print("end");

		System.out.println("strip vs trim");
		str = "Citibank NA\u205F";
		char c = '\u005Cf';
		System.out.println(c);
		System.out.println(str);

		System.out.println("Using strip :: " + str.strip());
		System.out.println("Using trim :: " + str.trim());

		// strip() :: is Unicode aware
		// trim() :: remove only spance (<0020)

		System.out.println("--------------------------------");
		System.out.println("-".repeat(50));
		System.out.println("-Hi-".repeat(10));
	}
}
