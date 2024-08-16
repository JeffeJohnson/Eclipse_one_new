package org.excp;

public class One {
	public static void main (String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3/0);
		}
		finally {
			System.out.println("sucess");
		}
		System.out.println(4);
		System.out.println(5);
		

}
}