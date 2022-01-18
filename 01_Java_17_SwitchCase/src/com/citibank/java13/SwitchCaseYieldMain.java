package com.citibank.java13;

public class SwitchCaseYieldMain {
	public String returnStringUsingYield() {
		String day = "Tuesday";
		return switch (day) {
		case "Monday":
			yield "Weekday";
		case "Tuesday":
			yield "Weekday";
		case "Wednesday":
			yield "Weekday";
		case "Thursday":
			yield "Weekday";
		case "Friday":
			yield "Weekday";
		case "Saturday":
			yield "Weekend";
		case "Sunday":
			yield "Weekend";
		default:
			yield "Invalid";
		};
	}

	public static void main(String[] args) {
		String day = new SwitchCaseYieldMain().returnStringUsingYield();
		System.out.println(day);
	}
}
