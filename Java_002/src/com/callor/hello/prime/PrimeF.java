package com.callor.hello.prime;

public class PrimeF {
	/*
	 * main에서 실행할 코드를 isprime() method로 분리 이제 main에서는 isPrime라고 호출만 하면 됨
	 */
	public static void isPrime() {
		int num = (int) (Math.random() * 100) + 2;
		int index = 0;
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

	public static void main(String[] args) {
		// isPrime 매서드를 10번반복 호출하기
		for (int i = 0; i < 10; i++) {
			isPrime();
		}
	}
}
