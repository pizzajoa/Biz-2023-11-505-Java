package com.callor.hello.algorithm;

public class AlgF {
	
	public static void main(String[] args)
	{
	
		int pay = 3587960;
		int pay50000 = pay / 50000;
		int pay10000 = (pay % 50000) / 10000;
		int pay5000 = ((pay % 50000) % 10000) / 5000;
		int pay1000 = (((pay % 50000) % 10000) % 5000) / 1000;
		int pay500 = ((((pay % 50000) % 10000) % 5000) % 1000) / 500;
		int pay100 = (((((pay % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		int pay50 = ((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		int pay10 = (((((((pay % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		
		System.out.println("=============================");
		System.out.println(" 5만원권 : " + pay50000 );
		System.out.println(" 1만원권 : " + pay10000 );
		System.out.println(" 5천원권 : " + pay5000 );
		System.out.println(" 1천원권 : " + pay1000 );
		System.out.println(" 5백원권 : " + pay500 );
		System.out.println(" 1백원권 : " + pay100 );
		System.out.println(" 5십원권 : " + pay50 );
		System.out.println(" 1십원권 : " + pay10 );
		System.out.println("=============================");
	}
}

			/*
			 * 우리나라 화폐는 5만, 1만, 5천, 1천, 5백, 1백, 50, 10원 단위다
			 * 아래 pay에 저장된 값에서
			 * 각각 화폐단위만큼 몇개씩이 포함되는지
			 * 출력하시오
			 * 3587960
			 */
