package com.class11;

public class TaskHW {
	public static void main(String[] args) {
		
/*		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
	
	int sum = 0;
	for(int row = 0; row < a.length; row++) {
		if(row == 2) {
			for(int column = 0; column < a[row].length; column++) {
				sum += a[row][column];
				
			}
			System.out.print(sum);
			
		}
	} 
	
	
	int[][] a = {
			{1,1,1,1,1},
			{1,1,1,1,1},
			{1,1,1,1,1},
			{1,1,1,1,1},
			{1,1,1,1,1}
		};
		
		int sumRowCount = 0;
		int sumColCount = 0;
		int row;
		for(row = 0; row < a.length; row++){
		  sumRowCount++;
		  
		  for(int col = 0; col < a[row].length; col++){
		    sumColCount++;
		    }
		  }
		  
		  if(sumRowCount == sumColCount/sumRowCount){
		    System.out.println("true");
		  }else{
		    System.out.println("false");
		} */
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			 //should print -6
			 
			 int count = 0;
			 //int columnCount = 0;
			 
			 for(int row = 0; row < a.length; row++){
			   for(int column = 0; column < a[row].length; column+=2){
			     count += a[row][column];
			     System.out.println(a[row][column]);
			   }
			 }
		  System.out.println(count);
			
	
	
	
}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


