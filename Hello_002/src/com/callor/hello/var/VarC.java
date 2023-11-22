package com.callor.hello.var;

public class VarC {
	public static void main(String[] args) {
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		int total = 0;
		int avg = 0;
		System.out.println("====================");
		scoreKor = 90;
		System.out.println("국어 : " + scoreKor);
		scoreEng = 75;
		System.out.println("영어 : " + scoreEng);
		scoreMath = 70;
		System.out.println("수학 : " + scoreMath);
		System.out.println("---------------------");
		total = scoreKor + scoreEng + scoreMath;
		System.out.println("총점 : " + total);
		avg = total / 3;
		System.out.println("평균 : " + avg);
		System.out.println("====================");
	}
}
