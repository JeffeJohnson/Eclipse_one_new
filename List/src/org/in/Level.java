package org.in;



import java.util.ArrayList;
import java.util.List;
public class Level {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(25);
		l.add(15);
		l.add(95);
		l.add(205);
		System.out.println(l);
		
		
		
		Integer a = l.get(1);
		System.out.println(a);
		
		int b = l.size();
		System.out.println(b);
		
		int c= l.indexOf(10);
		System.out.println(c);
		
		
		l.set(1,33);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		
		List<Integer> l1=new ArrayList<>();
		
		l1.addAll(l);
		System.out.println(l1);
		
		l.retainAll(l1);
		System.out.println(l);
		
		l.removeAll(l1);
		System.out.println(l);
	}
	

}
