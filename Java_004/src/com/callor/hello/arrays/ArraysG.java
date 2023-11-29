package com.callor.hello.arrays;

public class ArraysG {
	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
	
		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;

			if (scoreKors[i] >= 100) {
				System.out.printf("%d\tA+\n",scoreKors[i] );
			}
			if (scoreKors[i] >= 95) {
				System.out.printf("%d\tA\n",scoreKors[i] );
			}
			if (scoreKors[i] >= 90) {
				System.out.printf("%d\tB+\n",scoreKors[i] );
			}
			if (scoreKors[i] >= 85) {
				System.out.printf("%d\tB\n",scoreKors[i] );
			}
			

			System.out.printf("%d\n", scoreKors[i]);


	}
	}
}
