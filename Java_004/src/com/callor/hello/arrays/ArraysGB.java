package com.callor.hello.arrays;

public class ArraysGB {
	public static void main(String[] args) {

		int[] scoreKors = new int[10];
		for (int i = 0; i < scoreKors.length; i++) {
			 scoreKors[i] = (int) (Math.random() * 50) + 51;
		}
		
		for(int i = 0 ; i < scoreKors.length ; i++) {
			System.out.printf("%3d\t,", scoreKors[i]);
			String gradeScore = "A+";
			if(scoreKors[i] >= 90 && scoreKors[i]< 95) gradeScore = "A";
			if(scoreKors[i] >= 85 && scoreKors[i]< 90) gradeScore = "B+";
			if(scoreKors[i] >= 80 && scoreKors[i]< 85) gradeScore = "B";
			if(scoreKors[i] >= 75 && scoreKors[i]< 80) gradeScore = "C+";
			if(scoreKors[i] >= 70 && scoreKors[i]< 75) gradeScore = "C";
			if(scoreKors[i] >= 65 && scoreKors[i]< 70) gradeScore = "D+";
			if(scoreKors[i] >= 60 && scoreKors[i]< 65) gradeScore = "D";
			
			System.out.println(gradeScore);
			
			
			}
		
	}
}
