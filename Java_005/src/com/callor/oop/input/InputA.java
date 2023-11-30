package com.callor.oop.input;

public class InputA {

	public static void main(String[] args) {
		// String nation = "";
		String nation1 = new String();
		// String nation2 = "대한민국";
		String nation2 = new String("대한민국"); //0.1.2.3
		
		/*
		 * String class에 정의된(선언된) substring() 이라는 method를 
		 * 사용하기 위해 String class사용하여 nation2라는 객체(object)를
		 * 생성하고 nation2 객체를 통하여(.) substring() method를 호출하엿다
		 */
		
		String result = nation2.substring(1, 2); //1번째부터 2글자가 보통이나 자바는 예외
		System.out.println(result);
		
		String subStr = "우리나라만세 대한민국".substring(3, 4);
		
		int num1 =30;
		Integer num2 = 30;
		
		long num3 = 0;
		Long num4 = 0L;
		
		float num5 = 0;
		Float num6 = 0F;
		
		double num7 = 0;
		Double num8 = 0D;
		
		
		String strNum2 = num2.toString();
		
		
	}
}
