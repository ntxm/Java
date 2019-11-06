package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Bye");
		String str4 = new String("Bye");
		
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.contains("ll"));
		
		System.out.println("====StartsWith and EndsWith");
		
		String str5 = new String("Today is Saturday");
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println("====Concat=====");
		System.out.println(str5.concat(" and we have Java class"));
		
		System.out.println("=======trim()========");
		String str6 = "     Its sunny";
		System.out.println("Before triming: " + str6);
		System.out.println(str6.trim());
		
		System.out.println("=======Index Of and CharAt==========");
		String str7 = "Tomorrow we will be done with String Manipulation";
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e', 11)); //searching from index 11
		System.out.println(str7.charAt(20));

	}

}
