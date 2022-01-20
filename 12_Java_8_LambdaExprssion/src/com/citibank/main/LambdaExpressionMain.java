package com.citibank.main;

import com.citibank.pojo.MyInterface;

public class LambdaExpressionMain {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.greet();

		System.out.println("-".repeat(20));

		MyInterface myInterface = new MyInterface() {
			@Override
			public void greet() {
				System.out.println("Good Morning");
			}
		};
		myInterface.greet();

		System.out.println("-".repeat(20));

		MyInterface greetingInterface = () -> System.out.println("Good Morning");
		greetingInterface.greet();
		
	}
}

class MyClass implements MyInterface {
	@Override
	public void greet() {
		System.out.println("Good Morning");
	}
}