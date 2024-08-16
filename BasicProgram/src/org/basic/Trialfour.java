package org.basic;


//Find the sum of odd number 1 to 100
public class Trialfour {
	public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=100;i++) {
		if(i%2!=0) {
			sum+=i;
		}
	}
	System.out.println("Sum=="+sum);
}
}