package com.callor.hello.prime;

public class PrimeEB {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

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
			} // end 출력
		}
	} // end main
}
