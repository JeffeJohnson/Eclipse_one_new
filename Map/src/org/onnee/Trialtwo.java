package org.onnee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trialtwo {
	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<>();
		m.put(10, "jeffe");
		m.put(20, "hello");
		m.put(30, "clock"); 
		m.put(40, "chair");
		
		Set<Entry<Integer, String>> v = m.entrySet();
		System.out.println(v);
		
		for(Entry<Integer,String> a:v) {
		
		System.out.println(a.getKey());
		System.out.println(a.getValue());
		
	}

}
}