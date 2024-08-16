package org.basic;

import java.util.Scanner;

public class Palindromestring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(str);
		s.close();
		ispalin(str);
		if(ispalin(str)) {
			System.out.println("Palindrome=="+str);
		}
		else {
			System.out.println("Not Palindrome=="+str);
		}
			
		
		
	}
	public static boolean ispalin(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}return rev.equals(str);
			
		}
	}


