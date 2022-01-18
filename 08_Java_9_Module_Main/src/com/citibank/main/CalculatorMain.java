package com.citibank.main;

import com.citibank.util.Calculator;
import com.citibank.util.internal.CalculatorHelper;

public class CalculatorMain {
	public static void main(String[] args) {
		System.out.println("Hello");

		Calculator calculator = new Calculator();
		int result = calculator.add(4, 5);
		System.out.println("Result is :: " + result);

		CalculatorHelper helper = new CalculatorHelper();
		System.out.println(helper.add(result, result));
	}
}
