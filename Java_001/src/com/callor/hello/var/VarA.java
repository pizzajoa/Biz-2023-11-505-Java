package com.callor.hello.var;

public class VarA {
	public static void main(String[] args) {
		int num = 0;
		num = num + 20;
		num += 20; // 위 코드와 같다 num 변수값을 20 증가
		
		num = num - 20; // num 변수값을 20 감소
		num -= 20; 
		
		/*
		 * 변수 = 값처럼 EQ(=) 가 1개 있는 명령문을 만나면 이전 코드에서 변수에 있던 값들이 의미가 없어진다
		 */
		
		num = 2; // 연산자가 1개냐 2개냐 중요
		num = num + 1; // num 변수값을 1 증가
		num += 1; // 1증가
		num ++; // num 변수값을 1 증가
		++num ; // num 변수값을 1 증가
		
		num = num - 1; // num 변수값을 1 감소
		num -= 1; // 1감소
		num --; // num 변수값을 1 감소
		--num ; 
		
		num = num * 3;
		num *= 3;
		num = num / 3;
		num /= 3;
		num = num % 3;
		num %= 3; // num = num % 3
		
		num = num * 1;
		num *= 1;
		
		
		
		
	}
}
