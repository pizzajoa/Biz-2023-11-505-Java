package com.callor.algorithm.exec;

import java.util.Scanner;

public class ScannerE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while (true) {

			System.out.println("원하는 구구단 단수를 입력해 주세요 >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				// TODO: handle exception
			System.out.println("정수를 정확히 입력해 주세요");
			continue;
			}
			
			for(int i = 0 ; i < 9 ; i++) {
				System.out.printf("%d x %d = %d\n",num,i + 1,num * i );
			}
			
			return ;
		}
	}
}
