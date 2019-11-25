package com.class22;

public class TestStaticVsNonStatic {
	
	//how to access to static members
	//they can be accessed by className

	public static void main(String[] args) {
	System.out.println(StaticVsNonStatic.school);	
	StaticVsNonStatic.getInfo1();
		
	
	//how to access to  non static members
	//they can be accessed by creating an Object of that class
	
	StaticVsNonStatic obj = new StaticVsNonStatic();
	obj.name = "John";
	obj.grade = 'A';
	obj.getInfo();
	//obj.getInfo1(); possible but not preferable

	}

}
