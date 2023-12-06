package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersB {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를");
		for (int main = 0; main < num; main++) {
			for (int sub = 0; sub <= main ; sub++)	{
				System.out.print("* ");
			}

			System.out.println("");
		}

	}
}
