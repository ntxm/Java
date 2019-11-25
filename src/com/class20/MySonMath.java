package com.class20;

public class MySonMath {
	public String name; // access from everywhere
	String phone; //within the package
	private String SSN; //
	protected String birthday;
	
	
	//public can be seen/access from everywhere
	public void add1() {
		
	}
		
		//default can be seen/access within package
		void add2(int num1, int num2) {
			
		}
			//protected can be seen/access within package
			protected int add3() {
				int result = 0;
				return result;
				
				
			}	
				//private can be seen/access within this class
				private int add4(int num1, int num2) {
					int result = 0;
					return result;
					
					
				}
			
}
