package com.callor.hello.arrays;

public class ArraysGA {
	public static void main(String[] args) {

		int[] scoreKors = new int[10];
		for (int i = 0; i < scoreKors.length; i++) {
			 scoreKors[i] = (int) (Math.random() * 50) + 51;
		}
		/*
		 * if와 else 만약 조건이 참이면 실행1이 수행되고 그렇지 않으면 실행2가 수행됨
		 * 
		 * if(조건1){실행1}
		 * else if(조건2) {실행2}
		 * else{실행3}
		 */
		for(int i = 0 ; i < scoreKors.length ; i++) {
			System.out.printf("%3d\t,", scoreKors[i]);
			String gradeScore = "F";
			
			if(scoreKors[i] < 55) gradeScore = "F";
			else if(scoreKors[i] < 60) gradeScore = "D";
			else if(scoreKors[i] < 65) gradeScore = "D+";
			else if(scoreKors[i] < 70) gradeScore = "C";
			else if(scoreKors[i] < 75) gradeScore = "C+";
			else if(scoreKors[i] < 80) gradeScore = "B";
			else if(scoreKors[i] < 85) gradeScore = "B+";
			else if(scoreKors[i] < 90) gradeScore = "A";
			else if(scoreKors[i] < 95) gradeScore = "A+";
			
			System.out.println(gradeScore);   
	
			}
		
	}
}
