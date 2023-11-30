package com.callor.oop.input;

import java.util.Scanner;

public class InputG {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.print("정수(QUIT: 종료) >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				break;
			}
			try {
				num = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.println("입력한 값 : " + str);
				continue;

			}
			if (num >= 2 ) {
				System.out.println("값은 2이상으로 입력해야 합니다 : ");
				System.out.println("입력한 값 : " + num);
				
			}
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					
					System.out.println("는 소수가 아님");
				} else {
					System.out.println("는 소수");
				}
				
			}
		}
	}
}
