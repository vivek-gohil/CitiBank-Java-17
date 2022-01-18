package com.citibank.java8;

public class SwitchCaseStringMain {

	public boolean getValue() {
		String day = "Monday";
		switch (day) {
		case "Monday":
			System.out.println("Weekday");
			return true;
		case "Saturday":
			System.out.println("Weekend");
			return true;
		case "Sunday":
			System.out.println("Weekend");
			return true;
		default:
			System.out.println("Invalid");
			break;
		}
		return false;
	}

	public static void main(String[] args) {
		String day = "Tuesday";
		switch (day) {
		case "Monday":
			System.out.println("Weekday");
			break;
		case "Tuesday":
			System.out.println("Weekday");
			break;
		case "Wednesday":
			System.out.println("Weekday");
			break;
		case "Thursday":
			System.out.println("Weekday");
			break;
		case "Friday":
			System.out.println("Weekday");
			break;
		case "Saturday":
			System.out.println("Weekend");
			break;
		case "Sunday":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
