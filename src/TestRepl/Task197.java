package TestRepl;

import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet
Create Tree Set of type String 
Please add the below values and see the result 
"India"
"Australia"
"South Africa"
"India"
"America"
"America"

Print the Set. 

Output: 
[America, Australia, India, South Africa]
 */
public class Task197 {
	
	public static void main(String[] args) {
		
		Set<String> country = new TreeSet<>();
		country.add("India");
		country.add("Australia");
		country.add("South Africa");
		country.add("India");
		country.add("America");
		country.add("America");
		
		System.out.println(country);
	}

}
