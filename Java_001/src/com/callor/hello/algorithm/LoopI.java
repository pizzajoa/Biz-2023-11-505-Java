package com.callor.hello.algorithm;

public class LoopI {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int n = i + 1 ;
			if (n % 7 == 0) {
				System.out.printf("%d ", n );
			}
		}
	}
}
