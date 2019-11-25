package com.class25_1;

public class CanWeOverloaded {

	
	//can we overloaded a private method - YES
	//Can we overload a static method? - YES
	
	private void methodOne() {
		System.out.println("I am method one");
	}
	
	private void methodOne(String str) {
		System.out.println("I am method one with " + str);
	}
	
	//can we overloaded a main method? - YES
	
	//public static void main(String[] args) {
	//	System.out.println("I am a main method with String array");
	//}
	
	public static void main(String str) {
		System.out.println("I am a main method with String arguments");
	}
	
	public static void main(String str, String[] arg) {
		System.out.println("I am a main method with 2 parameters");
	}
	
	public static void main(String[] args) {
		CanWeOverloaded.main("String");
		String[] array = {"A", "B"};
		main("Hello", array);
	}
	
	
}
