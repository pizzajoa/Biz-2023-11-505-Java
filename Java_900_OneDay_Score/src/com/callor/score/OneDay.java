package com.callor.score;



public class OneDay {
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		for(int i = 0 ; i< 100 ; i++) {
		scoreService.inputScore(0, 100);
		}

	}
}
