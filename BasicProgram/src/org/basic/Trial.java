package org.basic;

import java.util.Scanner;

public class Trial {
	
	public static void main(String[] args) {
			
		  
		Scanner s= new Scanner(System.in);
		System.out.println("user input....");
		int age= s.nextInt();
		System.out.println("Age is...."+age);
	
		if(age >= 18) {
			System.out.println("Can Vote!!!");
		}
		else {
			System.out.println("Cannot Vote!!!!");
			}
		
	
		s.close();
}
}

