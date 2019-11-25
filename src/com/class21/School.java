package com.class21;

public class School {

	public static void main(String[] args) {
		
		Student student0;
		
		Student student1 = new Student();
		//asigning instance variables
		student1.studentName = "Eric";
		student1.GPA = 3.95;
		student1.school = "Syntax";
		
		Student student2 = new Student();
		student2.studentName = "Jannie";
		student2.GPA = 3.90;
		student2.school = "Syntax";
		
		
		
		
		
		
		student1.displayInfo();
		student2.displayInfo();
		student1.study(3);
		student1.displayInfo();
		int hour1 = 3, hour2;
		hour1 = 4;
		student1.study(hour1);
		

	}

}
