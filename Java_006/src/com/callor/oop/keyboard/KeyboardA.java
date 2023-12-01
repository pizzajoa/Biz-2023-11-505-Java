package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyboardA {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.println("10이상의 정수를 입력해 주세요");
			System.out.print("정수 >> ");
			String str = scan.nextLine();

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수로 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);

			}
			for (int i = 0; i < num; i++) {
				if (num % 2 == 0) {

				}

			}
			System.out.println("짝수입니다");
			System.out.println("입력한 값 : " + num);
			break;
		}
	}
}
