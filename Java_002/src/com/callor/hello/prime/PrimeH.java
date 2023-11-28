package com.callor.hello.prime;

public class PrimeH {
	public static void main(String[] args) {
		System.out.println("==================================");

		int sum = 0;
		for (int i = 1; i < 100; i++) { // 범위 설정

			int num = i + 1; // 나눌 항목
			int index = 0;
			for (index = 2; index < num; index++) {
				if ((num) % index == 0) { //나눈 값이 0이 되면 소수아님
					break;
				}
			}
			if (index < num) {
			} else {
				sum = num + sum;
			}
		}
		System.out.println("2 ~ 100까지 수 중 소수들의 합 : " + sum);
		System.out.println("==================================");
	}

}