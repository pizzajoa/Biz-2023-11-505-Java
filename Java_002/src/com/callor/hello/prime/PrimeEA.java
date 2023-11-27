package com.callor.hello.prime;

public class PrimeEA {
	public static void main(String[] args) {
	for(int i =0; i < 5; i++) {
		int index = 0;
		boolean noPrime = false;
		int num = (int) (Math.random() * 10) + 2;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				noPrime = true;
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
	}
}
