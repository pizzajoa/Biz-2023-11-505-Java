package com.callor.oop.input;

import java.util.Scanner;
/*
 *  입력받은 문자열형 정수를 정수로 변환하는 과정에서 Except이 자주 발생하여
 *  Exception 처리를 하자
 */
public class InputEC {
	public static void main(String[] args) {
		//nums type는 정수형 배열
		int[] nums = new int[3];
		// scan type은? Scanner 클래스 type, Scanner 클래스 type의 객체(object)
		// Scanner type
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.printf("정수 %d >> ", i + 1);
			String str = scan.nextLine();
			try {
				nums[i] = Integer.valueOf(str);
			} catch (Exception e) {
			System.out.println("정수를 정확히 입력해주세요");
			i--;
			continue; //for문에는 컨티뉴 이후 i++을 실행함 이떄문에 컨티뉴 전에 i- 입력
			}
			
			
		}
		System.out.println("=".repeat(30));
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}


	}
}
