package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreC {
	/*
	 * ScoreService 클래스를 사용하여 score10개선언 score배열의 각 요소를 생성자 사용하여 초기화 for 반복문 사용하여
	 * 초기화하기
	 * 51~ 100까지 범위의 임의의 정수 3개 생성
	 */
	public static void main(String[] args) {

		ScoreService[] scores = new ScoreService[10];
		for (int i = 0; i < scores.length; i++) {
			
			scores[i] = new ScoreService();
		}
		// 10개의 배열의 각 과목점수를 Random으로 생성하고자 한다
		for (int i = 0; i< scores.length; i++) {
			
			int rndKor = (int)(Math.random()*50) + 50;
			int rndEng = (int)(Math.random()*50) + 50;
			int rndMath = (int)(Math.random()*50) + 50;
	// 코드 수정하기
			scores[i].scoreKor = rndKor;
			scores[i].scoreEng = rndEng;
			scores[i].scoreMath = rndMath;
			
		}

	}

}
