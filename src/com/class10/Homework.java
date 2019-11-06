package com.class10;

public class Homework {

	public static void main(String[] args) {
		
		int rows;
		
		for(rows = 1; rows < 6; rows++) { // 5 rows
			
			for(int columns = 5; columns >= rows; columns--) {
				System.out.print(" ");
				
				
			}
			
			for(int k = 0; k < rows; k++) {
				System.out.print(rows);
			
			}
			
			System.out.println(" ");
		}
		
		
		System.out.println("---------------------------------");
		
		 int i;
		    
		    for(i = 0; i < 3; i++){ //rows
		      System.out.print("$");
		      
		      	for(int j = 0; j < 3; j++) { //columns
		      		
		      		if(i == 0 || i == 3 || j == 0 || j == 3) {
		      			System.out.print("$");
		      			}else {
		      				System.out.print(" ");
		      			}
		      		
		      		
		      		
		      		
		    }
		      	
		      	System.out.println(" ");
		      	
		      	}
		    
		    
		    
			System.out.println("======================");

			
			
			 int[] array = {45, 78, 12, 67, 55, 89, 23, 77, 88};
			    int i1;
			    int index;
			    
			      for(i1 = 0; i1 < array.length; i1++){
			        
			          index = array[i1];
			        
			          if(index%2 == 0){
			            System.out.print(array[i1] + " ");
			          }
			
			
			
}	
}
}