package com.callor.hello.prime;

public class PrimeD {
	public static void main(String[] args) { // 임의의 숫자 생성하기
		int num = (int) (Math.random() * 10) + 2;
		// 소수인가 판별하기
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}

		// 판별 결과 출력하기
		System.out.println("=======================");
		System.out.println("소수판별하기");

		if (index < num) {
			System.out.printf("%d MOD %d = %d ", num, index, num % index);
			System.out.printf(num + "는 소수가 아님\n", num);
			
			}else {
				System.out.printf(num + "는 소수임\n", num);
		}

	}
}

/*
 * double num1 = 0; for (int i = 0; i < 10; i++) {
 * 
 * num1 = Math.random(); num1 *= 10; int num2 = (int) num1; //
 * System.out.println(num2);
 * 
 * boolean noPrime = false; int index = 2; for (index = 2; index < num2;
 * index++) { if (num2 % index == 0) { // prime가 아니다 noPrime = true; break; }
 * 
 * }
 * 
 * if (noPrime) { System.out.printf("%d MOD %d = %d ", num2, index, num2 %
 * index); System.out.println(num2 + "는 소수가 아님"); } else {
 * System.out.println(num2 + "는 소수임"); } }
 * 
 * } }
 */
