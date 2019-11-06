package com.class12;

public class Task {

	public static void main(String[] args) {
		//Create to String and initialize them with some value
		//implement the 
		
		String sent = "My name is Natalie";
		String sent1 = "My name is Serge";
		String sent2 = "MY NAME IS Natalie";
		
		System.out.println(sent.length());
		System.out.println(sent.equals(sent1));
		System.out.println(sent1.contains("s"));
		System.out.println(sent.toUpperCase());
		System.out.println(sent.toLowerCase());
		System.out.println(sent.equalsIgnoreCase(sent2));
		
		// The java string replace() 
		//method returns a string replacing all the old char or CharSequence 
		//to new char or CharSequence.
			String s1="javatpoint is a very good website";  
			String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
			System.out.println(replaceString);  
			

		// toCharArray(); ==> convert string to char array
			
			
			 String str1="Welcome To Syntax Solutions" ;
			    char[] charArray = str1.toCharArray();
			    
			   for (char output: charArray) {
			      System.out.println(output);
			    }
			
			
		
		System.out.println("=========");

		//This method tests if this string starts with the specified suffix
		String str2 = "It is very hot in the class";
		System.out.println("Is line starts with 'it'?  " + str2.startsWith("It"));
		
		
		//This method tests if this string ends with the specified suffix
				String str3 = "It is very hot in the class";
				System.out.println("Is line starts with 'it'?  " + str3.endsWith("ss"));
		
				
		
		
	}

}
