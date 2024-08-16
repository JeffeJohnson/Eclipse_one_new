package org.basic;

import java.util.Scanner;

public class Reverse {
	
		int rev=0;
		
		private void reverseNum(int value) {
			while(value!=0) {
				int lastdigit=value%10;
				rev=rev*10+lastdigit;
				value/=10;
		
			}System.out.println("Reverse value is .."+rev);
		}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int value = s.nextInt();
			System.out.println("Input is..."+value);
			s.close();
			Reverse r = new Reverse();
			r.reverseNum(value);
		}	
			
		
}

