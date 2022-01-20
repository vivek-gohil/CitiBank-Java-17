package com.citibank.main;

public class LambdaExpressionMainV2 {
	public static void main(String[] args) {
//		StringLengthLambda lambdaOne = (String text) -> {
//			return text.length();
//		};
//
//		StringLengthLambda lambdaTwo = (text) -> text.length();
//
//		StringLengthLambda lambdaThree = text -> text.length();
//
//		int length = lambdaThree.getLength("Hello World");
//		System.out.println("Length of text is :: " + length);

		// level 0
		MyNewClass myNewClass = new MyNewClass();
		print(myNewClass, "Hello World");

		// level 1
		StringLengthLambda lengthLambda = new StringLengthLambda() {
			@Override
			public int getLength(String text) {
				return text.length();
			}
		};
		print(lengthLambda, "Hello World");

		// level 2
		print(text -> text.length(), null);

	}

	public static void print(StringLengthLambda stringlengthLambda, String text) {
		System.out.println(stringlengthLambda.getLength(text));
	}
}

@FunctionalInterface
interface StringLengthLambda {
	public int getLength(String text);
}

class MyNewClass implements StringLengthLambda {
	@Override
	public int getLength(String text) {
		return text.length();
	}
}
