package com.callor.hello.method;

public class MethodHB {
	/*
	 * 정수 1개를 매개변수를 통하여 전달받고
	 * 정수가 prime인지 검사한다
	 * 만약 prime이면 정수 0을 리턴하고
	 * 아니면 index 값을 리턴한다
	 */
	public static int isPrime(int num) {
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				return index;

			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("소수 판별하기");
		System.out.println("---------------------");
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			int index = isPrime(num);
			if (index > 0) { // 소수가아님
				System.out.printf("%3d MOD %3d = %3d", num, index, num % index);
				System.out.println("");
				System.out.printf("%3d 는 소수가 아님", num);
				
			}else {
				System.out.printf("%3d 는 소수", num);
				System.out.println("");
			}
		}
	}
}
