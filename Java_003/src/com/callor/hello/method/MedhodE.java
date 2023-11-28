package com.callor.hello.method;

public class MedhodE {
	public static int buy() {
		int num1 = 2000;
		int num2 = 1500;
		int change = num1 - num2;
		return change;
	}

	public static void main(String[] args) {

		int change = (buy());
		System.out.println(change);
	}
}
