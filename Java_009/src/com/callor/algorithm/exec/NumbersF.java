package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;

public class NumbersF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		NumberService numService = new NumberService();
		int num = numService.inputNum("정수를");
		
	}
}
