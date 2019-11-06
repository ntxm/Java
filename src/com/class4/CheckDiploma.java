package com.class4;

public class CheckDiploma {

	public static void main(String[] args) {
		boolean userHasDiploma = true;
		double gpa = 3.5;
		
		if(userHasDiploma) {
			System.out.println("Congratulation!");
			if(gpa >= 3.5) {
				System.out.println("You are eligible to scolarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("We suggest to get a degree");
		}

	}

}
