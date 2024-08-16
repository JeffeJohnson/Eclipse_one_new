package org.emp;

public class Local {
	private void add() {
		int a=10;
		System.out.println("A IS.."+a);

	}
	public static void main(String[] args) {
		int a=100;
		System.out.println("A IN MAIN ..."+a);
		
		Local l = new Local();
		l.add();
		
		
	}

}
