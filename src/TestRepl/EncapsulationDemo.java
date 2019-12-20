package TestRepl;

public class EncapsulationDemo {
	  
	  private String empName;
	  private int empAge;
	  
	  public void setName(String empName) {
	    this.empName = empName;
	  }
	  
	  public void setAge(int empAge) {
	    this.empAge = empAge;
	  }
	  
	  public String getName() {
	    return this.empName;
	  }
	  
	  public int getAge() {
	    return this.empAge;
	  }
	  
	}