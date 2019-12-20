package com.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUsage {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Ann");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Sakim");
		stringList.add("Liron");
		stringList.add("Akan");
		stringList.add("Panamera");
		stringList.add("Anton");
		
		System.out.println(stringList);
		//remove names that are shorter that 4 character
		
		stringList.remove("Hasan");
		System.out.println(stringList);
		
		for(int i = 0; i < stringList.size(); i++) {
			if(stringList.get(i).length()<=4) {
				stringList.remove(i);
			}
		}
		
		System.out.println(stringList);
	
		

		
		List<String> stringList1 = new ArrayList<>();
		stringList1.add("Annaaaaa");
		stringList1.add("Hasanaaaa");
		stringList1.add("Ak");
		stringList1.add("Sakim");
		stringList1.add("Liron");
		stringList1.add("Akan");
		stringList1.add("Panamera");
		stringList1.add("Alk");
		
		Iterator<String> it = stringList1.iterator();
		while(it.hasNext()) {
			if(it.next().length()<=4) {
				it.remove();
			}
			
			System.out.println(stringList1);
			
		}
		
		
	}

}
