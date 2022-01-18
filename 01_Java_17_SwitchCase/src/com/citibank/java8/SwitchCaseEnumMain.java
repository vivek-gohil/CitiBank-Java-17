package com.citibank.java8;

public class SwitchCaseEnumMain {
	static enum DAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		DAYS days = DAYS.TUESDAY;
		switch (days) {
		case MONDAY:
			System.out.println("Weekday");
			break;
		case TUESDAY:
			System.out.println("Weekday");
			break;
		case WEDNESDAY:
			System.out.println("Weekday");
			break;
		case THURSDAY:
			System.out.println("Weekday");
			break;
		case FRIDAY:
			System.out.println("Weekday");
			break;
		case SATURDAY:
			System.out.println("Weekend");
			break;
		case SUNDAY:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
