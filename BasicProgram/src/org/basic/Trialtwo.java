package org.basic;

////Write a program to find even or odd number
import java.util.Scanner;

public class Trialtwo {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("User Input..");
		int value= s.nextInt();
		System.out.println("Value is....."+value);
		if(value%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		s.close();
	}
	
}
