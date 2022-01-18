package com.citibank.pojo;

public class MyClass {
	private String message = "This is sample text message";

	// Nested Class
	public class NewClass {
		public void printMessage() {
			System.out.println(message);
		}
	}
}

//B4 Java 11
//public class MyClass
//{
//    private String message;
//    
//    public MyClass() {
//        this.message = "This is sample text message";
//    }
//
//    String access$000() {
//	return message;
//    }	
//}
//
//public class NewClass
//{
//    final MyClass obj;	
//    public void printMessage() {
//        System.out.println(obj.access$000());
//    }
//}