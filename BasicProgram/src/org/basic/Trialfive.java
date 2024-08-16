package org.basic;


//Count of even number 1 to 100
public class Trialfive {
		public static void main(String[] args) {
		
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				count+=1;
			}
		
		}
		System.out.println("Count=="+count);
	}
}
