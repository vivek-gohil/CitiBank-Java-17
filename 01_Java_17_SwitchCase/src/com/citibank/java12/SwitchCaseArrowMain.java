package com.citibank.java12;

public class SwitchCaseArrowMain {

	public String returnUsingArrow(String day) {
		return switch (day) {
		case "Monday" -> "Weekday";
		case "Tuesday" -> "Weekday";
		case "Wednesday" -> "Weekday";
		case "Thursday" -> "Weekday";
		case "Friday" -> "Weekday";
		case "Saturday" -> "Weekend";
		case "Sunday" -> "Weekend";
		default -> "Invalid";
		};

	}

	public static void main(String[] args) {
		String day = new SwitchCaseArrowMain().returnUsingArrow("Monday");
		System.out.println(day);
	}
}
