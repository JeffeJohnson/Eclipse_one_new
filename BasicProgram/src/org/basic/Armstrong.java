package org.basic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(isArmstrong(num)) {
		System.out.println("Armstrong Number ...."+num);
		}else
		{
			System.out.println("Not Armstrong Number");
		}	
		s.close();
	}
	public static boolean isArmstrong(int num) {
		int sum=0;
		int original=num;
		int digits=countDigit(num);
		
			while(num!=0) {
				int val=num%10;
				sum+=Math.pow(val, digits);
				num/=10;
			}
			return original == sum;
			}

	public static int countDigit(int num) {
			int count=0;
			while(num !=0) {
				num /=10;
				count++;
			}
			return count;
			
	}
		
	}			
		
	
	


