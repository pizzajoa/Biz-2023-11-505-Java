package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersH {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Scanner scan = new Scanner(System.in);
		Line.dLine(50);
		System.out.println("3과목의 점수를 입력하세요");
		int score1 = numService.inputNum("점수를");
		int score2 = numService.inputNum("점수를");
		int score3 = numService.inputNum("점수를");
		int scoreSum = score1 + score2 + score3 ;
		int scoreAvg = scoreSum /3;
		
		if(scoreAvg >= 60) {
			System.out.println("축하합니다\n합격입니다");
			System.out.println("평균" + scoreAvg + "점");
		}else {
			System.out.println("아쉽지만\n낙제입니다");
			System.out.println("평균" + scoreAvg + "점");
		}
	}
}