package com.citibank.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariableMain {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", null, "c");
		System.out.println(list);

		// String result = a,b,c
		String result = list.stream().collect(Collectors.joining(","));
		System.out.println(result);

		// String result = A,B,C
		result = list.stream().map(text -> text.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(result);

		// Using Java 11
		// Annotations , now we can apply on the var
		result = list.stream().map((@Nonnull var text) -> text.toUpperCase()).collect(Collectors.joining(","));
	}
}
