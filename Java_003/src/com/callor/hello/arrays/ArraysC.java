package com.callor.hello.arrays;

public class ArraysC {
	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int index = 0 ; index < 5 ; index ++) {
			// 배열 5개 선언하기
			nums[index] = (int)(Math.random()*50) + 51;
		//배열에 임의의 값 저장하기
		} 
		//배열에 저장된 값 출력하여 확인하기
		for(int i = 0; i < 5 ; i++) {
			System.out.printf("%d 번째 저장된 값 : %d\n", i + 1, nums[i]);
		}
		//배열에 저장된 값들을 합산하기
		int sum = 0;
		for(int i = 0 ; i < 5 ; i++) {
			sum += nums[i];
		}
		System.out.println("합계 " + sum);
		
	}
}