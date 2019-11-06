package com.class13;

public class RegualExpression {

	public static void main(String[] args) {
		
		System.out.println("====regular expression====");
		
		String str = "127838Hel910290lo222";
		System.out.println(str.replaceAll("[0-9]", "")); //leave only text
		System.out.println(str.replaceAll("[a-zA-Z]", "")); //leave only numbers
		
		
		//remove everything except text and numbers
		String str1 = "H1#$%^YasDsd667776a222";
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", "")); // ^ - except
		
		
		String str2 =  "12-22-1990"; // 12/22/1990
		System.out.println(str2.replace("-", "/"));
		System.out.println(str2.replaceFirst("-", "/"));

				
	}

}
