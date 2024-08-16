package org.basic;

import java.util.Scanner;

public class Countnumber {
	
		
		int count=0;
		private void countNum(int value) {
			while(value!=0) {
				value/=10;
				count++;
			}
			System.out.println("Count..."+count);
		}	
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			int value = s.nextInt();
			System.out.println("Input is..."+value);
			s.close();
			Countnumber a = new Countnumber();
			a.countNum(value);
}
}