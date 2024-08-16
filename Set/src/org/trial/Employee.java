package org.trial;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	public static void main(String[] args) {
		//		User defined set
		Set<Student> s=new HashSet<>();
		
		//1 student
		Student a=new Student();
		a.setId(123);
		a.setName("Jeffe");
		a.setPhno(98425525616l);
		
		//2 student
		Student b=new Student();
		b.setId(923);
		b.setName("Jaden");
		b.setPhno(98425525616l);	
		
		s.add(a);
		s.add(b);
		for(Student x:s) {
				System.out.println(x.getId());
				System.out.println(x.getName());
				System.out.println(x.getPhno());
		
		
		
	}

}
}