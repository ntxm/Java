package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	
	String name;
	int studentID;
	
	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	
	public void display() {
		System.out.println("My name is " + name +  " and my students ID " + studentID);
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		
		//create an arraylist that will store student type of objects
		
		List<Student> students = new ArrayList<>();
		
		Student stud1 = new Student("Ann", 101);
		Student stud2 = new Student("Nastya", 102);
		Student stud3 = new Student("Jack", 103);
		Student stud4 = new Student("Lisa", 104);
		Student stud5 = new Student("Andrew", 105);
		
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		students.add(stud5);
		
		//display info of each student 
		//for each
		for(Student student: students) {
			student.display();
		}
		
		//adding more object of Student type to ArrayList
		students.add(new Student("Michael", 106));
		students.add(new Student("Madina", 107));
		students.add(new Student("Arianna", 108));
		
		
		
		System.out.println("--- New student added ---");
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			it.next().display();
		}
				

	}

}
