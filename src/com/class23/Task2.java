package com.class23;

public class Task2 {

	/* Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. 
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name.
	 * NOTE: please use different names for instance and local variables.
	 */
	
	
	//class pattern
	static String role;
	public String name;
	public int grade1, grade2, grade3;
	
	//constructor
		Task2(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
			name = studentName;
			grade1 = studentGrade1;
			grade2 = studentGrade2;
			grade3 = studentGrade3;
			
			
		}
	
	
	//method
	public void averageGrade() {
			
		int average = (grade1 + grade2 + grade3)/3;
		System.out.println("Student " + name + " has average grade: " + average);
		}
	

	
	
		public static void main(String[] args) {
			
			role = "student";
			
			Task2 student1 = new Task2("Mantie", 9, 12, 9);
			student1.averageGrade();
			
			Task2 student2 = new Task2("Allina", 12, 5, 7);
			student2.averageGrade();
			
			Task2 student3 = new Task2("Boris", 6, 5, 9);
			student3.averageGrade();
			
			Task2 student4 = new Task2("Tom", 5, 2, 9);
			student4.averageGrade();
			
			Task2 student5 = new Task2("Irma", 9, 12, 10);
			student5.averageGrade();
		}
	}

