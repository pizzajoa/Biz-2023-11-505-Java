package com.callor.hello.var;

public class VarD {
	public static void main(String[] args) {

		/*
		 * 정수형 데이터를 보관하기 위한 정수형 변수 선언
		 * 기본적인 변수를 선언하는 명령어는 첫글자가 모두 소문자이다
		 * 첫글자가 소문자인 명령어로 선언된 변수를 "기본형(primitive"라고 한다
		 */
		int num1 = 0;
		
		/*
		 * 문자열 데이터를 보관하기 위한 문자열 변수 선언
		 * 다른 변수와 달리 String 키워드를 사용하는데 
		 * String 키워드는 첫문자가 대문자이다
		 * 첫글자가 대문자인 명령어로 선언된 변수를
		 * "확장형(type형, 참조형)" 이라고 한다.
		 * 
		 * 문자열형(String type) 변수는 java가 탄생될 당시에는 없던 변수이다
		 * 나중에 필요에 따라 추가된 변수이다
		 */
		
		String nation = "대한민국";
		System.out.println(nation);
		
		// 변수이름은 가급적 2개 이상의 단어를 조합하는 것이 좋다
		String stdName = "홍길동";
		String stdDept = "컴퓨터공학";
		
		/*
		 * 변수의 형(type)과 보관(저장, 할당)하는 데이터의 관계
		 * 보관하고자 하는 데이터의 type를 확인하고 정확히 일치하는 type으로 선언된 변수에 값을 보관해야 한다
		 * 문자열형 변수에는 문자열만 보관이 된다
		 * 숫자를 문자열형 변수에 보관하려면 ""로 묶어주어야 한다
		 */
		/*
		 * 학년을 변수에 저장하고 싶은데
		 * 문자열형과 숫자형으로 동시에 만들고 싶다
		 * 이럴때는 변수의 이름은 같게 만들고
		 * prefix로 변수의 type를 지정하는 방법이 있다 = 헝가리언 표기법
		 */
		String stdGrade = "3";
		int intStdGrade = 3;
		
		//int strNum = "202311001"; <-숫자형 변수 strNum에 문자열형 데이터는 보관이 안된다
				
		
		
	}
}
