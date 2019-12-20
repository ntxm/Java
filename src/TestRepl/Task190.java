package TestRepl;

import java.util.ArrayList;
import java.util.List;

public class Task190 {
	
   /*
	* Create a ArrayList of Integers called listA
	*add below values to it. 
	*(0, 1, 2, 3, 4, 5)
	*Create another array list of Integer. called listB
	*
	*Create a logic to the values of listA to listB twice for each values. 
	*
	*Print the listB
	*
	*Output
	*[0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
	*/

	public static void main(String[] args) {
		
		List<Integer> listA = new ArrayList<>();
		listA.add(0);
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listA.add(5);
		
		System.out.println(listA);
		
		List<Integer> listB = new ArrayList<>();
		
		for(int i = 0; i < listA.size(); i++) {
			listB.add(listA.get(i));
			listB.add(listA.get(i));
		}
		
		System.out.println(listB);
		
		
		
		

	}

}
