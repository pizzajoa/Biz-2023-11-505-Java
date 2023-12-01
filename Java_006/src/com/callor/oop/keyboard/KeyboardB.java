package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyboardB {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int rndNum = 0;

		while (true) {
			System.out.println("1~10까지의 정수를 입력해 주세요");
			System.out.print("정수 >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수로 정확히 입력해 주세요");
				System.out.println("프로젝트를 다시 실행 해 주세요");
				continue;

			}
			if (num > 10) {
				System.out.println(" 10보다 작은 값을 입력하세요");
				System.out.println("프로젝트를 다시 실행 해 주세요");
				continue;
			}

			rndNum = (int) (Math.random() * 10) + 1;
			if (rndNum == num) {
				System.out.printf("참 잘했어요 : (%d)\n", rndNum);
			} else {
				System.out.printf("다시 한번 잘 생각해 보세요 (%d)\n", rndNum);
			}
			if (rndNum > num) {
				System.out.printf("값이 너무 작아요 : (%d)\n", rndNum);
			}
			if (rndNum < num) {
				System.out.printf("값이 너무 커요 (%d)\n", rndNum);
			}
		}
	}
}
