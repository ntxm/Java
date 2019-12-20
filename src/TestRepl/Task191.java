package TestRepl;

import java.util.ArrayList;
import java.util.List;

public class Task191 {

	public static void main(String[] args) {
		/*
		 * 
Create a ArrayList of type boolean called listA
add below to list values
(true, false, false)

Create another array list call listB

then write a logic to add the same values of listA to list B twice. 

Print the List. 

Output
[true, false, false, true, false, false]

		 */
		
		List<Boolean> listA = new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		//System.out.println(listA);
		
		List<Boolean> listB = new ArrayList<>();
		
		listB.addAll(listA);
		listB.addAll(listA);
		
		
		System.out.println(listB);
		

	}

}
