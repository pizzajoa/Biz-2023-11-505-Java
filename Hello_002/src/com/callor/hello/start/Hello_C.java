package com.callor.hello.start;

public class Hello_C {
	
	// num1, num2 변수는 main이 예약한 변수기에 어떤 정수이던지 보관이 가능하다
	
	public static void main(String[] args) {
		// 변수를 예약하고 clear하기
		int num1 = 0;
		int num2 = 0;

		// 예약된 변수에 실제 사용할 값(정수)을 보관하기
		num1 = 30;
		num2 = 40;
		//이미 값이 보관된 변수에 새로운 값을 보관하기
		//보관되어 있던 30, 40 값은 clear된다
		num1 = 300;
		num2 = 400;
		// 변수 num1과 num2에 보관된 값을 Console 에 출력하라
		
		// 예약된(선언된) 변수에 보관된 값을 재활용하여 4칙연산과 나머지 연산을 수행하기
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}
}
