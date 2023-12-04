package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringC {
	public static void main(String[] args) {

		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;

		/*
		 * ... data.txt 파일을 읽어서 무언가 처리를 하려고 한다 Java 에서 파일을 읽어서 무언가 처리를 하려면 먼저 파일을 open
		 * 해야한다 이 때 파일을 open하는 도구 중에 FileInputStream 이라는 도구를 사용할것이다
		 * 
		 * 그런데, 파일을 open하는 과정에서 파일이 없을 수 있다 때문에 Java에서는 파일을 Open하는 명령(도구)를 사용하는 코드에서는
		 * 반드시 try...catch를 사용하여 exception 예방을 강제 하고있다
		 */
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] result = line.split(",");
			for (int i = 1; i < result.length; i++) {
				System.out.printf("%s	", result[i]);
			}
			int sum = 0;
			for (int i = 1; i < result.length; i++) {
				sum += Integer.valueOf(result[i]);
			}
			System.out.println("총점 : " + sum);
		}

		scan.close();

	}
}
