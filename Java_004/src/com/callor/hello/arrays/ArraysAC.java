package com.callor.hello.arrays;

public class ArraysAC {
	public static void main(String[] args) {
		// 매직스트링 대신 변수를 선언하여 사용하기
		int arrayLength = 10;
		int searchVar = 80;
		int[] nums = new int[arrayLength];
		/*
		 *자바에서 배열을 생성(new...)하면 자동으로 .length 라는 변수가 생긴다
		 *배열 .length라는 변수를 사용하여 배열의 전체 개수를 알 수 있다
		 */
		for (int i = 0; i < nums.length ; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums[i] = rndNum;

		}
		for (int i = 0; i < nums.length ; i++) {
			if (nums[i] > searchVar) {
				System.out.printf("index %d 번 요소값 : %d\n", i, nums[i]);
				break;
			}

		}

	}

}
