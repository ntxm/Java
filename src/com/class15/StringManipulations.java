package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
		String myString = ""; //empty value
		boolean isEmpty = myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1 = null; // no value at all is is equal to
		//String myString1;
		// System.out.println(myString1.isEmpty()); // Exception in thread "main" java.lang.NullPointerException

		//how to verify existence of characters in the string
		String a = "Good evening students";
		boolean exist = a.contains("student");
		System.out.println(exist);
		
		
		
		

	}

}
