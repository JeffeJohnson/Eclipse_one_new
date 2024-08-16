package org.excp;

public class Two {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			
			String s=null;
			System.out.println(s.length());
			
			System.out.println(7/0);
			
		}catch (ArithmeticException e) {
			System.out.println("Am in 1 catch");
		}catch (NullPointerException e) {
			System.out.println("Am in 2 catch");
		} 
			
		
		System.out.println(4);
		System.out.println(5);
		
		
	}
}
