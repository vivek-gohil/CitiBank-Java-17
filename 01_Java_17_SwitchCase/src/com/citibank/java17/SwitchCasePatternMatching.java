package com.citibank.java17;

public class SwitchCasePatternMatching {
	public String patternMatchingSwitch(Object object) {
		return switch (object) {
		case Integer i -> "You have supplied Int/Integer value" + i;
		case Long l -> "You have supplied Int/Integer value";
		case String s -> "You have supplied String value ";
		case Double d -> "You have supplied Double value";
		case Boolean b -> "You have supplied Boolean value";
		case Employee e -> "You have supplied Employee object as value";
		default -> "Unknown Datatype";
		};

//		if (object instanceof Integer) {
//			return "You have supplied Int/Integer value";
//		}
//		if (object instanceof String ) {
//			return "You have supplied String value";
//		}
//		if (object instanceof Double) {
//			return "You have supplied Double value";
//		}
//		if (object instanceof Boolean) {
//			return "You have supplied Boolean value";
//		}
//		return "unknown datatype";

	}

	public String guardedPatternSwitch(Object object) {
		return switch (object) {
		case Integer i -> "You have supplied Int/Integer value" + i;
		case Long l -> "You have supplied Int/Integer value";
		case String s -> "You have supplied String value ";
		case Double d -> "You have supplied Double value";
		case Boolean b -> "You have supplied Boolean value";
		case Employee e && e.getDepartment().equals("IT") -> "You have supplied Employee of IT department";
		default -> "Unknown Datatype";
		};
	}

	public static void main(String[] args) {
		String message = new SwitchCasePatternMatching().patternMatchingSwitch(new String("Hello"));
		System.out.println(message);
		System.out.println("------------------------");
		message = new SwitchCasePatternMatching().patternMatchingSwitch(Integer.valueOf(10));
		System.out.println(message);
		System.out.println("------------------------");
		message = new SwitchCasePatternMatching().patternMatchingSwitch(new Employee(101, "Test Employee", 1000, "IT"));
		System.out.println(message);
		System.out.println("------------------------");
		message = new SwitchCasePatternMatching().guardedPatternSwitch(new Employee(101, "Test Employee", 1000, "IT"));
		System.out.println(message);

	}
}
