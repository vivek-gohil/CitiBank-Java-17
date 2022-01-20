package com.citibank.main;

public class MethodReferenceMain {
	public static void main(String[] args) {
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("We are in thread");
//			}
//		};

//		Runnable lambdaRunnable = () -> System.out.println("We are in thread");
//		Thread ThreadOne = new Thread(lambdaRunnable);
//		ThreadOne.start();

//		Thread ThreadOne = new Thread(() -> System.out.println("We are in thread"));
//		ThreadOne.start();

//		new Thread(() -> System.out.println("We are in thread")).start();

//		new Thread(() -> MethodReferenceMain.printMessage()).start();

		// Method Reference
		// new Thread(MethodReferenceMain::printMessage).start();
		// same as () -> MethodReferenceMain.printMessage()

		MethodReferenceMain obj = new MethodReferenceMain();
		new Thread(obj::printMessage).start();
	}

	public void printMessage() {
		System.out.println("We are in thread");
	}
}
