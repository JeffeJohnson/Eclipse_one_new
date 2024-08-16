package org.emp;

public class Instance {
	
	int a;
	private void add() {
		int a=100;
		System.out.println("A IN METHOD..."+a);

	}
	public static void main(String[] args) {
		Instance i = new Instance();
		System.out.println("A before intialize.."+i.a);
		i.add();
		System.out.println("A after intialize.."+i.a);
		Instance b = new Instance();
		System.out.println(b.a);
		
		
	}

}
