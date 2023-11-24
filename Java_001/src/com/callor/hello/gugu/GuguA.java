package com.callor.hello.gugu;

public class GuguA {
	public static void main(String[] args) {
		int num = 7;
		int index = 1;

		System.out.print(num);
		System.out.print(" x ");
		System.out.print(index); // 앞에붙는 ++은 증가하고시작
		System.out.print(" = ");
		System.out.println(num * index++); // 첫명령문에서 뒤에붙는 ++증가없음
		
		System.out.print(num);
		System.out.print(" x ");
		System.out.print(index);
		System.out.print(" = ");
		System.out.println(num * index++);

		System.out.print(num);
		System.out.print(" x ");
		System.out.print(index);
		System.out.print(" = ");
		System.out.println(num * index++);
		
	}
}
