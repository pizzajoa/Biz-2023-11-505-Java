package com.callor.iolist.exec;

import com.callor.iolist.scrvice.IolistServiceA;

public class ExecA2 {
	public static void main(String[] args) {
		IolistServiceA iolistService = new IolistServiceA();
		iolistService.loadScores();
		iolistService.printScores();

	}
}