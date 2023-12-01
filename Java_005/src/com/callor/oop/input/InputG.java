package com.callor.oop.input;

import java.util.Scanner;

public class InputG {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("정수 (QUIT:종료) >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				System.out.println("종료");
				break;
			}
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.println("입력한 값 : " + str);
				continue;
			}

			if (num > 2) { // 2이상
				System.out.println("값은 2 이상으로 입력해야 합니다 : ");
				System.out.println("입력한 값 : " + num);
				continue;
			}

			if (num % 2 == 0) { // 짝수 확인
				System.out.println("짝수입니다");
				System.out.println("입력한 값 : " + num);
			} else {
				System.out.println("짝수가 아닙니다");
				System.out.println("입력한 값 : " + num);
			}

			int i = 0;
			for (i = 2; i < num; i++) { // 소수 확인
				if (num % i == 0) {
					break;
				}
			}
			if (i < num) { // 나눈값이 0보다 작으면 소수 가 아님
				System.out.printf(" %d 는 소수가 아닙니다\n", num);
			} else {
				System.out.printf(" %d 는 소수입니다\n", num);
			}

		}
	}
}
