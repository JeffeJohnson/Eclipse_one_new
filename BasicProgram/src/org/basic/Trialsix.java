package org.basic;

import java.util.Scanner;

//factorial of a number

public class Trialsix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.close();
		int num = s.nextInt();
		System.out.println("Fact ..."+num);
		
		int mul = 1;
		for(int i=1;i<=num;i++) {
			mul=mul*i;
		
		}System.out.println(mul);
	}	
	
}
