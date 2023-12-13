package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.utils.Line;

public class StartServiceImplV1A implements StartService {
	
	
	@Override
	public void mainMenu() {
		Line.dLine(100);
		System.out.println("한울고교 학사관리");
		Line.dLine(100);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(100);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 종료");
		Line.sLine(50);
		
		
		
		
	}

	@Override
	public Integer selectMenu() {
		private String[] menuItems = null;
		Scanner scan = new Scanner(System.in);
		String strMenuId = scan.nextLine();
		while(true) {
			this.mainMenu();
			System.out.println("업무선택 >> ");
			if(strMenuId.equals("QUIT")) return -1;
			int intMenuId  = 0;
			try {
				intMenuId = Integer.valueOf(strMenuId);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			if(intMenuId < 1 || intMenuId > menuItems.length) {
				System.out.printf("업무 선택은 1~%d까지 입니다\n",menuItems.length);
				continue;
			}
			// 여기에 코드가 다다르면 정상적으로 업무를 선택했다는 것
			return intMenuId;
			
			
		}
		return null;
	}

	@Override
	public void startApp() {
	
		
	}

}
