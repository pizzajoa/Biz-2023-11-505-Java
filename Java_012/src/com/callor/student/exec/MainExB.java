package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StartServiceImplV3;
import com.callor.student.service.impl.StudentServiceImplV2;

public class MainExB {
	public static void main(String[] args) {
		/*
		 * 인터페이스를 활용한 클래스간 결합도 낮추기
		 * 클래스의 객체가 실행될 때 다른 클래스를 연결하여 사용해야 하는경우
		 * 보통은 각 클래스에서다른 클래스의 객체를 생성하여 사용하는데 그러한 코드는 결합도가 매우 높아진다
		 * 그러나 인터페이스를 매개변수로 하고, 생성자를 통하여 생성된 객체를 주입하면 결합도를 매우 낮출 수 있다
		 * 
		 * 소프트웨어 공학 디자인패턴 4가지가 있는데
		 * 그중 전략패턴을 적용한 것
		 */
		String stdDataFile = "src/com/callor/student/data/student.txt";
		StudentService stService = new StudentServiceImplV2();
		StartService startService = new StartServiceImplV3(stService); // 괄호안에 왜 stService를 넣나
		startService.startApp();
		

	}
}
