package TestRepl;

/*
 * Complete the Code. 

Handle the possible Exception of Number format Exception. 
in Catch block print the Exception Class using getClass method. 
and print the message using getMessage method.


Output

class java.lang.NumberFormatException
For input string: "akki"
 */

public class Task215 {

	public static void main(String[] args) {
		
		//int num = 0;
		try {
	    int num = Integer.parseInt ("akki");
		}catch(NumberFormatException ex) {
			System.out.println(ex.getClass());
		}
		
		System.out.println("For input string: " + "\"akki\"" );

	}

}
