package com.callor.hello.algorithm;

public class LoopC {
	public static void main(String[] args) {
		int count = 0;
 {
			 // 10개의 별을 출력한 후 줄바꿈을 해 주면 되겟다
			count++; // 카운트가 10을 넘어가면 Enter와 함께 count를 다시 초기화
			if (count >= 10) {
				count = 0;
			}

		}
		System.out.println("====================");
		for (int index = 0; index < 100; index++) {
			System.out.print("* ");
			if ((index + 1) % 10 == 0)
				System.out.println();

		}

	}
}
