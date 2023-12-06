package com.callor.oop.input;

import java.util.Scanner;

public class InputD {

	public static boolean operator() {

		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("=".repeat(50));
		System.out.println("4칙연산 계산기");
		System.out.println("-".repeat(50));

		System.out.println("두 개의 정수를 입력받아");
		System.out.println("사칙연산을 수행합니다");
		System.out.println("두 개의 정수를 입력해 주세요");
		System.out.println("계산기를 종료하려면 QUIT를 입력해 주세요");

		while (true) {
			System.out.print("정수(QUIT: 끝내기)  >> ");
			String str1 = scan.nextLine();
			System.out.println(str1 == "QUIT");
			if(str1.equals("QUIT")) {
				return false;
			}

			try {
				num1 = Integer.valueOf(str1);
			} catch (Exception e) { // Exception를 e에 저장하여 console에 출력
			e.printStackTrace();		
				System.out.println("정수값을 정확히 입력해야 합니다 " + str1);
				continue;
			}
			// 인티져 매소드 스테틱 메소드라서 클래스.사용가능 문자열로 되어있는 str1을 정수형으로 바꿔줌 /문자 > Integer >
			// int(안에서바꿈 2단계)
			// parse+앞의 클래스 붙여줌
		
			System.out.println("입력한 값 : " + str1);
			break;
			
		}
		while(true) {
			System.out.print("정수 2 >> ");
			String str2 = scan.nextLine(); // 논스테틱매소드
			if(str2.equals("QUIT")) {
				return false;
			}
			try {
				num2 = Integer.valueOf(str2); // (밖에서 바꿈 1단계)
				
			} catch (Exception e) {
				System.out.println("정수값으로 정확히 입력해 주세요");
			
				continue;
			}
			System.out.println("입력한 값 " + str2);
			break;
		
		}
	
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);

		// scan.close();
		return true;
	}

	public static void main(String[] args) {
		while (true) { // 괄호안이 거짓이 될떄까지 반복

			// operator 함수가 실행되고 false 값을 return할 때 까지 무한반복한다
			boolean isExit = true;
			while (isExit) {
				// operator 함수는 boolean type의 값을 return한다
				isExit = operator();

			}
			System.out.println("계산기 종료 ~~ 야 퇴근이다");
		}
	}
}
