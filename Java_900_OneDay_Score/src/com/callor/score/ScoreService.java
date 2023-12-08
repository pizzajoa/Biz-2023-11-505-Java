package com.callor.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreService {

	private List<ScoreDto> scores = null;
	private NumberService numService = null;

	public ScoreService() {

		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}

	public void inputScore() {

		int start = 0;
		int end = 100;

		this.inputScore(start, end);
	}

	public void inputScore(int start, int end) {

		String strStdNum = "230000";
		if (scores.size() > 0) {
			strStdNum = scores.get(scores.size() - 1).stdNum;
		}
		int intStdNum = Integer.valueOf(strStdNum.substring(2));
		intStdNum++;

		strStdNum = String.format("23%04d", intStdNum);

		int scoreKor = numService.inputNumber(strStdNum + "번의 국어 점수", start, end);
		int scoreEng = numService.inputNumber(strStdNum + "번의 영어 점수", start, end);
		int scoreMath = numService.inputNumber(strStdNum + "번의 수학 점수", start, end);

		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;

		scores.add(scoreDto);

	}

	public void printScore() {
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.dLine(50);
		for (ScoreDto dto : scores) {
			System.out.printf("%s\t", dto.stdNum);
			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\t", dto.getTotal());
			System.out.printf("%5.2f\n", dto.getAvg());
		}
	}
	////////////////////////////////////////////////

	public String stdName = null;

	public int scoreKor = 0;
	public int scoreEng = 0;
	public int scoreMath = 0;
	public int scoreMusic = 0;
	public int scoreArt = 0;
	
	
	private int scoreTotal = 0;
	private float scoreAvg = 0.0f;


	public int getScoreTotal() {
		scoreTotal = scoreKor;
		scoreTotal += scoreEng;
		scoreTotal += scoreMath;
		scoreTotal += scoreMusic;
		scoreTotal += scoreArt;
		return scoreTotal;

	}

	public float getScoreAvg() {
		getScoreTotal();
		scoreAvg = (float) (scoreTotal) / 5;
		return scoreAvg;
	}

}
