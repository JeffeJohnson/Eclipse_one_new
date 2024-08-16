package org.onnee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	public static void main(String[] args) {
		Map<String,Student> m =new HashMap<>();
		
		//1 student
		Student a =new Student();
		a.setid(123);
		a.setname("Jeffe");
		a.setphno(9834252566l);
		
		//2 student
		Student b=new Student();
		b.setid(321);
		b.setname("Jayden");
		b.setphno(9342567778l);
		
		//add values to map
		m.put("1: student", a);
		m.put("2: student", b);
		
		//to read values
		Set<Entry<String, Student>> en = m.entrySet();
		
		for(Entry<String,Student> x:en) {
			System.out.println(x.getKey());
			System.out.println(x.getValue().getid());
			System.out.println(x.getValue().getname());
			System.out.println(x.getValue().getphno());
		}
		
		
		
	}
	
		
		
	}

