package com.class21;

public class Employee {
	int eID;
	int salary;
	static String CEO = "Sumair";
	
	
	void getInfo() {
		System.out.println("Employee ID is " + eID + " ,salary is " + salary + " CEO is: " + CEO);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.getInfo();
		
		Employee emp2 = new Employee();
		emp2.getInfo();
		
	}

}
