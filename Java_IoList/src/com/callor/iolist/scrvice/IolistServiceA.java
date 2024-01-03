package com.callor.iolist.scrvice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.iolist.model.IolistDto;
import com.callor.iolist.util.Line;

public class IolistServiceA {
	private IolistDto[] scores = null;
	private Scanner scan = null;
	

	public IolistServiceA() {
		String dataFile = "매입매출데이터.txt";
		InputStream is = null;
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
	
	}
	public void loadScores() {
		int index = 0;
	
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			IolistDto iolistDto = new IolistDto();
			iolistDto.iolistNum = lines[0];

			iolistDto.date = Integer.valueOf(lines[1]);
			iolistDto.company = Integer.valueOf(lines[2]);
			iolistDto.name = Integer.valueOf(lines[3]);
			iolistDto.pur = Integer.valueOf(lines[4]);
			iolistDto.sale = Integer.valueOf(lines[5]);
			scores[index++] = iolistDto;

		}

	} 
	public void printScores() {
		int pur = 0;
		int sale =0;
		Line.dline(100);
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		Line.sline(100);
		for (int i = 0; i < scores.length; i++) {
			IolistDto iolistDto = scores[i];
			System.out.printf("%3d\t",iolistDto.date);
			System.out.printf("%3d\t",iolistDto.company);
			System.out.printf("%3d\t",iolistDto.name);
			System.out.printf("%3d\t",iolistDto.pur);
			System.out.printf("%3d\t\n",iolistDto.sale);
			
			
			if(iolistDto.div == 1) {
				iolistDto.pur = (iolistDto.pur * iolistDto.num);
			}
			if(iolistDto.div == 2) {
				iolistDto.sale = (iolistDto.sale * iolistDto.num);
			}
			pur += iolistDto.pur;
			sale += iolistDto.sale;
			
			System.out.printf("거래건수\t %d건\3t %d\t %d", iolistDto.num,pur,sale  );
		}
		Line.dline(100);
	} 
}
