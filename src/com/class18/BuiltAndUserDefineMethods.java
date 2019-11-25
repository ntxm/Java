package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefineMethods {

	public static void main(String[] args) {
		
		
		String str = "Hello";
		str = str.replace("Hello", "Hi");
		System.out.println(str);
		
		Scanner scan = new Scanner(System.in);
		String scannerString = scan.nextLine();
		System.out.println(scannerString);
		
		BuiltAndUserDefineMethods obj = new BuiltAndUserDefineMethods();
		obj.myMethod();
		
		
	}
	
	void myMethod() { //method header
		System.out.println("This is user defined method that I created");
	}

}
