package org.trial;

import java.util.Set;
import java.util.TreeSet;

public class Tasktwo {
	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<>();
		s.add(100);
		s.add(500);
		s.add(105);
		s.add(250);
		s.add(300);
		
		Set<Integer> s1=new TreeSet<>();
		s1.add(120);
		s1.add(500);
		s1.add(10);
		s1.add(250);
		s1.add(30);
		s.removeAll(s1);
		System.out.println(s);
		
		
		
	}

}
