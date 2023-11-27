package com.callor.hello.algorithm;

public class AlgA {
	public static void main(String[] args) {
		/*
		 *  1~100까지 숫자중의 3의 배수의 합
		 */
/*		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}

		}
		System.out.println("3의 배수의 합" + sum);
	*/
		
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			int num = i + 1;
			if (i % 3 == 0) {
				sum += num;
			}

		}
		System.out.println("3의 배수의 합" + sum);
		
	}
}
