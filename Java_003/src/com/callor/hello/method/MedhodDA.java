package com.callor.hello.method;

public class MedhodDA {
	/*
	 * 30과 40을 덧센하여 리턴
	 */
	public static int add() {
		int num1 = 30;
		int num2 = 40;

		int result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {
		/*
		 * add method가 리턴값은 int type이므로 int type 변수를 선언하고 리턴값을 할당(보관)
		 */

		int sum = add();
		System.out.println("함수 return 값" + sum);
	}
}
