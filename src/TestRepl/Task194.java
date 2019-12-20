package TestRepl;

import java.util.HashSet;

public class Task194 {
	
	/*
	 * Set 
Create a Hashset and add below values to it. 

Red
Pink
Yellow
White
Black
print the colors 
and get total number of colors available in the set

Output:
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
	 */

	public static void main(String[] args) {
		
		HashSet<String> colorSet = new HashSet<>();
		
		colorSet.add("Red");
		colorSet.add("Pink");
		colorSet.add("Yellow");
		colorSet.add("White");
		colorSet.add("Black");
		
		System.out.println("Original Hash Set: " + colorSet);
		System.out.println("Size of the Hash Set: " + colorSet.size());
		

	}

}
