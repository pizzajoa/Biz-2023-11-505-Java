package com.callor.hello.method;

public class MethodEA {
	public static int buy(int num1) { // 변수를 괄호 안에다 함 "매개변수"
		//int num1 = 2000;
		int num2 = 1500;
		int change = num1 - num2;
		return change;
	}

	public static void main(String[] args) {
		
		
		int num1= 2000;
		int change = buy(num1);
		
		System.out.printf("전달한 값 %d, 잔액 : %d" , num1, change);
	}
}

