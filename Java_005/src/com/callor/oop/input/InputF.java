package com.callor.oop.input;

import java.util.Scanner;

public class InputF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0 ;
		String str = "";
		
		
		int i = 0;
		
		for (i = 2; i < 10; i++)
			
		{
			System.out.println("입력받은 정수 " + i);
		}

		while (true) {
			System.out.print("정수(QUIT: 끝내기) >> ");
			String str1 = scan.nextLine();
			System.out.println(str1 == "QUIT");
			if (str1.equals("QUIT")) {

			}
			if(i % 2 == 0) {
				System.out.println("종료");
			}
			try {
				i = Integer.valueOf(str1);
			} catch (Exception e) { // Exception를 e에 저장하여 console에 출력
				e.printStackTrace();
				System.out.println("정수값을 정확히 입력해야 합니다 " + str1);

			}
		}
	}
}
