package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;

public class StartServiceImplV1 implements StartService {
	
	protected Scanner scan = null;
	public StartServiceImplV1() {
		scan = new Scanner(System.in);
	}
	@Override
	public void mainMenu() {
		
	}

	@Override
	public Integer selectMenu() {
		return null;
	}
		

	@Override
	public void startApp() {
	
		
	}

}
