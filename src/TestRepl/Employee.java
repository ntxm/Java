package TestRepl;

public class Employee extends Person {
	  

	Employee(String name, String lastName, int age, int salary) {
		super(name, lastName, age);
		this.salary = salary;
	}

	int salary;
	  
	  void printEmployee(){
	    System.out.println(name + " " + lastName + " " + age + " " + salary);
	  }
	  
	}