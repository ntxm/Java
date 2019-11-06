package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) {
		
		//Two ways to create string objects
		// String literal
		String name = "John";
		System.out.println(name);
		System.out.println(name.length());
		
		
		// 2nd way
		//Creating string with new key word
		String name1 = new String("John1");
		System.out.println(name1 +" ---->");
		
		int name1Length = name.length();
		System.out.println(name1Length);
		
		String str1 = "Hello WorlD";
		System.out.println("Before: " + str1);
		String str11 = str1.toLowerCase();
		System.out.println("After:" + str11);
		
		
		//.equals()
		String str2 = "HEllo World";
		boolean isEqual = str1.equals(str2);
		System.out.println(isEqual); //FALSE
		
		// .equalsIgonoreCase();
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		
		
		//.toUpperCase() converts all letters to Upper Case
		String str3 = "Natalie";
		System.out.println("Before: " + str3);
		
		str3 = str3.toUpperCase();
		System.out.println("After:" + str3);
		

	}

}
