package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;

public class NumbersD3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		NumberService numService = new NumberService();

		int sum = 0;
		int count = 0;
		while (sum < 1000) {

			int num = numService.inputNum("숫자를");
			sum += num;
			count++;
		//	if (sum >= 1000) {
		//	break;
		//	}

		}
		System.out.printf("%d 번 입력한 숫자 총 합 %d", count, sum);
	}
}

/*
 * for(int i = 0 ; i < num ; i++ ) { for(int k = num++; k < 1000 ; k++) {
 * System.out.printf("%d번 입력한 숫자 총 합 : %d\n",k,num++ ); } }
 */