package com.class21;

public class Empolyeer {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.eID = 1;
		emp1.salary = 55000;

		emp2.eID = 2;
		emp2.salary = 75000;
		
		
		emp1.getInfo();
		emp2.getInfo();
		
	}

}
