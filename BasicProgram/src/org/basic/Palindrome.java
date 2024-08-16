package org.basic;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Input is=="+num);
		s.close();
		if(ispalin(num)) {
			System.out.println("Palindrome=="+num);	
		}else {
			System.out.println("Not Palindrome=="+num);	
		}
}
		public static boolean ispalin(int num) {
			int rev=0;
			int original=num;
			while(num!=0) {
				int lastdigit=num%10;
				rev=rev*10+lastdigit;
				num/=10;
					
			}
			return original==rev;
			
			
		}








}