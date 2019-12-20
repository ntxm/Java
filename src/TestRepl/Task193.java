package TestRepl;

import java.util.Iterator;
import java.util.LinkedList;

public class Task193 {
	
	/*
	 * Link List
Create a linkList of type Integer call list, 
Add the values below. 
111
222
333
444
555
666

Create a logic to calculate sum of the all the values in list. 

Print the result only. 

Output. 
Result of sum is 2331

	 */

	public static void main(String[] args) {
		
		int sum = 0;
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		
		//System.out.println(list);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			sum = sum + it.next();
		}
		
		System.out.println("Result of sum is " + sum);
		

	}

}

