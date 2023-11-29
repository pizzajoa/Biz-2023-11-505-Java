package com.callor.hello.arrays;

public class ArraysGD {

	public static String gradeScore(int score) {
		String result = "F";
		if (score >= 95)
			result = "A+";
		else if (score >= 90)
			result = "A+";
		else if (score >= 85)
			result = "A+";
		else if (score >= 80)
			result = "A+";
		else if (score >= 75)
			result = "A+";
		else if (score >= 70)
			result = "A+";
		else if (score >= 65)
			result = "A+";
		else if (score >= 60)
			result = "A+";
		return result;
		// 국어점수를 보내서 평점을 return 받기
		// return 받은 평점은 gradeScore 변수에 할당

	}

	public static void main(String[] args) {

	}

}
