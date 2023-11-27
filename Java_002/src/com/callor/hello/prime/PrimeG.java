package com.callor.hello.prime;

public class PrimeG {
	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println("2~100까지 수 중 소수만 출력하기");
		System.out.println("-------------------------------");
		for (int i = 2; i < 100; i++) { // 2~100까지 설정

			int num = 0;

			for (int index = 2; index < i; index++) { // 나눌 값
				if (i % index == 0) {
					
					num = num + 1;
				}
			}
			if (num == 0) { // 횟차 올라가면 소수가 아님
				System.out.println(i + "는 소수임");
			}
		}
		System.out.println("===============================");
	}
}
