package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class ScanGugu {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int dan = numService.inputNum("원하는 구구단 단수를");
		Line.dLine(50);		
		System.out.printf("\t%d단 구구단\n",dan);
		Line.dLine(50);		
		for(int i = 0 ; i < 9 ; i++) {
			System.out.printf("%d x %d = %d\n",dan,i + 1,dan * i );
		}

	}
}
