package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 20) {
			System.out.println(i);
			i++;
		}

		
		// I want to print numbers from 10 to 30 all in 1 line
		int y = 10;
		while(y <= 30) {
			System.out.print(y);
			y++;
		}
		
		//ptint ftom 10 to 1;
		
		int a = 10;
		while(a>0) {
			System.out.println(a);
			a--;
		}
		
		//print from 50 to 20
		
		int b = 50;
				
			while(b>=20) {
				System.out.println(b);
				b--;
			}
			
			
			
			System.out.println("---------------------");
			//print all even numbers from 1 to 20
			
			int c = 2;
			while(c <= 20) {
				System.out.println(c);
				c+=2;
			}
			
			
			
			System.out.println("---------------------");
			
			
			//way 2
			int q = 1;
			while(q <= 20) {
				if(q%2 == 0) {
					System.out.println(q);
					
				}
				q++;
			}
			
			
			System.out.println("---------------------");
			//print only odd number from 50 to 100
			
			
			int z = 50;
			while(z <= 100) {
				if(z%2 == 0) {
					System.out.println(z);
				}
				z++;
			}
			
			//print only even numbers from 100 to 1;
			int x = 100;
			while(x >= 0) {
				if(x%2 != 0) {
					System.out.println(x);
				}
				x--;
			}
			
			// new task
			
			
	}

}
