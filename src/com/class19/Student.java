package com.class19;

public class Student {

	char getGrade(int score) {
		
		char grade;
		
		if(score > 90) {
			grade = 'A';
		}else if(score > 80) {
			grade = 'B';
		}else if(score > 70) {
			grade = 'C';
		}else if(score > 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		return grade;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		char gradeStudent1 = student1.getGrade(80);
		System.out.println(gradeStudent1);
		
		gradeStudent1 = student1.getGrade(50);
		System.out.println(gradeStudent1);

	}

}
