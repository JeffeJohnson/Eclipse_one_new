package org.in;

import java.util.ArrayList;
import java.util.List;

public class Levelthree {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(17);
		l.add(22);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);
		l.add(80);
		l.add(90);
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(11);
		l1.add(80);
		l1.add(90);
		
		l.removeAll(l1);
		System.out.println(l);
		

}
}