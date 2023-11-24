package com.callor.hello.pay;

public class PayC {
public static void main(String[] args) {
	int pay = 3587960;
	System.out.println("=================");
	
	System.out.println("5 만원권: " + pay / 50000);
	int num = pay % 50000;
	pay = num;
	
	System.out.println("1 만원권: " + pay / 10000);
	num = pay % 10000; // 1만원 단위 제거
	pay = num;
	
	System.out.println("5 천원권: " + pay / 5000);
	num = pay % 5000; // 5천원 단위 제거
	pay = num;
	
	System.out.println("1 천원권: " + pay / 1000);
	num = pay % 1000; 
	pay = num;
	
	System.out.println("5 백원권: " + pay / 500);
	num = pay % 500; 
	pay = num;
	
	System.out.println("1 백원권: " + pay / 100);
	num = pay % 100; 
	pay = num;
	
	System.out.println("5 십원권: " + pay / 50);
	num = pay % 50; 
	pay = num;
	
	System.out.println("1 십원권: " + pay / 10);
	num = pay % 10; 
	pay = num;
	
}
}
