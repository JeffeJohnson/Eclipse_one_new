package org.basic;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int input = s.nextInt();
		System.out.println("Input is...."+input);
		s.close();
		
		boolean isPrime= true;
		
		for(int i=2;i<input;i++) {
			
			if(input%i == 0) {
				isPrime=false;
				break;
			}
		}	
		if(isPrime) {
			System.out.println("Prime");		
		}
		else {
			System.out.println("Not Prime");
		}
			
		


	}
}
