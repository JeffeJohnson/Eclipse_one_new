package org.basic;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Input is=="+num);
		s.close();
		int result=addNum(num);
		System.out.println("RESULT =="+result);
		
	}
		public static int addNum(int num) {
			int sum=0;
			while(num!=0) {
				int val=num%10;
				sum+=val;
				num/=10;
			
			}return sum;
		
			
	}
}

