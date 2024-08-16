package org.addd;

public class Trails {
	public static void main(String[] args) {
		int[] mark = new int[10];
		mark[0]=10;
		mark[1]=20;
		mark[2]=25;
		mark[3]=50;
		mark[4]=60;
		mark[5]=15;
		mark[6]=65;
		mark[7]=30;
		mark[8]=45;
		mark[9]=50;
		
		int total=0;
		for(int marks:mark) {
			total+=marks;
		
		}
		double average= (double)total/mark.length;
		System.out.println("Average==="+average);
		System.out.println("Sum==="+total);
		
		
	}

}
