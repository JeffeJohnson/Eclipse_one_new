package org.in;

import java.util.ArrayList;
import java.util.List;
public class Levelone {
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
		
		int a = l.size();
		System.out.println("size"+a);
		
		Integer e = l.get(2);
		System.out.println("Value"+e);
		
		int c= l.lastIndexOf(10);
		System.out.println("Last Index"+c);
		
		
		Integer g = l.remove(2);
		System.out.println("REmoved element"+g);
		
		
		for(int l1:l) {
			System.out.println(l1);
		}
		
		
		List<Integer> indices = new ArrayList<>();
		for(int i=0;i<a;i++) {
			if(l.get(i)==10) {
				indices.add(i);
				System.out.println("Indices"+indices);
			
			}
		
		}	
		
	}
	

}
