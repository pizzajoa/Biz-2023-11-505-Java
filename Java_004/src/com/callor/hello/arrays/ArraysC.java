package com.callor.hello.arrays;

public class ArraysC {
	public static void main(String[] args) {
	
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		System.out.println("=".repeat(50));
		System.out.println("샛별반 국어 점수");
		System.out.println("-".repeat(50));

		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
			System.out.printf("%d 번 : %d\n",i+1, scoreKors[i]);

		}
		int sum = 0;
		for (int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		}
		
		float avg = 0;
		avg = (float)sum / scoreKors.length;
		System.out.println("-".repeat(50));
		System.out.printf("국어 점수 총점 : %d , 평균 : %.2f\n", sum, avg);
		System.out.println("=".repeat(50));
	
	}

}
