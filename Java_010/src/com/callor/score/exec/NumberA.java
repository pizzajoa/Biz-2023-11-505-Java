package com.callor.score.exec;

import com.callor.score.service.NumberService;

public class NumberA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int num = numService.inputNumber("정수를");
	System.out.println(num);
	
	num = numService.inputNumber("정수를",50,000);
	System.out.println(num);
	
	}
}
