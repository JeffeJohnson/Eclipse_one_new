package org.in;

import java.util.List;
import java.util.ArrayList;


public class Leveltwo {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);
		l.add(80);
		l.add(90);
		
		l.add(2, 11);
		System.out.println(l);
		
		l.set(1,100);
		System.out.println(l);
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(5000);
		l1.add(100);
		l1.add(80);
		l1.add(90);
		
		
		System.out.println(l1);
		l.retainAll(l1);
		System.out.println(l);
		
		
		
		

}
}