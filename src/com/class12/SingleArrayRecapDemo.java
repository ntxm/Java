package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		int[] array1 = new int[4];
		array1[0] = 12;
		array1[1] = 13;
		array1[2] = 14;
		array1[3] = 15;

		
		System.out.println(array1[1]);
		
		for (int i = 0; i < array1.length; i++) {
			
		}
		
		System.out.println("==========");
		
		for (int j: array1) {
			System.out.println(j);
		}
		
		
		System.out.println("============");
		
		int[] array2 = {2, 5, 4, 7, 5, 2};
		
		for(int i = 0; i < array2.length; i++) {
			for (int j = i+1; j < array2.length; j++) {
				if(array2[i] == array2[j]) {
					System.out.println(array2[j]);
				}
			}
		}
		
		
	}

}
