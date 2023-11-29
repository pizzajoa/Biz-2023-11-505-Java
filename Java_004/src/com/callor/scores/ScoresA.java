package com.callor.scores;

import com.callor.service.Scoreservice;

public class ScoresA {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors= Scoreservice.score(STUDENT_LENGTH);
		int[] scoreEngs= Scoreservice.score(STUDENT_LENGTH);
		int[] scoreMaths= Scoreservice.score(STUDENT_LENGTH);
		int[] scoreMusics= Scoreservice.score(STUDENT_LENGTH);
		int[] scoreHiss= Scoreservice.score(STUDENT_LENGTH);
		
		for(int i = 0; i < scoreKors.length ; i++) {
			System.out.printf("%3d\t", scoreKors[i]);
			System.out.println(Scoreservice.gradeScore(scoreKors[i]));
			
		}
		
		
	}
}
