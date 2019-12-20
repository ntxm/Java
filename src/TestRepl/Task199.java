package TestRepl;
/*
 * Set
Create a Hashset 
Add the below values 
null
shiva 
sandish
asel
sumair 
 
print the values and than 

Check the set contain a null value. 

print the result of check. 

output 
 
[null, asel, sandish, shiva, sumair]
true
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task199 {

	public static void main(String[] args) {
		
		Set<String> names = new LinkedHashSet<>();
		names.add(null);
		names.add("asel");
		names.add("sandish");
		names.add("shiva");
		names.add("samuir");
		
		System.out.println(names);
		boolean x = names.contains(null);
		System.out.println(x);

	}

}
