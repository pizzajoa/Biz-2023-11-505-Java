package com.callor.hello.arrays;

public class ArraysDA {
	public static void main(String[] args) {

		int[] nums = new int[10];
		for(int i = 0 ; i < 10; i ++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for(int i = 0 ; i < 10 ; i++) {
			if (nums[i] % 2 == 0) {
				System.out.printf("%d 번요소의 값 : %d\n", i + 1, nums[i]);
			}
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if(nums[i] % 2 ==0) {
				sum += nums[i];
			}
		}
		System.out.println("합계 " + sum);
}
}