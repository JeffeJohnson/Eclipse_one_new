package org.basic;

public class PrimeOne {
	public static void main(String[] args) {
		int num=2;
		int count=0;
		while(count<50) {
			if(isPrime(num)){
				System.out.println(num);
				count++;
				}
			num++;
		}
	}


	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
		
		
		
	}
}





