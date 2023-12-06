package com.callor.algorithm.exec;
import java.util.Scanner;

import com.callor.algorithm.service.NumberService;

public class NumbersG {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Scanner scan = new Scanner(System.in);
		
		int score = numService.inputNum("점수를");
		String scoreGrade = "F";
		if (score >= 95)
			scoreGrade = "A+ 입니다.";
		else if (score >= 90)
			scoreGrade = "A+ 입니다.";
		else if (score >= 85)
			scoreGrade = "B+ 입니다.";
		else if (score >= 80)
			scoreGrade = "B 입니다.";
		else if (score >= 75)
			scoreGrade = "C+ 입니다.";
		else if (score >= 70)
			scoreGrade = "C 입니다.";
		else if (score >= 65)
			scoreGrade = "D+ 입니다.";
		else if (score >= 60)
			scoreGrade = "D 입니다.";
		else

		System.out.printf("%s 입니다.\n",scoreGrade);
		
		if(score >= 80) System.out.println("축하합니다");
		else if(score >= 70) System.out.println("더 분발하세요");
		else if(score < 60) System.out.println("낙제입니다");
	}
}