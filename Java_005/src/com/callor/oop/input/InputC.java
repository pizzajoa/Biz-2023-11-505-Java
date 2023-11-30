package com.callor.oop.input;

import java.util.Scanner;
/*
 * Scanner를 사용하여 키보드로 값을 입력받을때는 Scanner object를 생성한 후 
 * nestLine() method 사용하여 입력을 받고 입력받은 문자열을 변수에 할당한다
 * Scanner 에는 nextLine(), nextFloat() 등 키보드로 입력한 문자열형 숫자를 
 * 숫자로 변환하여 return 하는 method가 있다
 * 하지만 이 method들은 bug가 있어서 작동이 잘못 되는 경우가 있다
 * 그래서 그냥 nextLine()을 사용하여 숫자로 문자열을 입력받고
 * 나중에 다시 숫자형으로 변환하여 코드에 적용한다
 * 
 * Scanner.nextLine()을 통하여 입력받은 "문자열형 숫자( "88" )"를 
 * 실제 정수, 실수 등으로 변환하여 연산에 사용하게 되는데
 * 이때 Integer.valueof(), Float.valueof(), Long.valueof(), Double.valueof() 등
 * method를 사용하여 문자열형 숫자를 실제 숫자로 변환한다
 * Integer.valueof(), Float.valueof(), Long.valueof(), Double.valueof()
 * 
 */

public class InputC {
	
	public static void main(String[] args) {
		int num1 =0;
		int num2 =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("=".repeat(50));
		System.out.println("4칙연산 계산기");
		System.out.println("-".repeat(50));
		
		System.out.println("두 개의 정수를 입력받아");
		System.out.println("사칙연산을 수행합니다");
		System.out.println("두 개의 정수를 입력해 주세요");
		System.out.print("정수 1 >> ");
		String str1 = scan.nextLine();
		
		num1 = Integer.parseInt(str1); // 인티져 매소드 스테틱 메소드라서 클래스.사용가능 문자열로 되어있는 str1을 정수형으로 바꿔줌 /문자 > Integer > int(안에서바꿈 2단계)
		Float.parseFloat(str1); // parse+앞의 클래스 붙여줌
		
		System.out.print("정수 2 >> ");
		String str2 = scan.nextLine(); // 논스테틱매소드
		num2 = Integer.valueOf(str2);  // (밖에서 바꿈 1단계)
		Float.valueOf(num2);
		
		System.out.printf("입력한 정수는 %s, %s 입니다\n" ,str1,str2);
		System.out.println(str1 + str2);
		
		System.out.printf("%d + %d = %d\n", num1 ,num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1 ,num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1 ,num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1 ,num2, num1 / num2);
		
		
		scan.close();
		
	}
}
