package TestRepl;

public class Student extends Person {
	  Student(String name, String lastName, int age, int grade) {
		super(name, lastName, age);
		this.grade = grade;
	}

	int grade;
	  
	  void printStudent(){
	    System.out.println(name + " " + lastName + " " + age + " " + grade);
	  }
	}
