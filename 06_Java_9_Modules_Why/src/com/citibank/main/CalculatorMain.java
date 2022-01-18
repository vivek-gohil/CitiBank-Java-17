package com.citibank.main;

import com.citibank.util.Calculator;
import com.citibank.util.internal.CalculatorHelper;

public class CalculatorMain {
	// main - client
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(4, 5);
		System.out.println("Result is :: " + result);

		System.out.println("-".repeat(50));

		result = calculator.add(5.3, 7.9);
		System.out.println("Result is :: " + result);

	
		CalculatorHelper calculatorHelper = new CalculatorHelper();
		System.out.println(calculatorHelper.add(result, result));

	}
}
