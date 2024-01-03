package com.callor.iolist.exec;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import com.callor.iolist.model.IolistDto;
//import com.callor.iolist.model.IolistIndex;
//
public class ExecA {
//	public static void main(String[] args) {
//
//		String iolistFile = "매입매출데이터.txt";
//		InputStream is = null;
//		Scanner scan = null;
//		
//		try {
//			is = new FileInputStream(iolistFile);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		scan = new Scanner(is);
//		
//		while (scan.hasNext()) {
//			String line = scan.nextLine();
//			String[] iolist = line.split(",");
//			IolistDto dto = new IolistDto(
//					iolist[IolistIndex.거래일자.index],
//					iolist[IolistIndex.상품명.index],
//					iolist[IolistIndex.거래처명.index],
//					iolist[IolistIndex.대표자명.index],
//					iolist[IolistIndex.구분.index],
//					iolist[IolistIndex.매입단가.index],
//					iolist[IolistIndex.판매단가.index],
//					iolist[IolistIndex.수량.index]);
//							iolistList.add(dto);
//				
//	}
//}
}
