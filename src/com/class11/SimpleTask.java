package com.class11;

public class SimpleTask {

	public static void main(String[] args) {
		
		int[][] numbers = {
			{1, 2, 5, 6},
			{10, 22, 9, 4},
			{51,2, 9, 14}
			
		}; //end of array
		
		
		// get all elements of 2D array
		for(int getArrays[]: numbers) {
			for(int getNumber: getArrays) {
				
				if(getNumber%2 == 0) {
					System.out.print(getNumber + " ");
				}
				
			}
			
			System.out.println();
		}
		
		
		
		//	
		//	for(String getArrays[]: names) {
		//		for(String getName: getArrays) {
		//			System.out.print(getName + " ");
		//		}
		

	}

}
