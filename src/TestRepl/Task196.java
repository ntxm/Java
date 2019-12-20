package TestRepl;

import java.util.HashSet;
import java.util.Set;

public class Task196 {
	
	/*
	 *  Set
Create a Set and and below values to it. 
[third, first, second]

Print the hashset
then remove all the elements from Hashset. 

Print the hashset

Output:

 
[third, first, second]
[]
	 */

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("third");
		hashSet.add("first");
		hashSet.add("second");
		
		System.out.println(hashSet);
		hashSet.removeAll(hashSet);
		
		System.out.println(hashSet);
	}

}
