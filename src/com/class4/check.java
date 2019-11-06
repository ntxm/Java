package com.class4;

public class check {
	public static void main(String[] args) {
	
	boolean hasDiploma = true;
    double gpa = 3.2;
    
    //check if student have Diploma
    if(hasDiploma) {
        System.out.println("Congratulations");
    
        // Diploma = true --> check GPA.
        if (gpa >= 3.5) {
        	//more or equal 3.5
            System.out.println("You are eligible for scholarship");
    } else {
        // less than 3.5
        System.out.println("You should have studied harder");
    	}
    } else {
        // no Diploma
     System.out.println("get a degree");
} // close last else

} // close main mathod
} //close class	



