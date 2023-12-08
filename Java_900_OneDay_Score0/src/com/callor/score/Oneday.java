package com.callor.score;

import java.util.ArrayList;
import java.util.List;

public class Oneday {
	List<ScoreDto> scores = new ArrayList<ScoreDto>();

	public Oneday() {

	}

	public void inputScore() {
		for (int i = 0; i < 10; i++) {
			ScoreDto scoreDto = new ScoreDto();

			String strStdNum = "23000";
			if (scores.size() > 0) {
				strStdNum = scores.get(scores.size() - 1).stdNum;
			}

			int intStdNum = Integer.valueOf(strStdNum.substring(2));
			intStdNum++;

			strStdNum = String.format("23%03d", intStdNum);

			int scoreKor = (int) (Math.random() * 51) + 50;
			int scoreEng = (int) (Math.random() * 51) + 50;
			int scoreMath = (int) (Math.random() * 51) + 50;
			int scoreMusic = (int) (Math.random() * 51) + 50;
			int scoreAtr = (int) (Math.random() * 51) + 50;

			scoreDto.stdNum = strStdNum;
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			scoreDto.music = scoreMusic;
			scoreDto.art = scoreAtr;

			scores.add(scoreDto); // ScoreDA 참조
		}
	}

	public void printScore() {
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumMusic = 0;
		int sumArt = 0;
		int sumTotal = 0;
		float sumAvg = 0;

		System.out.println("=".repeat(70));
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		System.out.println("=".repeat(70));
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println("-".repeat(70));
		for (ScoreDto dto : scores) { // ScoreService 참조
			System.out.printf("%s\t", dto.stdNum);
			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\t", dto.music);
			System.out.printf("%3d\t", dto.art);

			System.out.printf("%3d\t", dto.getTotal());
			System.out.printf("%5.2f\n", dto.getAvg());
			sumKor += dto.kor;
			sumEng += dto.eng;
			sumMath += dto.math;
			sumMusic += dto.music;
			sumArt += dto.art;
			sumTotal += dto.getTotal();
			sumAvg += dto.getAvg();

		}
		float avgKor = sumKor / (float) scores.size();
		float avgEng = sumEng / (float) scores.size();
		float avgMath = sumMath / (float) scores.size();
		float avgMusic = sumMusic / (float) scores.size();
		float avgArt = sumArt / (float) scores.size();
		float avgAvg = sumAvg / (float) scores.size();

		System.out.println("=".repeat(70));
		System.out.printf("총점\t%4d\t%4d\t%4d\t%4d\t%4d\t%4d\n", sumKor, sumEng, sumMath, sumMusic, sumArt, sumTotal);
		System.out.printf("평균\t%5.2f\t%5.2f\t%5.2f\t%5.2f\t%5.2f\t\t%5.2f\n", avgKor, avgEng, avgMath, avgMusic, avgArt,
				avgAvg);
		System.out.println("=".repeat(70));
	}

}