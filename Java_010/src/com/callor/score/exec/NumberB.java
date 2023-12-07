package com.callor.score.exec;

public class NumberB {
	/*
	 * Java는 완벽한 객체지향 언어이다
	 * Java 에서는 같은 클래스 내에서 method(함수)의 이름을 중복하여 정의(선언)할 수 있다
	 * 
	 * 단. method의 매개변수(arguments)의 
	 * 1. 개수가 다르거나
	 * 2. type 이 달라야 한다
	 * method를 호출하는 곳에서 method에 정의된 매개변수의 type, 개수와 일치하는 데이터를 전달하면
	 * 자동으로 method와 호출하는 코드가 연결된다
	 * 
	 * 이것을 객체지행에서 "다형성"이라고 한다
	 */
	
	public static void add(int num1, int num2) {
		System.out.println("두 정수의 합 : " + (num1 + num2));
	}
	public static void add(float num1, float num2) {
		System.out.println("두 실수의 합 : " + (num1 + num2));
	}
	public static void add() {
		System.out.println("나는 전달받은 값이 없어요");
	}
	public static void add(String str, int num) {
		
	}
	
	/*
	 * 아래의 코드는 코드의 실체가 없다( {}안에 코드가 없다)
	 * 코드는 아직 만들지 않았지만, method는 선언(정의) 된 상태
	 * 이러한 method를 method 원형(기본형, prototype)이라고 한다
	 */
	public static void add(int num, String str) {
		
	}
	/*
	 * 아래 method 원형이 갖춰진 상태
	 * return type이 calss type일때는 return null이라도 있어야 한다
	 */
	public static String add(String str1, String str2) { 
		return null;
	}
		/* return type이 클래스가 아닌 경우 (primitive 기본 type)일 경우는 
		 * null을 리턴 할 수 없다 이 때는 적절한 값을 리턴해준다
		 * 숫자형일 때는 보통 0을 리턴한다 
		 */
	public static int add(int num) {
		return 0;
	
	}
	// 리턴타입이 boolean일 경우는 트루 펄스중에 리턴해야하고 보통 펄스를 리턴함
	public static boolean add(boolean bYes) {
		return false;
	}
	
	/*
	 * main() method에서 객체(Object)를 통해서 호출하는 method는 
	 * static이 부착되지 않아야 한다
	 * main() method에서 직접 호출하거나, method는 static이 반드시 부착되어 있어야 한다 
	 * Class를 통해서 호출하는 method는 static이 부착되어야 한다 예) Line.dLine(50);
	 */
	
	public static void main(String[] args) {
		add(30,40);
		add(30.0f, 40.0f);
		add();
		/*
		 * add(double num1, double num2)
		 * add(String str1, String str2)
		 * 와 같은 형태로 정의된(선언된) method가 없어서
		 * 아래의 코드는 오류가 발생한다
		 */
	//	add(30.0, 40.0);
	//	add("대한민국","우리나라");

	}
}
