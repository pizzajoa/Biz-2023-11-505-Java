package com.callor.hello.arrays;

public class ArraysA {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for ( int index = 0 ; index < 10 ; index++) {
			int rndNum = (int)(Math.random()*50) +51;
			nums[index] = rndNum;
			
			
		}
		if (nums[0]>80) {
			System.out.println(nums[0] + "값은 80보다 크다");
			
		}
		
		
	
	}
	
}
