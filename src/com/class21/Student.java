package com.class21;

public class Student {
	public String studentName;
	public double GPA;
	public static String school;
	
	public void displayInfo() {
		System.out.println(studentName + " attending " + school + " " + GPA);
		
	}
	
	protected void study(int hours) {
		int raining;
		if(3>4) {
			
			int ifTrue = 5;
			System.out.println(ifTrue);
		}else{
			int ifFalse = 6;
			System.out.println(ifFalse);
		}
		
		
		int localVariable = 4;
		System.out.println(studentName + " is stadying for " + hours + " hours");
		
	}
	
	

}
