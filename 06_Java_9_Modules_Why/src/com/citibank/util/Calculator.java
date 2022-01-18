package com.citibank.util;
//BL

import com.citibank.util.internal.CalculatorHelper;

public class Calculator {

	//only for Calculator internal processing
	CalculatorHelper calculatorHelper = new CalculatorHelper();

	public int add(int i, int j) {
		return calculatorHelper.add(i, j);
	}

	public int add(double i, double j) {
		return calculatorHelper.add((int) i, (int) j);
	}
}
