package com.callor.hello.algorithm;

public class LoopF {
	public static void main(String[] args) {
		for (int index = 0 ; index < 100 ; index++) { 
			/* for()반복문 내 {}에서 i값은 0~99까지 변하고 있다.
			 * 이 i값에 1을 덧셈하여 출력하면
			 * 1 ~100까지 값을 출력할 수 있다
			*/
			System.out.print((index+1 + " "));
			/*
			 * 출력하는 도중 만약 i+1이 10의 배수이면 10개를 출력했다는 것이다
			 * 그 상황이 되면 Enter를 표시하여 줄바꿈을 한다
			 */
			if ((index+1) % 10 == 0) {
				System.out.println();
			}
			
		}
		
	}
}
