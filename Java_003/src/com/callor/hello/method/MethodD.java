package com.callor.hello.method;

public class MethodD {
	
	public static int add( ) {
		int num1 = 30;
		int num2 = 40;
		int sum = num1 + num2;
		
		return sum;	
	}
	

	public static void main(String[] args) {
	
		
		int sum = add();
		System.out.println(sum);
}
}
