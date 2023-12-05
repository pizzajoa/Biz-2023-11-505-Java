package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringCB {
	public static void main(String[] args) {

		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null; //선언만 할 때는 null

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(dataFile + "자료를 찾을 수 없습니다");
		}

		scan = new Scanner(is);
		int scoreTotal = 0;
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] result = line.split(",");
			for (int index = 1; index < result.length; index++) {
				scoreTotal += Integer.valueOf(result[index]);
				System.out.printf("%s 번 총점 :  %d\n", scoreTotal);
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
