package com.callor.hello.method;

public class MethodB {
	public static void main(String[] args) {
		double num1 = 0;
		for (int i = 0; i < 10; i++) {

			num1 = Math.random(); // 파란색은 도구모음
			num1 *= 100;
			int num2 = (int)num1; // int= float ->()붙이기강제형변환
			
			System.out.println(num2);
		}
	}
}