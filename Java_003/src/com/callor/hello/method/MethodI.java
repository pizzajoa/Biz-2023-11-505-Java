package com.callor.hello.method;

public class MethodI {
	

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
			System.out.println("소수 합 구하기");
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

