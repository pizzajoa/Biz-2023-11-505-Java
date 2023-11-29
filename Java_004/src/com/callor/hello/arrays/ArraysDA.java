package com.callor.hello.arrays;

public class ArraysDA {
	public static void main(String[] args) {

		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];

		System.out.println("=".repeat(50));
		System.out.println("샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));

		for (int i = 0; i < scoreKors.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndScore;
		}
		for (int i = 0; i < scoreEng.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreEng[i] = rndScore;
		}
		for (int i = 0; i < scoreMath.length; i++) {
			int rndScore = (int) (Math.random() * 50) + 51;
			scoreMath[i] = rndScore;
		}

		
		float avg = 0;
		for (int i = 0; i < scoreKors.length; i++) {
			int sum = scoreKors[i];
			sum += scoreEng[i];
			sum +=scoreMath[i];

			avg = (float)sum / 3;
			System.out.printf("%2d\t %2d\t %2d\t %2d\t %.2f\n", scoreKors[i], scoreEng[i], scoreMath[i], sum, avg);

		}
		System.out.println("=".repeat(50));
	}

}
