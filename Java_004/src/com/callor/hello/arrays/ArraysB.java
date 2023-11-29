package com.callor.hello.arrays;

public class ArraysB {
	public static void main(String[] args) {

		int[] scoreKors = new int[10];
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndNum;

		}
		for (int i = 0; i < 10; i++) {
			sum += scoreKors[i];
		}
		double evg = (sum / 10.00);
		System.out.println("=====================================");
		System.out.printf("국어 점수 총점 : %d , 평균 : %5.2f", sum, evg);
		System.out.println("");
		System.out.println("=====================================");
	}

}
