package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreC {
	/*
	 * ScoreService 클래스를 사용하여 score10개선언 score배열의 각 요소를 생성자 사용하여 초기화 for 반복문 사용하여
	 * 초기화하기 51~ 100까지 범위의 임의의 정수 3개 생성
	 */
	public static void main(String[] args) {

		ScoreService[] scores = new ScoreService[10];

		for (int i = 0; i < scores.length; i++) {

			scores[i] = new ScoreService();
		}
		// 10개의 배열의 각 과목점수를 Random으로 생성하고자 한다
		for (int i = 0; i < scores.length; i++) {

			int rndKor = (int) (Math.random() * 50) + 50;
			int rndEng = (int) (Math.random() * 50) + 50;
			int rndMath = (int) (Math.random() * 50) + 50;

			scores[i].scoreKor = rndKor;
			scores[i].scoreEng = rndEng;
			scores[i].scoreMath = rndMath;

		}
		// 배열에 저장된 점수 화면에 출력하기
		Line.title(50, "성적표");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%3d\t", scores[i].scoreKor);
			System.out.printf("%3d\t", scores[i].scoreEng);
			System.out.printf("%3d\t", scores[i].scoreMath);

			System.out.printf("%3d\t", scores[i].getScoreTotal());
			System.out.printf("%5.2f\n", scores[i].getScoreAvg());
		}

		System.out.println("=".repeat(50));

	}

}
