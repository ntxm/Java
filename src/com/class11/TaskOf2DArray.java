package com.class11;

public class TaskOf2DArray {

	public static void main(String[] args) {
		
		int[][] numbers = {
				{8, 7, 5, 3},
				{1, 5, 6, 4},
				{3, 6, 8, 1},
				
		}; // end array
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				
				sum = sum + numbers[i][j];
			}
			System.out.println();
		}
		
		System.out.println("The sum of all elements in array is = " +sum);
		
		int sum1 = 0;
		for(int nums[]: numbers) {
			for(int getNum: nums) {
				sum1= sum1 + getNum;
			}
		}
		System.out.println("The sum of all elements in array is = " +sum1);
		
		
		
		
		
	}

}
