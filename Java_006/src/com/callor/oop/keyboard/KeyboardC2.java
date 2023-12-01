package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyboardC2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 10) + 1;
		int count = 0;

		System.out.println("=".repeat(30));
		System.out.println("뤼팡의 황금열쇠를 찾아라");
		System.out.println("=".repeat(30));
		System.out.println("1 ~ 50까지 숫자 중 황금열쇠를 입력하세요");

		while (true) {
			System.out.print("정수 >> ");
			String str = scan.nextLine();
			int num = 0;

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.printf("입력한 값 : (%s)\n", str);
				System.out.println("프로젝트를 다시 실행 해 주세요");
				continue;
			}
			if (num < 1 || num > 50) {
				System.out.println("1~ 50까지 범위의 정수만 입력하세요");
				continue;
			}
			if (count >= 5) {
				System.out.println(count + "번 이상 입력하셨습니다");
				System.out.println(count + "번째 정답 못 맞춤 실패");
				System.out.println("정답 : " + rndNum);
				break;
			}
			if (num == rndNum) {
				System.out.printf("참 잘했어요 : %d\n", num);
				System.out.println(count + "회 시도");
				break;
			} else if (num > rndNum) {
				count++;
				System.out.println("입력한 값이 너무 커요");
				continue;
			} else if (num < rndNum) {
				count++;
				System.out.println("입력한 값이 너무 작아요");
				continue;
			}
			if(str.equals("재시작")) {
				return;
			}
		}

	}

}