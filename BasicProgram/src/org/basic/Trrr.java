package org.basic;

import java.util.Scanner;

public  class Trrr{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(isArmstrong(num)) {
			System.out.println("A");
		}else 
		{
			System.out.println("N");
		}
		s.close();
		
	}
	

	public static boolean  isArmstrong(int num) {
		int sum=0;
		int original=num;
		int digit=count(num);
		while(num!=0) {
			int val=num%10;
			sum+=Math.pow(val, digit);
			num/=0;
			
		}
		return original==sum;
		
		
		
		}
	public static int count(int num) {
		int count=0;
		while(num!=0) {
			num/=0;
			count++;
		}
		return count;
	}
	
	
	
}