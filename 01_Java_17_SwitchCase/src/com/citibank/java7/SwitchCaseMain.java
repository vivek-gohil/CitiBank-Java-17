package com.citibank.java7;

//In JDK 7 only int is supported with switch case
public class SwitchCaseMain {
	public static void main(String[] args) {
		int value = 2;
		switch (value) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		default:
			System.out.println("Unknown");
			break;
		}
	}
}
