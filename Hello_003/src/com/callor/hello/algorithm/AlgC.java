package com.callor.hello.algorithm;

public class AlgC {
	public static void main(String[] args) {
		
		int num1 = 33333;
		boolean bYes = false;
		
		/*
		 * num1 % 2의 연산결과는 0 또는 1의 값인 정수형이다
		 * 이 결과값을 변수에 할당하려면 변수는 int형이어야 한다
		 * 하지만 num1 % 2 == 0은 실제적으로 (num1 % 2) == 0과 같다
		 * 이 결과값을 변수에 할당하려면 변수는 boolean형이어야 한다
		 * 이때 byes에 할당된 값은 num1의 값이 짱수이면 true 홀수이면 false가 될 것이다
		 */ 
		
		bYes = num1 % 2 == 0;
		
		if(bYes) { // 
			
			
		}
		System.out.println("짝수");
	}
}
