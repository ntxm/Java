package com.class10;

import java.util.Scanner;

public class Task75 {

	public static void main(String[] args) {
		
		 int i, j;
		    
		    for(i = 1; i < 4; i++){ //rows
		      
		      for(j = 1; j < 5; j++) { //column
		      	if(i == 2 && j == 2 || i == 2 && j == 3 || i == 3 && j == 2 || i == 3 && j == 3 ) {
		      		System.out.print(" ");
		      	}else {
		      		System.out.print("$");
		      	}
		    }
		      
		    	System.out.println(" ");
		    	
	}

	
	System.out.println("-----------------------------");	    
		    
		    int rows, columns;
		    
		    for(rows = 1; rows < 6; rows++) {
		    	
		    	for(columns = 1; columns < 11; columns++) {
		    		System.out.print(columns + " ");
		    		
		    		
		    	}
		    	
		    	System.out.println(" ");
		    }
		    
		   
		    
		  // ---------------------------
		   
		    
		    /*System.out.println("---------------------");
		    
		    Scanner scan = new Scanner(System.in);
			  int index;
			  int[] array = new int[5];
			  
			  System.out.println("Enter 5 values for an array:");
			  for(index = 0; index < array.length; index++){
			    
			    array[index] = scan.nextInt();
			  }
			  System.out.print(array[index]);  */
		    
		    
		    System.out.println("88888888888************888888888888888");
		    
		    
		    int k, m;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter  size array:");
		    //int size = scan.nextInt();
		   int[] array = new int[5];
		    
		    
		    for(k = 0; k < 5; k++) {
		    	System.out.println("Enter the value " + k);
		    	array[k] = scan.nextInt();
		    }
		    System.out.println(array.length);
		    
		    for(m = 0; m < array.length; m++) {
		    	System.out.println(array[m]*10 + " ");
		    	
		    }
		    	
		    System.out.println("---------");
		    
		    
		    
}
}
