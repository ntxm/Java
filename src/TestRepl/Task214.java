package TestRepl;

/*
 * Exceptions 
Create a method with below Specification. 
Method Label: comparingNumber. 
return type: void
parameter:  integer number.

Method logic: 
If the given number is greater that 10, Print out  "Number is greater that 10"
else 
throw exception and say "Number is less than 10"

Handle exceptions in method using try and catch block and print the message only. 

In Main method Call the method and pass 9 as parameter. 

Ouptut: 

Number is less than 10
 */
public class Task214 {

	public static void main(String[] args) throws smallNumberException {
		
		int number = 9;
		
		try {
		comparingNumber(number);
		}catch(smallNumberException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
	public static void comparingNumber(int num) throws smallNumberException {
		if(num < 10) {
			smallNumberException ex = new smallNumberException("Number is less than 10");
			throw ex;
			
		}else {
			System.out.println("Number is greater that 10");
		}
	}

}



class smallNumberException extends Exception {
	
	public smallNumberException() {
		
	}
	
	public smallNumberException(String message) {
		super(message);
	}
}
