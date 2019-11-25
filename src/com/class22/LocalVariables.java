package com.class22;

public class LocalVariables {

	
	
	
	public static void main(String[] args) {
		
		LocalVariables obj = new LocalVariables();
		obj.sayName();
		System.out.println("_________________");
		
		//wont be accessible, scope 

	}
	
	
	void sayName() {
		String myName = "John";
		System.out.println(myName);
		// --> wont be accessible, scope is only within main method
		
	}

}
