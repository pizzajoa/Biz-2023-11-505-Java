package com.callor.score.exec;

import com.callor.score.service.ScoreServiceA;

public class ScoreB {
	public static void main(String[] args) {
		ScoreServiceA scoreService = new ScoreServiceA(); // 생성자 method
		scoreService.loadScores();
		scoreService.printScores(); // printScores() method 생성 후 출력
	}
	
}
/*
 * data.txt 파일에서 성적을 읽어 score 배열에 저장하기
 * 생성자에서 이미 데어터파일을 open하고 읽어들일 준비가 되어있다
 * 생성자에서 만들어둔 scan 객체를 사용하여 데이터를 읽고 처리
 */