package com.callor.hello.arrays;

public class ArraysEA {
	public static void main(String[] args) {
		int num = 0; // 정수형 변수 num을 선언하고 0으로 초기화

		int[] nums = new int[10];

		/*
		 * nums가 10개인 배열 생성. 변수 배열선언문: 변수와 배열 생성하기 숫자형(int, long, float, double ,short)
		 * 배열은 선언을 하면 모든 요소가 자동으로 0으로 초기화 된다
		 */
		// 배열의 각 요소에 랜덤수를 저장(할당)하기
		for (int index = 0; index < 10; index++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums[index] = rndNum;
			
		}
		/*
		 * 배열에 저장된 값들 = 배열의 각 요소에 저장된 값 중에서 80보다 큰 값들만 찾아서 화면에 출력
		 */
		if(nums[0] > 80 ) {
			System.out.println(nums[0] + "값은 80보다 크다");
		}
		for(int i = 0 ; i < 10 ; i++) {
			if(nums[i] > 80) {
				System.out.printf("index %d 번 요소의 값 %d\n", i , nums[i]);
			}
			
		}
	}
}
