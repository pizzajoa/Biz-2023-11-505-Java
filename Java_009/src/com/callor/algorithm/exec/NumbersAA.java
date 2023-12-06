package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersAA {
	public static void main(String[] args) {

		while (true) {
			int num = 0;
			Line.dLine(100);

			int index = 0;
			while (index < 10) {
				System.out.printf("%d\t", index + 1);
				index++;

			}

			System.out.println("");
			Line.dLine(100);
			index = 0;
			while (true) {
				System.out.printf("%d\t", index + 1);
				if (index > 100) {
					break;
				}
			}
			System.out.println("");
			Line.dLine(100);
			index = 0;
			while (index < 10) {
				System.out.printf("%d\t", index++ + 1);
			}

		}
	}
}
