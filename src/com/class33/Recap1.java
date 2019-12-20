package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recap1 {

	public static void main(String[] args) {
		
		int a;
		a = 10;
		
		int b = 20;
		
		Student s1 = new Student("Salim", 109);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(new Student("Zeyman", 110));
		list.add(new Student("Hasan", 111));
		list.add(new Student("Jaime", 112));
		list.add(new Student("Ozlem", 113));
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			//Student st = it.next();
			//System.out.println(st.name);
			
			System.out.println(it.next().name);
		}
	}

}
