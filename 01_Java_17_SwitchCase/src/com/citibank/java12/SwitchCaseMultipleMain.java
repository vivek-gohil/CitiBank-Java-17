package com.citibank.java12;

public class SwitchCaseMultipleMain {
	public String multipleCases(String day) {
		return switch (day) {
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
		case "Saturday", "Sunday" -> "Weekend";
		default -> "Invalid";
		};
	}

	public static void main(String[] args) {
		String day = new SwitchCaseMultipleMain().multipleCases("Monday");
		System.out.println(day);
	}
}
