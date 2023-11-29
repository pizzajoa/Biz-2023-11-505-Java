package com.callor.var;

import com.callor.service.NumberService;

public class VarA {
	public static void main(String[] args) {
		// NumberService의 add() method에게 두개의 정수를 전달하고 
		// 결과를 return 받아서 colsole에 출력하고 싶다
		
		/*
		 * NumberService 클래스에 있는 add() method를 사용하려고 하는데
		 * add() method는 static 이 없다
		 * 그래서 이 method는 NumberService.add 처럼 사용할 수 없다
		 * int result = NumberService.add(30,40)
		 * NumberService.add 를 사용하려면 먼저 준비를 해야한다
		 */
		/*
		 * NumberService 클래스(설계도)를 가지고 
		 * numberService객체(object, 집)를
		 * 새로 new 만들어줘(NumberService())
		 */
		NumberService numberService1 = new NumberService();
		NumberService numberService2 = new NumberService();
		
		int result = numberService1.add(30, 40);
		
		System.out.println(result);
		
	}
	
}
