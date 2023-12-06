package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersC {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를");
		for (int main = 0; main < num; main++) {
			// main 0 : sub = 0 ; sub < 7 : 7-0
			for (int sub = 0; sub < num - main; sub++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int main = 0 ; main < num ; main++) {
			for(int sub = num ; sub > main ; sub--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
