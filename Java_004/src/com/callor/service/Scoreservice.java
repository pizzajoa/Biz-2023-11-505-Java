package com.callor.service;
/*
 * ScoreService 클래스
 * surfix(접미사) Service 인 클래스
 * 여기에는 main() method가 없다
 * 여기에 선언된 method들은 다른 클래스(파일)에서 호출하여 사용하는 용도이다
 * ScoreService.score() 처럼 "클래스. method()"형식으로 사용한다
 * 이때 Service 클래스는 method들을 모아두는 묶음 역할을 한다
 */
public class Scoreservice {
	public static int[] score(int length) {
		int[] scores = new int[length];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = (int)(Math.random() * 50) + 51;
			
		}
		return scores;
	}
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
}
