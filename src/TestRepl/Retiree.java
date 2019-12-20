package TestRepl;

public class Retiree extends Person {
	 Retiree(String name, String lastName, int age, String seniorActivity) {
		super(name, lastName, age);
		this.seniorActivity = seniorActivity;
	}

	String seniorActivity;
	 
	  void printRetiree(){
	    System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
	  }
	}
