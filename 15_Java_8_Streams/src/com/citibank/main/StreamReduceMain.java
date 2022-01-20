package com.citibank.main;

import java.util.Arrays;
import java.util.OptionalInt;

public class StreamReduceMain {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// sum of all numbers
//		int num1 = 0;
//		for (int num2 : number) {
//			num1 = num1 + num2;
//		}

		// System.out.println(sum);

		System.out.println(Arrays.stream(number).reduce((num1, num2) -> num1 + num2));

		OptionalInt sum = Arrays.stream(number).reduce((num1, num2) -> num1 + num2);

		System.out.println(sum.getAsInt());
	}
}
