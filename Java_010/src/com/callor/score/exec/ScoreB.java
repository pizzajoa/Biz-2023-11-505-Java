package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int num1 = numService.inputNumber("국어정수를",50,100);
		int num2 = numService.inputNumber("영어정수를",50,100);
		int num3 = numService.inputNumber("수학정수를",50,100);

		ScoreDto scoreDto = new ScoreDto();

		scoreDto.kor = num1;
		scoreDto.eng = num2;
		scoreDto.math = num3;

		System.out.printf("3 과목의 총점 %d\n ", (num1 + num2 + num3));

	}
}
