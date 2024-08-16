package org.emp;

public class Static {
	
	public static int a;
	private void add() {
		a=100;
		System.out.println("A IN METHOD..."+a);

	}
	public static void main(String[] args) {
		Static s = new Static();
		System.out.println("A before intialize.."+a);
		s.add();
		System.out.println("A after intialize.."+a);
		Static s1 = new Static();
		System.out.println(a);
		
		
	}

}


