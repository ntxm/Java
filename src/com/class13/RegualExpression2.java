package com.class13;

public class RegualExpression2 {

	public static void main(String[] args) {
		String str = "Today is our java class";
		
		System.out.println(str.replace(" ", ""));
		System.out.println("===============");
		System.out.println(str.replaceAll("\\s", ""));

	}

}
