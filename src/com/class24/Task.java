package com.class24;

public class Task {
	
	int x, y;
	
	
	//visible only from this class
	private Task() {
		System.out.println("This is private constructor");
	}
	
	//visible from any class inside this package
	//Task(int toX) {
	//	 x = toX;
	//	System.out.println("This is default constructor: " + x);
	//}
	
	
	//visible from any class and any package
	 public Task(int toX) {
		 x = toX;
		System.out.println("This is public constructor: " + x);
	}
	
	 

	 

	public static void main(String[] args) {
		
		Task obj1 = new Task();
		Task obj2 = new Task(5);
		Task obj3 = new Task(7);
		

	}

}
