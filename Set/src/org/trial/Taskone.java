package org.trial;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Taskone {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		
		Set<Integer> s= new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(55);
		System.out.println(s);
		s.addAll(l);
		System.out.println(s);
		
		
		
		
	}

}
