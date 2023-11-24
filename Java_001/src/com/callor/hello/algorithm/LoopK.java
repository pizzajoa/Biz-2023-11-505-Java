package com.callor.hello.algorithm;

public class LoopK {
	public static void main(String[] args) {
		int ranage = 35;
		int sum = 0;
		for (int i = 0; i < ranage ; i++) {
			sum += (i + 1);
		}
		System.out.printf("1~%d 까지 덧셈 결과 : %d" , ranage, sum);
	}
}
