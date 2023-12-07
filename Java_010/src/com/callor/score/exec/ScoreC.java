package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

//ScoreDto 클래스 이용해서 객체생성 3개의 점수를 3명이서
public class ScoreC {

	public static void main(String[] args) {
		List<ScoreDto> scores = new ArrayList();
		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();

		int start = 50;
		int end = 100;

		for (int i = 0; i < 3; i++) {

			int scoreKor = numService.inputNumber("국어 점수", start, end);
			int scoreEng = numService.inputNumber("영어 점수", start, end);
			int scoreMath = numService.inputNumber("수학 점수", start, end);

			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			int scoreTotal = scoreDto.kor + scoreDto.eng + scoreDto.math;
		}
		System.out.printf("국어: %d점 영어: %d점 수학: %d점 총점 %d점 ", scoreDto.kor, scoreDto.eng, scoreDto.math,
				scoreDto.kor + scoreDto.eng + scoreDto.math);
	}
}
