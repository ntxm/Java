package com.class37;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map1.put("title", "hello");
		map2.put("title2", "hello2");
		list.add(map2);
		list.add(map1);
		
		
		HashMap<String, Object> innerMap;

        for(int i=0;i<list.size();i++)
        {
             innerMap = list.get(i);           

            for (Map.Entry<String, Object> entry : innerMap.entrySet())
            {
                System.out.println(entry.getKey() + "/" + entry.getValue());
            }
        }


		
	}

}
