package com.callor.hello.arrays;

public class ArraysD {
	public static void main(String[] args) {

		int[] nums = new int[10];
		int index = 0;
		for (index = 0; index < 10; index++) {
			nums[index] = (int) (Math.random() * 50) + 51;
		}
		if (nums[index] % 2 == 0) {
			for (int i = 0; i < 10; i++) {
				
				System.out.printf("%d 번째 저장된 값 : %d\n", i + 1, nums[i]);
			}

			int sum = 0;
			for (int i = 0; i < 10; i++) {
				sum += nums[i];
			}

			System.out.println("합계 " + sum);
		}

	}
}
