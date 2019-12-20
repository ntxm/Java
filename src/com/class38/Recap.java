package com.class38;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		
		//runtime - unchecked exception
		int num = 1;
		int[] nums = {12, 13};
		System.out.println(nums[2]);
		
		//compile time - checked
		Thread.sleep(1000);
	}

}
