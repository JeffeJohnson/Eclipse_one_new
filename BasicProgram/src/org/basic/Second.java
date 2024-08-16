package org.basic;

public class Second {
	public static void main(String[] args) {
		int[] nums= {3,5,7,1,9};
		System.out.println("ans==="+findSecound(nums));
		
	}
	
	
	public static int findSecound(int[] nums) {
		int largest=nums[0];
		int secound=nums[1];
		if(largest<secound) {
			int temp=largest;
			largest=secound;
			secound=temp;
		}
		for(int i=2;i<=nums.length;i++) {
			if(nums[i]>largest) {
				secound=largest;
				largest=nums[i];
			}else if(nums[i]>secound&&nums[i]!=largest) {
				secound=nums[i];
			}
			
		}
		return secound;
		
		
		
	}
	
	
	
	
	
	
	

}
