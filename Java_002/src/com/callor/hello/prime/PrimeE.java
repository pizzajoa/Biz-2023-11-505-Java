package com.callor.hello.prime;

public class PrimeE {
	public static void main(String[] args) {

		int index = 0;
		int i = 0;
		System.out.println("==============================");
		System.out.println("소수판별하기");
		System.out.println("------------------------------");
		for (i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 10) + 2;

			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}

			}
			if (index < num) {
				System.out.printf("%d MOD %d = %d, ", num, index, num % index);
				System.out.printf(num + "는 소수가 아님\n", num);

			} else {
				System.out.printf(num + "는 소수임\n", num);
			}

		}
		System.out.println("==============================");
	}
}
