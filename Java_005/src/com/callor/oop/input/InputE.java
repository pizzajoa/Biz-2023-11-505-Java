package com.callor.oop.input;

import java.util.Scanner;

public class InputE {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
				
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("세 개의 정수를 입력받아");
		System.out.println("사칙연산을 수행합니다");
		System.out.println("세 개의 정수를 입력해 주세요");

		while (true) {
			System.out.print("정수 1 >> ");
			String str1 = scan.nextLine();
			try {
				num1 = Integer.valueOf(str1);
			} catch (Exception e) {
				System.out.println("정수값을 정확히 입력해야 합니다 " + str1);
				continue;
			}
			System.out.println("입력한 값 : " + str1);
			break;
		}
		while (true) {
			System.out.print("정수 2 >> ");
			String str2 = scan.nextLine();
			try {
				num2 = Integer.valueOf(str2);
			} catch (Exception e) {
				System.out.println("정수값을 정확히 입력해야 합니다 " + str2);
				continue;
			}
			System.out.println("입력한 값 " + str2);
			break;
		}
		while (true) {
			System.out.print("정수 3 >> ");
			String str3 = scan.nextLine();
			try {
				num3 = Integer.valueOf(str3);
			} catch (Exception e) {
				System.out.println("정수값을 정확히 입력해야 합니다 " + str3);
				continue;
			}
			System.out.println("입력한 값 " + str3);
			break;
			
		}
		
	}
}
