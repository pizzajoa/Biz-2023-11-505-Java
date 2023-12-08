package com.callor.score;

public class ScoreDto {
	
	
	public String stdNum;
	
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	public int sw;
	public int db;
	
	public int total;
	private float avg;

	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		total += sw;
		total += db;
		return total;
		
		
	}
	public float getAvg() {
		getTotal();
		avg = (float)total /5;
		return avg;
		
	}
	
	
}