package org.in;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public static void main(String[] args) {
//		User defined list
		List<College> l=new ArrayList<>();
		
		//1 student
		College a= new College();
		a.setid(123);
		a.setName("Jeffe");
		a.setPhno(98532344455l);
		
		//1 student
		College b= new College();
		b.setid(323);
		b.setName("Jaden");
		b.setPhno(76432344455l);
		
		l.add(a);
		l.add(b);
		
		int w = l.size();
		System.out.println(w);
		
		
		
		for(int i=0;i<w;i++) {
			System.out.println(l.get(i).getid());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getPhno());
			
		}
		
		
		
		
		
		
		
	}
}
