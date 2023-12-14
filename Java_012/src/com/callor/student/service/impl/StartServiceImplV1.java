package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;

public class StartServiceImplV1 implements StartService {
	
	protected Scanner scan = null;
	protected StudentService stService = null;
	
	/*
	 * StartService 에서는 StudentService 를 필요로 한다
	 * StartService 클래스의 기능을 추가하는 코드가 계속 만들어질경우
	 * 또한 StudentService 클래스의 기능을 추가하는 코드가 계속 만들어 질 경우
	 * StartServiceV1, StartServiceV2 등으로 파일 생성되고
	 * StudentServiceV1, StudentServiceV2 등으로 파일 생성되고
	 * 이 두 개의 파일이 서로 연동되어 코드가 진행된다
	 * 이 상황에서 어떤 StartService와 어떤 StudentService를 연결할 것인지 항상 고민해야 하고
	 * 필요에 따라 StartService 코드를 변경해야한다
	 * 
	 * 이러한 상황을  StartService와 StudentService 간에 결합도가 높다고 한다
	 * 그래서 StartServiuce의 생성자를 통하여 StudentService
	 * 
	 */
	public StartServiceImplV1(StudentService stService) {
		scan = new Scanner(System.in);
		this.stService = stService; //new StudentServiceImplV1();
	}
	public void mainMenu() {
	
	}

	@Override
	public Integer selectMenu() {
		return null;
	}
		

	@Override
	public void startApp() {
	
		
	}
	@Override
	public void mainMenu(String version) {
		// TODO Auto-generated method stub
		
	}

}
