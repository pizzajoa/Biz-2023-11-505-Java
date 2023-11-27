package com.callor.hello.algorithm;

public class LoopL {
	public static void main(String[] args) {
		int ranage = 100;
		int sum = 0;
		for (int i = 0; i < ranage; i++) {

			if (i % 2 == 0) {
				sum += (i + 2);
			}
		}
		System.out.println("결과 : " + sum);
	}
}
