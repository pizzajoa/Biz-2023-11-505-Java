package com.callor.hello.algorithm;

import java.net.MulticastSocket;

public class AlgB {
	public static void main(String[] args) {
		int sum3 = 0;
		int sum5 = 0;
		for (int i = 0; i < 100; i++) { 
			int num = i + 1;
			if (num % 3 == 0 ) {
			
			sum3 += num;
			}
			if (num % 5 == 0 ) {
			sum5 += num;
		}
	}
		System.out.printf("%d + %d = %d\n" , sum3, sum5, sum3+sum5);
		System.out.printf("%d - %d = %d\n" , sum3, sum5, sum3-sum5);
		System.out.printf("%d * %d = %d\n" , sum3, sum5, sum3*sum5);
		System.out.printf("%d / %d = %d\n" , sum3, sum5, sum3/sum5);
}
}