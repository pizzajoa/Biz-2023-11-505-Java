package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreDA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		
		for(int i = 0 ; i < 3 ; i++) {
			String stdNum = String.format("S%04d", i+1);
			ScoreDto scoreDto = new ScoreDto();
			
			int scoreKor = numService.inputNumber((i+1) + "번의 국어 점수");
			int scoreEng = numService.inputNumber((i+1) + " 번의 영어 점수");
			int scoreMath = numService.inputNumber((i+1) + "번의 수학 점수");
			
			scoreDto.stdNum = stdNum;
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			scores.add(scoreDto);
		}
		
		System.out.println("학번\t국어\t영어\t수학\t총점");
		int size = scores.size();
		for(int i = 0; i < size ; i++) {
			ScoreDto dto = scores.get(i);
			System.out.printf("%s\t",dto.stdNum);
			System.out.printf("%3d\t",dto.kor);
			System.out.printf("%d\t",dto.eng);
			System.out.printf("%d\t",dto.math);
			System.out.printf("%4d\n",dto.getTotal());
			
		// 확장 for(forEach) : 배열, List 전체 요소를
		// 출력하거나, 연산할 때 사용하는 새로운 for
		}
//		for(ScoreDto dto : scores) {
//			System.out.printf("%s\t",dto.stdNum);
//			System.out.printf("%3d\t",dto.kor);
//			System.out.printf("%d\t",dto.eng);
//			System.out.printf("%d\t",dto.math);
//			System.out.printf("%4d\t",dto.getTotal());
//			System.out.println();
//		}
	}
}