package com.callor.hello.method;

public class MethodB {
	
// int add() : return type이 int인 add매서드
	public static int add( ) { // int형으로 실행하고 결과 알려줘(피드백)
		int num1 = 30;
		int num2 = 40;
		System.out.println(num1 + num2);
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		/*
		 * return type이 void가 아닌 method는 무엇인가 값을 리턴할것이고 
		 * 그 리턴한 값은 다른 변수에 할당할 수 있다
		 * 단, 리턴타입과 변수의 타입이 같이야 한다
		 */
		
		int result = add(); // add가 피드백한 값 저장가능
		
	}
}
