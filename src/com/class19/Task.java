package com.class19;

public class Task {

	
	//Task 1
	String createEmain(String firstName, String lastName, String emailType) {
		
		String email = firstName + lastName + "@" + emailType;
		
		return email;	
	}
	
	//-----------------------------------------------
	
	public static void main(String[] args) {
		
		Task obj = new Task();
		
		String emailAddress = obj.createEmain("Paul", "Smith", "gmail.com");
		System.out.println(emailAddress);
		
		
	}

}
