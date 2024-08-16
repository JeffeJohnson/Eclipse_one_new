package org.onnee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trialone {
	public static void main(String[] args) {
		
		Map<Integer,String> a=new HashMap<>();
		a.put(10, "jeffe");
		a.put(20, "hello");
		a.put(30, "clock"); 
		a.put(40, "chair");
		Set<Entry<Integer, String>> b = a.entrySet();
		System.out.println(b);
		
		for(Entry<Integer,String> c:b) {

			System.out.println(c.getKey());
			System.out.println(c.getValue());
			
		}
		
		
		
		
	}

}
