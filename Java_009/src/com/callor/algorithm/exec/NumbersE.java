package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersE {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			Line.dLine(50);
			for (int j = 1; j < 10; j++) {
				if ((i * j) % 2 == 0) {

					System.out.printf("%d x %d = %d\n", i, j, i * j);
					System.out.println("");
				}

			}
		}
	}
}