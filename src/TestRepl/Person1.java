package TestRepl;

public class Person1 {
	  
	  private String firstname;
	  private String lastname;
	  private int birthmonth;
	  private int birthday;
	  private int birthyear;
	  private String ssn;
	  private String dob;
	  
	  Person1(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.birthmonth = birthmonth;
	    this.birthday = birthday;
	    this.birthyear = birthyear;
	    this.ssn = ssn;
	    
	  }
	  
//	  public void setFirstName() {
//	    this.firstname = firstname;
//	  }
//	  
//	  public void setLastName() {
//	    this.lastname = lastname;
//	  }
//	  
//	  public void setBirthMonth() {
//	    this.birthmonth = birthmonth;
//	  }
//	  
//	  public void setBirthDay() {
//	    this.birthday = birthday;
//	  }
//	  
//	  public void setBirthYear() {
//	    this.birthyear = birthyear;
//	  }
//	  
//	  public void setSsn() {
//	    this.ssn = ssn;
//	  }
//	  
	  
	  // ----------- Getters -----------
	  
	  public String getFirstName() {
	    return this.firstname;
	  }
	  
	  public String getLastName() {
	    return this.lastname;
	  }
	  
	  public int getBirthMonth() {
	    return this.birthmonth;
	  }
	  
	  public int getBirthDay() {
	    return this.birthday;
	  }
	  
	  public int getBirthYear() {
	    return this.birthyear;
	  }
	  
	  public String getSsn() {
	    return this.ssn;
	  }
	  
	  public String formatBirthday() {
		  
		  dob = this.getBirthMonth() + "/" + this.getBirthDay() + "/" + this.getBirthYear();
		  return dob;
	    
	  }
	  
	  
	}
