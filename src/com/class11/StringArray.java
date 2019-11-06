package com.class11;

public class StringArray {

	public static void main(String[] args) {
		
		//Declare 2D Array
		int[][] array = new int [3][5]; // 3 rows, 5 columns
		
		//first row
		array[0][0] = 44;
		array[0][1] = 80;
		array[0][2] = 33;
		array[0][3] = 20;
		
		//second row
		array[1][0] = 10;
		array[1][1] = 5;
		array[1][2] = 7;
		array[1][3] = 8;
		
		//3rd row
		
		array[2][0] = 10;
		array[2][1] = 9;
		array[2][2] = 70;
		array[2][3] = 8;
		
		
		System.out.println(array[0][0]);
		System.out.println(array[2][3]);
		System.out.println(array[0][2]);
		
		// TASK: create 2D an array of String with 2 and 3 columns;
		
		String[][] names = new String[2][3]; 
		
		//row 1
		names[0][0] = "John";
		names[0][1] = "Monica";
		names[0][2] = "Alley";
		
		//row 2
		
		names[1][0] = "Paul";
		names[1][1] = "Gergina";
		names[1][2] = "Shelly";
		
		
		System.out.println(names[1][2]);
		System.out.println(names[0][2]);
		System.out.println(names[1][0]);
		
		
		// example
		
		int[][] numbers = { // array method
				{8, 7, 5, 3, 8}, // 1st row
				{1, 5, 6, 4, 9}, // 2nd row
				{3, 6, 8, 0, 7}  //3rd row
				
		}; // end array method

		System.out.println(numbers[1][4]);
		System.out.println(numbers[0].length); // length of 1 row
		
		// to identify the numers of Rows
		System.out.println("the numers of Rows are: " + numbers.length);
		//to identify the numbers of Columns/elements in that row
		System.out.println(numbers.length);
		
		
		//Print 2D array
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j= 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}
	 
		
	}

}
