package com.callor.hello.prime;

public class PrimeB {
	public static void main(String[] args) {
		/*
		 * int num = 15; for (int i = 2; i < num; i++) {
		 * System.out.printf("%d MOD %d = %d", num, i, num % i); System.out.println("");
		 * if (num % i == 0) { System.out.println("나머지가 한번이라도 0이 나타나면 소수가 아님"); } } }
		 */
		int num = 15;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.printf("%d MOD %d = %d	", num, i, num % i);
				System.out.println(num + "는 소수가 아님");
				break; // break 넣어주면 if 반복문 값이 나올 때 멈춤
			}
		}

	}
}