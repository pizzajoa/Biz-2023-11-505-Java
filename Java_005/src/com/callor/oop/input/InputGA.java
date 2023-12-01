package com.callor.oop.input;

import java.util.Scanner;

import com.callor.oop.utils.Line;

public class InputGA {

	public static boolean isPrime(int num) {
		for(int i = 2 ; i < num ; i++)
			if (num % i == 0) {
				break;
			}
		return false;
	}

	public static void main(String[] args) {

		int lineLength = 50;
		Scanner scan = new Scanner(System.in);
		int num =0 ;
		
		//멈추고 싶을 때 까지 계속 반복하기
		while(true) {
			Line.dLine(lineLength);
			System.out.println("소수 찾기 프로젝트");
			Line.dLine(lineLength);
			System.out.println("2 보다 큰 정수값을 입력해 주세요");
			System.out.println("종료 하려면 QUIT를 입력하세요");
			System.out.println("정수 >> ");
			
			/*
			 *  
			 */
			String str = scan.nextLine();
			if(str.equals("QUIT")) {
				break;
			}
		 // 입력된 문자열을 먼저 정수로 변환하기
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수로 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
			continue;
			}
			if(num < 2 ) {
				System.out.println("2이상의 정수를 입력해야 합니다");
				System.out.printf("입력한 값 : (%s)\n " , num);
				continue;
		}
		// 소수검사
			if(isPrime(num)) {
			}
			}
		System.out.println("소수 찾기 프로젝트를 종료합니다");
	} //end while 
	

}
