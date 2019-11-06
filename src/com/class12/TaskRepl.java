package com.class12;

import java.util.Scanner;

public class TaskRepl {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	   
	    
	    boolean comp = true;
	    for(int i = 0; i < word.length()-1; i++) {
	    	if(word.charAt(i) != word.charAt(i+1) ) {
	    		System.out.print(word.charAt(i));
	    	}
	    }
	    	    
	    
	}

}
