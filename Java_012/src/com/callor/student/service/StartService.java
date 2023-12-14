package com.callor.student.service;
/*
 * JDK 1.8 이하 에서는
 * interface 에는 추상 메서드( abstract method)만 있다
 * 최신버전의 interface에는 일반 메서드도 있을 수 있다
 * 
 */
public interface StartService {
	
	// 추상메서드 : 코드블럭 ({}) 이 없는 method
	public void mainMenu(String version);
	
	public Integer selectMenu();
	
	public void startApp();

	void mainMenu();
	
	

}
